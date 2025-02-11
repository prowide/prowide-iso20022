
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
 * Java class for InputChannelDetails complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputChannelDetails", propOrder = {
    "inputChannel",
    "windowSize",
    "nextSnFInputSeq"
})
public class InputChannelDetails
    extends AbstractInputchannelDetails
{

    @XmlElement(name = "InputChannel", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String inputChannel;
    @XmlElement(name = "WindowSize", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String windowSize;
    @XmlElement(name = "NextSnFInputSeq", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String nextSnFInputSeq;

    /**
     * InputChannel
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
    public InputChannelDetails setInputChannel(String value) {
        this.inputChannel = value;
        return this;
    }

    /**
     * WindowSize
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
    public InputChannelDetails setWindowSize(String value) {
        this.windowSize = value;
        return this;
    }

    /**
     * NextSnFInputSeq
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextSnFInputSeq() {
        return nextSnFInputSeq;
    }

    /**
     * Sets the value of the nextSnFInputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InputChannelDetails setNextSnFInputSeq(String value) {
        this.nextSnFInputSeq = value;
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
