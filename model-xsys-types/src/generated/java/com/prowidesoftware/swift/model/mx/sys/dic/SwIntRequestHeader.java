
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
 * Java class for RequestHeader complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeader", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "requestor",
    "responder",
    "service",
    "requestType",
    "priority",
    "requestRef"
})
public class SwIntRequestHeader {

    @XmlElement(name = "Requestor", required = true)
    protected String requestor;
    @XmlElement(name = "Responder", required = true)
    protected String responder;
    @XmlElement(name = "Service", required = true)
    protected String service;
    @XmlElement(name = "RequestType")
    protected String requestType;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "RequestRef")
    protected String requestRef;

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntRequestHeader setRequestor(String value) {
        this.requestor = value;
        return this;
    }

    /**
     * Gets the value of the responder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponder() {
        return responder;
    }

    /**
     * Sets the value of the responder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntRequestHeader setResponder(String value) {
        this.responder = value;
        return this;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntRequestHeader setService(String value) {
        this.service = value;
        return this;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntRequestHeader setRequestType(String value) {
        this.requestType = value;
        return this;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntRequestHeader setPriority(String value) {
        this.priority = value;
        return this;
    }

    /**
     * Gets the value of the requestRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestRef() {
        return requestRef;
    }

    /**
     * Sets the value of the requestRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntRequestHeader setRequestRef(String value) {
        this.requestRef = value;
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
