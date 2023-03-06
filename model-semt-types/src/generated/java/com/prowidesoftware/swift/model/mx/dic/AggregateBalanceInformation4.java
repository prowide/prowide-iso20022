
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
 * Net position of a segregated holding, in a single security, within the overall position held in a securities account. A securities balance is calculated from the sum of securities' receipts minus the sum of securities' deliveries.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateBalanceInformation4", propOrder = {
    "aggtQty",
    "avlblQty",
    "notAvlblQty",
    "daysAcrd",
    "hldgVal",
    "prvsHldgVal",
    "acrdIntrstAmt",
    "acrdIntrstAmtSgn",
    "bookVal",
    "sfkpgPlc",
    "finInstrmDtls",
    "pricDtls",
    "fxDtls",
    "balBrkdwnDtls",
    "addtlBalBrkdwnDtls",
    "balAtSfkpgPlc"
})
public class AggregateBalanceInformation4 {

    @XmlElement(name = "AggtQty", required = true)
    protected BalanceQuantity1Choice aggtQty;
    @XmlElement(name = "AvlblQty")
    protected BalanceQuantity1Choice avlblQty;
    @XmlElement(name = "NotAvlblQty")
    protected BalanceQuantity1Choice notAvlblQty;
    @XmlElement(name = "DaysAcrd")
    protected BigDecimal daysAcrd;
    @XmlElement(name = "HldgVal")
    protected List<ActiveOrHistoricCurrencyAndAmount> hldgVal;
    @XmlElement(name = "PrvsHldgVal")
    protected ActiveOrHistoricCurrencyAndAmount prvsHldgVal;
    @XmlElement(name = "AcrdIntrstAmt")
    protected ActiveOrHistoricCurrencyAndAmount acrdIntrstAmt;
    @XmlElement(name = "AcrdIntrstAmtSgn")
    protected Boolean acrdIntrstAmtSgn;
    @XmlElement(name = "BookVal")
    protected ActiveOrHistoricCurrencyAndAmount bookVal;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormatChoice sfkpgPlc;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument13 finInstrmDtls;
    @XmlElement(name = "PricDtls")
    protected List<PriceInformation2> pricDtls;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms6 fxDtls;
    @XmlElement(name = "BalBrkdwnDtls")
    protected List<SubBalanceInformation2> balBrkdwnDtls;
    @XmlElement(name = "AddtlBalBrkdwnDtls")
    protected List<AdditionalBalanceInformation2> addtlBalBrkdwnDtls;
    @XmlElement(name = "BalAtSfkpgPlc")
    protected List<AggregateBalancePerSafekeepingPlace3> balAtSfkpgPlc;

    /**
     * Gets the value of the aggtQty property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity1Choice }
     *     
     */
    public BalanceQuantity1Choice getAggtQty() {
        return aggtQty;
    }

    /**
     * Sets the value of the aggtQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity1Choice }
     *     
     */
    public AggregateBalanceInformation4 setAggtQty(BalanceQuantity1Choice value) {
        this.aggtQty = value;
        return this;
    }

    /**
     * Gets the value of the avlblQty property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity1Choice }
     *     
     */
    public BalanceQuantity1Choice getAvlblQty() {
        return avlblQty;
    }

    /**
     * Sets the value of the avlblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity1Choice }
     *     
     */
    public AggregateBalanceInformation4 setAvlblQty(BalanceQuantity1Choice value) {
        this.avlblQty = value;
        return this;
    }

    /**
     * Gets the value of the notAvlblQty property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity1Choice }
     *     
     */
    public BalanceQuantity1Choice getNotAvlblQty() {
        return notAvlblQty;
    }

    /**
     * Sets the value of the notAvlblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity1Choice }
     *     
     */
    public AggregateBalanceInformation4 setNotAvlblQty(BalanceQuantity1Choice value) {
        this.notAvlblQty = value;
        return this;
    }

    /**
     * Gets the value of the daysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysAcrd() {
        return daysAcrd;
    }

    /**
     * Sets the value of the daysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AggregateBalanceInformation4 setDaysAcrd(BigDecimal value) {
        this.daysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the hldgVal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hldgVal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHldgVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * 
     */
    public List<ActiveOrHistoricCurrencyAndAmount> getHldgVal() {
        if (hldgVal == null) {
            hldgVal = new ArrayList<ActiveOrHistoricCurrencyAndAmount>();
        }
        return this.hldgVal;
    }

    /**
     * Gets the value of the prvsHldgVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getPrvsHldgVal() {
        return prvsHldgVal;
    }

    /**
     * Sets the value of the prvsHldgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public AggregateBalanceInformation4 setPrvsHldgVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.prvsHldgVal = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public AggregateBalanceInformation4 setAcrdIntrstAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmtSgn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcrdIntrstAmtSgn() {
        return acrdIntrstAmtSgn;
    }

    /**
     * Sets the value of the acrdIntrstAmtSgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AggregateBalanceInformation4 setAcrdIntrstAmtSgn(Boolean value) {
        this.acrdIntrstAmtSgn = value;
        return this;
    }

    /**
     * Gets the value of the bookVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getBookVal() {
        return bookVal;
    }

    /**
     * Sets the value of the bookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public AggregateBalanceInformation4 setBookVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.bookVal = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormatChoice }
     *     
     */
    public SafekeepingPlaceFormatChoice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormatChoice }
     *     
     */
    public AggregateBalanceInformation4 setSfkpgPlc(SafekeepingPlaceFormatChoice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument13 }
     *     
     */
    public FinancialInstrument13 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument13 }
     *     
     */
    public AggregateBalanceInformation4 setFinInstrmDtls(FinancialInstrument13 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceInformation2 }
     * 
     * 
     */
    public List<PriceInformation2> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<PriceInformation2>();
        }
        return this.pricDtls;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms6 }
     *     
     */
    public ForeignExchangeTerms6 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms6 }
     *     
     */
    public AggregateBalanceInformation4 setFXDtls(ForeignExchangeTerms6 value) {
        this.fxDtls = value;
        return this;
    }

    /**
     * Gets the value of the balBrkdwnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balBrkdwnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalBrkdwnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubBalanceInformation2 }
     * 
     * 
     */
    public List<SubBalanceInformation2> getBalBrkdwnDtls() {
        if (balBrkdwnDtls == null) {
            balBrkdwnDtls = new ArrayList<SubBalanceInformation2>();
        }
        return this.balBrkdwnDtls;
    }

    /**
     * Gets the value of the addtlBalBrkdwnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlBalBrkdwnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBalBrkdwnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBalanceInformation2 }
     * 
     * 
     */
    public List<AdditionalBalanceInformation2> getAddtlBalBrkdwnDtls() {
        if (addtlBalBrkdwnDtls == null) {
            addtlBalBrkdwnDtls = new ArrayList<AdditionalBalanceInformation2>();
        }
        return this.addtlBalBrkdwnDtls;
    }

    /**
     * Gets the value of the balAtSfkpgPlc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balAtSfkpgPlc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalAtSfkpgPlc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateBalancePerSafekeepingPlace3 }
     * 
     * 
     */
    public List<AggregateBalancePerSafekeepingPlace3> getBalAtSfkpgPlc() {
        if (balAtSfkpgPlc == null) {
            balAtSfkpgPlc = new ArrayList<AggregateBalancePerSafekeepingPlace3>();
        }
        return this.balAtSfkpgPlc;
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
     * Adds a new item to the hldgVal list.
     * @see #getHldgVal()
     * 
     */
    public AggregateBalanceInformation4 addHldgVal(ActiveOrHistoricCurrencyAndAmount hldgVal) {
        getHldgVal().add(hldgVal);
        return this;
    }

    /**
     * Adds a new item to the pricDtls list.
     * @see #getPricDtls()
     * 
     */
    public AggregateBalanceInformation4 addPricDtls(PriceInformation2 pricDtls) {
        getPricDtls().add(pricDtls);
        return this;
    }

    /**
     * Adds a new item to the balBrkdwnDtls list.
     * @see #getBalBrkdwnDtls()
     * 
     */
    public AggregateBalanceInformation4 addBalBrkdwnDtls(SubBalanceInformation2 balBrkdwnDtls) {
        getBalBrkdwnDtls().add(balBrkdwnDtls);
        return this;
    }

    /**
     * Adds a new item to the addtlBalBrkdwnDtls list.
     * @see #getAddtlBalBrkdwnDtls()
     * 
     */
    public AggregateBalanceInformation4 addAddtlBalBrkdwnDtls(AdditionalBalanceInformation2 addtlBalBrkdwnDtls) {
        getAddtlBalBrkdwnDtls().add(addtlBalBrkdwnDtls);
        return this;
    }

    /**
     * Adds a new item to the balAtSfkpgPlc list.
     * @see #getBalAtSfkpgPlc()
     * 
     */
    public AggregateBalanceInformation4 addBalAtSfkpgPlc(AggregateBalancePerSafekeepingPlace3 balAtSfkpgPlc) {
        getBalAtSfkpgPlc().add(balAtSfkpgPlc);
        return this;
    }

}
