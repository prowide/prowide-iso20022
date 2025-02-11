
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
 * Context of the card payment transaction
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionContext5", propOrder = {
    "cardPrgrmmApld"
})
public class TransactionContext5 {

    @XmlElement(name = "CardPrgrmmApld")
    protected CardProgrammeMode1 cardPrgrmmApld;

    /**
     * Gets the value of the cardPrgrmmApld property.
     * 
     * @return
     *     possible object is
     *     {@link CardProgrammeMode1 }
     *     
     */
    public CardProgrammeMode1 getCardPrgrmmApld() {
        return cardPrgrmmApld;
    }

    /**
     * Sets the value of the cardPrgrmmApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProgrammeMode1 }
     *     
     */
    public TransactionContext5 setCardPrgrmmApld(CardProgrammeMode1 value) {
        this.cardPrgrmmApld = value;
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
