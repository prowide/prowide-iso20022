
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
@XmlType(name = "ContractType8", propOrder = {
    "ctrctTp",
    "asstClss",
    "pdctClssfctn",
    "pdctId",
    "undrlygInstrm",
    "ntnlCcyFrstLeg",
    "ntnlCcyScndLeg",
    "dlvrblCcy"
})
public class ContractType8 {

    @XmlElement(name = "CtrctTp")
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentContractType2Code ctrctTp;
    @XmlElement(name = "AsstClss")
    @XmlSchemaType(name = "string")
    protected ProductType4Code asstClss;
    @XmlElement(name = "PdctClssfctn")
    protected ProductClassification1Choice pdctClssfctn;
    @XmlElement(name = "PdctId")
    protected SecurityIdentification18Choice pdctId;
    @XmlElement(name = "UndrlygInstrm")
    protected SecurityIdentification34Choice undrlygInstrm;
    @XmlElement(name = "NtnlCcyFrstLeg")
    protected String ntnlCcyFrstLeg;
    @XmlElement(name = "NtnlCcyScndLeg")
    protected String ntnlCcyScndLeg;
    @XmlElement(name = "DlvrblCcy")
    protected String dlvrblCcy;

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
    public ContractType8 setCtrctTp(FinancialInstrumentContractType2Code value) {
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
    public ContractType8 setAsstClss(ProductType4Code value) {
        this.asstClss = value;
        return this;
    }

    /**
     * Gets the value of the pdctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ProductClassification1Choice }
     *     
     */
    public ProductClassification1Choice getPdctClssfctn() {
        return pdctClssfctn;
    }

    /**
     * Sets the value of the pdctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductClassification1Choice }
     *     
     */
    public ContractType8 setPdctClssfctn(ProductClassification1Choice value) {
        this.pdctClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the pdctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification18Choice }
     *     
     */
    public SecurityIdentification18Choice getPdctId() {
        return pdctId;
    }

    /**
     * Sets the value of the pdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification18Choice }
     *     
     */
    public ContractType8 setPdctId(SecurityIdentification18Choice value) {
        this.pdctId = value;
        return this;
    }

    /**
     * Gets the value of the undrlygInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification34Choice }
     *     
     */
    public SecurityIdentification34Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification34Choice }
     *     
     */
    public ContractType8 setUndrlygInstrm(SecurityIdentification34Choice value) {
        this.undrlygInstrm = value;
        return this;
    }

    /**
     * Gets the value of the ntnlCcyFrstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcyFrstLeg() {
        return ntnlCcyFrstLeg;
    }

    /**
     * Sets the value of the ntnlCcyFrstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractType8 setNtnlCcyFrstLeg(String value) {
        this.ntnlCcyFrstLeg = value;
        return this;
    }

    /**
     * Gets the value of the ntnlCcyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcyScndLeg() {
        return ntnlCcyScndLeg;
    }

    /**
     * Sets the value of the ntnlCcyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractType8 setNtnlCcyScndLeg(String value) {
        this.ntnlCcyScndLeg = value;
        return this;
    }

    /**
     * Gets the value of the dlvrblCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvrblCcy() {
        return dlvrblCcy;
    }

    /**
     * Sets the value of the dlvrblCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractType8 setDlvrblCcy(String value) {
        this.dlvrblCcy = value;
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
