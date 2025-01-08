
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
 * Choice between types of payment instrument, ie, cheque, credit transfer, direct debit, investment account or payment card.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument12Choice", propOrder = {
    "pmtCardDtls",
    "cdtTrfDtls",
    "drctDbtDtls",
    "chqDtls",
    "bkrsDrftDtls",
    "cshAcctDtls"
})
public class PaymentInstrument12Choice {

    @XmlElement(name = "PmtCardDtls")
    protected PaymentCard2 pmtCardDtls;
    @XmlElement(name = "CdtTrfDtls")
    protected CreditTransfer6 cdtTrfDtls;
    @XmlElement(name = "DrctDbtDtls")
    protected DirectDebitMandate4 drctDbtDtls;
    @XmlElement(name = "ChqDtls")
    protected Cheque3 chqDtls;
    @XmlElement(name = "BkrsDrftDtls")
    protected Cheque3 bkrsDrftDtls;
    @XmlElement(name = "CshAcctDtls")
    protected InvestmentAccount20 cshAcctDtls;

    /**
     * Gets the value of the pmtCardDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard2 }
     *     
     */
    public PaymentCard2 getPmtCardDtls() {
        return pmtCardDtls;
    }

    /**
     * Sets the value of the pmtCardDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard2 }
     *     
     */
    public PaymentInstrument12Choice setPmtCardDtls(PaymentCard2 value) {
        this.pmtCardDtls = value;
        return this;
    }

    /**
     * Gets the value of the cdtTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransfer6 }
     *     
     */
    public CreditTransfer6 getCdtTrfDtls() {
        return cdtTrfDtls;
    }

    /**
     * Sets the value of the cdtTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransfer6 }
     *     
     */
    public PaymentInstrument12Choice setCdtTrfDtls(CreditTransfer6 value) {
        this.cdtTrfDtls = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandate4 }
     *     
     */
    public DirectDebitMandate4 getDrctDbtDtls() {
        return drctDbtDtls;
    }

    /**
     * Sets the value of the drctDbtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandate4 }
     *     
     */
    public PaymentInstrument12Choice setDrctDbtDtls(DirectDebitMandate4 value) {
        this.drctDbtDtls = value;
        return this;
    }

    /**
     * Gets the value of the chqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque3 }
     *     
     */
    public Cheque3 getChqDtls() {
        return chqDtls;
    }

    /**
     * Sets the value of the chqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque3 }
     *     
     */
    public PaymentInstrument12Choice setChqDtls(Cheque3 value) {
        this.chqDtls = value;
        return this;
    }

    /**
     * Gets the value of the bkrsDrftDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque3 }
     *     
     */
    public Cheque3 getBkrsDrftDtls() {
        return bkrsDrftDtls;
    }

    /**
     * Sets the value of the bkrsDrftDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque3 }
     *     
     */
    public PaymentInstrument12Choice setBkrsDrftDtls(Cheque3 value) {
        this.bkrsDrftDtls = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount20 }
     *     
     */
    public InvestmentAccount20 getCshAcctDtls() {
        return cshAcctDtls;
    }

    /**
     * Sets the value of the cshAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount20 }
     *     
     */
    public PaymentInstrument12Choice setCshAcctDtls(InvestmentAccount20 value) {
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
