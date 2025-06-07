
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to the request of certificate management.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateManagementRequest1", propOrder = {
    "poiId",
    "tmId",
    "certSvc",
    "sctyDomn",
    "binryCertfctnReq",
    "certfctnReq",
    "clntCert",
    "whtListId"
})
public class CertificateManagementRequest1 {

    @XmlElement(name = "POIId", required = true)
    protected GenericIdentification72 poiId;
    @XmlElement(name = "TMId")
    protected GenericIdentification72 tmId;
    @XmlElement(name = "CertSvc", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType10Code certSvc;
    @XmlElement(name = "SctyDomn")
    protected String sctyDomn;
    @XmlElement(name = "BinryCertfctnReq")
    protected String binryCertfctnReq;
    @XmlElement(name = "CertfctnReq")
    protected CertificationRequest1 certfctnReq;
    @XmlElement(name = "ClntCert")
    protected byte[] clntCert;
    @XmlElement(name = "WhtListId")
    protected PointOfInteraction6 whtListId;

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification72 }
     *     
     */
    public GenericIdentification72 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification72 }
     *     
     */
    public CertificateManagementRequest1 setPOIId(GenericIdentification72 value) {
        this.poiId = value;
        return this;
    }

    /**
     * Gets the value of the tmId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification72 }
     *     
     */
    public GenericIdentification72 getTMId() {
        return tmId;
    }

    /**
     * Sets the value of the tmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification72 }
     *     
     */
    public CertificateManagementRequest1 setTMId(GenericIdentification72 value) {
        this.tmId = value;
        return this;
    }

    /**
     * Gets the value of the certSvc property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType10Code }
     *     
     */
    public CardPaymentServiceType10Code getCertSvc() {
        return certSvc;
    }

    /**
     * Sets the value of the certSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType10Code }
     *     
     */
    public CertificateManagementRequest1 setCertSvc(CardPaymentServiceType10Code value) {
        this.certSvc = value;
        return this;
    }

    /**
     * Gets the value of the sctyDomn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyDomn() {
        return sctyDomn;
    }

    /**
     * Sets the value of the sctyDomn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CertificateManagementRequest1 setSctyDomn(String value) {
        this.sctyDomn = value;
        return this;
    }

    /**
     * Gets the value of the binryCertfctnReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinryCertfctnReq() {
        return binryCertfctnReq;
    }

    /**
     * Sets the value of the binryCertfctnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CertificateManagementRequest1 setBinryCertfctnReq(String value) {
        this.binryCertfctnReq = value;
        return this;
    }

    /**
     * Gets the value of the certfctnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationRequest1 }
     *     
     */
    public CertificationRequest1 getCertfctnReq() {
        return certfctnReq;
    }

    /**
     * Sets the value of the certfctnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationRequest1 }
     *     
     */
    public CertificateManagementRequest1 setCertfctnReq(CertificationRequest1 value) {
        this.certfctnReq = value;
        return this;
    }

    /**
     * Gets the value of the clntCert property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getClntCert() {
        return clntCert;
    }

    /**
     * Sets the value of the clntCert property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CertificateManagementRequest1 setClntCert(byte[] value) {
        this.clntCert = value;
        return this;
    }

    /**
     * Gets the value of the whtListId property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction6 }
     *     
     */
    public PointOfInteraction6 getWhtListId() {
        return whtListId;
    }

    /**
     * Sets the value of the whtListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction6 }
     *     
     */
    public CertificateManagementRequest1 setWhtListId(PointOfInteraction6 value) {
        this.whtListId = value;
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
