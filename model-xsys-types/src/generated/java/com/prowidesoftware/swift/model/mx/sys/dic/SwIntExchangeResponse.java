
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
 * Java class for ExchangeResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeResponse", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "responseHandle",
    "swiftRequestRef",
    "signatureList",
    "status"
})
public class SwIntExchangeResponse {

    @XmlElement(name = "ResponseHandle")
    protected SwIntResponseHandle responseHandle;
    @XmlElement(name = "SwiftRequestRef")
    protected String swiftRequestRef;
    @XmlElement(name = "SignatureList", namespace = "urn:swift:snl:ns.SwSec")
    protected SwSecSignatureList signatureList;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

    /**
     * Gets the value of the responseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntResponseHandle }
     *     
     */
    public SwIntResponseHandle getResponseHandle() {
        return responseHandle;
    }

    /**
     * Sets the value of the responseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntResponseHandle }
     *     
     */
    public SwIntExchangeResponse setResponseHandle(SwIntResponseHandle value) {
        this.responseHandle = value;
        return this;
    }

    /**
     * Gets the value of the swiftRequestRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftRequestRef() {
        return swiftRequestRef;
    }

    /**
     * Sets the value of the swiftRequestRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntExchangeResponse setSwiftRequestRef(String value) {
        this.swiftRequestRef = value;
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
    public SwIntExchangeResponse setSignatureList(SwSecSignatureList value) {
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
    public SwIntExchangeResponse setStatus(SwGblStatus value) {
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
