
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to the result of the certificate management request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateManagementResponse2", propOrder = {
    "poiId",
    "tmId",
    "certSvc",
    "rslt",
    "sctyPrfl",
    "clntCert",
    "clntCertPth",
    "svrCertPth"
})
public class CertificateManagementResponse2 {

    @XmlElement(name = "POIId", required = true)
    protected GenericIdentification176 poiId;
    @XmlElement(name = "TMId")
    protected GenericIdentification176 tmId;
    @XmlElement(name = "CertSvc", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType10Code certSvc;
    @XmlElement(name = "Rslt", required = true)
    protected ResponseType6 rslt;
    @XmlElement(name = "SctyPrfl")
    protected String sctyPrfl;
    @XmlElement(name = "ClntCert")
    protected byte[] clntCert;
    @XmlElement(name = "ClntCertPth")
    protected List<byte[]> clntCertPth;
    @XmlElement(name = "SvrCertPth")
    protected List<byte[]> svrCertPth;

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public CertificateManagementResponse2 setPOIId(GenericIdentification176 value) {
        this.poiId = value;
        return this;
    }

    /**
     * Gets the value of the tmId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getTMId() {
        return tmId;
    }

    /**
     * Sets the value of the tmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public CertificateManagementResponse2 setTMId(GenericIdentification176 value) {
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
    public CertificateManagementResponse2 setCertSvc(CardPaymentServiceType10Code value) {
        this.certSvc = value;
        return this;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType6 }
     *     
     */
    public ResponseType6 getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType6 }
     *     
     */
    public CertificateManagementResponse2 setRslt(ResponseType6 value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the sctyPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyPrfl() {
        return sctyPrfl;
    }

    /**
     * Sets the value of the sctyPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CertificateManagementResponse2 setSctyPrfl(String value) {
        this.sctyPrfl = value;
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
    public CertificateManagementResponse2 setClntCert(byte[] value) {
        this.clntCert = value;
        return this;
    }

    /**
     * Gets the value of the clntCertPth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clntCertPth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClntCertPth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the clntCertPth property.
     */
    public List<byte[]> getClntCertPth() {
        if (clntCertPth == null) {
            clntCertPth = new ArrayList<>();
        }
        return this.clntCertPth;
    }

    /**
     * Gets the value of the svrCertPth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svrCertPth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvrCertPth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the svrCertPth property.
     */
    public List<byte[]> getSvrCertPth() {
        if (svrCertPth == null) {
            svrCertPth = new ArrayList<>();
        }
        return this.svrCertPth;
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

    /**
     * Adds a new item to the clntCertPth list.
     * @see #getClntCertPth()
     * 
     */
    public CertificateManagementResponse2 addClntCertPth(byte[] clntCertPth) {
        getClntCertPth().add(clntCertPth);
        return this;
    }

    /**
     * Adds a new item to the svrCertPth list.
     * @see #getSvrCertPth()
     * 
     */
    public CertificateManagementResponse2 addSvrCertPth(byte[] svrCertPth) {
        getSvrCertPth().add(svrCertPth);
        return this;
    }

}
