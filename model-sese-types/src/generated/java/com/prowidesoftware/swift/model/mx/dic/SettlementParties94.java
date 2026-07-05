
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
 * Chain of parties involved in the settlement of a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties94", propOrder = {
    "dpstry",
    "pty1",
    "pty2",
    "pty3",
    "pty4",
    "pty5"
})
public class SettlementParties94 {

    @XmlElement(name = "Dpstry")
    protected PartyIdentification141 dpstry;
    @XmlElement(name = "Pty1")
    protected PartyIdentificationAndAccount194 pty1;
    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount194 pty2;
    @XmlElement(name = "Pty3")
    protected PartyIdentificationAndAccount194 pty3;
    @XmlElement(name = "Pty4")
    protected PartyIdentificationAndAccount194 pty4;
    @XmlElement(name = "Pty5")
    protected PartyIdentificationAndAccount194 pty5;

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification141 }
     *     
     */
    public PartyIdentification141 getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification141 }
     *     
     */
    public SettlementParties94 setDpstry(PartyIdentification141 value) {
        this.dpstry = value;
        return this;
    }

    /**
     * Gets the value of the pty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount194 }
     *     
     */
    public PartyIdentificationAndAccount194 getPty1() {
        return pty1;
    }

    /**
     * Sets the value of the pty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount194 }
     *     
     */
    public SettlementParties94 setPty1(PartyIdentificationAndAccount194 value) {
        this.pty1 = value;
        return this;
    }

    /**
     * Gets the value of the pty2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount194 }
     *     
     */
    public PartyIdentificationAndAccount194 getPty2() {
        return pty2;
    }

    /**
     * Sets the value of the pty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount194 }
     *     
     */
    public SettlementParties94 setPty2(PartyIdentificationAndAccount194 value) {
        this.pty2 = value;
        return this;
    }

    /**
     * Gets the value of the pty3 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount194 }
     *     
     */
    public PartyIdentificationAndAccount194 getPty3() {
        return pty3;
    }

    /**
     * Sets the value of the pty3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount194 }
     *     
     */
    public SettlementParties94 setPty3(PartyIdentificationAndAccount194 value) {
        this.pty3 = value;
        return this;
    }

    /**
     * Gets the value of the pty4 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount194 }
     *     
     */
    public PartyIdentificationAndAccount194 getPty4() {
        return pty4;
    }

    /**
     * Sets the value of the pty4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount194 }
     *     
     */
    public SettlementParties94 setPty4(PartyIdentificationAndAccount194 value) {
        this.pty4 = value;
        return this;
    }

    /**
     * Gets the value of the pty5 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount194 }
     *     
     */
    public PartyIdentificationAndAccount194 getPty5() {
        return pty5;
    }

    /**
     * Sets the value of the pty5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount194 }
     *     
     */
    public SettlementParties94 setPty5(PartyIdentificationAndAccount194 value) {
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
