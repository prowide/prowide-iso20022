
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
 * Payment processes required to transfer cash from the debtor to the creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction28", propOrder = {
    "pmtInstrm"
})
public class PaymentTransaction28 {

    @XmlElement(name = "PmtInstrm")
    protected PaymentInstrument14Choice pmtInstrm;

    /**
     * Gets the value of the pmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument14Choice }
     *     
     */
    public PaymentInstrument14Choice getPmtInstrm() {
        return pmtInstrm;
    }

    /**
     * Sets the value of the pmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument14Choice }
     *     
     */
    public PaymentTransaction28 setPmtInstrm(PaymentInstrument14Choice value) {
        this.pmtInstrm = value;
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
