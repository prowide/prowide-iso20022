
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
 * An executing party, eg, a broker, sends the OrderStatus message to an instructing party, eg, an investment manager, to advise the status of an order. It is also used in response to an order cancellation request or an order modification. request.
 * Usage
 * The OrderStatus message may also be sent in a tradeable and restricted tradeable quoting market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatus", propOrder = {
    "id",
    "refs",
    "stsAndRsn"
})
public class OrderStatus {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs", required = true)
    protected Reference15 refs;
    @XmlElement(name = "StsAndRsn", required = true)
    protected List<OrderStatusAndReason5> stsAndRsn;

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
    public OrderStatus setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference15 }
     *     
     */
    public Reference15 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference15 }
     *     
     */
    public OrderStatus setRefs(Reference15 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the stsAndRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stsAndRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsAndRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderStatusAndReason5 }
     * 
     * 
     */
    public List<OrderStatusAndReason5> getStsAndRsn() {
        if (stsAndRsn == null) {
            stsAndRsn = new ArrayList<OrderStatusAndReason5>();
        }
        return this.stsAndRsn;
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
     * Adds a new item to the stsAndRsn list.
     * @see #getStsAndRsn()
     * 
     */
    public OrderStatus addStsAndRsn(OrderStatusAndReason5 stsAndRsn) {
        getStsAndRsn().add(stsAndRsn);
        return this;
    }

}
