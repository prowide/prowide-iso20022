
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
 * An executing party, for example, a transfer agent, sends the OrderCancellationStatusReport to the instructing party, for example, an investment manager or its authorised representative, to report the status of an order cancellation request that was previously received.
 * Usage
 * The OrderCancellationStatusReport message is used to provide the status of:
 * - one or more individual order cancellation requests by using IndividualCancellationStatusReport, or,
 * - an order cancellation request message by using CancellationStatusReport.
 * If the OrderCancellationStatusReport message is used to report the status of an individual order cancellation request, then the repetitive IndividualCancellationStatusReport sequence is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference.
 * If the OrderCancellationStatusReport message is used to report the status of an entire order cancellation request message, for example, the SubscriptionBulkOrderCancellationRequest, or a SubscriptionOrderCancellationRequest containing several orders, then the CancellationStatusReport sequence. is used and the message identification of the order cancellation request message is quoted in RelatedReference. All the order cancellation requests within the message must have the same status.
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
@XmlType(name = "OrderCancellationStatusReportV03", propOrder = {
    "msgId",
    "rltdRef",
    "othrRef",
    "cxlStsRpt",
    "indvCxlStsRpt",
    "xtnsn"
})
public class OrderCancellationStatusReportV03 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "RltdRef")
    protected List<AdditionalReference3> rltdRef;
    @XmlElement(name = "OthrRef")
    protected List<AdditionalReference3> othrRef;
    @XmlElement(name = "CxlStsRpt")
    protected OrderStatusAndReason8 cxlStsRpt;
    @XmlElement(name = "IndvCxlStsRpt")
    protected List<IndividualOrderStatusAndReason4> indvCxlStsRpt;
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
    public OrderCancellationStatusReportV03 setMsgId(MessageIdentification1 value) {
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
     * Gets the value of the cxlStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusAndReason8 }
     *     
     */
    public OrderStatusAndReason8 getCxlStsRpt() {
        return cxlStsRpt;
    }

    /**
     * Sets the value of the cxlStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusAndReason8 }
     *     
     */
    public OrderCancellationStatusReportV03 setCxlStsRpt(OrderStatusAndReason8 value) {
        this.cxlStsRpt = value;
        return this;
    }

    /**
     * Gets the value of the indvCxlStsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvCxlStsRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvCxlStsRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualOrderStatusAndReason4 }
     * 
     * 
     */
    public List<IndividualOrderStatusAndReason4> getIndvCxlStsRpt() {
        if (indvCxlStsRpt == null) {
            indvCxlStsRpt = new ArrayList<IndividualOrderStatusAndReason4>();
        }
        return this.indvCxlStsRpt;
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
    public OrderCancellationStatusReportV03 addRltdRef(AdditionalReference3 rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

    /**
     * Adds a new item to the othrRef list.
     * @see #getOthrRef()
     * 
     */
    public OrderCancellationStatusReportV03 addOthrRef(AdditionalReference3 othrRef) {
        getOthrRef().add(othrRef);
        return this;
    }

    /**
     * Adds a new item to the indvCxlStsRpt list.
     * @see #getIndvCxlStsRpt()
     * 
     */
    public OrderCancellationStatusReportV03 addIndvCxlStsRpt(IndividualOrderStatusAndReason4 indvCxlStsRpt) {
        getIndvCxlStsRpt().add(indvCxlStsRpt);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public OrderCancellationStatusReportV03 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
