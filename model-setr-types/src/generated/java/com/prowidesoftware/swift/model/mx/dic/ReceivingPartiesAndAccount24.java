
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
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivingPartiesAndAccount24", propOrder = {
    "rcvrsCtdnDtls",
    "rcvrsIntrmy1Dtls",
    "rcvrsIntrmy2Dtls",
    "rcvgAgtDtls"
})
public class ReceivingPartiesAndAccount24 {

    @XmlElement(name = "RcvrsCtdnDtls")
    protected PartyIdentificationAndAccount235 rcvrsCtdnDtls;
    @XmlElement(name = "RcvrsIntrmy1Dtls")
    protected PartyIdentificationAndAccount235 rcvrsIntrmy1Dtls;
    @XmlElement(name = "RcvrsIntrmy2Dtls")
    protected PartyIdentificationAndAccount235 rcvrsIntrmy2Dtls;
    @XmlElement(name = "RcvgAgtDtls", required = true)
    protected PartyIdentificationAndAccount235 rcvgAgtDtls;

    /**
     * Gets the value of the rcvrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public PartyIdentificationAndAccount235 getRcvrsCtdnDtls() {
        return rcvrsCtdnDtls;
    }

    /**
     * Sets the value of the rcvrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public ReceivingPartiesAndAccount24 setRcvrsCtdnDtls(PartyIdentificationAndAccount235 value) {
        this.rcvrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsIntrmy1Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public PartyIdentificationAndAccount235 getRcvrsIntrmy1Dtls() {
        return rcvrsIntrmy1Dtls;
    }

    /**
     * Sets the value of the rcvrsIntrmy1Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public ReceivingPartiesAndAccount24 setRcvrsIntrmy1Dtls(PartyIdentificationAndAccount235 value) {
        this.rcvrsIntrmy1Dtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsIntrmy2Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public PartyIdentificationAndAccount235 getRcvrsIntrmy2Dtls() {
        return rcvrsIntrmy2Dtls;
    }

    /**
     * Sets the value of the rcvrsIntrmy2Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public ReceivingPartiesAndAccount24 setRcvrsIntrmy2Dtls(PartyIdentificationAndAccount235 value) {
        this.rcvrsIntrmy2Dtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public PartyIdentificationAndAccount235 getRcvgAgtDtls() {
        return rcvgAgtDtls;
    }

    /**
     * Sets the value of the rcvgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public ReceivingPartiesAndAccount24 setRcvgAgtDtls(PartyIdentificationAndAccount235 value) {
        this.rcvgAgtDtls = value;
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
