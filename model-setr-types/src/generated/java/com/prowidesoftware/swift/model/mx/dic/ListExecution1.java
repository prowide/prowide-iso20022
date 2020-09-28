
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details about of a list that must be executed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListExecution1", propOrder = {
    "listId",
    "clntBidId",
    "bidId"
})
public class ListExecution1 {

    @XmlElement(name = "ListId", required = true)
    protected String listId;
    @XmlElement(name = "ClntBidId")
    protected String clntBidId;
    @XmlElement(name = "BidId", required = true)
    protected String bidId;

    /**
     * Gets the value of the listId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListId() {
        return listId;
    }

    /**
     * Sets the value of the listId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ListExecution1 setListId(String value) {
        this.listId = value;
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
    public ListExecution1 setClntBidId(String value) {
        this.clntBidId = value;
        return this;
    }

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
    public ListExecution1 setBidId(String value) {
        this.bidId = value;
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
