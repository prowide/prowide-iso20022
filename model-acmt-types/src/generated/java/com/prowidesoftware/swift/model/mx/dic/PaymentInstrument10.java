
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
 * Instrument that has or represents monetary value and is used to process a payment instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument10", propOrder = {
    "sttlmCcy",
    "pmtInstrm",
    "dvddPctg"
})
public class PaymentInstrument10 {

    @XmlElement(name = "SttlmCcy", required = true)
    protected String sttlmCcy;
    @XmlElement(name = "PmtInstrm", required = true)
    protected PaymentInstrument16Choice pmtInstrm;
    @XmlElement(name = "DvddPctg")
    protected BigDecimal dvddPctg;

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstrument10 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument16Choice }
     *     
     */
    public PaymentInstrument16Choice getPmtInstrm() {
        return pmtInstrm;
    }

    /**
     * Sets the value of the pmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument16Choice }
     *     
     */
    public PaymentInstrument10 setPmtInstrm(PaymentInstrument16Choice value) {
        this.pmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the dvddPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDvddPctg() {
        return dvddPctg;
    }

    /**
     * Sets the value of the dvddPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentInstrument10 setDvddPctg(BigDecimal value) {
        this.dvddPctg = value;
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
