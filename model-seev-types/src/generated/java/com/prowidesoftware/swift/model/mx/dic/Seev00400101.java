
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
 * The MeetingInstruction message is sent to request that the receiving party act on one or several instructions.
 * It is sent to request blocking or registration of securities, to register to a meeting, to instruct votes, to assign a proxy, to specify the names of meeting attendees.
 * It may be sent by a security holder (bearer or registered) or by a party holding the right to vote to an intermediary, or to the issuer or its agent. It may also contains instructions relayed by an intermediary to another intermediary or to the issuer or its agent.
 * Usage
 * The MeetingInstruction message may only be sent for one security, though several safekeeping places may be specified.
 * Once the information is sent, it cannot be modified by an update message but must be cancelled by a MeetingInstructionCancellationRequest. After receipt of a cancelled status, a new MeetingInstruction message should be resent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seev.004.001.01", propOrder = {
    "mtgInstrId",
    "mtgRef",
    "instgPty",
    "sctyPos"
})
public class Seev00400101 {

    @XmlElement(name = "MtgInstrId", required = true)
    protected InstructionIdentification mtgInstrId;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference1 mtgRef;
    @XmlElement(name = "InstgPty", required = true)
    protected PartyIdentification7Choice instgPty;
    @XmlElement(name = "SctyPos", required = true)
    protected SecurityPosition1 sctyPos;

    /**
     * Gets the value of the mtgInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIdentification }
     *     
     */
    public InstructionIdentification getMtgInstrId() {
        return mtgInstrId;
    }

    /**
     * Sets the value of the mtgInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIdentification }
     *     
     */
    public Seev00400101 setMtgInstrId(InstructionIdentification value) {
        this.mtgInstrId = value;
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
    public Seev00400101 setMtgRef(MeetingReference1 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the instgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public PartyIdentification7Choice getInstgPty() {
        return instgPty;
    }

    /**
     * Sets the value of the instgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public Seev00400101 setInstgPty(PartyIdentification7Choice value) {
        this.instgPty = value;
        return this;
    }

    /**
     * Gets the value of the sctyPos property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityPosition1 }
     *     
     */
    public SecurityPosition1 getSctyPos() {
        return sctyPos;
    }

    /**
     * Sets the value of the sctyPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityPosition1 }
     *     
     */
    public Seev00400101 setSctyPos(SecurityPosition1 value) {
        this.sctyPos = value;
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
