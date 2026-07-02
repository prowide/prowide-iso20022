
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
 * Java class for WaitControl complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitControl", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "waitAny",
    "sendReferenceVal",
    "wait"
})
public class SwIntWaitControl {

    @XmlElement(name = "WaitAny", required = true)
    protected String waitAny;
    @XmlElement(name = "SendReferenceVal")
    protected String sendReferenceVal;
    @XmlElement(name = "Wait", required = true)
    protected String wait;

    /**
     * Gets the value of the waitAny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitAny() {
        return waitAny;
    }

    /**
     * Sets the value of the waitAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntWaitControl setWaitAny(String value) {
        this.waitAny = value;
        return this;
    }

    /**
     * Gets the value of the sendReferenceVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendReferenceVal() {
        return sendReferenceVal;
    }

    /**
     * Sets the value of the sendReferenceVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntWaitControl setSendReferenceVal(String value) {
        this.sendReferenceVal = value;
        return this;
    }

    /**
     * Gets the value of the wait property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWait() {
        return wait;
    }

    /**
     * Sets the value of the wait property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntWaitControl setWait(String value) {
        this.wait = value;
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
