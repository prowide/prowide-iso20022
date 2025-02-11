
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
@XmlType(name = "PaymentInstrument6Choice", propOrder = {
    "pmtCardDtls",
    "cdtTrfDtls",
    "drctDbtDtls",
    "chqDtls",
    "acctDtls"
})
public class PaymentInstrument6Choice {

    @XmlElement(name = "PmtCardDtls")
    protected PaymentCard2 pmtCardDtls;
    @XmlElement(name = "CdtTrfDtls")
    protected CreditTransfer3 cdtTrfDtls;
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
    public PaymentInstrument6Choice setPmtCardDtls(PaymentCard2 value) {
        this.pmtCardDtls = value;
        return this;
    }

    /**
     * Gets the value of the cdtTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransfer3 }
     *     
     */
    public CreditTransfer3 getCdtTrfDtls() {
        return cdtTrfDtls;
    }

    /**
     * Sets the value of the cdtTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransfer3 }
     *     
     */
    public PaymentInstrument6Choice setCdtTrfDtls(CreditTransfer3 value) {
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
    public PaymentInstrument6Choice setDrctDbtDtls(DirectDebitMandate2 value) {
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
    public PaymentInstrument6Choice setChqDtls(Cheque3 value) {
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
    public PaymentInstrument6Choice setAcctDtls(InvestmentAccount15 value) {
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
