
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
 * Specifies rates of a corporate action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate16", propOrder = {
    "intrst",
    "pctgSght",
    "rltdIndx",
    "sprd",
    "bidIntrvl",
    "prvsFctr",
    "nxtFctr",
    "rinvstmtDscntRateToMkt"
})
public class CorporateActionRate16 {

    @XmlElement(name = "Intrst")
    protected RateAndAmountFormat14Choice intrst;
    @XmlElement(name = "PctgSght")
    protected RateFormat5Choice pctgSght;
    @XmlElement(name = "RltdIndx")
    protected RateFormat6Choice rltdIndx;
    @XmlElement(name = "Sprd")
    protected RateFormat6Choice sprd;
    @XmlElement(name = "BidIntrvl")
    protected RateAndAmountFormat14Choice bidIntrvl;
    @XmlElement(name = "PrvsFctr")
    protected RateFormat3Choice prvsFctr;
    @XmlElement(name = "NxtFctr")
    protected RateFormat3Choice nxtFctr;
    @XmlElement(name = "RinvstmtDscntRateToMkt")
    protected RateFormat6Choice rinvstmtDscntRateToMkt;

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public CorporateActionRate16 setIntrst(RateAndAmountFormat14Choice value) {
        this.intrst = value;
        return this;
    }

    /**
     * Gets the value of the pctgSght property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat5Choice }
     *     
     */
    public RateFormat5Choice getPctgSght() {
        return pctgSght;
    }

    /**
     * Sets the value of the pctgSght property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat5Choice }
     *     
     */
    public CorporateActionRate16 setPctgSght(RateFormat5Choice value) {
        this.pctgSght = value;
        return this;
    }

    /**
     * Gets the value of the rltdIndx property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getRltdIndx() {
        return rltdIndx;
    }

    /**
     * Sets the value of the rltdIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public CorporateActionRate16 setRltdIndx(RateFormat6Choice value) {
        this.rltdIndx = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public CorporateActionRate16 setSprd(RateFormat6Choice value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the bidIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getBidIntrvl() {
        return bidIntrvl;
    }

    /**
     * Sets the value of the bidIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public CorporateActionRate16 setBidIntrvl(RateAndAmountFormat14Choice value) {
        this.bidIntrvl = value;
        return this;
    }

    /**
     * Gets the value of the prvsFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getPrvsFctr() {
        return prvsFctr;
    }

    /**
     * Sets the value of the prvsFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public CorporateActionRate16 setPrvsFctr(RateFormat3Choice value) {
        this.prvsFctr = value;
        return this;
    }

    /**
     * Gets the value of the nxtFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getNxtFctr() {
        return nxtFctr;
    }

    /**
     * Sets the value of the nxtFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public CorporateActionRate16 setNxtFctr(RateFormat3Choice value) {
        this.nxtFctr = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtDscntRateToMkt property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getRinvstmtDscntRateToMkt() {
        return rinvstmtDscntRateToMkt;
    }

    /**
     * Sets the value of the rinvstmtDscntRateToMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public CorporateActionRate16 setRinvstmtDscntRateToMkt(RateFormat6Choice value) {
        this.rinvstmtDscntRateToMkt = value;
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
