
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
 * Instruction for a change to an account status and reason for the change.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatusUpdateInstruction1", propOrder = {
    "updInstr",
    "updInstrRsn"
})
public class AccountStatusUpdateInstruction1 {

    @XmlElement(name = "UpdInstr", required = true)
    protected AccountStatusUpdateInstruction1Choice updInstr;
    @XmlElement(name = "UpdInstrRsn")
    protected AccountStatusUpdateInstructionReason1Choice updInstrRsn;

    /**
     * Gets the value of the updInstr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusUpdateInstruction1Choice }
     *     
     */
    public AccountStatusUpdateInstruction1Choice getUpdInstr() {
        return updInstr;
    }

    /**
     * Sets the value of the updInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusUpdateInstruction1Choice }
     *     
     */
    public AccountStatusUpdateInstruction1 setUpdInstr(AccountStatusUpdateInstruction1Choice value) {
        this.updInstr = value;
        return this;
    }

    /**
     * Gets the value of the updInstrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusUpdateInstructionReason1Choice }
     *     
     */
    public AccountStatusUpdateInstructionReason1Choice getUpdInstrRsn() {
        return updInstrRsn;
    }

    /**
     * Sets the value of the updInstrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusUpdateInstructionReason1Choice }
     *     
     */
    public AccountStatusUpdateInstruction1 setUpdInstrRsn(AccountStatusUpdateInstructionReason1Choice value) {
        this.updInstrRsn = value;
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
