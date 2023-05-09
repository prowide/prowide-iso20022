
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
@XmlType(name = "TradeTransaction27", propOrder = {
    "unqTradIdr",
    "rptTrckgNb",
    "cmplxTradId",
    "tradgVn",
    "cmprssn",
    "pric",
    "ntnlAmt",
    "pricMltplr",
    "qty",
    "upFrntPmt",
    "dlvryTp",
    "exctnDtTm",
    "fctvDt",
    "mtrtyDt",
    "termntnDt",
    "sttlmDt",
    "mstrAgrmt",
    "tradConf",
    "tradClr",
    "intrstRate",
    "ccy",
    "cmmdty",
    "nrgySpcfcAttrbts",
    "optn",
    "cdt"
})
public class TradeTransaction27 {

    @XmlElement(name = "UnqTradIdr")
    protected String unqTradIdr;
    @XmlElement(name = "RptTrckgNb")
    protected String rptTrckgNb;
    @XmlElement(name = "CmplxTradId")
    protected String cmplxTradId;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "Cmprssn")
    protected Boolean cmprssn;
    @XmlElement(name = "Pric")
    protected SecuritiesTransactionPrice10Choice pric;
    @XmlElement(name = "NtnlAmt")
    protected AmountAndDirection56 ntnlAmt;
    @XmlElement(name = "PricMltplr")
    protected BigDecimal pricMltplr;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity30Choice qty;
    @XmlElement(name = "UpFrntPmt")
    protected AmountAndDirection56 upFrntPmt;
    @XmlElement(name = "DlvryTp")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType4Code dlvryTp;
    @XmlElement(name = "ExctnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime exctnDtTm;
    @XmlElement(name = "FctvDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fctvDt;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate mtrtyDt;
    @XmlElement(name = "TermntnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate termntnDt;
    @XmlElement(name = "SttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected List<LocalDate> sttlmDt;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement5 mstrAgrmt;
    @XmlElement(name = "TradConf")
    protected TradeConfirmation2Choice tradConf;
    @XmlElement(name = "TradClr")
    protected TradeClearing3 tradClr;
    @XmlElement(name = "IntrstRate")
    protected InterestRateLegs7 intrstRate;
    @XmlElement(name = "Ccy")
    protected CurrencyExchange10 ccy;
    @XmlElement(name = "Cmmdty")
    protected AssetClassCommodity2Choice cmmdty;
    @XmlElement(name = "NrgySpcfcAttrbts")
    protected EnergySpecificAttribute5 nrgySpcfcAttrbts;
    @XmlElement(name = "Optn")
    protected OptionOrSwaption4 optn;
    @XmlElement(name = "Cdt")
    protected CreditDerivative2 cdt;

    /**
     * Gets the value of the unqTradIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTradIdr() {
        return unqTradIdr;
    }

    /**
     * Sets the value of the unqTradIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransaction27 setUnqTradIdr(String value) {
        this.unqTradIdr = value;
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
    public TradeTransaction27 setRptTrckgNb(String value) {
        this.rptTrckgNb = value;
        return this;
    }

    /**
     * Gets the value of the cmplxTradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmplxTradId() {
        return cmplxTradId;
    }

    /**
     * Sets the value of the cmplxTradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransaction27 setCmplxTradId(String value) {
        this.cmplxTradId = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransaction27 setTradgVn(String value) {
        this.tradgVn = value;
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
    public TradeTransaction27 setCmprssn(Boolean value) {
        this.cmprssn = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice10Choice }
     *     
     */
    public SecuritiesTransactionPrice10Choice getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice10Choice }
     *     
     */
    public TradeTransaction27 setPric(SecuritiesTransactionPrice10Choice value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the ntnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection56 }
     *     
     */
    public AmountAndDirection56 getNtnlAmt() {
        return ntnlAmt;
    }

    /**
     * Sets the value of the ntnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection56 }
     *     
     */
    public TradeTransaction27 setNtnlAmt(AmountAndDirection56 value) {
        this.ntnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the pricMltplr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricMltplr() {
        return pricMltplr;
    }

    /**
     * Sets the value of the pricMltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TradeTransaction27 setPricMltplr(BigDecimal value) {
        this.pricMltplr = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity30Choice }
     *     
     */
    public FinancialInstrumentQuantity30Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity30Choice }
     *     
     */
    public TradeTransaction27 setQty(FinancialInstrumentQuantity30Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the upFrntPmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection56 }
     *     
     */
    public AmountAndDirection56 getUpFrntPmt() {
        return upFrntPmt;
    }

    /**
     * Sets the value of the upFrntPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection56 }
     *     
     */
    public TradeTransaction27 setUpFrntPmt(AmountAndDirection56 value) {
        this.upFrntPmt = value;
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
    public TradeTransaction27 setDlvryTp(PhysicalTransferType4Code value) {
        this.dlvryTp = value;
        return this;
    }

    /**
     * Gets the value of the exctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getExctnDtTm() {
        return exctnDtTm;
    }

    /**
     * Sets the value of the exctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransaction27 setExctnDtTm(OffsetDateTime value) {
        this.exctnDtTm = value;
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
    public TradeTransaction27 setFctvDt(LocalDate value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransaction27 setMtrtyDt(LocalDate value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransaction27 setTermntnDt(LocalDate value) {
        this.termntnDt = value;
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
     *     {@link MasterAgreement5 }
     *     
     */
    public MasterAgreement5 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement5 }
     *     
     */
    public TradeTransaction27 setMstrAgrmt(MasterAgreement5 value) {
        this.mstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the tradConf property.
     * 
     * @return
     *     possible object is
     *     {@link TradeConfirmation2Choice }
     *     
     */
    public TradeConfirmation2Choice getTradConf() {
        return tradConf;
    }

    /**
     * Sets the value of the tradConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeConfirmation2Choice }
     *     
     */
    public TradeTransaction27 setTradConf(TradeConfirmation2Choice value) {
        this.tradConf = value;
        return this;
    }

    /**
     * Gets the value of the tradClr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeClearing3 }
     *     
     */
    public TradeClearing3 getTradClr() {
        return tradClr;
    }

    /**
     * Sets the value of the tradClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeClearing3 }
     *     
     */
    public TradeTransaction27 setTradClr(TradeClearing3 value) {
        this.tradClr = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateLegs7 }
     *     
     */
    public InterestRateLegs7 getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateLegs7 }
     *     
     */
    public TradeTransaction27 setIntrstRate(InterestRateLegs7 value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange10 }
     *     
     */
    public CurrencyExchange10 getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange10 }
     *     
     */
    public TradeTransaction27 setCcy(CurrencyExchange10 value) {
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
    public TradeTransaction27 setCmmdty(AssetClassCommodity2Choice value) {
        this.cmmdty = value;
        return this;
    }

    /**
     * Gets the value of the nrgySpcfcAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link EnergySpecificAttribute5 }
     *     
     */
    public EnergySpecificAttribute5 getNrgySpcfcAttrbts() {
        return nrgySpcfcAttrbts;
    }

    /**
     * Sets the value of the nrgySpcfcAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergySpecificAttribute5 }
     *     
     */
    public TradeTransaction27 setNrgySpcfcAttrbts(EnergySpecificAttribute5 value) {
        this.nrgySpcfcAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the optn property.
     * 
     * @return
     *     possible object is
     *     {@link OptionOrSwaption4 }
     *     
     */
    public OptionOrSwaption4 getOptn() {
        return optn;
    }

    /**
     * Sets the value of the optn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionOrSwaption4 }
     *     
     */
    public TradeTransaction27 setOptn(OptionOrSwaption4 value) {
        this.optn = value;
        return this;
    }

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDerivative2 }
     *     
     */
    public CreditDerivative2 getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDerivative2 }
     *     
     */
    public TradeTransaction27 setCdt(CreditDerivative2 value) {
        this.cdt = value;
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
    public TradeTransaction27 addSttlmDt(LocalDate sttlmDt) {
        getSttlmDt().add(sttlmDt);
        return this;
    }

}
