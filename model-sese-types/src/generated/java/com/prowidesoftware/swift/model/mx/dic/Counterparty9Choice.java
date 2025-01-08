
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
@XmlType(name = "Counterparty9Choice", propOrder = {
    "sellr",
    "buyr"
})
public class Counterparty9Choice {

    @XmlElement(name = "Sellr")
    protected PartyIdentificationAndAccount106 sellr;
    @XmlElement(name = "Buyr")
    protected PartyIdentificationAndAccount106 buyr;

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount106 }
     *     
     */
    public PartyIdentificationAndAccount106 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount106 }
     *     
     */
    public Counterparty9Choice setSellr(PartyIdentificationAndAccount106 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount106 }
     *     
     */
    public PartyIdentificationAndAccount106 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount106 }
     *     
     */
    public Counterparty9Choice setBuyr(PartyIdentificationAndAccount106 value) {
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
