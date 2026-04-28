
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details of the trade transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransaction49", propOrder = {
    "txId",
    "prrTxId",
    "sbsqntTxId",
    "collPrtflCd",
    "rptTrckgNb",
    "pltfmIdr",
    "mrrrOrTrggrTx",
    "txPric",
    "ntnlAmt",
    "ntnlQty",
    "qty",
    "dlvryTp",
    "exctnTmStmp",
    "fctvDt",
    "xprtnDt",
    "earlyTermntnDt",
    "sttlmDt",
    "mstrAgrmt",
    "cmprssn",
    "pstTradRskRdctnFlg",
    "pstTradRskRdctnEvt",
    "derivEvt",
    "tradConf",
    "nonStdsdTerm",
    "tradClr",
    "blckTradElctn",
    "lrgNtnlOffFcltyElctn",
    "intrstRate",
    "ccy",
    "cmmdty",
    "optn",
    "nrgySpcfcAttrbts",
    "cdt",
    "othrPmt",
    "packg",
    "tradAllcnSts"
})
public class TradeTransaction49 {

    @XmlElement(name = "TxId")
    protected UniqueTransactionIdentifier2Choice txId;
    @XmlElement(name = "PrrTxId")
    protected UniqueTransactionIdentifier3Choice prrTxId;
    @XmlElement(name = "SbsqntTxId")
    protected UniqueTransactionIdentifier3Choice sbsqntTxId;
    @XmlElement(name = "CollPrtflCd")
    protected CollateralPortfolioCode5Choice collPrtflCd;
    @XmlElement(name = "RptTrckgNb")
    protected String rptTrckgNb;
    @XmlElement(name = "PltfmIdr")
    protected String pltfmIdr;
    @XmlElement(name = "MrrrOrTrggrTx")
    protected Boolean mrrrOrTrggrTx;
    @XmlElement(name = "TxPric")
    protected PriceData2 txPric;
    @XmlElement(name = "NtnlAmt")
    protected NotionalAmountLegs5 ntnlAmt;
    @XmlElement(name = "NtnlQty")
    protected NotionalQuantityLegs5 ntnlQty;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity32Choice qty;
    @XmlElement(name = "DlvryTp")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType4Code dlvryTp;
    @XmlElement(name = "ExctnTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exctnTmStmp;
    @XmlElement(name = "FctvDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fctvDt;
    @XmlElement(name = "XprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xprtnDt;
    @XmlElement(name = "EarlyTermntnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earlyTermntnDt;
    @XmlElement(name = "SttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> sttlmDt;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement8 mstrAgrmt;
    @XmlElement(name = "Cmprssn")
    protected Boolean cmprssn;
    @XmlElement(name = "PstTradRskRdctnFlg")
    protected Boolean pstTradRskRdctnFlg;
    @XmlElement(name = "PstTradRskRdctnEvt")
    protected PTRREvent2 pstTradRskRdctnEvt;
    @XmlElement(name = "DerivEvt")
    protected DerivativeEvent6 derivEvt;
    @XmlElement(name = "TradConf")
    protected TradeConfirmation1Choice tradConf;
    @XmlElement(name = "NonStdsdTerm")
    protected Boolean nonStdsdTerm;
    @XmlElement(name = "TradClr")
    protected TradeClearing11 tradClr;
    @XmlElement(name = "BlckTradElctn")
    protected Boolean blckTradElctn;
    @XmlElement(name = "LrgNtnlOffFcltyElctn")
    protected Boolean lrgNtnlOffFcltyElctn;
    @XmlElement(name = "IntrstRate")
    protected InterestRateLegs14 intrstRate;
    @XmlElement(name = "Ccy")
    protected CurrencyExchange22 ccy;
    @XmlElement(name = "Cmmdty")
    protected AssetClassCommodity6Choice cmmdty;
    @XmlElement(name = "Optn")
    protected OptionOrSwaption10 optn;
    @XmlElement(name = "NrgySpcfcAttrbts")
    protected EnergySpecificAttribute9 nrgySpcfcAttrbts;
    @XmlElement(name = "Cdt")
    protected CreditDerivative4 cdt;
    @XmlElement(name = "OthrPmt")
    protected List<OtherPayment5> othrPmt;
    @XmlElement(name = "Packg")
    protected Package4 packg;
    @XmlElement(name = "TradAllcnSts")
    @XmlSchemaType(name = "string")
    protected AllocationIndicator1Code tradAllcnSts;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public UniqueTransactionIdentifier2Choice getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public TradeTransaction49 setTxId(UniqueTransactionIdentifier2Choice value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the prrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier3Choice }
     *     
     */
    public UniqueTransactionIdentifier3Choice getPrrTxId() {
        return prrTxId;
    }

    /**
     * Sets the value of the prrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier3Choice }
     *     
     */
    public TradeTransaction49 setPrrTxId(UniqueTransactionIdentifier3Choice value) {
        this.prrTxId = value;
        return this;
    }

    /**
     * Gets the value of the sbsqntTxId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier3Choice }
     *     
     */
    public UniqueTransactionIdentifier3Choice getSbsqntTxId() {
        return sbsqntTxId;
    }

    /**
     * Sets the value of the sbsqntTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier3Choice }
     *     
     */
    public TradeTransaction49 setSbsqntTxId(UniqueTransactionIdentifier3Choice value) {
        this.sbsqntTxId = value;
        return this;
    }

    /**
     * Gets the value of the collPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralPortfolioCode5Choice }
     *     
     */
    public CollateralPortfolioCode5Choice getCollPrtflCd() {
        return collPrtflCd;
    }

    /**
     * Sets the value of the collPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralPortfolioCode5Choice }
     *     
     */
    public TradeTransaction49 setCollPrtflCd(CollateralPortfolioCode5Choice value) {
        this.collPrtflCd = value;
        return this;
    }

    /**
     * Gets the value of the rptTrckgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptTrckgNb() {
        return rptTrckgNb;
    }

    /**
     * Sets the value of the rptTrckgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransaction49 setRptTrckgNb(String value) {
        this.rptTrckgNb = value;
        return this;
    }

    /**
     * Gets the value of the pltfmIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPltfmIdr() {
        return pltfmIdr;
    }

    /**
     * Sets the value of the pltfmIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransaction49 setPltfmIdr(String value) {
        this.pltfmIdr = value;
        return this;
    }

    /**
     * Gets the value of the mrrrOrTrggrTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMrrrOrTrggrTx() {
        return mrrrOrTrggrTx;
    }

    /**
     * Sets the value of the mrrrOrTrggrTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeTransaction49 setMrrrOrTrggrTx(Boolean value) {
        this.mrrrOrTrggrTx = value;
        return this;
    }

    /**
     * Gets the value of the txPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceData2 }
     *     
     */
    public PriceData2 getTxPric() {
        return txPric;
    }

    /**
     * Sets the value of the txPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceData2 }
     *     
     */
    public TradeTransaction49 setTxPric(PriceData2 value) {
        this.txPric = value;
        return this;
    }

    /**
     * Gets the value of the ntnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmountLegs5 }
     *     
     */
    public NotionalAmountLegs5 getNtnlAmt() {
        return ntnlAmt;
    }

    /**
     * Sets the value of the ntnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmountLegs5 }
     *     
     */
    public TradeTransaction49 setNtnlAmt(NotionalAmountLegs5 value) {
        this.ntnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the ntnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalQuantityLegs5 }
     *     
     */
    public NotionalQuantityLegs5 getNtnlQty() {
        return ntnlQty;
    }

    /**
     * Sets the value of the ntnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalQuantityLegs5 }
     *     
     */
    public TradeTransaction49 setNtnlQty(NotionalQuantityLegs5 value) {
        this.ntnlQty = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity32Choice }
     *     
     */
    public FinancialInstrumentQuantity32Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity32Choice }
     *     
     */
    public TradeTransaction49 setQty(FinancialInstrumentQuantity32Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the dlvryTp property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public PhysicalTransferType4Code getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Sets the value of the dlvryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public TradeTransaction49 setDlvryTp(PhysicalTransferType4Code value) {
        this.dlvryTp = value;
        return this;
    }

    /**
     * Gets the value of the exctnTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getExctnTmStmp() {
        return exctnTmStmp;
    }

    /**
     * Sets the value of the exctnTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransaction49 setExctnTmStmp(XMLGregorianCalendar value) {
        this.exctnTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransaction49 setFctvDt(XMLGregorianCalendar value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransaction49 setXprtnDt(XMLGregorianCalendar value) {
        this.xprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the earlyTermntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getEarlyTermntnDt() {
        return earlyTermntnDt;
    }

    /**
     * Sets the value of the earlyTermntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransaction49 setEarlyTermntnDt(XMLGregorianCalendar value) {
        this.earlyTermntnDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getSttlmDt() {
        if (sttlmDt == null) {
            sttlmDt = new ArrayList<XMLGregorianCalendar>();
        }
        return this.sttlmDt;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement8 }
     *     
     */
    public MasterAgreement8 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement8 }
     *     
     */
    public TradeTransaction49 setMstrAgrmt(MasterAgreement8 value) {
        this.mstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the cmprssn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCmprssn() {
        return cmprssn;
    }

    /**
     * Sets the value of the cmprssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeTransaction49 setCmprssn(Boolean value) {
        this.cmprssn = value;
        return this;
    }

    /**
     * Gets the value of the pstTradRskRdctnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPstTradRskRdctnFlg() {
        return pstTradRskRdctnFlg;
    }

    /**
     * Sets the value of the pstTradRskRdctnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeTransaction49 setPstTradRskRdctnFlg(Boolean value) {
        this.pstTradRskRdctnFlg = value;
        return this;
    }

    /**
     * Gets the value of the pstTradRskRdctnEvt property.
     * 
     * @return
     *     possible object is
     *     {@link PTRREvent2 }
     *     
     */
    public PTRREvent2 getPstTradRskRdctnEvt() {
        return pstTradRskRdctnEvt;
    }

    /**
     * Sets the value of the pstTradRskRdctnEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTRREvent2 }
     *     
     */
    public TradeTransaction49 setPstTradRskRdctnEvt(PTRREvent2 value) {
        this.pstTradRskRdctnEvt = value;
        return this;
    }

    /**
     * Gets the value of the derivEvt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeEvent6 }
     *     
     */
    public DerivativeEvent6 getDerivEvt() {
        return derivEvt;
    }

    /**
     * Sets the value of the derivEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeEvent6 }
     *     
     */
    public TradeTransaction49 setDerivEvt(DerivativeEvent6 value) {
        this.derivEvt = value;
        return this;
    }

    /**
     * Gets the value of the tradConf property.
     * 
     * @return
     *     possible object is
     *     {@link TradeConfirmation1Choice }
     *     
     */
    public TradeConfirmation1Choice getTradConf() {
        return tradConf;
    }

    /**
     * Sets the value of the tradConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeConfirmation1Choice }
     *     
     */
    public TradeTransaction49 setTradConf(TradeConfirmation1Choice value) {
        this.tradConf = value;
        return this;
    }

    /**
     * Gets the value of the nonStdsdTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonStdsdTerm() {
        return nonStdsdTerm;
    }

    /**
     * Sets the value of the nonStdsdTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeTransaction49 setNonStdsdTerm(Boolean value) {
        this.nonStdsdTerm = value;
        return this;
    }

    /**
     * Gets the value of the tradClr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeClearing11 }
     *     
     */
    public TradeClearing11 getTradClr() {
        return tradClr;
    }

    /**
     * Sets the value of the tradClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeClearing11 }
     *     
     */
    public TradeTransaction49 setTradClr(TradeClearing11 value) {
        this.tradClr = value;
        return this;
    }

    /**
     * Gets the value of the blckTradElctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlckTradElctn() {
        return blckTradElctn;
    }

    /**
     * Sets the value of the blckTradElctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeTransaction49 setBlckTradElctn(Boolean value) {
        this.blckTradElctn = value;
        return this;
    }

    /**
     * Gets the value of the lrgNtnlOffFcltyElctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLrgNtnlOffFcltyElctn() {
        return lrgNtnlOffFcltyElctn;
    }

    /**
     * Sets the value of the lrgNtnlOffFcltyElctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeTransaction49 setLrgNtnlOffFcltyElctn(Boolean value) {
        this.lrgNtnlOffFcltyElctn = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateLegs14 }
     *     
     */
    public InterestRateLegs14 getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateLegs14 }
     *     
     */
    public TradeTransaction49 setIntrstRate(InterestRateLegs14 value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange22 }
     *     
     */
    public CurrencyExchange22 getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange22 }
     *     
     */
    public TradeTransaction49 setCcy(CurrencyExchange22 value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodity6Choice }
     *     
     */
    public AssetClassCommodity6Choice getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodity6Choice }
     *     
     */
    public TradeTransaction49 setCmmdty(AssetClassCommodity6Choice value) {
        this.cmmdty = value;
        return this;
    }

    /**
     * Gets the value of the optn property.
     * 
     * @return
     *     possible object is
     *     {@link OptionOrSwaption10 }
     *     
     */
    public OptionOrSwaption10 getOptn() {
        return optn;
    }

    /**
     * Sets the value of the optn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionOrSwaption10 }
     *     
     */
    public TradeTransaction49 setOptn(OptionOrSwaption10 value) {
        this.optn = value;
        return this;
    }

    /**
     * Gets the value of the nrgySpcfcAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link EnergySpecificAttribute9 }
     *     
     */
    public EnergySpecificAttribute9 getNrgySpcfcAttrbts() {
        return nrgySpcfcAttrbts;
    }

    /**
     * Sets the value of the nrgySpcfcAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergySpecificAttribute9 }
     *     
     */
    public TradeTransaction49 setNrgySpcfcAttrbts(EnergySpecificAttribute9 value) {
        this.nrgySpcfcAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDerivative4 }
     *     
     */
    public CreditDerivative4 getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDerivative4 }
     *     
     */
    public TradeTransaction49 setCdt(CreditDerivative4 value) {
        this.cdt = value;
        return this;
    }

    /**
     * Gets the value of the othrPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrPmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPayment5 }
     * 
     * 
     */
    public List<OtherPayment5> getOthrPmt() {
        if (othrPmt == null) {
            othrPmt = new ArrayList<OtherPayment5>();
        }
        return this.othrPmt;
    }

    /**
     * Gets the value of the packg property.
     * 
     * @return
     *     possible object is
     *     {@link Package4 }
     *     
     */
    public Package4 getPackg() {
        return packg;
    }

    /**
     * Sets the value of the packg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Package4 }
     *     
     */
    public TradeTransaction49 setPackg(Package4 value) {
        this.packg = value;
        return this;
    }

    /**
     * Gets the value of the tradAllcnSts property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationIndicator1Code }
     *     
     */
    public AllocationIndicator1Code getTradAllcnSts() {
        return tradAllcnSts;
    }

    /**
     * Sets the value of the tradAllcnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationIndicator1Code }
     *     
     */
    public TradeTransaction49 setTradAllcnSts(AllocationIndicator1Code value) {
        this.tradAllcnSts = value;
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
     * Adds a new item to the sttlmDt list.
     * @see #getSttlmDt()
     * 
     */
    public TradeTransaction49 addSttlmDt(XMLGregorianCalendar sttlmDt) {
        getSttlmDt().add(sttlmDt);
        return this;
    }

    /**
     * Adds a new item to the othrPmt list.
     * @see #getOthrPmt()
     * 
     */
    public TradeTransaction49 addOthrPmt(OtherPayment5 othrPmt) {
        getOthrPmt().add(othrPmt);
        return this;
    }

}
