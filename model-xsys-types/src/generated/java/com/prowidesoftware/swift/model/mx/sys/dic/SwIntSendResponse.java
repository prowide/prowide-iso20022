
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
 * Java class for SendResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendResponse", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "sendReference",
    "swiftRequestRef",
    "status"
})
public class SwIntSendResponse {

    @XmlElement(name = "SendReference")
    protected SwIntWaitDescriptor sendReference;
    @XmlElement(name = "SwiftRequestRef")
    protected String swiftRequestRef;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

    /**
     * Gets the value of the sendReference property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntWaitDescriptor }
     *     
     */
    public SwIntWaitDescriptor getSendReference() {
        return sendReference;
    }

    /**
     * Sets the value of the sendReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntWaitDescriptor }
     *     
     */
    public SwIntSendResponse setSendReference(SwIntWaitDescriptor value) {
        this.sendReference = value;
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
    public SwIntSendResponse setSwiftRequestRef(String value) {
        this.swiftRequestRef = value;
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
    public SwIntSendResponse setStatus(SwGblStatus value) {
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
