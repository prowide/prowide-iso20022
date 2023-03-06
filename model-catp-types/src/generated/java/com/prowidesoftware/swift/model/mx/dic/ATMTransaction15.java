
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Deposit transaction for which the service is requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction15", propOrder = {
    "txId",
    "rcncltnId",
    "acctData",
    "prtctdAcctData",
    "ttlAmt",
    "dtldReqdAmt",
    "dpstdMdia",
    "reqdRct",
    "iccRltdData"
})
public class ATMTransaction15 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "AcctData")
    protected CardAccount9 acctData;
    @XmlElement(name = "PrtctdAcctData")
    protected ContentInformationType10 prtctdAcctData;
    @XmlElement(name = "TtlAmt")
    protected AmountAndCurrency1 ttlAmt;
    @XmlElement(name = "DtldReqdAmt")
    protected List<DetailedAmount16> dtldReqdAmt;
    @XmlElement(name = "DpstdMdia")
    protected List<ATMDepositedMedia1> dpstdMdia;
    @XmlElement(name = "ReqdRct")
    protected Boolean reqdRct;
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
    public ATMTransaction15 setTxId(TransactionIdentifier1 value) {
        this.txId = value;
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
    public ATMTransaction15 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the acctData property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount9 }
     *     
     */
    public CardAccount9 getAcctData() {
        return acctData;
    }

    /**
     * Sets the value of the acctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount9 }
     *     
     */
    public ATMTransaction15 setAcctData(CardAccount9 value) {
        this.acctData = value;
        return this;
    }

    /**
     * Gets the value of the prtctdAcctData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdAcctData() {
        return prtctdAcctData;
    }

    /**
     * Sets the value of the prtctdAcctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMTransaction15 setPrtctdAcctData(ContentInformationType10 value) {
        this.prtctdAcctData = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public AmountAndCurrency1 getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public ATMTransaction15 setTtlAmt(AmountAndCurrency1 value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the dtldReqdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtldReqdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldReqdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount16 }
     * 
     * 
     */
    public List<DetailedAmount16> getDtldReqdAmt() {
        if (dtldReqdAmt == null) {
            dtldReqdAmt = new ArrayList<DetailedAmount16>();
        }
        return this.dtldReqdAmt;
    }

    /**
     * Gets the value of the dpstdMdia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dpstdMdia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpstdMdia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMDepositedMedia1 }
     * 
     * 
     */
    public List<ATMDepositedMedia1> getDpstdMdia() {
        if (dpstdMdia == null) {
            dpstdMdia = new ArrayList<ATMDepositedMedia1>();
        }
        return this.dpstdMdia;
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
    public ATMTransaction15 setReqdRct(Boolean value) {
        this.reqdRct = value;
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
    public ATMTransaction15 setICCRltdData(byte[] value) {
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
     * Adds a new item to the dtldReqdAmt list.
     * @see #getDtldReqdAmt()
     * 
     */
    public ATMTransaction15 addDtldReqdAmt(DetailedAmount16 dtldReqdAmt) {
        getDtldReqdAmt().add(dtldReqdAmt);
        return this;
    }

    /**
     * Adds a new item to the dpstdMdia list.
     * @see #getDpstdMdia()
     * 
     */
    public ATMTransaction15 addDpstdMdia(ATMDepositedMedia1 dpstdMdia) {
        getDpstdMdia().add(dpstdMdia);
        return this;
    }

}
