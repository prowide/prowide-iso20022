
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
 * Java class for NotifySnFRequestHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifySnFRequestHandle", propOrder = {
    "snFRef",
    "snFRefType",
    "acceptStatus",
    "ackSwiftTime",
    "ackDescription",
    "ackInfo",
    "origSnFRef",
    "thirdPartyDN"
})
public class SwNotifySnFRequestHandle {

    @XmlElement(name = "SnFRef", required = true)
    protected String snFRef;
    @XmlElement(name = "SnFRefType", required = true)
    protected String snFRefType;
    @XmlElement(name = "AcceptStatus", required = true)
    protected String acceptStatus;
    @XmlElement(name = "AckSwiftTime", required = true)
    protected String ackSwiftTime;
    @XmlElement(name = "AckDescription")
    protected String ackDescription;
    @XmlElement(name = "AckInfo")
    protected String ackInfo;
    @XmlElement(name = "OrigSnFRef")
    protected String origSnFRef;
    @XmlElement(name = "ThirdPartyDN")
    protected String thirdPartyDN;

    /**
     * Gets the value of the snFRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRef() {
        return snFRef;
    }

    /**
     * Sets the value of the snFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwNotifySnFRequestHandle setSnFRef(String value) {
        this.snFRef = value;
        return this;
    }

    /**
     * Gets the value of the snFRefType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRefType() {
        return snFRefType;
    }

    /**
     * Sets the value of the snFRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwNotifySnFRequestHandle setSnFRefType(String value) {
        this.snFRefType = value;
        return this;
    }

    /**
     * Gets the value of the acceptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptStatus() {
        return acceptStatus;
    }

    /**
     * Sets the value of the acceptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwNotifySnFRequestHandle setAcceptStatus(String value) {
        this.acceptStatus = value;
        return this;
    }

    /**
     * Gets the value of the ackSwiftTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckSwiftTime() {
        return ackSwiftTime;
    }

    /**
     * Sets the value of the ackSwiftTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwNotifySnFRequestHandle setAckSwiftTime(String value) {
        this.ackSwiftTime = value;
        return this;
    }

    /**
     * Gets the value of the ackDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckDescription() {
        return ackDescription;
    }

    /**
     * Sets the value of the ackDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwNotifySnFRequestHandle setAckDescription(String value) {
        this.ackDescription = value;
        return this;
    }

    /**
     * Gets the value of the ackInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckInfo() {
        return ackInfo;
    }

    /**
     * Sets the value of the ackInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwNotifySnFRequestHandle setAckInfo(String value) {
        this.ackInfo = value;
        return this;
    }

    /**
     * Gets the value of the origSnFRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSnFRef() {
        return origSnFRef;
    }

    /**
     * Sets the value of the origSnFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwNotifySnFRequestHandle setOrigSnFRef(String value) {
        this.origSnFRef = value;
        return this;
    }

    /**
     * Gets the value of the thirdPartyDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyDN() {
        return thirdPartyDN;
    }

    /**
     * Sets the value of the thirdPartyDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwNotifySnFRequestHandle setThirdPartyDN(String value) {
        this.thirdPartyDN = value;
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
