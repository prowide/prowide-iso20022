
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
@XmlType(name = "TotalValueInPageAndStatement1", propOrder = {
    "ttlHldgsValOfPg",
    "ttlHldgsValOfStmt",
    "ttlBookValOfStmt",
    "ttlElgblCollVal"
})
public class TotalValueInPageAndStatement1 {

    @XmlElement(name = "TtlHldgsValOfPg")
    protected AmountAndDirection6 ttlHldgsValOfPg;
    @XmlElement(name = "TtlHldgsValOfStmt", required = true)
    protected AmountAndDirection6 ttlHldgsValOfStmt;
    @XmlElement(name = "TtlBookValOfStmt")
    protected AmountAndDirection6 ttlBookValOfStmt;
    @XmlElement(name = "TtlElgblCollVal")
    protected AmountAndDirection6 ttlElgblCollVal;

    /**
     * Gets the value of the ttlHldgsValOfPg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getTtlHldgsValOfPg() {
        return ttlHldgsValOfPg;
    }

    /**
     * Sets the value of the ttlHldgsValOfPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public TotalValueInPageAndStatement1 setTtlHldgsValOfPg(AmountAndDirection6 value) {
        this.ttlHldgsValOfPg = value;
        return this;
    }

    /**
     * Gets the value of the ttlHldgsValOfStmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getTtlHldgsValOfStmt() {
        return ttlHldgsValOfStmt;
    }

    /**
     * Sets the value of the ttlHldgsValOfStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public TotalValueInPageAndStatement1 setTtlHldgsValOfStmt(AmountAndDirection6 value) {
        this.ttlHldgsValOfStmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlBookValOfStmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getTtlBookValOfStmt() {
        return ttlBookValOfStmt;
    }

    /**
     * Sets the value of the ttlBookValOfStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public TotalValueInPageAndStatement1 setTtlBookValOfStmt(AmountAndDirection6 value) {
        this.ttlBookValOfStmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlElgblCollVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getTtlElgblCollVal() {
        return ttlElgblCollVal;
    }

    /**
     * Sets the value of the ttlElgblCollVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public TotalValueInPageAndStatement1 setTtlElgblCollVal(AmountAndDirection6 value) {
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
