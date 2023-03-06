
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
 * This message definition is intended for use with the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionStatusV05", propOrder = {
    "instrTp",
    "mtgRef",
    "finInstrmId",
    "instrTpSts",
    "splmtryData"
})
public class MeetingInstructionStatusV05 {

    @XmlElement(name = "InstrTp", required = true)
    protected InstructionType1Choice instrTp;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference7 mtgRef;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "InstrTpSts", required = true)
    protected InstructionTypeStatus2Choice instrTpSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public MeetingInstructionStatusV05 setInstrTp(InstructionType1Choice value) {
        this.instrTp = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference7 }
     *     
     */
    public MeetingReference7 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference7 }
     *     
     */
    public MeetingInstructionStatusV05 setMtgRef(MeetingReference7 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public MeetingInstructionStatusV05 setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the instrTpSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionTypeStatus2Choice }
     *     
     */
    public InstructionTypeStatus2Choice getInstrTpSts() {
        return instrTpSts;
    }

    /**
     * Sets the value of the instrTpSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionTypeStatus2Choice }
     *     
     */
    public MeetingInstructionStatusV05 setInstrTpSts(InstructionTypeStatus2Choice value) {
        this.instrTpSts = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MeetingInstructionStatusV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
