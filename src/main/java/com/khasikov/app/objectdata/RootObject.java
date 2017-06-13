
package com.khasikov.app.objectdata;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

public class RootObject {

    private String objectId;
    private String type;
    private Integer regionKey;
    private Integer source;
    private String firActualDate;
    private ObjectData objectData;
    private ParcelData parcelData;
    private Object realtyData;
    private Object premisesData;
    private List<RightEncumbranceObject> rightEncumbranceObjects = null;
    private Object oldNumbers;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RootObject() {
    }

    /**
     * 
     * @param regionKey
     * @param realtyData
     * @param objectData
     * @param source
     * @param premisesData
     * @param objectId
     * @param rightEncumbranceObjects
     * @param oldNumbers
     * @param firActualDate
     * @param type
     * @param parcelData
     */
    public RootObject(String objectId, String type, Integer regionKey, Integer source, String firActualDate, ObjectData objectData, ParcelData parcelData, Object realtyData, Object premisesData, List<RightEncumbranceObject> rightEncumbranceObjects, Object oldNumbers) {
        super();
        this.objectId = objectId;
        this.type = type;
        this.regionKey = regionKey;
        this.source = source;
        this.firActualDate = firActualDate;
        this.objectData = objectData;
        this.parcelData = parcelData;
        this.realtyData = realtyData;
        this.premisesData = premisesData;
        this.rightEncumbranceObjects = rightEncumbranceObjects;
        this.oldNumbers = oldNumbers;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRegionKey() {
        return regionKey;
    }

    public void setRegionKey(Integer regionKey) {
        this.regionKey = regionKey;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getFirActualDate() {
        return firActualDate;
    }

    public void setFirActualDate(String firActualDate) {
        this.firActualDate = firActualDate;
    }

    public ObjectData getObjectData() {
        return objectData;
    }

    public void setObjectData(ObjectData objectData) {
        this.objectData = objectData;
    }

    public ParcelData getParcelData() {
        return parcelData;
    }

    public void setParcelData(ParcelData parcelData) {
        this.parcelData = parcelData;
    }

    public Object getRealtyData() {
        return realtyData;
    }

    public void setRealtyData(Object realtyData) {
        this.realtyData = realtyData;
    }

    public Object getPremisesData() {
        return premisesData;
    }

    public void setPremisesData(Object premisesData) {
        this.premisesData = premisesData;
    }

    public List<RightEncumbranceObject> getRightEncumbranceObjects() {
        return rightEncumbranceObjects;
    }

    public void setRightEncumbranceObjects(List<RightEncumbranceObject> rightEncumbranceObjects) {
        this.rightEncumbranceObjects = rightEncumbranceObjects;
    }

    public Object getOldNumbers() {
        return oldNumbers;
    }

    public void setOldNumbers(Object oldNumbers) {
        this.oldNumbers = oldNumbers;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
