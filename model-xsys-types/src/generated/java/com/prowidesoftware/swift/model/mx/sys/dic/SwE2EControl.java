
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
 * Java class for E2EControl complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "E2EControl", propOrder = {
    "msgId",
    "creationTime",
    "pdIndication",
    "headerInfo"
})
public class SwE2EControl {

    @XmlElement(name = "MsgId")
    protected String msgId;
    @XmlElement(name = "CreationTime")
    protected String creationTime;
    @XmlElement(name = "PDIndication")
    protected SwPDIndication pdIndication;
    @XmlElement(name = "HeaderInfo")
    protected SwAny headerInfo;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwE2EControl setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwE2EControl setCreationTime(String value) {
        this.creationTime = value;
        return this;
    }

    /**
     * Gets the value of the pdIndication property.
     * 
     * @return
     *     possible object is
     *     {@link SwPDIndication }
     *     
     */
    public SwPDIndication getPDIndication() {
        return pdIndication;
    }

    /**
     * Sets the value of the pdIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwPDIndication }
     *     
     */
    public SwE2EControl setPDIndication(SwPDIndication value) {
        this.pdIndication = value;
        return this;
    }

    /**
     * Gets the value of the headerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwAny }
     *     
     */
    public SwAny getHeaderInfo() {
        return headerInfo;
    }

    /**
     * Sets the value of the headerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAny }
     *     
     */
    public SwE2EControl setHeaderInfo(SwAny value) {
        this.headerInfo = value;
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
