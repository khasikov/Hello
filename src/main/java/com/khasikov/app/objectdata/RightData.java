package com.khasikov.app.objectdata;

import java.text.ParseException;

import static com.khasikov.app.App.setDateParsing;

/**
 * Created by rmh on 29.05.2017.
 */
public class RightData {

    private String codeDesc;
    private String code;
    private Integer regionKey;
    private String partSize;
    private String packageId;
    private String regDate;
    private String rsCode;
    private String regNum;
    private String actualDate;
    private Integer tempId;
    private String id;
    private String objectId;
    private Integer updatePackId;

    /**
     * No args constructor for use in serialization
     *
     */
    public RightData() {
    }

    /**
     *
     * @param actualDate
     * @param regDate
     * @param updatePackId
     * @param packageId
     * @param code
     * @param codeDesc
     * @param id
     * @param regionKey
     * @param partSize
     * @param rsCode
     * @param regNum
     * @param objectId
     * @param tempId
     */
    public RightData(String codeDesc, String code, Integer regionKey, String partSize, String packageId, String regDate, String rsCode, String regNum, String actualDate, Integer tempId, String id, String objectId, Integer updatePackId) {
        super();
        this.codeDesc = codeDesc;
        this.code = code;
        this.regionKey = regionKey;
        this.partSize = partSize;
        this.packageId = packageId;
        this.regDate = regDate;
        this.rsCode = rsCode;
        this.regNum = regNum;
        this.actualDate = actualDate;
        this.tempId = tempId;
        this.id = id;
        this.objectId = objectId;
        this.updatePackId = updatePackId;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getRegionKey() {
        return regionKey;
    }

    public void setRegionKey(Integer regionKey) {
        this.regionKey = regionKey;
    }

    public String getPartSize() {
        return partSize;
    }

    public void setPartSize(String partSize) {
        this.partSize = partSize;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getRsCode() {
        return rsCode;
    }

    public void setRsCode(String rsCode) {
        this.rsCode = rsCode;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getActualDate() {
        return actualDate;
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public Integer getTempId() {
        return tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public Integer getUpdatePackId() {
        return updatePackId;
    }

    public void setUpdatePackId(Integer updatePackId) {
        this.updatePackId = updatePackId;
    }

    @Override
    public String toString() {


        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append("Вид права: ")
                         .append(codeDesc)
                    .append("\n")
                    .append("Размер доли: ")
                    .append(partSize)
                    .append("\n")
                    .append("Номер регистрации: ")
                    .append(regNum)
                    .append("\n")
                    .append("Дата регистрации: ")
                    .append(setDateParsing(regDate))
                    .append("\n");
        } catch (ParseException e) {
            e.printStackTrace();
        }


        return  String.valueOf(stringBuilder);
    }



}