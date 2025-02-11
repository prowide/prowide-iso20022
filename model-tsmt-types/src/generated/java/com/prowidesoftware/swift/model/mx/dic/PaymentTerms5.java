
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
 * Specifies the payment terms of the underlying transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTerms5", propOrder = {
    "pmtTerms",
    "amtOrPctg"
})
public class PaymentTerms5 {

    @XmlElement(name = "PmtTerms", required = true)
    protected PaymentCodeOrOther2Choice pmtTerms;
    @XmlElement(name = "AmtOrPctg", required = true)
    protected AmountOrPercentage2Choice amtOrPctg;

    /**
     * Gets the value of the pmtTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCodeOrOther2Choice }
     *     
     */
    public PaymentCodeOrOther2Choice getPmtTerms() {
        return pmtTerms;
    }

    /**
     * Sets the value of the pmtTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCodeOrOther2Choice }
     *     
     */
    public PaymentTerms5 setPmtTerms(PaymentCodeOrOther2Choice value) {
        this.pmtTerms = value;
        return this;
    }

    /**
     * Gets the value of the amtOrPctg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentage2Choice }
     *     
     */
    public AmountOrPercentage2Choice getAmtOrPctg() {
        return amtOrPctg;
    }

    /**
     * Sets the value of the amtOrPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentage2Choice }
     *     
     */
    public PaymentTerms5 setAmtOrPctg(AmountOrPercentage2Choice value) {
        this.amtOrPctg = value;
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
