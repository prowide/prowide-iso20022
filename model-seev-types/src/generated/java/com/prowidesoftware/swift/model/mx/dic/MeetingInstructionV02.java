
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * A party holding the right to vote sends the MeetingInstruction message to an intermediary, the issuer or its agent to request the receiving party to act upon one or several instructions.
 * Usage
 * The MeetingInstruction message is used to register for a shareholders meeting, request blocking or registration of securities. It is used to assign a proxy, to specify the names of meeting attendees and to relay vote instructions per resolution electronically.
 * The MeetingInstruction message may only be sent for one security, though several safekeeping places may be specified.
 * Once the message is sent, it cannot be modified. It must be cancelled by a MeetingInstructionCancellationRequest. Only after receipt of a confirmed cancelled status via the MeetingInstructionStatus message, a new MeetingInstruction message can be sent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionV02", propOrder = {
    "mtgInstrId",
    "mtgRef",
    "instgPty",
    "sctyId",
    "instr"
})
public class MeetingInstructionV02 {

    @XmlElement(name = "MtgInstrId", required = true)
    protected MessageIdentification1 mtgInstrId;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference3 mtgRef;
    @XmlElement(name = "InstgPty", required = true)
    protected PartyIdentification9Choice instgPty;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification3 sctyId;
    @XmlElement(name = "Instr", required = true)
    protected List<Instruction1> instr;

    /**
     * Gets the value of the mtgInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMtgInstrId() {
        return mtgInstrId;
    }

    /**
     * Sets the value of the mtgInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MeetingInstructionV02 setMtgInstrId(MessageIdentification1 value) {
        this.mtgInstrId = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference3 }
     *     
     */
    public MeetingReference3 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference3 }
     *     
     */
    public MeetingInstructionV02 setMtgRef(MeetingReference3 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the instgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public PartyIdentification9Choice getInstgPty() {
        return instgPty;
    }

    /**
     * Sets the value of the instgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public MeetingInstructionV02 setInstgPty(PartyIdentification9Choice value) {
        this.instgPty = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification3 }
     *     
     */
    public SecurityIdentification3 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification3 }
     *     
     */
    public MeetingInstructionV02 setSctyId(SecurityIdentification3 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the instr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instruction1 }
     * 
     * 
     */
    public List<Instruction1> getInstr() {
        if (instr == null) {
            instr = new ArrayList<Instruction1>();
        }
        return this.instr;
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

    /**
     * Adds a new item to the instr list.
     * @see #getInstr()
     * 
     */
    public MeetingInstructionV02 addInstr(Instruction1 instr) {
        getInstr().add(instr);
        return this;
    }

}
