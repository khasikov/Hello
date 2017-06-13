
package com.khasikov.app.objectdata;


import java.text.ParseException;

import static com.khasikov.app.App.setDateParsing;

public class Encumbrance {

    private Integer tempId;
    private String id;
    private String objectId;
    private Integer updatePackId;
    private Integer regionKey;
    private String code;
    private String codeDesc;
    private String periodStart;
    private String periodEnd;
    private Object periodDuration;
    private Object type;
    private String regNum;
    private String regDate;
    private String rsCode;
    private String packageId;
    private String actualDate;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Encumbrance() {
    }

    /**
     * 
     * @param periodStart
     * @param actualDate
     * @param regDate
     * @param packageId
     * @param updatePackId
     * @param code
     * @param periodDuration
     * @param type
     * @param id
     * @param codeDesc
     * @param regionKey
     * @param rsCode
     * @param regNum
     * @param objectId
     * @param periodEnd
     * @param tempId
     */
    public Encumbrance(Integer tempId, String id, String objectId, Integer updatePackId, Integer regionKey, String code, String codeDesc, String periodStart, String periodEnd, Object periodDuration, Object type, String regNum, String regDate, String rsCode, String packageId, String actualDate) {
        super();
        this.tempId = tempId;
        this.id = id;
        this.objectId = objectId;
        this.updatePackId = updatePackId;
        this.regionKey = regionKey;
        this.code = code;
        this.codeDesc = codeDesc;
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
        this.periodDuration = periodDuration;
        this.type = type;
        this.regNum = regNum;
        this.regDate = regDate;
        this.rsCode = rsCode;
        this.packageId = packageId;
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

    public Integer getRegionKey() {
        return regionKey;
    }

    public void setRegionKey(Integer regionKey) {
        this.regionKey = regionKey;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }

    public String getPeriodStart() {
        return periodStart;
    }

    public void setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
    }

    public String getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }

    public Object getPeriodDuration() {
        return periodDuration;
    }

    public void setPeriodDuration(Object periodDuration) {
        this.periodDuration = periodDuration;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
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

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getActualDate() {
        return actualDate;
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append("Вид ограничения(обременения): ")
                    .append(codeDesc)
                    .append("\n")
                    .append("Дата начала: ")
                    .append(setDateParsing(periodStart))
                    .append("\n")
                    .append("Дата окончания: ")
                    .append(setDateParsing(periodEnd))
                    .append("\n")
                    .append("Срок: ")
                    .append(periodDuration)
                    .append("\n")
                    .append("Номер регистрации: ")
                    .append(regNum)
                    .append("\n")
                    .append("Дата регистрации: ")
                    .append(setDateParsing(regDate))
                    .append("\n")

                    /*.append("-----------------------------------")*/;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return String.valueOf(stringBuilder);
    }

}
