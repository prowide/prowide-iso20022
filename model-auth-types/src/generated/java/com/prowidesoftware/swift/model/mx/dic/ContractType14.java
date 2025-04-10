
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
 * Information related to contract attributes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractType14", propOrder = {
    "ctrctTp",
    "asstClss",
    "pdctClssfctn",
    "pdctId",
    "undrlygInstrm",
    "sttlmCcy",
    "sttlmCcyScndLeg",
    "plcOfSttlm",
    "derivBasedOnCrptAsst"
})
public class ContractType14 {

    @XmlElement(name = "CtrctTp")
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentContractType2Code ctrctTp;
    @XmlElement(name = "AsstClss")
    @XmlSchemaType(name = "string")
    protected ProductType4Code asstClss;
    @XmlElement(name = "PdctClssfctn")
    protected String pdctClssfctn;
    @XmlElement(name = "PdctId")
    protected SecurityIdentification46 pdctId;
    @XmlElement(name = "UndrlygInstrm")
    protected SecurityIdentification41Choice undrlygInstrm;
    @XmlElement(name = "SttlmCcy")
    protected CurrencyExchange23 sttlmCcy;
    @XmlElement(name = "SttlmCcyScndLeg")
    protected CurrencyExchange23 sttlmCcyScndLeg;
    @XmlElement(name = "PlcOfSttlm")
    protected String plcOfSttlm;
    @XmlElement(name = "DerivBasedOnCrptAsst")
    protected Boolean derivBasedOnCrptAsst;

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentContractType2Code }
     *     
     */
    public FinancialInstrumentContractType2Code getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentContractType2Code }
     *     
     */
    public ContractType14 setCtrctTp(FinancialInstrumentContractType2Code value) {
        this.ctrctTp = value;
        return this;
    }

    /**
     * Gets the value of the asstClss property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType4Code }
     *     
     */
    public ProductType4Code getAsstClss() {
        return asstClss;
    }

    /**
     * Sets the value of the asstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType4Code }
     *     
     */
    public ContractType14 setAsstClss(ProductType4Code value) {
        this.asstClss = value;
        return this;
    }

    /**
     * Gets the value of the pdctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctClssfctn() {
        return pdctClssfctn;
    }

    /**
     * Sets the value of the pdctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractType14 setPdctClssfctn(String value) {
        this.pdctClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the pdctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification46 }
     *     
     */
    public SecurityIdentification46 getPdctId() {
        return pdctId;
    }

    /**
     * Sets the value of the pdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification46 }
     *     
     */
    public ContractType14 setPdctId(SecurityIdentification46 value) {
        this.pdctId = value;
        return this;
    }

    /**
     * Gets the value of the undrlygInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification41Choice }
     *     
     */
    public SecurityIdentification41Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification41Choice }
     *     
     */
    public ContractType14 setUndrlygInstrm(SecurityIdentification41Choice value) {
        this.undrlygInstrm = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange23 }
     *     
     */
    public CurrencyExchange23 getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange23 }
     *     
     */
    public ContractType14 setSttlmCcy(CurrencyExchange23 value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange23 }
     *     
     */
    public CurrencyExchange23 getSttlmCcyScndLeg() {
        return sttlmCcyScndLeg;
    }

    /**
     * Sets the value of the sttlmCcyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange23 }
     *     
     */
    public ContractType14 setSttlmCcyScndLeg(CurrencyExchange23 value) {
        this.sttlmCcyScndLeg = value;
        return this;
    }

    /**
     * Gets the value of the plcOfSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfSttlm() {
        return plcOfSttlm;
    }

    /**
     * Sets the value of the plcOfSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractType14 setPlcOfSttlm(String value) {
        this.plcOfSttlm = value;
        return this;
    }

    /**
     * Gets the value of the derivBasedOnCrptAsst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDerivBasedOnCrptAsst() {
        return derivBasedOnCrptAsst;
    }

    /**
     * Sets the value of the derivBasedOnCrptAsst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ContractType14 setDerivBasedOnCrptAsst(Boolean value) {
        this.derivBasedOnCrptAsst = value;
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
