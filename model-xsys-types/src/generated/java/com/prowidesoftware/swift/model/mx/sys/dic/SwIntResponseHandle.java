
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for ResponseHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHandle", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "requestDescriptor",
    "responseDescriptor",
    "responseE2EControl",
    "responseHeader",
    "responsePayload",
    "crypto",
    "signatureList"
})
public class SwIntResponseHandle {

    @XmlElement(name = "RequestDescriptor", required = true)
    protected SwIntRequestDescriptor requestDescriptor;
    @XmlElement(name = "ResponseDescriptor", required = true)
    protected SwIntResponseDescriptor responseDescriptor;
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
     * Gets the value of the requestDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntRequestDescriptor }
     *     
     */
    public SwIntRequestDescriptor getRequestDescriptor() {
        return requestDescriptor;
    }

    /**
     * Sets the value of the requestDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntRequestDescriptor }
     *     
     */
    public SwIntResponseHandle setRequestDescriptor(SwIntRequestDescriptor value) {
        this.requestDescriptor = value;
        return this;
    }

    /**
     * Gets the value of the responseDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntResponseDescriptor }
     *     
     */
    public SwIntResponseDescriptor getResponseDescriptor() {
        return responseDescriptor;
    }

    /**
     * Sets the value of the responseDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntResponseDescriptor }
     *     
     */
    public SwIntResponseHandle setResponseDescriptor(SwIntResponseDescriptor value) {
        this.responseDescriptor = value;
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
    public SwIntResponseHandle setResponseE2EControl(SwE2EControl value) {
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
    public SwIntResponseHandle setResponseHeader(SwIntResponseHeader value) {
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
    public SwIntResponseHandle setResponsePayload(SwIntMixedAnyPayload value) {
        this.responsePayload = value;
        return this;
    }

    /**
     * Gets the value of the crypto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crypto property.
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
     */
    public List<SwSecCrypto> getCrypto() {
        if (crypto == null) {
            crypto = new ArrayList<SwSecCrypto>();
        }
        return this.crypto;
    }

    /**
     * Gets the value of the signatureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureList property.
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
     */
    public List<SwSecSignatureList> getSignatureList() {
        if (signatureList == null) {
            signatureList = new ArrayList<SwSecSignatureList>();
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
    public SwIntResponseHandle addCrypto(SwSecCrypto crypto) {
        getCrypto().add(crypto);
        return this;
    }

    /**
     * Adds a new item to the signatureList list.
     * @see #getSignatureList()
     * 
     */
    public SwIntResponseHandle addSignatureList(SwSecSignatureList signatureList) {
        getSignatureList().add(signatureList);
        return this;
    }

}
