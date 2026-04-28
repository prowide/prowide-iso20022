
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * The MeetingInstructionCancellationRequest message is sent by the same party that sent the MeetingInstruction message. It is sent to request the cancellation of all instructions included in the original the MeetingInstruction message.
 * Usage
 * This message must be answered by a MeetingInstructionStatus message. Some instructions in the previously sent MeetingInstruction message may have already been executed and cannot be cancelled. This information should appear clearly in the status message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionCancellationRequestV02", propOrder = {
    "instrCxlId",
    "prvsRef",
    "mtgRef",
    "rqstngPty",
    "sctyId",
    "instdPos"
})
public class MeetingInstructionCancellationRequestV02 {

    @XmlElement(name = "InstrCxlId", required = true)
    protected MessageIdentification1 instrCxlId;
    @XmlElement(name = "PrvsRef", required = true)
    protected MessageIdentification prvsRef;
    @XmlElement(name = "MtgRef")
    protected MeetingReference3 mtgRef;
    @XmlElement(name = "RqstngPty")
    protected PartyIdentification9Choice rqstngPty;
    @XmlElement(name = "SctyId")
    protected SecurityIdentification3 sctyId;
    @XmlElement(name = "InstdPos")
    protected List<SafekeepingAccount3> instdPos;

    /**
     * Gets the value of the instrCxlId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getInstrCxlId() {
        return instrCxlId;
    }

    /**
     * Sets the value of the instrCxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MeetingInstructionCancellationRequestV02 setInstrCxlId(MessageIdentification1 value) {
        this.instrCxlId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public MeetingInstructionCancellationRequestV02 setPrvsRef(MessageIdentification value) {
        this.prvsRef = value;
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
    public MeetingInstructionCancellationRequestV02 setMtgRef(MeetingReference3 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the rqstngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public PartyIdentification9Choice getRqstngPty() {
        return rqstngPty;
    }

    /**
     * Sets the value of the rqstngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public MeetingInstructionCancellationRequestV02 setRqstngPty(PartyIdentification9Choice value) {
        this.rqstngPty = value;
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
    public MeetingInstructionCancellationRequestV02 setSctyId(SecurityIdentification3 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the instdPos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instdPos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstdPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafekeepingAccount3 }
     * 
     * 
     */
    public List<SafekeepingAccount3> getInstdPos() {
        if (instdPos == null) {
            instdPos = new ArrayList<SafekeepingAccount3>();
        }
        return this.instdPos;
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
     * Adds a new item to the instdPos list.
     * @see #getInstdPos()
     * 
     */
    public MeetingInstructionCancellationRequestV02 addInstdPos(SafekeepingAccount3 instdPos) {
        getInstdPos().add(instdPos);
        return this;
    }

}
