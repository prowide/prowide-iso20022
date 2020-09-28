
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
 * Choice of formats for the type of charge.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charge26", propOrder = {
    "tp",
    "chrgApld"
})
public class Charge26 {

    @XmlElement(name = "Tp", required = true)
    protected ChargeType4Choice tp;
    @XmlElement(name = "ChrgApld", required = true)
    protected AmountOrRate3Choice chrgApld;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType4Choice }
     *     
     */
    public ChargeType4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType4Choice }
     *     
     */
    public Charge26 setTp(ChargeType4Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the chrgApld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrRate3Choice }
     *     
     */
    public AmountOrRate3Choice getChrgApld() {
        return chrgApld;
    }

    /**
     * Sets the value of the chrgApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrRate3Choice }
     *     
     */
    public Charge26 setChrgApld(AmountOrRate3Choice value) {
        this.chrgApld = value;
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
