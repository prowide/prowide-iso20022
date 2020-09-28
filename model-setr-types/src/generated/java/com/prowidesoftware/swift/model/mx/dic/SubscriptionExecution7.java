
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Execution of a subscription order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionExecution7", propOrder = {
    "mstrRef",
    "ordrRef",
    "clntRef",
    "dealRef",
    "reqdTradDt",
    "hdgFndOrdrTp",
    "invstmtAcctDtls",
    "bnfcryDtls",
    "finInstrmDtls",
    "ordrdAmt",
    "exctdAmt",
    "unitsNb",
    "dealgPricDtls",
    "inftvPricDtls",
    "sdPcktDtls",
    "tradDtTm",
    "navDt",
    "cshSttlmDt",
    "reqdSttlmCcy",
    "pmtRef",
    "lttrInttRef",
    "frgnXchgDtls",
    "ttlChrgs",
    "taxGnlDtls",
    "equlstn",
    "intrmPrftAmt",
    "rfnd",
    "sbcptIntrst",
    "prtlyExctdInd",
    "prtlSttlmOfUnits",
    "prtlSttlmOfCsh",
    "rltdPtyDtls"
})
public class SubscriptionExecution7 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "DealRef", required = true)
    protected String dealRef;
    @XmlElement(name = "ReqdTradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdTradDt;
    @XmlElement(name = "HdgFndOrdrTp")
    @XmlSchemaType(name = "string")
    protected List<HedgeFundOrderType1Code> hdgFndOrdrTp;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount30 invstmtAcctDtls;
    @XmlElement(name = "BnfcryDtls")
    protected BeneficiaryInformation2 bnfcryDtls;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument18 finInstrmDtls;
    @XmlElement(name = "OrdrdAmt")
    protected ActiveCurrencyAndAmount ordrdAmt;
    @XmlElement(name = "ExctdAmt", required = true)
    protected ActiveCurrencyAndAmount exctdAmt;
    @XmlElement(name = "UnitsNb")
    protected FinancialInstrumentQuantity1 unitsNb;
    @XmlElement(name = "DealgPricDtls")
    protected UnitPrice16 dealgPricDtls;
    @XmlElement(name = "InftvPricDtls")
    protected List<UnitPrice16> inftvPricDtls;
    @XmlElement(name = "SdPcktDtls")
    protected SidePocketInformation2 sdPcktDtls;
    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "NAVDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar navDt;
    @XmlElement(name = "CshSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "ReqdSttlmCcy")
    protected String reqdSttlmCcy;
    @XmlElement(name = "PmtRef")
    protected String pmtRef;
    @XmlElement(name = "LttrInttRef")
    protected String lttrInttRef;
    @XmlElement(name = "FrgnXchgDtls")
    protected List<ForeignExchangeTerms7> frgnXchgDtls;
    @XmlElement(name = "TtlChrgs")
    protected TotalCharges4 ttlChrgs;
    @XmlElement(name = "TaxGnlDtls")
    protected TotalTaxes4 taxGnlDtls;
    @XmlElement(name = "Equlstn")
    protected Equalisation2 equlstn;
    @XmlElement(name = "IntrmPrftAmt")
    protected ProfitAndLoss1Choice intrmPrftAmt;
    @XmlElement(name = "Rfnd")
    protected ActiveCurrencyAndAmount rfnd;
    @XmlElement(name = "SbcptIntrst")
    protected ActiveCurrencyAndAmount sbcptIntrst;
    @XmlElement(name = "PrtlyExctdInd")
    protected Boolean prtlyExctdInd;
    @XmlElement(name = "PrtlSttlmOfUnits")
    protected BigDecimal prtlSttlmOfUnits;
    @XmlElement(name = "PrtlSttlmOfCsh")
    protected BigDecimal prtlSttlmOfCsh;
    @XmlElement(name = "RltdPtyDtls")
    protected List<Intermediary16> rltdPtyDtls;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionExecution7 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionExecution7 setOrdrRef(String value) {
        this.ordrRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionExecution7 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the dealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Sets the value of the dealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionExecution7 setDealRef(String value) {
        this.dealRef = value;
        return this;
    }

    /**
     * Gets the value of the reqdTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdTradDt() {
        return reqdTradDt;
    }

    /**
     * Sets the value of the reqdTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SubscriptionExecution7 setReqdTradDt(XMLGregorianCalendar value) {
        this.reqdTradDt = value;
        return this;
    }

    /**
     * Gets the value of the hdgFndOrdrTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hdgFndOrdrTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHdgFndOrdrTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HedgeFundOrderType1Code }
     * 
     * 
     */
    public List<HedgeFundOrderType1Code> getHdgFndOrdrTp() {
        if (hdgFndOrdrTp == null) {
            hdgFndOrdrTp = new ArrayList<HedgeFundOrderType1Code>();
        }
        return this.hdgFndOrdrTp;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount30 }
     *     
     */
    public InvestmentAccount30 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount30 }
     *     
     */
    public SubscriptionExecution7 setInvstmtAcctDtls(InvestmentAccount30 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryInformation2 }
     *     
     */
    public BeneficiaryInformation2 getBnfcryDtls() {
        return bnfcryDtls;
    }

    /**
     * Sets the value of the bnfcryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryInformation2 }
     *     
     */
    public SubscriptionExecution7 setBnfcryDtls(BeneficiaryInformation2 value) {
        this.bnfcryDtls = value;
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
    public SubscriptionExecution7 setFinInstrmDtls(FinancialInstrument18 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the ordrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOrdrdAmt() {
        return ordrdAmt;
    }

    /**
     * Sets the value of the ordrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SubscriptionExecution7 setOrdrdAmt(ActiveCurrencyAndAmount value) {
        this.ordrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the exctdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getExctdAmt() {
        return exctdAmt;
    }

    /**
     * Sets the value of the exctdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SubscriptionExecution7 setExctdAmt(ActiveCurrencyAndAmount value) {
        this.exctdAmt = value;
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
    public SubscriptionExecution7 setUnitsNb(FinancialInstrumentQuantity1 value) {
        this.unitsNb = value;
        return this;
    }

    /**
     * Gets the value of the dealgPricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice16 }
     *     
     */
    public UnitPrice16 getDealgPricDtls() {
        return dealgPricDtls;
    }

    /**
     * Sets the value of the dealgPricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice16 }
     *     
     */
    public SubscriptionExecution7 setDealgPricDtls(UnitPrice16 value) {
        this.dealgPricDtls = value;
        return this;
    }

    /**
     * Gets the value of the inftvPricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inftvPricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInftvPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitPrice16 }
     * 
     * 
     */
    public List<UnitPrice16> getInftvPricDtls() {
        if (inftvPricDtls == null) {
            inftvPricDtls = new ArrayList<UnitPrice16>();
        }
        return this.inftvPricDtls;
    }

    /**
     * Gets the value of the sdPcktDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SidePocketInformation2 }
     *     
     */
    public SidePocketInformation2 getSdPcktDtls() {
        return sdPcktDtls;
    }

    /**
     * Sets the value of the sdPcktDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SidePocketInformation2 }
     *     
     */
    public SubscriptionExecution7 setSdPcktDtls(SidePocketInformation2 value) {
        this.sdPcktDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDtTm() {
        return tradDtTm;
    }

    /**
     * Sets the value of the tradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public SubscriptionExecution7 setTradDtTm(DateAndDateTimeChoice value) {
        this.tradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the navDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNAVDt() {
        return navDt;
    }

    /**
     * Sets the value of the navDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SubscriptionExecution7 setNAVDt(XMLGregorianCalendar value) {
        this.navDt = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SubscriptionExecution7 setCshSttlmDt(XMLGregorianCalendar value) {
        this.cshSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the reqdSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdSttlmCcy() {
        return reqdSttlmCcy;
    }

    /**
     * Sets the value of the reqdSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionExecution7 setReqdSttlmCcy(String value) {
        this.reqdSttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the pmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRef() {
        return pmtRef;
    }

    /**
     * Sets the value of the pmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionExecution7 setPmtRef(String value) {
        this.pmtRef = value;
        return this;
    }

    /**
     * Gets the value of the lttrInttRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLttrInttRef() {
        return lttrInttRef;
    }

    /**
     * Sets the value of the lttrInttRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionExecution7 setLttrInttRef(String value) {
        this.lttrInttRef = value;
        return this;
    }

    /**
     * Gets the value of the frgnXchgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frgnXchgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrgnXchgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms7 }
     * 
     * 
     */
    public List<ForeignExchangeTerms7> getFrgnXchgDtls() {
        if (frgnXchgDtls == null) {
            frgnXchgDtls = new ArrayList<ForeignExchangeTerms7>();
        }
        return this.frgnXchgDtls;
    }

    /**
     * Gets the value of the ttlChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCharges4 }
     *     
     */
    public TotalCharges4 getTtlChrgs() {
        return ttlChrgs;
    }

    /**
     * Sets the value of the ttlChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCharges4 }
     *     
     */
    public SubscriptionExecution7 setTtlChrgs(TotalCharges4 value) {
        this.ttlChrgs = value;
        return this;
    }

    /**
     * Gets the value of the taxGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TotalTaxes4 }
     *     
     */
    public TotalTaxes4 getTaxGnlDtls() {
        return taxGnlDtls;
    }

    /**
     * Sets the value of the taxGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTaxes4 }
     *     
     */
    public SubscriptionExecution7 setTaxGnlDtls(TotalTaxes4 value) {
        this.taxGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the equlstn property.
     * 
     * @return
     *     possible object is
     *     {@link Equalisation2 }
     *     
     */
    public Equalisation2 getEqulstn() {
        return equlstn;
    }

    /**
     * Sets the value of the equlstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equalisation2 }
     *     
     */
    public SubscriptionExecution7 setEqulstn(Equalisation2 value) {
        this.equlstn = value;
        return this;
    }

    /**
     * Gets the value of the intrmPrftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ProfitAndLoss1Choice }
     *     
     */
    public ProfitAndLoss1Choice getIntrmPrftAmt() {
        return intrmPrftAmt;
    }

    /**
     * Sets the value of the intrmPrftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfitAndLoss1Choice }
     *     
     */
    public SubscriptionExecution7 setIntrmPrftAmt(ProfitAndLoss1Choice value) {
        this.intrmPrftAmt = value;
        return this;
    }

    /**
     * Gets the value of the rfnd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRfnd() {
        return rfnd;
    }

    /**
     * Sets the value of the rfnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SubscriptionExecution7 setRfnd(ActiveCurrencyAndAmount value) {
        this.rfnd = value;
        return this;
    }

    /**
     * Gets the value of the sbcptIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSbcptIntrst() {
        return sbcptIntrst;
    }

    /**
     * Sets the value of the sbcptIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SubscriptionExecution7 setSbcptIntrst(ActiveCurrencyAndAmount value) {
        this.sbcptIntrst = value;
        return this;
    }

    /**
     * Gets the value of the prtlyExctdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlyExctdInd() {
        return prtlyExctdInd;
    }

    /**
     * Sets the value of the prtlyExctdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SubscriptionExecution7 setPrtlyExctdInd(Boolean value) {
        this.prtlyExctdInd = value;
        return this;
    }

    /**
     * Gets the value of the prtlSttlmOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrtlSttlmOfUnits() {
        return prtlSttlmOfUnits;
    }

    /**
     * Sets the value of the prtlSttlmOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SubscriptionExecution7 setPrtlSttlmOfUnits(BigDecimal value) {
        this.prtlSttlmOfUnits = value;
        return this;
    }

    /**
     * Gets the value of the prtlSttlmOfCsh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrtlSttlmOfCsh() {
        return prtlSttlmOfCsh;
    }

    /**
     * Sets the value of the prtlSttlmOfCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SubscriptionExecution7 setPrtlSttlmOfCsh(BigDecimal value) {
        this.prtlSttlmOfCsh = value;
        return this;
    }

    /**
     * Gets the value of the rltdPtyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdPtyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdPtyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary16 }
     * 
     * 
     */
    public List<Intermediary16> getRltdPtyDtls() {
        if (rltdPtyDtls == null) {
            rltdPtyDtls = new ArrayList<Intermediary16>();
        }
        return this.rltdPtyDtls;
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
     * Adds a new item to the hdgFndOrdrTp list.
     * @see #getHdgFndOrdrTp()
     * 
     */
    public SubscriptionExecution7 addHdgFndOrdrTp(HedgeFundOrderType1Code hdgFndOrdrTp) {
        getHdgFndOrdrTp().add(hdgFndOrdrTp);
        return this;
    }

    /**
     * Adds a new item to the inftvPricDtls list.
     * @see #getInftvPricDtls()
     * 
     */
    public SubscriptionExecution7 addInftvPricDtls(UnitPrice16 inftvPricDtls) {
        getInftvPricDtls().add(inftvPricDtls);
        return this;
    }

    /**
     * Adds a new item to the frgnXchgDtls list.
     * @see #getFrgnXchgDtls()
     * 
     */
    public SubscriptionExecution7 addFrgnXchgDtls(ForeignExchangeTerms7 frgnXchgDtls) {
        getFrgnXchgDtls().add(frgnXchgDtls);
        return this;
    }

    /**
     * Adds a new item to the rltdPtyDtls list.
     * @see #getRltdPtyDtls()
     * 
     */
    public SubscriptionExecution7 addRltdPtyDtls(Intermediary16 rltdPtyDtls) {
        getRltdPtyDtls().add(rltdPtyDtls);
        return this;
    }

}
