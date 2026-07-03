
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides detailed information on the transaction and it's status to be updated in the tracker.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerStatusAndTransaction3", propOrder = {
    "txSts",
    "tx"
})
public class TrackerStatusAndTransaction3 {

    @XmlElement(name = "TxSts", required = true)
    protected TrackerStatus3 txSts;
    @XmlElement(name = "Tx", required = true)
    protected TrackerPaymentTransaction3 tx;

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerStatus3 }
     *     
     */
    public TrackerStatus3 getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerStatus3 }
     *     
     */
    public TrackerStatusAndTransaction3 setTxSts(TrackerStatus3 value) {
        this.txSts = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerPaymentTransaction3 }
     *     
     */
    public TrackerPaymentTransaction3 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerPaymentTransaction3 }
     *     
     */
    public TrackerStatusAndTransaction3 setTx(TrackerPaymentTransaction3 value) {
        this.tx = value;
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

}
