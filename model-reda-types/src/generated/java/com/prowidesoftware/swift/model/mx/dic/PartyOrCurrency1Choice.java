
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
 * Choice of a depostory or settlement currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyOrCurrency1Choice", propOrder = {
    "dpstry",
    "sttlmCcy"
})
public class PartyOrCurrency1Choice {

    @XmlElement(name = "Dpstry")
    protected PartyIdentification63 dpstry;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification63 }
     *     
     */
    public PartyIdentification63 getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification63 }
     *     
     */
    public PartyOrCurrency1Choice setDpstry(PartyIdentification63 value) {
        this.dpstry = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyOrCurrency1Choice setSttlmCcy(String value) {
        this.sttlmCcy = value;
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
