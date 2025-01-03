
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
@XmlType(name = "CardPaymentContext28", propOrder = {
    "pmtCntxt",
    "saleCntxt",
    "drctDbtCntxt"
})
public class CardPaymentContext28 {

    @XmlElement(name = "PmtCntxt")
    protected PaymentContext27 pmtCntxt;
    @XmlElement(name = "SaleCntxt")
    protected SaleContext4 saleCntxt;
    @XmlElement(name = "DrctDbtCntxt")
    protected CardDirectDebit2 drctDbtCntxt;

    /**
     * Gets the value of the pmtCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentContext27 }
     *     
     */
    public PaymentContext27 getPmtCntxt() {
        return pmtCntxt;
    }

    /**
     * Sets the value of the pmtCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentContext27 }
     *     
     */
    public CardPaymentContext28 setPmtCntxt(PaymentContext27 value) {
        this.pmtCntxt = value;
        return this;
    }

    /**
     * Gets the value of the saleCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link SaleContext4 }
     *     
     */
    public SaleContext4 getSaleCntxt() {
        return saleCntxt;
    }

    /**
     * Sets the value of the saleCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleContext4 }
     *     
     */
    public CardPaymentContext28 setSaleCntxt(SaleContext4 value) {
        this.saleCntxt = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardDirectDebit2 }
     *     
     */
    public CardDirectDebit2 getDrctDbtCntxt() {
        return drctDbtCntxt;
    }

    /**
     * Sets the value of the drctDbtCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDirectDebit2 }
     *     
     */
    public CardPaymentContext28 setDrctDbtCntxt(CardDirectDebit2 value) {
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
