
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for AckMessage complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AckMessage", propOrder = {
    "snFRef",
    "origSnFRef",
    "snFRefType",
    "acceptStatus",
    "ackDescription",
    "ackInfo",
    "cryptoInternal",
    "signatureValue",
    "digest",
    "authorisationSignatureValue"
})
public class SwAckMessage {

    @XmlElement(name = "SnFRef", required = true)
    protected String snFRef;
    @XmlElement(name = "OrigSnFRef")
    protected String origSnFRef;
    @XmlElement(name = "SnFRefType")
    protected String snFRefType;
    @XmlElement(name = "AcceptStatus", required = true)
    protected String acceptStatus;
    @XmlElement(name = "AckDescription")
    protected String ackDescription;
    @XmlElement(name = "AckInfo")
    protected String ackInfo;
    @XmlElement(name = "CryptoInternal", namespace = "urn:swift:snl:ns.SwSec")
    protected SwSecMixedAny cryptoInternal;
    @XmlElement(name = "SignatureValue", namespace = "urn:swift:snl:ns.SwSec")
    protected String signatureValue;
    @XmlElement(name = "Digest")
    protected SwDigest digest;
    @XmlElement(name = "AuthorisationSignatureValue", namespace = "urn:swift:snl:ns.SwSec")
    protected String authorisationSignatureValue;

    /**
     * Gets the value of the snFRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRef() {
        return snFRef;
    }

    /**
     * Sets the value of the snFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAckMessage setSnFRef(String value) {
        this.snFRef = value;
        return this;
    }

    /**
     * Gets the value of the origSnFRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSnFRef() {
        return origSnFRef;
    }

    /**
     * Sets the value of the origSnFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAckMessage setOrigSnFRef(String value) {
        this.origSnFRef = value;
        return this;
    }

    /**
     * Gets the value of the snFRefType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRefType() {
        return snFRefType;
    }

    /**
     * Sets the value of the snFRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAckMessage setSnFRefType(String value) {
        this.snFRefType = value;
        return this;
    }

    /**
     * Gets the value of the acceptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptStatus() {
        return acceptStatus;
    }

    /**
     * Sets the value of the acceptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAckMessage setAcceptStatus(String value) {
        this.acceptStatus = value;
        return this;
    }

    /**
     * Gets the value of the ackDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckDescription() {
        return ackDescription;
    }

    /**
     * Sets the value of the ackDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAckMessage setAckDescription(String value) {
        this.ackDescription = value;
        return this;
    }

    /**
     * Gets the value of the ackInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckInfo() {
        return ackInfo;
    }

    /**
     * Sets the value of the ackInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAckMessage setAckInfo(String value) {
        this.ackInfo = value;
        return this;
    }

    /**
     * Gets the value of the cryptoInternal property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecMixedAny }
     *     
     */
    public SwSecMixedAny getCryptoInternal() {
        return cryptoInternal;
    }

    /**
     * Sets the value of the cryptoInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecMixedAny }
     *     
     */
    public SwAckMessage setCryptoInternal(SwSecMixedAny value) {
        this.cryptoInternal = value;
        return this;
    }

    /**
     * Gets the value of the signatureValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureValue() {
        return signatureValue;
    }

    /**
     * Sets the value of the signatureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAckMessage setSignatureValue(String value) {
        this.signatureValue = value;
        return this;
    }

    /**
     * Gets the value of the digest property.
     * 
     * @return
     *     possible object is
     *     {@link SwDigest }
     *     
     */
    public SwDigest getDigest() {
        return digest;
    }

    /**
     * Sets the value of the digest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwDigest }
     *     
     */
    public SwAckMessage setDigest(SwDigest value) {
        this.digest = value;
        return this;
    }

    /**
     * Gets the value of the authorisationSignatureValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisationSignatureValue() {
        return authorisationSignatureValue;
    }

    /**
     * Sets the value of the authorisationSignatureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAckMessage setAuthorisationSignatureValue(String value) {
        this.authorisationSignatureValue = value;
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
