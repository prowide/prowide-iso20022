
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Overall position, in a single security, held in a securities account at a specified place of safekeeping.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateBalanceInformation37", propOrder = {
    "finInstrmId",
    "finInstrmAttrbts",
    "invstmtFndsFinInstrmAttrbts",
    "addtlDerivAttrbts",
    "aggtBal",
    "sfkpgPlc",
    "corpActnOptnTp",
    "pricDtls",
    "fxDtls",
    "daysAcrd",
    "acctBaseCcyAmts",
    "instrmCcyAmts",
    "altrnRptgCcyAmts",
    "qtyBrkdwn",
    "balBrkdwn",
    "addtlBalBrkdwn",
    "balAtSfkpgPlc",
    "hldgAddtlDtls",
    "splmtryData"
})
public class AggregateBalanceInformation37 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes91 finInstrmAttrbts;
    @XmlElement(name = "InvstmtFndsFinInstrmAttrbts")
    protected FinancialInstrument21 invstmtFndsFinInstrmAttrbts;
    @XmlElement(name = "AddtlDerivAttrbts")
    protected DerivativeBasicAttributes1 addtlDerivAttrbts;
    @XmlElement(name = "AggtBal", required = true)
    protected Balance6 aggtBal;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace3 sfkpgPlc;
    @XmlElement(name = "CorpActnOptnTp")
    @XmlSchemaType(name = "string")
    protected CorporateActionOption5Code corpActnOptnTp;
    @XmlElement(name = "PricDtls", required = true)
    protected List<PriceInformation20> pricDtls;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms34> fxDtls;
    @XmlElement(name = "DaysAcrd")
    protected BigDecimal daysAcrd;
    @XmlElement(name = "AcctBaseCcyAmts", required = true)
    protected BalanceAmounts1 acctBaseCcyAmts;
    @XmlElement(name = "InstrmCcyAmts")
    protected BalanceAmounts1 instrmCcyAmts;
    @XmlElement(name = "AltrnRptgCcyAmts")
    protected BalanceAmounts1 altrnRptgCcyAmts;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown53> qtyBrkdwn;
    @XmlElement(name = "BalBrkdwn")
    protected List<SubBalanceInformation14> balBrkdwn;
    @XmlElement(name = "AddtlBalBrkdwn")
    protected List<AdditionalBalanceInformation14> addtlBalBrkdwn;
    @XmlElement(name = "BalAtSfkpgPlc")
    protected List<AggregateBalancePerSafekeepingPlace34> balAtSfkpgPlc;
    @XmlElement(name = "HldgAddtlDtls")
    protected String hldgAddtlDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public AggregateBalanceInformation37 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes91 }
     *     
     */
    public FinancialInstrumentAttributes91 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes91 }
     *     
     */
    public AggregateBalanceInformation37 setFinInstrmAttrbts(FinancialInstrumentAttributes91 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the invstmtFndsFinInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument21 }
     *     
     */
    public FinancialInstrument21 getInvstmtFndsFinInstrmAttrbts() {
        return invstmtFndsFinInstrmAttrbts;
    }

    /**
     * Sets the value of the invstmtFndsFinInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument21 }
     *     
     */
    public AggregateBalanceInformation37 setInvstmtFndsFinInstrmAttrbts(FinancialInstrument21 value) {
        this.invstmtFndsFinInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the addtlDerivAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeBasicAttributes1 }
     *     
     */
    public DerivativeBasicAttributes1 getAddtlDerivAttrbts() {
        return addtlDerivAttrbts;
    }

    /**
     * Sets the value of the addtlDerivAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeBasicAttributes1 }
     *     
     */
    public AggregateBalanceInformation37 setAddtlDerivAttrbts(DerivativeBasicAttributes1 value) {
        this.addtlDerivAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the aggtBal property.
     * 
     * @return
     *     possible object is
     *     {@link Balance6 }
     *     
     */
    public Balance6 getAggtBal() {
        return aggtBal;
    }

    /**
     * Sets the value of the aggtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance6 }
     *     
     */
    public AggregateBalanceInformation37 setAggtBal(Balance6 value) {
        this.aggtBal = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public SafeKeepingPlace3 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public AggregateBalanceInformation37 setSfkpgPlc(SafeKeepingPlace3 value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the corpActnOptnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption5Code }
     *     
     */
    public CorporateActionOption5Code getCorpActnOptnTp() {
        return corpActnOptnTp;
    }

    /**
     * Sets the value of the corpActnOptnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption5Code }
     *     
     */
    public AggregateBalanceInformation37 setCorpActnOptnTp(CorporateActionOption5Code value) {
        this.corpActnOptnTp = value;
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
     * {@link PriceInformation20 }
     * 
     * 
     */
    public List<PriceInformation20> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<PriceInformation20>();
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
     * {@link ForeignExchangeTerms34 }
     * 
     * 
     */
    public List<ForeignExchangeTerms34> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<ForeignExchangeTerms34>();
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
    public AggregateBalanceInformation37 setDaysAcrd(BigDecimal value) {
        this.daysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the acctBaseCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts1 }
     *     
     */
    public BalanceAmounts1 getAcctBaseCcyAmts() {
        return acctBaseCcyAmts;
    }

    /**
     * Sets the value of the acctBaseCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts1 }
     *     
     */
    public AggregateBalanceInformation37 setAcctBaseCcyAmts(BalanceAmounts1 value) {
        this.acctBaseCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the instrmCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts1 }
     *     
     */
    public BalanceAmounts1 getInstrmCcyAmts() {
        return instrmCcyAmts;
    }

    /**
     * Sets the value of the instrmCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts1 }
     *     
     */
    public AggregateBalanceInformation37 setInstrmCcyAmts(BalanceAmounts1 value) {
        this.instrmCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the altrnRptgCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts1 }
     *     
     */
    public BalanceAmounts1 getAltrnRptgCcyAmts() {
        return altrnRptgCcyAmts;
    }

    /**
     * Sets the value of the altrnRptgCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts1 }
     *     
     */
    public AggregateBalanceInformation37 setAltrnRptgCcyAmts(BalanceAmounts1 value) {
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
     * {@link QuantityBreakdown53 }
     * 
     * 
     */
    public List<QuantityBreakdown53> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<QuantityBreakdown53>();
        }
        return this.qtyBrkdwn;
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
     * {@link SubBalanceInformation14 }
     * 
     * 
     */
    public List<SubBalanceInformation14> getBalBrkdwn() {
        if (balBrkdwn == null) {
            balBrkdwn = new ArrayList<SubBalanceInformation14>();
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
     * {@link AdditionalBalanceInformation14 }
     * 
     * 
     */
    public List<AdditionalBalanceInformation14> getAddtlBalBrkdwn() {
        if (addtlBalBrkdwn == null) {
            addtlBalBrkdwn = new ArrayList<AdditionalBalanceInformation14>();
        }
        return this.addtlBalBrkdwn;
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
     * {@link AggregateBalancePerSafekeepingPlace34 }
     * 
     * 
     */
    public List<AggregateBalancePerSafekeepingPlace34> getBalAtSfkpgPlc() {
        if (balAtSfkpgPlc == null) {
            balAtSfkpgPlc = new ArrayList<AggregateBalancePerSafekeepingPlace34>();
        }
        return this.balAtSfkpgPlc;
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
    public AggregateBalanceInformation37 setHldgAddtlDtls(String value) {
        this.hldgAddtlDtls = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
    public AggregateBalanceInformation37 addPricDtls(PriceInformation20 pricDtls) {
        getPricDtls().add(pricDtls);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public AggregateBalanceInformation37 addFXDtls(ForeignExchangeTerms34 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

    /**
     * Adds a new item to the qtyBrkdwn list.
     * @see #getQtyBrkdwn()
     * 
     */
    public AggregateBalanceInformation37 addQtyBrkdwn(QuantityBreakdown53 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the balBrkdwn list.
     * @see #getBalBrkdwn()
     * 
     */
    public AggregateBalanceInformation37 addBalBrkdwn(SubBalanceInformation14 balBrkdwn) {
        getBalBrkdwn().add(balBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the addtlBalBrkdwn list.
     * @see #getAddtlBalBrkdwn()
     * 
     */
    public AggregateBalanceInformation37 addAddtlBalBrkdwn(AdditionalBalanceInformation14 addtlBalBrkdwn) {
        getAddtlBalBrkdwn().add(addtlBalBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the balAtSfkpgPlc list.
     * @see #getBalAtSfkpgPlc()
     * 
     */
    public AggregateBalanceInformation37 addBalAtSfkpgPlc(AggregateBalancePerSafekeepingPlace34 balAtSfkpgPlc) {
        getBalAtSfkpgPlc().add(balAtSfkpgPlc);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AggregateBalanceInformation37 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
