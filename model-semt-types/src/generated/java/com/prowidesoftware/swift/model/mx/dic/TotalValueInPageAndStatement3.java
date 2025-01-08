
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
 * Totals for the value of the holdings reported in the statement or page.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalValueInPageAndStatement3", propOrder = {
    "ttlHldgsValOfPg",
    "ttlHldgsValOfStmt",
    "ttlBookValOfStmt",
    "ttlElgblCollVal"
})
public class TotalValueInPageAndStatement3 {

    @XmlElement(name = "TtlHldgsValOfPg")
    protected AmountAndDirection14 ttlHldgsValOfPg;
    @XmlElement(name = "TtlHldgsValOfStmt", required = true)
    protected AmountAndDirection14 ttlHldgsValOfStmt;
    @XmlElement(name = "TtlBookValOfStmt")
    protected AmountAndDirection14 ttlBookValOfStmt;
    @XmlElement(name = "TtlElgblCollVal")
    protected AmountAndDirection14 ttlElgblCollVal;

    /**
     * Gets the value of the ttlHldgsValOfPg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getTtlHldgsValOfPg() {
        return ttlHldgsValOfPg;
    }

    /**
     * Sets the value of the ttlHldgsValOfPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public TotalValueInPageAndStatement3 setTtlHldgsValOfPg(AmountAndDirection14 value) {
        this.ttlHldgsValOfPg = value;
        return this;
    }

    /**
     * Gets the value of the ttlHldgsValOfStmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getTtlHldgsValOfStmt() {
        return ttlHldgsValOfStmt;
    }

    /**
     * Sets the value of the ttlHldgsValOfStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public TotalValueInPageAndStatement3 setTtlHldgsValOfStmt(AmountAndDirection14 value) {
        this.ttlHldgsValOfStmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlBookValOfStmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getTtlBookValOfStmt() {
        return ttlBookValOfStmt;
    }

    /**
     * Sets the value of the ttlBookValOfStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public TotalValueInPageAndStatement3 setTtlBookValOfStmt(AmountAndDirection14 value) {
        this.ttlBookValOfStmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlElgblCollVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getTtlElgblCollVal() {
        return ttlElgblCollVal;
    }

    /**
     * Sets the value of the ttlElgblCollVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public TotalValueInPageAndStatement3 setTtlElgblCollVal(AmountAndDirection14 value) {
        this.ttlElgblCollVal = value;
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
