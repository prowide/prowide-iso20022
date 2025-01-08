
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
 * Breakdown of cash movements into a fund as a result of investment funds transactions, eg, subscriptions or switch-in.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundCashInBreakdown1", propOrder = {
    "amt",
    "unitsNb",
    "newAmtInd",
    "invstmtFndTxInTpDtls",
    "orgnlOrdrQtyDtls",
    "comssnDtls"
})
public class FundCashInBreakdown1 {

    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "UnitsNb")
    protected FinancialInstrumentQuantity1 unitsNb;
    @XmlElement(name = "NewAmtInd")
    protected Boolean newAmtInd;
    @XmlElement(name = "InvstmtFndTxInTpDtls")
    protected InvestmentFundTransactionInType1 invstmtFndTxInTpDtls;
    @XmlElement(name = "OrgnlOrdrQtyDtls")
    protected OriginalOrderQuantityType1 orgnlOrdrQtyDtls;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission4> comssnDtls;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FundCashInBreakdown1 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the unitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getUnitsNb() {
        return unitsNb;
    }

    /**
     * Sets the value of the unitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FundCashInBreakdown1 setUnitsNb(FinancialInstrumentQuantity1 value) {
        this.unitsNb = value;
        return this;
    }

    /**
     * Gets the value of the newAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewAmtInd() {
        return newAmtInd;
    }

    /**
     * Sets the value of the newAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FundCashInBreakdown1 setNewAmtInd(Boolean value) {
        this.newAmtInd = value;
        return this;
    }

    /**
     * Gets the value of the invstmtFndTxInTpDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundTransactionInType1 }
     *     
     */
    public InvestmentFundTransactionInType1 getInvstmtFndTxInTpDtls() {
        return invstmtFndTxInTpDtls;
    }

    /**
     * Sets the value of the invstmtFndTxInTpDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundTransactionInType1 }
     *     
     */
    public FundCashInBreakdown1 setInvstmtFndTxInTpDtls(InvestmentFundTransactionInType1 value) {
        this.invstmtFndTxInTpDtls = value;
        return this;
    }

    /**
     * Gets the value of the orgnlOrdrQtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalOrderQuantityType1 }
     *     
     */
    public OriginalOrderQuantityType1 getOrgnlOrdrQtyDtls() {
        return orgnlOrdrQtyDtls;
    }

    /**
     * Sets the value of the orgnlOrdrQtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalOrderQuantityType1 }
     *     
     */
    public FundCashInBreakdown1 setOrgnlOrdrQtyDtls(OriginalOrderQuantityType1 value) {
        this.orgnlOrdrQtyDtls = value;
        return this;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the comssnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComssnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission4 }
     * 
     * 
     * @return
     *     The value of the comssnDtls property.
     */
    public List<Commission4> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<>();
        }
        return this.comssnDtls;
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
     * Adds a new item to the comssnDtls list.
     * @see #getComssnDtls()
     * 
     */
    public FundCashInBreakdown1 addComssnDtls(Commission4 comssnDtls) {
        getComssnDtls().add(comssnDtls);
        return this;
    }

}
