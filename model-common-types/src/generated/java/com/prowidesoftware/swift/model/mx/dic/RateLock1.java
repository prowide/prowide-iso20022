
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
 * Indicators about rate lock.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateLock1", propOrder = {
    "reqdInd",
    "elgblInd",
    "apldInd"
})
public class RateLock1 {

    @XmlElement(name = "ReqdInd")
    protected Boolean reqdInd;
    @XmlElement(name = "ElgblInd")
    protected Boolean elgblInd;
    @XmlElement(name = "ApldInd")
    protected Boolean apldInd;

    /**
     * Gets the value of the reqdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqdInd() {
        return reqdInd;
    }

    /**
     * Sets the value of the reqdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RateLock1 setReqdInd(Boolean value) {
        this.reqdInd = value;
        return this;
    }

    /**
     * Gets the value of the elgblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElgblInd() {
        return elgblInd;
    }

    /**
     * Sets the value of the elgblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RateLock1 setElgblInd(Boolean value) {
        this.elgblInd = value;
        return this;
    }

    /**
     * Gets the value of the apldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApldInd() {
        return apldInd;
    }

    /**
     * Sets the value of the apldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RateLock1 setApldInd(Boolean value) {
        this.apldInd = value;
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
