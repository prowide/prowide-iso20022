
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
 * Choice between types of payment instrument, that is, cheque, credit transfer, direct debit, investment account or payment card.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument27Choice", propOrder = {
    "pmtCardDtls",
    "cdtTrfDtls",
    "drctDbtDtls",
    "chqDtls",
    "bkrsDrftDtls",
    "cshAcctDtls"
})
public class PaymentInstrument27Choice {

    @XmlElement(name = "PmtCardDtls")
    protected PaymentCard34 pmtCardDtls;
    @XmlElement(name = "CdtTrfDtls")
    protected CreditTransfer10 cdtTrfDtls;
    @XmlElement(name = "DrctDbtDtls")
    protected DirectDebitMandate8 drctDbtDtls;
    @XmlElement(name = "ChqDtls")
    protected Cheque21 chqDtls;
    @XmlElement(name = "BkrsDrftDtls")
    protected Cheque21 bkrsDrftDtls;
    @XmlElement(name = "CshAcctDtls")
    protected InvestmentAccount60 cshAcctDtls;

    /**
     * Gets the value of the pmtCardDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard34 }
     *     
     */
    public PaymentCard34 getPmtCardDtls() {
        return pmtCardDtls;
    }

    /**
     * Sets the value of the pmtCardDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard34 }
     *     
     */
    public PaymentInstrument27Choice setPmtCardDtls(PaymentCard34 value) {
        this.pmtCardDtls = value;
        return this;
    }

    /**
     * Gets the value of the cdtTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransfer10 }
     *     
     */
    public CreditTransfer10 getCdtTrfDtls() {
        return cdtTrfDtls;
    }

    /**
     * Sets the value of the cdtTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransfer10 }
     *     
     */
    public PaymentInstrument27Choice setCdtTrfDtls(CreditTransfer10 value) {
        this.cdtTrfDtls = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandate8 }
     *     
     */
    public DirectDebitMandate8 getDrctDbtDtls() {
        return drctDbtDtls;
    }

    /**
     * Sets the value of the drctDbtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandate8 }
     *     
     */
    public PaymentInstrument27Choice setDrctDbtDtls(DirectDebitMandate8 value) {
        this.drctDbtDtls = value;
        return this;
    }

    /**
     * Gets the value of the chqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque21 }
     *     
     */
    public Cheque21 getChqDtls() {
        return chqDtls;
    }

    /**
     * Sets the value of the chqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque21 }
     *     
     */
    public PaymentInstrument27Choice setChqDtls(Cheque21 value) {
        this.chqDtls = value;
        return this;
    }

    /**
     * Gets the value of the bkrsDrftDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque21 }
     *     
     */
    public Cheque21 getBkrsDrftDtls() {
        return bkrsDrftDtls;
    }

    /**
     * Sets the value of the bkrsDrftDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque21 }
     *     
     */
    public PaymentInstrument27Choice setBkrsDrftDtls(Cheque21 value) {
        this.bkrsDrftDtls = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount60 }
     *     
     */
    public InvestmentAccount60 getCshAcctDtls() {
        return cshAcctDtls;
    }

    /**
     * Sets the value of the cshAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount60 }
     *     
     */
    public PaymentInstrument27Choice setCshAcctDtls(InvestmentAccount60 value) {
        this.cshAcctDtls = value;
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
