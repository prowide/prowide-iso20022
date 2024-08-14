
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
 * Provides details on the payment instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstruction33", propOrder = {
    "instr",
    "tp",
    "prty",
    "prcgVldtyTm"
})
public class PaymentInstruction33 {

    @XmlElement(name = "Instr")
    @XmlSchemaType(name = "string")
    protected Instruction1Code instr;
    @XmlElement(name = "Tp")
    protected PaymentType4Choice tp;
    @XmlElement(name = "Prty")
    protected Priority1Choice prty;
    @XmlElement(name = "PrcgVldtyTm")
    protected DateTimePeriod1Choice prcgVldtyTm;

    /**
     * Gets the value of the instr property.
     * 
     * @return
     *     possible object is
     *     {@link Instruction1Code }
     *     
     */
    public Instruction1Code getInstr() {
        return instr;
    }

    /**
     * Sets the value of the instr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instruction1Code }
     *     
     */
    public PaymentInstruction33 setInstr(Instruction1Code value) {
        this.instr = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType4Choice }
     *     
     */
    public PaymentType4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType4Choice }
     *     
     */
    public PaymentInstruction33 setTp(PaymentType4Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority1Choice }
     *     
     */
    public Priority1Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority1Choice }
     *     
     */
    public PaymentInstruction33 setPrty(Priority1Choice value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the prcgVldtyTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getPrcgVldtyTm() {
        return prcgVldtyTm;
    }

    /**
     * Sets the value of the prcgVldtyTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public PaymentInstruction33 setPrcgVldtyTm(DateTimePeriod1Choice value) {
        this.prcgVldtyTm = value;
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
