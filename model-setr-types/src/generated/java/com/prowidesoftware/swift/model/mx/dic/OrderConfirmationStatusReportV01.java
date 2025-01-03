
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
 * An instructing party, for example, an investment manager or its authorised representative, sends the OrderConfirmationStatusReport message to the executing party, for example, a transfer agent, to report the status of an order confirmation or an order confirmation amendment.
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
@XmlType(name = "OrderConfirmationStatusReportV01", propOrder = {
    "msgId",
    "othrRef",
    "rltdRef",
    "indvOrdrConfDtlsRpt",
    "xtnsn"
})
public class OrderConfirmationStatusReportV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "OthrRef")
    protected List<AdditionalReference3> othrRef;
    @XmlElement(name = "RltdRef")
    protected List<AdditionalReference3> rltdRef;
    @XmlElement(name = "IndvOrdrConfDtlsRpt", required = true)
    protected List<IndividualOrderConfirmationStatusAndReason1> indvOrdrConfDtlsRpt;
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
    public OrderConfirmationStatusReportV01 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the othrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrRef property.
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
     * @return
     *     The value of the othrRef property.
     */
    public List<AdditionalReference3> getOthrRef() {
        if (othrRef == null) {
            othrRef = new ArrayList<>();
        }
        return this.othrRef;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdRef property.
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
     * @return
     *     The value of the rltdRef property.
     */
    public List<AdditionalReference3> getRltdRef() {
        if (rltdRef == null) {
            rltdRef = new ArrayList<>();
        }
        return this.rltdRef;
    }

    /**
     * Gets the value of the indvOrdrConfDtlsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvOrdrConfDtlsRpt property.
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
     * {@link IndividualOrderConfirmationStatusAndReason1 }
     * 
     * 
     * @return
     *     The value of the indvOrdrConfDtlsRpt property.
     */
    public List<IndividualOrderConfirmationStatusAndReason1> getIndvOrdrConfDtlsRpt() {
        if (indvOrdrConfDtlsRpt == null) {
            indvOrdrConfDtlsRpt = new ArrayList<>();
        }
        return this.indvOrdrConfDtlsRpt;
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
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
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
     * Adds a new item to the othrRef list.
     * @see #getOthrRef()
     * 
     */
    public OrderConfirmationStatusReportV01 addOthrRef(AdditionalReference3 othrRef) {
        getOthrRef().add(othrRef);
        return this;
    }

    /**
     * Adds a new item to the rltdRef list.
     * @see #getRltdRef()
     * 
     */
    public OrderConfirmationStatusReportV01 addRltdRef(AdditionalReference3 rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

    /**
     * Adds a new item to the indvOrdrConfDtlsRpt list.
     * @see #getIndvOrdrConfDtlsRpt()
     * 
     */
    public OrderConfirmationStatusReportV01 addIndvOrdrConfDtlsRpt(IndividualOrderConfirmationStatusAndReason1 indvOrdrConfDtlsRpt) {
        getIndvOrdrConfDtlsRpt().add(indvOrdrConfDtlsRpt);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public OrderConfirmationStatusReportV01 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
