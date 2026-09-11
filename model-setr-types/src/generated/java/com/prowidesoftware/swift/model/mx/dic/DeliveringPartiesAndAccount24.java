
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
@XmlType(name = "DeliveringPartiesAndAccount24", propOrder = {
    "dlvrrsCtdnDtls",
    "dlvrrsIntrmy1Dtls",
    "dlvrrsIntrmy2Dtls",
    "dlvrgAgtDtls"
})
public class DeliveringPartiesAndAccount24 {

    @XmlElement(name = "DlvrrsCtdnDtls")
    protected PartyIdentificationAndAccount235 dlvrrsCtdnDtls;
    @XmlElement(name = "DlvrrsIntrmy1Dtls")
    protected PartyIdentificationAndAccount235 dlvrrsIntrmy1Dtls;
    @XmlElement(name = "DlvrrsIntrmy2Dtls")
    protected PartyIdentificationAndAccount235 dlvrrsIntrmy2Dtls;
    @XmlElement(name = "DlvrgAgtDtls", required = true)
    protected PartyIdentificationAndAccount235 dlvrgAgtDtls;

    /**
     * Gets the value of the dlvrrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public PartyIdentificationAndAccount235 getDlvrrsCtdnDtls() {
        return dlvrrsCtdnDtls;
    }

    /**
     * Sets the value of the dlvrrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public DeliveringPartiesAndAccount24 setDlvrrsCtdnDtls(PartyIdentificationAndAccount235 value) {
        this.dlvrrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrrsIntrmy1Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public PartyIdentificationAndAccount235 getDlvrrsIntrmy1Dtls() {
        return dlvrrsIntrmy1Dtls;
    }

    /**
     * Sets the value of the dlvrrsIntrmy1Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public DeliveringPartiesAndAccount24 setDlvrrsIntrmy1Dtls(PartyIdentificationAndAccount235 value) {
        this.dlvrrsIntrmy1Dtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrrsIntrmy2Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public PartyIdentificationAndAccount235 getDlvrrsIntrmy2Dtls() {
        return dlvrrsIntrmy2Dtls;
    }

    /**
     * Sets the value of the dlvrrsIntrmy2Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public DeliveringPartiesAndAccount24 setDlvrrsIntrmy2Dtls(PartyIdentificationAndAccount235 value) {
        this.dlvrrsIntrmy2Dtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public PartyIdentificationAndAccount235 getDlvrgAgtDtls() {
        return dlvrgAgtDtls;
    }

    /**
     * Sets the value of the dlvrgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount235 }
     *     
     */
    public DeliveringPartiesAndAccount24 setDlvrgAgtDtls(PartyIdentificationAndAccount235 value) {
        this.dlvrgAgtDtls = value;
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
