
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
 * Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveringPartiesAndAccount19", propOrder = {
    "dpstry",
    "pty1",
    "pty2"
})
public class DeliveringPartiesAndAccount19 {

    @XmlElement(name = "Dpstry", required = true)
    protected PartyIdentification239Choice dpstry;
    @XmlElement(name = "Pty1", required = true)
    protected PartyIdentificationAndAccount200 pty1;
    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount201 pty2;

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification239Choice }
     *     
     */
    public PartyIdentification239Choice getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification239Choice }
     *     
     */
    public DeliveringPartiesAndAccount19 setDpstry(PartyIdentification239Choice value) {
        this.dpstry = value;
        return this;
    }

    /**
     * Gets the value of the pty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount200 }
     *     
     */
    public PartyIdentificationAndAccount200 getPty1() {
        return pty1;
    }

    /**
     * Sets the value of the pty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount200 }
     *     
     */
    public DeliveringPartiesAndAccount19 setPty1(PartyIdentificationAndAccount200 value) {
        this.pty1 = value;
        return this;
    }

    /**
     * Gets the value of the pty2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount201 }
     *     
     */
    public PartyIdentificationAndAccount201 getPty2() {
        return pty2;
    }

    /**
     * Sets the value of the pty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount201 }
     *     
     */
    public DeliveringPartiesAndAccount19 setPty2(PartyIdentificationAndAccount201 value) {
        this.pty2 = value;
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
