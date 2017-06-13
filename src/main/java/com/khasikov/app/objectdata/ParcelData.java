
package com.khasikov.app.objectdata;


import org.apache.commons.lang.builder.ToStringBuilder;

public class ParcelData {

    private String id;
    private Integer regionKey;
    private String parcelCn;
    private Object parcelStatus;
    private Object dateCreate;
    private Object dateRemove;
    private String categoryType;
    private Float areaValue;
    private String areaType;
    private String areaUnit;
    private Object areaTypeValue;
    private Object areaUnitValue;
    private String categoryTypeValue;
    private Boolean rightsReg;
    private Float cadCost;
    private Object cadUnit;
    private Object dateCost;
    private Integer oksFlag;
    private Object oksType;
    private Object oksFloors;
    private Object oksUFloors;
    private Object oksElementsConstruct;
    private Object oksYearUsed;
    private Float oksInventoryCost;
    private Object oksInn;
    private Object oksExecutor;
    private Object oksYearBuilt;
    private Object oksCostDate;
    private Object rcType;
    private Object rcDate;
    private Object guidUl;
    private Object guidFl;
    private Object ciSurname;
    private Object ciFirst;
    private Object ciPatronymic;
    private Object ciNCertificate;
    private Object ciPhone;
    private Object ciEmail;
    private Object ciAddress;
    private Object coName;
    private Object coInn;
    private Object utilCode;
    private Object utilByDoc;
    private Object cadastralBlockId;
    private Object parcelStatusStr;
    private Object oksElementsConstructStr;
    private Object utilCodeDesc;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ParcelData() {
    }

    /**
     * 
     * @param ciFirst
     * @param guidFl
     * @param dateRemove
     * @param parcelStatus
     * @param utilCodeDesc
     * @param guidUl
     * @param areaUnitValue
     * @param dateCreate
     * @param cadCost
     * @param ciEmail
     * @param oksYearUsed
     * @param parcelStatusStr
     * @param coInn
     * @param ciPhone
     * @param oksYearBuilt
     * @param id
     * @param parcelCn
     * @param oksCostDate
     * @param oksType
     * @param areaType
     * @param ciPatronymic
     * @param oksInn
     * @param oksFloors
     * @param coName
     * @param rightsReg
     * @param areaValue
     * @param oksInventoryCost
     * @param utilByDoc
     * @param areaTypeValue
     * @param utilCode
     * @param ciNCertificate
     * @param oksExecutor
     * @param areaUnit
     * @param categoryType
     * @param cadUnit
     * @param ciSurname
     * @param oksElementsConstructStr
     * @param categoryTypeValue
     * @param dateCost
     * @param regionKey
     * @param oksUFloors
     * @param ciAddress
     * @param cadastralBlockId
     * @param rcType
     * @param oksFlag
     * @param oksElementsConstruct
     * @param rcDate
     */
    public ParcelData(String id, Integer regionKey, String parcelCn, Object parcelStatus, Object dateCreate, Object dateRemove, String categoryType, Float areaValue, String areaType, String areaUnit, Object areaTypeValue, Object areaUnitValue, String categoryTypeValue, Boolean rightsReg, Float cadCost, Object cadUnit, Object dateCost, Integer oksFlag, Object oksType, Object oksFloors, Object oksUFloors, Object oksElementsConstruct, Object oksYearUsed, Float oksInventoryCost, Object oksInn, Object oksExecutor, Object oksYearBuilt, Object oksCostDate, Object rcType, Object rcDate, Object guidUl, Object guidFl, Object ciSurname, Object ciFirst, Object ciPatronymic, Object ciNCertificate, Object ciPhone, Object ciEmail, Object ciAddress, Object coName, Object coInn, Object utilCode, Object utilByDoc, Object cadastralBlockId, Object parcelStatusStr, Object oksElementsConstructStr, Object utilCodeDesc) {
        super();
        this.id = id;
        this.regionKey = regionKey;
        this.parcelCn = parcelCn;
        this.parcelStatus = parcelStatus;
        this.dateCreate = dateCreate;
        this.dateRemove = dateRemove;
        this.categoryType = categoryType;
        this.areaValue = areaValue;
        this.areaType = areaType;
        this.areaUnit = areaUnit;
        this.areaTypeValue = areaTypeValue;
        this.areaUnitValue = areaUnitValue;
        this.categoryTypeValue = categoryTypeValue;
        this.rightsReg = rightsReg;
        this.cadCost = cadCost;
        this.cadUnit = cadUnit;
        this.dateCost = dateCost;
        this.oksFlag = oksFlag;
        this.oksType = oksType;
        this.oksFloors = oksFloors;
        this.oksUFloors = oksUFloors;
        this.oksElementsConstruct = oksElementsConstruct;
        this.oksYearUsed = oksYearUsed;
        this.oksInventoryCost = oksInventoryCost;
        this.oksInn = oksInn;
        this.oksExecutor = oksExecutor;
        this.oksYearBuilt = oksYearBuilt;
        this.oksCostDate = oksCostDate;
        this.rcType = rcType;
        this.rcDate = rcDate;
        this.guidUl = guidUl;
        this.guidFl = guidFl;
        this.ciSurname = ciSurname;
        this.ciFirst = ciFirst;
        this.ciPatronymic = ciPatronymic;
        this.ciNCertificate = ciNCertificate;
        this.ciPhone = ciPhone;
        this.ciEmail = ciEmail;
        this.ciAddress = ciAddress;
        this.coName = coName;
        this.coInn = coInn;
        this.utilCode = utilCode;
        this.utilByDoc = utilByDoc;
        this.cadastralBlockId = cadastralBlockId;
        this.parcelStatusStr = parcelStatusStr;
        this.oksElementsConstructStr = oksElementsConstructStr;
        this.utilCodeDesc = utilCodeDesc;
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

    public String getParcelCn() {
        return parcelCn;
    }

    public void setParcelCn(String parcelCn) {
        this.parcelCn = parcelCn;
    }

    public Object getParcelStatus() {
        return parcelStatus;
    }

    public void setParcelStatus(Object parcelStatus) {
        this.parcelStatus = parcelStatus;
    }

    public Object getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Object dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Object getDateRemove() {
        return dateRemove;
    }

    public void setDateRemove(Object dateRemove) {
        this.dateRemove = dateRemove;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public Float getAreaValue() {
        return areaValue;
    }

    public void setAreaValue(Float areaValue) {
        this.areaValue = areaValue;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public String getAreaUnit() {
        return areaUnit;
    }

    public void setAreaUnit(String areaUnit) {
        this.areaUnit = areaUnit;
    }

    public Object getAreaTypeValue() {
        return areaTypeValue;
    }

    public void setAreaTypeValue(Object areaTypeValue) {
        this.areaTypeValue = areaTypeValue;
    }

    public Object getAreaUnitValue() {
        return areaUnitValue;
    }

    public void setAreaUnitValue(Object areaUnitValue) {
        this.areaUnitValue = areaUnitValue;
    }

    public String getCategoryTypeValue() {
        return categoryTypeValue;
    }

    public void setCategoryTypeValue(String categoryTypeValue) {
        this.categoryTypeValue = categoryTypeValue;
    }

    public Boolean getRightsReg() {
        return rightsReg;
    }

    public void setRightsReg(Boolean rightsReg) {
        this.rightsReg = rightsReg;
    }

    public Float getCadCost() {
        return cadCost;
    }

    public void setCadCost(Float cadCost) {
        this.cadCost = cadCost;
    }

    public Object getCadUnit() {
        return cadUnit;
    }

    public void setCadUnit(Object cadUnit) {
        this.cadUnit = cadUnit;
    }

    public Object getDateCost() {
        return dateCost;
    }

    public void setDateCost(Object dateCost) {
        this.dateCost = dateCost;
    }

    public Integer getOksFlag() {
        return oksFlag;
    }

    public void setOksFlag(Integer oksFlag) {
        this.oksFlag = oksFlag;
    }

    public Object getOksType() {
        return oksType;
    }

    public void setOksType(Object oksType) {
        this.oksType = oksType;
    }

    public Object getOksFloors() {
        return oksFloors;
    }

    public void setOksFloors(Object oksFloors) {
        this.oksFloors = oksFloors;
    }

    public Object getOksUFloors() {
        return oksUFloors;
    }

    public void setOksUFloors(Object oksUFloors) {
        this.oksUFloors = oksUFloors;
    }

    public Object getOksElementsConstruct() {
        return oksElementsConstruct;
    }

    public void setOksElementsConstruct(Object oksElementsConstruct) {
        this.oksElementsConstruct = oksElementsConstruct;
    }

    public Object getOksYearUsed() {
        return oksYearUsed;
    }

    public void setOksYearUsed(Object oksYearUsed) {
        this.oksYearUsed = oksYearUsed;
    }

    public Float getOksInventoryCost() {
        return oksInventoryCost;
    }

    public void setOksInventoryCost(Float oksInventoryCost) {
        this.oksInventoryCost = oksInventoryCost;
    }

    public Object getOksInn() {
        return oksInn;
    }

    public void setOksInn(Object oksInn) {
        this.oksInn = oksInn;
    }

    public Object getOksExecutor() {
        return oksExecutor;
    }

    public void setOksExecutor(Object oksExecutor) {
        this.oksExecutor = oksExecutor;
    }

    public Object getOksYearBuilt() {
        return oksYearBuilt;
    }

    public void setOksYearBuilt(Object oksYearBuilt) {
        this.oksYearBuilt = oksYearBuilt;
    }

    public Object getOksCostDate() {
        return oksCostDate;
    }

    public void setOksCostDate(Object oksCostDate) {
        this.oksCostDate = oksCostDate;
    }

    public Object getRcType() {
        return rcType;
    }

    public void setRcType(Object rcType) {
        this.rcType = rcType;
    }

    public Object getRcDate() {
        return rcDate;
    }

    public void setRcDate(Object rcDate) {
        this.rcDate = rcDate;
    }

    public Object getGuidUl() {
        return guidUl;
    }

    public void setGuidUl(Object guidUl) {
        this.guidUl = guidUl;
    }

    public Object getGuidFl() {
        return guidFl;
    }

    public void setGuidFl(Object guidFl) {
        this.guidFl = guidFl;
    }

    public Object getCiSurname() {
        return ciSurname;
    }

    public void setCiSurname(Object ciSurname) {
        this.ciSurname = ciSurname;
    }

    public Object getCiFirst() {
        return ciFirst;
    }

    public void setCiFirst(Object ciFirst) {
        this.ciFirst = ciFirst;
    }

    public Object getCiPatronymic() {
        return ciPatronymic;
    }

    public void setCiPatronymic(Object ciPatronymic) {
        this.ciPatronymic = ciPatronymic;
    }

    public Object getCiNCertificate() {
        return ciNCertificate;
    }

    public void setCiNCertificate(Object ciNCertificate) {
        this.ciNCertificate = ciNCertificate;
    }

    public Object getCiPhone() {
        return ciPhone;
    }

    public void setCiPhone(Object ciPhone) {
        this.ciPhone = ciPhone;
    }

    public Object getCiEmail() {
        return ciEmail;
    }

    public void setCiEmail(Object ciEmail) {
        this.ciEmail = ciEmail;
    }

    public Object getCiAddress() {
        return ciAddress;
    }

    public void setCiAddress(Object ciAddress) {
        this.ciAddress = ciAddress;
    }

    public Object getCoName() {
        return coName;
    }

    public void setCoName(Object coName) {
        this.coName = coName;
    }

    public Object getCoInn() {
        return coInn;
    }

    public void setCoInn(Object coInn) {
        this.coInn = coInn;
    }

    public Object getUtilCode() {
        return utilCode;
    }

    public void setUtilCode(Object utilCode) {
        this.utilCode = utilCode;
    }

    public Object getUtilByDoc() {
        return utilByDoc;
    }

    public void setUtilByDoc(Object utilByDoc) {
        this.utilByDoc = utilByDoc;
    }

    public Object getCadastralBlockId() {
        return cadastralBlockId;
    }

    public void setCadastralBlockId(Object cadastralBlockId) {
        this.cadastralBlockId = cadastralBlockId;
    }

    public Object getParcelStatusStr() {
        return parcelStatusStr;
    }

    public void setParcelStatusStr(Object parcelStatusStr) {
        this.parcelStatusStr = parcelStatusStr;
    }

    public Object getOksElementsConstructStr() {
        return oksElementsConstructStr;
    }

    public void setOksElementsConstructStr(Object oksElementsConstructStr) {
        this.oksElementsConstructStr = oksElementsConstructStr;
    }

    public Object getUtilCodeDesc() {
        return utilCodeDesc;
    }

    public void setUtilCodeDesc(Object utilCodeDesc) {
        this.utilCodeDesc = utilCodeDesc;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
