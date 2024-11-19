
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "CorporateActionInstructedBalanceOptionProtectInstructionSD3", propOrder = {
    "plcAndNm",
    "optnNb",
    "prtctSfkpgAcct",
    "prtctIdUcvrdQty",
    "prtctIdOvrsbcptQty",
    "prtctIdSts"
})
public class CorporateActionInstructedBalanceOptionProtectInstructionSD3 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
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
    public CorporateActionInstructedBalanceOptionProtectInstructionSD3 setPlcAndNm(String value) {
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
    public CorporateActionInstructedBalanceOptionProtectInstructionSD3 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
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
    public CorporateActionInstructedBalanceOptionProtectInstructionSD3 setPrtctSfkpgAcct(String value) {
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
    public CorporateActionInstructedBalanceOptionProtectInstructionSD3 setPrtctIdUcvrdQty(FinancialInstrumentQuantity15Choice value) {
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
    public CorporateActionInstructedBalanceOptionProtectInstructionSD3 setPrtctIdOvrsbcptQty(FinancialInstrumentQuantity15Choice value) {
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
    public CorporateActionInstructedBalanceOptionProtectInstructionSD3 setPrtctIdSts(DTCProtectInstructionStatus1Code value) {
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
