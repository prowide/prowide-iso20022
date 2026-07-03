
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
 * Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafeKeepingPlace1", propOrder = {
    "sfkpgPlcFrmt",
    "lei"
})
public class SafeKeepingPlace1 {

    @XmlElement(name = "SfkpgPlcFrmt")
    protected SafekeepingPlaceFormat10Choice sfkpgPlcFrmt;
    @XmlElement(name = "LEI")
    protected String lei;

    /**
     * Gets the value of the sfkpgPlcFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat10Choice }
     *     
     */
    public SafekeepingPlaceFormat10Choice getSfkpgPlcFrmt() {
        return sfkpgPlcFrmt;
    }

    /**
     * Sets the value of the sfkpgPlcFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat10Choice }
     *     
     */
    public SafeKeepingPlace1 setSfkpgPlcFrmt(SafekeepingPlaceFormat10Choice value) {
        this.sfkpgPlcFrmt = value;
        return this;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SafeKeepingPlace1 setLEI(String value) {
        this.lei = value;
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
