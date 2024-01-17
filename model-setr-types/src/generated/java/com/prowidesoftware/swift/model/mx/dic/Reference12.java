
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Additional references linked to the list order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference12", propOrder = {
    "bidId",
    "clntBidId",
    "ioiId",
    "qtId",
    "refOrdrId"
})
public class Reference12 {

    @XmlElement(name = "BidId")
    protected String bidId;
    @XmlElement(name = "ClntBidId")
    protected String clntBidId;
    @XmlElement(name = "IOIId", required = true)
    protected String ioiId;
    @XmlElement(name = "QtId", required = true)
    protected String qtId;
    @XmlElement(name = "RefOrdrId", required = true)
    protected String refOrdrId;

    /**
     * Gets the value of the bidId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidId() {
        return bidId;
    }

    /**
     * Sets the value of the bidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference12 setBidId(String value) {
        this.bidId = value;
        return this;
    }

    /**
     * Gets the value of the clntBidId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntBidId() {
        return clntBidId;
    }

    /**
     * Sets the value of the clntBidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference12 setClntBidId(String value) {
        this.clntBidId = value;
        return this;
    }

    /**
     * Gets the value of the ioiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIOIId() {
        return ioiId;
    }

    /**
     * Sets the value of the ioiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference12 setIOIId(String value) {
        this.ioiId = value;
        return this;
    }

    /**
     * Gets the value of the qtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtId() {
        return qtId;
    }

    /**
     * Sets the value of the qtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference12 setQtId(String value) {
        this.qtId = value;
        return this;
    }

    /**
     * Gets the value of the refOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefOrdrId() {
        return refOrdrId;
    }

    /**
     * Sets the value of the refOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference12 setRefOrdrId(String value) {
        this.refOrdrId = value;
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
