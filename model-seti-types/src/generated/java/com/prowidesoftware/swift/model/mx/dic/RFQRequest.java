
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
 * The Request For Quote Request message is sent by a trading party, eg, a broker, to a point of execution such as an exchange to request a QuoteRequest message.
 * Usage
 * The RFQ Request message is used by liquidity providers in a tradeable and restricted tradeable quoting market to indicate to the market for which financial instruments (single or multiple) they are interested in receiving QuoteRequest messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFQRequest", propOrder = {
    "id",
    "sbcptReq",
    "reqForQt"
})
public class RFQRequest {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "SbcptReq")
    protected SubscriptionRequest sbcptReq;
    @XmlElement(name = "ReqForQt")
    protected List<RequestForQuote> reqForQt;

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
    public RFQRequest setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the sbcptReq property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRequest }
     *     
     */
    public SubscriptionRequest getSbcptReq() {
        return sbcptReq;
    }

    /**
     * Sets the value of the sbcptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRequest }
     *     
     */
    public RFQRequest setSbcptReq(SubscriptionRequest value) {
        this.sbcptReq = value;
        return this;
    }

    /**
     * Gets the value of the reqForQt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqForQt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqForQt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestForQuote }
     * 
     * 
     * @return
     *     The value of the reqForQt property.
     */
    public List<RequestForQuote> getReqForQt() {
        if (reqForQt == null) {
            reqForQt = new ArrayList<>();
        }
        return this.reqForQt;
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
     * Adds a new item to the reqForQt list.
     * @see #getReqForQt()
     * 
     */
    public RFQRequest addReqForQt(RequestForQuote reqForQt) {
        getReqForQt().add(reqForQt);
        return this;
    }

}
