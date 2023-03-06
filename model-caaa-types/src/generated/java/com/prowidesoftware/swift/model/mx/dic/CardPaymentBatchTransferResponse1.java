
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
 * Status of the transactions sent in a previous batch of card payment transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentBatchTransferResponse1", propOrder = {
    "txTtls",
    "dataSet"
})
public class CardPaymentBatchTransferResponse1 {

    @XmlElement(name = "TxTtls", required = true)
    protected TransactionTotals2 txTtls;
    @XmlElement(name = "DataSet")
    protected List<CardPaymentDataSet5> dataSet;

    /**
     * Gets the value of the txTtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTotals2 }
     *     
     */
    public TransactionTotals2 getTxTtls() {
        return txTtls;
    }

    /**
     * Sets the value of the txTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTotals2 }
     *     
     */
    public CardPaymentBatchTransferResponse1 setTxTtls(TransactionTotals2 value) {
        this.txTtls = value;
        return this;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet5 }
     * 
     * 
     */
    public List<CardPaymentDataSet5> getDataSet() {
        if (dataSet == null) {
            dataSet = new ArrayList<CardPaymentDataSet5>();
        }
        return this.dataSet;
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
     * Adds a new item to the dataSet list.
     * @see #getDataSet()
     * 
     */
    public CardPaymentBatchTransferResponse1 addDataSet(CardPaymentDataSet5 dataSet) {
        getDataSet().add(dataSet);
        return this;
    }

}
