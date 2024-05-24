
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
 * The Receiver of the MeetingInstruction or MeetingInstructionCancellationRequest sends the MeetingInstructionStatus message to the Sender of these messages.
 * The message gives the status of a complete message or of one or more specific instructions within the message.
 * Usage
 * The MeetingInstructionStatus message is used for four purposes.
 * First, it provides the status on the processing of a MeetingInstructionCancellationRequest message, for example, whether the request message is rejected or accepted.
 * Second, it is used to provide a global processing or rejection status of a MeetingInstruction message.
 * Third, it is used to provide a detailed processing or rejection status of a MeetingInstruction message, for example, for each instruction in the MeetingInstruction message the processing or rejection status is individually reported by using the InstructionIdentification element. This identification allows the receiver of the status message to link the status confirmation to its original instruction.
 * The blocking of securities should be confirmed via an MT 508 (Intra-Position Advice).
 * Fourth, it is used as a reminder to request voting instructions. This is done by indicating NONREF in the Identification element of the InstructionIdentification component and by using the status code NotReceived in the ProcessingStatus.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionStatusV04", propOrder = {
    "id",
    "instrTp",
    "mtgRef",
    "rptgPty",
    "sctyId",
    "instrTpSts",
    "xtnsn"
})
public class MeetingInstructionStatusV04 {

    @XmlElement(name = "Id", required = true)
    protected MessageIdentification1 id;
    @XmlElement(name = "InstrTp", required = true)
    protected InstructionType1Choice instrTp;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference4 mtgRef;
    @XmlElement(name = "RptgPty", required = true)
    protected PartyIdentification9Choice rptgPty;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification11 sctyId;
    @XmlElement(name = "InstrTpSts", required = true)
    protected InstructionTypeStatus1Choice instrTpSts;
    @XmlElement(name = "Xtnsn")
    protected List<Extension2> xtnsn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MeetingInstructionStatusV04 setId(MessageIdentification1 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the instrTp property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionType1Choice }
     *     
     */
    public InstructionType1Choice getInstrTp() {
        return instrTp;
    }

    /**
     * Sets the value of the instrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionType1Choice }
     *     
     */
    public MeetingInstructionStatusV04 setInstrTp(InstructionType1Choice value) {
        this.instrTp = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference4 }
     *     
     */
    public MeetingReference4 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference4 }
     *     
     */
    public MeetingInstructionStatusV04 setMtgRef(MeetingReference4 value) {
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
    public MeetingInstructionStatusV04 setRptgPty(PartyIdentification9Choice value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification11 }
     *     
     */
    public SecurityIdentification11 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification11 }
     *     
     */
    public MeetingInstructionStatusV04 setSctyId(SecurityIdentification11 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the instrTpSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionTypeStatus1Choice }
     *     
     */
    public InstructionTypeStatus1Choice getInstrTpSts() {
        return instrTpSts;
    }

    /**
     * Sets the value of the instrTpSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionTypeStatus1Choice }
     *     
     */
    public MeetingInstructionStatusV04 setInstrTpSts(InstructionTypeStatus1Choice value) {
        this.instrTpSts = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension2 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension2> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
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
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public MeetingInstructionStatusV04 addXtnsn(Extension2 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
