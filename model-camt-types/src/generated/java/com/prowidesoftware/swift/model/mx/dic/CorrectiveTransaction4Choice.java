
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
 * Specifies the corrective transaction on which the investigation is processed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectiveTransaction4Choice", propOrder = {
    "initn",
    "intrBk"
})
public class CorrectiveTransaction4Choice {

    @XmlElement(name = "Initn")
    protected CorrectivePaymentInitiation4 initn;
    @XmlElement(name = "IntrBk")
    protected CorrectiveInterbankTransaction2 intrBk;

    /**
     * Gets the value of the initn property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectivePaymentInitiation4 }
     *     
     */
    public CorrectivePaymentInitiation4 getInitn() {
        return initn;
    }

    /**
     * Sets the value of the initn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectivePaymentInitiation4 }
     *     
     */
    public CorrectiveTransaction4Choice setInitn(CorrectivePaymentInitiation4 value) {
        this.initn = value;
        return this;
    }

    /**
     * Gets the value of the intrBk property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveInterbankTransaction2 }
     *     
     */
    public CorrectiveInterbankTransaction2 getIntrBk() {
        return intrBk;
    }

    /**
     * Sets the value of the intrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveInterbankTransaction2 }
     *     
     */
    public CorrectiveTransaction4Choice setIntrBk(CorrectiveInterbankTransaction2 value) {
        this.intrBk = value;
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
