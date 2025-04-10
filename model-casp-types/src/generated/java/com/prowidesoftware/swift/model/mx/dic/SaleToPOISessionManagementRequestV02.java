
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
 * The SaleToPOISessionManagementRequest message is sent by a sale system to select an administrative service related to session management.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOISessionManagementRequestV02", propOrder = {
    "hdr",
    "ssnMgmtReq",
    "sctyTrlr"
})
public class SaleToPOISessionManagementRequestV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "SsnMgmtReq", required = true)
    protected SessionManagementRequest3 ssnMgmtReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType21 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header41 }
     *     
     */
    public Header41 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header41 }
     *     
     */
    public SaleToPOISessionManagementRequestV02 setHdr(Header41 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the ssnMgmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link SessionManagementRequest3 }
     *     
     */
    public SessionManagementRequest3 getSsnMgmtReq() {
        return ssnMgmtReq;
    }

    /**
     * Sets the value of the ssnMgmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionManagementRequest3 }
     *     
     */
    public SaleToPOISessionManagementRequestV02 setSsnMgmtReq(SessionManagementRequest3 value) {
        this.ssnMgmtReq = value;
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
    public SaleToPOISessionManagementRequestV02 setSctyTrlr(ContentInformationType21 value) {
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
