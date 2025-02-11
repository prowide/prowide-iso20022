
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Transaction information in the completion advice message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction13", propOrder = {
    "txCaptr",
    "txTp",
    "addtlSvc",
    "svcAttr",
    "mrchntCtgyCd",
    "txId",
    "orgnlTx",
    "txSucss",
    "rvsl",
    "mrchntOvrrd",
    "failrRsn",
    "initrTxId",
    "rcptTxId",
    "rcncltnId",
    "intrchngData",
    "txDtls",
    "authstnRslt",
    "txVrfctnRslt",
    "addtlTxData"
})
public class CardPaymentTransaction13 {

    @XmlElement(name = "TxCaptr")
    protected Boolean txCaptr;
    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType4Code txTp;
    @XmlElement(name = "AddtlSvc")
    @XmlSchemaType(name = "string")
    protected List<CardPaymentServiceType2Code> addtlSvc;
    @XmlElement(name = "SvcAttr")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType3Code svcAttr;
    @XmlElement(name = "MrchntCtgyCd", required = true)
    protected String mrchntCtgyCd;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "OrgnlTx")
    protected CardPaymentTransaction17 orgnlTx;
    @XmlElement(name = "TxSucss")
    protected boolean txSucss;
    @XmlElement(name = "Rvsl")
    protected Boolean rvsl;
    @XmlElement(name = "MrchntOvrrd")
    protected Boolean mrchntOvrrd;
    @XmlElement(name = "FailrRsn")
    @XmlSchemaType(name = "string")
    protected List<FailureReason2Code> failrRsn;
    @XmlElement(name = "InitrTxId")
    protected String initrTxId;
    @XmlElement(name = "RcptTxId")
    protected String rcptTxId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "IntrchngData")
    protected String intrchngData;
    @XmlElement(name = "TxDtls", required = true)
    protected CardPaymentTransactionDetails3 txDtls;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult2 authstnRslt;
    @XmlElement(name = "TxVrfctnRslt")
    protected TransactionVerificationResult2 txVrfctnRslt;
    @XmlElement(name = "AddtlTxData")
    protected List<String> addtlTxData;

    /**
     * Gets the value of the txCaptr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxCaptr() {
        return txCaptr;
    }

    /**
     * Sets the value of the txCaptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardPaymentTransaction13 setTxCaptr(Boolean value) {
        this.txCaptr = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType4Code }
     *     
     */
    public CardPaymentServiceType4Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType4Code }
     *     
     */
    public CardPaymentTransaction13 setTxTp(CardPaymentServiceType4Code value) {
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
     * {@link CardPaymentServiceType2Code }
     * 
     * 
     * @return
     *     The value of the addtlSvc property.
     */
    public List<CardPaymentServiceType2Code> getAddtlSvc() {
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
    public CardPaymentTransaction13 setSvcAttr(CardPaymentServiceType3Code value) {
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
    public CardPaymentTransaction13 setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public CardPaymentTransaction13 setTxId(TransactionIdentifier1 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction17 }
     *     
     */
    public CardPaymentTransaction17 getOrgnlTx() {
        return orgnlTx;
    }

    /**
     * Sets the value of the orgnlTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction17 }
     *     
     */
    public CardPaymentTransaction13 setOrgnlTx(CardPaymentTransaction17 value) {
        this.orgnlTx = value;
        return this;
    }

    /**
     * Gets the value of the txSucss property.
     * 
     */
    public boolean isTxSucss() {
        return txSucss;
    }

    /**
     * Sets the value of the txSucss property.
     * 
     */
    public CardPaymentTransaction13 setTxSucss(boolean value) {
        this.txSucss = value;
        return this;
    }

    /**
     * Gets the value of the rvsl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRvsl() {
        return rvsl;
    }

    /**
     * Sets the value of the rvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardPaymentTransaction13 setRvsl(Boolean value) {
        this.rvsl = value;
        return this;
    }

    /**
     * Gets the value of the mrchntOvrrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMrchntOvrrd() {
        return mrchntOvrrd;
    }

    /**
     * Sets the value of the mrchntOvrrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardPaymentTransaction13 setMrchntOvrrd(Boolean value) {
        this.mrchntOvrrd = value;
        return this;
    }

    /**
     * Gets the value of the failrRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the failrRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailrRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailureReason2Code }
     * 
     * 
     * @return
     *     The value of the failrRsn property.
     */
    public List<FailureReason2Code> getFailrRsn() {
        if (failrRsn == null) {
            failrRsn = new ArrayList<>();
        }
        return this.failrRsn;
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
    public CardPaymentTransaction13 setInitrTxId(String value) {
        this.initrTxId = value;
        return this;
    }

    /**
     * Gets the value of the rcptTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptTxId() {
        return rcptTxId;
    }

    /**
     * Sets the value of the rcptTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction13 setRcptTxId(String value) {
        this.rcptTxId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction13 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the intrchngData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrchngData() {
        return intrchngData;
    }

    /**
     * Sets the value of the intrchngData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction13 setIntrchngData(String value) {
        this.intrchngData = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransactionDetails3 }
     *     
     */
    public CardPaymentTransactionDetails3 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransactionDetails3 }
     *     
     */
    public CardPaymentTransaction13 setTxDtls(CardPaymentTransactionDetails3 value) {
        this.txDtls = value;
        return this;
    }

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult2 }
     *     
     */
    public AuthorisationResult2 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult2 }
     *     
     */
    public CardPaymentTransaction13 setAuthstnRslt(AuthorisationResult2 value) {
        this.authstnRslt = value;
        return this;
    }

    /**
     * Gets the value of the txVrfctnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionVerificationResult2 }
     *     
     */
    public TransactionVerificationResult2 getTxVrfctnRslt() {
        return txVrfctnRslt;
    }

    /**
     * Sets the value of the txVrfctnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionVerificationResult2 }
     *     
     */
    public CardPaymentTransaction13 setTxVrfctnRslt(TransactionVerificationResult2 value) {
        this.txVrfctnRslt = value;
        return this;
    }

    /**
     * Gets the value of the addtlTxData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlTxData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlTxData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlTxData property.
     */
    public List<String> getAddtlTxData() {
        if (addtlTxData == null) {
            addtlTxData = new ArrayList<>();
        }
        return this.addtlTxData;
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
    public CardPaymentTransaction13 addAddtlSvc(CardPaymentServiceType2Code addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the failrRsn list.
     * @see #getFailrRsn()
     * 
     */
    public CardPaymentTransaction13 addFailrRsn(FailureReason2Code failrRsn) {
        getFailrRsn().add(failrRsn);
        return this;
    }

    /**
     * Adds a new item to the addtlTxData list.
     * @see #getAddtlTxData()
     * 
     */
    public CardPaymentTransaction13 addAddtlTxData(String addtlTxData) {
        getAddtlTxData().add(addtlTxData);
        return this;
    }

}
