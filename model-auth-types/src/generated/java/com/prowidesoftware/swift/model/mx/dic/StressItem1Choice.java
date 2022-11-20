
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
 * Specifies the risk factor, financial instrument or set of financial instruments that is stressed under a hypothetical stress scenario.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StressItem1Choice", propOrder = {
    "pdct",
    "strtgy",
    "rskFctr"
})
public class StressItem1Choice {

    @XmlElement(name = "Pdct")
    protected StressedProduct1 pdct;
    @XmlElement(name = "Strtgy")
    protected Strategy1 strtgy;
    @XmlElement(name = "RskFctr")
    protected RiskFactor1 rskFctr;

    /**
     * Gets the value of the pdct property.
     * 
     * @return
     *     possible object is
     *     {@link StressedProduct1 }
     *     
     */
    public StressedProduct1 getPdct() {
        return pdct;
    }

    /**
     * Sets the value of the pdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressedProduct1 }
     *     
     */
    public StressItem1Choice setPdct(StressedProduct1 value) {
        this.pdct = value;
        return this;
    }

    /**
     * Gets the value of the strtgy property.
     * 
     * @return
     *     possible object is
     *     {@link Strategy1 }
     *     
     */
    public Strategy1 getStrtgy() {
        return strtgy;
    }

    /**
     * Sets the value of the strtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strategy1 }
     *     
     */
    public StressItem1Choice setStrtgy(Strategy1 value) {
        this.strtgy = value;
        return this;
    }

    /**
     * Gets the value of the rskFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RiskFactor1 }
     *     
     */
    public RiskFactor1 getRskFctr() {
        return rskFctr;
    }

    /**
     * Sets the value of the rskFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskFactor1 }
     *     
     */
    public StressItem1Choice setRskFctr(RiskFactor1 value) {
        this.rskFctr = value;
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
