
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
 * Java class for HandleResponseInfoRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleResponseInfoRequest", propOrder = {
    "responseInfoEP",
    "swiftRef",
    "responseRef",
    "swiftResponseRef",
    "transferRef",
    "localRef",
    "digest",
    "signatureList",
    "status"
})
public class SwHandleResponseInfoRequest {

    @XmlElement(name = "ResponseInfoEP", required = true)
    protected String responseInfoEP;
    @XmlElement(name = "SwiftRef", namespace = "urn:swift:snl:ns.SwInt")
    protected String swiftRef;
    @XmlElement(name = "ResponseRef", namespace = "urn:swift:snl:ns.SwInt")
    protected String responseRef;
    @XmlElement(name = "SwiftResponseRef", namespace = "urn:swift:snl:ns.SwInt")
    protected String swiftResponseRef;
    @XmlElement(name = "TransferRef")
    protected String transferRef;
    @XmlElement(name = "LocalRef")
    protected String localRef;
    @XmlElement(name = "Digest")
    protected SwDigest digest;
    @XmlElement(name = "SignatureList", namespace = "urn:swift:snl:ns.SwSec")
    protected SwSecSignatureList signatureList;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

    /**
     * Gets the value of the responseInfoEP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseInfoEP() {
        return responseInfoEP;
    }

    /**
     * Sets the value of the responseInfoEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleResponseInfoRequest setResponseInfoEP(String value) {
        this.responseInfoEP = value;
        return this;
    }

    /**
     * Gets the value of the swiftRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftRef() {
        return swiftRef;
    }

    /**
     * Sets the value of the swiftRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleResponseInfoRequest setSwiftRef(String value) {
        this.swiftRef = value;
        return this;
    }

    /**
     * Gets the value of the responseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseRef() {
        return responseRef;
    }

    /**
     * Sets the value of the responseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleResponseInfoRequest setResponseRef(String value) {
        this.responseRef = value;
        return this;
    }

    /**
     * Gets the value of the swiftResponseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftResponseRef() {
        return swiftResponseRef;
    }

    /**
     * Sets the value of the swiftResponseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleResponseInfoRequest setSwiftResponseRef(String value) {
        this.swiftResponseRef = value;
        return this;
    }

    /**
     * Gets the value of the transferRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferRef() {
        return transferRef;
    }

    /**
     * Sets the value of the transferRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleResponseInfoRequest setTransferRef(String value) {
        this.transferRef = value;
        return this;
    }

    /**
     * Gets the value of the localRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalRef() {
        return localRef;
    }

    /**
     * Sets the value of the localRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleResponseInfoRequest setLocalRef(String value) {
        this.localRef = value;
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
    public SwHandleResponseInfoRequest setDigest(SwDigest value) {
        this.digest = value;
        return this;
    }

    /**
     * Gets the value of the signatureList property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecSignatureList }
     *     
     */
    public SwSecSignatureList getSignatureList() {
        return signatureList;
    }

    /**
     * Sets the value of the signatureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecSignatureList }
     *     
     */
    public SwHandleResponseInfoRequest setSignatureList(SwSecSignatureList value) {
        this.signatureList = value;
        return this;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SwGblStatus }
     *     
     */
    public SwGblStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGblStatus }
     *     
     */
    public SwHandleResponseInfoRequest setStatus(SwGblStatus value) {
        this.status = value;
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
