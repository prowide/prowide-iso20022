
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "CertificateManagementRequest3", propOrder = {
    "poiId",
    "tmId",
    "certSvc",
    "sctyDomn",
    "keyFctn",
    "poiChllngVal",
    "poiDtTm",
    "binryCertfctnReq",
    "certfctnReq",
    "clntCert",
    "whtListId"
})
public class CertificateManagementRequest3 {

    @XmlElement(name = "POIId", required = true)
    protected GenericIdentification176 poiId;
    @XmlElement(name = "TMId")
    protected GenericIdentification176 tmId;
    @XmlElement(name = "CertSvc", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType10Code certSvc;
    @XmlElement(name = "SctyDomn")
    protected String sctyDomn;
    @XmlElement(name = "KeyFctn")
    @XmlSchemaType(name = "string")
    protected List<KeyUsage1Code> keyFctn;
    @XmlElement(name = "POIChllngVal", required = true)
    protected byte[] poiChllngVal;
    @XmlElement(name = "POIDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar poiDtTm;
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
    public CertificateManagementRequest3 setPOIId(GenericIdentification176 value) {
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
    public CertificateManagementRequest3 setTMId(GenericIdentification176 value) {
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
    public CertificateManagementRequest3 setCertSvc(CardPaymentServiceType10Code value) {
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
    public CertificateManagementRequest3 setSctyDomn(String value) {
        this.sctyDomn = value;
        return this;
    }

    /**
     * Gets the value of the keyFctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyFctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyFctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyUsage1Code }
     * 
     * 
     */
    public List<KeyUsage1Code> getKeyFctn() {
        if (keyFctn == null) {
            keyFctn = new ArrayList<KeyUsage1Code>();
        }
        return this.keyFctn;
    }

    /**
     * Gets the value of the poiChllngVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPOIChllngVal() {
        return poiChllngVal;
    }

    /**
     * Sets the value of the poiChllngVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CertificateManagementRequest3 setPOIChllngVal(byte[] value) {
        this.poiChllngVal = value;
        return this;
    }

    /**
     * Gets the value of the poiDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPOIDtTm() {
        return poiDtTm;
    }

    /**
     * Sets the value of the poiDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CertificateManagementRequest3 setPOIDtTm(XMLGregorianCalendar value) {
        this.poiDtTm = value;
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
    public CertificateManagementRequest3 setBinryCertfctnReq(String value) {
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
    public CertificateManagementRequest3 setCertfctnReq(CertificationRequest1 value) {
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
    public CertificateManagementRequest3 setClntCert(byte[] value) {
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
    public CertificateManagementRequest3 setWhtListId(PointOfInteraction6 value) {
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

    /**
     * Adds a new item to the keyFctn list.
     * @see #getKeyFctn()
     * 
     */
    public CertificateManagementRequest3 addKeyFctn(KeyUsage1Code keyFctn) {
        getKeyFctn().add(keyFctn);
        return this;
    }

}
