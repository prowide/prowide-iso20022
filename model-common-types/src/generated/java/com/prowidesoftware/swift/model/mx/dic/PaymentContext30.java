
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
@XmlType(name = "PaymentContext30", propOrder = {
    "pmtCntxt",
    "saleCntxt",
    "cdtTrfCntxt",
    "drctDbtCntxt"
})
public class PaymentContext30 {

    @XmlElement(name = "PmtCntxt")
    protected PaymentContext29 pmtCntxt;
    @XmlElement(name = "SaleCntxt")
    protected SaleContext4 saleCntxt;
    @XmlElement(name = "CdtTrfCntxt")
    protected CreditTransferContext1 cdtTrfCntxt;
    @XmlElement(name = "DrctDbtCntxt")
    protected DirectDebitContext1 drctDbtCntxt;

    /**
     * Gets the value of the pmtCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentContext29 }
     *     
     */
    public PaymentContext29 getPmtCntxt() {
        return pmtCntxt;
    }

    /**
     * Sets the value of the pmtCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentContext29 }
     *     
     */
    public PaymentContext30 setPmtCntxt(PaymentContext29 value) {
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
    public PaymentContext30 setSaleCntxt(SaleContext4 value) {
        this.saleCntxt = value;
        return this;
    }

    /**
     * Gets the value of the cdtTrfCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferContext1 }
     *     
     */
    public CreditTransferContext1 getCdtTrfCntxt() {
        return cdtTrfCntxt;
    }

    /**
     * Sets the value of the cdtTrfCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferContext1 }
     *     
     */
    public PaymentContext30 setCdtTrfCntxt(CreditTransferContext1 value) {
        this.cdtTrfCntxt = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitContext1 }
     *     
     */
    public DirectDebitContext1 getDrctDbtCntxt() {
        return drctDbtCntxt;
    }

    /**
     * Sets the value of the drctDbtCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitContext1 }
     *     
     */
    public PaymentContext30 setDrctDbtCntxt(DirectDebitContext1 value) {
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
