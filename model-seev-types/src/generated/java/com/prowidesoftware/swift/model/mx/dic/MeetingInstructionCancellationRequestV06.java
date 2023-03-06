
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
 * The MeetingInstructionCancellationRequest message is sent by the same party that sent the
 * MeetingInstruction message. It is sent to request the cancellation of one, some or all of the instructions included in the original MeetingInstruction message.
 * Usage
 * This message must be answered by a MeetingInstructionStatus message. 
 * This message definition is intended for use with the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionCancellationRequestV06", propOrder = {
    "mtgInstrId",
    "mtgRef",
    "finInstrmId",
    "toBeCancInstr",
    "splmtryData"
})
public class MeetingInstructionCancellationRequestV06 {

    @XmlElement(name = "MtgInstrId", required = true)
    protected String mtgInstrId;
    @XmlElement(name = "MtgRef")
    protected MeetingReference8 mtgRef;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "ToBeCancInstr")
    protected List<CancelInstruction1> toBeCancInstr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the mtgInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtgInstrId() {
        return mtgInstrId;
    }

    /**
     * Sets the value of the mtgInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingInstructionCancellationRequestV06 setMtgInstrId(String value) {
        this.mtgInstrId = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference8 }
     *     
     */
    public MeetingReference8 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference8 }
     *     
     */
    public MeetingInstructionCancellationRequestV06 setMtgRef(MeetingReference8 value) {
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
    public MeetingInstructionCancellationRequestV06 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the toBeCancInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toBeCancInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToBeCancInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelInstruction1 }
     * 
     * 
     */
    public List<CancelInstruction1> getToBeCancInstr() {
        if (toBeCancInstr == null) {
            toBeCancInstr = new ArrayList<CancelInstruction1>();
        }
        return this.toBeCancInstr;
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
     * Adds a new item to the toBeCancInstr list.
     * @see #getToBeCancInstr()
     * 
     */
    public MeetingInstructionCancellationRequestV06 addToBeCancInstr(CancelInstruction1 toBeCancInstr) {
        getToBeCancInstr().add(toBeCancInstr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MeetingInstructionCancellationRequestV06 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
