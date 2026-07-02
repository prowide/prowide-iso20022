
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
 * Compares information related to both sides of a counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyMatchingCriteria6", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "drctnOrSd"
})
public class CounterpartyMatchingCriteria6 {

    @XmlElement(name = "RptgCtrPty")
    protected CompareOrganisationIdentification6 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty")
    protected CompareOrganisationIdentification7 othrCtrPty;
    @XmlElement(name = "DrctnOrSd")
    protected CompareLegDirection2 drctnOrSd;

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
    public CounterpartyMatchingCriteria6 setRptgCtrPty(CompareOrganisationIdentification6 value) {
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
    public CounterpartyMatchingCriteria6 setOthrCtrPty(CompareOrganisationIdentification7 value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the drctnOrSd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareLegDirection2 }
     *     
     */
    public CompareLegDirection2 getDrctnOrSd() {
        return drctnOrSd;
    }

    /**
     * Sets the value of the drctnOrSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareLegDirection2 }
     *     
     */
    public CounterpartyMatchingCriteria6 setDrctnOrSd(CompareLegDirection2 value) {
        this.drctnOrSd = value;
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
