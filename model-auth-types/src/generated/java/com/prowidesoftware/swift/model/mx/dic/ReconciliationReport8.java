
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
 * Data on transaction requiring reconciliation or pairing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationReport8", propOrder = {
    "techRcrdId",
    "txId",
    "modfd",
    "rcncltnSts"
})
public class ReconciliationReport8 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "TxId", required = true)
    protected TradeTransactionIdentification19 txId;
    @XmlElement(name = "Modfd")
    protected boolean modfd;
    @XmlElement(name = "RcncltnSts", required = true)
    protected ReconciliationStatus8Choice rcncltnSts;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReconciliationReport8 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification19 }
     *     
     */
    public TradeTransactionIdentification19 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification19 }
     *     
     */
    public ReconciliationReport8 setTxId(TradeTransactionIdentification19 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the modfd property.
     * 
     */
    public boolean isModfd() {
        return modfd;
    }

    /**
     * Sets the value of the modfd property.
     * 
     */
    public ReconciliationReport8 setModfd(boolean value) {
        this.modfd = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationStatus8Choice }
     *     
     */
    public ReconciliationStatus8Choice getRcncltnSts() {
        return rcncltnSts;
    }

    /**
     * Sets the value of the rcncltnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationStatus8Choice }
     *     
     */
    public ReconciliationReport8 setRcncltnSts(ReconciliationStatus8Choice value) {
        this.rcncltnSts = value;
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
