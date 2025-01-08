
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
 * Contents of the related UndertakingIssuance message or of the related issuance document.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingIssuanceMessage", propOrder = {
    "udrtkgDtls",
    "dgtlSgntr"
})
public class UndertakingIssuanceMessage {

    @XmlElement(name = "UdrtkgDtls", required = true)
    protected Undertaking3 udrtkgDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking3 }
     *     
     */
    public Undertaking3 getUdrtkgDtls() {
        return udrtkgDtls;
    }

    /**
     * Sets the value of the udrtkgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking3 }
     *     
     */
    public UndertakingIssuanceMessage setUdrtkgDtls(Undertaking3 value) {
        this.udrtkgDtls = value;
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
    public UndertakingIssuanceMessage setDgtlSgntr(PartyAndSignature2 value) {
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
