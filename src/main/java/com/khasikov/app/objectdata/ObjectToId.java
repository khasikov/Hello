package com.khasikov.app.objectdata;


import java.io.Serializable;

public class ObjectToId implements Serializable
{

    private String objectId;
    private Integer srcObject;
    private Integer regionKey;
    private String objectType;
    private String objectCn;
    private String objectCon;
    private String subjectId;
    private String regionId;
    private String settlementId;
    private String street;
    private String house;
    private String addressNotes;
    private String okato;
    private String apartment;
    private String nobjectCn;
    private String nobjectCon;
    private final static long serialVersionUID = 722603421976383220L;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public Integer getSrcObject() {
        return srcObject;
    }

    public void setSrcObject(Integer srcObject) {
        this.srcObject = srcObject;
    }

    public Integer getRegionKey() {
        return regionKey;
    }

    public void setRegionKey(Integer regionKey) {
        this.regionKey = regionKey;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectCn() {
        return objectCn;
    }

    public void setObjectCn(String objectCn) {
        this.objectCn = objectCn;
    }

    public String getObjectCon() {
        return objectCon;
    }

    public void setObjectCon(String objectCon) {
        this.objectCon = objectCon;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getAddressNotes() {
        return addressNotes;
    }

    public void setAddressNotes(String addressNotes) {
        this.addressNotes = addressNotes;
    }

    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getNobjectCn() {
        return nobjectCn;
    }

    public void setNobjectCn(String nobjectCn) {
        this.nobjectCn = nobjectCn;
    }

    public String getNobjectCon() {
        return nobjectCon;
    }

    public void setNobjectCon(String nobjectCon) {
        this.nobjectCon = nobjectCon;
    }

}