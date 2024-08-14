
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
 * Compares information related to both sides of a contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractMatchingCriteria3", propOrder = {
    "isin",
    "unqPdctIdr",
    "altrntvInstrmId",
    "pdctClssfctn",
    "ctrctTp",
    "asstClss",
    "derivBasedOnCrptAsst",
    "undrlygInstrm",
    "sttlmCcy",
    "sttlmCcyScndLeg"
})
public class ContractMatchingCriteria3 {

    @XmlElement(name = "ISIN")
    protected CompareISINIdentifier2 isin;
    @XmlElement(name = "UnqPdctIdr")
    protected CompareUniqueProductIdentifier2 unqPdctIdr;
    @XmlElement(name = "AltrntvInstrmId")
    protected CompareText1 altrntvInstrmId;
    @XmlElement(name = "PdctClssfctn")
    protected CompareCFIIdentifier3 pdctClssfctn;
    @XmlElement(name = "CtrctTp")
    protected CompareFinancialInstrumentContractType1 ctrctTp;
    @XmlElement(name = "AsstClss")
    protected CompareAssetClass1 asstClss;
    @XmlElement(name = "DerivBasedOnCrptAsst")
    protected CompareTrueFalseIndicator3 derivBasedOnCrptAsst;
    @XmlElement(name = "UndrlygInstrm")
    protected CompareUnderlyingInstrument3 undrlygInstrm;
    @XmlElement(name = "SttlmCcy")
    protected CompareActiveOrHistoricCurrencyCode1 sttlmCcy;
    @XmlElement(name = "SttlmCcyScndLeg")
    protected CompareActiveOrHistoricCurrencyCode1 sttlmCcyScndLeg;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link CompareISINIdentifier2 }
     *     
     */
    public CompareISINIdentifier2 getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareISINIdentifier2 }
     *     
     */
    public ContractMatchingCriteria3 setISIN(CompareISINIdentifier2 value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUniqueProductIdentifier2 }
     *     
     */
    public CompareUniqueProductIdentifier2 getUnqPdctIdr() {
        return unqPdctIdr;
    }

    /**
     * Sets the value of the unqPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUniqueProductIdentifier2 }
     *     
     */
    public ContractMatchingCriteria3 setUnqPdctIdr(CompareUniqueProductIdentifier2 value) {
        this.unqPdctIdr = value;
        return this;
    }

    /**
     * Gets the value of the altrntvInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link CompareText1 }
     *     
     */
    public CompareText1 getAltrntvInstrmId() {
        return altrntvInstrmId;
    }

    /**
     * Sets the value of the altrntvInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareText1 }
     *     
     */
    public ContractMatchingCriteria3 setAltrntvInstrmId(CompareText1 value) {
        this.altrntvInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the pdctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCFIIdentifier3 }
     *     
     */
    public CompareCFIIdentifier3 getPdctClssfctn() {
        return pdctClssfctn;
    }

    /**
     * Sets the value of the pdctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCFIIdentifier3 }
     *     
     */
    public ContractMatchingCriteria3 setPdctClssfctn(CompareCFIIdentifier3 value) {
        this.pdctClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFinancialInstrumentContractType1 }
     *     
     */
    public CompareFinancialInstrumentContractType1 getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFinancialInstrumentContractType1 }
     *     
     */
    public ContractMatchingCriteria3 setCtrctTp(CompareFinancialInstrumentContractType1 value) {
        this.ctrctTp = value;
        return this;
    }

    /**
     * Gets the value of the asstClss property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAssetClass1 }
     *     
     */
    public CompareAssetClass1 getAsstClss() {
        return asstClss;
    }

    /**
     * Sets the value of the asstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAssetClass1 }
     *     
     */
    public ContractMatchingCriteria3 setAsstClss(CompareAssetClass1 value) {
        this.asstClss = value;
        return this;
    }

    /**
     * Gets the value of the derivBasedOnCrptAsst property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getDerivBasedOnCrptAsst() {
        return derivBasedOnCrptAsst;
    }

    /**
     * Sets the value of the derivBasedOnCrptAsst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public ContractMatchingCriteria3 setDerivBasedOnCrptAsst(CompareTrueFalseIndicator3 value) {
        this.derivBasedOnCrptAsst = value;
        return this;
    }

    /**
     * Gets the value of the undrlygInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnderlyingInstrument3 }
     *     
     */
    public CompareUnderlyingInstrument3 getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnderlyingInstrument3 }
     *     
     */
    public ContractMatchingCriteria3 setUndrlygInstrm(CompareUnderlyingInstrument3 value) {
        this.undrlygInstrm = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyCode1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyCode1 getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyCode1 }
     *     
     */
    public ContractMatchingCriteria3 setSttlmCcy(CompareActiveOrHistoricCurrencyCode1 value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyCode1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyCode1 getSttlmCcyScndLeg() {
        return sttlmCcyScndLeg;
    }

    /**
     * Sets the value of the sttlmCcyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyCode1 }
     *     
     */
    public ContractMatchingCriteria3 setSttlmCcyScndLeg(CompareActiveOrHistoricCurrencyCode1 value) {
        this.sttlmCcyScndLeg = value;
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
