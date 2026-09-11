
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
 * Reports either on the risk management limit or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitMandateReport1", propOrder = {
    "svc",
    "mndtOrErr"
})
public class DirectDebitMandateReport1 {

    @XmlElement(name = "Svc")
    protected SystemAndCurrency1 svc;
    @XmlElement(name = "MndtOrErr", required = true)
    protected DirectDebitMandateOrBusinessError1Choice mndtOrErr;

    /**
     * Gets the value of the svc property.
     * 
     * @return
     *     possible object is
     *     {@link SystemAndCurrency1 }
     *     
     */
    public SystemAndCurrency1 getSvc() {
        return svc;
    }

    /**
     * Sets the value of the svc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAndCurrency1 }
     *     
     */
    public DirectDebitMandateReport1 setSvc(SystemAndCurrency1 value) {
        this.svc = value;
        return this;
    }

    /**
     * Gets the value of the mndtOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandateOrBusinessError1Choice }
     *     
     */
    public DirectDebitMandateOrBusinessError1Choice getMndtOrErr() {
        return mndtOrErr;
    }

    /**
     * Sets the value of the mndtOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandateOrBusinessError1Choice }
     *     
     */
    public DirectDebitMandateReport1 setMndtOrErr(DirectDebitMandateOrBusinessError1Choice value) {
        this.mndtOrErr = value;
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
