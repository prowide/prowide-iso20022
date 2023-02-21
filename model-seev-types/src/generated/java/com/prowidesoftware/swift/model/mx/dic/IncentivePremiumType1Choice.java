
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
 * Choice of cash premium paid to the security holder when voting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentivePremiumType1Choice", propOrder = {
    "perScty",
    "perVote",
    "perAttndee"
})
public class IncentivePremiumType1Choice {

    @XmlElement(name = "PerScty")
    protected BigDecimal perScty;
    @XmlElement(name = "PerVote")
    protected BigDecimal perVote;
    @XmlElement(name = "PerAttndee")
    protected Boolean perAttndee;

    /**
     * Gets the value of the perScty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerScty() {
        return perScty;
    }

    /**
     * Sets the value of the perScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public IncentivePremiumType1Choice setPerScty(BigDecimal value) {
        this.perScty = value;
        return this;
    }

    /**
     * Gets the value of the perVote property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerVote() {
        return perVote;
    }

    /**
     * Sets the value of the perVote property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public IncentivePremiumType1Choice setPerVote(BigDecimal value) {
        this.perVote = value;
        return this;
    }

    /**
     * Gets the value of the perAttndee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerAttndee() {
        return perAttndee;
    }

    /**
     * Sets the value of the perAttndee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public IncentivePremiumType1Choice setPerAttndee(Boolean value) {
        this.perAttndee = value;
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
