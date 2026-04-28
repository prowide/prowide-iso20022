
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
    "inptChnl",
    "inptChnlSsnList",
    "ttlNbOfSntMsgs"
})
public class InputChannelDetailsXsys01900101 {

    @XmlElement(name = "InptChnl", required = true)
    protected String inptChnl;
    @XmlElement(name = "InptChnlSsnList")
    protected InputChannelSessionList inptChnlSsnList;
    @XmlElement(name = "TtlNbOfSntMsgs", required = true)
    protected BigDecimal ttlNbOfSntMsgs;

    /**
     * Gets the value of the inptChnl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInptChnl() {
        return inptChnl;
    }

    /**
     * Sets the value of the inptChnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InputChannelDetailsXsys01900101 setInptChnl(String value) {
        this.inptChnl = value;
        return this;
    }

    /**
     * Gets the value of the inptChnlSsnList property.
     * 
     * @return
     *     possible object is
     *     {@link InputChannelSessionList }
     *     
     */
    public InputChannelSessionList getInptChnlSsnList() {
        return inptChnlSsnList;
    }

    /**
     * Sets the value of the inptChnlSsnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputChannelSessionList }
     *     
     */
    public InputChannelDetailsXsys01900101 setInptChnlSsnList(InputChannelSessionList value) {
        this.inptChnlSsnList = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfSntMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfSntMsgs() {
        return ttlNbOfSntMsgs;
    }

    /**
     * Sets the value of the ttlNbOfSntMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InputChannelDetailsXsys01900101 setTtlNbOfSntMsgs(BigDecimal value) {
        this.ttlNbOfSntMsgs = value;
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
