
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
 * The Receiver of the MeetingInstruction or MeetingInstructionCancellationRequest sends the MeetingInstructionStatus message to the Sender of these messages.
 * The message gives the status of a complete message or of one or more specific instructions within the message.
 * Usage
 * The MeetingInstructionStatus message is used for four purposes.
 * First, it provides the status on the processing of a MeetingInstructionCancellationRequest message, ie, whether the request message is rejected or accepted.
 * Second, it is used to provide a global processing or rejection status of a MeetingInstruction message.
 * Third, it is used to provide a detailed processing or rejection status of a MeetingInstruction message, ie, for each instruction in the MeetingInstruction message the processing or rejection status is individually reported by using the InstructionIdentification element. This identification allows the receiver of the status message to link the status confirmation to its original instruction.
 * The blocking of securities should be confirmed via an MT 508 (Intra-Position Advice).
 * Fourth, it is used as a reminder to request voting instructions. This is done by indicating NONREF in the Identification element of the InstructionIdentification component and by using the status code NotReceived in the ProcessingStatus.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionStatusV02", propOrder = {
    "mtgInstrStsId",
    "instrId",
    "instrCxlId",
    "mtgRef",
    "rptgPty",
    "sctyId",
    "instrSts",
    "cxlSts"
})
public class MeetingInstructionStatusV02 {

    @XmlElement(name = "MtgInstrStsId", required = true)
    protected MessageIdentification1 mtgInstrStsId;
    @XmlElement(name = "InstrId")
    protected MessageIdentification instrId;
    @XmlElement(name = "InstrCxlId")
    protected MessageIdentification instrCxlId;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference3 mtgRef;
    @XmlElement(name = "RptgPty", required = true)
    protected PartyIdentification9Choice rptgPty;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification3 sctyId;
    @XmlElement(name = "InstrSts")
    protected InstructionStatus1Choice instrSts;
    @XmlElement(name = "CxlSts")
    protected CancellationStatus1Choice cxlSts;

    /**
     * Gets the value of the mtgInstrStsId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMtgInstrStsId() {
        return mtgInstrStsId;
    }

    /**
     * Sets the value of the mtgInstrStsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MeetingInstructionStatusV02 setMtgInstrStsId(MessageIdentification1 value) {
        this.mtgInstrStsId = value;
        return this;
    }

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public MeetingInstructionStatusV02 setInstrId(MessageIdentification value) {
        this.instrId = value;
        return this;
    }

    /**
     * Gets the value of the instrCxlId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getInstrCxlId() {
        return instrCxlId;
    }

    /**
     * Sets the value of the instrCxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public MeetingInstructionStatusV02 setInstrCxlId(MessageIdentification value) {
        this.instrCxlId = value;
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
    public MeetingInstructionStatusV02 setMtgRef(MeetingReference3 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public PartyIdentification9Choice getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public MeetingInstructionStatusV02 setRptgPty(PartyIdentification9Choice value) {
        this.rptgPty = value;
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
    public MeetingInstructionStatusV02 setSctyId(SecurityIdentification3 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the instrSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionStatus1Choice }
     *     
     */
    public InstructionStatus1Choice getInstrSts() {
        return instrSts;
    }

    /**
     * Sets the value of the instrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionStatus1Choice }
     *     
     */
    public MeetingInstructionStatusV02 setInstrSts(InstructionStatus1Choice value) {
        this.instrSts = value;
        return this;
    }

    /**
     * Gets the value of the cxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus1Choice }
     *     
     */
    public CancellationStatus1Choice getCxlSts() {
        return cxlSts;
    }

    /**
     * Sets the value of the cxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus1Choice }
     *     
     */
    public MeetingInstructionStatusV02 setCxlSts(CancellationStatus1Choice value) {
        this.cxlSts = value;
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
