
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
@XmlType(name = "ReceivingPartiesAndAccount16", propOrder = {
    "rcvrsCtdnDtls",
    "rcvrsIntrmy1Dtls",
    "rcvrsIntrmy2Dtls",
    "rcvgAgtDtls"
})
public class ReceivingPartiesAndAccount16 {

    @XmlElement(name = "RcvrsCtdnDtls")
    protected PartyIdentificationAndAccount147 rcvrsCtdnDtls;
    @XmlElement(name = "RcvrsIntrmy1Dtls")
    protected PartyIdentificationAndAccount147 rcvrsIntrmy1Dtls;
    @XmlElement(name = "RcvrsIntrmy2Dtls")
    protected PartyIdentificationAndAccount147 rcvrsIntrmy2Dtls;
    @XmlElement(name = "RcvgAgtDtls", required = true)
    protected PartyIdentificationAndAccount147 rcvgAgtDtls;

    /**
     * Gets the value of the rcvrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getRcvrsCtdnDtls() {
        return rcvrsCtdnDtls;
    }

    /**
     * Sets the value of the rcvrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public ReceivingPartiesAndAccount16 setRcvrsCtdnDtls(PartyIdentificationAndAccount147 value) {
        this.rcvrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsIntrmy1Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getRcvrsIntrmy1Dtls() {
        return rcvrsIntrmy1Dtls;
    }

    /**
     * Sets the value of the rcvrsIntrmy1Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public ReceivingPartiesAndAccount16 setRcvrsIntrmy1Dtls(PartyIdentificationAndAccount147 value) {
        this.rcvrsIntrmy1Dtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsIntrmy2Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getRcvrsIntrmy2Dtls() {
        return rcvrsIntrmy2Dtls;
    }

    /**
     * Sets the value of the rcvrsIntrmy2Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public ReceivingPartiesAndAccount16 setRcvrsIntrmy2Dtls(PartyIdentificationAndAccount147 value) {
        this.rcvrsIntrmy2Dtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getRcvgAgtDtls() {
        return rcvgAgtDtls;
    }

    /**
     * Sets the value of the rcvgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public ReceivingPartiesAndAccount16 setRcvgAgtDtls(PartyIdentificationAndAccount147 value) {
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
