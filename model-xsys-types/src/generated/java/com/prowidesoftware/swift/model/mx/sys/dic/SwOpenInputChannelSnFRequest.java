
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
 * Java class for OpenInputChannelSnFRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenInputChannelSnFRequest", propOrder = {
    "inputChannel",
    "windowSize",
    "forcedOpenInd"
})
public class SwOpenInputChannelSnFRequest {

    @XmlElement(name = "InputChannel", required = true)
    protected String inputChannel;
    @XmlElement(name = "WindowSize")
    protected String windowSize;
    @XmlElement(name = "ForcedOpenInd")
    protected String forcedOpenInd;

    /**
     * Gets the value of the inputChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputChannel() {
        return inputChannel;
    }

    /**
     * Sets the value of the inputChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwOpenInputChannelSnFRequest setInputChannel(String value) {
        this.inputChannel = value;
        return this;
    }

    /**
     * Gets the value of the windowSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowSize() {
        return windowSize;
    }

    /**
     * Sets the value of the windowSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwOpenInputChannelSnFRequest setWindowSize(String value) {
        this.windowSize = value;
        return this;
    }

    /**
     * Gets the value of the forcedOpenInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcedOpenInd() {
        return forcedOpenInd;
    }

    /**
     * Sets the value of the forcedOpenInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwOpenInputChannelSnFRequest setForcedOpenInd(String value) {
        this.forcedOpenInd = value;
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
