
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
 * Provides additional information regarding corporate action instructed balance details at option level.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionInstructedBalanceOptionInstructionSD4", propOrder = {
    "plcAndNm",
    "optnNb",
    "prtctId",
    "txContraCUSIP",
    "txIdOvrsbcptQty",
    "txIdSts"
})
public class CorporateActionInstructedBalanceOptionInstructionSD4 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "PrtctId")
    protected String prtctId;
    @XmlElement(name = "TxContraCUSIP")
    protected OtherIdentification2 txContraCUSIP;
    @XmlElement(name = "TxIdOvrsbcptQty")
    protected FinancialInstrumentQuantity15Choice txIdOvrsbcptQty;
    @XmlElement(name = "TxIdSts", required = true)
    @XmlSchemaType(name = "string")
    protected DTCInstructionStatus2Code txIdSts;

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
    public CorporateActionInstructedBalanceOptionInstructionSD4 setPlcAndNm(String value) {
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
    public CorporateActionInstructedBalanceOptionInstructionSD4 setOptnNb(OptionNumber1Choice value) {
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
    public CorporateActionInstructedBalanceOptionInstructionSD4 setPrtctId(String value) {
        this.prtctId = value;
        return this;
    }

    /**
     * Gets the value of the txContraCUSIP property.
     * 
     * @return
     *     possible object is
     *     {@link OtherIdentification2 }
     *     
     */
    public OtherIdentification2 getTxContraCUSIP() {
        return txContraCUSIP;
    }

    /**
     * Sets the value of the txContraCUSIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIdentification2 }
     *     
     */
    public CorporateActionInstructedBalanceOptionInstructionSD4 setTxContraCUSIP(OtherIdentification2 value) {
        this.txContraCUSIP = value;
        return this;
    }

    /**
     * Gets the value of the txIdOvrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getTxIdOvrsbcptQty() {
        return txIdOvrsbcptQty;
    }

    /**
     * Sets the value of the txIdOvrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public CorporateActionInstructedBalanceOptionInstructionSD4 setTxIdOvrsbcptQty(FinancialInstrumentQuantity15Choice value) {
        this.txIdOvrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the txIdSts property.
     * 
     * @return
     *     possible object is
     *     {@link DTCInstructionStatus2Code }
     *     
     */
    public DTCInstructionStatus2Code getTxIdSts() {
        return txIdSts;
    }

    /**
     * Sets the value of the txIdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCInstructionStatus2Code }
     *     
     */
    public CorporateActionInstructedBalanceOptionInstructionSD4 setTxIdSts(DTCInstructionStatus2Code value) {
        this.txIdSts = value;
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
