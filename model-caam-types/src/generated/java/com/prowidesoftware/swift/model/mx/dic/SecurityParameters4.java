
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Security parameters of the ATM for the initiated key download.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityParameters4", propOrder = {
    "key",
    "dgtlSgntr",
    "cert",
    "atmChllng",
    "reqdKey"
})
public class SecurityParameters4 {

    @XmlElement(name = "Key")
    protected CryptographicKey8 key;
    @XmlElement(name = "DgtlSgntr")
    protected ContentInformationType14 dgtlSgntr;
    @XmlElement(name = "Cert")
    protected List<byte[]> cert;
    @XmlElement(name = "ATMChllng")
    protected byte[] atmChllng;
    @XmlElement(name = "ReqdKey")
    protected String reqdKey;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicKey8 }
     *     
     */
    public CryptographicKey8 getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKey8 }
     *     
     */
    public SecurityParameters4 setKey(CryptographicKey8 value) {
        this.key = value;
        return this;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType14 }
     *     
     */
    public ContentInformationType14 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType14 }
     *     
     */
    public SecurityParameters4 setDgtlSgntr(ContentInformationType14 value) {
        this.dgtlSgntr = value;
        return this;
    }

    /**
     * Gets the value of the cert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getCert() {
        if (cert == null) {
            cert = new ArrayList<byte[]>();
        }
        return this.cert;
    }

    /**
     * Gets the value of the atmChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getATMChllng() {
        return atmChllng;
    }

    /**
     * Sets the value of the atmChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public SecurityParameters4 setATMChllng(byte[] value) {
        this.atmChllng = value;
        return this;
    }

    /**
     * Gets the value of the reqdKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdKey() {
        return reqdKey;
    }

    /**
     * Sets the value of the reqdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityParameters4 setReqdKey(String value) {
        this.reqdKey = value;
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
     * Adds a new item to the cert list.
     * @see #getCert()
     * 
     */
    public SecurityParameters4 addCert(byte[] cert) {
        getCert().add(cert);
        return this;
    }

}
