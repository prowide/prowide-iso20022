
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
 * Java class for RetrievedDescriptor complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievedDescriptor", propOrder = {
    "retrievalInfo",
    "requestE2EControl",
    "requestDescriptor",
    "retrievalDescriptor"
})
public class SwRetrievedDescriptor {

    @XmlElement(name = "RetrievalInfo", required = true)
    protected SwRetrievalInfo retrievalInfo;
    @XmlElement(name = "RequestE2EControl")
    protected SwE2EControl requestE2EControl;
    @XmlElement(name = "RequestDescriptor", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected SwIntRequestDescriptor requestDescriptor;
    @XmlElement(name = "RetrievalDescriptor", required = true)
    protected SwRetrievalDescriptor retrievalDescriptor;

    /**
     * Gets the value of the retrievalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwRetrievalInfo }
     *     
     */
    public SwRetrievalInfo getRetrievalInfo() {
        return retrievalInfo;
    }

    /**
     * Sets the value of the retrievalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwRetrievalInfo }
     *     
     */
    public SwRetrievedDescriptor setRetrievalInfo(SwRetrievalInfo value) {
        this.retrievalInfo = value;
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
    public SwRetrievedDescriptor setRequestE2EControl(SwE2EControl value) {
        this.requestE2EControl = value;
        return this;
    }

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
    public SwRetrievedDescriptor setRequestDescriptor(SwIntRequestDescriptor value) {
        this.requestDescriptor = value;
        return this;
    }

    /**
     * Gets the value of the retrievalDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SwRetrievalDescriptor }
     *     
     */
    public SwRetrievalDescriptor getRetrievalDescriptor() {
        return retrievalDescriptor;
    }

    /**
     * Sets the value of the retrievalDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwRetrievalDescriptor }
     *     
     */
    public SwRetrievedDescriptor setRetrievalDescriptor(SwRetrievalDescriptor value) {
        this.retrievalDescriptor = value;
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
