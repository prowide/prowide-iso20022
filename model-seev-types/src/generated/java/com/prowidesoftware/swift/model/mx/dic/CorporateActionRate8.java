
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies rates related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate8", propOrder = {
    "propsdRate",
    "ovrsbcptRate",
    "reqdTaxtnRate"
})
public class CorporateActionRate8 {

    @XmlElement(name = "PropsdRate")
    protected BigDecimal propsdRate;
    @XmlElement(name = "OvrsbcptRate")
    protected RateAndAmountFormat12Choice ovrsbcptRate;
    @XmlElement(name = "ReqdTaxtnRate")
    protected BigDecimal reqdTaxtnRate;

    /**
     * Gets the value of the propsdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPropsdRate() {
        return propsdRate;
    }

    /**
     * Sets the value of the propsdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate8 setPropsdRate(BigDecimal value) {
        this.propsdRate = value;
        return this;
    }

    /**
     * Gets the value of the ovrsbcptRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat12Choice }
     *     
     */
    public RateAndAmountFormat12Choice getOvrsbcptRate() {
        return ovrsbcptRate;
    }

    /**
     * Sets the value of the ovrsbcptRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat12Choice }
     *     
     */
    public CorporateActionRate8 setOvrsbcptRate(RateAndAmountFormat12Choice value) {
        this.ovrsbcptRate = value;
        return this;
    }

    /**
     * Gets the value of the reqdTaxtnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqdTaxtnRate() {
        return reqdTaxtnRate;
    }

    /**
     * Sets the value of the reqdTaxtnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate8 setReqdTaxtnRate(BigDecimal value) {
        this.reqdTaxtnRate = value;
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
