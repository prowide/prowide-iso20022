
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
 * Information about number of transactions accepted and rejected and the reasons of the rejections.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTransactionStatistics29", propOrder = {
    "ttlNbOfTxs",
    "ttlNbOfTxsAccptd",
    "ttlNbOfTxsRjctd",
    "ttlCrrctdRjctns",
    "txsRjctnsRsn"
})
public class DetailedTransactionStatistics29 {

    @XmlElement(name = "TtlNbOfTxs", required = true)
    protected String ttlNbOfTxs;
    @XmlElement(name = "TtlNbOfTxsAccptd", required = true)
    protected StatisticsPerActionType1 ttlNbOfTxsAccptd;
    @XmlElement(name = "TtlNbOfTxsRjctd", required = true)
    protected StatisticsPerActionType1 ttlNbOfTxsRjctd;
    @XmlElement(name = "TtlCrrctdRjctns")
    protected StatisticsPerActionType1 ttlCrrctdRjctns;
    @XmlElement(name = "TxsRjctnsRsn")
    protected List<RejectionReason71> txsRjctnsRsn;

    /**
     * Gets the value of the ttlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfTxs() {
        return ttlNbOfTxs;
    }

    /**
     * Sets the value of the ttlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedTransactionStatistics29 setTtlNbOfTxs(String value) {
        this.ttlNbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfTxsAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public StatisticsPerActionType1 getTtlNbOfTxsAccptd() {
        return ttlNbOfTxsAccptd;
    }

    /**
     * Sets the value of the ttlNbOfTxsAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public DetailedTransactionStatistics29 setTtlNbOfTxsAccptd(StatisticsPerActionType1 value) {
        this.ttlNbOfTxsAccptd = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfTxsRjctd property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public StatisticsPerActionType1 getTtlNbOfTxsRjctd() {
        return ttlNbOfTxsRjctd;
    }

    /**
     * Sets the value of the ttlNbOfTxsRjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public DetailedTransactionStatistics29 setTtlNbOfTxsRjctd(StatisticsPerActionType1 value) {
        this.ttlNbOfTxsRjctd = value;
        return this;
    }

    /**
     * Gets the value of the ttlCrrctdRjctns property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public StatisticsPerActionType1 getTtlCrrctdRjctns() {
        return ttlCrrctdRjctns;
    }

    /**
     * Sets the value of the ttlCrrctdRjctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public DetailedTransactionStatistics29 setTtlCrrctdRjctns(StatisticsPerActionType1 value) {
        this.ttlCrrctdRjctns = value;
        return this;
    }

    /**
     * Gets the value of the txsRjctnsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txsRjctnsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxsRjctnsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectionReason71 }
     * 
     * 
     * @return
     *     The value of the txsRjctnsRsn property.
     */
    public List<RejectionReason71> getTxsRjctnsRsn() {
        if (txsRjctnsRsn == null) {
            txsRjctnsRsn = new ArrayList<>();
        }
        return this.txsRjctnsRsn;
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
     * Adds a new item to the txsRjctnsRsn list.
     * @see #getTxsRjctnsRsn()
     * 
     */
    public DetailedTransactionStatistics29 addTxsRjctnsRsn(RejectionReason71 txsRjctnsRsn) {
        getTxsRjctnsRsn().add(txsRjctnsRsn);
        return this;
    }

}
