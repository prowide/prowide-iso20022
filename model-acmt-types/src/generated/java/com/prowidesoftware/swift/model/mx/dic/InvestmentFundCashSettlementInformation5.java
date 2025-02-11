
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
 * Settlement instructions to be used to transfer cash from the Debtor to the Creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundCashSettlementInformation5", propOrder = {
    "sbcptPmtInstrm",
    "redPmtInstrm",
    "dvddPmtInstrm",
    "svgsPlanPmtInstrm",
    "intrstPmtInstrm"
})
public class InvestmentFundCashSettlementInformation5 {

    @XmlElement(name = "SbcptPmtInstrm")
    protected PaymentInstrument11 sbcptPmtInstrm;
    @XmlElement(name = "RedPmtInstrm")
    protected PaymentInstrument10 redPmtInstrm;
    @XmlElement(name = "DvddPmtInstrm")
    protected PaymentInstrument10 dvddPmtInstrm;
    @XmlElement(name = "SvgsPlanPmtInstrm")
    protected PaymentInstrument11 svgsPlanPmtInstrm;
    @XmlElement(name = "IntrstPmtInstrm")
    protected PaymentInstrument10 intrstPmtInstrm;

    /**
     * Gets the value of the sbcptPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument11 }
     *     
     */
    public PaymentInstrument11 getSbcptPmtInstrm() {
        return sbcptPmtInstrm;
    }

    /**
     * Sets the value of the sbcptPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument11 }
     *     
     */
    public InvestmentFundCashSettlementInformation5 setSbcptPmtInstrm(PaymentInstrument11 value) {
        this.sbcptPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the redPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument10 }
     *     
     */
    public PaymentInstrument10 getRedPmtInstrm() {
        return redPmtInstrm;
    }

    /**
     * Sets the value of the redPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument10 }
     *     
     */
    public InvestmentFundCashSettlementInformation5 setRedPmtInstrm(PaymentInstrument10 value) {
        this.redPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the dvddPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument10 }
     *     
     */
    public PaymentInstrument10 getDvddPmtInstrm() {
        return dvddPmtInstrm;
    }

    /**
     * Sets the value of the dvddPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument10 }
     *     
     */
    public InvestmentFundCashSettlementInformation5 setDvddPmtInstrm(PaymentInstrument10 value) {
        this.dvddPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the svgsPlanPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument11 }
     *     
     */
    public PaymentInstrument11 getSvgsPlanPmtInstrm() {
        return svgsPlanPmtInstrm;
    }

    /**
     * Sets the value of the svgsPlanPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument11 }
     *     
     */
    public InvestmentFundCashSettlementInformation5 setSvgsPlanPmtInstrm(PaymentInstrument11 value) {
        this.svgsPlanPmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the intrstPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument10 }
     *     
     */
    public PaymentInstrument10 getIntrstPmtInstrm() {
        return intrstPmtInstrm;
    }

    /**
     * Sets the value of the intrstPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument10 }
     *     
     */
    public InvestmentFundCashSettlementInformation5 setIntrstPmtInstrm(PaymentInstrument10 value) {
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
