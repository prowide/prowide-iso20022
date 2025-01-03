
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
 * Choice between types of payment instrument, that is, cheque, credit transfer, direct debit, investment account or payment card.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument20Choice", propOrder = {
    "pmtCardDtls",
    "cdtTrfDtls",
    "drctDbtDtls",
    "chqDtls",
    "bkrsDrftDtls",
    "cshAcctDtls"
})
public class PaymentInstrument20Choice {

    @XmlElement(name = "PmtCardDtls")
    protected PaymentCard25 pmtCardDtls;
    @XmlElement(name = "CdtTrfDtls")
    protected CreditTransfer8 cdtTrfDtls;
    @XmlElement(name = "DrctDbtDtls")
    protected DirectDebitMandate6 drctDbtDtls;
    @XmlElement(name = "ChqDtls")
    protected Cheque9 chqDtls;
    @XmlElement(name = "BkrsDrftDtls")
    protected Cheque9 bkrsDrftDtls;
    @XmlElement(name = "CshAcctDtls")
    protected InvestmentAccount60 cshAcctDtls;

    /**
     * Gets the value of the pmtCardDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard25 }
     *     
     */
    public PaymentCard25 getPmtCardDtls() {
        return pmtCardDtls;
    }

    /**
     * Sets the value of the pmtCardDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard25 }
     *     
     */
    public PaymentInstrument20Choice setPmtCardDtls(PaymentCard25 value) {
        this.pmtCardDtls = value;
        return this;
    }

    /**
     * Gets the value of the cdtTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransfer8 }
     *     
     */
    public CreditTransfer8 getCdtTrfDtls() {
        return cdtTrfDtls;
    }

    /**
     * Sets the value of the cdtTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransfer8 }
     *     
     */
    public PaymentInstrument20Choice setCdtTrfDtls(CreditTransfer8 value) {
        this.cdtTrfDtls = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandate6 }
     *     
     */
    public DirectDebitMandate6 getDrctDbtDtls() {
        return drctDbtDtls;
    }

    /**
     * Sets the value of the drctDbtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandate6 }
     *     
     */
    public PaymentInstrument20Choice setDrctDbtDtls(DirectDebitMandate6 value) {
        this.drctDbtDtls = value;
        return this;
    }

    /**
     * Gets the value of the chqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque9 }
     *     
     */
    public Cheque9 getChqDtls() {
        return chqDtls;
    }

    /**
     * Sets the value of the chqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque9 }
     *     
     */
    public PaymentInstrument20Choice setChqDtls(Cheque9 value) {
        this.chqDtls = value;
        return this;
    }

    /**
     * Gets the value of the bkrsDrftDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque9 }
     *     
     */
    public Cheque9 getBkrsDrftDtls() {
        return bkrsDrftDtls;
    }

    /**
     * Sets the value of the bkrsDrftDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque9 }
     *     
     */
    public PaymentInstrument20Choice setBkrsDrftDtls(Cheque9 value) {
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
    public PaymentInstrument20Choice setCshAcctDtls(InvestmentAccount60 value) {
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
