
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "SettlementParties8", propOrder = {
    "dpstry",
    "pty1",
    "pty2",
    "pty3"
})
public class SettlementParties8 {

    @XmlElement(name = "Dpstry", required = true)
    protected PartyIdentification37 dpstry;
    @XmlElement(name = "Pty1", required = true)
    protected PartyIdentificationAndAccount22 pty1;
    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount22 pty2;
    @XmlElement(name = "Pty3")
    protected PartyIdentificationAndAccount22 pty3;

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification37 }
     *     
     */
    public PartyIdentification37 getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification37 }
     *     
     */
    public SettlementParties8 setDpstry(PartyIdentification37 value) {
        this.dpstry = value;
        return this;
    }

    /**
     * Gets the value of the pty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount22 }
     *     
     */
    public PartyIdentificationAndAccount22 getPty1() {
        return pty1;
    }

    /**
     * Sets the value of the pty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount22 }
     *     
     */
    public SettlementParties8 setPty1(PartyIdentificationAndAccount22 value) {
        this.pty1 = value;
        return this;
    }

    /**
     * Gets the value of the pty2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount22 }
     *     
     */
    public PartyIdentificationAndAccount22 getPty2() {
        return pty2;
    }

    /**
     * Sets the value of the pty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount22 }
     *     
     */
    public SettlementParties8 setPty2(PartyIdentificationAndAccount22 value) {
        this.pty2 = value;
        return this;
    }

    /**
     * Gets the value of the pty3 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount22 }
     *     
     */
    public PartyIdentificationAndAccount22 getPty3() {
        return pty3;
    }

    /**
     * Sets the value of the pty3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount22 }
     *     
     */
    public SettlementParties8 setPty3(PartyIdentificationAndAccount22 value) {
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
