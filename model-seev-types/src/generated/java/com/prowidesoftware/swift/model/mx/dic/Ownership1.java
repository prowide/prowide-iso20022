
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides ownership details  of a person on an asset.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ownership1", propOrder = {
    "ownrshTp",
    "ownrshPctg",
    "usfrctPctg"
})
public class Ownership1 {

    @XmlElement(name = "OwnrshTp")
    protected OwnershipType3Choice ownrshTp;
    @XmlElement(name = "OwnrshPctg")
    protected BigDecimal ownrshPctg;
    @XmlElement(name = "UsfrctPctg")
    protected BigDecimal usfrctPctg;

    /**
     * Gets the value of the ownrshTp property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipType3Choice }
     *     
     */
    public OwnershipType3Choice getOwnrshTp() {
        return ownrshTp;
    }

    /**
     * Sets the value of the ownrshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipType3Choice }
     *     
     */
    public Ownership1 setOwnrshTp(OwnershipType3Choice value) {
        this.ownrshTp = value;
        return this;
    }

    /**
     * Gets the value of the ownrshPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnrshPctg() {
        return ownrshPctg;
    }

    /**
     * Sets the value of the ownrshPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Ownership1 setOwnrshPctg(BigDecimal value) {
        this.ownrshPctg = value;
        return this;
    }

    /**
     * Gets the value of the usfrctPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsfrctPctg() {
        return usfrctPctg;
    }

    /**
     * Sets the value of the usfrctPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Ownership1 setUsfrctPctg(BigDecimal value) {
        this.usfrctPctg = value;
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
