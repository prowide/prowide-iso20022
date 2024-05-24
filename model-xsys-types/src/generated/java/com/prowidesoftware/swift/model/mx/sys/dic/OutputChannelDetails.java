
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for OutputChannelDetails complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputChannelDetails", propOrder = {
    "outptChnl",
    "outptChnlSsnList",
    "ttlNbOfRcvdMsgs"
})
public class OutputChannelDetails {

    @XmlElement(name = "OutptChnl", required = true)
    protected String outptChnl;
    @XmlElement(name = "OutptChnlSsnList")
    protected OutputChannelSessionList outptChnlSsnList;
    @XmlElement(name = "TtlNbOfRcvdMsgs", required = true)
    protected BigDecimal ttlNbOfRcvdMsgs;

    /**
     * Gets the value of the outptChnl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutptChnl() {
        return outptChnl;
    }

    /**
     * Sets the value of the outptChnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelDetails setOutptChnl(String value) {
        this.outptChnl = value;
        return this;
    }

    /**
     * Gets the value of the outptChnlSsnList property.
     * 
     * @return
     *     possible object is
     *     {@link OutputChannelSessionList }
     *     
     */
    public OutputChannelSessionList getOutptChnlSsnList() {
        return outptChnlSsnList;
    }

    /**
     * Sets the value of the outptChnlSsnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputChannelSessionList }
     *     
     */
    public OutputChannelDetails setOutptChnlSsnList(OutputChannelSessionList value) {
        this.outptChnlSsnList = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfRcvdMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfRcvdMsgs() {
        return ttlNbOfRcvdMsgs;
    }

    /**
     * Sets the value of the ttlNbOfRcvdMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OutputChannelDetails setTtlNbOfRcvdMsgs(BigDecimal value) {
        this.ttlNbOfRcvdMsgs = value;
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
