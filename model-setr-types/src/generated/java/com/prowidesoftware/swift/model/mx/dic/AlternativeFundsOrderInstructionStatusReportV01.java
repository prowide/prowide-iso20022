
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
 * An executing party, for example, a transfer agent or administrator, sends the AlternativeFundsOrderInstructionStatusReport to the instructing party, for example, an investment manager, custodian or its authorised representative to report the status of an order from the time the executing party receives the order until the time the order is executed.
 * There may be one or more parties between the executing party and the instructing party.
 * Usage
 * The AlternativeFundsOrderInstructionStatusReport message is used to report on the status of a AlternativeFundsSubscriptionOrder or AlternativeFundsRedemptionOrder.
 * One of the following statuses can be reported:
 * - an already executed status (COSE), or,
 * - a communication problem with next party status (CPNP), or,
 * - a cash settled order not executed (CSNE) status, or,
 * - an accepted status (PACK, or,
 * - a received status (RECE), or
 * - a settled status (SETT), or,
 * - or, a sent to next party status (STNP), or,
 * - a cancelled status, or
 * - a conditionally accepted status, or,
 * - a rejected status, or,
 * - a suspended status, or,
 * - a partially settled status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeFundsOrderInstructionStatusReportV01", propOrder = {
    "msgId",
    "rltdRef",
    "ordrDtlsRpt",
    "cpyDtls",
    "xtnsn"
})
public class AlternativeFundsOrderInstructionStatusReportV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference4 rltdRef;
    @XmlElement(name = "OrdrDtlsRpt", required = true)
    protected IndividualOrderStatusAndReason3 ordrDtlsRpt;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation2 cpyDtls;
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
    public AlternativeFundsOrderInstructionStatusReportV01 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference4 }
     *     
     */
    public AdditionalReference4 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference4 }
     *     
     */
    public AlternativeFundsOrderInstructionStatusReportV01 setRltdRef(AdditionalReference4 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtlsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualOrderStatusAndReason3 }
     *     
     */
    public IndividualOrderStatusAndReason3 getOrdrDtlsRpt() {
        return ordrDtlsRpt;
    }

    /**
     * Sets the value of the ordrDtlsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualOrderStatusAndReason3 }
     *     
     */
    public AlternativeFundsOrderInstructionStatusReportV01 setOrdrDtlsRpt(IndividualOrderStatusAndReason3 value) {
        this.ordrDtlsRpt = value;
        return this;
    }

    /**
     * Gets the value of the cpyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CopyInformation2 }
     *     
     */
    public CopyInformation2 getCpyDtls() {
        return cpyDtls;
    }

    /**
     * Sets the value of the cpyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyInformation2 }
     *     
     */
    public AlternativeFundsOrderInstructionStatusReportV01 setCpyDtls(CopyInformation2 value) {
        this.cpyDtls = value;
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
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AlternativeFundsOrderInstructionStatusReportV01 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
