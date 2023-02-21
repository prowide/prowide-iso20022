
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
 * Choice of entitlement calculation method.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entitlement1Choice", propOrder = {
    "entitlmntRatio",
    "entitlmntDesc"
})
public class Entitlement1Choice {

    @XmlElement(name = "EntitlmntRatio")
    protected BigDecimal entitlmntRatio;
    @XmlElement(name = "EntitlmntDesc")
    protected String entitlmntDesc;

    /**
     * Gets the value of the entitlmntRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEntitlmntRatio() {
        return entitlmntRatio;
    }

    /**
     * Sets the value of the entitlmntRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Entitlement1Choice setEntitlmntRatio(BigDecimal value) {
        this.entitlmntRatio = value;
        return this;
    }

    /**
     * Gets the value of the entitlmntDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlmntDesc() {
        return entitlmntDesc;
    }

    /**
     * Sets the value of the entitlmntDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Entitlement1Choice setEntitlmntDesc(String value) {
        this.entitlmntDesc = value;
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
