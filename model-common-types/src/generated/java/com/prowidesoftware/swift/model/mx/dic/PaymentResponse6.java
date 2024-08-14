
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
 * Data to respond to a payment request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentResponse6", propOrder = {
    "saleTxId",
    "saleRefId",
    "poiTxId",
    "poiRcncltnId",
    "issrRefData",
    "rtlrPmtRslt",
    "pmtRct",
    "lltyRslt",
    "cstmrOrdr"
})
public class PaymentResponse6 {

    @XmlElement(name = "SaleTxId", required = true)
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "SaleRefId")
    protected String saleRefId;
    @XmlElement(name = "POITxId", required = true)
    protected TransactionIdentifier1 poiTxId;
    @XmlElement(name = "POIRcncltnId")
    protected String poiRcncltnId;
    @XmlElement(name = "IssrRefData")
    protected String issrRefData;
    @XmlElement(name = "RtlrPmtRslt", required = true)
    protected RetailerPaymentResult6 rtlrPmtRslt;
    @XmlElement(name = "PmtRct")
    protected List<PaymentReceipt6> pmtRct;
    @XmlElement(name = "LltyRslt")
    protected List<LoyaltyResult3> lltyRslt;
    @XmlElement(name = "CstmrOrdr")
    protected List<CustomerOrder1> cstmrOrdr;

    /**
     * Gets the value of the saleTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getSaleTxId() {
        return saleTxId;
    }

    /**
     * Sets the value of the saleTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public PaymentResponse6 setSaleTxId(TransactionIdentifier1 value) {
        this.saleTxId = value;
        return this;
    }

    /**
     * Gets the value of the saleRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefId() {
        return saleRefId;
    }

    /**
     * Sets the value of the saleRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentResponse6 setSaleRefId(String value) {
        this.saleRefId = value;
        return this;
    }

    /**
     * Gets the value of the poiTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getPOITxId() {
        return poiTxId;
    }

    /**
     * Sets the value of the poiTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public PaymentResponse6 setPOITxId(TransactionIdentifier1 value) {
        this.poiTxId = value;
        return this;
    }

    /**
     * Gets the value of the poiRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIRcncltnId() {
        return poiRcncltnId;
    }

    /**
     * Sets the value of the poiRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentResponse6 setPOIRcncltnId(String value) {
        this.poiRcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the issrRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrRefData() {
        return issrRefData;
    }

    /**
     * Sets the value of the issrRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentResponse6 setIssrRefData(String value) {
        this.issrRefData = value;
        return this;
    }

    /**
     * Gets the value of the rtlrPmtRslt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerPaymentResult6 }
     *     
     */
    public RetailerPaymentResult6 getRtlrPmtRslt() {
        return rtlrPmtRslt;
    }

    /**
     * Sets the value of the rtlrPmtRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerPaymentResult6 }
     *     
     */
    public PaymentResponse6 setRtlrPmtRslt(RetailerPaymentResult6 value) {
        this.rtlrPmtRslt = value;
        return this;
    }

    /**
     * Gets the value of the pmtRct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtRct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtRct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceipt6 }
     * 
     * 
     */
    public List<PaymentReceipt6> getPmtRct() {
        if (pmtRct == null) {
            pmtRct = new ArrayList<PaymentReceipt6>();
        }
        return this.pmtRct;
    }

    /**
     * Gets the value of the lltyRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lltyRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyResult3 }
     * 
     * 
     */
    public List<LoyaltyResult3> getLltyRslt() {
        if (lltyRslt == null) {
            lltyRslt = new ArrayList<LoyaltyResult3>();
        }
        return this.lltyRslt;
    }

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstmrOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrder1 }
     * 
     * 
     */
    public List<CustomerOrder1> getCstmrOrdr() {
        if (cstmrOrdr == null) {
            cstmrOrdr = new ArrayList<CustomerOrder1>();
        }
        return this.cstmrOrdr;
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
     * Adds a new item to the pmtRct list.
     * @see #getPmtRct()
     * 
     */
    public PaymentResponse6 addPmtRct(PaymentReceipt6 pmtRct) {
        getPmtRct().add(pmtRct);
        return this;
    }

    /**
     * Adds a new item to the lltyRslt list.
     * @see #getLltyRslt()
     * 
     */
    public PaymentResponse6 addLltyRslt(LoyaltyResult3 lltyRslt) {
        getLltyRslt().add(lltyRslt);
        return this;
    }

    /**
     * Adds a new item to the cstmrOrdr list.
     * @see #getCstmrOrdr()
     * 
     */
    public PaymentResponse6 addCstmrOrdr(CustomerOrder1 cstmrOrdr) {
        getCstmrOrdr().add(cstmrOrdr);
        return this;
    }

}
