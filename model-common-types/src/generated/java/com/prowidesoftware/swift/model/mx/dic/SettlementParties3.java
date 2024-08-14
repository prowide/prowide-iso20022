
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
 * Provides details about the settlement parties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties3", propOrder = {
    "dpstry",
    "pty1",
    "pty2",
    "pty3",
    "pty4",
    "pty5"
})
public class SettlementParties3 {

    @XmlElement(name = "Dpstry")
    protected PartyIdentification29 dpstry;
    @XmlElement(name = "Pty1")
    protected PartyIdentificationAndAccount10 pty1;
    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount10 pty2;
    @XmlElement(name = "Pty3")
    protected PartyIdentificationAndAccount10 pty3;
    @XmlElement(name = "Pty4")
    protected PartyIdentificationAndAccount10 pty4;
    @XmlElement(name = "Pty5")
    protected PartyIdentificationAndAccount10 pty5;

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification29 }
     *     
     */
    public PartyIdentification29 getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification29 }
     *     
     */
    public SettlementParties3 setDpstry(PartyIdentification29 value) {
        this.dpstry = value;
        return this;
    }

    /**
     * Gets the value of the pty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount10 }
     *     
     */
    public PartyIdentificationAndAccount10 getPty1() {
        return pty1;
    }

    /**
     * Sets the value of the pty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount10 }
     *     
     */
    public SettlementParties3 setPty1(PartyIdentificationAndAccount10 value) {
        this.pty1 = value;
        return this;
    }

    /**
     * Gets the value of the pty2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount10 }
     *     
     */
    public PartyIdentificationAndAccount10 getPty2() {
        return pty2;
    }

    /**
     * Sets the value of the pty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount10 }
     *     
     */
    public SettlementParties3 setPty2(PartyIdentificationAndAccount10 value) {
        this.pty2 = value;
        return this;
    }

    /**
     * Gets the value of the pty3 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount10 }
     *     
     */
    public PartyIdentificationAndAccount10 getPty3() {
        return pty3;
    }

    /**
     * Sets the value of the pty3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount10 }
     *     
     */
    public SettlementParties3 setPty3(PartyIdentificationAndAccount10 value) {
        this.pty3 = value;
        return this;
    }

    /**
     * Gets the value of the pty4 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount10 }
     *     
     */
    public PartyIdentificationAndAccount10 getPty4() {
        return pty4;
    }

    /**
     * Sets the value of the pty4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount10 }
     *     
     */
    public SettlementParties3 setPty4(PartyIdentificationAndAccount10 value) {
        this.pty4 = value;
        return this;
    }

    /**
     * Gets the value of the pty5 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount10 }
     *     
     */
    public PartyIdentificationAndAccount10 getPty5() {
        return pty5;
    }

    /**
     * Sets the value of the pty5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount10 }
     *     
     */
    public SettlementParties3 setPty5(PartyIdentificationAndAccount10 value) {
        this.pty5 = value;
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
