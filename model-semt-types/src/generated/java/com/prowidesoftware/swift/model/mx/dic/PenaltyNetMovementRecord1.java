
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Specifies the attributes when the penalty applies to a net settlement movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyNetMovementRecord1", propOrder = {
    "sfkpgAcct",
    "sctiesShrtfll",
    "shrtfllValtn",
    "tradTxCond",
    "nbOfNtries"
})
public class PenaltyNetMovementRecord1 {

    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "SctiesShrtfll")
    protected FinancialInstrumentQuantity1Choice sctiesShrtfll;
    @XmlElement(name = "ShrtfllValtn")
    protected AmountAndDirection5 shrtfllValtn;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition5Choice> tradTxCond;
    @XmlElement(name = "NbOfNtries")
    protected BigDecimal nbOfNtries;

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public PenaltyNetMovementRecord1 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the sctiesShrtfll property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getSctiesShrtfll() {
        return sctiesShrtfll;
    }

    /**
     * Sets the value of the sctiesShrtfll property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public PenaltyNetMovementRecord1 setSctiesShrtfll(FinancialInstrumentQuantity1Choice value) {
        this.sctiesShrtfll = value;
        return this;
    }

    /**
     * Gets the value of the shrtfllValtn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getShrtfllValtn() {
        return shrtfllValtn;
    }

    /**
     * Sets the value of the shrtfllValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public PenaltyNetMovementRecord1 setShrtfllValtn(AmountAndDirection5 value) {
        this.shrtfllValtn = value;
        return this;
    }

    /**
     * Gets the value of the tradTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTransactionCondition5Choice }
     * 
     * 
     * @return
     *     The value of the tradTxCond property.
     */
    public List<TradeTransactionCondition5Choice> getTradTxCond() {
        if (tradTxCond == null) {
            tradTxCond = new ArrayList<>();
        }
        return this.tradTxCond;
    }

    /**
     * Gets the value of the nbOfNtries property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfNtries() {
        return nbOfNtries;
    }

    /**
     * Sets the value of the nbOfNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PenaltyNetMovementRecord1 setNbOfNtries(BigDecimal value) {
        this.nbOfNtries = value;
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

    /**
     * Adds a new item to the tradTxCond list.
     * @see #getTradTxCond()
     * 
     */
    public PenaltyNetMovementRecord1 addTradTxCond(TradeTransactionCondition5Choice tradTxCond) {
        getTradTxCond().add(tradTxCond);
        return this;
    }

}
