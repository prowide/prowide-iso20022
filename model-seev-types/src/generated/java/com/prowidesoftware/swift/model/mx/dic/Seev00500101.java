
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
 * Scope
 * The MeetingInstructionCancellationRequest message is sent to request the cancellation of a MeetingInstruction message previously sent by the sender of the message. It requests the cancellation of all instructions included in the original message.
 * Usage
 * This message must be answered by a MeetingInstructionStatus. Some instructions in the message may have been already executed and cannot be cancelled. This information should appear clearly in the status message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seev.005.001.01", propOrder = {
    "instrCxlId",
    "prvsRef",
    "mtgRef",
    "rqstngPty",
    "scty"
})
public class Seev00500101 {

    @XmlElement(name = "InstrCxlId", required = true)
    protected InstructionIdentification instrCxlId;
    @XmlElement(name = "PrvsRef", required = true)
    protected InstructionIdentification prvsRef;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference1 mtgRef;
    @XmlElement(name = "RqstngPty", required = true)
    protected PartyIdentification7Choice rqstngPty;
    @XmlElement(name = "Scty", required = true)
    protected SecurityPosition scty;

    /**
     * Gets the value of the instrCxlId property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIdentification }
     *     
     */
    public InstructionIdentification getInstrCxlId() {
        return instrCxlId;
    }

    /**
     * Sets the value of the instrCxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIdentification }
     *     
     */
    public Seev00500101 setInstrCxlId(InstructionIdentification value) {
        this.instrCxlId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIdentification }
     *     
     */
    public InstructionIdentification getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIdentification }
     *     
     */
    public Seev00500101 setPrvsRef(InstructionIdentification value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference1 }
     *     
     */
    public MeetingReference1 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference1 }
     *     
     */
    public Seev00500101 setMtgRef(MeetingReference1 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the rqstngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public PartyIdentification7Choice getRqstngPty() {
        return rqstngPty;
    }

    /**
     * Sets the value of the rqstngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public Seev00500101 setRqstngPty(PartyIdentification7Choice value) {
        this.rqstngPty = value;
        return this;
    }

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityPosition }
     *     
     */
    public SecurityPosition getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityPosition }
     *     
     */
    public Seev00500101 setScty(SecurityPosition value) {
        this.scty = value;
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
