
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
 * Information about number of transactions accepted and rejected and the reasons of the rejections.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTransactionStatistics13", propOrder = {
    "ttlNbOfTxs",
    "ttlNbOfTxsAccptd",
    "ttlNbOfTxsRjctd",
    "txsRjctnsRsn"
})
public class DetailedTransactionStatistics13 {

    @XmlElement(name = "TtlNbOfTxs", required = true)
    protected String ttlNbOfTxs;
    @XmlElement(name = "TtlNbOfTxsAccptd", required = true)
    protected String ttlNbOfTxsAccptd;
    @XmlElement(name = "TtlNbOfTxsRjctd", required = true)
    protected String ttlNbOfTxsRjctd;
    @XmlElement(name = "TxsRjctnsRsn")
    protected List<RejectionReason53> txsRjctnsRsn;

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
    public DetailedTransactionStatistics13 setTtlNbOfTxs(String value) {
        this.ttlNbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfTxsAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfTxsAccptd() {
        return ttlNbOfTxsAccptd;
    }

    /**
     * Sets the value of the ttlNbOfTxsAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedTransactionStatistics13 setTtlNbOfTxsAccptd(String value) {
        this.ttlNbOfTxsAccptd = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfTxsRjctd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfTxsRjctd() {
        return ttlNbOfTxsRjctd;
    }

    /**
     * Sets the value of the ttlNbOfTxsRjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedTransactionStatistics13 setTtlNbOfTxsRjctd(String value) {
        this.ttlNbOfTxsRjctd = value;
        return this;
    }

    /**
     * Gets the value of the txsRjctnsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txsRjctnsRsn property.
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
     * {@link RejectionReason53 }
     * 
     * 
     */
    public List<RejectionReason53> getTxsRjctnsRsn() {
        if (txsRjctnsRsn == null) {
            txsRjctnsRsn = new ArrayList<RejectionReason53>();
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
    public DetailedTransactionStatistics13 addTxsRjctnsRsn(RejectionReason53 txsRjctnsRsn) {
        getTxsRjctnsRsn().add(txsRjctnsRsn);
        return this;
    }

}
