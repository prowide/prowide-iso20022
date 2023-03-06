
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
 * Provides detailed information on the transaction and it's status as updated in the tracker.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerStatusAndTransaction7", propOrder = {
    "txSts",
    "alrtSts",
    "tx"
})
public class TrackerStatusAndTransaction7 {

    @XmlElement(name = "TxSts")
    protected TrackerStatus2 txSts;
    @XmlElement(name = "AlrtSts", required = true)
    protected TrackerAlertNotificationStatus1 alrtSts;
    @XmlElement(name = "Tx", required = true)
    protected List<TrackerPaymentTransaction7> tx;

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerStatus2 }
     *     
     */
    public TrackerStatus2 getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerStatus2 }
     *     
     */
    public TrackerStatusAndTransaction7 setTxSts(TrackerStatus2 value) {
        this.txSts = value;
        return this;
    }

    /**
     * Gets the value of the alrtSts property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerAlertNotificationStatus1 }
     *     
     */
    public TrackerAlertNotificationStatus1 getAlrtSts() {
        return alrtSts;
    }

    /**
     * Sets the value of the alrtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerAlertNotificationStatus1 }
     *     
     */
    public TrackerStatusAndTransaction7 setAlrtSts(TrackerAlertNotificationStatus1 value) {
        this.alrtSts = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackerPaymentTransaction7 }
     * 
     * 
     */
    public List<TrackerPaymentTransaction7> getTx() {
        if (tx == null) {
            tx = new ArrayList<TrackerPaymentTransaction7>();
        }
        return this.tx;
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
     * Adds a new item to the tx list.
     * @see #getTx()
     * 
     */
    public TrackerStatusAndTransaction7 addTx(TrackerPaymentTransaction7 tx) {
        getTx().add(tx);
        return this;
    }

}
