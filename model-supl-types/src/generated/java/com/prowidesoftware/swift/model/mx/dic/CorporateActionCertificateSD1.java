
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
 * Certificate information provided for a given corporate action instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionCertificateSD1", propOrder = {
    "certNb",
    "certSeqNb",
    "certRegnNm"
})
public class CorporateActionCertificateSD1 {

    @XmlElement(name = "CertNb", required = true)
    protected String certNb;
    @XmlElement(name = "CertSeqNb")
    protected String certSeqNb;
    @XmlElement(name = "CertRegnNm")
    protected String certRegnNm;

    /**
     * Gets the value of the certNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertNb() {
        return certNb;
    }

    /**
     * Sets the value of the certNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCertificateSD1 setCertNb(String value) {
        this.certNb = value;
        return this;
    }

    /**
     * Gets the value of the certSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertSeqNb() {
        return certSeqNb;
    }

    /**
     * Sets the value of the certSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCertificateSD1 setCertSeqNb(String value) {
        this.certSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the certRegnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertRegnNm() {
        return certRegnNm;
    }

    /**
     * Sets the value of the certRegnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCertificateSD1 setCertRegnNm(String value) {
        this.certRegnNm = value;
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
