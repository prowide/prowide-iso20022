
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
@XmlType(name = "AggregateBalancePerSafekeepingPlace26", propOrder = {
    "sfkpgPlc",
    "plcOfListg",
    "pldgee",
    "aggtBal",
    "pricDtls",
    "fxDtls",
    "daysAcrd",
    "acctBaseCcyAmts",
    "instrmCcyAmts",
    "altrnRptgCcyAmts",
    "qtyBrkdwn",
    "xpsrTp",
    "balBrkdwn",
    "addtlBalBrkdwn",
    "hldgAddtlDtls"
})
public class AggregateBalancePerSafekeepingPlace26 {

    @XmlElement(name = "SfkpgPlc", required = true)
    protected SafekeepingPlaceFormat4Choice sfkpgPlc;
    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification4Choice plcOfListg;
    @XmlElement(name = "Pldgee")
    protected PledgeeFormat2Choice pldgee;
    @XmlElement(name = "AggtBal", required = true)
    protected Balance2 aggtBal;
    @XmlElement(name = "PricDtls", required = true)
    protected List<PriceInformation7> pricDtls;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms16> fxDtls;
    @XmlElement(name = "DaysAcrd")
    protected BigDecimal daysAcrd;
    @XmlElement(name = "AcctBaseCcyAmts", required = true)
    protected BalanceAmounts5 acctBaseCcyAmts;
    @XmlElement(name = "InstrmCcyAmts")
    protected BalanceAmounts5 instrmCcyAmts;
    @XmlElement(name = "AltrnRptgCcyAmts")
    protected BalanceAmounts5 altrnRptgCcyAmts;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown25> qtyBrkdwn;
    @XmlElement(name = "XpsrTp")
    protected ExposureType13Choice xpsrTp;
    @XmlElement(name = "BalBrkdwn")
    protected List<SubBalanceInformation7> balBrkdwn;
    @XmlElement(name = "AddtlBalBrkdwn")
    protected List<AdditionalBalanceInformation7> addtlBalBrkdwn;
    @XmlElement(name = "HldgAddtlDtls")
    protected String hldgAddtlDtls;

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat4Choice }
     *     
     */
    public SafekeepingPlaceFormat4Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat4Choice }
     *     
     */
    public AggregateBalancePerSafekeepingPlace26 setSfkpgPlc(SafekeepingPlaceFormat4Choice value) {
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
    public AggregateBalancePerSafekeepingPlace26 setPlcOfListg(MarketIdentification4Choice value) {
        this.plcOfListg = value;
        return this;
    }

    /**
     * Gets the value of the pldgee property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeeFormat2Choice }
     *     
     */
    public PledgeeFormat2Choice getPldgee() {
        return pldgee;
    }

    /**
     * Sets the value of the pldgee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeeFormat2Choice }
     *     
     */
    public AggregateBalancePerSafekeepingPlace26 setPldgee(PledgeeFormat2Choice value) {
        this.pldgee = value;
        return this;
    }

    /**
     * Gets the value of the aggtBal property.
     * 
     * @return
     *     possible object is
     *     {@link Balance2 }
     *     
     */
    public Balance2 getAggtBal() {
        return aggtBal;
    }

    /**
     * Sets the value of the aggtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance2 }
     *     
     */
    public AggregateBalancePerSafekeepingPlace26 setAggtBal(Balance2 value) {
        this.aggtBal = value;
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
     * {@link PriceInformation7 }
     * 
     * 
     */
    public List<PriceInformation7> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<PriceInformation7>();
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
     * {@link ForeignExchangeTerms16 }
     * 
     * 
     */
    public List<ForeignExchangeTerms16> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<ForeignExchangeTerms16>();
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
    public AggregateBalancePerSafekeepingPlace26 setDaysAcrd(BigDecimal value) {
        this.daysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the acctBaseCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts5 }
     *     
     */
    public BalanceAmounts5 getAcctBaseCcyAmts() {
        return acctBaseCcyAmts;
    }

    /**
     * Sets the value of the acctBaseCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts5 }
     *     
     */
    public AggregateBalancePerSafekeepingPlace26 setAcctBaseCcyAmts(BalanceAmounts5 value) {
        this.acctBaseCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the instrmCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts5 }
     *     
     */
    public BalanceAmounts5 getInstrmCcyAmts() {
        return instrmCcyAmts;
    }

    /**
     * Sets the value of the instrmCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts5 }
     *     
     */
    public AggregateBalancePerSafekeepingPlace26 setInstrmCcyAmts(BalanceAmounts5 value) {
        this.instrmCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the altrnRptgCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts5 }
     *     
     */
    public BalanceAmounts5 getAltrnRptgCcyAmts() {
        return altrnRptgCcyAmts;
    }

    /**
     * Sets the value of the altrnRptgCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts5 }
     *     
     */
    public AggregateBalancePerSafekeepingPlace26 setAltrnRptgCcyAmts(BalanceAmounts5 value) {
        this.altrnRptgCcyAmts = value;
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
     * {@link QuantityBreakdown25 }
     * 
     * 
     */
    public List<QuantityBreakdown25> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<QuantityBreakdown25>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType13Choice }
     *     
     */
    public ExposureType13Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType13Choice }
     *     
     */
    public AggregateBalancePerSafekeepingPlace26 setXpsrTp(ExposureType13Choice value) {
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
     * {@link SubBalanceInformation7 }
     * 
     * 
     */
    public List<SubBalanceInformation7> getBalBrkdwn() {
        if (balBrkdwn == null) {
            balBrkdwn = new ArrayList<SubBalanceInformation7>();
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
     * {@link AdditionalBalanceInformation7 }
     * 
     * 
     */
    public List<AdditionalBalanceInformation7> getAddtlBalBrkdwn() {
        if (addtlBalBrkdwn == null) {
            addtlBalBrkdwn = new ArrayList<AdditionalBalanceInformation7>();
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
    public AggregateBalancePerSafekeepingPlace26 setHldgAddtlDtls(String value) {
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
    public AggregateBalancePerSafekeepingPlace26 addPricDtls(PriceInformation7 pricDtls) {
        getPricDtls().add(pricDtls);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public AggregateBalancePerSafekeepingPlace26 addFXDtls(ForeignExchangeTerms16 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

    /**
     * Adds a new item to the qtyBrkdwn list.
     * @see #getQtyBrkdwn()
     * 
     */
    public AggregateBalancePerSafekeepingPlace26 addQtyBrkdwn(QuantityBreakdown25 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the balBrkdwn list.
     * @see #getBalBrkdwn()
     * 
     */
    public AggregateBalancePerSafekeepingPlace26 addBalBrkdwn(SubBalanceInformation7 balBrkdwn) {
        getBalBrkdwn().add(balBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the addtlBalBrkdwn list.
     * @see #getAddtlBalBrkdwn()
     * 
     */
    public AggregateBalancePerSafekeepingPlace26 addAddtlBalBrkdwn(AdditionalBalanceInformation7 addtlBalBrkdwn) {
        getAddtlBalBrkdwn().add(addtlBalBrkdwn);
        return this;
    }

}
