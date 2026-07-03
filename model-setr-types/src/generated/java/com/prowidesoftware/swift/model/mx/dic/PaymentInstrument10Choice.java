
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
 * Choice between types of payment instrument, ie, credit transfer, cheque, payment card, investment cash account or direct debit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument10Choice", propOrder = {
    "pmtCardDtls",
    "cdtTrfDtls",
    "drctDbtDtls",
    "chqDtls",
    "acctDtls"
})
public class PaymentInstrument10Choice {

    @XmlElement(name = "PmtCardDtls")
    protected PaymentCard2 pmtCardDtls;
    @XmlElement(name = "CdtTrfDtls")
    protected CreditTransfer4 cdtTrfDtls;
    @XmlElement(name = "DrctDbtDtls")
    protected DirectDebitMandate2 drctDbtDtls;
    @XmlElement(name = "ChqDtls")
    protected Cheque3 chqDtls;
    @XmlElement(name = "AcctDtls")
    protected InvestmentAccount15 acctDtls;

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
    public PaymentInstrument10Choice setPmtCardDtls(PaymentCard2 value) {
        this.pmtCardDtls = value;
        return this;
    }

    /**
     * Gets the value of the cdtTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransfer4 }
     *     
     */
    public CreditTransfer4 getCdtTrfDtls() {
        return cdtTrfDtls;
    }

    /**
     * Sets the value of the cdtTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransfer4 }
     *     
     */
    public PaymentInstrument10Choice setCdtTrfDtls(CreditTransfer4 value) {
        this.cdtTrfDtls = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandate2 }
     *     
     */
    public DirectDebitMandate2 getDrctDbtDtls() {
        return drctDbtDtls;
    }

    /**
     * Sets the value of the drctDbtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandate2 }
     *     
     */
    public PaymentInstrument10Choice setDrctDbtDtls(DirectDebitMandate2 value) {
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
    public PaymentInstrument10Choice setChqDtls(Cheque3 value) {
        this.chqDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount15 }
     *     
     */
    public InvestmentAccount15 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount15 }
     *     
     */
    public PaymentInstrument10Choice setAcctDtls(InvestmentAccount15 value) {
        this.acctDtls = value;
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
