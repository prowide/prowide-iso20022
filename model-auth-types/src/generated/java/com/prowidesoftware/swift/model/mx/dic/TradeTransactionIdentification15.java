
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
@XmlType(name = "TradeTransactionIdentification15", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "unqTradIdr",
    "mstrAgrmt",
    "agtLndr",
    "trptyAgt"
})
public class TradeTransactionIdentification15 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected OrganisationIdentification15Choice rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected PartyIdentification236Choice othrCtrPty;
    @XmlElement(name = "UnqTradIdr")
    protected String unqTradIdr;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement7 mstrAgrmt;
    @XmlElement(name = "AgtLndr")
    protected OrganisationIdentification15Choice agtLndr;
    @XmlElement(name = "TrptyAgt")
    protected OrganisationIdentification15Choice trptyAgt;

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
    public TradeTransactionIdentification15 setRptgCtrPty(OrganisationIdentification15Choice value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public PartyIdentification236Choice getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public TradeTransactionIdentification15 setOthrCtrPty(PartyIdentification236Choice value) {
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
    public TradeTransactionIdentification15 setUnqTradIdr(String value) {
        this.unqTradIdr = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement7 }
     *     
     */
    public MasterAgreement7 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement7 }
     *     
     */
    public TradeTransactionIdentification15 setMstrAgrmt(MasterAgreement7 value) {
        this.mstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the agtLndr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getAgtLndr() {
        return agtLndr;
    }

    /**
     * Sets the value of the agtLndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TradeTransactionIdentification15 setAgtLndr(OrganisationIdentification15Choice value) {
        this.agtLndr = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TradeTransactionIdentification15 setTrptyAgt(OrganisationIdentification15Choice value) {
        this.trptyAgt = value;
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
