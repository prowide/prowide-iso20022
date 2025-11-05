
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
 * Provides information about the corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption238", propOrder = {
    "optnNb",
    "optnTp",
    "optnFeatrs",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "cshAcct",
    "sfkpgPlc",
    "finInstrmId",
    "ttlElgblBal",
    "instdBal",
    "uinstdBal",
    "prtctBal",
    "stsQty",
    "stsCshAmt",
    "slctnDealrFeeInd"
})
public class CorporateActionOption238 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption41Choice optnTp;
    @XmlElement(name = "OptnFeatrs")
    protected OptionFeaturesFormat25Choice optnFeatrs;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification127Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected String sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected String blckChainAdrOrWllt;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification9Choice cshAcct;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat42Choice sfkpgPlc;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "TtlElgblBal")
    protected SignedQuantityFormat11 ttlElgblBal;
    @XmlElement(name = "InstdBal")
    protected SignedQuantityFormat11 instdBal;
    @XmlElement(name = "UinstdBal")
    protected SignedQuantityFormat11 uinstdBal;
    @XmlElement(name = "PrtctBal")
    protected SignedQuantityFormat11 prtctBal;
    @XmlElement(name = "StsQty")
    protected Quantity51Choice stsQty;
    @XmlElement(name = "StsCshAmt")
    protected ActiveCurrencyAndAmount stsCshAmt;
    @XmlElement(name = "SlctnDealrFeeInd")
    protected Boolean slctnDealrFeeInd;

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
    public CorporateActionOption238 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption41Choice }
     *     
     */
    public CorporateActionOption41Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption41Choice }
     *     
     */
    public CorporateActionOption238 setOptnTp(CorporateActionOption41Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the optnFeatrs property.
     * 
     * @return
     *     possible object is
     *     {@link OptionFeaturesFormat25Choice }
     *     
     */
    public OptionFeaturesFormat25Choice getOptnFeatrs() {
        return optnFeatrs;
    }

    /**
     * Sets the value of the optnFeatrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionFeaturesFormat25Choice }
     *     
     */
    public CorporateActionOption238 setOptnFeatrs(OptionFeaturesFormat25Choice value) {
        this.optnFeatrs = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification127Choice }
     *     
     */
    public PartyIdentification127Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification127Choice }
     *     
     */
    public CorporateActionOption238 setAcctOwnr(PartyIdentification127Choice value) {
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
    public CorporateActionOption238 setSfkpgAcct(String value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionOption238 setBlckChainAdrOrWllt(String value) {
        this.blckChainAdrOrWllt = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification9Choice }
     *     
     */
    public CashAccountIdentification9Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification9Choice }
     *     
     */
    public CorporateActionOption238 setCshAcct(CashAccountIdentification9Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat42Choice }
     *     
     */
    public SafekeepingPlaceFormat42Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat42Choice }
     *     
     */
    public CorporateActionOption238 setSfkpgPlc(SafekeepingPlaceFormat42Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public CorporateActionOption238 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public SignedQuantityFormat11 getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public CorporateActionOption238 setTtlElgblBal(SignedQuantityFormat11 value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public SignedQuantityFormat11 getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public CorporateActionOption238 setInstdBal(SignedQuantityFormat11 value) {
        this.instdBal = value;
        return this;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public SignedQuantityFormat11 getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public CorporateActionOption238 setUinstdBal(SignedQuantityFormat11 value) {
        this.uinstdBal = value;
        return this;
    }

    /**
     * Gets the value of the prtctBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public SignedQuantityFormat11 getPrtctBal() {
        return prtctBal;
    }

    /**
     * Sets the value of the prtctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public CorporateActionOption238 setPrtctBal(SignedQuantityFormat11 value) {
        this.prtctBal = value;
        return this;
    }

    /**
     * Gets the value of the stsQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getStsQty() {
        return stsQty;
    }

    /**
     * Sets the value of the stsQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public CorporateActionOption238 setStsQty(Quantity51Choice value) {
        this.stsQty = value;
        return this;
    }

    /**
     * Gets the value of the stsCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStsCshAmt() {
        return stsCshAmt;
    }

    /**
     * Sets the value of the stsCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionOption238 setStsCshAmt(ActiveCurrencyAndAmount value) {
        this.stsCshAmt = value;
        return this;
    }

    /**
     * Gets the value of the slctnDealrFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlctnDealrFeeInd() {
        return slctnDealrFeeInd;
    }

    /**
     * Sets the value of the slctnDealrFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption238 setSlctnDealrFeeInd(Boolean value) {
        this.slctnDealrFeeInd = value;
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
