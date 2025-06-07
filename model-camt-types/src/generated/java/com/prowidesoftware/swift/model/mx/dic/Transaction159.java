
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction159", propOrder = {
    "pmtTo",
    "pmtFr",
    "cdtDbtInd",
    "pmt",
    "acctNtry",
    "sctiesTxRefs"
})
public class Transaction159 {

    @XmlElement(name = "PmtTo")
    protected System3 pmtTo;
    @XmlElement(name = "PmtFr")
    protected System3 pmtFr;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Pmt")
    protected PaymentInstruction47 pmt;
    @XmlElement(name = "AcctNtry")
    protected CashAccountAndEntry5 acctNtry;
    @XmlElement(name = "SctiesTxRefs")
    protected SecuritiesTransactionReferences1 sctiesTxRefs;

    /**
     * Gets the value of the pmtTo property.
     * 
     * @return
     *     possible object is
     *     {@link System3 }
     *     
     */
    public System3 getPmtTo() {
        return pmtTo;
    }

    /**
     * Sets the value of the pmtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link System3 }
     *     
     */
    public Transaction159 setPmtTo(System3 value) {
        this.pmtTo = value;
        return this;
    }

    /**
     * Gets the value of the pmtFr property.
     * 
     * @return
     *     possible object is
     *     {@link System3 }
     *     
     */
    public System3 getPmtFr() {
        return pmtFr;
    }

    /**
     * Sets the value of the pmtFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link System3 }
     *     
     */
    public Transaction159 setPmtFr(System3 value) {
        this.pmtFr = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public Transaction159 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the pmt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstruction47 }
     *     
     */
    public PaymentInstruction47 getPmt() {
        return pmt;
    }

    /**
     * Sets the value of the pmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstruction47 }
     *     
     */
    public Transaction159 setPmt(PaymentInstruction47 value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the acctNtry property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountAndEntry5 }
     *     
     */
    public CashAccountAndEntry5 getAcctNtry() {
        return acctNtry;
    }

    /**
     * Sets the value of the acctNtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountAndEntry5 }
     *     
     */
    public Transaction159 setAcctNtry(CashAccountAndEntry5 value) {
        this.acctNtry = value;
        return this;
    }

    /**
     * Gets the value of the sctiesTxRefs property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionReferences1 }
     *     
     */
    public SecuritiesTransactionReferences1 getSctiesTxRefs() {
        return sctiesTxRefs;
    }

    /**
     * Sets the value of the sctiesTxRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionReferences1 }
     *     
     */
    public Transaction159 setSctiesTxRefs(SecuritiesTransactionReferences1 value) {
        this.sctiesTxRefs = value;
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
