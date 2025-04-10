
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Net position of a segregated holding of a single security within the overall position held in the securities account, eg, sub-balance per status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateBalanceInformation5", propOrder = {
    "aggtQty",
    "hldgVal",
    "prvsHldgVal",
    "bookVal",
    "finInstrmDtls",
    "balBrkdwnDtls",
    "subBalInf",
    "pricDtls",
    "equlstnBal",
    "frgnXchgDtls"
})
public class AggregateBalanceInformation5 {

    @XmlElement(name = "AggtQty", required = true)
    protected BalanceQuantity1Choice aggtQty;
    @XmlElement(name = "HldgVal")
    protected List<ActiveOrHistoricCurrencyAndAmount> hldgVal;
    @XmlElement(name = "PrvsHldgVal")
    protected ActiveOrHistoricCurrencyAndAmount prvsHldgVal;
    @XmlElement(name = "BookVal")
    protected ActiveOrHistoricCurrencyAndAmount bookVal;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument18 finInstrmDtls;
    @XmlElement(name = "BalBrkdwnDtls")
    protected List<AdditionalBalanceInformation3> balBrkdwnDtls;
    @XmlElement(name = "SubBalInf")
    protected List<SubBalanceInformation3> subBalInf;
    @XmlElement(name = "PricDtls")
    protected List<PriceInformation3> pricDtls;
    @XmlElement(name = "EqulstnBal")
    protected Equalisation2 equlstnBal;
    @XmlElement(name = "FrgnXchgDtls")
    protected ForeignExchangeTerms6 frgnXchgDtls;

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
    public AggregateBalanceInformation5 setAggtQty(BalanceQuantity1Choice value) {
        this.aggtQty = value;
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
    public AggregateBalanceInformation5 setPrvsHldgVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.prvsHldgVal = value;
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
    public AggregateBalanceInformation5 setBookVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.bookVal = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument18 }
     *     
     */
    public FinancialInstrument18 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument18 }
     *     
     */
    public AggregateBalanceInformation5 setFinInstrmDtls(FinancialInstrument18 value) {
        this.finInstrmDtls = value;
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
     * {@link AdditionalBalanceInformation3 }
     * 
     * 
     */
    public List<AdditionalBalanceInformation3> getBalBrkdwnDtls() {
        if (balBrkdwnDtls == null) {
            balBrkdwnDtls = new ArrayList<AdditionalBalanceInformation3>();
        }
        return this.balBrkdwnDtls;
    }

    /**
     * Gets the value of the subBalInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subBalInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubBalInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubBalanceInformation3 }
     * 
     * 
     */
    public List<SubBalanceInformation3> getSubBalInf() {
        if (subBalInf == null) {
            subBalInf = new ArrayList<SubBalanceInformation3>();
        }
        return this.subBalInf;
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
     * {@link PriceInformation3 }
     * 
     * 
     */
    public List<PriceInformation3> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<PriceInformation3>();
        }
        return this.pricDtls;
    }

    /**
     * Gets the value of the equlstnBal property.
     * 
     * @return
     *     possible object is
     *     {@link Equalisation2 }
     *     
     */
    public Equalisation2 getEqulstnBal() {
        return equlstnBal;
    }

    /**
     * Sets the value of the equlstnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equalisation2 }
     *     
     */
    public AggregateBalanceInformation5 setEqulstnBal(Equalisation2 value) {
        this.equlstnBal = value;
        return this;
    }

    /**
     * Gets the value of the frgnXchgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms6 }
     *     
     */
    public ForeignExchangeTerms6 getFrgnXchgDtls() {
        return frgnXchgDtls;
    }

    /**
     * Sets the value of the frgnXchgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms6 }
     *     
     */
    public AggregateBalanceInformation5 setFrgnXchgDtls(ForeignExchangeTerms6 value) {
        this.frgnXchgDtls = value;
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
     * Adds a new item to the hldgVal list.
     * @see #getHldgVal()
     * 
     */
    public AggregateBalanceInformation5 addHldgVal(ActiveOrHistoricCurrencyAndAmount hldgVal) {
        getHldgVal().add(hldgVal);
        return this;
    }

    /**
     * Adds a new item to the balBrkdwnDtls list.
     * @see #getBalBrkdwnDtls()
     * 
     */
    public AggregateBalanceInformation5 addBalBrkdwnDtls(AdditionalBalanceInformation3 balBrkdwnDtls) {
        getBalBrkdwnDtls().add(balBrkdwnDtls);
        return this;
    }

    /**
     * Adds a new item to the subBalInf list.
     * @see #getSubBalInf()
     * 
     */
    public AggregateBalanceInformation5 addSubBalInf(SubBalanceInformation3 subBalInf) {
        getSubBalInf().add(subBalInf);
        return this;
    }

    /**
     * Adds a new item to the pricDtls list.
     * @see #getPricDtls()
     * 
     */
    public AggregateBalanceInformation5 addPricDtls(PriceInformation3 pricDtls) {
        getPricDtls().add(pricDtls);
        return this;
    }

}
