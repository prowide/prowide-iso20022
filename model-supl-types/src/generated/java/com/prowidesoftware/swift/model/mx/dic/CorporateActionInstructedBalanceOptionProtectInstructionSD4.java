
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
 * Provides additional information regarding corporate action instructed balance details at option protect level.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionInstructedBalanceOptionProtectInstructionSD4", propOrder = {
    "plcAndNm",
    "optnNb",
    "prtctId",
    "prtctSfkpgAcct",
    "prtctIdUcvrdQty",
    "prtctIdOvrsbcptQty",
    "prtctIdSts"
})
public class CorporateActionInstructedBalanceOptionProtectInstructionSD4 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "PrtctId")
    protected String prtctId;
    @XmlElement(name = "PrtctSfkpgAcct")
    protected String prtctSfkpgAcct;
    @XmlElement(name = "PrtctIdUcvrdQty")
    protected FinancialInstrumentQuantity15Choice prtctIdUcvrdQty;
    @XmlElement(name = "PrtctIdOvrsbcptQty")
    protected FinancialInstrumentQuantity15Choice prtctIdOvrsbcptQty;
    @XmlElement(name = "PrtctIdSts")
    @XmlSchemaType(name = "string")
    protected DTCProtectInstructionStatus1Code prtctIdSts;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionSD4 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

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
    public CorporateActionInstructedBalanceOptionProtectInstructionSD4 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the prtctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtctId() {
        return prtctId;
    }

    /**
     * Sets the value of the prtctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionSD4 setPrtctId(String value) {
        this.prtctId = value;
        return this;
    }

    /**
     * Gets the value of the prtctSfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtctSfkpgAcct() {
        return prtctSfkpgAcct;
    }

    /**
     * Sets the value of the prtctSfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionSD4 setPrtctSfkpgAcct(String value) {
        this.prtctSfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the prtctIdUcvrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getPrtctIdUcvrdQty() {
        return prtctIdUcvrdQty;
    }

    /**
     * Sets the value of the prtctIdUcvrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionSD4 setPrtctIdUcvrdQty(FinancialInstrumentQuantity15Choice value) {
        this.prtctIdUcvrdQty = value;
        return this;
    }

    /**
     * Gets the value of the prtctIdOvrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getPrtctIdOvrsbcptQty() {
        return prtctIdOvrsbcptQty;
    }

    /**
     * Sets the value of the prtctIdOvrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionSD4 setPrtctIdOvrsbcptQty(FinancialInstrumentQuantity15Choice value) {
        this.prtctIdOvrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the prtctIdSts property.
     * 
     * @return
     *     possible object is
     *     {@link DTCProtectInstructionStatus1Code }
     *     
     */
    public DTCProtectInstructionStatus1Code getPrtctIdSts() {
        return prtctIdSts;
    }

    /**
     * Sets the value of the prtctIdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCProtectInstructionStatus1Code }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionSD4 setPrtctIdSts(DTCProtectInstructionStatus1Code value) {
        this.prtctIdSts = value;
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
