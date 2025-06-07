
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
@XmlType(name = "Transaction66", propOrder = {
    "pmtTo",
    "pmtFr",
    "cdtDbtInd",
    "pmt",
    "acctNtry",
    "sctiesTxRefs"
})
public class Transaction66 {

    @XmlElement(name = "PmtTo")
    protected System2 pmtTo;
    @XmlElement(name = "PmtFr")
    protected System2 pmtFr;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Pmt")
    protected PaymentInstruction32 pmt;
    @XmlElement(name = "AcctNtry")
    protected CashAccountAndEntry3 acctNtry;
    @XmlElement(name = "SctiesTxRefs")
    protected SecuritiesTransactionReferences1 sctiesTxRefs;

    /**
     * Gets the value of the pmtTo property.
     * 
     * @return
     *     possible object is
     *     {@link System2 }
     *     
     */
    public System2 getPmtTo() {
        return pmtTo;
    }

    /**
     * Sets the value of the pmtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link System2 }
     *     
     */
    public Transaction66 setPmtTo(System2 value) {
        this.pmtTo = value;
        return this;
    }

    /**
     * Gets the value of the pmtFr property.
     * 
     * @return
     *     possible object is
     *     {@link System2 }
     *     
     */
    public System2 getPmtFr() {
        return pmtFr;
    }

    /**
     * Sets the value of the pmtFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link System2 }
     *     
     */
    public Transaction66 setPmtFr(System2 value) {
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
    public Transaction66 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the pmt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstruction32 }
     *     
     */
    public PaymentInstruction32 getPmt() {
        return pmt;
    }

    /**
     * Sets the value of the pmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstruction32 }
     *     
     */
    public Transaction66 setPmt(PaymentInstruction32 value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the acctNtry property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountAndEntry3 }
     *     
     */
    public CashAccountAndEntry3 getAcctNtry() {
        return acctNtry;
    }

    /**
     * Sets the value of the acctNtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountAndEntry3 }
     *     
     */
    public Transaction66 setAcctNtry(CashAccountAndEntry3 value) {
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
    public Transaction66 setSctiesTxRefs(SecuritiesTransactionReferences1 value) {
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
