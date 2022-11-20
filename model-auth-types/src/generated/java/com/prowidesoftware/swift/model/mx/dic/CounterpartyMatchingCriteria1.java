
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CounterpartyMatchingCriteria1", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "ctrPtySd"
})
public class CounterpartyMatchingCriteria1 {

    @XmlElement(name = "RptgCtrPty")
    protected CompareOrganisationIdentification1 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty")
    protected CompareOrganisationIdentification1 othrCtrPty;
    @XmlElement(name = "CtrPtySd")
    protected CompareCounterpartySide1 ctrPtySd;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification1 }
     *     
     */
    public CompareOrganisationIdentification1 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification1 }
     *     
     */
    public CounterpartyMatchingCriteria1 setRptgCtrPty(CompareOrganisationIdentification1 value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification1 }
     *     
     */
    public CompareOrganisationIdentification1 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification1 }
     *     
     */
    public CounterpartyMatchingCriteria1 setOthrCtrPty(CompareOrganisationIdentification1 value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCounterpartySide1 }
     *     
     */
    public CompareCounterpartySide1 getCtrPtySd() {
        return ctrPtySd;
    }

    /**
     * Sets the value of the ctrPtySd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCounterpartySide1 }
     *     
     */
    public CounterpartyMatchingCriteria1 setCtrPtySd(CompareCounterpartySide1 value) {
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
