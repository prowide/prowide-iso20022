
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "PaymentTerms2", propOrder = {
    "othrPmtTerms",
    "pmtCd",
    "pctg",
    "amt"
})
public class PaymentTerms2 {

    @XmlElement(name = "OthrPmtTerms")
    protected String othrPmtTerms;
    @XmlElement(name = "PmtCd")
    protected PaymentPeriod2 pmtCd;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Amt")
    protected CurrencyAndAmount amt;

    /**
     * Gets the value of the othrPmtTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPmtTerms() {
        return othrPmtTerms;
    }

    /**
     * Sets the value of the othrPmtTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTerms2 setOthrPmtTerms(String value) {
        this.othrPmtTerms = value;
        return this;
    }

    /**
     * Gets the value of the pmtCd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPeriod2 }
     *     
     */
    public PaymentPeriod2 getPmtCd() {
        return pmtCd;
    }

    /**
     * Sets the value of the pmtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPeriod2 }
     *     
     */
    public PaymentTerms2 setPmtCd(PaymentPeriod2 value) {
        this.pmtCd = value;
        return this;
    }

    /**
     * Gets the value of the pctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentTerms2 setPctg(BigDecimal value) {
        this.pctg = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public PaymentTerms2 setAmt(CurrencyAndAmount value) {
        this.amt = value;
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
