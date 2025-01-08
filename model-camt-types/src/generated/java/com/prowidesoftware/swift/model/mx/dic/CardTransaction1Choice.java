
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
 * Choice between a acquirer globalised card transaction or an individual card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction1Choice", propOrder = {
    "aggtd",
    "indv"
})
public class CardTransaction1Choice {

    @XmlElement(name = "Aggtd")
    protected CardAggregated1 aggtd;
    @XmlElement(name = "Indv")
    protected CardIndividualTransaction1 indv;

    /**
     * Gets the value of the aggtd property.
     * 
     * @return
     *     possible object is
     *     {@link CardAggregated1 }
     *     
     */
    public CardAggregated1 getAggtd() {
        return aggtd;
    }

    /**
     * Sets the value of the aggtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAggregated1 }
     *     
     */
    public CardTransaction1Choice setAggtd(CardAggregated1 value) {
        this.aggtd = value;
        return this;
    }

    /**
     * Gets the value of the indv property.
     * 
     * @return
     *     possible object is
     *     {@link CardIndividualTransaction1 }
     *     
     */
    public CardIndividualTransaction1 getIndv() {
        return indv;
    }

    /**
     * Sets the value of the indv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIndividualTransaction1 }
     *     
     */
    public CardTransaction1Choice setIndv(CardIndividualTransaction1 value) {
        this.indv = value;
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
