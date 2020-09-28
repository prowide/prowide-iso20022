
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
 * Information about clearing register.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingRegisterHeaderDetails1", propOrder = {
    "prcgPrd",
    "ttlIntrBkSttlmCdtAmt",
    "ttlIntrBkSttlmDbtAmt",
    "clrAgt",
    "clrAgtAcct",
    "grntFndAgt",
    "grntFndAgtAcct",
    "clrCrct",
    "sttlmTmReq",
    "sttlmTmIndctn",
    "pmtId"
})
public class ClearingRegisterHeaderDetails1 {

    @XmlElement(name = "PrcgPrd", required = true)
    protected Period4 prcgPrd;
    @XmlElement(name = "TtlIntrBkSttlmCdtAmt", required = true)
    protected ActiveCurrencyAndAmount ttlIntrBkSttlmCdtAmt;
    @XmlElement(name = "TtlIntrBkSttlmDbtAmt", required = true)
    protected ActiveCurrencyAndAmount ttlIntrBkSttlmDbtAmt;
    @XmlElement(name = "ClrAgt")
    protected BranchAndFinancialInstitutionIdentification5 clrAgt;
    @XmlElement(name = "ClrAgtAcct")
    protected CashAccount24 clrAgtAcct;
    @XmlElement(name = "GrntFndAgt")
    protected BranchAndFinancialInstitutionIdentification5 grntFndAgt;
    @XmlElement(name = "GrntFndAgtAcct")
    protected CashAccount24 grntFndAgtAcct;
    @XmlElement(name = "ClrCrct")
    protected ClearingScheme1Choice clrCrct;
    @XmlElement(name = "SttlmTmReq")
    protected SettlementTimeRequest2 sttlmTmReq;
    @XmlElement(name = "SttlmTmIndctn")
    protected SettlementDateTimeIndication1 sttlmTmIndctn;
    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification3 pmtId;

    /**
     * Gets the value of the prcgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4 }
     *     
     */
    public Period4 getPrcgPrd() {
        return prcgPrd;
    }

    /**
     * Sets the value of the prcgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4 }
     *     
     */
    public ClearingRegisterHeaderDetails1 setPrcgPrd(Period4 value) {
        this.prcgPrd = value;
        return this;
    }

    /**
     * Gets the value of the ttlIntrBkSttlmCdtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlIntrBkSttlmCdtAmt() {
        return ttlIntrBkSttlmCdtAmt;
    }

    /**
     * Sets the value of the ttlIntrBkSttlmCdtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ClearingRegisterHeaderDetails1 setTtlIntrBkSttlmCdtAmt(ActiveCurrencyAndAmount value) {
        this.ttlIntrBkSttlmCdtAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlIntrBkSttlmDbtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlIntrBkSttlmDbtAmt() {
        return ttlIntrBkSttlmDbtAmt;
    }

    /**
     * Sets the value of the ttlIntrBkSttlmDbtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ClearingRegisterHeaderDetails1 setTtlIntrBkSttlmDbtAmt(ActiveCurrencyAndAmount value) {
        this.ttlIntrBkSttlmDbtAmt = value;
        return this;
    }

    /**
     * Gets the value of the clrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getClrAgt() {
        return clrAgt;
    }

    /**
     * Sets the value of the clrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public ClearingRegisterHeaderDetails1 setClrAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.clrAgt = value;
        return this;
    }

    /**
     * Gets the value of the clrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getClrAgtAcct() {
        return clrAgtAcct;
    }

    /**
     * Sets the value of the clrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public ClearingRegisterHeaderDetails1 setClrAgtAcct(CashAccount24 value) {
        this.clrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the grntFndAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getGrntFndAgt() {
        return grntFndAgt;
    }

    /**
     * Sets the value of the grntFndAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public ClearingRegisterHeaderDetails1 setGrntFndAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.grntFndAgt = value;
        return this;
    }

    /**
     * Gets the value of the grntFndAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getGrntFndAgtAcct() {
        return grntFndAgtAcct;
    }

    /**
     * Sets the value of the grntFndAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public ClearingRegisterHeaderDetails1 setGrntFndAgtAcct(CashAccount24 value) {
        this.grntFndAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the clrCrct property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingScheme1Choice }
     *     
     */
    public ClearingScheme1Choice getClrCrct() {
        return clrCrct;
    }

    /**
     * Sets the value of the clrCrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingScheme1Choice }
     *     
     */
    public ClearingRegisterHeaderDetails1 setClrCrct(ClearingScheme1Choice value) {
        this.clrCrct = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTmReq property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public SettlementTimeRequest2 getSttlmTmReq() {
        return sttlmTmReq;
    }

    /**
     * Sets the value of the sttlmTmReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public ClearingRegisterHeaderDetails1 setSttlmTmReq(SettlementTimeRequest2 value) {
        this.sttlmTmReq = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTmIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDateTimeIndication1 }
     *     
     */
    public SettlementDateTimeIndication1 getSttlmTmIndctn() {
        return sttlmTmIndctn;
    }

    /**
     * Sets the value of the sttlmTmIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDateTimeIndication1 }
     *     
     */
    public ClearingRegisterHeaderDetails1 setSttlmTmIndctn(SettlementDateTimeIndication1 value) {
        this.sttlmTmIndctn = value;
        return this;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification3 }
     *     
     */
    public PaymentIdentification3 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification3 }
     *     
     */
    public ClearingRegisterHeaderDetails1 setPmtId(PaymentIdentification3 value) {
        this.pmtId = value;
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
