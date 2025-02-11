
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for Signature complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signature", namespace = "urn:swift:snl:ns.SwSec", propOrder = {
    "signedInfo",
    "signatureValue",
    "keyInfo",
    "manifest",
    "object"
})
public class SwSecSignature {

    @XmlElement(name = "SignedInfo")
    protected SwSecSignedInfo signedInfo;
    @XmlElement(name = "SignatureValue")
    protected String signatureValue;
    @XmlElement(name = "KeyInfo", required = true)
    protected SwSecKeyInfo keyInfo;
    @XmlElement(name = "Manifest", required = true)
    protected SwSecManifest manifest;
    @XmlElement(name = "Object", namespace = "urn:swift:snl:ns.Sw")
    protected SwObject object;

    /**
     * Gets the value of the signedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecSignedInfo }
     *     
     */
    public SwSecSignedInfo getSignedInfo() {
        return signedInfo;
    }

    /**
     * Sets the value of the signedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecSignedInfo }
     *     
     */
    public SwSecSignature setSignedInfo(SwSecSignedInfo value) {
        this.signedInfo = value;
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
    public SwSecSignature setSignatureValue(String value) {
        this.signatureValue = value;
        return this;
    }

    /**
     * Gets the value of the keyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecKeyInfo }
     *     
     */
    public SwSecKeyInfo getKeyInfo() {
        return keyInfo;
    }

    /**
     * Sets the value of the keyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecKeyInfo }
     *     
     */
    public SwSecSignature setKeyInfo(SwSecKeyInfo value) {
        this.keyInfo = value;
        return this;
    }

    /**
     * Gets the value of the manifest property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecManifest }
     *     
     */
    public SwSecManifest getManifest() {
        return manifest;
    }

    /**
     * Sets the value of the manifest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecManifest }
     *     
     */
    public SwSecSignature setManifest(SwSecManifest value) {
        this.manifest = value;
        return this;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link SwObject }
     *     
     */
    public SwObject getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwObject }
     *     
     */
    public SwSecSignature setObject(SwObject value) {
        this.object = value;
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
