
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
 * Loan offered by a group of lenders (called a syndicate) who work together to lend an amount of money to a single borrower.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyndicatedLoan1", propOrder = {
    "brrwr",
    "lndr",
    "amt",
    "shr",
    "xchgRateInf"
})
public class SyndicatedLoan1 {

    @XmlElement(name = "Brrwr", required = true)
    protected TradeParty2 brrwr;
    @XmlElement(name = "Lndr")
    protected TradeParty2 lndr;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "Shr")
    protected BigDecimal shr;
    @XmlElement(name = "XchgRateInf")
    protected ExchangeRate1 xchgRateInf;

    /**
     * Gets the value of the brrwr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty2 }
     *     
     */
    public TradeParty2 getBrrwr() {
        return brrwr;
    }

    /**
     * Sets the value of the brrwr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty2 }
     *     
     */
    public SyndicatedLoan1 setBrrwr(TradeParty2 value) {
        this.brrwr = value;
        return this;
    }

    /**
     * Gets the value of the lndr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty2 }
     *     
     */
    public TradeParty2 getLndr() {
        return lndr;
    }

    /**
     * Sets the value of the lndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty2 }
     *     
     */
    public SyndicatedLoan1 setLndr(TradeParty2 value) {
        this.lndr = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SyndicatedLoan1 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the shr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShr() {
        return shr;
    }

    /**
     * Sets the value of the shr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SyndicatedLoan1 setShr(BigDecimal value) {
        this.shr = value;
        return this;
    }

    /**
     * Gets the value of the xchgRateInf property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRate1 }
     *     
     */
    public ExchangeRate1 getXchgRateInf() {
        return xchgRateInf;
    }

    /**
     * Sets the value of the xchgRateInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRate1 }
     *     
     */
    public SyndicatedLoan1 setXchgRateInf(ExchangeRate1 value) {
        this.xchgRateInf = value;
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
