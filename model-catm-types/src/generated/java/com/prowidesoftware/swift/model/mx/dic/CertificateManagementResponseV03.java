
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
 * The CertificateManagementResponse is sent by a terminal manager in response to a CertificateManagementRequest to provide the outcome of the requested service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateManagementResponseV03", propOrder = {
    "hdr",
    "certMgmtRspn",
    "sctyTrlr"
})
public class CertificateManagementResponseV03 {

    @XmlElement(name = "Hdr", required = true)
    protected TMSHeader1 hdr;
    @XmlElement(name = "CertMgmtRspn", required = true)
    protected CertificateManagementResponse2 certMgmtRspn;
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
    public CertificateManagementResponseV03 setHdr(TMSHeader1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the certMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateManagementResponse2 }
     *     
     */
    public CertificateManagementResponse2 getCertMgmtRspn() {
        return certMgmtRspn;
    }

    /**
     * Sets the value of the certMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateManagementResponse2 }
     *     
     */
    public CertificateManagementResponseV03 setCertMgmtRspn(CertificateManagementResponse2 value) {
        this.certMgmtRspn = value;
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
    public CertificateManagementResponseV03 setSctyTrlr(ContentInformationType21 value) {
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
