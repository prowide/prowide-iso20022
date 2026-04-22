
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the different identifications associated with a trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReference3", propOrder = {
    "txId",
    "rltdTxId"
})
public class TradeReference3 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "RltdTxId", required = true)
    protected String rltdTxId;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeReference3 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the rltdTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdTxId() {
        return rltdTxId;
    }

    /**
     * Sets the value of the rltdTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeReference3 setRltdTxId(String value) {
        this.rltdTxId = value;
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
