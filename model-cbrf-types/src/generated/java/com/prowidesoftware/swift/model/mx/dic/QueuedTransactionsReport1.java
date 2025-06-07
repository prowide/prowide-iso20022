
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Payment funds transfer instructions from intraday queue.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueuedTransactionsReport1", propOrder = {
    "qTp",
    "nbOfTxs",
    "ttlAmt",
    "brkdwnByCtrPty"
})
public class QueuedTransactionsReport1 {

    @XmlElement(name = "QTp", required = true)
    protected String qTp;
    @XmlElement(name = "NbOfTxs")
    protected BigDecimal nbOfTxs;
    @XmlElement(name = "TtlAmt", required = true)
    protected ActiveCurrencyAndAmount ttlAmt;
    @XmlElement(name = "BrkdwnByCtrPty")
    protected List<QueueTransaction1> brkdwnByCtrPty;

    /**
     * Gets the value of the qTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQTp() {
        return qTp;
    }

    /**
     * Sets the value of the qTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QueuedTransactionsReport1 setQTp(String value) {
        this.qTp = value;
        return this;
    }

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public QueuedTransactionsReport1 setNbOfTxs(BigDecimal value) {
        this.nbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public QueuedTransactionsReport1 setTtlAmt(ActiveCurrencyAndAmount value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the brkdwnByCtrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brkdwnByCtrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByCtrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueueTransaction1 }
     * 
     * 
     */
    public List<QueueTransaction1> getBrkdwnByCtrPty() {
        if (brkdwnByCtrPty == null) {
            brkdwnByCtrPty = new ArrayList<QueueTransaction1>();
        }
        return this.brkdwnByCtrPty;
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
     * Adds a new item to the brkdwnByCtrPty list.
     * @see #getBrkdwnByCtrPty()
     * 
     */
    public QueuedTransactionsReport1 addBrkdwnByCtrPty(QueueTransaction1 brkdwnByCtrPty) {
        getBrkdwnByCtrPty().add(brkdwnByCtrPty);
        return this;
    }

}
