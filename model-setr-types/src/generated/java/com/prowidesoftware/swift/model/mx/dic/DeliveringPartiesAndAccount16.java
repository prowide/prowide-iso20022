
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
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveringPartiesAndAccount16", propOrder = {
    "dlvrrsCtdnDtls",
    "dlvrrsIntrmy1Dtls",
    "dlvrrsIntrmy2Dtls",
    "dlvrgAgtDtls"
})
public class DeliveringPartiesAndAccount16 {

    @XmlElement(name = "DlvrrsCtdnDtls")
    protected PartyIdentificationAndAccount147 dlvrrsCtdnDtls;
    @XmlElement(name = "DlvrrsIntrmy1Dtls")
    protected PartyIdentificationAndAccount147 dlvrrsIntrmy1Dtls;
    @XmlElement(name = "DlvrrsIntrmy2Dtls")
    protected PartyIdentificationAndAccount147 dlvrrsIntrmy2Dtls;
    @XmlElement(name = "DlvrgAgtDtls", required = true)
    protected PartyIdentificationAndAccount147 dlvrgAgtDtls;

    /**
     * Gets the value of the dlvrrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getDlvrrsCtdnDtls() {
        return dlvrrsCtdnDtls;
    }

    /**
     * Sets the value of the dlvrrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public DeliveringPartiesAndAccount16 setDlvrrsCtdnDtls(PartyIdentificationAndAccount147 value) {
        this.dlvrrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrrsIntrmy1Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getDlvrrsIntrmy1Dtls() {
        return dlvrrsIntrmy1Dtls;
    }

    /**
     * Sets the value of the dlvrrsIntrmy1Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public DeliveringPartiesAndAccount16 setDlvrrsIntrmy1Dtls(PartyIdentificationAndAccount147 value) {
        this.dlvrrsIntrmy1Dtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrrsIntrmy2Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getDlvrrsIntrmy2Dtls() {
        return dlvrrsIntrmy2Dtls;
    }

    /**
     * Sets the value of the dlvrrsIntrmy2Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public DeliveringPartiesAndAccount16 setDlvrrsIntrmy2Dtls(PartyIdentificationAndAccount147 value) {
        this.dlvrrsIntrmy2Dtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getDlvrgAgtDtls() {
        return dlvrgAgtDtls;
    }

    /**
     * Sets the value of the dlvrgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public DeliveringPartiesAndAccount16 setDlvrgAgtDtls(PartyIdentificationAndAccount147 value) {
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
