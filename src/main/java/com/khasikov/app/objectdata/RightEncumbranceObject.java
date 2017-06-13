
package com.khasikov.app.objectdata;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

public class RightEncumbranceObject {

    private RightData rightData;
    private List<Encumbrance> encumbrances = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RightEncumbranceObject() {
    }

    /**
     * 
     * @param rightData
     * @param encumbrances
     */
    public RightEncumbranceObject(RightData rightData, List<Encumbrance> encumbrances) {
        super();
        this.rightData = rightData;
        this.encumbrances = encumbrances;
    }

    public RightData getRightData() {
        return rightData;
    }

    public void setRightData(RightData rightData) {
        this.rightData = rightData;
    }

    public List<Encumbrance> getEncumbrances() {
        return encumbrances;
    }

    public void setEncumbrances(List<Encumbrance> encumbrances) {
        this.encumbrances = encumbrances;
    }

    @Override
    public String toString() {


        return ToStringBuilder.reflectionToString(this);
    }

}
