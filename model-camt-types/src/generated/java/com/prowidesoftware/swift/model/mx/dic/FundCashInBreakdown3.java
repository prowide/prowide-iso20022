
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
@XmlType(name = "FundCashInBreakdown3", propOrder = {
    "amt",
    "unitsNb",
    "newAmtInd",
    "invstmtFndTxInTp",
    "orgnlOrdrQtyTp",
    "chrgDtls",
    "comssnDtls",
    "sttlmCcy"
})
public class FundCashInBreakdown3 {

    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "UnitsNb")
    protected FinancialInstrumentQuantity1 unitsNb;
    @XmlElement(name = "NewAmtInd")
    protected Boolean newAmtInd;
    @XmlElement(name = "InvstmtFndTxInTp", required = true)
    protected InvestmentFundTransactionInType1Choice invstmtFndTxInTp;
    @XmlElement(name = "OrgnlOrdrQtyTp", required = true)
    protected QuantityType1Choice orgnlOrdrQtyTp;
    @XmlElement(name = "ChrgDtls")
    protected List<Charge26> chrgDtls;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission21> comssnDtls;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;

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
    public FundCashInBreakdown3 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
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
    public FundCashInBreakdown3 setUnitsNb(FinancialInstrumentQuantity1 value) {
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
    public FundCashInBreakdown3 setNewAmtInd(Boolean value) {
        this.newAmtInd = value;
        return this;
    }

    /**
     * Gets the value of the invstmtFndTxInTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundTransactionInType1Choice }
     *     
     */
    public InvestmentFundTransactionInType1Choice getInvstmtFndTxInTp() {
        return invstmtFndTxInTp;
    }

    /**
     * Sets the value of the invstmtFndTxInTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundTransactionInType1Choice }
     *     
     */
    public FundCashInBreakdown3 setInvstmtFndTxInTp(InvestmentFundTransactionInType1Choice value) {
        this.invstmtFndTxInTp = value;
        return this;
    }

    /**
     * Gets the value of the orgnlOrdrQtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType1Choice }
     *     
     */
    public QuantityType1Choice getOrgnlOrdrQtyTp() {
        return orgnlOrdrQtyTp;
    }

    /**
     * Sets the value of the orgnlOrdrQtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType1Choice }
     *     
     */
    public FundCashInBreakdown3 setOrgnlOrdrQtyTp(QuantityType1Choice value) {
        this.orgnlOrdrQtyTp = value;
        return this;
    }

    /**
     * Gets the value of the chrgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge26 }
     * 
     * 
     */
    public List<Charge26> getChrgDtls() {
        if (chrgDtls == null) {
            chrgDtls = new ArrayList<Charge26>();
        }
        return this.chrgDtls;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comssnDtls property.
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
     * {@link Commission21 }
     * 
     * 
     */
    public List<Commission21> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<Commission21>();
        }
        return this.comssnDtls;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundCashInBreakdown3 setSttlmCcy(String value) {
        this.sttlmCcy = value;
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
     * Adds a new item to the chrgDtls list.
     * @see #getChrgDtls()
     * 
     */
    public FundCashInBreakdown3 addChrgDtls(Charge26 chrgDtls) {
        getChrgDtls().add(chrgDtls);
        return this;
    }

    /**
     * Adds a new item to the comssnDtls list.
     * @see #getComssnDtls()
     * 
     */
    public FundCashInBreakdown3 addComssnDtls(Commission21 comssnDtls) {
        getComssnDtls().add(comssnDtls);
        return this;
    }

}
