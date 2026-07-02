
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
 * Context in which the transaction is performed (payment and sale).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentContext8", propOrder = {
    "pmtCntxt",
    "saleCntxt"
})
public class CardPaymentContext8 {

    @XmlElement(name = "PmtCntxt", required = true)
    protected PaymentContext8 pmtCntxt;
    @XmlElement(name = "SaleCntxt")
    protected SaleContext1 saleCntxt;

    /**
     * Gets the value of the pmtCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentContext8 }
     *     
     */
    public PaymentContext8 getPmtCntxt() {
        return pmtCntxt;
    }

    /**
     * Sets the value of the pmtCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentContext8 }
     *     
     */
    public CardPaymentContext8 setPmtCntxt(PaymentContext8 value) {
        this.pmtCntxt = value;
        return this;
    }

    /**
     * Gets the value of the saleCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link SaleContext1 }
     *     
     */
    public SaleContext1 getSaleCntxt() {
        return saleCntxt;
    }

    /**
     * Sets the value of the saleCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleContext1 }
     *     
     */
    public CardPaymentContext8 setSaleCntxt(SaleContext1 value) {
        this.saleCntxt = value;
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
