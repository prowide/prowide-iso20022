
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateBalancePerSafekeepingPlace41", propOrder = {
    "sfkpgPlc",
    "plcOfListg",
    "pldgee",
    "aggtBal",
    "avlblBal",
    "notAvlblBal",
    "pricDtls",
    "fxDtls",
    "daysAcrd",
    "acctBaseCcyAmts",
    "instrmCcyAmts",
    "qtyBrkdwn",
    "xpsrTp",
    "balBrkdwn",
    "addtlBalBrkdwn",
    "hldgAddtlDtls"
})
public class AggregateBalancePerSafekeepingPlace41 {

    @XmlElement(name = "SfkpgPlc", required = true)
    protected SafeKeepingPlace4 sfkpgPlc;
    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification4Choice plcOfListg;
    @XmlElement(name = "Pldgee")
    protected Pledgee4 pldgee;
    @XmlElement(name = "AggtBal", required = true)
    protected Balance22 aggtBal;
    @XmlElement(name = "AvlblBal")
    protected Balance25 avlblBal;
    @XmlElement(name = "NotAvlblBal")
    protected BalanceQuantity17Choice notAvlblBal;
    @XmlElement(name = "PricDtls")
    protected List<PriceInformation22> pricDtls;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms35> fxDtls;
    @XmlElement(name = "DaysAcrd")
    protected BigDecimal daysAcrd;
    @XmlElement(name = "AcctBaseCcyAmts")
    protected BalanceAmounts4 acctBaseCcyAmts;
    @XmlElement(name = "InstrmCcyAmts")
    protected BalanceAmounts4 instrmCcyAmts;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown71> qtyBrkdwn;
    @XmlElement(name = "XpsrTp")
    protected ExposureType24Choice xpsrTp;
    @XmlElement(name = "BalBrkdwn")
    protected List<SubBalanceInformation24> balBrkdwn;
    @XmlElement(name = "AddtlBalBrkdwn")
    protected List<AdditionalBalanceInformation24> addtlBalBrkdwn;
    @XmlElement(name = "HldgAddtlDtls")
    protected String hldgAddtlDtls;

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace4 }
     *     
     */
    public SafeKeepingPlace4 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace4 }
     *     
     */
    public AggregateBalancePerSafekeepingPlace41 setSfkpgPlc(SafeKeepingPlace4 value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification4Choice }
     *     
     */
    public MarketIdentification4Choice getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification4Choice }
     *     
     */
    public AggregateBalancePerSafekeepingPlace41 setPlcOfListg(MarketIdentification4Choice value) {
        this.plcOfListg = value;
        return this;
    }

    /**
     * Gets the value of the pldgee property.
     * 
     * @return
     *     possible object is
     *     {@link Pledgee4 }
     *     
     */
    public Pledgee4 getPldgee() {
        return pldgee;
    }

    /**
     * Sets the value of the pldgee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pledgee4 }
     *     
     */
    public AggregateBalancePerSafekeepingPlace41 setPldgee(Pledgee4 value) {
        this.pldgee = value;
        return this;
    }

    /**
     * Gets the value of the aggtBal property.
     * 
     * @return
     *     possible object is
     *     {@link Balance22 }
     *     
     */
    public Balance22 getAggtBal() {
        return aggtBal;
    }

    /**
     * Sets the value of the aggtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance22 }
     *     
     */
    public AggregateBalancePerSafekeepingPlace41 setAggtBal(Balance22 value) {
        this.aggtBal = value;
        return this;
    }

    /**
     * Gets the value of the avlblBal property.
     * 
     * @return
     *     possible object is
     *     {@link Balance25 }
     *     
     */
    public Balance25 getAvlblBal() {
        return avlblBal;
    }

    /**
     * Sets the value of the avlblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance25 }
     *     
     */
    public AggregateBalancePerSafekeepingPlace41 setAvlblBal(Balance25 value) {
        this.avlblBal = value;
        return this;
    }

    /**
     * Gets the value of the notAvlblBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity17Choice }
     *     
     */
    public BalanceQuantity17Choice getNotAvlblBal() {
        return notAvlblBal;
    }

    /**
     * Sets the value of the notAvlblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity17Choice }
     *     
     */
    public AggregateBalancePerSafekeepingPlace41 setNotAvlblBal(BalanceQuantity17Choice value) {
        this.notAvlblBal = value;
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
     * {@link PriceInformation22 }
     * 
     * 
     */
    public List<PriceInformation22> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<PriceInformation22>();
        }
        return this.pricDtls;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms35 }
     * 
     * 
     */
    public List<ForeignExchangeTerms35> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<ForeignExchangeTerms35>();
        }
        return this.fxDtls;
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
    public AggregateBalancePerSafekeepingPlace41 setDaysAcrd(BigDecimal value) {
        this.daysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the acctBaseCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts4 }
     *     
     */
    public BalanceAmounts4 getAcctBaseCcyAmts() {
        return acctBaseCcyAmts;
    }

    /**
     * Sets the value of the acctBaseCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts4 }
     *     
     */
    public AggregateBalancePerSafekeepingPlace41 setAcctBaseCcyAmts(BalanceAmounts4 value) {
        this.acctBaseCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the instrmCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts4 }
     *     
     */
    public BalanceAmounts4 getInstrmCcyAmts() {
        return instrmCcyAmts;
    }

    /**
     * Sets the value of the instrmCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts4 }
     *     
     */
    public AggregateBalancePerSafekeepingPlace41 setInstrmCcyAmts(BalanceAmounts4 value) {
        this.instrmCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityBreakdown71 }
     * 
     * 
     */
    public List<QuantityBreakdown71> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<QuantityBreakdown71>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType24Choice }
     *     
     */
    public ExposureType24Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType24Choice }
     *     
     */
    public AggregateBalancePerSafekeepingPlace41 setXpsrTp(ExposureType24Choice value) {
        this.xpsrTp = value;
        return this;
    }

    /**
     * Gets the value of the balBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubBalanceInformation24 }
     * 
     * 
     */
    public List<SubBalanceInformation24> getBalBrkdwn() {
        if (balBrkdwn == null) {
            balBrkdwn = new ArrayList<SubBalanceInformation24>();
        }
        return this.balBrkdwn;
    }

    /**
     * Gets the value of the addtlBalBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlBalBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBalBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBalanceInformation24 }
     * 
     * 
     */
    public List<AdditionalBalanceInformation24> getAddtlBalBrkdwn() {
        if (addtlBalBrkdwn == null) {
            addtlBalBrkdwn = new ArrayList<AdditionalBalanceInformation24>();
        }
        return this.addtlBalBrkdwn;
    }

    /**
     * Gets the value of the hldgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldgAddtlDtls() {
        return hldgAddtlDtls;
    }

    /**
     * Sets the value of the hldgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AggregateBalancePerSafekeepingPlace41 setHldgAddtlDtls(String value) {
        this.hldgAddtlDtls = value;
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
     * Adds a new item to the pricDtls list.
     * @see #getPricDtls()
     * 
     */
    public AggregateBalancePerSafekeepingPlace41 addPricDtls(PriceInformation22 pricDtls) {
        getPricDtls().add(pricDtls);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public AggregateBalancePerSafekeepingPlace41 addFXDtls(ForeignExchangeTerms35 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

    /**
     * Adds a new item to the qtyBrkdwn list.
     * @see #getQtyBrkdwn()
     * 
     */
    public AggregateBalancePerSafekeepingPlace41 addQtyBrkdwn(QuantityBreakdown71 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the balBrkdwn list.
     * @see #getBalBrkdwn()
     * 
     */
    public AggregateBalancePerSafekeepingPlace41 addBalBrkdwn(SubBalanceInformation24 balBrkdwn) {
        getBalBrkdwn().add(balBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the addtlBalBrkdwn list.
     * @see #getAddtlBalBrkdwn()
     * 
     */
    public AggregateBalancePerSafekeepingPlace41 addAddtlBalBrkdwn(AdditionalBalanceInformation24 addtlBalBrkdwn) {
        getAddtlBalBrkdwn().add(addtlBalBrkdwn);
        return this;
    }

}
