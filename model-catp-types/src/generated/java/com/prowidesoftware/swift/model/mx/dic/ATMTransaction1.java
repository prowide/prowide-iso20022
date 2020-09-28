
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Withdrawal transaction for which an authorisation is requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction1", propOrder = {
    "cshDspnsd",
    "txId",
    "rcncltnId",
    "acctData",
    "prtctdAcctData",
    "ttlReqdAmt",
    "dtldReqdAmt",
    "ccyConvs",
    "selctdMixTp",
    "selctdMix",
    "reqdRct",
    "iccRltdData"
})
public class ATMTransaction1 {

    @XmlElement(name = "CshDspnsd")
    protected Boolean cshDspnsd;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "AcctData")
    protected CardAccount3 acctData;
    @XmlElement(name = "PrtctdAcctData")
    protected ContentInformationType10 prtctdAcctData;
    @XmlElement(name = "TtlReqdAmt")
    protected AmountAndCurrency1 ttlReqdAmt;
    @XmlElement(name = "DtldReqdAmt")
    protected DetailedAmount12 dtldReqdAmt;
    @XmlElement(name = "CcyConvs")
    protected CurrencyConversion4 ccyConvs;
    @XmlElement(name = "SelctdMixTp")
    protected String selctdMixTp;
    @XmlElement(name = "SelctdMix")
    protected List<ATMMediaMix1> selctdMix;
    @XmlElement(name = "ReqdRct")
    protected Boolean reqdRct;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

    /**
     * Gets the value of the cshDspnsd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshDspnsd() {
        return cshDspnsd;
    }

    /**
     * Sets the value of the cshDspnsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction1 setCshDspnsd(Boolean value) {
        this.cshDspnsd = value;
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
    public ATMTransaction1 setTxId(TransactionIdentifier1 value) {
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
    public ATMTransaction1 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the acctData property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount3 }
     *     
     */
    public CardAccount3 getAcctData() {
        return acctData;
    }

    /**
     * Sets the value of the acctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount3 }
     *     
     */
    public ATMTransaction1 setAcctData(CardAccount3 value) {
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
    public ATMTransaction1 setPrtctdAcctData(ContentInformationType10 value) {
        this.prtctdAcctData = value;
        return this;
    }

    /**
     * Gets the value of the ttlReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public AmountAndCurrency1 getTtlReqdAmt() {
        return ttlReqdAmt;
    }

    /**
     * Sets the value of the ttlReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public ATMTransaction1 setTtlReqdAmt(AmountAndCurrency1 value) {
        this.ttlReqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the dtldReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount12 }
     *     
     */
    public DetailedAmount12 getDtldReqdAmt() {
        return dtldReqdAmt;
    }

    /**
     * Sets the value of the dtldReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount12 }
     *     
     */
    public ATMTransaction1 setDtldReqdAmt(DetailedAmount12 value) {
        this.dtldReqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion4 }
     *     
     */
    public CurrencyConversion4 getCcyConvs() {
        return ccyConvs;
    }

    /**
     * Sets the value of the ccyConvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion4 }
     *     
     */
    public ATMTransaction1 setCcyConvs(CurrencyConversion4 value) {
        this.ccyConvs = value;
        return this;
    }

    /**
     * Gets the value of the selctdMixTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelctdMixTp() {
        return selctdMixTp;
    }

    /**
     * Sets the value of the selctdMixTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction1 setSelctdMixTp(String value) {
        this.selctdMixTp = value;
        return this;
    }

    /**
     * Gets the value of the selctdMix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selctdMix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelctdMix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMMediaMix1 }
     * 
     * 
     */
    public List<ATMMediaMix1> getSelctdMix() {
        if (selctdMix == null) {
            selctdMix = new ArrayList<ATMMediaMix1>();
        }
        return this.selctdMix;
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
    public ATMTransaction1 setReqdRct(Boolean value) {
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
    public ATMTransaction1 setICCRltdData(byte[] value) {
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
     * Adds a new item to the selctdMix list.
     * @see #getSelctdMix()
     * 
     */
    public ATMTransaction1 addSelctdMix(ATMMediaMix1 selctdMix) {
        getSelctdMix().add(selctdMix);
        return this;
    }

}
