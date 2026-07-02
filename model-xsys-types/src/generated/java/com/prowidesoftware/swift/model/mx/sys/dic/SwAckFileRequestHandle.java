
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
 * Java class for AckFileRequestHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AckFileRequestHandle", propOrder = {
    "transferRef",
    "digest",
    "accepted",
    "ackDescription",
    "ackInfo"
})
public class SwAckFileRequestHandle {

    @XmlElement(name = "TransferRef", required = true)
    protected String transferRef;
    @XmlElement(name = "Digest")
    protected SwDigest digest;
    @XmlElement(name = "Accepted", required = true)
    protected String accepted;
    @XmlElement(name = "AckDescription")
    protected String ackDescription;
    @XmlElement(name = "AckInfo")
    protected String ackInfo;

    /**
     * Gets the value of the transferRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferRef() {
        return transferRef;
    }

    /**
     * Sets the value of the transferRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAckFileRequestHandle setTransferRef(String value) {
        this.transferRef = value;
        return this;
    }

    /**
     * Gets the value of the digest property.
     * 
     * @return
     *     possible object is
     *     {@link SwDigest }
     *     
     */
    public SwDigest getDigest() {
        return digest;
    }

    /**
     * Sets the value of the digest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwDigest }
     *     
     */
    public SwAckFileRequestHandle setDigest(SwDigest value) {
        this.digest = value;
        return this;
    }

    /**
     * Gets the value of the accepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAckFileRequestHandle setAccepted(String value) {
        this.accepted = value;
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
    public SwAckFileRequestHandle setAckDescription(String value) {
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
    public SwAckFileRequestHandle setAckInfo(String value) {
        this.ackInfo = value;
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
