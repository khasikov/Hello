
package com.khasikov.app.objectdata;


import org.apache.commons.lang.builder.ToStringBuilder;

public class ObjectAddress {

    private String id;
    private Integer regionKey;
    private String okato;
    private Object kladr;
    private String region;
    private String district;
    private String districtType;
    private Object place;
    private String placeType;
    private Object locality;
    private String localityType;
    private Object street;
    private String streetType;
    private Object house;
    private Object building;
    private Object structure;
    private Object apartment;
    private String addressNotes;
    private String mergedAddress;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ObjectAddress() {
    }

    /**
     * 
     * @param region
     * @param structure
     * @param building
     * @param kladr
     * @param street
     * @param apartment
     * @param localityType
     * @param mergedAddress
     * @param house
     * @param okato
     * @param addressNotes
     * @param districtType
     * @param id
     * @param regionKey
     * @param locality
     * @param district
     * @param place
     * @param streetType
     * @param placeType
     */
    public ObjectAddress(String id, Integer regionKey, String okato, Object kladr, String region, String district, String districtType, Object place, String placeType, Object locality, String localityType, Object street, String streetType, Object house, Object building, Object structure, Object apartment, String addressNotes, String mergedAddress) {
        super();
        this.id = id;
        this.regionKey = regionKey;
        this.okato = okato;
        this.kladr = kladr;
        this.region = region;
        this.district = district;
        this.districtType = districtType;
        this.place = place;
        this.placeType = placeType;
        this.locality = locality;
        this.localityType = localityType;
        this.street = street;
        this.streetType = streetType;
        this.house = house;
        this.building = building;
        this.structure = structure;
        this.apartment = apartment;
        this.addressNotes = addressNotes;
        this.mergedAddress = mergedAddress;
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

    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }

    public Object getKladr() {
        return kladr;
    }

    public void setKladr(Object kladr) {
        this.kladr = kladr;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrictType() {
        return districtType;
    }

    public void setDistrictType(String districtType) {
        this.districtType = districtType;
    }

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public Object getLocality() {
        return locality;
    }

    public void setLocality(Object locality) {
        this.locality = locality;
    }

    public String getLocalityType() {
        return localityType;
    }

    public void setLocalityType(String localityType) {
        this.localityType = localityType;
    }

    public Object getStreet() {
        return street;
    }

    public void setStreet(Object street) {
        this.street = street;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public Object getHouse() {
        return house;
    }

    public void setHouse(Object house) {
        this.house = house;
    }

    public Object getBuilding() {
        return building;
    }

    public void setBuilding(Object building) {
        this.building = building;
    }

    public Object getStructure() {
        return structure;
    }

    public void setStructure(Object structure) {
        this.structure = structure;
    }

    public Object getApartment() {
        return apartment;
    }

    public void setApartment(Object apartment) {
        this.apartment = apartment;
    }

    public String getAddressNotes() {
        return addressNotes;
    }

    public void setAddressNotes(String addressNotes) {
        this.addressNotes = addressNotes;
    }

    public String getMergedAddress() {
        return mergedAddress;
    }

    public void setMergedAddress(String mergedAddress) {
        this.mergedAddress = mergedAddress;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
