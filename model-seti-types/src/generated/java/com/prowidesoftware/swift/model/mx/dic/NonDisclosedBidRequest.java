
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
 * An instructing party, eg, an investment manager, sends the NonDisclosedBidRequest message to an executing party, eg, a broker, to request a bid based on the sector, country, index and liquidity information contained within the message itself.
 * Usage
 * In the "Non disclosed" convention, the bidding process is done by exchanging the NonDisclosedBidRequest and the NonDisclosedBidResponse messages. The ListOrder message enumerates the financial instruments, the quantities and the direction for the trade. This message may contain pre-allocation information and is sent after the bidding process has been completed (by telephone or electronically).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonDisclosedBidRequest", propOrder = {
    "id",
    "bidDtls",
    "nonDscldBidDtls"
})
public class NonDisclosedBidRequest {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "BidDtls", required = true)
    protected Bid1 bidDtls;
    @XmlElement(name = "NonDscldBidDtls")
    protected List<NonDisclosedBid1> nonDscldBidDtls;

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
    public NonDisclosedBidRequest setId(DocumentIdentification11 value) {
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
    public NonDisclosedBidRequest setBidDtls(Bid1 value) {
        this.bidDtls = value;
        return this;
    }

    /**
     * Gets the value of the nonDscldBidDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonDscldBidDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonDscldBidDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonDisclosedBid1 }
     * 
     * 
     */
    public List<NonDisclosedBid1> getNonDscldBidDtls() {
        if (nonDscldBidDtls == null) {
            nonDscldBidDtls = new ArrayList<NonDisclosedBid1>();
        }
        return this.nonDscldBidDtls;
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
     * Adds a new item to the nonDscldBidDtls list.
     * @see #getNonDscldBidDtls()
     * 
     */
    public NonDisclosedBidRequest addNonDscldBidDtls(NonDisclosedBid1 nonDscldBidDtls) {
        getNonDscldBidDtls().add(nonDscldBidDtls);
        return this;
    }

}
