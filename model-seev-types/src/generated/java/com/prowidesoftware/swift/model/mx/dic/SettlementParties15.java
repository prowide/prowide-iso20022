
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
 * Specifies settlement parties (delivering/receiving).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties15", propOrder = {
    "dpstry",
    "pty1",
    "pty2",
    "pty3"
})
public class SettlementParties15 {

    @XmlElement(name = "Dpstry", required = true)
    protected PartyIdentification47 dpstry;
    @XmlElement(name = "Pty1", required = true)
    protected PartyIdentificationAndAccount51 pty1;
    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount51 pty2;
    @XmlElement(name = "Pty3")
    protected PartyIdentificationAndAccount51 pty3;

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification47 }
     *     
     */
    public PartyIdentification47 getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification47 }
     *     
     */
    public SettlementParties15 setDpstry(PartyIdentification47 value) {
        this.dpstry = value;
        return this;
    }

    /**
     * Gets the value of the pty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount51 }
     *     
     */
    public PartyIdentificationAndAccount51 getPty1() {
        return pty1;
    }

    /**
     * Sets the value of the pty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount51 }
     *     
     */
    public SettlementParties15 setPty1(PartyIdentificationAndAccount51 value) {
        this.pty1 = value;
        return this;
    }

    /**
     * Gets the value of the pty2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount51 }
     *     
     */
    public PartyIdentificationAndAccount51 getPty2() {
        return pty2;
    }

    /**
     * Sets the value of the pty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount51 }
     *     
     */
    public SettlementParties15 setPty2(PartyIdentificationAndAccount51 value) {
        this.pty2 = value;
        return this;
    }

    /**
     * Gets the value of the pty3 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount51 }
     *     
     */
    public PartyIdentificationAndAccount51 getPty3() {
        return pty3;
    }

    /**
     * Sets the value of the pty3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount51 }
     *     
     */
    public SettlementParties15 setPty3(PartyIdentificationAndAccount51 value) {
        this.pty3 = value;
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
