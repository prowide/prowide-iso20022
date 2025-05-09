
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
 * Provides details on loan and collateral matching criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingCriteria16", propOrder = {
    "ctrPtyMtchgCrit",
    "valtnMtchgCrit",
    "ctrctMtchgCrit",
    "txMtchgCrit"
})
public class MatchingCriteria16 {

    @XmlElement(name = "CtrPtyMtchgCrit")
    protected CounterpartyMatchingCriteria6 ctrPtyMtchgCrit;
    @XmlElement(name = "ValtnMtchgCrit")
    protected ValuationMatchingCriteria1 valtnMtchgCrit;
    @XmlElement(name = "CtrctMtchgCrit")
    protected ContractMatchingCriteria3 ctrctMtchgCrit;
    @XmlElement(name = "TxMtchgCrit")
    protected TransactionMatchingCriteria6 txMtchgCrit;

    /**
     * Gets the value of the ctrPtyMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyMatchingCriteria6 }
     *     
     */
    public CounterpartyMatchingCriteria6 getCtrPtyMtchgCrit() {
        return ctrPtyMtchgCrit;
    }

    /**
     * Sets the value of the ctrPtyMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyMatchingCriteria6 }
     *     
     */
    public MatchingCriteria16 setCtrPtyMtchgCrit(CounterpartyMatchingCriteria6 value) {
        this.ctrPtyMtchgCrit = value;
        return this;
    }

    /**
     * Gets the value of the valtnMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationMatchingCriteria1 }
     *     
     */
    public ValuationMatchingCriteria1 getValtnMtchgCrit() {
        return valtnMtchgCrit;
    }

    /**
     * Sets the value of the valtnMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationMatchingCriteria1 }
     *     
     */
    public MatchingCriteria16 setValtnMtchgCrit(ValuationMatchingCriteria1 value) {
        this.valtnMtchgCrit = value;
        return this;
    }

    /**
     * Gets the value of the ctrctMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link ContractMatchingCriteria3 }
     *     
     */
    public ContractMatchingCriteria3 getCtrctMtchgCrit() {
        return ctrctMtchgCrit;
    }

    /**
     * Sets the value of the ctrctMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractMatchingCriteria3 }
     *     
     */
    public MatchingCriteria16 setCtrctMtchgCrit(ContractMatchingCriteria3 value) {
        this.ctrctMtchgCrit = value;
        return this;
    }

    /**
     * Gets the value of the txMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionMatchingCriteria6 }
     *     
     */
    public TransactionMatchingCriteria6 getTxMtchgCrit() {
        return txMtchgCrit;
    }

    /**
     * Sets the value of the txMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionMatchingCriteria6 }
     *     
     */
    public MatchingCriteria16 setTxMtchgCrit(TransactionMatchingCriteria6 value) {
        this.txMtchgCrit = value;
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
