
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "FundCashInBreakdown2", propOrder = {
    "amt",
    "unitsNb",
    "newAmtInd",
    "invstmtFndTxInTp",
    "xtndedInvstmtFndTxInTp",
    "orgnlOrdrQtyTp",
    "xtndedOrgnlOrdrQtyTp",
    "chrgDtls",
    "comssnDtls"
})
public class FundCashInBreakdown2 {

    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "UnitsNb")
    protected FinancialInstrumentQuantity1 unitsNb;
    @XmlElement(name = "NewAmtInd")
    protected Boolean newAmtInd;
    @XmlElement(name = "InvstmtFndTxInTp")
    @XmlSchemaType(name = "string")
    protected InvestmentFundTransactionInType1Code invstmtFndTxInTp;
    @XmlElement(name = "XtndedInvstmtFndTxInTp")
    protected String xtndedInvstmtFndTxInTp;
    @XmlElement(name = "OrgnlOrdrQtyTp")
    @XmlSchemaType(name = "string")
    protected OrderQuantityType2Code orgnlOrdrQtyTp;
    @XmlElement(name = "XtndedOrgnlOrdrQtyTp")
    protected String xtndedOrgnlOrdrQtyTp;
    @XmlElement(name = "ChrgDtls")
    protected List<Charge16> chrgDtls;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission9> comssnDtls;

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
    public FundCashInBreakdown2 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
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
    public FundCashInBreakdown2 setUnitsNb(FinancialInstrumentQuantity1 value) {
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
    public FundCashInBreakdown2 setNewAmtInd(Boolean value) {
        this.newAmtInd = value;
        return this;
    }

    /**
     * Gets the value of the invstmtFndTxInTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundTransactionInType1Code }
     *     
     */
    public InvestmentFundTransactionInType1Code getInvstmtFndTxInTp() {
        return invstmtFndTxInTp;
    }

    /**
     * Sets the value of the invstmtFndTxInTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundTransactionInType1Code }
     *     
     */
    public FundCashInBreakdown2 setInvstmtFndTxInTp(InvestmentFundTransactionInType1Code value) {
        this.invstmtFndTxInTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedInvstmtFndTxInTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedInvstmtFndTxInTp() {
        return xtndedInvstmtFndTxInTp;
    }

    /**
     * Sets the value of the xtndedInvstmtFndTxInTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundCashInBreakdown2 setXtndedInvstmtFndTxInTp(String value) {
        this.xtndedInvstmtFndTxInTp = value;
        return this;
    }

    /**
     * Gets the value of the orgnlOrdrQtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantityType2Code }
     *     
     */
    public OrderQuantityType2Code getOrgnlOrdrQtyTp() {
        return orgnlOrdrQtyTp;
    }

    /**
     * Sets the value of the orgnlOrdrQtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantityType2Code }
     *     
     */
    public FundCashInBreakdown2 setOrgnlOrdrQtyTp(OrderQuantityType2Code value) {
        this.orgnlOrdrQtyTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedOrgnlOrdrQtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedOrgnlOrdrQtyTp() {
        return xtndedOrgnlOrdrQtyTp;
    }

    /**
     * Sets the value of the xtndedOrgnlOrdrQtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundCashInBreakdown2 setXtndedOrgnlOrdrQtyTp(String value) {
        this.xtndedOrgnlOrdrQtyTp = value;
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
     * {@link Charge16 }
     * 
     * 
     */
    public List<Charge16> getChrgDtls() {
        if (chrgDtls == null) {
            chrgDtls = new ArrayList<Charge16>();
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
     * {@link Commission9 }
     * 
     * 
     */
    public List<Commission9> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<Commission9>();
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
     * Adds a new item to the chrgDtls list.
     * @see #getChrgDtls()
     * 
     */
    public FundCashInBreakdown2 addChrgDtls(Charge16 chrgDtls) {
        getChrgDtls().add(chrgDtls);
        return this;
    }

    /**
     * Adds a new item to the comssnDtls list.
     * @see #getComssnDtls()
     * 
     */
    public FundCashInBreakdown2 addComssnDtls(Commission9 comssnDtls) {
        getComssnDtls().add(comssnDtls);
        return this;
    }

}
