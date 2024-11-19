
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
 * Scope
 * The MeetingInstructionStatus message is sent to notify the status of a message (Meeting Instruction or MeetingInstructionCancellationRequest) or the status of one or more specific instructions (meeting registration, voting instructions, proxy assignment, meeting attendance, securities blocking, securities registration). It is sent by the receiver of the MeetingInstruction message to the sender.
 * Usage
 * The MeetingInstructionStatus message may be used for three purposes.
 * First, it may provide the status on the processing of a message, ie whether the message is rejected, cancelled, accepted or processed.
 * Second, it may be used to provide a detailed status per instruction. Each instruction in the MeetingInstruction message must have an identification. This identification allows the receiver of the status message to link the status confirmation to its original instruction. The processing or the rejection status of each individual instruction is reported in the confirmation components of the MeetingInstructionStatus.
 * The Blocking of securities should be confirmed via an MT 508.
 * Third, it may be used as a reminder to request voting instructions by indicating NONREF in the RelatedReference component and NotReceived in the ProcessingStatus component.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seev.006.001.01", propOrder = {
    "mtgInstrStsId",
    "rltdRef",
    "mtgRef",
    "rptgPty",
    "scty",
    "gblSts",
    "dtldSts"
})
public class Seev00600101 {

    @XmlElement(name = "MtgInstrStsId", required = true)
    protected InstructionIdentification mtgInstrStsId;
    @XmlElement(name = "RltdRef", required = true)
    protected InstructionIdentification rltdRef;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference1 mtgRef;
    @XmlElement(name = "RptgPty", required = true)
    protected PartyIdentification7Choice rptgPty;
    @XmlElement(name = "Scty", required = true)
    protected SecurityIdentification3 scty;
    @XmlElement(name = "GblSts")
    protected MeetingInstructionGlobalStatus gblSts;
    @XmlElement(name = "DtldSts")
    protected MeetingInstructionDetailedStatus dtldSts;

    /**
     * Gets the value of the mtgInstrStsId property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIdentification }
     *     
     */
    public InstructionIdentification getMtgInstrStsId() {
        return mtgInstrStsId;
    }

    /**
     * Sets the value of the mtgInstrStsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIdentification }
     *     
     */
    public Seev00600101 setMtgInstrStsId(InstructionIdentification value) {
        this.mtgInstrStsId = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIdentification }
     *     
     */
    public InstructionIdentification getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIdentification }
     *     
     */
    public Seev00600101 setRltdRef(InstructionIdentification value) {
        this.rltdRef = value;
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
    public Seev00600101 setMtgRef(MeetingReference1 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public PartyIdentification7Choice getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public Seev00600101 setRptgPty(PartyIdentification7Choice value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification3 }
     *     
     */
    public SecurityIdentification3 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification3 }
     *     
     */
    public Seev00600101 setScty(SecurityIdentification3 value) {
        this.scty = value;
        return this;
    }

    /**
     * Gets the value of the gblSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionGlobalStatus }
     *     
     */
    public MeetingInstructionGlobalStatus getGblSts() {
        return gblSts;
    }

    /**
     * Sets the value of the gblSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionGlobalStatus }
     *     
     */
    public Seev00600101 setGblSts(MeetingInstructionGlobalStatus value) {
        this.gblSts = value;
        return this;
    }

    /**
     * Gets the value of the dtldSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionDetailedStatus }
     *     
     */
    public MeetingInstructionDetailedStatus getDtldSts() {
        return dtldSts;
    }

    /**
     * Sets the value of the dtldSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionDetailedStatus }
     *     
     */
    public Seev00600101 setDtldSts(MeetingInstructionDetailedStatus value) {
        this.dtldSts = value;
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
