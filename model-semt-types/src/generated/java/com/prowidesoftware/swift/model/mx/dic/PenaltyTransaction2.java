
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
@XmlType(name = "PenaltyTransaction2", propOrder = {
    "ref",
    "refOwnr",
    "txDtls",
    "netMvmntDtls"
})
public class PenaltyTransaction2 {

    @XmlElement(name = "Ref", required = true)
    protected TransactionIdentifications40 ref;
    @XmlElement(name = "RefOwnr")
    protected PartyIdentification136 refOwnr;
    @XmlElement(name = "TxDtls")
    protected PenaltyTransactionRecord1 txDtls;
    @XmlElement(name = "NetMvmntDtls")
    protected PenaltyNetMovementRecord1 netMvmntDtls;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications40 }
     *     
     */
    public TransactionIdentifications40 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications40 }
     *     
     */
    public PenaltyTransaction2 setRef(TransactionIdentifications40 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the refOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getRefOwnr() {
        return refOwnr;
    }

    /**
     * Sets the value of the refOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PenaltyTransaction2 setRefOwnr(PartyIdentification136 value) {
        this.refOwnr = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyTransactionRecord1 }
     *     
     */
    public PenaltyTransactionRecord1 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyTransactionRecord1 }
     *     
     */
    public PenaltyTransaction2 setTxDtls(PenaltyTransactionRecord1 value) {
        this.txDtls = value;
        return this;
    }

    /**
     * Gets the value of the netMvmntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyNetMovementRecord1 }
     *     
     */
    public PenaltyNetMovementRecord1 getNetMvmntDtls() {
        return netMvmntDtls;
    }

    /**
     * Sets the value of the netMvmntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyNetMovementRecord1 }
     *     
     */
    public PenaltyTransaction2 setNetMvmntDtls(PenaltyNetMovementRecord1 value) {
        this.netMvmntDtls = value;
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
