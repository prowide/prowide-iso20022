
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
 * The CertificateManagementRequest message is sent by a POI terminal or any intermediary entity either to a terminal manager acting as a certificate authority for managing X.509 certificate of a public key owned by the initiating party, or for requesting the inclusion or the removal of the POI to a white list of the terminal manager.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateManagementRequestV03", propOrder = {
    "hdr",
    "certMgmtReq",
    "sctyTrlr"
})
public class CertificateManagementRequestV03 {

    @XmlElement(name = "Hdr", required = true)
    protected TMSHeader1 hdr;
    @XmlElement(name = "CertMgmtReq", required = true)
    protected CertificateManagementRequest2 certMgmtReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType21 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link TMSHeader1 }
     *     
     */
    public TMSHeader1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSHeader1 }
     *     
     */
    public CertificateManagementRequestV03 setHdr(TMSHeader1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the certMgmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateManagementRequest2 }
     *     
     */
    public CertificateManagementRequest2 getCertMgmtReq() {
        return certMgmtReq;
    }

    /**
     * Sets the value of the certMgmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateManagementRequest2 }
     *     
     */
    public CertificateManagementRequestV03 setCertMgmtReq(CertificateManagementRequest2 value) {
        this.certMgmtReq = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType21 }
     *     
     */
    public ContentInformationType21 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType21 }
     *     
     */
    public CertificateManagementRequestV03 setSctyTrlr(ContentInformationType21 value) {
        this.sctyTrlr = value;
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
