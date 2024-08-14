
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
@XmlType(name = "SettlementParties28", propOrder = {
    "dpstry",
    "pty1",
    "pty2",
    "pty3"
})
public class SettlementParties28 {

    @XmlElement(name = "Dpstry")
    protected PartyIdentification49 dpstry;
    @XmlElement(name = "Pty1")
    protected PartyIdentificationAndAccount56 pty1;
    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount56 pty2;
    @XmlElement(name = "Pty3")
    protected PartyIdentificationAndAccount56 pty3;

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification49 }
     *     
     */
    public PartyIdentification49 getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification49 }
     *     
     */
    public SettlementParties28 setDpstry(PartyIdentification49 value) {
        this.dpstry = value;
        return this;
    }

    /**
     * Gets the value of the pty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount56 }
     *     
     */
    public PartyIdentificationAndAccount56 getPty1() {
        return pty1;
    }

    /**
     * Sets the value of the pty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount56 }
     *     
     */
    public SettlementParties28 setPty1(PartyIdentificationAndAccount56 value) {
        this.pty1 = value;
        return this;
    }

    /**
     * Gets the value of the pty2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount56 }
     *     
     */
    public PartyIdentificationAndAccount56 getPty2() {
        return pty2;
    }

    /**
     * Sets the value of the pty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount56 }
     *     
     */
    public SettlementParties28 setPty2(PartyIdentificationAndAccount56 value) {
        this.pty2 = value;
        return this;
    }

    /**
     * Gets the value of the pty3 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount56 }
     *     
     */
    public PartyIdentificationAndAccount56 getPty3() {
        return pty3;
    }

    /**
     * Sets the value of the pty3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount56 }
     *     
     */
    public SettlementParties28 setPty3(PartyIdentificationAndAccount56 value) {
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
