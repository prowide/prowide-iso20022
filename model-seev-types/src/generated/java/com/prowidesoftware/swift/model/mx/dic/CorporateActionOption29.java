
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
@XmlType(name = "CorporateActionOption29", propOrder = {
    "optnNb",
    "optnTp",
    "acctOwnr",
    "sfkpgAcct",
    "cshAcct",
    "sfkpgPlc",
    "sctyId",
    "ttlElgblBal",
    "instdBal",
    "uinstdBal",
    "stsQtyOrQtyToRcv"
})
public class CorporateActionOption29 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption7Choice optnTp;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification51Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected String sfkpgAcct;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification6Choice cshAcct;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat5Choice sfkpgPlc;
    @XmlElement(name = "SctyId")
    protected SecurityIdentification15 sctyId;
    @XmlElement(name = "TtlElgblBal")
    protected SignedQuantityFormat3 ttlElgblBal;
    @XmlElement(name = "InstdBal")
    protected SignedQuantityFormat3 instdBal;
    @XmlElement(name = "UinstdBal")
    protected SignedQuantityFormat3 uinstdBal;
    @XmlElement(name = "StsQtyOrQtyToRcv")
    protected StatusOrQuantityToReceive2Choice stsQtyOrQtyToRcv;

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
    public CorporateActionOption29 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption7Choice }
     *     
     */
    public CorporateActionOption7Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption7Choice }
     *     
     */
    public CorporateActionOption29 setOptnTp(CorporateActionOption7Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification51Choice }
     *     
     */
    public PartyIdentification51Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification51Choice }
     *     
     */
    public CorporateActionOption29 setAcctOwnr(PartyIdentification51Choice value) {
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
    public CorporateActionOption29 setSfkpgAcct(String value) {
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
    public CorporateActionOption29 setCshAcct(CashAccountIdentification6Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat5Choice }
     *     
     */
    public SafekeepingPlaceFormat5Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat5Choice }
     *     
     */
    public CorporateActionOption29 setSfkpgPlc(SafekeepingPlaceFormat5Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public SecurityIdentification15 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public CorporateActionOption29 setSctyId(SecurityIdentification15 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat3 }
     *     
     */
    public SignedQuantityFormat3 getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat3 }
     *     
     */
    public CorporateActionOption29 setTtlElgblBal(SignedQuantityFormat3 value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat3 }
     *     
     */
    public SignedQuantityFormat3 getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat3 }
     *     
     */
    public CorporateActionOption29 setInstdBal(SignedQuantityFormat3 value) {
        this.instdBal = value;
        return this;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat3 }
     *     
     */
    public SignedQuantityFormat3 getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat3 }
     *     
     */
    public CorporateActionOption29 setUinstdBal(SignedQuantityFormat3 value) {
        this.uinstdBal = value;
        return this;
    }

    /**
     * Gets the value of the stsQtyOrQtyToRcv property.
     * 
     * @return
     *     possible object is
     *     {@link StatusOrQuantityToReceive2Choice }
     *     
     */
    public StatusOrQuantityToReceive2Choice getStsQtyOrQtyToRcv() {
        return stsQtyOrQtyToRcv;
    }

    /**
     * Sets the value of the stsQtyOrQtyToRcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusOrQuantityToReceive2Choice }
     *     
     */
    public CorporateActionOption29 setStsQtyOrQtyToRcv(StatusOrQuantityToReceive2Choice value) {
        this.stsQtyOrQtyToRcv = value;
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
