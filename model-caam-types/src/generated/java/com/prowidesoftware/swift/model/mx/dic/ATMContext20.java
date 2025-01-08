
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
 * Context of the exception.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMContext20", propOrder = {
    "ssnRef",
    "svc"
})
public class ATMContext20 {

    @XmlElement(name = "SsnRef")
    protected String ssnRef;
    @XmlElement(name = "Svc", required = true)
    protected ATMService24 svc;

    /**
     * Gets the value of the ssnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsnRef() {
        return ssnRef;
    }

    /**
     * Sets the value of the ssnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMContext20 setSsnRef(String value) {
        this.ssnRef = value;
        return this;
    }

    /**
     * Gets the value of the svc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMService24 }
     *     
     */
    public ATMService24 getSvc() {
        return svc;
    }

    /**
     * Sets the value of the svc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMService24 }
     *     
     */
    public ATMContext20 setSvc(ATMService24 value) {
        this.svc = value;
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
