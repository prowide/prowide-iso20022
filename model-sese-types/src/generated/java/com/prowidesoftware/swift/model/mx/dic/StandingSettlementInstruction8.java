
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
@XmlType(name = "StandingSettlementInstruction8", propOrder = {
    "sttlmStgInstrDB",
    "ctrPty",
    "vndr",
    "othrDlvrgSttlmPties",
    "othrRcvgSttlmPties"
})
public class StandingSettlementInstruction8 {

    @XmlElement(name = "SttlmStgInstrDB", required = true)
    protected SettlementStandingInstructionDatabase2Choice sttlmStgInstrDB;
    @XmlElement(name = "CtrPty", required = true)
    protected Counterparty8Choice ctrPty;
    @XmlElement(name = "Vndr")
    protected PartyIdentification65Choice vndr;
    @XmlElement(name = "OthrDlvrgSttlmPties")
    protected SettlementParties20 othrDlvrgSttlmPties;
    @XmlElement(name = "OthrRcvgSttlmPties")
    protected SettlementParties20 othrRcvgSttlmPties;

    /**
     * Gets the value of the sttlmStgInstrDB property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStandingInstructionDatabase2Choice }
     *     
     */
    public SettlementStandingInstructionDatabase2Choice getSttlmStgInstrDB() {
        return sttlmStgInstrDB;
    }

    /**
     * Sets the value of the sttlmStgInstrDB property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStandingInstructionDatabase2Choice }
     *     
     */
    public StandingSettlementInstruction8 setSttlmStgInstrDB(SettlementStandingInstructionDatabase2Choice value) {
        this.sttlmStgInstrDB = value;
        return this;
    }

    /**
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty8Choice }
     *     
     */
    public Counterparty8Choice getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty8Choice }
     *     
     */
    public StandingSettlementInstruction8 setCtrPty(Counterparty8Choice value) {
        this.ctrPty = value;
        return this;
    }

    /**
     * Gets the value of the vndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification65Choice }
     *     
     */
    public PartyIdentification65Choice getVndr() {
        return vndr;
    }

    /**
     * Sets the value of the vndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification65Choice }
     *     
     */
    public StandingSettlementInstruction8 setVndr(PartyIdentification65Choice value) {
        this.vndr = value;
        return this;
    }

    /**
     * Gets the value of the othrDlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties20 }
     *     
     */
    public SettlementParties20 getOthrDlvrgSttlmPties() {
        return othrDlvrgSttlmPties;
    }

    /**
     * Sets the value of the othrDlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties20 }
     *     
     */
    public StandingSettlementInstruction8 setOthrDlvrgSttlmPties(SettlementParties20 value) {
        this.othrDlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the othrRcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties20 }
     *     
     */
    public SettlementParties20 getOthrRcvgSttlmPties() {
        return othrRcvgSttlmPties;
    }

    /**
     * Sets the value of the othrRcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties20 }
     *     
     */
    public StandingSettlementInstruction8 setOthrRcvgSttlmPties(SettlementParties20 value) {
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
