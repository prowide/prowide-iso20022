
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
 * Identification of an attempt to buy or sell a large number of financial instruments contained in or comprising a portfolio.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bid3", propOrder = {
    "bidId",
    "clntBidId",
    "bidRspnPricDtls"
})
public class Bid3 {

    @XmlElement(name = "BidId")
    protected String bidId;
    @XmlElement(name = "ClntBidId")
    protected String clntBidId;
    @XmlElement(name = "BidRspnPricDtls", required = true)
    protected List<BidResponsePrice2> bidRspnPricDtls;

    /**
     * Gets the value of the bidId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidId() {
        return bidId;
    }

    /**
     * Sets the value of the bidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Bid3 setBidId(String value) {
        this.bidId = value;
        return this;
    }

    /**
     * Gets the value of the clntBidId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntBidId() {
        return clntBidId;
    }

    /**
     * Sets the value of the clntBidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Bid3 setClntBidId(String value) {
        this.clntBidId = value;
        return this;
    }

    /**
     * Gets the value of the bidRspnPricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidRspnPricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidRspnPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BidResponsePrice2 }
     * 
     * 
     */
    public List<BidResponsePrice2> getBidRspnPricDtls() {
        if (bidRspnPricDtls == null) {
            bidRspnPricDtls = new ArrayList<BidResponsePrice2>();
        }
        return this.bidRspnPricDtls;
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
     * Adds a new item to the bidRspnPricDtls list.
     * @see #getBidRspnPricDtls()
     * 
     */
    public Bid3 addBidRspnPricDtls(BidResponsePrice2 bidRspnPricDtls) {
        getBidRspnPricDtls().add(bidRspnPricDtls);
        return this;
    }

}
