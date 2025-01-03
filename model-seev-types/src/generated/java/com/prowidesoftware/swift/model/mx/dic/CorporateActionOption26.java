
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
@XmlType(name = "CorporateActionOption26", propOrder = {
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
public class CorporateActionOption26 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption5Choice optnTp;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification36Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected String sfkpgAcct;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat2Choice sfkpgPlc;
    @XmlElement(name = "SctyId")
    protected SecurityIdentification14 sctyId;
    @XmlElement(name = "TtlElgblBal")
    protected SignedQuantityFormat1 ttlElgblBal;
    @XmlElement(name = "InstdBal")
    protected SignedQuantityFormat1 instdBal;
    @XmlElement(name = "UinstdBal")
    protected SignedQuantityFormat1 uinstdBal;
    @XmlElement(name = "StsQtyOrQtyToRcv")
    protected StatusOrQuantityToReceive1Choice stsQtyOrQtyToRcv;

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
    public CorporateActionOption26 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption5Choice }
     *     
     */
    public CorporateActionOption5Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption5Choice }
     *     
     */
    public CorporateActionOption26 setOptnTp(CorporateActionOption5Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification36Choice }
     *     
     */
    public PartyIdentification36Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification36Choice }
     *     
     */
    public CorporateActionOption26 setAcctOwnr(PartyIdentification36Choice value) {
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
    public CorporateActionOption26 setSfkpgAcct(String value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CorporateActionOption26 setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat2Choice }
     *     
     */
    public SafekeepingPlaceFormat2Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat2Choice }
     *     
     */
    public CorporateActionOption26 setSfkpgPlc(SafekeepingPlaceFormat2Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public CorporateActionOption26 setSctyId(SecurityIdentification14 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat1 }
     *     
     */
    public SignedQuantityFormat1 getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat1 }
     *     
     */
    public CorporateActionOption26 setTtlElgblBal(SignedQuantityFormat1 value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat1 }
     *     
     */
    public SignedQuantityFormat1 getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat1 }
     *     
     */
    public CorporateActionOption26 setInstdBal(SignedQuantityFormat1 value) {
        this.instdBal = value;
        return this;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat1 }
     *     
     */
    public SignedQuantityFormat1 getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat1 }
     *     
     */
    public CorporateActionOption26 setUinstdBal(SignedQuantityFormat1 value) {
        this.uinstdBal = value;
        return this;
    }

    /**
     * Gets the value of the stsQtyOrQtyToRcv property.
     * 
     * @return
     *     possible object is
     *     {@link StatusOrQuantityToReceive1Choice }
     *     
     */
    public StatusOrQuantityToReceive1Choice getStsQtyOrQtyToRcv() {
        return stsQtyOrQtyToRcv;
    }

    /**
     * Sets the value of the stsQtyOrQtyToRcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusOrQuantityToReceive1Choice }
     *     
     */
    public CorporateActionOption26 setStsQtyOrQtyToRcv(StatusOrQuantityToReceive1Choice value) {
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
