
package com.khasikov.app.objectdata;


import org.apache.commons.lang.builder.ToStringBuilder;

public class ObjectData {

    private String id;
    private Integer regionKey;
    private Integer srcObject;
    private Object objectType;
    private Object objectName;
    private Integer removed;
    private String dateLoad;
    private String addressNote;
    private String objectCn;
    private Object objectCon;
    private Object objectInv;
    private String objectUn;
    private String rsCode;
    private String actualDate;
    private Integer brkStatus;
    private Object brkDate;
    private Object formRights;
    private ObjectAddress objectAddress;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ObjectData() {
    }

    /**
     * 
     * @param formRights
     * @param objectAddress
     * @param actualDate
     * @param objectName
     * @param objectInv
     * @param brkStatus
     * @param objectCn
     * @param addressNote
     * @param id
     * @param regionKey
     * @param dateLoad
     * @param rsCode
     * @param srcObject
     * @param removed
     * @param objectUn
     * @param brkDate
     * @param objectType
     * @param objectCon
     */
    public ObjectData(String id, Integer regionKey, Integer srcObject, Object objectType, Object objectName, Integer removed, String dateLoad, String addressNote, String objectCn, Object objectCon, Object objectInv, String objectUn, String rsCode, String actualDate, Integer brkStatus, Object brkDate, Object formRights, ObjectAddress objectAddress) {
        super();
        this.id = id;
        this.regionKey = regionKey;
        this.srcObject = srcObject;
        this.objectType = objectType;
        this.objectName = objectName;
        this.removed = removed;
        this.dateLoad = dateLoad;
        this.addressNote = addressNote;
        this.objectCn = objectCn;
        this.objectCon = objectCon;
        this.objectInv = objectInv;
        this.objectUn = objectUn;
        this.rsCode = rsCode;
        this.actualDate = actualDate;
        this.brkStatus = brkStatus;
        this.brkDate = brkDate;
        this.formRights = formRights;
        this.objectAddress = objectAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRegionKey() {
        return regionKey;
    }

    public void setRegionKey(Integer regionKey) {
        this.regionKey = regionKey;
    }

    public Integer getSrcObject() {
        return srcObject;
    }

    public void setSrcObject(Integer srcObject) {
        this.srcObject = srcObject;
    }

    public Object getObjectType() {
        return objectType;
    }

    public void setObjectType(Object objectType) {
        this.objectType = objectType;
    }

    public Object getObjectName() {
        return objectName;
    }

    public void setObjectName(Object objectName) {
        this.objectName = objectName;
    }

    public Integer getRemoved() {
        return removed;
    }

    public void setRemoved(Integer removed) {
        this.removed = removed;
    }

    public String getDateLoad() {
        return dateLoad;
    }

    public void setDateLoad(String dateLoad) {
        this.dateLoad = dateLoad;
    }

    public String getAddressNote() {
        return addressNote;
    }

    public void setAddressNote(String addressNote) {
        this.addressNote = addressNote;
    }

    public String getObjectCn() {
        return objectCn;
    }

    public void setObjectCn(String objectCn) {
        this.objectCn = objectCn;
    }

    public Object getObjectCon() {
        return objectCon;
    }

    public void setObjectCon(Object objectCon) {
        this.objectCon = objectCon;
    }

    public Object getObjectInv() {
        return objectInv;
    }

    public void setObjectInv(Object objectInv) {
        this.objectInv = objectInv;
    }

    public String getObjectUn() {
        return objectUn;
    }

    public void setObjectUn(String objectUn) {
        this.objectUn = objectUn;
    }

    public String getRsCode() {
        return rsCode;
    }

    public void setRsCode(String rsCode) {
        this.rsCode = rsCode;
    }

    public String getActualDate() {
        return actualDate;
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public Integer getBrkStatus() {
        return brkStatus;
    }

    public void setBrkStatus(Integer brkStatus) {
        this.brkStatus = brkStatus;
    }

    public Object getBrkDate() {
        return brkDate;
    }

    public void setBrkDate(Object brkDate) {
        this.brkDate = brkDate;
    }

    public Object getFormRights() {
        return formRights;
    }

    public void setFormRights(Object formRights) {
        this.formRights = formRights;
    }

    public ObjectAddress getObjectAddress() {
        return objectAddress;
    }

    public void setObjectAddress(ObjectAddress objectAddress) {
        this.objectAddress = objectAddress;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
