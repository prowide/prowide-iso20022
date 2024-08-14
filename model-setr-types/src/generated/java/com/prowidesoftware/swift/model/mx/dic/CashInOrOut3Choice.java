
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
@XmlType(name = "CashInOrOut3Choice", propOrder = {
    "cshInPmtInstrm",
    "cshOutPmtInstrm"
})
public class CashInOrOut3Choice {

    @XmlElement(name = "CshInPmtInstrm")
    protected PaymentInstrument6Choice cshInPmtInstrm;
    @XmlElement(name = "CshOutPmtInstrm")
    protected PaymentInstrument7Choice cshOutPmtInstrm;

    /**
     * Gets the value of the cshInPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument6Choice }
     *     
     */
    public PaymentInstrument6Choice getCshInPmtInstrm() {
        return cshInPmtInstrm;
    }

    /**
     * Sets the value of the cshInPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument6Choice }
     *     
     */
    public CashInOrOut3Choice setCshInPmtInstrm(PaymentInstrument6Choice value) {
        this.cshInPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the cshOutPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument7Choice }
     *     
     */
    public PaymentInstrument7Choice getCshOutPmtInstrm() {
        return cshOutPmtInstrm;
    }

    /**
     * Sets the value of the cshOutPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument7Choice }
     *     
     */
    public CashInOrOut3Choice setCshOutPmtInstrm(PaymentInstrument7Choice value) {
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
