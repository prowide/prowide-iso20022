
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "AggregateBalanceInformation16", propOrder = {
    "finInstrmId",
    "finInstrmAttrbts",
    "invstmtFndsFinInstrmAttrbts",
    "valtnHrcutDtls",
    "aggtBal",
    "avlblBal",
    "notAvlblBal",
    "sfkpgPlc",
    "corpActnOptnTp",
    "pricDtls",
    "fxDtls",
    "daysAcrd",
    "acctBaseCcyAmts",
    "instrmCcyAmts",
    "qtyBrkdwn",
    "balBrkdwn",
    "addtlBalBrkdwn",
    "balAtSfkpgPlc",
    "hldgAddtlDtls",
    "splmtryData"
})
public class AggregateBalanceInformation16 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes35 finInstrmAttrbts;
    @XmlElement(name = "InvstmtFndsFinInstrmAttrbts")
    protected FinancialInstrument21 invstmtFndsFinInstrmAttrbts;
    @XmlElement(name = "ValtnHrcutDtls")
    protected BasicCollateralValuation1Details valtnHrcutDtls;
    @XmlElement(name = "AggtBal", required = true)
    protected Balance1 aggtBal;
    @XmlElement(name = "AvlblBal")
    protected BalanceQuantity5Choice avlblBal;
    @XmlElement(name = "NotAvlblBal")
    protected BalanceQuantity5Choice notAvlblBal;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat3Choice sfkpgPlc;
    @XmlElement(name = "CorpActnOptnTp")
    @XmlSchemaType(name = "string")
    protected CorporateActionOption5Code corpActnOptnTp;
    @XmlElement(name = "PricDtls")
    protected List<PriceInformation5> pricDtls;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms14> fxDtls;
    @XmlElement(name = "DaysAcrd")
    protected BigDecimal daysAcrd;
    @XmlElement(name = "AcctBaseCcyAmts")
    protected BalanceAmounts3 acctBaseCcyAmts;
    @XmlElement(name = "InstrmCcyAmts")
    protected BalanceAmounts3 instrmCcyAmts;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown13> qtyBrkdwn;
    @XmlElement(name = "BalBrkdwn")
    protected List<SubBalanceInformation9> balBrkdwn;
    @XmlElement(name = "AddtlBalBrkdwn")
    protected List<AdditionalBalanceInformation9> addtlBalBrkdwn;
    @XmlElement(name = "BalAtSfkpgPlc")
    protected List<AggregateBalancePerSafekeepingPlace15> balAtSfkpgPlc;
    @XmlElement(name = "HldgAddtlDtls")
    protected String hldgAddtlDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public AggregateBalanceInformation16 setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes35 }
     *     
     */
    public FinancialInstrumentAttributes35 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes35 }
     *     
     */
    public AggregateBalanceInformation16 setFinInstrmAttrbts(FinancialInstrumentAttributes35 value) {
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
    public AggregateBalanceInformation16 setInvstmtFndsFinInstrmAttrbts(FinancialInstrument21 value) {
        this.invstmtFndsFinInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the valtnHrcutDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BasicCollateralValuation1Details }
     *     
     */
    public BasicCollateralValuation1Details getValtnHrcutDtls() {
        return valtnHrcutDtls;
    }

    /**
     * Sets the value of the valtnHrcutDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicCollateralValuation1Details }
     *     
     */
    public AggregateBalanceInformation16 setValtnHrcutDtls(BasicCollateralValuation1Details value) {
        this.valtnHrcutDtls = value;
        return this;
    }

    /**
     * Gets the value of the aggtBal property.
     * 
     * @return
     *     possible object is
     *     {@link Balance1 }
     *     
     */
    public Balance1 getAggtBal() {
        return aggtBal;
    }

    /**
     * Sets the value of the aggtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance1 }
     *     
     */
    public AggregateBalanceInformation16 setAggtBal(Balance1 value) {
        this.aggtBal = value;
        return this;
    }

    /**
     * Gets the value of the avlblBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity5Choice }
     *     
     */
    public BalanceQuantity5Choice getAvlblBal() {
        return avlblBal;
    }

    /**
     * Sets the value of the avlblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity5Choice }
     *     
     */
    public AggregateBalanceInformation16 setAvlblBal(BalanceQuantity5Choice value) {
        this.avlblBal = value;
        return this;
    }

    /**
     * Gets the value of the notAvlblBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity5Choice }
     *     
     */
    public BalanceQuantity5Choice getNotAvlblBal() {
        return notAvlblBal;
    }

    /**
     * Sets the value of the notAvlblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity5Choice }
     *     
     */
    public AggregateBalanceInformation16 setNotAvlblBal(BalanceQuantity5Choice value) {
        this.notAvlblBal = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat3Choice }
     *     
     */
    public SafekeepingPlaceFormat3Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat3Choice }
     *     
     */
    public AggregateBalanceInformation16 setSfkpgPlc(SafekeepingPlaceFormat3Choice value) {
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
    public AggregateBalanceInformation16 setCorpActnOptnTp(CorporateActionOption5Code value) {
        this.corpActnOptnTp = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricDtls property.
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
     * {@link PriceInformation5 }
     * 
     * 
     * @return
     *     The value of the pricDtls property.
     */
    public List<PriceInformation5> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<>();
        }
        return this.pricDtls;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fxDtls property.
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
     * {@link ForeignExchangeTerms14 }
     * 
     * 
     * @return
     *     The value of the fxDtls property.
     */
    public List<ForeignExchangeTerms14> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<>();
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
    public AggregateBalanceInformation16 setDaysAcrd(BigDecimal value) {
        this.daysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the acctBaseCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts3 }
     *     
     */
    public BalanceAmounts3 getAcctBaseCcyAmts() {
        return acctBaseCcyAmts;
    }

    /**
     * Sets the value of the acctBaseCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts3 }
     *     
     */
    public AggregateBalanceInformation16 setAcctBaseCcyAmts(BalanceAmounts3 value) {
        this.acctBaseCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the instrmCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts3 }
     *     
     */
    public BalanceAmounts3 getInstrmCcyAmts() {
        return instrmCcyAmts;
    }

    /**
     * Sets the value of the instrmCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts3 }
     *     
     */
    public AggregateBalanceInformation16 setInstrmCcyAmts(BalanceAmounts3 value) {
        this.instrmCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtyBrkdwn property.
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
     * {@link QuantityBreakdown13 }
     * 
     * 
     * @return
     *     The value of the qtyBrkdwn property.
     */
    public List<QuantityBreakdown13> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the balBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balBrkdwn property.
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
     * {@link SubBalanceInformation9 }
     * 
     * 
     * @return
     *     The value of the balBrkdwn property.
     */
    public List<SubBalanceInformation9> getBalBrkdwn() {
        if (balBrkdwn == null) {
            balBrkdwn = new ArrayList<>();
        }
        return this.balBrkdwn;
    }

    /**
     * Gets the value of the addtlBalBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlBalBrkdwn property.
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
     * {@link AdditionalBalanceInformation9 }
     * 
     * 
     * @return
     *     The value of the addtlBalBrkdwn property.
     */
    public List<AdditionalBalanceInformation9> getAddtlBalBrkdwn() {
        if (addtlBalBrkdwn == null) {
            addtlBalBrkdwn = new ArrayList<>();
        }
        return this.addtlBalBrkdwn;
    }

    /**
     * Gets the value of the balAtSfkpgPlc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balAtSfkpgPlc property.
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
     * {@link AggregateBalancePerSafekeepingPlace15 }
     * 
     * 
     * @return
     *     The value of the balAtSfkpgPlc property.
     */
    public List<AggregateBalancePerSafekeepingPlace15> getBalAtSfkpgPlc() {
        if (balAtSfkpgPlc == null) {
            balAtSfkpgPlc = new ArrayList<>();
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
    public AggregateBalanceInformation16 setHldgAddtlDtls(String value) {
        this.hldgAddtlDtls = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public AggregateBalanceInformation16 addPricDtls(PriceInformation5 pricDtls) {
        getPricDtls().add(pricDtls);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public AggregateBalanceInformation16 addFXDtls(ForeignExchangeTerms14 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

    /**
     * Adds a new item to the qtyBrkdwn list.
     * @see #getQtyBrkdwn()
     * 
     */
    public AggregateBalanceInformation16 addQtyBrkdwn(QuantityBreakdown13 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the balBrkdwn list.
     * @see #getBalBrkdwn()
     * 
     */
    public AggregateBalanceInformation16 addBalBrkdwn(SubBalanceInformation9 balBrkdwn) {
        getBalBrkdwn().add(balBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the addtlBalBrkdwn list.
     * @see #getAddtlBalBrkdwn()
     * 
     */
    public AggregateBalanceInformation16 addAddtlBalBrkdwn(AdditionalBalanceInformation9 addtlBalBrkdwn) {
        getAddtlBalBrkdwn().add(addtlBalBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the balAtSfkpgPlc list.
     * @see #getBalAtSfkpgPlc()
     * 
     */
    public AggregateBalanceInformation16 addBalAtSfkpgPlc(AggregateBalancePerSafekeepingPlace15 balAtSfkpgPlc) {
        getBalAtSfkpgPlc().add(balAtSfkpgPlc);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AggregateBalanceInformation16 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
