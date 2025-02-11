
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
@XmlType(name = "CorporateActionRate43", propOrder = {
    "intrst",
    "pctgSght",
    "rltdIndx",
    "sprd",
    "bidIntrvl",
    "prvsFctr",
    "nxtFctr",
    "rinvstmtDscntRateToMkt",
    "intrstShrtfll",
    "realsdLoss",
    "dclrdRate"
})
public class CorporateActionRate43 {

    @XmlElement(name = "Intrst")
    protected RateAndAmountFormat14Choice intrst;
    @XmlElement(name = "PctgSght")
    protected RateFormat7Choice pctgSght;
    @XmlElement(name = "RltdIndx")
    protected RateFormat3Choice rltdIndx;
    @XmlElement(name = "Sprd")
    protected RateFormat3Choice sprd;
    @XmlElement(name = "BidIntrvl")
    protected RateAndAmountFormat19Choice bidIntrvl;
    @XmlElement(name = "PrvsFctr")
    protected RateFormat12Choice prvsFctr;
    @XmlElement(name = "NxtFctr")
    protected RateFormat12Choice nxtFctr;
    @XmlElement(name = "RinvstmtDscntRateToMkt")
    protected RateFormat3Choice rinvstmtDscntRateToMkt;
    @XmlElement(name = "IntrstShrtfll")
    protected RateAndAmountFormat5Choice intrstShrtfll;
    @XmlElement(name = "RealsdLoss")
    protected RateAndAmountFormat5Choice realsdLoss;
    @XmlElement(name = "DclrdRate")
    protected RateAndAmountFormat5Choice dclrdRate;

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
    public CorporateActionRate43 setIntrst(RateAndAmountFormat14Choice value) {
        this.intrst = value;
        return this;
    }

    /**
     * Gets the value of the pctgSght property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat7Choice }
     *     
     */
    public RateFormat7Choice getPctgSght() {
        return pctgSght;
    }

    /**
     * Sets the value of the pctgSght property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat7Choice }
     *     
     */
    public CorporateActionRate43 setPctgSght(RateFormat7Choice value) {
        this.pctgSght = value;
        return this;
    }

    /**
     * Gets the value of the rltdIndx property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getRltdIndx() {
        return rltdIndx;
    }

    /**
     * Sets the value of the rltdIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public CorporateActionRate43 setRltdIndx(RateFormat3Choice value) {
        this.rltdIndx = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public CorporateActionRate43 setSprd(RateFormat3Choice value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the bidIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat19Choice }
     *     
     */
    public RateAndAmountFormat19Choice getBidIntrvl() {
        return bidIntrvl;
    }

    /**
     * Sets the value of the bidIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat19Choice }
     *     
     */
    public CorporateActionRate43 setBidIntrvl(RateAndAmountFormat19Choice value) {
        this.bidIntrvl = value;
        return this;
    }

    /**
     * Gets the value of the prvsFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat12Choice }
     *     
     */
    public RateFormat12Choice getPrvsFctr() {
        return prvsFctr;
    }

    /**
     * Sets the value of the prvsFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat12Choice }
     *     
     */
    public CorporateActionRate43 setPrvsFctr(RateFormat12Choice value) {
        this.prvsFctr = value;
        return this;
    }

    /**
     * Gets the value of the nxtFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat12Choice }
     *     
     */
    public RateFormat12Choice getNxtFctr() {
        return nxtFctr;
    }

    /**
     * Sets the value of the nxtFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat12Choice }
     *     
     */
    public CorporateActionRate43 setNxtFctr(RateFormat12Choice value) {
        this.nxtFctr = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtDscntRateToMkt property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getRinvstmtDscntRateToMkt() {
        return rinvstmtDscntRateToMkt;
    }

    /**
     * Sets the value of the rinvstmtDscntRateToMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public CorporateActionRate43 setRinvstmtDscntRateToMkt(RateFormat3Choice value) {
        this.rinvstmtDscntRateToMkt = value;
        return this;
    }

    /**
     * Gets the value of the intrstShrtfll property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public RateAndAmountFormat5Choice getIntrstShrtfll() {
        return intrstShrtfll;
    }

    /**
     * Sets the value of the intrstShrtfll property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public CorporateActionRate43 setIntrstShrtfll(RateAndAmountFormat5Choice value) {
        this.intrstShrtfll = value;
        return this;
    }

    /**
     * Gets the value of the realsdLoss property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public RateAndAmountFormat5Choice getRealsdLoss() {
        return realsdLoss;
    }

    /**
     * Sets the value of the realsdLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public CorporateActionRate43 setRealsdLoss(RateAndAmountFormat5Choice value) {
        this.realsdLoss = value;
        return this;
    }

    /**
     * Gets the value of the dclrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public RateAndAmountFormat5Choice getDclrdRate() {
        return dclrdRate;
    }

    /**
     * Sets the value of the dclrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public CorporateActionRate43 setDclrdRate(RateAndAmountFormat5Choice value) {
        this.dclrdRate = value;
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
