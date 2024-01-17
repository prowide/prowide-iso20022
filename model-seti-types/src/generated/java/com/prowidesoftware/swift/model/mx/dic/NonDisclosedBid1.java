
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
@XmlType(name = "NonDisclosedBid1", propOrder = {
    "bidByCcy",
    "bidBySctr",
    "bidByIndx",
    "sdInd",
    "lqdty",
    "xchgForPhysTrad"
})
public class NonDisclosedBid1 {

    @XmlElement(name = "BidByCcy")
    protected String bidByCcy;
    @XmlElement(name = "BidBySctr")
    protected String bidBySctr;
    @XmlElement(name = "BidByIndx")
    protected String bidByIndx;
    @XmlElement(name = "SdInd")
    protected Boolean sdInd;
    @XmlElement(name = "Lqdty")
    protected Liquidity1 lqdty;
    @XmlElement(name = "XchgForPhysTrad")
    protected ExchangeForPhysicalTradeParameters1 xchgForPhysTrad;

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
    public NonDisclosedBid1 setBidByCcy(String value) {
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
    public NonDisclosedBid1 setBidBySctr(String value) {
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
    public NonDisclosedBid1 setBidByIndx(String value) {
        this.bidByIndx = value;
        return this;
    }

    /**
     * Gets the value of the sdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSdInd() {
        return sdInd;
    }

    /**
     * Sets the value of the sdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public NonDisclosedBid1 setSdInd(Boolean value) {
        this.sdInd = value;
        return this;
    }

    /**
     * Gets the value of the lqdty property.
     * 
     * @return
     *     possible object is
     *     {@link Liquidity1 }
     *     
     */
    public Liquidity1 getLqdty() {
        return lqdty;
    }

    /**
     * Sets the value of the lqdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Liquidity1 }
     *     
     */
    public NonDisclosedBid1 setLqdty(Liquidity1 value) {
        this.lqdty = value;
        return this;
    }

    /**
     * Gets the value of the xchgForPhysTrad property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeForPhysicalTradeParameters1 }
     *     
     */
    public ExchangeForPhysicalTradeParameters1 getXchgForPhysTrad() {
        return xchgForPhysTrad;
    }

    /**
     * Sets the value of the xchgForPhysTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeForPhysicalTradeParameters1 }
     *     
     */
    public NonDisclosedBid1 setXchgForPhysTrad(ExchangeForPhysicalTradeParameters1 value) {
        this.xchgForPhysTrad = value;
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
