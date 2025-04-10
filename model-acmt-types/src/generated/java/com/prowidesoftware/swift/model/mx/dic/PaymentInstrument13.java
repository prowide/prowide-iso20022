
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
 * Instrument used to process a payment instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument13", propOrder = {
    "sttlmCcy",
    "dvddPctg",
    "sbcptPmtInstrm",
    "redPmtInstrm",
    "dvddPmtInstrm",
    "svgsPlanPmtInstrm",
    "intrstPmtInstrm"
})
public class PaymentInstrument13 {

    @XmlElement(name = "SttlmCcy", required = true)
    protected String sttlmCcy;
    @XmlElement(name = "DvddPctg")
    protected BigDecimal dvddPctg;
    @XmlElement(name = "SbcptPmtInstrm")
    protected PaymentInstrument18Choice sbcptPmtInstrm;
    @XmlElement(name = "RedPmtInstrm")
    protected PaymentInstrument19Choice redPmtInstrm;
    @XmlElement(name = "DvddPmtInstrm")
    protected PaymentInstrument19Choice dvddPmtInstrm;
    @XmlElement(name = "SvgsPlanPmtInstrm")
    protected PaymentInstrument18Choice svgsPlanPmtInstrm;
    @XmlElement(name = "IntrstPmtInstrm")
    protected PaymentInstrument19Choice intrstPmtInstrm;

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
    public PaymentInstrument13 setSttlmCcy(String value) {
        this.sttlmCcy = value;
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
    public PaymentInstrument13 setDvddPctg(BigDecimal value) {
        this.dvddPctg = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument18Choice }
     *     
     */
    public PaymentInstrument18Choice getSbcptPmtInstrm() {
        return sbcptPmtInstrm;
    }

    /**
     * Sets the value of the sbcptPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument18Choice }
     *     
     */
    public PaymentInstrument13 setSbcptPmtInstrm(PaymentInstrument18Choice value) {
        this.sbcptPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the redPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument19Choice }
     *     
     */
    public PaymentInstrument19Choice getRedPmtInstrm() {
        return redPmtInstrm;
    }

    /**
     * Sets the value of the redPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument19Choice }
     *     
     */
    public PaymentInstrument13 setRedPmtInstrm(PaymentInstrument19Choice value) {
        this.redPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the dvddPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument19Choice }
     *     
     */
    public PaymentInstrument19Choice getDvddPmtInstrm() {
        return dvddPmtInstrm;
    }

    /**
     * Sets the value of the dvddPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument19Choice }
     *     
     */
    public PaymentInstrument13 setDvddPmtInstrm(PaymentInstrument19Choice value) {
        this.dvddPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the svgsPlanPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument18Choice }
     *     
     */
    public PaymentInstrument18Choice getSvgsPlanPmtInstrm() {
        return svgsPlanPmtInstrm;
    }

    /**
     * Sets the value of the svgsPlanPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument18Choice }
     *     
     */
    public PaymentInstrument13 setSvgsPlanPmtInstrm(PaymentInstrument18Choice value) {
        this.svgsPlanPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the intrstPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument19Choice }
     *     
     */
    public PaymentInstrument19Choice getIntrstPmtInstrm() {
        return intrstPmtInstrm;
    }

    /**
     * Sets the value of the intrstPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument19Choice }
     *     
     */
    public PaymentInstrument13 setIntrstPmtInstrm(PaymentInstrument19Choice value) {
        this.intrstPmtInstrm = value;
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
