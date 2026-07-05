
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
 * The UndertakingAmendmentResponse message is sent by the beneficiary to the party that issued the undertaking, either directly or via one or more advising parties, to indicate acceptance or rejection by the beneficiary of the amendment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingAmendmentResponseV01", propOrder = {
    "udrtkgAmdmntRspnDtls",
    "dgtlSgntr"
})
public class UndertakingAmendmentResponseV01 {

    @XmlElement(name = "UdrtkgAmdmntRspnDtls", required = true)
    protected Amendment7 udrtkgAmdmntRspnDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgAmdmntRspnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Amendment7 }
     *     
     */
    public Amendment7 getUdrtkgAmdmntRspnDtls() {
        return udrtkgAmdmntRspnDtls;
    }

    /**
     * Sets the value of the udrtkgAmdmntRspnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amendment7 }
     *     
     */
    public UndertakingAmendmentResponseV01 setUdrtkgAmdmntRspnDtls(Amendment7 value) {
        this.udrtkgAmdmntRspnDtls = value;
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
    public UndertakingAmendmentResponseV01 setDgtlSgntr(PartyAndSignature2 value) {
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
