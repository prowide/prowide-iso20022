
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
 * Java class for PutFileResponseHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PutFileResponseHandle", propOrder = {
    "transferRef",
    "transferAnswer",
    "size",
    "digest",
    "rejectDescription",
    "rejectInfo"
})
public class SwPutFileResponseHandle {

    @XmlElement(name = "TransferRef", required = true)
    protected String transferRef;
    @XmlElement(name = "TransferAnswer", required = true)
    protected String transferAnswer;
    @XmlElement(name = "Size")
    protected String size;
    @XmlElement(name = "Digest", required = true)
    protected SwDigest digest;
    @XmlElement(name = "RejectDescription")
    protected String rejectDescription;
    @XmlElement(name = "RejectInfo")
    protected String rejectInfo;

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
    public SwPutFileResponseHandle setTransferRef(String value) {
        this.transferRef = value;
        return this;
    }

    /**
     * Gets the value of the transferAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferAnswer() {
        return transferAnswer;
    }

    /**
     * Sets the value of the transferAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPutFileResponseHandle setTransferAnswer(String value) {
        this.transferAnswer = value;
        return this;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPutFileResponseHandle setSize(String value) {
        this.size = value;
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
    public SwPutFileResponseHandle setDigest(SwDigest value) {
        this.digest = value;
        return this;
    }

    /**
     * Gets the value of the rejectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectDescription() {
        return rejectDescription;
    }

    /**
     * Sets the value of the rejectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPutFileResponseHandle setRejectDescription(String value) {
        this.rejectDescription = value;
        return this;
    }

    /**
     * Gets the value of the rejectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectInfo() {
        return rejectInfo;
    }

    /**
     * Sets the value of the rejectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPutFileResponseHandle setRejectInfo(String value) {
        this.rejectInfo = value;
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
