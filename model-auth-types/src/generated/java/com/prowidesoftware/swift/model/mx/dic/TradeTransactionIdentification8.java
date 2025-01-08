
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
 * Provides details on transaction and conducting counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransactionIdentification8", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "collPrtflId"
})
public class TradeTransactionIdentification8 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected OrganisationIdentification9Choice rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected OrganisationIdentification9Choice othrCtrPty;
    @XmlElement(name = "CollPrtflId", required = true)
    protected String collPrtflId;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public TradeTransactionIdentification8 setRptgCtrPty(OrganisationIdentification9Choice value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public TradeTransactionIdentification8 setOthrCtrPty(OrganisationIdentification9Choice value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the collPrtflId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollPrtflId() {
        return collPrtflId;
    }

    /**
     * Sets the value of the collPrtflId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransactionIdentification8 setCollPrtflId(String value) {
        this.collPrtflId = value;
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
