
package com.prowidesoftware.swift.model.mx.dic;

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
 * An instructing party, eg, an investment manager, sends the OrderCancelRequest message to an executing party, eg, a broker, to request the cancellation of the previously sent Order. The OrderCancelRequest is used to fully cancel the remaining open quantity of an Order.
 * Usage
 * Where permitted, an executing party, eg, a broker, sends the OrderCancelRequest to a point of execution such as an exchange. It may be used in broker-to-broker communications.
 * This message must contain the reference of the message to be cancelled and it may also contain all the details of the message to be cancelled.
 * This cancellation message is a request to cancel. There is no automatic acceptance of the cancellation instruction. The rejection or acceptance of a cancellation message instruction is made using an OrderStatus message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCancelRequest", propOrder = {
    "id",
    "refs",
    "ordrDtls"
})
public class OrderCancelRequest {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs", required = true)
    protected Reference9 refs;
    @XmlElement(name = "OrdrDtls", required = true)
    protected Order11 ordrDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public OrderCancelRequest setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference9 }
     *     
     */
    public Reference9 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference9 }
     *     
     */
    public OrderCancelRequest setRefs(Reference9 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order11 }
     *     
     */
    public Order11 getOrdrDtls() {
        return ordrDtls;
    }

    /**
     * Sets the value of the ordrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order11 }
     *     
     */
    public OrderCancelRequest setOrdrDtls(Order11 value) {
        this.ordrDtls = value;
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
