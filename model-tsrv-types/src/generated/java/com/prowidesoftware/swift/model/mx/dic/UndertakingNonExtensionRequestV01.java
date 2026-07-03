
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
 * The UndertakingNonExtensionRequest message is sent by the party that requested issuance of the undertaking (applicant or obligor) to the party that issued the undertaking. It is used to request no further automatic extensions to the expiry of the referenced undertaking.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingNonExtensionRequestV01", propOrder = {
    "udrtkgNonXtnsnReqDtls",
    "dgtlSgntr"
})
public class UndertakingNonExtensionRequestV01 {

    @XmlElement(name = "UdrtkgNonXtnsnReqDtls", required = true)
    protected UndertakingNonExtensionRequest1 udrtkgNonXtnsnReqDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgNonXtnsnReqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingNonExtensionRequest1 }
     *     
     */
    public UndertakingNonExtensionRequest1 getUdrtkgNonXtnsnReqDtls() {
        return udrtkgNonXtnsnReqDtls;
    }

    /**
     * Sets the value of the udrtkgNonXtnsnReqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingNonExtensionRequest1 }
     *     
     */
    public UndertakingNonExtensionRequestV01 setUdrtkgNonXtnsnReqDtls(UndertakingNonExtensionRequest1 value) {
        this.udrtkgNonXtnsnReqDtls = value;
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
    public UndertakingNonExtensionRequestV01 setDgtlSgntr(PartyAndSignature2 value) {
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
