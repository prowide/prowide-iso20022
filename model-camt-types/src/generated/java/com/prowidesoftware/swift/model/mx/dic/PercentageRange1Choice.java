
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
 * Choice between ranges of rates in which a percentage rate is considered valid or a specified percentage rate which has to be matched or unmatched to be valid.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageRange1Choice", propOrder = {
    "fr",
    "to",
    "frTo",
    "eq",
    "neq"
})
public class PercentageRange1Choice {

    @XmlElement(name = "Fr")
    protected PercentageRangeBoundary1 fr;
    @XmlElement(name = "To")
    protected PercentageRangeBoundary1 to;
    @XmlElement(name = "FrTo")
    protected FromToPercentageRange1 frTo;
    @XmlElement(name = "EQ")
    protected BigDecimal eq;
    @XmlElement(name = "NEQ")
    protected BigDecimal neq;

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageRangeBoundary1 }
     *     
     */
    public PercentageRangeBoundary1 getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageRangeBoundary1 }
     *     
     */
    public PercentageRange1Choice setFr(PercentageRangeBoundary1 value) {
        this.fr = value;
        return this;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageRangeBoundary1 }
     *     
     */
    public PercentageRangeBoundary1 getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageRangeBoundary1 }
     *     
     */
    public PercentageRange1Choice setTo(PercentageRangeBoundary1 value) {
        this.to = value;
        return this;
    }

    /**
     * Gets the value of the frTo property.
     * 
     * @return
     *     possible object is
     *     {@link FromToPercentageRange1 }
     *     
     */
    public FromToPercentageRange1 getFrTo() {
        return frTo;
    }

    /**
     * Sets the value of the frTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromToPercentageRange1 }
     *     
     */
    public PercentageRange1Choice setFrTo(FromToPercentageRange1 value) {
        this.frTo = value;
        return this;
    }

    /**
     * Gets the value of the eq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEQ() {
        return eq;
    }

    /**
     * Sets the value of the eq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PercentageRange1Choice setEQ(BigDecimal value) {
        this.eq = value;
        return this;
    }

    /**
     * Gets the value of the neq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNEQ() {
        return neq;
    }

    /**
     * Sets the value of the neq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PercentageRange1Choice setNEQ(BigDecimal value) {
        this.neq = value;
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
