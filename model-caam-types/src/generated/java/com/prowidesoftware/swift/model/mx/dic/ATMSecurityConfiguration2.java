
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
 * Configuration of the cryptographic keys.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityConfiguration2", propOrder = {
    "maxSmmtrcKey",
    "maxAsmmtrcKey",
    "maxRSAKeyLngth",
    "maxRootKeyLngth"
})
public class ATMSecurityConfiguration2 {

    @XmlElement(name = "MaxSmmtrcKey")
    protected BigDecimal maxSmmtrcKey;
    @XmlElement(name = "MaxAsmmtrcKey")
    protected BigDecimal maxAsmmtrcKey;
    @XmlElement(name = "MaxRSAKeyLngth")
    protected BigDecimal maxRSAKeyLngth;
    @XmlElement(name = "MaxRootKeyLngth")
    protected BigDecimal maxRootKeyLngth;

    /**
     * Gets the value of the maxSmmtrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSmmtrcKey() {
        return maxSmmtrcKey;
    }

    /**
     * Sets the value of the maxSmmtrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMSecurityConfiguration2 setMaxSmmtrcKey(BigDecimal value) {
        this.maxSmmtrcKey = value;
        return this;
    }

    /**
     * Gets the value of the maxAsmmtrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAsmmtrcKey() {
        return maxAsmmtrcKey;
    }

    /**
     * Sets the value of the maxAsmmtrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMSecurityConfiguration2 setMaxAsmmtrcKey(BigDecimal value) {
        this.maxAsmmtrcKey = value;
        return this;
    }

    /**
     * Gets the value of the maxRSAKeyLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxRSAKeyLngth() {
        return maxRSAKeyLngth;
    }

    /**
     * Sets the value of the maxRSAKeyLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMSecurityConfiguration2 setMaxRSAKeyLngth(BigDecimal value) {
        this.maxRSAKeyLngth = value;
        return this;
    }

    /**
     * Gets the value of the maxRootKeyLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxRootKeyLngth() {
        return maxRootKeyLngth;
    }

    /**
     * Sets the value of the maxRootKeyLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMSecurityConfiguration2 setMaxRootKeyLngth(BigDecimal value) {
        this.maxRootKeyLngth = value;
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
