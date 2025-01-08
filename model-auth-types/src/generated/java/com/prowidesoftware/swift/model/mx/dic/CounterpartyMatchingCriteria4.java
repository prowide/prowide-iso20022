
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Compares information related to both sides of a loan.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyMatchingCriteria4", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "ctrPtySd"
})
public class CounterpartyMatchingCriteria4 {

    @XmlElement(name = "RptgCtrPty")
    protected CompareOrganisationIdentification6 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty")
    protected CompareOrganisationIdentification7 othrCtrPty;
    @XmlElement(name = "CtrPtySd")
    protected CompareCounterpartySide2 ctrPtySd;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification6 }
     *     
     */
    public CompareOrganisationIdentification6 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification6 }
     *     
     */
    public CounterpartyMatchingCriteria4 setRptgCtrPty(CompareOrganisationIdentification6 value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification7 }
     *     
     */
    public CompareOrganisationIdentification7 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification7 }
     *     
     */
    public CounterpartyMatchingCriteria4 setOthrCtrPty(CompareOrganisationIdentification7 value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCounterpartySide2 }
     *     
     */
    public CompareCounterpartySide2 getCtrPtySd() {
        return ctrPtySd;
    }

    /**
     * Sets the value of the ctrPtySd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCounterpartySide2 }
     *     
     */
    public CounterpartyMatchingCriteria4 setCtrPtySd(CompareCounterpartySide2 value) {
        this.ctrPtySd = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
