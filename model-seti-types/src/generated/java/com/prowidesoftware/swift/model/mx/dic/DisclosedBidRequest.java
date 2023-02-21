
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
 * An instructing party, eg, an investment manager, sends the DisclosedBidRequest message to an executing party, eg, a broker, to request bids based on the ListOrder message sent in advance of a DisclosedBidRequest message.
 * Usage
 * In the "Disclosed" convention the ListOrder message is sent before the bidding process is started (by telephone or electronically by exchanging the DisclosedBidRequest and the DisclosedBidResponse messages). The ListOrder message enumerates the financial instruments and quantities from the bidding process, and may contain pre-allocation information. The direction of the trade is disclosed after the bidding process is completed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisclosedBidRequest", propOrder = {
    "id",
    "bidDtls",
    "dscldBidDtls"
})
public class DisclosedBidRequest {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "BidDtls", required = true)
    protected Bid1 bidDtls;
    @XmlElement(name = "DscldBidDtls")
    protected List<DisclosedBid1> dscldBidDtls;

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
    public DisclosedBidRequest setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the bidDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Bid1 }
     *     
     */
    public Bid1 getBidDtls() {
        return bidDtls;
    }

    /**
     * Sets the value of the bidDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid1 }
     *     
     */
    public DisclosedBidRequest setBidDtls(Bid1 value) {
        this.bidDtls = value;
        return this;
    }

    /**
     * Gets the value of the dscldBidDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dscldBidDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDscldBidDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisclosedBid1 }
     * 
     * 
     */
    public List<DisclosedBid1> getDscldBidDtls() {
        if (dscldBidDtls == null) {
            dscldBidDtls = new ArrayList<DisclosedBid1>();
        }
        return this.dscldBidDtls;
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
     * Adds a new item to the dscldBidDtls list.
     * @see #getDscldBidDtls()
     * 
     */
    public DisclosedBidRequest addDscldBidDtls(DisclosedBid1 dscldBidDtls) {
        getDscldBidDtls().add(dscldBidDtls);
        return this;
    }

}
