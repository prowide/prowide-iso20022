
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
 * List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonDisclosedBid2", propOrder = {
    "bidByCcy",
    "bidBySctr",
    "bidByIndx",
    "fairVal"
})
public class NonDisclosedBid2 {

    @XmlElement(name = "BidByCcy")
    protected String bidByCcy;
    @XmlElement(name = "BidBySctr")
    protected String bidBySctr;
    @XmlElement(name = "BidByIndx")
    protected String bidByIndx;
    @XmlElement(name = "FairVal")
    protected ActiveCurrencyAndAmount fairVal;

    /**
     * Gets the value of the bidByCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidByCcy() {
        return bidByCcy;
    }

    /**
     * Sets the value of the bidByCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NonDisclosedBid2 setBidByCcy(String value) {
        this.bidByCcy = value;
        return this;
    }

    /**
     * Gets the value of the bidBySctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidBySctr() {
        return bidBySctr;
    }

    /**
     * Sets the value of the bidBySctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NonDisclosedBid2 setBidBySctr(String value) {
        this.bidBySctr = value;
        return this;
    }

    /**
     * Gets the value of the bidByIndx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidByIndx() {
        return bidByIndx;
    }

    /**
     * Sets the value of the bidByIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NonDisclosedBid2 setBidByIndx(String value) {
        this.bidByIndx = value;
        return this;
    }

    /**
     * Gets the value of the fairVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFairVal() {
        return fairVal;
    }

    /**
     * Sets the value of the fairVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public NonDisclosedBid2 setFairVal(ActiveCurrencyAndAmount value) {
        this.fairVal = value;
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
