
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
 * Specifies the reason for the settlement fails as defined in the relevant regulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailureReason2", propOrder = {
    "mainRsns",
    "effcncyImprvmt"
})
public class SettlementFailureReason2 {

    @XmlElement(name = "MainRsns", required = true)
    protected String mainRsns;
    @XmlElement(name = "EffcncyImprvmt", required = true)
    protected String effcncyImprvmt;

    /**
     * Gets the value of the mainRsns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainRsns() {
        return mainRsns;
    }

    /**
     * Sets the value of the mainRsns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementFailureReason2 setMainRsns(String value) {
        this.mainRsns = value;
        return this;
    }

    /**
     * Gets the value of the effcncyImprvmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffcncyImprvmt() {
        return effcncyImprvmt;
    }

    /**
     * Sets the value of the effcncyImprvmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementFailureReason2 setEffcncyImprvmt(String value) {
        this.effcncyImprvmt = value;
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
