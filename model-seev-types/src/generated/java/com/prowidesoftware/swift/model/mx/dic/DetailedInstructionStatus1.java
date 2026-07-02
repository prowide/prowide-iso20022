
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Status applying to individual instructions of a MeetingInstruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedInstructionStatus1", propOrder = {
    "instrId",
    "acctId",
    "subAcctId",
    "instrSts"
})
public class DetailedInstructionStatus1 {

    @XmlElement(name = "InstrId", required = true)
    protected String instrId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "SubAcctId")
    protected String subAcctId;
    @XmlElement(name = "InstrSts", required = true)
    protected InstructionStatus2Choice instrSts;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedInstructionStatus1 setInstrId(String value) {
        this.instrId = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedInstructionStatus1 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the subAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAcctId() {
        return subAcctId;
    }

    /**
     * Sets the value of the subAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedInstructionStatus1 setSubAcctId(String value) {
        this.subAcctId = value;
        return this;
    }

    /**
     * Gets the value of the instrSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionStatus2Choice }
     *     
     */
    public InstructionStatus2Choice getInstrSts() {
        return instrSts;
    }

    /**
     * Sets the value of the instrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionStatus2Choice }
     *     
     */
    public DetailedInstructionStatus1 setInstrSts(InstructionStatus2Choice value) {
        this.instrSts = value;
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
