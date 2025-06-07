
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
 * The OrderCancellationStatusReport message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to report the status of an order cancellation request that was previously received.
 * Usage
 * The OrderCancellationStatusReport message is used to provide the status of:
 * - one or more individual order cancellation requests by using IndividualCancellationStatusReport, or,
 * - an order cancellation request message by using CancellationStatusReport.
 * If the OrderCancellationStatusReport message is used to report the status of an individual order cancellation request, then the repetitive IndividualCancellationStatusReport sequence is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference but this is not recommended.
 * If the OrderCancellationStatusReport message is used to report the status of an entire order cancellation request message, for example, the SubscriptionBulkOrderCancellationRequest, or a SubscriptionOrderCancellationRequest containing several orders, then the CancellationStatusReport sequence is used. The message identification of the order cancellation request message may also be quoted in RelatedReference but this is not recommended. All the order cancellation requests within the message must have the same status.
 * One of the following statuses can be reported: 
 * - the order cancellation is pending, or,
 * - the order cancellation request is rejected, or,
 * - the order is cancelled.
 * When the cancellation is rejected, the reason for the rejection must be specified.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCancellationStatusReportV04", propOrder = {
    "msgId",
    "ref",
    "stsRpt",
    "xtnsn"
})
public class OrderCancellationStatusReportV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "Ref")
    protected References61Choice ref;
    @XmlElement(name = "StsRpt", required = true)
    protected Status26Choice stsRpt;
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
    public OrderCancellationStatusReportV04 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References61Choice }
     *     
     */
    public References61Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References61Choice }
     *     
     */
    public OrderCancellationStatusReportV04 setRef(References61Choice value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the stsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link Status26Choice }
     *     
     */
    public Status26Choice getStsRpt() {
        return stsRpt;
    }

    /**
     * Sets the value of the stsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status26Choice }
     *     
     */
    public OrderCancellationStatusReportV04 setStsRpt(Status26Choice value) {
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
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public OrderCancellationStatusReportV04 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
