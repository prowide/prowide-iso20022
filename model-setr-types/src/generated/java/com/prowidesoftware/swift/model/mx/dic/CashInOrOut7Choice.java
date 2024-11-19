
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
 * Choice of a payment instrument for the cash-in flow or cash-out flow.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashInOrOut7Choice", propOrder = {
    "cshInPmtInstrm",
    "cshOutPmtInstrm"
})
public class CashInOrOut7Choice {

    @XmlElement(name = "CshInPmtInstrm")
    protected PaymentInstrument20Choice cshInPmtInstrm;
    @XmlElement(name = "CshOutPmtInstrm")
    protected PaymentInstrument21Choice cshOutPmtInstrm;

    /**
     * Gets the value of the cshInPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument20Choice }
     *     
     */
    public PaymentInstrument20Choice getCshInPmtInstrm() {
        return cshInPmtInstrm;
    }

    /**
     * Sets the value of the cshInPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument20Choice }
     *     
     */
    public CashInOrOut7Choice setCshInPmtInstrm(PaymentInstrument20Choice value) {
        this.cshInPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the cshOutPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument21Choice }
     *     
     */
    public PaymentInstrument21Choice getCshOutPmtInstrm() {
        return cshOutPmtInstrm;
    }

    /**
     * Sets the value of the cshOutPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument21Choice }
     *     
     */
    public CashInOrOut7Choice setCshOutPmtInstrm(PaymentInstrument21Choice value) {
        this.cshOutPmtInstrm = value;
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
