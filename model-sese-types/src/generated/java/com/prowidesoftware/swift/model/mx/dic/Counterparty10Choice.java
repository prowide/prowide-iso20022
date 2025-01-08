
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
 * Choice between buyer and seller.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Counterparty10Choice", propOrder = {
    "sellr",
    "buyr"
})
public class Counterparty10Choice {

    @XmlElement(name = "Sellr")
    protected PartyIdentificationAndAccount131 sellr;
    @XmlElement(name = "Buyr")
    protected PartyIdentificationAndAccount131 buyr;

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount131 }
     *     
     */
    public PartyIdentificationAndAccount131 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount131 }
     *     
     */
    public Counterparty10Choice setSellr(PartyIdentificationAndAccount131 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount131 }
     *     
     */
    public PartyIdentificationAndAccount131 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount131 }
     *     
     */
    public Counterparty10Choice setBuyr(PartyIdentificationAndAccount131 value) {
        this.buyr = value;
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
