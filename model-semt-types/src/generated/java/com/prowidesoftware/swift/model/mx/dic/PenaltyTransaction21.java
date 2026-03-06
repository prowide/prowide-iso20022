
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
 * Specifies the transaction for which the penalties apply.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyTransaction2__1", propOrder = {
    "ref",
    "refOwnr",
    "txDtls"
})
public class PenaltyTransaction21 {

    @XmlElement(name = "Ref", required = true)
    protected TransactionIdentifications401 ref;
    @XmlElement(name = "RefOwnr")
    protected PartyIdentification1361 refOwnr;
    @XmlElement(name = "TxDtls")
    protected PenaltyTransactionRecord11 txDtls;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications401 }
     *     
     */
    public TransactionIdentifications401 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications401 }
     *     
     */
    public PenaltyTransaction21 setRef(TransactionIdentifications401 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the refOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1361 }
     *     
     */
    public PartyIdentification1361 getRefOwnr() {
        return refOwnr;
    }

    /**
     * Sets the value of the refOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1361 }
     *     
     */
    public PenaltyTransaction21 setRefOwnr(PartyIdentification1361 value) {
        this.refOwnr = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyTransactionRecord11 }
     *     
     */
    public PenaltyTransactionRecord11 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyTransactionRecord11 }
     *     
     */
    public PenaltyTransaction21 setTxDtls(PenaltyTransactionRecord11 value) {
        this.txDtls = value;
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
