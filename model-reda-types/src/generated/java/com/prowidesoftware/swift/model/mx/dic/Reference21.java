
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
 * Reference to the collateral management transaction (exposure) or the contract identification of  the sender (collateral taker) or the receiver (triparty agent)
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference21", propOrder = {
    "sndrCollTxId",
    "rcvrCollTxId",
    "sndrCollCtrctId",
    "rcvrCollCtrctId",
    "cmonTxId"
})
public class Reference21 {

    @XmlElement(name = "SndrCollTxId")
    protected String sndrCollTxId;
    @XmlElement(name = "RcvrCollTxId")
    protected String rcvrCollTxId;
    @XmlElement(name = "SndrCollCtrctId")
    protected String sndrCollCtrctId;
    @XmlElement(name = "RcvrCollCtrctId")
    protected String rcvrCollCtrctId;
    @XmlElement(name = "CmonTxId")
    protected String cmonTxId;

    /**
     * Gets the value of the sndrCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrCollTxId() {
        return sndrCollTxId;
    }

    /**
     * Sets the value of the sndrCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference21 setSndrCollTxId(String value) {
        this.sndrCollTxId = value;
        return this;
    }

    /**
     * Gets the value of the rcvrCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrCollTxId() {
        return rcvrCollTxId;
    }

    /**
     * Sets the value of the rcvrCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference21 setRcvrCollTxId(String value) {
        this.rcvrCollTxId = value;
        return this;
    }

    /**
     * Gets the value of the sndrCollCtrctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrCollCtrctId() {
        return sndrCollCtrctId;
    }

    /**
     * Sets the value of the sndrCollCtrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference21 setSndrCollCtrctId(String value) {
        this.sndrCollCtrctId = value;
        return this;
    }

    /**
     * Gets the value of the rcvrCollCtrctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrCollCtrctId() {
        return rcvrCollCtrctId;
    }

    /**
     * Sets the value of the rcvrCollCtrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference21 setRcvrCollCtrctId(String value) {
        this.rcvrCollCtrctId = value;
        return this;
    }

    /**
     * Gets the value of the cmonTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonTxId() {
        return cmonTxId;
    }

    /**
     * Sets the value of the cmonTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference21 setCmonTxId(String value) {
        this.cmonTxId = value;
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
