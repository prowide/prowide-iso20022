
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
 * Content of the balance inquiry response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceInquiryResponse6", propOrder = {
    "saleTxId",
    "poiTxId",
    "pmtAcct",
    "lltyAcct",
    "stordValAcct",
    "rct"
})
public class BalanceInquiryResponse6 {

    @XmlElement(name = "SaleTxId")
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "POITxId")
    protected TransactionIdentifier1 poiTxId;
    @XmlElement(name = "PmtAcct")
    protected PaymentAccount3 pmtAcct;
    @XmlElement(name = "LltyAcct")
    protected LoyaltyAccount3 lltyAcct;
    @XmlElement(name = "StordValAcct")
    protected List<StoredValueAccount2> stordValAcct;
    @XmlElement(name = "Rct")
    protected List<PaymentReceipt6> rct;

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
    public BalanceInquiryResponse6 setSaleTxId(TransactionIdentifier1 value) {
        this.saleTxId = value;
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
    public BalanceInquiryResponse6 setPOITxId(TransactionIdentifier1 value) {
        this.poiTxId = value;
        return this;
    }

    /**
     * Gets the value of the pmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAccount3 }
     *     
     */
    public PaymentAccount3 getPmtAcct() {
        return pmtAcct;
    }

    /**
     * Sets the value of the pmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAccount3 }
     *     
     */
    public BalanceInquiryResponse6 setPmtAcct(PaymentAccount3 value) {
        this.pmtAcct = value;
        return this;
    }

    /**
     * Gets the value of the lltyAcct property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccount3 }
     *     
     */
    public LoyaltyAccount3 getLltyAcct() {
        return lltyAcct;
    }

    /**
     * Sets the value of the lltyAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccount3 }
     *     
     */
    public BalanceInquiryResponse6 setLltyAcct(LoyaltyAccount3 value) {
        this.lltyAcct = value;
        return this;
    }

    /**
     * Gets the value of the stordValAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stordValAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStordValAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValueAccount2 }
     * 
     * 
     * @return
     *     The value of the stordValAcct property.
     */
    public List<StoredValueAccount2> getStordValAcct() {
        if (stordValAcct == null) {
            stordValAcct = new ArrayList<>();
        }
        return this.stordValAcct;
    }

    /**
     * Gets the value of the rct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceipt6 }
     * 
     * 
     * @return
     *     The value of the rct property.
     */
    public List<PaymentReceipt6> getRct() {
        if (rct == null) {
            rct = new ArrayList<>();
        }
        return this.rct;
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
     * Adds a new item to the stordValAcct list.
     * @see #getStordValAcct()
     * 
     */
    public BalanceInquiryResponse6 addStordValAcct(StoredValueAccount2 stordValAcct) {
        getStordValAcct().add(stordValAcct);
        return this;
    }

    /**
     * Adds a new item to the rct list.
     * @see #getRct()
     * 
     */
    public BalanceInquiryResponse6 addRct(PaymentReceipt6 rct) {
        getRct().add(rct);
        return this;
    }

}
