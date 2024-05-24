
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
 * Java class for SnFDeliveryInfo complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFDeliveryInfo", propOrder = {
    "swiftTime",
    "userDN",
    "snFSessionId",
    "snlId",
    "retryReason",
    "snFOutputSeq"
})
public class SwSnFDeliveryInfo {

    @XmlElement(name = "SwiftTime")
    protected String swiftTime;
    @XmlElement(name = "UserDN", namespace = "urn:swift:snl:ns.SwSec")
    protected String userDN;
    @XmlElement(name = "SnFSessionId")
    protected String snFSessionId;
    @XmlElement(name = "SNLId", namespace = "urn:swift:snl:ns.SwInt")
    protected String snlId;
    @XmlElement(name = "RetryReason")
    protected SwGblStatus retryReason;
    @XmlElement(name = "SnFOutputSeq")
    protected String snFOutputSeq;

    /**
     * Gets the value of the swiftTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftTime() {
        return swiftTime;
    }

    /**
     * Sets the value of the swiftTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFDeliveryInfo setSwiftTime(String value) {
        this.swiftTime = value;
        return this;
    }

    /**
     * Gets the value of the userDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDN() {
        return userDN;
    }

    /**
     * Sets the value of the userDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFDeliveryInfo setUserDN(String value) {
        this.userDN = value;
        return this;
    }

    /**
     * Gets the value of the snFSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFSessionId() {
        return snFSessionId;
    }

    /**
     * Sets the value of the snFSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFDeliveryInfo setSnFSessionId(String value) {
        this.snFSessionId = value;
        return this;
    }

    /**
     * Gets the value of the snlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNLId() {
        return snlId;
    }

    /**
     * Sets the value of the snlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFDeliveryInfo setSNLId(String value) {
        this.snlId = value;
        return this;
    }

    /**
     * Gets the value of the retryReason property.
     * 
     * @return
     *     possible object is
     *     {@link SwGblStatus }
     *     
     */
    public SwGblStatus getRetryReason() {
        return retryReason;
    }

    /**
     * Sets the value of the retryReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGblStatus }
     *     
     */
    public SwSnFDeliveryInfo setRetryReason(SwGblStatus value) {
        this.retryReason = value;
        return this;
    }

    /**
     * Gets the value of the snFOutputSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFOutputSeq() {
        return snFOutputSeq;
    }

    /**
     * Sets the value of the snFOutputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFDeliveryInfo setSnFOutputSeq(String value) {
        this.snFOutputSeq = value;
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
