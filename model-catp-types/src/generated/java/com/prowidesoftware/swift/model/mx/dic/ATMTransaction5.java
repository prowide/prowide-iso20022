
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
 * Withdrawal transaction for which the completion is sent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction5", propOrder = {
    "txId",
    "txSts",
    "incdnt",
    "incdntDtl",
    "rcncltnId",
    "reqdRct",
    "rctPrtd",
    "captrdCard",
    "authstnRslt",
    "iccRltdData"
})
public class ATMTransaction5 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "TxSts", required = true)
    @XmlSchemaType(name = "string")
    protected ATMTransactionStatus1Code txSts;
    @XmlElement(name = "Incdnt")
    @XmlSchemaType(name = "string")
    protected List<FailureReason4Code> incdnt;
    @XmlElement(name = "IncdntDtl")
    protected List<String> incdntDtl;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "ReqdRct")
    protected Boolean reqdRct;
    @XmlElement(name = "RctPrtd")
    protected Boolean rctPrtd;
    @XmlElement(name = "CaptrdCard")
    protected Boolean captrdCard;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult9 authstnRslt;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

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
    public ATMTransaction5 setTxId(TransactionIdentifier1 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransactionStatus1Code }
     *     
     */
    public ATMTransactionStatus1Code getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransactionStatus1Code }
     *     
     */
    public ATMTransaction5 setTxSts(ATMTransactionStatus1Code value) {
        this.txSts = value;
        return this;
    }

    /**
     * Gets the value of the incdnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the incdnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncdnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailureReason4Code }
     * 
     * 
     * @return
     *     The value of the incdnt property.
     */
    public List<FailureReason4Code> getIncdnt() {
        if (incdnt == null) {
            incdnt = new ArrayList<>();
        }
        return this.incdnt;
    }

    /**
     * Gets the value of the incdntDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the incdntDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncdntDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the incdntDtl property.
     */
    public List<String> getIncdntDtl() {
        if (incdntDtl == null) {
            incdntDtl = new ArrayList<>();
        }
        return this.incdntDtl;
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
    public ATMTransaction5 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the reqdRct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqdRct() {
        return reqdRct;
    }

    /**
     * Sets the value of the reqdRct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction5 setReqdRct(Boolean value) {
        this.reqdRct = value;
        return this;
    }

    /**
     * Gets the value of the rctPrtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRctPrtd() {
        return rctPrtd;
    }

    /**
     * Sets the value of the rctPrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction5 setRctPrtd(Boolean value) {
        this.rctPrtd = value;
        return this;
    }

    /**
     * Gets the value of the captrdCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaptrdCard() {
        return captrdCard;
    }

    /**
     * Sets the value of the captrdCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction5 setCaptrdCard(Boolean value) {
        this.captrdCard = value;
        return this;
    }

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult9 }
     *     
     */
    public AuthorisationResult9 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult9 }
     *     
     */
    public ATMTransaction5 setAuthstnRslt(AuthorisationResult9 value) {
        this.authstnRslt = value;
        return this;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public ATMTransaction5 setICCRltdData(byte[] value) {
        this.iccRltdData = value;
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
     * Adds a new item to the incdnt list.
     * @see #getIncdnt()
     * 
     */
    public ATMTransaction5 addIncdnt(FailureReason4Code incdnt) {
        getIncdnt().add(incdnt);
        return this;
    }

    /**
     * Adds a new item to the incdntDtl list.
     * @see #getIncdntDtl()
     * 
     */
    public ATMTransaction5 addIncdntDtl(String incdntDtl) {
        getIncdntDtl().add(incdntDtl);
        return this;
    }

}
