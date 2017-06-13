package com.khasikov.app;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.khasikov.app.objectdata.Encumbrance;
import com.khasikov.app.objectdata.ObjectToId;
import com.khasikov.app.objectdata.RightEncumbranceObject;
import com.khasikov.app.objectdata.RootObject;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by rmh on 23.05.2017.
 */
public class App {
    public static void main(String[] args) throws IOException, ParseException {
        String firstRequest = "http://rosreestr.ru/api/online/fir_objects/";
        String secondRequest = "http://rosreestr.ru/api/online/fir_object/";
        String cadNumber = "";
        String trimCadNumber = "";
        StringBuilder jsonContest = null;

        System.out.println("Введите кадастровый номер объекта. Например, 61:26:0600023:5");

        firstRequest = getRequestToPortal(firstRequest, trimCadNumber);
        jsonContest = connToPortal(firstRequest, jsonContest);


        // Парсим полученный массив JSON и выделяем objectId в формате 161_780000042933
        List<String> listObjectId = new ArrayList<String>();
        JSONArray jsonArray = JSON.parseArray(String.valueOf(jsonContest));
        for (Object aJsonArray : jsonArray) {
            ObjectToId objectToId = JSON.parseObject(aJsonArray.toString(), ObjectToId.class);
            // System.out.println(objectToId.getObjectId());
            listObjectId.add(objectToId.getObjectId());
        }

        for (String aListObjectId : listObjectId) {
            if (aListObjectId.contains("_")) {
               // System.out.println(aListObjectId);
                cadNumber = aListObjectId;
                break;
            }
        }


        // Формирование запроса на портал по objectId
        secondRequest += cadNumber;

        // Получаем JSON c портала
        jsonContest = connToPortal(secondRequest, jsonContest);

        System.out.println(String.valueOf(jsonContest));

        // парсим итоговый JSON
        Gson gson = new Gson();
        RootObject rootObject = gson.fromJson(String.valueOf(jsonContest), RootObject.class);

        List<RightEncumbranceObject> rightEncumbranceObjectList  = rootObject.getRightEncumbranceObjects();

        for (RightEncumbranceObject aRightEncumbrance : rightEncumbranceObjectList) {
            if (aRightEncumbrance.getRightData() != null)
                System.out.println(aRightEncumbrance.getRightData().toString());
            if (aRightEncumbrance.getEncumbrances() != null) {
                List<Encumbrance> encumbranceList = aRightEncumbrance.getEncumbrances();

                for (Encumbrance anEncumbranceList : encumbranceList) {
                    System.out.println(anEncumbranceList.toString());
                }

            }
        }

    }

    private static StringBuilder connToPortal(String Request, StringBuilder jsonContest) {
        // Коннектимся с порталу Росреестра
        HttpURLConnection connection = null;
        try {

            connection = (HttpURLConnection) new URL(Request).openConnection();
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);
            connection.setConnectTimeout(2000);
            connection.setReadTimeout(2000);
            connection.connect();

            //получаем массив JSON
            jsonContest = new StringBuilder();

            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                String line;

                while ((line = in.readLine()) != null) {
                    jsonContest.append(line);
                    jsonContest.append("\n");

                   // System.out.println(jsonContest.toString());
                }
            } else
                System.out.println("fail: " + connection.getResponseCode() + ", " + connection.getResponseMessage());

            } catch (Throwable cause) {
                    cause.printStackTrace();
            } finally {
                if (connection != null) {
                    connection.disconnect();
            }
        }
        return jsonContest;
    }

    // Формирование запроса на портал по кадастровому номеру
    private static String getRequestToPortal(String firstRequest, String trimCadNumber) throws IOException {
        String cadNumber;BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        cadNumber = bufferedReader.readLine();
        bufferedReader.close();

        // Проверяем формат кадастрового номера  "\d{2}:\d{2}:\d{6,7}:\d{1,}"
        if (!cadNumber.matches("(\\d{2}:\\d{2}:\\d{6,7}:\\d+)")) {
            System.out.println("Неверный формат кадасрового номера! ");
            System.exit(1);
        } else {
//
            // Преобразуем кадастровый номер в массив номеров
            String arrayCadNumber[] = cadNumber.split(":");

            //Сбрасываем значение кадастрового номера
            cadNumber = "";

            // Убираем лидирующие нули в каждом элементе массива номеров преобразованием к Integer и обратно к String
            Integer intCadNumb=null;
            for (int i = 0; i<arrayCadNumber.length; i++) {
                intCadNumb=Integer.parseInt(arrayCadNumber[i]);
                if (i < arrayCadNumber.length - 1) {
                    trimCadNumber += String.valueOf(intCadNumb) + ":";
                }else {
                    trimCadNumber += String.valueOf(intCadNumb);
                }
            }

            // Собираем кадастровый номер без лидирующих нулей
            cadNumber += trimCadNumber;

            //System.out.println("Преобраазованный КН: " + cadNumber);

            // Собираем полный запрос на портал Росреестра
            firstRequest += cadNumber;
        }
        return firstRequest;
    }
    // Установка формата даты dd.mm.yyyy
    public static String setDateParsing(String date) throws ParseException {
        if (null != date) {
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-mm-dd");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd.mm.yyyy");
        Date date1 = formatter1.parse(date);
        String date2 = formatter2.format(date1);

        return date2;
        }
        else return "";
    }
}

