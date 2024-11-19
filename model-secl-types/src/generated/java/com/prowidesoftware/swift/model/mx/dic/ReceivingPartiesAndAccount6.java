
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
 * Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivingPartiesAndAccount6", propOrder = {
    "rcvgAgt",
    "dpstry",
    "sctiesSttlmSys"
})
public class ReceivingPartiesAndAccount6 {

    @XmlElement(name = "RcvgAgt", required = true)
    protected PartyIdentificationAndAccount32 rcvgAgt;
    @XmlElement(name = "Dpstry", required = true)
    protected PartyIdentification34Choice dpstry;
    @XmlElement(name = "SctiesSttlmSys")
    protected String sctiesSttlmSys;

    /**
     * Gets the value of the rcvgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount32 }
     *     
     */
    public PartyIdentificationAndAccount32 getRcvgAgt() {
        return rcvgAgt;
    }

    /**
     * Sets the value of the rcvgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount32 }
     *     
     */
    public ReceivingPartiesAndAccount6 setRcvgAgt(PartyIdentificationAndAccount32 value) {
        this.rcvgAgt = value;
        return this;
    }

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public PartyIdentification34Choice getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public ReceivingPartiesAndAccount6 setDpstry(PartyIdentification34Choice value) {
        this.dpstry = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmSys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesSttlmSys() {
        return sctiesSttlmSys;
    }

    /**
     * Sets the value of the sctiesSttlmSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReceivingPartiesAndAccount6 setSctiesSttlmSys(String value) {
        this.sctiesSttlmSys = value;
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
