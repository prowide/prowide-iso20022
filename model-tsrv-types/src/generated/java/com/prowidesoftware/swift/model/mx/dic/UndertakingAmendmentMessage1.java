
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
 * Contents of an Undertaking Amendment message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingAmendmentMessage1", propOrder = {
    "udrtkgAmdmntDtls",
    "dgtlSgntr"
})
public class UndertakingAmendmentMessage1 {

    @XmlElement(name = "UdrtkgAmdmntDtls", required = true)
    protected Amendment1 udrtkgAmdmntDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgAmdmntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Amendment1 }
     *     
     */
    public Amendment1 getUdrtkgAmdmntDtls() {
        return udrtkgAmdmntDtls;
    }

    /**
     * Sets the value of the udrtkgAmdmntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amendment1 }
     *     
     */
    public UndertakingAmendmentMessage1 setUdrtkgAmdmntDtls(Amendment1 value) {
        this.udrtkgAmdmntDtls = value;
        return this;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public PartyAndSignature2 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public UndertakingAmendmentMessage1 setDgtlSgntr(PartyAndSignature2 value) {
        this.dgtlSgntr = value;
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
