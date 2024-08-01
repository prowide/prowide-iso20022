
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
 * Provides detailed information on the transaction and its status to be updated in the tracker.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerStatusAndTransaction14", propOrder = {
    "txSts",
    "tx"
})
public class TrackerStatusAndTransaction14 {

    @XmlElement(name = "TxSts", required = true)
    protected TrackerStatus1 txSts;
    @XmlElement(name = "Tx", required = true)
    protected List<TrackerPaymentTransaction11> tx;

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerStatus1 }
     *     
     */
    public TrackerStatus1 getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerStatus1 }
     *     
     */
    public TrackerStatusAndTransaction14 setTxSts(TrackerStatus1 value) {
        this.txSts = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tx property.
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
     * {@link TrackerPaymentTransaction11 }
     * 
     * 
     * @return
     *     The value of the tx property.
     */
    public List<TrackerPaymentTransaction11> getTx() {
        if (tx == null) {
            tx = new ArrayList<>();
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
    public TrackerStatusAndTransaction14 addTx(TrackerPaymentTransaction11 tx) {
        getTx().add(tx);
        return this;
    }

}
