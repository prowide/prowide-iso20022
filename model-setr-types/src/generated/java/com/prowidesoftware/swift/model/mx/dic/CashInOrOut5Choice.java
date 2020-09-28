
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
 * Choice of a payment instrument for the cash-in flow or cash-out flow.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashInOrOut5Choice", propOrder = {
    "cshInPmtInstrm",
    "cshOutPmtInstrm"
})
public class CashInOrOut5Choice {

    @XmlElement(name = "CshInPmtInstrm")
    protected PaymentInstrument12Choice cshInPmtInstrm;
    @XmlElement(name = "CshOutPmtInstrm")
    protected PaymentInstrument11Choice cshOutPmtInstrm;

    /**
     * Gets the value of the cshInPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument12Choice }
     *     
     */
    public PaymentInstrument12Choice getCshInPmtInstrm() {
        return cshInPmtInstrm;
    }

    /**
     * Sets the value of the cshInPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument12Choice }
     *     
     */
    public CashInOrOut5Choice setCshInPmtInstrm(PaymentInstrument12Choice value) {
        this.cshInPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the cshOutPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument11Choice }
     *     
     */
    public PaymentInstrument11Choice getCshOutPmtInstrm() {
        return cshOutPmtInstrm;
    }

    /**
     * Sets the value of the cshOutPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument11Choice }
     *     
     */
    public CashInOrOut5Choice setCshOutPmtInstrm(PaymentInstrument11Choice value) {
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
