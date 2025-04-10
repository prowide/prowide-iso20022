
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. 
 * 
 * One example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of
 * a derivative product (for example index futures) to profit from price differences between the basket and the derivative product. 
 * 
 * Other examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidResponsePrice2", propOrder = {
    "comssn",
    "grssInd",
    "pric",
    "sd",
    "nonDscldBidDtls"
})
public class BidResponsePrice2 {

    @XmlElement(name = "Comssn", required = true)
    protected Commission2 comssn;
    @XmlElement(name = "GrssInd")
    protected boolean grssInd;
    @XmlElement(name = "Pric")
    protected Price1 pric;
    @XmlElement(name = "Sd")
    @XmlSchemaType(name = "string")
    protected Side1Code sd;
    @XmlElement(name = "NonDscldBidDtls")
    protected NonDisclosedBid2 nonDscldBidDtls;

    /**
     * Gets the value of the comssn property.
     * 
     * @return
     *     possible object is
     *     {@link Commission2 }
     *     
     */
    public Commission2 getComssn() {
        return comssn;
    }

    /**
     * Sets the value of the comssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission2 }
     *     
     */
    public BidResponsePrice2 setComssn(Commission2 value) {
        this.comssn = value;
        return this;
    }

    /**
     * Gets the value of the grssInd property.
     * 
     */
    public boolean isGrssInd() {
        return grssInd;
    }

    /**
     * Sets the value of the grssInd property.
     * 
     */
    public BidResponsePrice2 setGrssInd(boolean value) {
        this.grssInd = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public BidResponsePrice2 setPric(Price1 value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Side1Code }
     *     
     */
    public Side1Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side1Code }
     *     
     */
    public BidResponsePrice2 setSd(Side1Code value) {
        this.sd = value;
        return this;
    }

    /**
     * Gets the value of the nonDscldBidDtls property.
     * 
     * @return
     *     possible object is
     *     {@link NonDisclosedBid2 }
     *     
     */
    public NonDisclosedBid2 getNonDscldBidDtls() {
        return nonDscldBidDtls;
    }

    /**
     * Sets the value of the nonDscldBidDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDisclosedBid2 }
     *     
     */
    public BidResponsePrice2 setNonDscldBidDtls(NonDisclosedBid2 value) {
        this.nonDscldBidDtls = value;
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
