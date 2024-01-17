
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Provides details of the trade transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransaction37", propOrder = {
    "unqTxIdr",
    "prrUnqTxIdr",
    "rptTrckgNb",
    "pltfmIdr",
    "cmprssn",
    "txPric",
    "ntnlAmt",
    "ntnlQty",
    "dlta",
    "qty",
    "dlvryTp",
    "exctnTmStmp",
    "fctvDt",
    "xprtnDt",
    "earlyTermntnDt",
    "sttlmDt",
    "mstrAgrmt",
    "tradConf",
    "tradClr",
    "intrstRate",
    "ccy",
    "cmmdty",
    "nrgySpcfcAttrbts",
    "optn",
    "cdt",
    "othrPmt",
    "packg"
})
public class TradeTransaction37 {

    @XmlElement(name = "UnqTxIdr", required = true)
    protected UniqueTransactionIdentifier1Choice unqTxIdr;
    @XmlElement(name = "PrrUnqTxIdr")
    protected UniqueTransactionIdentifier1Choice prrUnqTxIdr;
    @XmlElement(name = "RptTrckgNb")
    protected String rptTrckgNb;
    @XmlElement(name = "PltfmIdr")
    protected String pltfmIdr;
    @XmlElement(name = "Cmprssn")
    protected Boolean cmprssn;
    @XmlElement(name = "TxPric")
    protected PriceData1 txPric;
    @XmlElement(name = "NtnlAmt")
    protected List<NotionalAmount1> ntnlAmt;
    @XmlElement(name = "NtnlQty")
    protected List<NotionalQuantity1> ntnlQty;
    @XmlElement(name = "Dlta")
    protected BigDecimal dlta;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity32Choice qty;
    @XmlElement(name = "DlvryTp")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType4Code dlvryTp;
    @XmlElement(name = "ExctnTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime exctnTmStmp;
    @XmlElement(name = "FctvDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fctvDt;
    @XmlElement(name = "XprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate xprtnDt;
    @XmlElement(name = "EarlyTermntnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate earlyTermntnDt;
    @XmlElement(name = "SttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected List<LocalDate> sttlmDt;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement7 mstrAgrmt;
    @XmlElement(name = "TradConf")
    protected TradeConfirmation1Choice tradConf;
    @XmlElement(name = "TradClr")
    protected TradeClearing5 tradClr;
    @XmlElement(name = "IntrstRate")
    protected InterestRateLegs9 intrstRate;
    @XmlElement(name = "Ccy")
    protected CurrencyExchange17 ccy;
    @XmlElement(name = "Cmmdty")
    protected AssetClassCommodity2Choice cmmdty;
    @XmlElement(name = "NrgySpcfcAttrbts")
    protected EnergySpecificAttribute6 nrgySpcfcAttrbts;
    @XmlElement(name = "Optn")
    protected OptionOrSwaption7 optn;
    @XmlElement(name = "Cdt")
    protected CreditDerivative4 cdt;
    @XmlElement(name = "OthrPmt")
    protected List<OtherPayment3> othrPmt;
    @XmlElement(name = "Packg")
    protected Package1 packg;

    /**
     * Gets the value of the unqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier1Choice }
     *     
     */
    public UniqueTransactionIdentifier1Choice getUnqTxIdr() {
        return unqTxIdr;
    }

    /**
     * Sets the value of the unqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier1Choice }
     *     
     */
    public TradeTransaction37 setUnqTxIdr(UniqueTransactionIdentifier1Choice value) {
        this.unqTxIdr = value;
        return this;
    }

    /**
     * Gets the value of the prrUnqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier1Choice }
     *     
     */
    public UniqueTransactionIdentifier1Choice getPrrUnqTxIdr() {
        return prrUnqTxIdr;
    }

    /**
     * Sets the value of the prrUnqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier1Choice }
     *     
     */
    public TradeTransaction37 setPrrUnqTxIdr(UniqueTransactionIdentifier1Choice value) {
        this.prrUnqTxIdr = value;
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
    public TradeTransaction37 setRptTrckgNb(String value) {
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
    public TradeTransaction37 setPltfmIdr(String value) {
        this.pltfmIdr = value;
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
    public TradeTransaction37 setCmprssn(Boolean value) {
        this.cmprssn = value;
        return this;
    }

    /**
     * Gets the value of the txPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceData1 }
     *     
     */
    public PriceData1 getTxPric() {
        return txPric;
    }

    /**
     * Sets the value of the txPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceData1 }
     *     
     */
    public TradeTransaction37 setTxPric(PriceData1 value) {
        this.txPric = value;
        return this;
    }

    /**
     * Gets the value of the ntnlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotionalAmount1 }
     * 
     * 
     * @return
     *     The value of the ntnlAmt property.
     */
    public List<NotionalAmount1> getNtnlAmt() {
        if (ntnlAmt == null) {
            ntnlAmt = new ArrayList<>();
        }
        return this.ntnlAmt;
    }

    /**
     * Gets the value of the ntnlQty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotionalQuantity1 }
     * 
     * 
     * @return
     *     The value of the ntnlQty property.
     */
    public List<NotionalQuantity1> getNtnlQty() {
        if (ntnlQty == null) {
            ntnlQty = new ArrayList<>();
        }
        return this.ntnlQty;
    }

    /**
     * Gets the value of the dlta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDlta() {
        return dlta;
    }

    /**
     * Sets the value of the dlta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TradeTransaction37 setDlta(BigDecimal value) {
        this.dlta = value;
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
    public TradeTransaction37 setQty(FinancialInstrumentQuantity32Choice value) {
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
    public TradeTransaction37 setDlvryTp(PhysicalTransferType4Code value) {
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
    public OffsetDateTime getExctnTmStmp() {
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
    public TradeTransaction37 setExctnTmStmp(OffsetDateTime value) {
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
    public LocalDate getFctvDt() {
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
    public TradeTransaction37 setFctvDt(LocalDate value) {
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
    public LocalDate getXprtnDt() {
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
    public TradeTransaction37 setXprtnDt(LocalDate value) {
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
    public LocalDate getEarlyTermntnDt() {
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
    public TradeTransaction37 setEarlyTermntnDt(LocalDate value) {
        this.earlyTermntnDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmDt property.
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
     * @return
     *     The value of the sttlmDt property.
     */
    public List<LocalDate> getSttlmDt() {
        if (sttlmDt == null) {
            sttlmDt = new ArrayList<>();
        }
        return this.sttlmDt;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement7 }
     *     
     */
    public MasterAgreement7 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement7 }
     *     
     */
    public TradeTransaction37 setMstrAgrmt(MasterAgreement7 value) {
        this.mstrAgrmt = value;
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
    public TradeTransaction37 setTradConf(TradeConfirmation1Choice value) {
        this.tradConf = value;
        return this;
    }

    /**
     * Gets the value of the tradClr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeClearing5 }
     *     
     */
    public TradeClearing5 getTradClr() {
        return tradClr;
    }

    /**
     * Sets the value of the tradClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeClearing5 }
     *     
     */
    public TradeTransaction37 setTradClr(TradeClearing5 value) {
        this.tradClr = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateLegs9 }
     *     
     */
    public InterestRateLegs9 getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateLegs9 }
     *     
     */
    public TradeTransaction37 setIntrstRate(InterestRateLegs9 value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange17 }
     *     
     */
    public CurrencyExchange17 getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange17 }
     *     
     */
    public TradeTransaction37 setCcy(CurrencyExchange17 value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodity2Choice }
     *     
     */
    public AssetClassCommodity2Choice getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodity2Choice }
     *     
     */
    public TradeTransaction37 setCmmdty(AssetClassCommodity2Choice value) {
        this.cmmdty = value;
        return this;
    }

    /**
     * Gets the value of the nrgySpcfcAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link EnergySpecificAttribute6 }
     *     
     */
    public EnergySpecificAttribute6 getNrgySpcfcAttrbts() {
        return nrgySpcfcAttrbts;
    }

    /**
     * Sets the value of the nrgySpcfcAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergySpecificAttribute6 }
     *     
     */
    public TradeTransaction37 setNrgySpcfcAttrbts(EnergySpecificAttribute6 value) {
        this.nrgySpcfcAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the optn property.
     * 
     * @return
     *     possible object is
     *     {@link OptionOrSwaption7 }
     *     
     */
    public OptionOrSwaption7 getOptn() {
        return optn;
    }

    /**
     * Sets the value of the optn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionOrSwaption7 }
     *     
     */
    public TradeTransaction37 setOptn(OptionOrSwaption7 value) {
        this.optn = value;
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
    public TradeTransaction37 setCdt(CreditDerivative4 value) {
        this.cdt = value;
        return this;
    }

    /**
     * Gets the value of the othrPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPmt property.
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
     * {@link OtherPayment3 }
     * 
     * 
     * @return
     *     The value of the othrPmt property.
     */
    public List<OtherPayment3> getOthrPmt() {
        if (othrPmt == null) {
            othrPmt = new ArrayList<>();
        }
        return this.othrPmt;
    }

    /**
     * Gets the value of the packg property.
     * 
     * @return
     *     possible object is
     *     {@link Package1 }
     *     
     */
    public Package1 getPackg() {
        return packg;
    }

    /**
     * Sets the value of the packg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Package1 }
     *     
     */
    public TradeTransaction37 setPackg(Package1 value) {
        this.packg = value;
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
     * Adds a new item to the ntnlAmt list.
     * @see #getNtnlAmt()
     * 
     */
    public TradeTransaction37 addNtnlAmt(NotionalAmount1 ntnlAmt) {
        getNtnlAmt().add(ntnlAmt);
        return this;
    }

    /**
     * Adds a new item to the ntnlQty list.
     * @see #getNtnlQty()
     * 
     */
    public TradeTransaction37 addNtnlQty(NotionalQuantity1 ntnlQty) {
        getNtnlQty().add(ntnlQty);
        return this;
    }

    /**
     * Adds a new item to the sttlmDt list.
     * @see #getSttlmDt()
     * 
     */
    public TradeTransaction37 addSttlmDt(LocalDate sttlmDt) {
        getSttlmDt().add(sttlmDt);
        return this;
    }

    /**
     * Adds a new item to the othrPmt list.
     * @see #getOthrPmt()
     * 
     */
    public TradeTransaction37 addOthrPmt(OtherPayment3 othrPmt) {
        getOthrPmt().add(othrPmt);
        return this;
    }

}
