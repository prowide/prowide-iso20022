
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details on the queried trade parties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePartyQueryCriteria3", propOrder = {
    "oprtr",
    "rptgCtrPty",
    "othrCtrPty",
    "bnfcry",
    "submitgAgt",
    "brkr",
    "ccp"
})
public class TradePartyQueryCriteria3 {

    @XmlElement(name = "Oprtr", required = true)
    @XmlSchemaType(name = "string")
    protected Operation3Code oprtr;
    @XmlElement(name = "RptgCtrPty")
    protected TradePartyIdentificationQuery8 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty")
    protected TradePartyIdentificationQuery8 othrCtrPty;
    @XmlElement(name = "Bnfcry")
    protected TradePartyIdentificationQuery8 bnfcry;
    @XmlElement(name = "SubmitgAgt")
    protected TradePartyIdentificationQuery8 submitgAgt;
    @XmlElement(name = "Brkr")
    protected TradePartyIdentificationQuery8 brkr;
    @XmlElement(name = "CCP")
    protected TradePartyIdentificationQuery8 ccp;

    /**
     * Gets the value of the oprtr property.
     * 
     * @return
     *     possible object is
     *     {@link Operation3Code }
     *     
     */
    public Operation3Code getOprtr() {
        return oprtr;
    }

    /**
     * Sets the value of the oprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation3Code }
     *     
     */
    public TradePartyQueryCriteria3 setOprtr(Operation3Code value) {
        this.oprtr = value;
        return this;
    }

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyQueryCriteria3 setRptgCtrPty(TradePartyIdentificationQuery8 value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyQueryCriteria3 setOthrCtrPty(TradePartyIdentificationQuery8 value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyQueryCriteria3 setBnfcry(TradePartyIdentificationQuery8 value) {
        this.bnfcry = value;
        return this;
    }

    /**
     * Gets the value of the submitgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getSubmitgAgt() {
        return submitgAgt;
    }

    /**
     * Sets the value of the submitgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyQueryCriteria3 setSubmitgAgt(TradePartyIdentificationQuery8 value) {
        this.submitgAgt = value;
        return this;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyQueryCriteria3 setBrkr(TradePartyIdentificationQuery8 value) {
        this.brkr = value;
        return this;
    }

    /**
     * Gets the value of the ccp property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getCCP() {
        return ccp;
    }

    /**
     * Sets the value of the ccp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyQueryCriteria3 setCCP(TradePartyIdentificationQuery8 value) {
        this.ccp = value;
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
