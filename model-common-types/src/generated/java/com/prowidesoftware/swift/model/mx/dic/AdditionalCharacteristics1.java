
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
 * Contains additional characteristics of addendum data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalCharacteristics1", propOrder = {
    "bizTp",
    "ownr",
    "certfctn",
    "ownrEthncty"
})
public class AdditionalCharacteristics1 {

    @XmlElement(name = "BizTp")
    protected AdditionalCharacteristicDetails1 bizTp;
    @XmlElement(name = "Ownr")
    protected AdditionalCharacteristicDetails1 ownr;
    @XmlElement(name = "Certfctn")
    protected AdditionalCharacteristicDetails1 certfctn;
    @XmlElement(name = "OwnrEthncty")
    protected AdditionalCharacteristicDetails1 ownrEthncty;

    /**
     * Gets the value of the bizTp property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public AdditionalCharacteristicDetails1 getBizTp() {
        return bizTp;
    }

    /**
     * Sets the value of the bizTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public AdditionalCharacteristics1 setBizTp(AdditionalCharacteristicDetails1 value) {
        this.bizTp = value;
        return this;
    }

    /**
     * Gets the value of the ownr property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public AdditionalCharacteristicDetails1 getOwnr() {
        return ownr;
    }

    /**
     * Sets the value of the ownr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public AdditionalCharacteristics1 setOwnr(AdditionalCharacteristicDetails1 value) {
        this.ownr = value;
        return this;
    }

    /**
     * Gets the value of the certfctn property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public AdditionalCharacteristicDetails1 getCertfctn() {
        return certfctn;
    }

    /**
     * Sets the value of the certfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public AdditionalCharacteristics1 setCertfctn(AdditionalCharacteristicDetails1 value) {
        this.certfctn = value;
        return this;
    }

    /**
     * Gets the value of the ownrEthncty property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public AdditionalCharacteristicDetails1 getOwnrEthncty() {
        return ownrEthncty;
    }

    /**
     * Sets the value of the ownrEthncty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public AdditionalCharacteristics1 setOwnrEthncty(AdditionalCharacteristicDetails1 value) {
        this.ownrEthncty = value;
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
