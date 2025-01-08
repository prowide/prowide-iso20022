
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * Card transaction for which the authorisation is requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction15", propOrder = {
    "txTp",
    "addtlSvc",
    "svcAttr",
    "mrchntCtgyCd",
    "rcncltn",
    "accptrTxDtTm",
    "accptrTxId",
    "initrTxId",
    "txLifeCyclId",
    "txLifeCyclSeqNb",
    "txLifeCyclSeqCntr",
    "orgnlTx",
    "txDtls",
    "authstnRslt"
})
public class CardTransaction15 {

    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType7Code txTp;
    @XmlElement(name = "AddtlSvc")
    @XmlSchemaType(name = "string")
    protected List<CardPaymentServiceType8Code> addtlSvc;
    @XmlElement(name = "SvcAttr")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType3Code svcAttr;
    @XmlElement(name = "MrchntCtgyCd")
    protected String mrchntCtgyCd;
    @XmlElement(name = "Rcncltn")
    protected TransactionIdentifier2 rcncltn;
    @XmlElement(name = "AccptrTxDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime accptrTxDtTm;
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
    @XmlElement(name = "OrgnlTx")
    protected CardTransaction3 orgnlTx;
    @XmlElement(name = "TxDtls", required = true)
    protected CardTransactionDetail1 txDtls;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult7 authstnRslt;

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
    public CardTransaction15 setTxTp(CardPaymentServiceType7Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentServiceType8Code }
     * 
     * 
     * @return
     *     The value of the addtlSvc property.
     */
    public List<CardPaymentServiceType8Code> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<>();
        }
        return this.addtlSvc;
    }

    /**
     * Gets the value of the svcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType3Code }
     *     
     */
    public CardPaymentServiceType3Code getSvcAttr() {
        return svcAttr;
    }

    /**
     * Sets the value of the svcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType3Code }
     *     
     */
    public CardTransaction15 setSvcAttr(CardPaymentServiceType3Code value) {
        this.svcAttr = value;
        return this;
    }

    /**
     * Gets the value of the mrchntCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgyCd() {
        return mrchntCtgyCd;
    }

    /**
     * Sets the value of the mrchntCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction15 setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
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
    public CardTransaction15 setRcncltn(TransactionIdentifier2 value) {
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
    public OffsetDateTime getAccptrTxDtTm() {
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
    public CardTransaction15 setAccptrTxDtTm(OffsetDateTime value) {
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
    public CardTransaction15 setAccptrTxId(String value) {
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
    public CardTransaction15 setInitrTxId(String value) {
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
    public CardTransaction15 setTxLifeCyclId(String value) {
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
    public CardTransaction15 setTxLifeCyclSeqNb(BigDecimal value) {
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
    public CardTransaction15 setTxLifeCyclSeqCntr(BigDecimal value) {
        this.txLifeCyclSeqCntr = value;
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
    public CardTransaction15 setOrgnlTx(CardTransaction3 value) {
        this.orgnlTx = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransactionDetail1 }
     *     
     */
    public CardTransactionDetail1 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransactionDetail1 }
     *     
     */
    public CardTransaction15 setTxDtls(CardTransactionDetail1 value) {
        this.txDtls = value;
        return this;
    }

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult7 }
     *     
     */
    public AuthorisationResult7 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult7 }
     *     
     */
    public CardTransaction15 setAuthstnRslt(AuthorisationResult7 value) {
        this.authstnRslt = value;
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

    /**
     * Adds a new item to the addtlSvc list.
     * @see #getAddtlSvc()
     * 
     */
    public CardTransaction15 addAddtlSvc(CardPaymentServiceType8Code addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

}
