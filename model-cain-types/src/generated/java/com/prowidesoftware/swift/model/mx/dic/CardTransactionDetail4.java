
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Details of the card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransactionDetail4", propOrder = {
    "txAmts",
    "txFees",
    "addtlAmts",
    "acctAndBal",
    "txVrfctnRslt",
    "vldtyDt",
    "iccRltdData"
})
public class CardTransactionDetail4 {

    @XmlElement(name = "TxAmts", required = true)
    protected CardTransactionAmount4 txAmts;
    @XmlElement(name = "TxFees")
    protected List<DetailedAmount11> txFees;
    @XmlElement(name = "AddtlAmts")
    protected List<DetailedAmount10> addtlAmts;
    @XmlElement(name = "AcctAndBal")
    protected List<CardAccount2> acctAndBal;
    @XmlElement(name = "TxVrfctnRslt")
    protected List<TransactionVerificationResult4> txVrfctnRslt;
    @XmlElement(name = "VldtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar vldtyDt;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

    /**
     * Gets the value of the txAmts property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransactionAmount4 }
     *     
     */
    public CardTransactionAmount4 getTxAmts() {
        return txAmts;
    }

    /**
     * Sets the value of the txAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransactionAmount4 }
     *     
     */
    public CardTransactionDetail4 setTxAmts(CardTransactionAmount4 value) {
        this.txAmts = value;
        return this;
    }

    /**
     * Gets the value of the txFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount11 }
     * 
     * 
     * @return
     *     The value of the txFees property.
     */
    public List<DetailedAmount11> getTxFees() {
        if (txFees == null) {
            txFees = new ArrayList<>();
        }
        return this.txFees;
    }

    /**
     * Gets the value of the addtlAmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlAmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount10 }
     * 
     * 
     * @return
     *     The value of the addtlAmts property.
     */
    public List<DetailedAmount10> getAddtlAmts() {
        if (addtlAmts == null) {
            addtlAmts = new ArrayList<>();
        }
        return this.addtlAmts;
    }

    /**
     * Gets the value of the acctAndBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctAndBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctAndBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardAccount2 }
     * 
     * 
     * @return
     *     The value of the acctAndBal property.
     */
    public List<CardAccount2> getAcctAndBal() {
        if (acctAndBal == null) {
            acctAndBal = new ArrayList<>();
        }
        return this.acctAndBal;
    }

    /**
     * Gets the value of the txVrfctnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txVrfctnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxVrfctnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionVerificationResult4 }
     * 
     * 
     * @return
     *     The value of the txVrfctnRslt property.
     */
    public List<TransactionVerificationResult4> getTxVrfctnRslt() {
        if (txVrfctnRslt == null) {
            txVrfctnRslt = new ArrayList<>();
        }
        return this.txVrfctnRslt;
    }

    /**
     * Gets the value of the vldtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getVldtyDt() {
        return vldtyDt;
    }

    /**
     * Sets the value of the vldtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransactionDetail4 setVldtyDt(Calendar value) {
        this.vldtyDt = value;
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
    public CardTransactionDetail4 setICCRltdData(byte[] value) {
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
     * Adds a new item to the txFees list.
     * @see #getTxFees()
     * 
     */
    public CardTransactionDetail4 addTxFees(DetailedAmount11 txFees) {
        getTxFees().add(txFees);
        return this;
    }

    /**
     * Adds a new item to the addtlAmts list.
     * @see #getAddtlAmts()
     * 
     */
    public CardTransactionDetail4 addAddtlAmts(DetailedAmount10 addtlAmts) {
        getAddtlAmts().add(addtlAmts);
        return this;
    }

    /**
     * Adds a new item to the acctAndBal list.
     * @see #getAcctAndBal()
     * 
     */
    public CardTransactionDetail4 addAcctAndBal(CardAccount2 acctAndBal) {
        getAcctAndBal().add(acctAndBal);
        return this;
    }

    /**
     * Adds a new item to the txVrfctnRslt list.
     * @see #getTxVrfctnRslt()
     * 
     */
    public CardTransactionDetail4 addTxVrfctnRslt(TransactionVerificationResult4 txVrfctnRslt) {
        getTxVrfctnRslt().add(txVrfctnRslt);
        return this;
    }

}
