
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for Response complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "responseControl",
    "responseE2EControl",
    "responseHeader",
    "responsePayload",
    "crypto",
    "signatureList"
})
public class SwIntResponse {

    @XmlElement(name = "ResponseControl", required = true)
    protected SwIntResponseControl responseControl;
    @XmlElement(name = "ResponseE2EControl", namespace = "urn:swift:snl:ns.Sw")
    protected SwE2EControl responseE2EControl;
    @XmlElement(name = "ResponseHeader", required = true)
    protected SwIntResponseHeader responseHeader;
    @XmlElement(name = "ResponsePayload")
    protected SwIntMixedAnyPayload responsePayload;
    @XmlElement(name = "Crypto", namespace = "urn:swift:snl:ns.SwSec")
    protected List<SwSecCrypto> crypto;
    @XmlElement(name = "SignatureList", namespace = "urn:swift:snl:ns.SwSec")
    protected List<SwSecSignatureList> signatureList;

    /**
     * Gets the value of the responseControl property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntResponseControl }
     *     
     */
    public SwIntResponseControl getResponseControl() {
        return responseControl;
    }

    /**
     * Sets the value of the responseControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntResponseControl }
     *     
     */
    public SwIntResponse setResponseControl(SwIntResponseControl value) {
        this.responseControl = value;
        return this;
    }

    /**
     * Gets the value of the responseE2EControl property.
     * 
     * @return
     *     possible object is
     *     {@link SwE2EControl }
     *     
     */
    public SwE2EControl getResponseE2EControl() {
        return responseE2EControl;
    }

    /**
     * Sets the value of the responseE2EControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwE2EControl }
     *     
     */
    public SwIntResponse setResponseE2EControl(SwE2EControl value) {
        this.responseE2EControl = value;
        return this;
    }

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntResponseHeader }
     *     
     */
    public SwIntResponseHeader getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntResponseHeader }
     *     
     */
    public SwIntResponse setResponseHeader(SwIntResponseHeader value) {
        this.responseHeader = value;
        return this;
    }

    /**
     * Gets the value of the responsePayload property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntMixedAnyPayload }
     *     
     */
    public SwIntMixedAnyPayload getResponsePayload() {
        return responsePayload;
    }

    /**
     * Sets the value of the responsePayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntMixedAnyPayload }
     *     
     */
    public SwIntResponse setResponsePayload(SwIntMixedAnyPayload value) {
        this.responsePayload = value;
        return this;
    }

    /**
     * Gets the value of the crypto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crypto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrypto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwSecCrypto }
     * 
     * 
     * @return
     *     The value of the crypto property.
     */
    public List<SwSecCrypto> getCrypto() {
        if (crypto == null) {
            crypto = new ArrayList<>();
        }
        return this.crypto;
    }

    /**
     * Gets the value of the signatureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the signatureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwSecSignatureList }
     * 
     * 
     * @return
     *     The value of the signatureList property.
     */
    public List<SwSecSignatureList> getSignatureList() {
        if (signatureList == null) {
            signatureList = new ArrayList<>();
        }
        return this.signatureList;
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
     * Adds a new item to the crypto list.
     * @see #getCrypto()
     * 
     */
    public SwIntResponse addCrypto(SwSecCrypto crypto) {
        getCrypto().add(crypto);
        return this;
    }

    /**
     * Adds a new item to the signatureList list.
     * @see #getSignatureList()
     * 
     */
    public SwIntResponse addSignatureList(SwSecSignatureList signatureList) {
        getSignatureList().add(signatureList);
        return this;
    }

}
