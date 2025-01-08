
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
 * Reference to the transaction identifier issued by the counterparty. Building block may also be used to reference a previous transaction, or tie a set of messages together.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References20", propOrder = {
    "poolRef",
    "prvsRef",
    "rltdRef"
})
public class References20 {

    @XmlElement(name = "PoolRef")
    protected AdditionalReference6 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference6 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference6 rltdRef;

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AdditionalReference6 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference6 }
     *     
     */
    public References20 setPoolRef(AdditionalReference6 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AdditionalReference6 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference6 }
     *     
     */
    public References20 setPrvsRef(AdditionalReference6 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AdditionalReference6 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference6 }
     *     
     */
    public References20 setRltdRef(AdditionalReference6 value) {
        this.rltdRef = value;
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
