
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
 * An executing party, eg, a transfer agent, sends the TransferInstructionStatusReport message to the instructing party, eg, an investment manager or one of its authorised representatives to provide the status of a previously received transfer instruction.
 * Usage
 * The TransferInstructionStatusReport message is used to report on the status of a transfer in or transfer out instruction. The reference of the transfer instruction for which the status is reported is identified in TransferReference.
 * The message identification of the transfer instruction message in which the transfer instruction was conveyed may also be quoted in RelatedReference.
 * One of the following statuses can be reported:
 * - an accepted status, or,
 * - an already executed status, or,
 * - a sent to next party status, or,
 * - a matched status, or,
 * - a settled status, or,
 * - a pending settlement status and the reason for the status, or,
 * - an unmatched status and the reason for the status, or,
 * - an in-repair status and the reason for the status, or,
 * - a rejected status and the reason for the status, or,
 * - a failed settlement status and the reason for the status, or,
 * - a cancelled status and the reason for the status, or,
 * - a cancelled status and the reason for the status, or,
 * - a cancellation pending status and the reason for the status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferInstructionStatusReportV02", propOrder = {
    "msgId",
    "rltdRef",
    "othrRef",
    "stsRpt",
    "xtnsn"
})
public class TransferInstructionStatusReportV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "RltdRef")
    protected List<AdditionalReference3> rltdRef;
    @XmlElement(name = "OthrRef")
    protected List<AdditionalReference3> othrRef;
    @XmlElement(name = "StsRpt", required = true)
    protected TransferStatusAndReason2 stsRpt;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public TransferInstructionStatusReportV02 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference3 }
     * 
     * 
     */
    public List<AdditionalReference3> getRltdRef() {
        if (rltdRef == null) {
            rltdRef = new ArrayList<AdditionalReference3>();
        }
        return this.rltdRef;
    }

    /**
     * Gets the value of the othrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference3 }
     * 
     * 
     */
    public List<AdditionalReference3> getOthrRef() {
        if (othrRef == null) {
            othrRef = new ArrayList<AdditionalReference3>();
        }
        return this.othrRef;
    }

    /**
     * Gets the value of the stsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TransferStatusAndReason2 }
     *     
     */
    public TransferStatusAndReason2 getStsRpt() {
        return stsRpt;
    }

    /**
     * Sets the value of the stsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferStatusAndReason2 }
     *     
     */
    public TransferInstructionStatusReportV02 setStsRpt(TransferStatusAndReason2 value) {
        this.stsRpt = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
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
     * {@link Extension1 }
     * 
     * 
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
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
     * Adds a new item to the rltdRef list.
     * @see #getRltdRef()
     * 
     */
    public TransferInstructionStatusReportV02 addRltdRef(AdditionalReference3 rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

    /**
     * Adds a new item to the othrRef list.
     * @see #getOthrRef()
     * 
     */
    public TransferInstructionStatusReportV02 addOthrRef(AdditionalReference3 othrRef) {
        getOthrRef().add(othrRef);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public TransferInstructionStatusReportV02 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
