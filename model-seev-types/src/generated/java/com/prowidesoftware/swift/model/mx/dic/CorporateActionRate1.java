
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
 * Specifies rates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate1", propOrder = {
    "intrst",
    "rltdIndx",
    "pctgSght",
    "rinvstmtDscntToMkt",
    "sprd",
    "bidIntrvl",
    "chrgs"
})
public class CorporateActionRate1 {

    @XmlElement(name = "Intrst")
    protected RateAndAmountFormat1Choice intrst;
    @XmlElement(name = "RltdIndx")
    protected RateFormat1Choice rltdIndx;
    @XmlElement(name = "PctgSght")
    protected RateFormat1Choice pctgSght;
    @XmlElement(name = "RinvstmtDscntToMkt")
    protected RateFormat1Choice rinvstmtDscntToMkt;
    @XmlElement(name = "Sprd")
    protected RateFormat1Choice sprd;
    @XmlElement(name = "BidIntrvl")
    protected AmountAndRateFormat3Choice bidIntrvl;
    @XmlElement(name = "Chrgs")
    protected RateAndAmountFormat1Choice chrgs;

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate1 setIntrst(RateAndAmountFormat1Choice value) {
        this.intrst = value;
        return this;
    }

    /**
     * Gets the value of the rltdIndx property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getRltdIndx() {
        return rltdIndx;
    }

    /**
     * Sets the value of the rltdIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate1 setRltdIndx(RateFormat1Choice value) {
        this.rltdIndx = value;
        return this;
    }

    /**
     * Gets the value of the pctgSght property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getPctgSght() {
        return pctgSght;
    }

    /**
     * Sets the value of the pctgSght property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate1 setPctgSght(RateFormat1Choice value) {
        this.pctgSght = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtDscntToMkt property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getRinvstmtDscntToMkt() {
        return rinvstmtDscntToMkt;
    }

    /**
     * Sets the value of the rinvstmtDscntToMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate1 setRinvstmtDscntToMkt(RateFormat1Choice value) {
        this.rinvstmtDscntToMkt = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate1 setSprd(RateFormat1Choice value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the bidIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndRateFormat3Choice }
     *     
     */
    public AmountAndRateFormat3Choice getBidIntrvl() {
        return bidIntrvl;
    }

    /**
     * Sets the value of the bidIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndRateFormat3Choice }
     *     
     */
    public CorporateActionRate1 setBidIntrvl(AmountAndRateFormat3Choice value) {
        this.bidIntrvl = value;
        return this;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getChrgs() {
        return chrgs;
    }

    /**
     * Sets the value of the chrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate1 setChrgs(RateAndAmountFormat1Choice value) {
        this.chrgs = value;
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
