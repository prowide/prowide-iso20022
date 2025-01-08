
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
 * Details of the standing settlement instruction to be applied.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingSettlementInstruction16", propOrder = {
    "sttlmStgInstrDB",
    "ctrPty",
    "vndr",
    "othrDlvrgSttlmPties",
    "othrRcvgSttlmPties"
})
public class StandingSettlementInstruction16 {

    @XmlElement(name = "SttlmStgInstrDB", required = true)
    protected SettlementStandingInstructionDatabase4Choice sttlmStgInstrDB;
    @XmlElement(name = "CtrPty", required = true)
    protected Counterparty13Choice ctrPty;
    @XmlElement(name = "Vndr")
    protected PartyIdentification136 vndr;
    @XmlElement(name = "OthrDlvrgSttlmPties")
    protected SettlementParties76 othrDlvrgSttlmPties;
    @XmlElement(name = "OthrRcvgSttlmPties")
    protected SettlementParties76 othrRcvgSttlmPties;

    /**
     * Gets the value of the sttlmStgInstrDB property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStandingInstructionDatabase4Choice }
     *     
     */
    public SettlementStandingInstructionDatabase4Choice getSttlmStgInstrDB() {
        return sttlmStgInstrDB;
    }

    /**
     * Sets the value of the sttlmStgInstrDB property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStandingInstructionDatabase4Choice }
     *     
     */
    public StandingSettlementInstruction16 setSttlmStgInstrDB(SettlementStandingInstructionDatabase4Choice value) {
        this.sttlmStgInstrDB = value;
        return this;
    }

    /**
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty13Choice }
     *     
     */
    public Counterparty13Choice getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty13Choice }
     *     
     */
    public StandingSettlementInstruction16 setCtrPty(Counterparty13Choice value) {
        this.ctrPty = value;
        return this;
    }

    /**
     * Gets the value of the vndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getVndr() {
        return vndr;
    }

    /**
     * Sets the value of the vndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public StandingSettlementInstruction16 setVndr(PartyIdentification136 value) {
        this.vndr = value;
        return this;
    }

    /**
     * Gets the value of the othrDlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties76 }
     *     
     */
    public SettlementParties76 getOthrDlvrgSttlmPties() {
        return othrDlvrgSttlmPties;
    }

    /**
     * Sets the value of the othrDlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties76 }
     *     
     */
    public StandingSettlementInstruction16 setOthrDlvrgSttlmPties(SettlementParties76 value) {
        this.othrDlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the othrRcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties76 }
     *     
     */
    public SettlementParties76 getOthrRcvgSttlmPties() {
        return othrRcvgSttlmPties;
    }

    /**
     * Sets the value of the othrRcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties76 }
     *     
     */
    public StandingSettlementInstruction16 setOthrRcvgSttlmPties(SettlementParties76 value) {
        this.othrRcvgSttlmPties = value;
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
