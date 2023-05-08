
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
 * Rules which apply to the BPO (Bank Payment Obligation).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPOApplicableRules1Choice", propOrder = {
    "urbpoVrsn",
    "othrRulesAndVrsn"
})
public class BPOApplicableRules1Choice {

    @XmlElement(name = "URBPOVrsn")
    protected BigDecimal urbpoVrsn;
    @XmlElement(name = "OthrRulesAndVrsn")
    protected String othrRulesAndVrsn;

    /**
     * Gets the value of the urbpoVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getURBPOVrsn() {
        return urbpoVrsn;
    }

    /**
     * Sets the value of the urbpoVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BPOApplicableRules1Choice setURBPOVrsn(BigDecimal value) {
        this.urbpoVrsn = value;
        return this;
    }

    /**
     * Gets the value of the othrRulesAndVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRulesAndVrsn() {
        return othrRulesAndVrsn;
    }

    /**
     * Sets the value of the othrRulesAndVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BPOApplicableRules1Choice setOthrRulesAndVrsn(String value) {
        this.othrRulesAndVrsn = value;
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
