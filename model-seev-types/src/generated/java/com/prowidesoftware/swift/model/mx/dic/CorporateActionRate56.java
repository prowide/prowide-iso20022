
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
 * Specifies rates of a corporate action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate56", propOrder = {
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
public class CorporateActionRate56 {

    @XmlElement(name = "Intrst")
    protected RateAndAmountFormat16Choice intrst;
    @XmlElement(name = "PctgSght")
    protected RateFormat7Choice pctgSght;
    @XmlElement(name = "RltdIndx")
    protected RateFormat3Choice rltdIndx;
    @XmlElement(name = "Sprd")
    protected RateFormat3Choice sprd;
    @XmlElement(name = "BidIntrvl")
    protected RateAndAmountFormat28Choice bidIntrvl;
    @XmlElement(name = "PrvsFctr")
    protected RateFormat12Choice prvsFctr;
    @XmlElement(name = "NxtFctr")
    protected RateFormat12Choice nxtFctr;
    @XmlElement(name = "RinvstmtDscntRateToMkt")
    protected RateFormat3Choice rinvstmtDscntRateToMkt;
    @XmlElement(name = "IntrstShrtfll")
    protected RateAndAmountFormat6Choice intrstShrtfll;
    @XmlElement(name = "RealsdLoss")
    protected RateAndAmountFormat6Choice realsdLoss;
    @XmlElement(name = "DclrdRate")
    protected RateAndAmountFormat6Choice dclrdRate;

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateAndAmountFormat16Choice getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public CorporateActionRate56 setIntrst(RateAndAmountFormat16Choice value) {
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
    public CorporateActionRate56 setPctgSght(RateFormat7Choice value) {
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
    public CorporateActionRate56 setRltdIndx(RateFormat3Choice value) {
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
    public CorporateActionRate56 setSprd(RateFormat3Choice value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the bidIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat28Choice }
     *     
     */
    public RateAndAmountFormat28Choice getBidIntrvl() {
        return bidIntrvl;
    }

    /**
     * Sets the value of the bidIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat28Choice }
     *     
     */
    public CorporateActionRate56 setBidIntrvl(RateAndAmountFormat28Choice value) {
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
    public CorporateActionRate56 setPrvsFctr(RateFormat12Choice value) {
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
    public CorporateActionRate56 setNxtFctr(RateFormat12Choice value) {
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
    public CorporateActionRate56 setRinvstmtDscntRateToMkt(RateFormat3Choice value) {
        this.rinvstmtDscntRateToMkt = value;
        return this;
    }

    /**
     * Gets the value of the intrstShrtfll property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateAndAmountFormat6Choice getIntrstShrtfll() {
        return intrstShrtfll;
    }

    /**
     * Sets the value of the intrstShrtfll property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public CorporateActionRate56 setIntrstShrtfll(RateAndAmountFormat6Choice value) {
        this.intrstShrtfll = value;
        return this;
    }

    /**
     * Gets the value of the realsdLoss property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateAndAmountFormat6Choice getRealsdLoss() {
        return realsdLoss;
    }

    /**
     * Sets the value of the realsdLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public CorporateActionRate56 setRealsdLoss(RateAndAmountFormat6Choice value) {
        this.realsdLoss = value;
        return this;
    }

    /**
     * Gets the value of the dclrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateAndAmountFormat6Choice getDclrdRate() {
        return dclrdRate;
    }

    /**
     * Sets the value of the dclrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public CorporateActionRate56 setDclrdRate(RateAndAmountFormat6Choice value) {
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
