
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
 * Provides information about the corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption144", propOrder = {
    "optnNb",
    "optnTp",
    "acctOwnr",
    "sfkpgAcct",
    "cshAcct",
    "sfkpgPlc",
    "finInstrmId",
    "ttlElgblBal",
    "instdBal",
    "uinstdBal",
    "stsQty",
    "stsCshAmt"
})
public class CorporateActionOption144 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption22Choice optnTp;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification103Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected String sfkpgAcct;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification6Choice cshAcct;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat11Choice sfkpgPlc;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "TtlElgblBal")
    protected SignedQuantityFormat8 ttlElgblBal;
    @XmlElement(name = "InstdBal")
    protected SignedQuantityFormat8 instdBal;
    @XmlElement(name = "UinstdBal")
    protected SignedQuantityFormat8 uinstdBal;
    @XmlElement(name = "StsQty")
    protected Quantity10Choice stsQty;
    @XmlElement(name = "StsCshAmt")
    protected RestrictedFINActiveCurrencyAndAmount stsCshAmt;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public OptionNumber1Choice getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public CorporateActionOption144 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption22Choice }
     *     
     */
    public CorporateActionOption22Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption22Choice }
     *     
     */
    public CorporateActionOption144 setOptnTp(CorporateActionOption22Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification103Choice }
     *     
     */
    public PartyIdentification103Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification103Choice }
     *     
     */
    public CorporateActionOption144 setAcctOwnr(PartyIdentification103Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionOption144 setSfkpgAcct(String value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CorporateActionOption144 setCshAcct(CashAccountIdentification6Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat11Choice }
     *     
     */
    public SafekeepingPlaceFormat11Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat11Choice }
     *     
     */
    public CorporateActionOption144 setSfkpgPlc(SafekeepingPlaceFormat11Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public CorporateActionOption144 setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat8 }
     *     
     */
    public SignedQuantityFormat8 getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat8 }
     *     
     */
    public CorporateActionOption144 setTtlElgblBal(SignedQuantityFormat8 value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat8 }
     *     
     */
    public SignedQuantityFormat8 getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat8 }
     *     
     */
    public CorporateActionOption144 setInstdBal(SignedQuantityFormat8 value) {
        this.instdBal = value;
        return this;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat8 }
     *     
     */
    public SignedQuantityFormat8 getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat8 }
     *     
     */
    public CorporateActionOption144 setUinstdBal(SignedQuantityFormat8 value) {
        this.uinstdBal = value;
        return this;
    }

    /**
     * Gets the value of the stsQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity10Choice }
     *     
     */
    public Quantity10Choice getStsQty() {
        return stsQty;
    }

    /**
     * Sets the value of the stsQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity10Choice }
     *     
     */
    public CorporateActionOption144 setStsQty(Quantity10Choice value) {
        this.stsQty = value;
        return this;
    }

    /**
     * Gets the value of the stsCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getStsCshAmt() {
        return stsCshAmt;
    }

    /**
     * Sets the value of the stsCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionOption144 setStsCshAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.stsCshAmt = value;
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
