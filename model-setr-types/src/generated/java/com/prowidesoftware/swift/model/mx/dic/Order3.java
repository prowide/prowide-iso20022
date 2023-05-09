
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "Order3", propOrder = {
    "clntOrdrId",
    "scndryClntOrdrId",
    "clntOrdrLkId",
    "cshMrgn",
    "sd",
    "slctdOrdrInd",
    "tradOrgtnDt",
    "cmplcId",
    "tradgCpcty",
    "cstmrCpcty",
    "posFct",
    "derivCvrd",
    "tradDt",
    "tradgSsnDtls",
    "tradRgltr",
    "frgnXchgExctnReqdInd",
    "sttlmCcy",
    "clrFeeTp",
    "ordrOrgtrElgblty",
    "plcOfExctn",
    "finInstrm",
    "finInstrmAttrbts",
    "stiptns",
    "undrlygFinInstrm",
    "undrlygFinInstrmAttrbts",
    "undrlygStiptns",
    "qtyDtls",
    "exctnInstrsDtls",
    "strtgyParamsDtls",
    "preAllcnDtls",
    "comssnDtls",
    "bookgDtls",
    "tradgPties",
    "cshPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties",
    "othrBizPties",
    "amtsDtls"
})
public class Order3 {

    @XmlElement(name = "ClntOrdrId", required = true)
    protected String clntOrdrId;
    @XmlElement(name = "ScndryClntOrdrId")
    protected String scndryClntOrdrId;
    @XmlElement(name = "ClntOrdrLkId")
    protected String clntOrdrLkId;
    @XmlElement(name = "CshMrgn")
    @XmlSchemaType(name = "string")
    protected CashMarginOrder1Code cshMrgn;
    @XmlElement(name = "Sd", required = true)
    @XmlSchemaType(name = "string")
    protected Side1Code sd;
    @XmlElement(name = "SlctdOrdrInd")
    protected boolean slctdOrdrInd;
    @XmlElement(name = "TradOrgtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tradOrgtnDt;
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
    @XmlElement(name = "TradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tradDt;
    @XmlElement(name = "TradgSsnDtls")
    protected TradingSession1 tradgSsnDtls;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentification23 tradRgltr;
    @XmlElement(name = "FrgnXchgExctnReqdInd")
    protected boolean frgnXchgExctnReqdInd;
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
    @XmlElement(name = "UndrlygStiptns")
    protected List<FinancialInstrumentStipulations> undrlygStiptns;
    @XmlElement(name = "QtyDtls", required = true)
    protected OrderQuantity1 qtyDtls;
    @XmlElement(name = "ExctnInstrsDtls")
    protected List<SecuritiesExecutionInstructions1> exctnInstrsDtls;
    @XmlElement(name = "StrtgyParamsDtls")
    protected List<StrategyParameters1> strtgyParamsDtls;
    @XmlElement(name = "PreAllcnDtls")
    protected List<PreAllocation1> preAllcnDtls;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission2> comssnDtls;
    @XmlElement(name = "BookgDtls")
    protected Booking1 bookgDtls;
    @XmlElement(name = "TradgPties")
    protected List<Intermediary14> tradgPties;
    @XmlElement(name = "CshPties")
    protected CashParties1 cshPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties3 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties3 dlvrgSttlmPties;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties1 othrBizPties;
    @XmlElement(name = "AmtsDtls")
    protected List<OtherAmounts1> amtsDtls;

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
    public Order3 setClntOrdrId(String value) {
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
    public Order3 setScndryClntOrdrId(String value) {
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
    public Order3 setClntOrdrLkId(String value) {
        this.clntOrdrLkId = value;
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
    public Order3 setCshMrgn(CashMarginOrder1Code value) {
        this.cshMrgn = value;
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
    public Order3 setSd(Side1Code value) {
        this.sd = value;
        return this;
    }

    /**
     * Gets the value of the slctdOrdrInd property.
     * 
     */
    public boolean isSlctdOrdrInd() {
        return slctdOrdrInd;
    }

    /**
     * Sets the value of the slctdOrdrInd property.
     * 
     */
    public Order3 setSlctdOrdrInd(boolean value) {
        this.slctdOrdrInd = value;
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
    public OffsetDateTime getTradOrgtnDt() {
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
    public Order3 setTradOrgtnDt(OffsetDateTime value) {
        this.tradOrgtnDt = value;
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
    public Order3 setCmplcId(String value) {
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
    public Order3 setTradgCpcty(TradingCapacity3Code value) {
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
    public Order3 setCstmrCpcty(CustomerOrderCapacity1Code value) {
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
    public Order3 setPosFct(PositionEffect1Code value) {
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
    public Order3 setDerivCvrd(Boolean value) {
        this.derivCvrd = value;
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
    public OffsetDateTime getTradDt() {
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
    public Order3 setTradDt(OffsetDateTime value) {
        this.tradDt = value;
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
    public Order3 setTradgSsnDtls(TradingSession1 value) {
        this.tradgSsnDtls = value;
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
    public Order3 setTradRgltr(PartyIdentification23 value) {
        this.tradRgltr = value;
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
    public Order3 setFrgnXchgExctnReqdInd(boolean value) {
        this.frgnXchgExctnReqdInd = value;
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
    public Order3 setSttlmCcy(String value) {
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
    public Order3 setClrFeeTp(ClearingFeeType1Code value) {
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
    public Order3 setOrdrOrgtrElgblty(Eligibility1Code value) {
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
    public Order3 setPlcOfExctn(MarketIdentification1 value) {
        this.plcOfExctn = value;
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
    public Order3 setFinInstrm(SecurityIdentification7 value) {
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
    public Order3 setFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
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
    public Order3 setStiptns(FinancialInstrumentStipulations value) {
        this.stiptns = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygFinInstrm property.
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
     * @return
     *     The value of the undrlygFinInstrm property.
     */
    public List<SecurityIdentification7> getUndrlygFinInstrm() {
        if (undrlygFinInstrm == null) {
            undrlygFinInstrm = new ArrayList<>();
        }
        return this.undrlygFinInstrm;
    }

    /**
     * Gets the value of the undrlygFinInstrmAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygFinInstrmAttrbts property.
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
     * @return
     *     The value of the undrlygFinInstrmAttrbts property.
     */
    public List<FinancialInstrumentAttributes1> getUndrlygFinInstrmAttrbts() {
        if (undrlygFinInstrmAttrbts == null) {
            undrlygFinInstrmAttrbts = new ArrayList<>();
        }
        return this.undrlygFinInstrmAttrbts;
    }

    /**
     * Gets the value of the undrlygStiptns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygStiptns property.
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
     * @return
     *     The value of the undrlygStiptns property.
     */
    public List<FinancialInstrumentStipulations> getUndrlygStiptns() {
        if (undrlygStiptns == null) {
            undrlygStiptns = new ArrayList<>();
        }
        return this.undrlygStiptns;
    }

    /**
     * Gets the value of the qtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity1 }
     *     
     */
    public OrderQuantity1 getQtyDtls() {
        return qtyDtls;
    }

    /**
     * Sets the value of the qtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity1 }
     *     
     */
    public Order3 setQtyDtls(OrderQuantity1 value) {
        this.qtyDtls = value;
        return this;
    }

    /**
     * Gets the value of the exctnInstrsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the exctnInstrsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExctnInstrsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesExecutionInstructions1 }
     * 
     * 
     * @return
     *     The value of the exctnInstrsDtls property.
     */
    public List<SecuritiesExecutionInstructions1> getExctnInstrsDtls() {
        if (exctnInstrsDtls == null) {
            exctnInstrsDtls = new ArrayList<>();
        }
        return this.exctnInstrsDtls;
    }

    /**
     * Gets the value of the strtgyParamsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the strtgyParamsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrtgyParamsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrategyParameters1 }
     * 
     * 
     * @return
     *     The value of the strtgyParamsDtls property.
     */
    public List<StrategyParameters1> getStrtgyParamsDtls() {
        if (strtgyParamsDtls == null) {
            strtgyParamsDtls = new ArrayList<>();
        }
        return this.strtgyParamsDtls;
    }

    /**
     * Gets the value of the preAllcnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the preAllcnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreAllcnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreAllocation1 }
     * 
     * 
     * @return
     *     The value of the preAllcnDtls property.
     */
    public List<PreAllocation1> getPreAllcnDtls() {
        if (preAllcnDtls == null) {
            preAllcnDtls = new ArrayList<>();
        }
        return this.preAllcnDtls;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the comssnDtls property.
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
     * {@link Commission2 }
     * 
     * 
     * @return
     *     The value of the comssnDtls property.
     */
    public List<Commission2> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<>();
        }
        return this.comssnDtls;
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
    public Order3 setBookgDtls(Booking1 value) {
        this.bookgDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradgPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradgPties property.
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
     * @return
     *     The value of the tradgPties property.
     */
    public List<Intermediary14> getTradgPties() {
        if (tradgPties == null) {
            tradgPties = new ArrayList<>();
        }
        return this.tradgPties;
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
    public Order3 setCshPties(CashParties1 value) {
        this.cshPties = value;
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
    public Order3 setRcvgSttlmPties(SettlementParties3 value) {
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
    public Order3 setDlvrgSttlmPties(SettlementParties3 value) {
        this.dlvrgSttlmPties = value;
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
    public Order3 setOthrBizPties(OtherParties1 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the amtsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the amtsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmounts1 }
     * 
     * 
     * @return
     *     The value of the amtsDtls property.
     */
    public List<OtherAmounts1> getAmtsDtls() {
        if (amtsDtls == null) {
            amtsDtls = new ArrayList<>();
        }
        return this.amtsDtls;
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
     * Adds a new item to the undrlygFinInstrm list.
     * @see #getUndrlygFinInstrm()
     * 
     */
    public Order3 addUndrlygFinInstrm(SecurityIdentification7 undrlygFinInstrm) {
        getUndrlygFinInstrm().add(undrlygFinInstrm);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmAttrbts list.
     * @see #getUndrlygFinInstrmAttrbts()
     * 
     */
    public Order3 addUndrlygFinInstrmAttrbts(FinancialInstrumentAttributes1 undrlygFinInstrmAttrbts) {
        getUndrlygFinInstrmAttrbts().add(undrlygFinInstrmAttrbts);
        return this;
    }

    /**
     * Adds a new item to the undrlygStiptns list.
     * @see #getUndrlygStiptns()
     * 
     */
    public Order3 addUndrlygStiptns(FinancialInstrumentStipulations undrlygStiptns) {
        getUndrlygStiptns().add(undrlygStiptns);
        return this;
    }

    /**
     * Adds a new item to the exctnInstrsDtls list.
     * @see #getExctnInstrsDtls()
     * 
     */
    public Order3 addExctnInstrsDtls(SecuritiesExecutionInstructions1 exctnInstrsDtls) {
        getExctnInstrsDtls().add(exctnInstrsDtls);
        return this;
    }

    /**
     * Adds a new item to the strtgyParamsDtls list.
     * @see #getStrtgyParamsDtls()
     * 
     */
    public Order3 addStrtgyParamsDtls(StrategyParameters1 strtgyParamsDtls) {
        getStrtgyParamsDtls().add(strtgyParamsDtls);
        return this;
    }

    /**
     * Adds a new item to the preAllcnDtls list.
     * @see #getPreAllcnDtls()
     * 
     */
    public Order3 addPreAllcnDtls(PreAllocation1 preAllcnDtls) {
        getPreAllcnDtls().add(preAllcnDtls);
        return this;
    }

    /**
     * Adds a new item to the comssnDtls list.
     * @see #getComssnDtls()
     * 
     */
    public Order3 addComssnDtls(Commission2 comssnDtls) {
        getComssnDtls().add(comssnDtls);
        return this;
    }

    /**
     * Adds a new item to the tradgPties list.
     * @see #getTradgPties()
     * 
     */
    public Order3 addTradgPties(Intermediary14 tradgPties) {
        getTradgPties().add(tradgPties);
        return this;
    }

    /**
     * Adds a new item to the amtsDtls list.
     * @see #getAmtsDtls()
     * 
     */
    public Order3 addAmtsDtls(OtherAmounts1 amtsDtls) {
        getAmtsDtls().add(amtsDtls);
        return this;
    }

}
