
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
 * The MeetingInstructionStatus message is sent by an intermediary to the sender of an instruction to confirm the status of such an instruction. The message gives the status of a complete message or of one or more specific instructions within the message.
 * The message may also be sent by the issuer or the intermediary to confirm that a vote has been cast.
 * Usage
 * The MeetingInstructionStatus message is used for four purposes.
 * First, it is used to provide a global processing or rejection status of a MeetingInstruction message.
 * Second, it provides the status on the processing of a MeetingInstructionCancellationRequest message, for example, whether the request message is rejected or accepted.
 * Third, it is used to provide a detailed processing or rejection status of one or more instructions within the MeetingInstruction message, for example, for each instruction in the MeetingInstruction message the processing or rejection status is individually reported by using the SingleInstructionIdentification element. This identification allows the receiver of the status message to link the status confirmation to its original instruction.
 * Fourth, it is used to confirm that the related vote instruction has been confirmed as cast by the issuer or its agent.
 * This message definition is intended for use with the Business Application Header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionStatusV08", propOrder = {
    "instrTp",
    "mtgRef",
    "finInstrmId",
    "instrTpSts",
    "cnfrmgPty",
    "voteCstgPty",
    "rghtsHldr",
    "splmtryData"
})
public class MeetingInstructionStatusV08 {

    @XmlElement(name = "InstrTp", required = true)
    protected InstructionType2Choice instrTp;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference10 mtgRef;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "InstrTpSts", required = true)
    protected InstructionTypeStatus5Choice instrTpSts;
    @XmlElement(name = "CnfrmgPty", required = true)
    protected PartyIdentification226Choice cnfrmgPty;
    @XmlElement(name = "VoteCstgPty", required = true)
    protected PartyIdentification226Choice voteCstgPty;
    @XmlElement(name = "RghtsHldr")
    protected List<PartyIdentification237Choice> rghtsHldr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the instrTp property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionType2Choice }
     *     
     */
    public InstructionType2Choice getInstrTp() {
        return instrTp;
    }

    /**
     * Sets the value of the instrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionType2Choice }
     *     
     */
    public MeetingInstructionStatusV08 setInstrTp(InstructionType2Choice value) {
        this.instrTp = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference10 }
     *     
     */
    public MeetingReference10 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference10 }
     *     
     */
    public MeetingInstructionStatusV08 setMtgRef(MeetingReference10 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public MeetingInstructionStatusV08 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the instrTpSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionTypeStatus5Choice }
     *     
     */
    public InstructionTypeStatus5Choice getInstrTpSts() {
        return instrTpSts;
    }

    /**
     * Sets the value of the instrTpSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionTypeStatus5Choice }
     *     
     */
    public MeetingInstructionStatusV08 setInstrTpSts(InstructionTypeStatus5Choice value) {
        this.instrTpSts = value;
        return this;
    }

    /**
     * Gets the value of the cnfrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification226Choice }
     *     
     */
    public PartyIdentification226Choice getCnfrmgPty() {
        return cnfrmgPty;
    }

    /**
     * Sets the value of the cnfrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification226Choice }
     *     
     */
    public MeetingInstructionStatusV08 setCnfrmgPty(PartyIdentification226Choice value) {
        this.cnfrmgPty = value;
        return this;
    }

    /**
     * Gets the value of the voteCstgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification226Choice }
     *     
     */
    public PartyIdentification226Choice getVoteCstgPty() {
        return voteCstgPty;
    }

    /**
     * Sets the value of the voteCstgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification226Choice }
     *     
     */
    public MeetingInstructionStatusV08 setVoteCstgPty(PartyIdentification226Choice value) {
        this.voteCstgPty = value;
        return this;
    }

    /**
     * Gets the value of the rghtsHldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rghtsHldr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRghtsHldr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification237Choice }
     * 
     * 
     * @return
     *     The value of the rghtsHldr property.
     */
    public List<PartyIdentification237Choice> getRghtsHldr() {
        if (rghtsHldr == null) {
            rghtsHldr = new ArrayList<>();
        }
        return this.rghtsHldr;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the rghtsHldr list.
     * @see #getRghtsHldr()
     * 
     */
    public MeetingInstructionStatusV08 addRghtsHldr(PartyIdentification237Choice rghtsHldr) {
        getRghtsHldr().add(rghtsHldr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MeetingInstructionStatusV08 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
