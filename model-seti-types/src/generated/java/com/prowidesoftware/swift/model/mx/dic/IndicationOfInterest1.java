
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
 * Intention to buy or sell a financial Instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicationOfInterest1", propOrder = {
    "sd",
    "ioiQty",
    "pric",
    "vldUntilDtTm",
    "qltyIndctn",
    "ntrlInd",
    "qlfr",
    "lkdURLAdr",
    "nbOfLegs",
    "finInstrmDtls",
    "finInstrmAttrbts",
    "stiptns",
    "undrlygFinInstrmDtls",
    "undrlygFinInstrmAttrbts",
    "undrlygStiptns",
    "instrmLegGrpDtls",
    "yldDtls",
    "ordrQty",
    "sprdAndBchmkCrvDtls",
    "twoLegTxDtls",
    "tradgPties",
    "cshPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties",
    "othrBizPties"
})
public class IndicationOfInterest1 {

    @XmlElement(name = "Sd", required = true)
    @XmlSchemaType(name = "string")
    protected IOISideTypeCode sd;
    @XmlElement(name = "IOIQty", required = true)
    protected Quantity1Choice ioiQty;
    @XmlElement(name = "Pric")
    protected Price1 pric;
    @XmlElement(name = "VldUntilDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldUntilDtTm;
    @XmlElement(name = "QltyIndctn")
    @XmlSchemaType(name = "string")
    protected QualityIndication1Code qltyIndctn;
    @XmlElement(name = "NtrlInd")
    protected Boolean ntrlInd;
    @XmlElement(name = "Qlfr")
    @XmlSchemaType(name = "string")
    protected List<Qualifier1Code> qlfr;
    @XmlElement(name = "LkdURLAdr")
    protected String lkdURLAdr;
    @XmlElement(name = "NbOfLegs")
    protected BigDecimal nbOfLegs;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected SecurityIdentification7 finInstrmDtls;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes1 finInstrmAttrbts;
    @XmlElement(name = "Stiptns")
    protected FinancialInstrumentStipulations stiptns;
    @XmlElement(name = "UndrlygFinInstrmDtls")
    protected List<SecurityIdentification7> undrlygFinInstrmDtls;
    @XmlElement(name = "UndrlygFinInstrmAttrbts")
    protected List<FinancialInstrumentAttributes1> undrlygFinInstrmAttrbts;
    @XmlElement(name = "UndrlygStiptns")
    protected List<FinancialInstrumentStipulations> undrlygStiptns;
    @XmlElement(name = "InstrmLegGrpDtls")
    protected List<InstrumentLeg1> instrmLegGrpDtls;
    @XmlElement(name = "YldDtls")
    protected YieldCalculation1 yldDtls;
    @XmlElement(name = "OrdrQty")
    protected OrderQuantity1 ordrQty;
    @XmlElement(name = "SprdAndBchmkCrvDtls")
    protected BenchmarkCurve1 sprdAndBchmkCrvDtls;
    @XmlElement(name = "TwoLegTxDtls")
    protected SecuritiesFinancing1 twoLegTxDtls;
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

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link IOISideTypeCode }
     *     
     */
    public IOISideTypeCode getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link IOISideTypeCode }
     *     
     */
    public IndicationOfInterest1 setSd(IOISideTypeCode value) {
        this.sd = value;
        return this;
    }

    /**
     * Gets the value of the ioiQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity1Choice }
     *     
     */
    public Quantity1Choice getIOIQty() {
        return ioiQty;
    }

    /**
     * Sets the value of the ioiQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity1Choice }
     *     
     */
    public IndicationOfInterest1 setIOIQty(Quantity1Choice value) {
        this.ioiQty = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public IndicationOfInterest1 setPric(Price1 value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the vldUntilDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVldUntilDtTm() {
        return vldUntilDtTm;
    }

    /**
     * Sets the value of the vldUntilDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndicationOfInterest1 setVldUntilDtTm(XMLGregorianCalendar value) {
        this.vldUntilDtTm = value;
        return this;
    }

    /**
     * Gets the value of the qltyIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link QualityIndication1Code }
     *     
     */
    public QualityIndication1Code getQltyIndctn() {
        return qltyIndctn;
    }

    /**
     * Sets the value of the qltyIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityIndication1Code }
     *     
     */
    public IndicationOfInterest1 setQltyIndctn(QualityIndication1Code value) {
        this.qltyIndctn = value;
        return this;
    }

    /**
     * Gets the value of the ntrlInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtrlInd() {
        return ntrlInd;
    }

    /**
     * Sets the value of the ntrlInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public IndicationOfInterest1 setNtrlInd(Boolean value) {
        this.ntrlInd = value;
        return this;
    }

    /**
     * Gets the value of the qlfr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qlfr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQlfr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Qualifier1Code }
     * 
     * 
     */
    public List<Qualifier1Code> getQlfr() {
        if (qlfr == null) {
            qlfr = new ArrayList<Qualifier1Code>();
        }
        return this.qlfr;
    }

    /**
     * Gets the value of the lkdURLAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdURLAdr() {
        return lkdURLAdr;
    }

    /**
     * Sets the value of the lkdURLAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndicationOfInterest1 setLkdURLAdr(String value) {
        this.lkdURLAdr = value;
        return this;
    }

    /**
     * Gets the value of the nbOfLegs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfLegs() {
        return nbOfLegs;
    }

    /**
     * Sets the value of the nbOfLegs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public IndicationOfInterest1 setNbOfLegs(BigDecimal value) {
        this.nbOfLegs = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public IndicationOfInterest1 setFinInstrmDtls(SecurityIdentification7 value) {
        this.finInstrmDtls = value;
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
    public IndicationOfInterest1 setFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
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
    public IndicationOfInterest1 setStiptns(FinancialInstrumentStipulations value) {
        this.stiptns = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinInstrmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygFinInstrmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification7 }
     * 
     * 
     */
    public List<SecurityIdentification7> getUndrlygFinInstrmDtls() {
        if (undrlygFinInstrmDtls == null) {
            undrlygFinInstrmDtls = new ArrayList<SecurityIdentification7>();
        }
        return this.undrlygFinInstrmDtls;
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
     * Gets the value of the instrmLegGrpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrmLegGrpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrmLegGrpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentLeg1 }
     * 
     * 
     */
    public List<InstrumentLeg1> getInstrmLegGrpDtls() {
        if (instrmLegGrpDtls == null) {
            instrmLegGrpDtls = new ArrayList<InstrumentLeg1>();
        }
        return this.instrmLegGrpDtls;
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
    public IndicationOfInterest1 setYldDtls(YieldCalculation1 value) {
        this.yldDtls = value;
        return this;
    }

    /**
     * Gets the value of the ordrQty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity1 }
     *     
     */
    public OrderQuantity1 getOrdrQty() {
        return ordrQty;
    }

    /**
     * Sets the value of the ordrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity1 }
     *     
     */
    public IndicationOfInterest1 setOrdrQty(OrderQuantity1 value) {
        this.ordrQty = value;
        return this;
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
    public IndicationOfInterest1 setSprdAndBchmkCrvDtls(BenchmarkCurve1 value) {
        this.sprdAndBchmkCrvDtls = value;
        return this;
    }

    /**
     * Gets the value of the twoLegTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancing1 }
     *     
     */
    public SecuritiesFinancing1 getTwoLegTxDtls() {
        return twoLegTxDtls;
    }

    /**
     * Sets the value of the twoLegTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancing1 }
     *     
     */
    public IndicationOfInterest1 setTwoLegTxDtls(SecuritiesFinancing1 value) {
        this.twoLegTxDtls = value;
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
    public IndicationOfInterest1 setCshPties(CashParties1 value) {
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
    public IndicationOfInterest1 setRcvgSttlmPties(SettlementParties3 value) {
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
    public IndicationOfInterest1 setDlvrgSttlmPties(SettlementParties3 value) {
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
    public IndicationOfInterest1 setOthrBizPties(OtherParties1 value) {
        this.othrBizPties = value;
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
     * Adds a new item to the qlfr list.
     * @see #getQlfr()
     * 
     */
    public IndicationOfInterest1 addQlfr(Qualifier1Code qlfr) {
        getQlfr().add(qlfr);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmDtls list.
     * @see #getUndrlygFinInstrmDtls()
     * 
     */
    public IndicationOfInterest1 addUndrlygFinInstrmDtls(SecurityIdentification7 undrlygFinInstrmDtls) {
        getUndrlygFinInstrmDtls().add(undrlygFinInstrmDtls);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmAttrbts list.
     * @see #getUndrlygFinInstrmAttrbts()
     * 
     */
    public IndicationOfInterest1 addUndrlygFinInstrmAttrbts(FinancialInstrumentAttributes1 undrlygFinInstrmAttrbts) {
        getUndrlygFinInstrmAttrbts().add(undrlygFinInstrmAttrbts);
        return this;
    }

    /**
     * Adds a new item to the undrlygStiptns list.
     * @see #getUndrlygStiptns()
     * 
     */
    public IndicationOfInterest1 addUndrlygStiptns(FinancialInstrumentStipulations undrlygStiptns) {
        getUndrlygStiptns().add(undrlygStiptns);
        return this;
    }

    /**
     * Adds a new item to the instrmLegGrpDtls list.
     * @see #getInstrmLegGrpDtls()
     * 
     */
    public IndicationOfInterest1 addInstrmLegGrpDtls(InstrumentLeg1 instrmLegGrpDtls) {
        getInstrmLegGrpDtls().add(instrmLegGrpDtls);
        return this;
    }

    /**
     * Adds a new item to the tradgPties list.
     * @see #getTradgPties()
     * 
     */
    public IndicationOfInterest1 addTradgPties(Intermediary14 tradgPties) {
        getTradgPties().add(tradgPties);
        return this;
    }

}
