
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
 * Java class for SnFOutputInfo complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFOutputInfo", propOrder = {
    "snFSessionId",
    "snFOutputSeq",
    "snFPDMHistory",
    "deliveryTime",
    "snFInputTime",
    "overdueTime"
})
public class SwSnFOutputInfo {

    @XmlElement(name = "SnFSessionId", required = true)
    protected String snFSessionId;
    @XmlElement(name = "SnFOutputSeq", required = true)
    protected String snFOutputSeq;
    @XmlElement(name = "SnFPDMHistory")
    protected SwSnFDeliveryHistory snFPDMHistory;
    @XmlElement(name = "DeliveryTime", required = true)
    protected String deliveryTime;
    @XmlElement(name = "SnFInputTime", required = true)
    protected String snFInputTime;
    @XmlElement(name = "OverdueTime")
    protected String overdueTime;

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
    public SwSnFOutputInfo setSnFSessionId(String value) {
        this.snFSessionId = value;
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
    public SwSnFOutputInfo setSnFOutputSeq(String value) {
        this.snFOutputSeq = value;
        return this;
    }

    /**
     * Gets the value of the snFPDMHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFDeliveryHistory }
     *     
     */
    public SwSnFDeliveryHistory getSnFPDMHistory() {
        return snFPDMHistory;
    }

    /**
     * Sets the value of the snFPDMHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFDeliveryHistory }
     *     
     */
    public SwSnFOutputInfo setSnFPDMHistory(SwSnFDeliveryHistory value) {
        this.snFPDMHistory = value;
        return this;
    }

    /**
     * Gets the value of the deliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Sets the value of the deliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFOutputInfo setDeliveryTime(String value) {
        this.deliveryTime = value;
        return this;
    }

    /**
     * Gets the value of the snFInputTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFInputTime() {
        return snFInputTime;
    }

    /**
     * Sets the value of the snFInputTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFOutputInfo setSnFInputTime(String value) {
        this.snFInputTime = value;
        return this;
    }

    /**
     * Gets the value of the overdueTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueTime() {
        return overdueTime;
    }

    /**
     * Sets the value of the overdueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFOutputInfo setOverdueTime(String value) {
        this.overdueTime = value;
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
