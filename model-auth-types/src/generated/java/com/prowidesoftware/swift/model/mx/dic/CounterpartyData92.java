
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
 * Data specific to counterparties and related fields.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyData92", propOrder = {
    "rptgCtrPty",
    "rptSubmitgNtty",
    "nttyRspnsblForRpt"
})
public class CounterpartyData92 {

    @XmlElement(name = "RptgCtrPty")
    protected OrganisationIdentification15Choice rptgCtrPty;
    @XmlElement(name = "RptSubmitgNtty")
    protected OrganisationIdentification15Choice rptSubmitgNtty;
    @XmlElement(name = "NttyRspnsblForRpt")
    protected OrganisationIdentification15Choice nttyRspnsblForRpt;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public CounterpartyData92 setRptgCtrPty(OrganisationIdentification15Choice value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the rptSubmitgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getRptSubmitgNtty() {
        return rptSubmitgNtty;
    }

    /**
     * Sets the value of the rptSubmitgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public CounterpartyData92 setRptSubmitgNtty(OrganisationIdentification15Choice value) {
        this.rptSubmitgNtty = value;
        return this;
    }

    /**
     * Gets the value of the nttyRspnsblForRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getNttyRspnsblForRpt() {
        return nttyRspnsblForRpt;
    }

    /**
     * Sets the value of the nttyRspnsblForRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public CounterpartyData92 setNttyRspnsblForRpt(OrganisationIdentification15Choice value) {
        this.nttyRspnsblForRpt = value;
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
