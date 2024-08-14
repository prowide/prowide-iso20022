
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
 * Amount of money due to a party as compensation for a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commission21", propOrder = {
    "comssnTp",
    "comssnApld"
})
public class Commission21 {

    @XmlElement(name = "ComssnTp", required = true)
    protected CommissionType5Choice comssnTp;
    @XmlElement(name = "ComssnApld", required = true)
    protected AmountOrRate3Choice comssnApld;

    /**
     * Gets the value of the comssnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType5Choice }
     *     
     */
    public CommissionType5Choice getComssnTp() {
        return comssnTp;
    }

    /**
     * Sets the value of the comssnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType5Choice }
     *     
     */
    public Commission21 setComssnTp(CommissionType5Choice value) {
        this.comssnTp = value;
        return this;
    }

    /**
     * Gets the value of the comssnApld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrRate3Choice }
     *     
     */
    public AmountOrRate3Choice getComssnApld() {
        return comssnApld;
    }

    /**
     * Sets the value of the comssnApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrRate3Choice }
     *     
     */
    public Commission21 setComssnApld(AmountOrRate3Choice value) {
        this.comssnApld = value;
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
