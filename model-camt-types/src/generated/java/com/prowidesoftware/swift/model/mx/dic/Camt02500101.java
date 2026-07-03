
package com.prowidesoftware.swift.model.mx.dic;

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
 * The Receipt message is sent by the transaction administrator to a member of the system. It is sent to acknowledge the receipt of a message previously sent.
 * The Receipt message is an application receipt acknowledgement and conveys information about the processing of the original message.
 * Usage
 * The Receipt message is used when the exchange of messages takes place in an asynchronous manner.
 * This may happen, for instance, when an action is requested from the transaction administrator (a deletion, modification or cancellation). The transaction administrator will first acknowledge the request (with a Receipt message) and then execute it.
 * The message can contain information based on the following elements: reference of the message it acknowledges potentially, a status code and an explanation
 * - reference of the message it acknowledges
 * - potentially, a status code and an explanation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.025.001.01", propOrder = {
    "msgId",
    "rltdRef",
    "reqHdlg"
})
public class Camt02500101 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "RltdRef", required = true)
    protected AdditionalReferences rltdRef;
    @XmlElement(name = "ReqHdlg")
    protected RequestHandling reqHdlg;

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
    public Camt02500101 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReferences }
     *     
     */
    public AdditionalReferences getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReferences }
     *     
     */
    public Camt02500101 setRltdRef(AdditionalReferences value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the reqHdlg property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHandling }
     *     
     */
    public RequestHandling getReqHdlg() {
        return reqHdlg;
    }

    /**
     * Sets the value of the reqHdlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHandling }
     *     
     */
    public Camt02500101 setReqHdlg(RequestHandling value) {
        this.reqHdlg = value;
        return this;
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

}
