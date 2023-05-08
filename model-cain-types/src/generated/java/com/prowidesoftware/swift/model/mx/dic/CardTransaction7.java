
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reversal card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction7", propOrder = {
    "txTp",
    "rcncltn",
    "accptrTxDtTm",
    "accptrTxId",
    "initrTxId",
    "txLifeCyclId",
    "txLifeCyclSeqNb",
    "txLifeCyclSeqCntr",
    "acqrrTxRef",
    "cardIssrRefData",
    "orgnlTx",
    "txDtls",
    "txRspn"
})
public class CardTransaction7 {

    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType7Code txTp;
    @XmlElement(name = "Rcncltn")
    protected TransactionIdentifier2 rcncltn;
    @XmlElement(name = "AccptrTxDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar accptrTxDtTm;
    @XmlElement(name = "AccptrTxId", required = true)
    protected String accptrTxId;
    @XmlElement(name = "InitrTxId", required = true)
    protected String initrTxId;
    @XmlElement(name = "TxLifeCyclId")
    protected String txLifeCyclId;
    @XmlElement(name = "TxLifeCyclSeqNb")
    protected BigDecimal txLifeCyclSeqNb;
    @XmlElement(name = "TxLifeCyclSeqCntr")
    protected BigDecimal txLifeCyclSeqCntr;
    @XmlElement(name = "AcqrrTxRef")
    protected String acqrrTxRef;
    @XmlElement(name = "CardIssrRefData")
    protected String cardIssrRefData;
    @XmlElement(name = "OrgnlTx")
    protected CardTransaction3 orgnlTx;
    @XmlElement(name = "TxDtls", required = true)
    protected CardTransactionDetail5 txDtls;
    @XmlElement(name = "TxRspn")
    protected ResponseType2 txRspn;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType7Code }
     *     
     */
    public CardPaymentServiceType7Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType7Code }
     *     
     */
    public CardTransaction7 setTxTp(CardPaymentServiceType7Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the rcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier2 }
     *     
     */
    public TransactionIdentifier2 getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier2 }
     *     
     */
    public CardTransaction7 setRcncltn(TransactionIdentifier2 value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the accptrTxDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getAccptrTxDtTm() {
        return accptrTxDtTm;
    }

    /**
     * Sets the value of the accptrTxDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction7 setAccptrTxDtTm(Calendar value) {
        this.accptrTxDtTm = value;
        return this;
    }

    /**
     * Gets the value of the accptrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccptrTxId() {
        return accptrTxId;
    }

    /**
     * Sets the value of the accptrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction7 setAccptrTxId(String value) {
        this.accptrTxId = value;
        return this;
    }

    /**
     * Gets the value of the initrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitrTxId() {
        return initrTxId;
    }

    /**
     * Sets the value of the initrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction7 setInitrTxId(String value) {
        this.initrTxId = value;
        return this;
    }

    /**
     * Gets the value of the txLifeCyclId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxLifeCyclId() {
        return txLifeCyclId;
    }

    /**
     * Sets the value of the txLifeCyclId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction7 setTxLifeCyclId(String value) {
        this.txLifeCyclId = value;
        return this;
    }

    /**
     * Gets the value of the txLifeCyclSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTxLifeCyclSeqNb() {
        return txLifeCyclSeqNb;
    }

    /**
     * Sets the value of the txLifeCyclSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardTransaction7 setTxLifeCyclSeqNb(BigDecimal value) {
        this.txLifeCyclSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the txLifeCyclSeqCntr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTxLifeCyclSeqCntr() {
        return txLifeCyclSeqCntr;
    }

    /**
     * Sets the value of the txLifeCyclSeqCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardTransaction7 setTxLifeCyclSeqCntr(BigDecimal value) {
        this.txLifeCyclSeqCntr = value;
        return this;
    }

    /**
     * Gets the value of the acqrrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrTxRef() {
        return acqrrTxRef;
    }

    /**
     * Sets the value of the acqrrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction7 setAcqrrTxRef(String value) {
        this.acqrrTxRef = value;
        return this;
    }

    /**
     * Gets the value of the cardIssrRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssrRefData() {
        return cardIssrRefData;
    }

    /**
     * Sets the value of the cardIssrRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction7 setCardIssrRefData(String value) {
        this.cardIssrRefData = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransaction3 }
     *     
     */
    public CardTransaction3 getOrgnlTx() {
        return orgnlTx;
    }

    /**
     * Sets the value of the orgnlTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransaction3 }
     *     
     */
    public CardTransaction7 setOrgnlTx(CardTransaction3 value) {
        this.orgnlTx = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransactionDetail5 }
     *     
     */
    public CardTransactionDetail5 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransactionDetail5 }
     *     
     */
    public CardTransaction7 setTxDtls(CardTransactionDetail5 value) {
        this.txDtls = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType2 }
     *     
     */
    public ResponseType2 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType2 }
     *     
     */
    public CardTransaction7 setTxRspn(ResponseType2 value) {
        this.txRspn = value;
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
