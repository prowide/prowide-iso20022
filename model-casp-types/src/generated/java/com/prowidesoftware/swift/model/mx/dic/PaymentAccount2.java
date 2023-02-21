
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data related to an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentAccount2", propOrder = {
    "ccy",
    "curBal",
    "pmtAcqrrData"
})
public class PaymentAccount2 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CurBal")
    protected BigDecimal curBal;
    @XmlElement(name = "PmtAcqrrData")
    protected Acquirer9 pmtAcqrrData;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentAccount2 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentAccount2 setCurBal(BigDecimal value) {
        this.curBal = value;
        return this;
    }

    /**
     * Gets the value of the pmtAcqrrData property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer9 }
     *     
     */
    public Acquirer9 getPmtAcqrrData() {
        return pmtAcqrrData;
    }

    /**
     * Sets the value of the pmtAcqrrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer9 }
     *     
     */
    public PaymentAccount2 setPmtAcqrrData(Acquirer9 value) {
        this.pmtAcqrrData = value;
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
