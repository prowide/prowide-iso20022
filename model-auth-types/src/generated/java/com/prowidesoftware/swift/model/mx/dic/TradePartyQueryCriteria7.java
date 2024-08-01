
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "TradePartyQueryCriteria7", propOrder = {
    "oprtr",
    "rptgCtrPty",
    "othrCtrPty",
    "bnfcry",
    "nttyRspnsblForRpt",
    "submitgAgt",
    "brkr",
    "ccp",
    "clrMmb"
})
public class TradePartyQueryCriteria7 {

    @XmlElement(name = "Oprtr", required = true)
    @XmlSchemaType(name = "string")
    protected Operation3Code oprtr;
    @XmlElement(name = "RptgCtrPty")
    protected TradePartyIdentificationQuery10Choice rptgCtrPty;
    @XmlElement(name = "OthrCtrPty")
    protected TradePartyIdentificationQuery10Choice othrCtrPty;
    @XmlElement(name = "Bnfcry")
    protected TradePartyIdentificationQuery10Choice bnfcry;
    @XmlElement(name = "NttyRspnsblForRpt")
    protected TradePartyIdentificationQuery11Choice nttyRspnsblForRpt;
    @XmlElement(name = "SubmitgAgt")
    protected TradePartyIdentificationQuery11Choice submitgAgt;
    @XmlElement(name = "Brkr")
    protected TradePartyIdentificationQuery11Choice brkr;
    @XmlElement(name = "CCP")
    protected TradePartyIdentificationQuery11Choice ccp;
    @XmlElement(name = "ClrMmb")
    protected TradePartyIdentificationQuery10Choice clrMmb;

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
    public TradePartyQueryCriteria7 setOprtr(Operation3Code value) {
        this.oprtr = value;
        return this;
    }

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public TradePartyIdentificationQuery10Choice getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public TradePartyQueryCriteria7 setRptgCtrPty(TradePartyIdentificationQuery10Choice value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public TradePartyIdentificationQuery10Choice getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public TradePartyQueryCriteria7 setOthrCtrPty(TradePartyIdentificationQuery10Choice value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public TradePartyIdentificationQuery10Choice getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public TradePartyQueryCriteria7 setBnfcry(TradePartyIdentificationQuery10Choice value) {
        this.bnfcry = value;
        return this;
    }

    /**
     * Gets the value of the nttyRspnsblForRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public TradePartyIdentificationQuery11Choice getNttyRspnsblForRpt() {
        return nttyRspnsblForRpt;
    }

    /**
     * Sets the value of the nttyRspnsblForRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public TradePartyQueryCriteria7 setNttyRspnsblForRpt(TradePartyIdentificationQuery11Choice value) {
        this.nttyRspnsblForRpt = value;
        return this;
    }

    /**
     * Gets the value of the submitgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public TradePartyIdentificationQuery11Choice getSubmitgAgt() {
        return submitgAgt;
    }

    /**
     * Sets the value of the submitgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public TradePartyQueryCriteria7 setSubmitgAgt(TradePartyIdentificationQuery11Choice value) {
        this.submitgAgt = value;
        return this;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public TradePartyIdentificationQuery11Choice getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public TradePartyQueryCriteria7 setBrkr(TradePartyIdentificationQuery11Choice value) {
        this.brkr = value;
        return this;
    }

    /**
     * Gets the value of the ccp property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public TradePartyIdentificationQuery11Choice getCCP() {
        return ccp;
    }

    /**
     * Sets the value of the ccp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public TradePartyQueryCriteria7 setCCP(TradePartyIdentificationQuery11Choice value) {
        this.ccp = value;
        return this;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public TradePartyIdentificationQuery10Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public TradePartyQueryCriteria7 setClrMmb(TradePartyIdentificationQuery10Choice value) {
        this.clrMmb = value;
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
