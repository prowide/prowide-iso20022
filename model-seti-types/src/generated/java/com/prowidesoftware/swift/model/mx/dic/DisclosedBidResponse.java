
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
 * An executing party, eg, a broker, sends the DisclosedBidResponse message to an instructing party, eg, an investment manager, to supply a bid based on the ListOrder messages sent in advance of the corresponding DisclosedBidRequest message.
 * Usage
 * In the "Disclosed" convention the ListOrder message is sent before the bidding process is started (by telephone or electronically by exchanging the DisclosedBidRequest and the DisclosedBidResponse messages). The ListOrder message enumerates the financial instruments and quantities from the bidding process, and may contain pre-allocation information. The direction of the trade is disclosed after the bidding process is completed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisclosedBidResponse", propOrder = {
    "id",
    "bidDtls"
})
public class DisclosedBidResponse {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "BidDtls", required = true)
    protected Bid2 bidDtls;

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
    public DisclosedBidResponse setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the bidDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Bid2 }
     *     
     */
    public Bid2 getBidDtls() {
        return bidDtls;
    }

    /**
     * Sets the value of the bidDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid2 }
     *     
     */
    public DisclosedBidResponse setBidDtls(Bid2 value) {
        this.bidDtls = value;
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
