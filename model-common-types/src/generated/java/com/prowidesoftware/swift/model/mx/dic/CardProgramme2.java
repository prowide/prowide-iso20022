
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Card programme or brand related to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardProgramme2", propOrder = {
    "cardPrgrmmPropsd",
    "cardPrgrmmApld"
})
public class CardProgramme2 {

    @XmlElement(name = "CardPrgrmmPropsd")
    protected List<CardProgrammeMode2> cardPrgrmmPropsd;
    @XmlElement(name = "CardPrgrmmApld")
    protected CardProgrammeMode3 cardPrgrmmApld;

    /**
     * Gets the value of the cardPrgrmmPropsd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cardPrgrmmPropsd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardPrgrmmPropsd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardProgrammeMode2 }
     * 
     * 
     * @return
     *     The value of the cardPrgrmmPropsd property.
     */
    public List<CardProgrammeMode2> getCardPrgrmmPropsd() {
        if (cardPrgrmmPropsd == null) {
            cardPrgrmmPropsd = new ArrayList<>();
        }
        return this.cardPrgrmmPropsd;
    }

    /**
     * Gets the value of the cardPrgrmmApld property.
     * 
     * @return
     *     possible object is
     *     {@link CardProgrammeMode3 }
     *     
     */
    public CardProgrammeMode3 getCardPrgrmmApld() {
        return cardPrgrmmApld;
    }

    /**
     * Sets the value of the cardPrgrmmApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProgrammeMode3 }
     *     
     */
    public CardProgramme2 setCardPrgrmmApld(CardProgrammeMode3 value) {
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

    /**
     * Adds a new item to the cardPrgrmmPropsd list.
     * @see #getCardPrgrmmPropsd()
     * 
     */
    public CardProgramme2 addCardPrgrmmPropsd(CardProgrammeMode2 cardPrgrmmPropsd) {
        getCardPrgrmmPropsd().add(cardPrgrmmPropsd);
        return this;
    }

}
