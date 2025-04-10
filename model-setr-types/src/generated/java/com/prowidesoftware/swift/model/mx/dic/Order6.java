
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Intention to transfer an ownership of a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order6", propOrder = {
    "listOrdrNb",
    "clntOrdrId",
    "scndryClntOrdrId",
    "clntOrdrLkId",
    "slctdOrdr",
    "tradDt",
    "sd",
    "sdValInd",
    "frgnXchgExctnReqdInd",
    "cshMrgn",
    "prvsClsgPric",
    "cmplcId",
    "tradgCpcty",
    "cstmrCpcty",
    "posFct",
    "derivCvrd",
    "tradRgltr",
    "tradOrgtnDt",
    "sttlmCcy",
    "clrFeeTp",
    "ordrOrgtrElgblty",
    "plcOfExctn",
    "sttlmInstrMtd",
    "ordrRstrctns",
    "qty2Dtls",
    "qty1Dtls",
    "finInstrm",
    "finInstrmAttrbts",
    "stiptns",
    "undrlygFinInstrm",
    "undrlygFinInstrmAttrbts",
    "sprdAndBchmkCrvDtls",
    "yldDtls",
    "undrlygStiptns",
    "ordrParams",
    "comssnDtls",
    "exctnInstrsDtls",
    "strtgyParamsDtls",
    "tradgSsnDtls",
    "dscrtn",
    "preAllcnDtls",
    "bookgDtls",
    "tradgPties",
    "sttlmDtls",
    "cshPties",
    "othrBizPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties",
    "amtDtls"
})
public class Order6 {

    @XmlElement(name = "ListOrdrNb", required = true)
    protected BigDecimal listOrdrNb;
    @XmlElement(name = "ClntOrdrId", required = true)
    protected String clntOrdrId;
    @XmlElement(name = "ScndryClntOrdrId")
    protected String scndryClntOrdrId;
    @XmlElement(name = "ClntOrdrLkId")
    protected String clntOrdrLkId;
    @XmlElement(name = "SlctdOrdr")
    protected boolean slctdOrdr;
    @XmlElement(name = "TradDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "Sd", required = true)
    @XmlSchemaType(name = "string")
    protected Side1Code sd;
    @XmlElement(name = "SdValInd")
    protected Boolean sdValInd;
    @XmlElement(name = "FrgnXchgExctnReqdInd")
    protected boolean frgnXchgExctnReqdInd;
    @XmlElement(name = "CshMrgn")
    @XmlSchemaType(name = "string")
    protected CashMarginOrder1Code cshMrgn;
    @XmlElement(name = "PrvsClsgPric")
    protected Price1 prvsClsgPric;
    @XmlElement(name = "CmplcId")
    protected String cmplcId;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity3Code tradgCpcty;
    @XmlElement(name = "CstmrCpcty")
    @XmlSchemaType(name = "string")
    protected CustomerOrderCapacity1Code cstmrCpcty;
    @XmlElement(name = "PosFct")
    @XmlSchemaType(name = "string")
    protected PositionEffect1Code posFct;
    @XmlElement(name = "DerivCvrd")
    protected Boolean derivCvrd;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentification23 tradRgltr;
    @XmlElement(name = "TradOrgtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradOrgtnDt;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;
    @XmlElement(name = "ClrFeeTp")
    @XmlSchemaType(name = "string")
    protected ClearingFeeType1Code clrFeeTp;
    @XmlElement(name = "OrdrOrgtrElgblty")
    @XmlSchemaType(name = "string")
    protected Eligibility1Code ordrOrgtrElgblty;
    @XmlElement(name = "PlcOfExctn")
    protected MarketIdentification1 plcOfExctn;
    @XmlElement(name = "SttlmInstrMtd", required = true)
    protected String sttlmInstrMtd;
    @XmlElement(name = "OrdrRstrctns")
    @XmlSchemaType(name = "string")
    protected List<OrderRestrictions1Code> ordrRstrctns;
    @XmlElement(name = "Qty2Dtls", required = true)
    protected OrderQuantity1 qty2Dtls;
    @XmlElement(name = "Qty1Dtls")
    protected OrderQuantity3 qty1Dtls;
    @XmlElement(name = "FinInstrm", required = true)
    protected SecurityIdentification7 finInstrm;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes1 finInstrmAttrbts;
    @XmlElement(name = "Stiptns")
    protected FinancialInstrumentStipulations stiptns;
    @XmlElement(name = "UndrlygFinInstrm")
    protected List<SecurityIdentification7> undrlygFinInstrm;
    @XmlElement(name = "UndrlygFinInstrmAttrbts")
    protected List<FinancialInstrumentAttributes1> undrlygFinInstrmAttrbts;
    @XmlElement(name = "SprdAndBchmkCrvDtls")
    protected BenchmarkCurve1 sprdAndBchmkCrvDtls;
    @XmlElement(name = "YldDtls")
    protected YieldCalculation1 yldDtls;
    @XmlElement(name = "UndrlygStiptns")
    protected List<FinancialInstrumentStipulations> undrlygStiptns;
    @XmlElement(name = "OrdrParams")
    protected OrderParameters1 ordrParams;
    @XmlElement(name = "ComssnDtls")
    protected Commission2 comssnDtls;
    @XmlElement(name = "ExctnInstrsDtls")
    protected SecuritiesExecutionInstructions1 exctnInstrsDtls;
    @XmlElement(name = "StrtgyParamsDtls")
    protected StrategyParameters1 strtgyParamsDtls;
    @XmlElement(name = "TradgSsnDtls")
    protected TradingSession1 tradgSsnDtls;
    @XmlElement(name = "Dscrtn")
    protected DiscretionInstructions1 dscrtn;
    @XmlElement(name = "PreAllcnDtls")
    protected PreAllocation1 preAllcnDtls;
    @XmlElement(name = "BookgDtls")
    protected Booking1 bookgDtls;
    @XmlElement(name = "TradgPties")
    protected List<Intermediary14> tradgPties;
    @XmlElement(name = "SttlmDtls")
    protected SecuritiesSettlement1 sttlmDtls;
    @XmlElement(name = "CshPties")
    protected CashParties1 cshPties;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties1 othrBizPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties3 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties3 dlvrgSttlmPties;
    @XmlElement(name = "AmtDtls")
    protected List<OtherAmounts1> amtDtls;

    /**
     * Gets the value of the listOrdrNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getListOrdrNb() {
        return listOrdrNb;
    }

    /**
     * Sets the value of the listOrdrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Order6 setListOrdrNb(BigDecimal value) {
        this.listOrdrNb = value;
        return this;
    }

    /**
     * Gets the value of the clntOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntOrdrId() {
        return clntOrdrId;
    }

    /**
     * Sets the value of the clntOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order6 setClntOrdrId(String value) {
        this.clntOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the scndryClntOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndryClntOrdrId() {
        return scndryClntOrdrId;
    }

    /**
     * Sets the value of the scndryClntOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order6 setScndryClntOrdrId(String value) {
        this.scndryClntOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the clntOrdrLkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntOrdrLkId() {
        return clntOrdrLkId;
    }

    /**
     * Sets the value of the clntOrdrLkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order6 setClntOrdrLkId(String value) {
        this.clntOrdrLkId = value;
        return this;
    }

    /**
     * Gets the value of the slctdOrdr property.
     * 
     */
    public boolean isSlctdOrdr() {
        return slctdOrdr;
    }

    /**
     * Sets the value of the slctdOrdr property.
     * 
     */
    public Order6 setSlctdOrdr(boolean value) {
        this.slctdOrdr = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order6 setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Side1Code }
     *     
     */
    public Side1Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side1Code }
     *     
     */
    public Order6 setSd(Side1Code value) {
        this.sd = value;
        return this;
    }

    /**
     * Gets the value of the sdValInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSdValInd() {
        return sdValInd;
    }

    /**
     * Sets the value of the sdValInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Order6 setSdValInd(Boolean value) {
        this.sdValInd = value;
        return this;
    }

    /**
     * Gets the value of the frgnXchgExctnReqdInd property.
     * 
     */
    public boolean isFrgnXchgExctnReqdInd() {
        return frgnXchgExctnReqdInd;
    }

    /**
     * Sets the value of the frgnXchgExctnReqdInd property.
     * 
     */
    public Order6 setFrgnXchgExctnReqdInd(boolean value) {
        this.frgnXchgExctnReqdInd = value;
        return this;
    }

    /**
     * Gets the value of the cshMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link CashMarginOrder1Code }
     *     
     */
    public CashMarginOrder1Code getCshMrgn() {
        return cshMrgn;
    }

    /**
     * Sets the value of the cshMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashMarginOrder1Code }
     *     
     */
    public Order6 setCshMrgn(CashMarginOrder1Code value) {
        this.cshMrgn = value;
        return this;
    }

    /**
     * Gets the value of the prvsClsgPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getPrvsClsgPric() {
        return prvsClsgPric;
    }

    /**
     * Sets the value of the prvsClsgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public Order6 setPrvsClsgPric(Price1 value) {
        this.prvsClsgPric = value;
        return this;
    }

    /**
     * Gets the value of the cmplcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmplcId() {
        return cmplcId;
    }

    /**
     * Sets the value of the cmplcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order6 setCmplcId(String value) {
        this.cmplcId = value;
        return this;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity3Code }
     *     
     */
    public TradingCapacity3Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity3Code }
     *     
     */
    public Order6 setTradgCpcty(TradingCapacity3Code value) {
        this.tradgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the cstmrCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderCapacity1Code }
     *     
     */
    public CustomerOrderCapacity1Code getCstmrCpcty() {
        return cstmrCpcty;
    }

    /**
     * Sets the value of the cstmrCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderCapacity1Code }
     *     
     */
    public Order6 setCstmrCpcty(CustomerOrderCapacity1Code value) {
        this.cstmrCpcty = value;
        return this;
    }

    /**
     * Gets the value of the posFct property.
     * 
     * @return
     *     possible object is
     *     {@link PositionEffect1Code }
     *     
     */
    public PositionEffect1Code getPosFct() {
        return posFct;
    }

    /**
     * Sets the value of the posFct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionEffect1Code }
     *     
     */
    public Order6 setPosFct(PositionEffect1Code value) {
        this.posFct = value;
        return this;
    }

    /**
     * Gets the value of the derivCvrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDerivCvrd() {
        return derivCvrd;
    }

    /**
     * Sets the value of the derivCvrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Order6 setDerivCvrd(Boolean value) {
        this.derivCvrd = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification23 }
     *     
     */
    public PartyIdentification23 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification23 }
     *     
     */
    public Order6 setTradRgltr(PartyIdentification23 value) {
        this.tradRgltr = value;
        return this;
    }

    /**
     * Gets the value of the tradOrgtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTradOrgtnDt() {
        return tradOrgtnDt;
    }

    /**
     * Sets the value of the tradOrgtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order6 setTradOrgtnDt(XMLGregorianCalendar value) {
        this.tradOrgtnDt = value;
        return this;
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
    public Order6 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the clrFeeTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingFeeType1Code }
     *     
     */
    public ClearingFeeType1Code getClrFeeTp() {
        return clrFeeTp;
    }

    /**
     * Sets the value of the clrFeeTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingFeeType1Code }
     *     
     */
    public Order6 setClrFeeTp(ClearingFeeType1Code value) {
        this.clrFeeTp = value;
        return this;
    }

    /**
     * Gets the value of the ordrOrgtrElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link Eligibility1Code }
     *     
     */
    public Eligibility1Code getOrdrOrgtrElgblty() {
        return ordrOrgtrElgblty;
    }

    /**
     * Sets the value of the ordrOrgtrElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligibility1Code }
     *     
     */
    public Order6 setOrdrOrgtrElgblty(Eligibility1Code value) {
        this.ordrOrgtrElgblty = value;
        return this;
    }

    /**
     * Gets the value of the plcOfExctn property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification1 }
     *     
     */
    public MarketIdentification1 getPlcOfExctn() {
        return plcOfExctn;
    }

    /**
     * Sets the value of the plcOfExctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification1 }
     *     
     */
    public Order6 setPlcOfExctn(MarketIdentification1 value) {
        this.plcOfExctn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmInstrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmInstrMtd() {
        return sttlmInstrMtd;
    }

    /**
     * Sets the value of the sttlmInstrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order6 setSttlmInstrMtd(String value) {
        this.sttlmInstrMtd = value;
        return this;
    }

    /**
     * Gets the value of the ordrRstrctns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordrRstrctns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrRstrctns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderRestrictions1Code }
     * 
     * 
     */
    public List<OrderRestrictions1Code> getOrdrRstrctns() {
        if (ordrRstrctns == null) {
            ordrRstrctns = new ArrayList<OrderRestrictions1Code>();
        }
        return this.ordrRstrctns;
    }

    /**
     * Gets the value of the qty2Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity1 }
     *     
     */
    public OrderQuantity1 getQty2Dtls() {
        return qty2Dtls;
    }

    /**
     * Sets the value of the qty2Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity1 }
     *     
     */
    public Order6 setQty2Dtls(OrderQuantity1 value) {
        this.qty2Dtls = value;
        return this;
    }

    /**
     * Gets the value of the qty1Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity3 }
     *     
     */
    public OrderQuantity3 getQty1Dtls() {
        return qty1Dtls;
    }

    /**
     * Sets the value of the qty1Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity3 }
     *     
     */
    public Order6 setQty1Dtls(OrderQuantity3 value) {
        this.qty1Dtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getFinInstrm() {
        return finInstrm;
    }

    /**
     * Sets the value of the finInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public Order6 setFinInstrm(SecurityIdentification7 value) {
        this.finInstrm = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public FinancialInstrumentAttributes1 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public Order6 setFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the stiptns property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentStipulations }
     *     
     */
    public FinancialInstrumentStipulations getStiptns() {
        return stiptns;
    }

    /**
     * Sets the value of the stiptns property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentStipulations }
     *     
     */
    public Order6 setStiptns(FinancialInstrumentStipulations value) {
        this.stiptns = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygFinInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification7 }
     * 
     * 
     */
    public List<SecurityIdentification7> getUndrlygFinInstrm() {
        if (undrlygFinInstrm == null) {
            undrlygFinInstrm = new ArrayList<SecurityIdentification7>();
        }
        return this.undrlygFinInstrm;
    }

    /**
     * Gets the value of the undrlygFinInstrmAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygFinInstrmAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrmAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributes1 }
     * 
     * 
     */
    public List<FinancialInstrumentAttributes1> getUndrlygFinInstrmAttrbts() {
        if (undrlygFinInstrmAttrbts == null) {
            undrlygFinInstrmAttrbts = new ArrayList<FinancialInstrumentAttributes1>();
        }
        return this.undrlygFinInstrmAttrbts;
    }

    /**
     * Gets the value of the sprdAndBchmkCrvDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurve1 }
     *     
     */
    public BenchmarkCurve1 getSprdAndBchmkCrvDtls() {
        return sprdAndBchmkCrvDtls;
    }

    /**
     * Sets the value of the sprdAndBchmkCrvDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurve1 }
     *     
     */
    public Order6 setSprdAndBchmkCrvDtls(BenchmarkCurve1 value) {
        this.sprdAndBchmkCrvDtls = value;
        return this;
    }

    /**
     * Gets the value of the yldDtls property.
     * 
     * @return
     *     possible object is
     *     {@link YieldCalculation1 }
     *     
     */
    public YieldCalculation1 getYldDtls() {
        return yldDtls;
    }

    /**
     * Sets the value of the yldDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldCalculation1 }
     *     
     */
    public Order6 setYldDtls(YieldCalculation1 value) {
        this.yldDtls = value;
        return this;
    }

    /**
     * Gets the value of the undrlygStiptns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygStiptns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygStiptns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentStipulations }
     * 
     * 
     */
    public List<FinancialInstrumentStipulations> getUndrlygStiptns() {
        if (undrlygStiptns == null) {
            undrlygStiptns = new ArrayList<FinancialInstrumentStipulations>();
        }
        return this.undrlygStiptns;
    }

    /**
     * Gets the value of the ordrParams property.
     * 
     * @return
     *     possible object is
     *     {@link OrderParameters1 }
     *     
     */
    public OrderParameters1 getOrdrParams() {
        return ordrParams;
    }

    /**
     * Sets the value of the ordrParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderParameters1 }
     *     
     */
    public Order6 setOrdrParams(OrderParameters1 value) {
        this.ordrParams = value;
        return this;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Commission2 }
     *     
     */
    public Commission2 getComssnDtls() {
        return comssnDtls;
    }

    /**
     * Sets the value of the comssnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission2 }
     *     
     */
    public Order6 setComssnDtls(Commission2 value) {
        this.comssnDtls = value;
        return this;
    }

    /**
     * Gets the value of the exctnInstrsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesExecutionInstructions1 }
     *     
     */
    public SecuritiesExecutionInstructions1 getExctnInstrsDtls() {
        return exctnInstrsDtls;
    }

    /**
     * Sets the value of the exctnInstrsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesExecutionInstructions1 }
     *     
     */
    public Order6 setExctnInstrsDtls(SecuritiesExecutionInstructions1 value) {
        this.exctnInstrsDtls = value;
        return this;
    }

    /**
     * Gets the value of the strtgyParamsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyParameters1 }
     *     
     */
    public StrategyParameters1 getStrtgyParamsDtls() {
        return strtgyParamsDtls;
    }

    /**
     * Sets the value of the strtgyParamsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyParameters1 }
     *     
     */
    public Order6 setStrtgyParamsDtls(StrategyParameters1 value) {
        this.strtgyParamsDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradgSsnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradingSession1 }
     *     
     */
    public TradingSession1 getTradgSsnDtls() {
        return tradgSsnDtls;
    }

    /**
     * Sets the value of the tradgSsnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingSession1 }
     *     
     */
    public Order6 setTradgSsnDtls(TradingSession1 value) {
        this.tradgSsnDtls = value;
        return this;
    }

    /**
     * Gets the value of the dscrtn property.
     * 
     * @return
     *     possible object is
     *     {@link DiscretionInstructions1 }
     *     
     */
    public DiscretionInstructions1 getDscrtn() {
        return dscrtn;
    }

    /**
     * Sets the value of the dscrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscretionInstructions1 }
     *     
     */
    public Order6 setDscrtn(DiscretionInstructions1 value) {
        this.dscrtn = value;
        return this;
    }

    /**
     * Gets the value of the preAllcnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PreAllocation1 }
     *     
     */
    public PreAllocation1 getPreAllcnDtls() {
        return preAllcnDtls;
    }

    /**
     * Sets the value of the preAllcnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreAllocation1 }
     *     
     */
    public Order6 setPreAllcnDtls(PreAllocation1 value) {
        this.preAllcnDtls = value;
        return this;
    }

    /**
     * Gets the value of the bookgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Booking1 }
     *     
     */
    public Booking1 getBookgDtls() {
        return bookgDtls;
    }

    /**
     * Sets the value of the bookgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking1 }
     *     
     */
    public Order6 setBookgDtls(Booking1 value) {
        this.bookgDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradgPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradgPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary14 }
     * 
     * 
     */
    public List<Intermediary14> getTradgPties() {
        if (tradgPties == null) {
            tradgPties = new ArrayList<Intermediary14>();
        }
        return this.tradgPties;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlement1 }
     *     
     */
    public SecuritiesSettlement1 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlement1 }
     *     
     */
    public Order6 setSttlmDtls(SecuritiesSettlement1 value) {
        this.sttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties1 }
     *     
     */
    public CashParties1 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties1 }
     *     
     */
    public Order6 setCshPties(CashParties1 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties1 }
     *     
     */
    public OtherParties1 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties1 }
     *     
     */
    public Order6 setOthrBizPties(OtherParties1 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public Order6 setRcvgSttlmPties(SettlementParties3 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public Order6 setDlvrgSttlmPties(SettlementParties3 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmounts1 }
     * 
     * 
     */
    public List<OtherAmounts1> getAmtDtls() {
        if (amtDtls == null) {
            amtDtls = new ArrayList<OtherAmounts1>();
        }
        return this.amtDtls;
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
     * Adds a new item to the ordrRstrctns list.
     * @see #getOrdrRstrctns()
     * 
     */
    public Order6 addOrdrRstrctns(OrderRestrictions1Code ordrRstrctns) {
        getOrdrRstrctns().add(ordrRstrctns);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrm list.
     * @see #getUndrlygFinInstrm()
     * 
     */
    public Order6 addUndrlygFinInstrm(SecurityIdentification7 undrlygFinInstrm) {
        getUndrlygFinInstrm().add(undrlygFinInstrm);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmAttrbts list.
     * @see #getUndrlygFinInstrmAttrbts()
     * 
     */
    public Order6 addUndrlygFinInstrmAttrbts(FinancialInstrumentAttributes1 undrlygFinInstrmAttrbts) {
        getUndrlygFinInstrmAttrbts().add(undrlygFinInstrmAttrbts);
        return this;
    }

    /**
     * Adds a new item to the undrlygStiptns list.
     * @see #getUndrlygStiptns()
     * 
     */
    public Order6 addUndrlygStiptns(FinancialInstrumentStipulations undrlygStiptns) {
        getUndrlygStiptns().add(undrlygStiptns);
        return this;
    }

    /**
     * Adds a new item to the tradgPties list.
     * @see #getTradgPties()
     * 
     */
    public Order6 addTradgPties(Intermediary14 tradgPties) {
        getTradgPties().add(tradgPties);
        return this;
    }

    /**
     * Adds a new item to the amtDtls list.
     * @see #getAmtDtls()
     * 
     */
    public Order6 addAmtDtls(OtherAmounts1 amtDtls) {
        getAmtDtls().add(amtDtls);
        return this;
    }

}
