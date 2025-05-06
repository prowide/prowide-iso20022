
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Transaction Data related to an order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionData3", propOrder = {
    "txPric",
    "traddQty",
    "pssvOrAggrssvInd",
    "strtgyLkdOrdrId",
    "txId"
})
public class TransactionData3 {

    @XmlElement(name = "TxPric")
    protected SecuritiesTransactionPrice4Choice txPric;
    @XmlElement(name = "TraddQty")
    protected FinancialInstrumentQuantity25Choice traddQty;
    @XmlElement(name = "PssvOrAggrssvInd")
    @XmlSchemaType(name = "string")
    protected PassiveOrAgressiveType1Code pssvOrAggrssvInd;
    @XmlElement(name = "StrtgyLkdOrdrId")
    protected String strtgyLkdOrdrId;
    @XmlElement(name = "TxId")
    protected String txId;

    /**
     * Gets the value of the txPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice4Choice }
     *     
     */
    public SecuritiesTransactionPrice4Choice getTxPric() {
        return txPric;
    }

    /**
     * Sets the value of the txPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice4Choice }
     *     
     */
    public TransactionData3 setTxPric(SecuritiesTransactionPrice4Choice value) {
        this.txPric = value;
        return this;
    }

    /**
     * Gets the value of the traddQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getTraddQty() {
        return traddQty;
    }

    /**
     * Sets the value of the traddQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public TransactionData3 setTraddQty(FinancialInstrumentQuantity25Choice value) {
        this.traddQty = value;
        return this;
    }

    /**
     * Gets the value of the pssvOrAggrssvInd property.
     * 
     * @return
     *     possible object is
     *     {@link PassiveOrAgressiveType1Code }
     *     
     */
    public PassiveOrAgressiveType1Code getPssvOrAggrssvInd() {
        return pssvOrAggrssvInd;
    }

    /**
     * Sets the value of the pssvOrAggrssvInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassiveOrAgressiveType1Code }
     *     
     */
    public TransactionData3 setPssvOrAggrssvInd(PassiveOrAgressiveType1Code value) {
        this.pssvOrAggrssvInd = value;
        return this;
    }

    /**
     * Gets the value of the strtgyLkdOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtgyLkdOrdrId() {
        return strtgyLkdOrdrId;
    }

    /**
     * Sets the value of the strtgyLkdOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionData3 setStrtgyLkdOrdrId(String value) {
        this.strtgyLkdOrdrId = value;
        return this;
    }

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
    public TransactionData3 setTxId(String value) {
        this.txId = value;
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
