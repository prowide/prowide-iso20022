
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
 * Java class for Request complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "requestControl",
    "responseControl",
    "requestE2EControl",
    "requestHeader",
    "requestPayload",
    "crypto",
    "signatureList"
})
public class SwIntRequest {

    @XmlElement(name = "RequestControl", required = true)
    protected SwIntRequestControl requestControl;
    @XmlElement(name = "ResponseControl")
    protected SwIntResponseControl responseControl;
    @XmlElement(name = "RequestE2EControl", namespace = "urn:swift:snl:ns.Sw")
    protected SwE2EControl requestE2EControl;
    @XmlElement(name = "RequestHeader", required = true)
    protected SwIntRequestHeader requestHeader;
    @XmlElement(name = "RequestPayload")
    protected SwIntMixedAnyPayload requestPayload;
    @XmlElement(name = "Crypto", namespace = "urn:swift:snl:ns.SwSec")
    protected List<SwSecCrypto> crypto;
    @XmlElement(name = "SignatureList", namespace = "urn:swift:snl:ns.SwSec")
    protected List<SwSecSignatureList> signatureList;

    /**
     * Gets the value of the requestControl property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntRequestControl }
     *     
     */
    public SwIntRequestControl getRequestControl() {
        return requestControl;
    }

    /**
     * Sets the value of the requestControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntRequestControl }
     *     
     */
    public SwIntRequest setRequestControl(SwIntRequestControl value) {
        this.requestControl = value;
        return this;
    }

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
    public SwIntRequest setResponseControl(SwIntResponseControl value) {
        this.responseControl = value;
        return this;
    }

    /**
     * Gets the value of the requestE2EControl property.
     * 
     * @return
     *     possible object is
     *     {@link SwE2EControl }
     *     
     */
    public SwE2EControl getRequestE2EControl() {
        return requestE2EControl;
    }

    /**
     * Sets the value of the requestE2EControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwE2EControl }
     *     
     */
    public SwIntRequest setRequestE2EControl(SwE2EControl value) {
        this.requestE2EControl = value;
        return this;
    }

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntRequestHeader }
     *     
     */
    public SwIntRequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntRequestHeader }
     *     
     */
    public SwIntRequest setRequestHeader(SwIntRequestHeader value) {
        this.requestHeader = value;
        return this;
    }

    /**
     * Gets the value of the requestPayload property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntMixedAnyPayload }
     *     
     */
    public SwIntMixedAnyPayload getRequestPayload() {
        return requestPayload;
    }

    /**
     * Sets the value of the requestPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntMixedAnyPayload }
     *     
     */
    public SwIntRequest setRequestPayload(SwIntMixedAnyPayload value) {
        this.requestPayload = value;
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
    public SwIntRequest addCrypto(SwSecCrypto crypto) {
        getCrypto().add(crypto);
        return this;
    }

    /**
     * Adds a new item to the signatureList list.
     * @see #getSignatureList()
     * 
     */
    public SwIntRequest addSignatureList(SwSecSignatureList signatureList) {
        getSignatureList().add(signatureList);
        return this;
    }

}
