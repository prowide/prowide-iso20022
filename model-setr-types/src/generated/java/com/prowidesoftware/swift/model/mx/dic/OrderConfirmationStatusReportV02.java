
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
 * The OrderConfirmationStatusReport message is sent by an instructing party, for example, an investment manager or its authorised representative, to the executing party, for example, a transfer agent, to report the status of an order confirmation or an order confirmation amendment.
 * Usage
 * The OrderConfirmationStatusReport message is used to report on the status of one or more individual:
 * - subscription confirmations,
 * - subscription confirmation amendments,
 * - redemption confirmations,
 * - redemption confirmation amendments,
 * - switch order confirmations,
 * - switch order confirmation amendments.
 * One of the following statuses can be reported:
 * - confirmation rejected, or,
 * - amendment rejected, or,
 * - sent to next party, or,
 * - communication problem with next party, or,
 * - confirmation accepted, or,
 * - confirmation received.
 * It is likely that the OrderConfirmationStatusReport is only sent by the order instructing party to the order executing party to reject an order confirmation or to reject an order confirmation amendment, although if an intermediary party is used, the statuses sent to next party and communication problem with next party are also likely be used. The statuses confirmation accepted and confirmation received would only be used in the event the order executing party sends a RequestForOrderConfirmationStatusReport message and one of the other statuses does not apply.
 * If the status being reported is either confirmation rejected or amendment rejected, then a reason for the rejection must be given.
 * The individual order confirmation or confirmation amendment for which the status is given is identified with its order reference. The message identification of the message in which the individual order confirmation or confirmation amendment was conveyed may also be quoted in RelatedReference, but this is not recommended.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderConfirmationStatusReportV02", propOrder = {
    "msgId",
    "ref",
    "indvOrdrConfDtlsRpt",
    "xtnsn"
})
public class OrderConfirmationStatusReportV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "Ref")
    protected References61Choice ref;
    @XmlElement(name = "IndvOrdrConfDtlsRpt", required = true)
    protected List<IndividualOrderConfirmationStatusAndReason2> indvOrdrConfDtlsRpt;
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
    public OrderConfirmationStatusReportV02 setMsgId(MessageIdentification1 value) {
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
    public OrderConfirmationStatusReportV02 setRef(References61Choice value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the indvOrdrConfDtlsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvOrdrConfDtlsRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvOrdrConfDtlsRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualOrderConfirmationStatusAndReason2 }
     * 
     * 
     */
    public List<IndividualOrderConfirmationStatusAndReason2> getIndvOrdrConfDtlsRpt() {
        if (indvOrdrConfDtlsRpt == null) {
            indvOrdrConfDtlsRpt = new ArrayList<IndividualOrderConfirmationStatusAndReason2>();
        }
        return this.indvOrdrConfDtlsRpt;
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
     * Adds a new item to the indvOrdrConfDtlsRpt list.
     * @see #getIndvOrdrConfDtlsRpt()
     * 
     */
    public OrderConfirmationStatusReportV02 addIndvOrdrConfDtlsRpt(IndividualOrderConfirmationStatusAndReason2 indvOrdrConfDtlsRpt) {
        getIndvOrdrConfDtlsRpt().add(indvOrdrConfDtlsRpt);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public OrderConfirmationStatusReportV02 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
