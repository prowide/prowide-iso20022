
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
@XmlType(name = "TradeTransactionIdentification6", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "unqTradIdr",
    "mstrAgrmt"
})
public class TradeTransactionIdentification6 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected OrganisationIdentification9Choice rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected OrganisationIdentification9Choice othrCtrPty;
    @XmlElement(name = "UnqTradIdr")
    protected String unqTradIdr;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement1 mstrAgrmt;

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
    public TradeTransactionIdentification6 setRptgCtrPty(OrganisationIdentification9Choice value) {
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
    public TradeTransactionIdentification6 setOthrCtrPty(OrganisationIdentification9Choice value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the unqTradIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTradIdr() {
        return unqTradIdr;
    }

    /**
     * Sets the value of the unqTradIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransactionIdentification6 setUnqTradIdr(String value) {
        this.unqTradIdr = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement1 }
     *     
     */
    public MasterAgreement1 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement1 }
     *     
     */
    public TradeTransactionIdentification6 setMstrAgrmt(MasterAgreement1 value) {
        this.mstrAgrmt = value;
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
