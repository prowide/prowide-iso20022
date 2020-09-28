
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
 * Entity involved in an activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAndCertificate1", propOrder = {
    "pty",
    "cert",
    "sgntrOrdr",
    "authstn"
})
public class PartyAndCertificate1 {

    @XmlElement(name = "Pty", required = true)
    protected PartyIdentification41 pty;
    @XmlElement(name = "Cert")
    protected byte[] cert;
    @XmlElement(name = "SgntrOrdr")
    protected String sgntrOrdr;
    @XmlElement(name = "Authstn", required = true)
    protected Authorisation1 authstn;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification41 }
     *     
     */
    public PartyIdentification41 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification41 }
     *     
     */
    public PartyAndCertificate1 setPty(PartyIdentification41 value) {
        this.pty = value;
        return this;
    }

    /**
     * Gets the value of the cert property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCert() {
        return cert;
    }

    /**
     * Sets the value of the cert property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public PartyAndCertificate1 setCert(byte[] value) {
        this.cert = value;
        return this;
    }

    /**
     * Gets the value of the sgntrOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgntrOrdr() {
        return sgntrOrdr;
    }

    /**
     * Sets the value of the sgntrOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyAndCertificate1 setSgntrOrdr(String value) {
        this.sgntrOrdr = value;
        return this;
    }

    /**
     * Gets the value of the authstn property.
     * 
     * @return
     *     possible object is
     *     {@link Authorisation1 }
     *     
     */
    public Authorisation1 getAuthstn() {
        return authstn;
    }

    /**
     * Sets the value of the authstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authorisation1 }
     *     
     */
    public PartyAndCertificate1 setAuthstn(Authorisation1 value) {
        this.authstn = value;
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
