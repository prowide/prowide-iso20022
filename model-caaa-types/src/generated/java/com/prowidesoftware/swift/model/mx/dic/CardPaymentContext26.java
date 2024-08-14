
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
 * Context in which the transaction is performed (payment and sale).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentContext26", propOrder = {
    "pmtCntxt",
    "saleCntxt",
    "drctDbtCntxt"
})
public class CardPaymentContext26 {

    @XmlElement(name = "PmtCntxt")
    protected PaymentContext24 pmtCntxt;
    @XmlElement(name = "SaleCntxt")
    protected SaleContext2 saleCntxt;
    @XmlElement(name = "DrctDbtCntxt")
    protected CardDirectDebit1 drctDbtCntxt;

    /**
     * Gets the value of the pmtCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentContext24 }
     *     
     */
    public PaymentContext24 getPmtCntxt() {
        return pmtCntxt;
    }

    /**
     * Sets the value of the pmtCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentContext24 }
     *     
     */
    public CardPaymentContext26 setPmtCntxt(PaymentContext24 value) {
        this.pmtCntxt = value;
        return this;
    }

    /**
     * Gets the value of the saleCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link SaleContext2 }
     *     
     */
    public SaleContext2 getSaleCntxt() {
        return saleCntxt;
    }

    /**
     * Sets the value of the saleCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleContext2 }
     *     
     */
    public CardPaymentContext26 setSaleCntxt(SaleContext2 value) {
        this.saleCntxt = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardDirectDebit1 }
     *     
     */
    public CardDirectDebit1 getDrctDbtCntxt() {
        return drctDbtCntxt;
    }

    /**
     * Sets the value of the drctDbtCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDirectDebit1 }
     *     
     */
    public CardPaymentContext26 setDrctDbtCntxt(CardDirectDebit1 value) {
        this.drctDbtCntxt = value;
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
