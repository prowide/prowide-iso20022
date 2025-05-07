
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
 * Information related to the result of the certificate management request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateManagementResponse3", propOrder = {
    "poiId",
    "tmId",
    "certSvc",
    "rslt",
    "sctyPrfl",
    "poiChllngVal",
    "tmsDtTm",
    "clntCert",
    "clntCertPth",
    "svrCertPth"
})
public class CertificateManagementResponse3 {

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
    @XmlElement(name = "POIChllngVal", required = true)
    protected byte[] poiChllngVal;
    @XmlElement(name = "TMSDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmsDtTm;
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
    public CertificateManagementResponse3 setPOIId(GenericIdentification176 value) {
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
    public CertificateManagementResponse3 setTMId(GenericIdentification176 value) {
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
    public CertificateManagementResponse3 setCertSvc(CardPaymentServiceType10Code value) {
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
    public CertificateManagementResponse3 setRslt(ResponseType6 value) {
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
    public CertificateManagementResponse3 setSctyPrfl(String value) {
        this.sctyPrfl = value;
        return this;
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
    public CertificateManagementResponse3 setPOIChllngVal(byte[] value) {
        this.poiChllngVal = value;
        return this;
    }

    /**
     * Gets the value of the tmsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTMSDtTm() {
        return tmsDtTm;
    }

    /**
     * Sets the value of the tmsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CertificateManagementResponse3 setTMSDtTm(XMLGregorianCalendar value) {
        this.tmsDtTm = value;
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
    public CertificateManagementResponse3 setClntCert(byte[] value) {
        this.clntCert = value;
        return this;
    }

    /**
     * Gets the value of the clntCertPth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clntCertPth property.
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
     */
    public List<byte[]> getClntCertPth() {
        if (clntCertPth == null) {
            clntCertPth = new ArrayList<byte[]>();
        }
        return this.clntCertPth;
    }

    /**
     * Gets the value of the svrCertPth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svrCertPth property.
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
     */
    public List<byte[]> getSvrCertPth() {
        if (svrCertPth == null) {
            svrCertPth = new ArrayList<byte[]>();
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
    public CertificateManagementResponse3 addClntCertPth(byte[] clntCertPth) {
        getClntCertPth().add(clntCertPth);
        return this;
    }

    /**
     * Adds a new item to the svrCertPth list.
     * @see #getSvrCertPth()
     * 
     */
    public CertificateManagementResponse3 addSvrCertPth(byte[] svrCertPth) {
        getSvrCertPth().add(svrCertPth);
        return this;
    }

}
