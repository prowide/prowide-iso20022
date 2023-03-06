
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
 * An executing party, for example, a transfer agent, sends the OrderInstructionStatusReport to the instructing party, for example, an investment manager or its authorised representative to report the status of an order from the time the executing party receives the order until the time the order is executed.
 * Usage
 * The OrderInstructionStatusReport message is used to report on the status of a subscription, redemption or a switch order.
 * The OrderInstructionStatusReport message may be used to give the status of:
 * - one order message by using OrderDetailsReport or,
 * - one or more individual order instructions by using IndividualOrderDetailsReport, or
 * - one or more switch orders by using SwitchOrderDetailsReport.
 * If the OrderInstructionStatusReport message is used to report the status of an individual order, then IndividualOrderDetailsReport is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference.
 * If the OrderInstructionStatusReport message is used to report the status of a switch order, then SwitchOrderDetailsReport is used and the order reference of the switch order is quoted in OrderReference. The message identification of the message in which the switch order was conveyed may also be quoted in RelatedReference.
 * If the OrderInstructionStatusReport message is used to report the status of an entire order message, for example, the SubscriptionBulkOrder, or a SubscriptionOrder containing several orders, then OrderDetailsReport is used and the message identification of the order message is quoted in RelatedReference. All the orders within the message must have the same status.
 * One of the following statuses can be reported:
 * - an accepted status, or,
 * - an already executed status, or,
 * - a sent to next party status, or,
 * - a received status, or,
 * - a settled status, or,
 * - a communication problem with next party status, or,
 * - a confirmation amendment status, or,
 * - a done for the day status, or,
 * - a partially done status, or,
 * - an open status, or,
 * - a cancelled status, or
 * - a conditionally accepted status, or,
 * - a rejected status, or,
 * - a suspended status, or,
 * - a partially settled status, or,
 * - an in-repair status (only for an individual or switch order).
 * For a switch order, the OrderInstructionStatusReport message provides the status of the whole switch order, that is, it is not possible to accept one leg and to reject the other leg: the entire switch order has to be rejected. In order to identify the legs within the switch that are causing the problem, the leg is identified in either the RedemptionLegIdentification or SubscriptionLegIdentification elements.
 * When the OrderInstructionStatusReport is used to give the status of an individual or a switch order, the following can be specified:
 * - repaired conditions (for a switch, this is at the level of a leg),
 * - information related to the order, for example, settlement amount, number of units, expected trade date, etc.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInstructionStatusReportV03", propOrder = {
    "msgId",
    "othrRef",
    "rltdRef",
    "ordrDtlsRpt",
    "indvOrdrDtlsRpt",
    "swtchOrdrDtlsRpt",
    "xtnsn"
})
public class OrderInstructionStatusReportV03 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "OthrRef")
    protected List<AdditionalReference3> othrRef;
    @XmlElement(name = "RltdRef")
    protected List<AdditionalReference3> rltdRef;
    @XmlElement(name = "OrdrDtlsRpt")
    protected OrderStatusAndReason7 ordrDtlsRpt;
    @XmlElement(name = "IndvOrdrDtlsRpt")
    protected List<IndividualOrderStatusAndReason2> indvOrdrDtlsRpt;
    @XmlElement(name = "SwtchOrdrDtlsRpt")
    protected List<SwitchOrderStatusAndReason1> swtchOrdrDtlsRpt;
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
    public OrderInstructionStatusReportV03 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
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
     * Gets the value of the ordrDtlsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusAndReason7 }
     *     
     */
    public OrderStatusAndReason7 getOrdrDtlsRpt() {
        return ordrDtlsRpt;
    }

    /**
     * Sets the value of the ordrDtlsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusAndReason7 }
     *     
     */
    public OrderInstructionStatusReportV03 setOrdrDtlsRpt(OrderStatusAndReason7 value) {
        this.ordrDtlsRpt = value;
        return this;
    }

    /**
     * Gets the value of the indvOrdrDtlsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvOrdrDtlsRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvOrdrDtlsRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualOrderStatusAndReason2 }
     * 
     * 
     */
    public List<IndividualOrderStatusAndReason2> getIndvOrdrDtlsRpt() {
        if (indvOrdrDtlsRpt == null) {
            indvOrdrDtlsRpt = new ArrayList<IndividualOrderStatusAndReason2>();
        }
        return this.indvOrdrDtlsRpt;
    }

    /**
     * Gets the value of the swtchOrdrDtlsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swtchOrdrDtlsRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwtchOrdrDtlsRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchOrderStatusAndReason1 }
     * 
     * 
     */
    public List<SwitchOrderStatusAndReason1> getSwtchOrdrDtlsRpt() {
        if (swtchOrdrDtlsRpt == null) {
            swtchOrdrDtlsRpt = new ArrayList<SwitchOrderStatusAndReason1>();
        }
        return this.swtchOrdrDtlsRpt;
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
     * Adds a new item to the othrRef list.
     * @see #getOthrRef()
     * 
     */
    public OrderInstructionStatusReportV03 addOthrRef(AdditionalReference3 othrRef) {
        getOthrRef().add(othrRef);
        return this;
    }

    /**
     * Adds a new item to the rltdRef list.
     * @see #getRltdRef()
     * 
     */
    public OrderInstructionStatusReportV03 addRltdRef(AdditionalReference3 rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

    /**
     * Adds a new item to the indvOrdrDtlsRpt list.
     * @see #getIndvOrdrDtlsRpt()
     * 
     */
    public OrderInstructionStatusReportV03 addIndvOrdrDtlsRpt(IndividualOrderStatusAndReason2 indvOrdrDtlsRpt) {
        getIndvOrdrDtlsRpt().add(indvOrdrDtlsRpt);
        return this;
    }

    /**
     * Adds a new item to the swtchOrdrDtlsRpt list.
     * @see #getSwtchOrdrDtlsRpt()
     * 
     */
    public OrderInstructionStatusReportV03 addSwtchOrdrDtlsRpt(SwitchOrderStatusAndReason1 swtchOrdrDtlsRpt) {
        getSwtchOrdrDtlsRpt().add(swtchOrdrDtlsRpt);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public OrderInstructionStatusReportV03 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
