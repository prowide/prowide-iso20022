
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "SecurityParameters9", propOrder = {
    "key",
    "sgntrChc",
    "cert",
    "atmChllng",
    "reqdKey"
})
public class SecurityParameters9 {

    @XmlElement(name = "Key")
    protected CryptographicKey12 key;
    @XmlElement(name = "SgntrChc")
    protected ATMSignature2Choice sgntrChc;
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
     *     {@link CryptographicKey12 }
     *     
     */
    public CryptographicKey12 getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKey12 }
     *     
     */
    public SecurityParameters9 setKey(CryptographicKey12 value) {
        this.key = value;
        return this;
    }

    /**
     * Gets the value of the sgntrChc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSignature2Choice }
     *     
     */
    public ATMSignature2Choice getSgntrChc() {
        return sgntrChc;
    }

    /**
     * Sets the value of the sgntrChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSignature2Choice }
     *     
     */
    public SecurityParameters9 setSgntrChc(ATMSignature2Choice value) {
        this.sgntrChc = value;
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
    public SecurityParameters9 setATMChllng(byte[] value) {
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
    public SecurityParameters9 setReqdKey(String value) {
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
    public SecurityParameters9 addCert(byte[] cert) {
        getCert().add(cert);
        return this;
    }

}
