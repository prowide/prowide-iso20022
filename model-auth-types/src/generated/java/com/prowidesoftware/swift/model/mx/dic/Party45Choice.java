
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
 * Choice between issuer and sponsor information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party45Choice", propOrder = {
    "issrData",
    "spnsrData",
    "ctrPtyData"
})
public class Party45Choice {

    @XmlElement(name = "IssrData")
    protected Party6 issrData;
    @XmlElement(name = "SpnsrData")
    protected Party6 spnsrData;
    @XmlElement(name = "CtrPtyData")
    protected Party6 ctrPtyData;

    /**
     * Gets the value of the issrData property.
     * 
     * @return
     *     possible object is
     *     {@link Party6 }
     *     
     */
    public Party6 getIssrData() {
        return issrData;
    }

    /**
     * Sets the value of the issrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party6 }
     *     
     */
    public Party45Choice setIssrData(Party6 value) {
        this.issrData = value;
        return this;
    }

    /**
     * Gets the value of the spnsrData property.
     * 
     * @return
     *     possible object is
     *     {@link Party6 }
     *     
     */
    public Party6 getSpnsrData() {
        return spnsrData;
    }

    /**
     * Sets the value of the spnsrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party6 }
     *     
     */
    public Party45Choice setSpnsrData(Party6 value) {
        this.spnsrData = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyData property.
     * 
     * @return
     *     possible object is
     *     {@link Party6 }
     *     
     */
    public Party6 getCtrPtyData() {
        return ctrPtyData;
    }

    /**
     * Sets the value of the ctrPtyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party6 }
     *     
     */
    public Party45Choice setCtrPtyData(Party6 value) {
        this.ctrPtyData = value;
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
