
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
@XmlType(name = "CorrectiveTransaction3Choice", propOrder = {
    "initn",
    "intrBk"
})
public class CorrectiveTransaction3Choice {

    @XmlElement(name = "Initn")
    protected CorrectivePaymentInitiation3 initn;
    @XmlElement(name = "IntrBk")
    protected CorrectiveInterbankTransaction1 intrBk;

    /**
     * Gets the value of the initn property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectivePaymentInitiation3 }
     *     
     */
    public CorrectivePaymentInitiation3 getInitn() {
        return initn;
    }

    /**
     * Sets the value of the initn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectivePaymentInitiation3 }
     *     
     */
    public CorrectiveTransaction3Choice setInitn(CorrectivePaymentInitiation3 value) {
        this.initn = value;
        return this;
    }

    /**
     * Gets the value of the intrBk property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveInterbankTransaction1 }
     *     
     */
    public CorrectiveInterbankTransaction1 getIntrBk() {
        return intrBk;
    }

    /**
     * Sets the value of the intrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveInterbankTransaction1 }
     *     
     */
    public CorrectiveTransaction3Choice setIntrBk(CorrectiveInterbankTransaction1 value) {
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
