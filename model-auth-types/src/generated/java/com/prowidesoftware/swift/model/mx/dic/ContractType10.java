
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
@XmlType(name = "ContractType10", propOrder = {
    "ctrctTp",
    "asstClss",
    "pdctClssfctn",
    "pdctId",
    "undrlygInstrm",
    "ntnlCcy",
    "sttlmCcy",
    "plcOfSttlm"
})
public class ContractType10 {

    @XmlElement(name = "CtrctTp")
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentContractType2Code ctrctTp;
    @XmlElement(name = "AsstClss")
    @XmlSchemaType(name = "string")
    protected ProductType4Code asstClss;
    @XmlElement(name = "PdctClssfctn")
    protected String pdctClssfctn;
    @XmlElement(name = "PdctId")
    protected SecurityIdentification22 pdctId;
    @XmlElement(name = "UndrlygInstrm")
    protected SecurityIdentification36Choice undrlygInstrm;
    @XmlElement(name = "NtnlCcy")
    protected LegCurrency2 ntnlCcy;
    @XmlElement(name = "SttlmCcy")
    protected LegCurrency2 sttlmCcy;
    @XmlElement(name = "PlcOfSttlm")
    protected String plcOfSttlm;

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
    public ContractType10 setCtrctTp(FinancialInstrumentContractType2Code value) {
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
    public ContractType10 setAsstClss(ProductType4Code value) {
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
    public ContractType10 setPdctClssfctn(String value) {
        this.pdctClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the pdctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification22 }
     *     
     */
    public SecurityIdentification22 getPdctId() {
        return pdctId;
    }

    /**
     * Sets the value of the pdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification22 }
     *     
     */
    public ContractType10 setPdctId(SecurityIdentification22 value) {
        this.pdctId = value;
        return this;
    }

    /**
     * Gets the value of the undrlygInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification36Choice }
     *     
     */
    public SecurityIdentification36Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification36Choice }
     *     
     */
    public ContractType10 setUndrlygInstrm(SecurityIdentification36Choice value) {
        this.undrlygInstrm = value;
        return this;
    }

    /**
     * Gets the value of the ntnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link LegCurrency2 }
     *     
     */
    public LegCurrency2 getNtnlCcy() {
        return ntnlCcy;
    }

    /**
     * Sets the value of the ntnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegCurrency2 }
     *     
     */
    public ContractType10 setNtnlCcy(LegCurrency2 value) {
        this.ntnlCcy = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link LegCurrency2 }
     *     
     */
    public LegCurrency2 getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegCurrency2 }
     *     
     */
    public ContractType10 setSttlmCcy(LegCurrency2 value) {
        this.sttlmCcy = value;
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
    public ContractType10 setPlcOfSttlm(String value) {
        this.plcOfSttlm = value;
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
