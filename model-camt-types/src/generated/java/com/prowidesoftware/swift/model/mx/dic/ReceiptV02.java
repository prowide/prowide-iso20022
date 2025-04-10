
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
 * The Receipt message is sent by the transaction administrator to a member of the system. It is sent to acknowledge the receipt of one or multiple messages sent previously.
 * The Receipt message is an application receipt acknowledgement and conveys information about the processing of the original message(s).
 * Usage
 * The Receipt message is used when the exchange of messages takes place in an asynchronous manner.
 * This may happen, for instance, when an action is requested from the transaction administrator (a deletion, modification or cancellation). The transaction administrator will first acknowledge the request (with a Receipt message) and then execute it.
 * The message can contain information based on the following elements: reference of the message(s) it acknowledges, the status code (optional) and further explanation:
 * - reference of the message it acknowledges
 * - potentially, a status code and an explanation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptV02", propOrder = {
    "msgId",
    "reqTp",
    "rctDtls"
})
public class ReceiptV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "ReqTp")
    protected RequestType1Choice reqTp;
    @XmlElement(name = "RctDtls", required = true)
    protected List<ReceiptDetails1> rctDtls;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public ReceiptV02 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the reqTp property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType1Choice }
     *     
     */
    public RequestType1Choice getReqTp() {
        return reqTp;
    }

    /**
     * Sets the value of the reqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType1Choice }
     *     
     */
    public ReceiptV02 setReqTp(RequestType1Choice value) {
        this.reqTp = value;
        return this;
    }

    /**
     * Gets the value of the rctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptDetails1 }
     * 
     * 
     */
    public List<ReceiptDetails1> getRctDtls() {
        if (rctDtls == null) {
            rctDtls = new ArrayList<ReceiptDetails1>();
        }
        return this.rctDtls;
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
     * Adds a new item to the rctDtls list.
     * @see #getRctDtls()
     * 
     */
    public ReceiptV02 addRctDtls(ReceiptDetails1 rctDtls) {
        getRctDtls().add(rctDtls);
        return this;
    }

}
