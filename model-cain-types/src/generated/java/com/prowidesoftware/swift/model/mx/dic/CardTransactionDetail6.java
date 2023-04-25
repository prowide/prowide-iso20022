
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
 * Details of the card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransactionDetail6", propOrder = {
    "txAmts",
    "txFees",
    "addtlAmts",
    "iccRltdData"
})
public class CardTransactionDetail6 {

    @XmlElement(name = "TxAmts", required = true)
    protected CardTransactionAmount5 txAmts;
    @XmlElement(name = "TxFees")
    protected List<DetailedAmount11> txFees;
    @XmlElement(name = "AddtlAmts")
    protected List<DetailedAmount10> addtlAmts;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

    /**
     * Gets the value of the txAmts property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransactionAmount5 }
     *     
     */
    public CardTransactionAmount5 getTxAmts() {
        return txAmts;
    }

    /**
     * Sets the value of the txAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransactionAmount5 }
     *     
     */
    public CardTransactionDetail6 setTxAmts(CardTransactionAmount5 value) {
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
    public CardTransactionDetail6 setICCRltdData(byte[] value) {
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
    public CardTransactionDetail6 addTxFees(DetailedAmount11 txFees) {
        getTxFees().add(txFees);
        return this;
    }

    /**
     * Adds a new item to the addtlAmts list.
     * @see #getAddtlAmts()
     * 
     */
    public CardTransactionDetail6 addAddtlAmts(DetailedAmount10 addtlAmts) {
        getAddtlAmts().add(addtlAmts);
        return this;
    }

}
