
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Provides the details of each individual un
 * secured market transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsecuredMarketTransaction3", propOrder = {
    "rptdTxSts",
    "brnchId",
    "unqTxIdr",
    "prtryTxId",
    "ctrPtyPrtryTxId",
    "ctrPtyId",
    "tradDt",
    "sttlmDt",
    "mtrtyDt",
    "txTp",
    "instrmTp",
    "txNmnlAmt",
    "dealPric",
    "rateTp",
    "dealRate",
    "fltgRateNote",
    "brkrdDeal",
    "callPutOptn",
    "splmtryData"
})
public class UnsecuredMarketTransaction3 {

    @XmlElement(name = "RptdTxSts", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionOperationType1Code rptdTxSts;
    @XmlElement(name = "BrnchId")
    protected String brnchId;
    @XmlElement(name = "UnqTxIdr")
    protected String unqTxIdr;
    @XmlElement(name = "PrtryTxId", required = true)
    protected String prtryTxId;
    @XmlElement(name = "CtrPtyPrtryTxId")
    protected String ctrPtyPrtryTxId;
    @XmlElement(name = "CtrPtyId", required = true)
    protected CounterpartyIdentification2Choice ctrPtyId;
    @XmlElement(name = "TradDt", required = true)
    protected DateAndDateTimeChoice tradDt;
    @XmlElement(name = "SttlmDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar sttlmDt;
    @XmlElement(name = "MtrtyDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar mtrtyDt;
    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected MoneyMarketTransactionType1Code txTp;
    @XmlElement(name = "InstrmTp", required = true)
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentProductType1Code instrmTp;
    @XmlElement(name = "TxNmnlAmt", required = true)
    protected ActiveCurrencyAndAmount txNmnlAmt;
    @XmlElement(name = "DealPric", required = true)
    protected BigDecimal dealPric;
    @XmlElement(name = "RateTp", required = true)
    @XmlSchemaType(name = "string")
    protected InterestRateType1Code rateTp;
    @XmlElement(name = "DealRate")
    protected Rate2 dealRate;
    @XmlElement(name = "FltgRateNote")
    protected FloatingRateNote2 fltgRateNote;
    @XmlElement(name = "BrkrdDeal")
    @XmlSchemaType(name = "string")
    protected BrokeredDeal1Code brkrdDeal;
    @XmlElement(name = "CallPutOptn")
    protected List<Option12> callPutOptn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptdTxSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionOperationType1Code }
     *     
     */
    public TransactionOperationType1Code getRptdTxSts() {
        return rptdTxSts;
    }

    /**
     * Sets the value of the rptdTxSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionOperationType1Code }
     *     
     */
    public UnsecuredMarketTransaction3 setRptdTxSts(TransactionOperationType1Code value) {
        this.rptdTxSts = value;
        return this;
    }

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnsecuredMarketTransaction3 setBrnchId(String value) {
        this.brnchId = value;
        return this;
    }

    /**
     * Gets the value of the unqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTxIdr() {
        return unqTxIdr;
    }

    /**
     * Sets the value of the unqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnsecuredMarketTransaction3 setUnqTxIdr(String value) {
        this.unqTxIdr = value;
        return this;
    }

    /**
     * Gets the value of the prtryTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryTxId() {
        return prtryTxId;
    }

    /**
     * Sets the value of the prtryTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnsecuredMarketTransaction3 setPrtryTxId(String value) {
        this.prtryTxId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyPrtryTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtyPrtryTxId() {
        return ctrPtyPrtryTxId;
    }

    /**
     * Sets the value of the ctrPtyPrtryTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnsecuredMarketTransaction3 setCtrPtyPrtryTxId(String value) {
        this.ctrPtyPrtryTxId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyIdentification2Choice }
     *     
     */
    public CounterpartyIdentification2Choice getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyIdentification2Choice }
     *     
     */
    public UnsecuredMarketTransaction3 setCtrPtyId(CounterpartyIdentification2Choice value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public UnsecuredMarketTransaction3 setTradDt(DateAndDateTimeChoice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnsecuredMarketTransaction3 setSttlmDt(Calendar value) {
        this.sttlmDt = value;
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
    public Calendar getMtrtyDt() {
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
    public UnsecuredMarketTransaction3 setMtrtyDt(Calendar value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketTransactionType1Code }
     *     
     */
    public MoneyMarketTransactionType1Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketTransactionType1Code }
     *     
     */
    public UnsecuredMarketTransaction3 setTxTp(MoneyMarketTransactionType1Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the instrmTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentProductType1Code }
     *     
     */
    public FinancialInstrumentProductType1Code getInstrmTp() {
        return instrmTp;
    }

    /**
     * Sets the value of the instrmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentProductType1Code }
     *     
     */
    public UnsecuredMarketTransaction3 setInstrmTp(FinancialInstrumentProductType1Code value) {
        this.instrmTp = value;
        return this;
    }

    /**
     * Gets the value of the txNmnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTxNmnlAmt() {
        return txNmnlAmt;
    }

    /**
     * Sets the value of the txNmnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public UnsecuredMarketTransaction3 setTxNmnlAmt(ActiveCurrencyAndAmount value) {
        this.txNmnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public UnsecuredMarketTransaction3 setDealPric(BigDecimal value) {
        this.dealPric = value;
        return this;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateType1Code }
     *     
     */
    public InterestRateType1Code getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateType1Code }
     *     
     */
    public UnsecuredMarketTransaction3 setRateTp(InterestRateType1Code value) {
        this.rateTp = value;
        return this;
    }

    /**
     * Gets the value of the dealRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getDealRate() {
        return dealRate;
    }

    /**
     * Sets the value of the dealRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public UnsecuredMarketTransaction3 setDealRate(Rate2 value) {
        this.dealRate = value;
        return this;
    }

    /**
     * Gets the value of the fltgRateNote property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateNote2 }
     *     
     */
    public FloatingRateNote2 getFltgRateNote() {
        return fltgRateNote;
    }

    /**
     * Sets the value of the fltgRateNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateNote2 }
     *     
     */
    public UnsecuredMarketTransaction3 setFltgRateNote(FloatingRateNote2 value) {
        this.fltgRateNote = value;
        return this;
    }

    /**
     * Gets the value of the brkrdDeal property.
     * 
     * @return
     *     possible object is
     *     {@link BrokeredDeal1Code }
     *     
     */
    public BrokeredDeal1Code getBrkrdDeal() {
        return brkrdDeal;
    }

    /**
     * Sets the value of the brkrdDeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokeredDeal1Code }
     *     
     */
    public UnsecuredMarketTransaction3 setBrkrdDeal(BrokeredDeal1Code value) {
        this.brkrdDeal = value;
        return this;
    }

    /**
     * Gets the value of the callPutOptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the callPutOptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallPutOptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Option12 }
     * 
     * 
     * @return
     *     The value of the callPutOptn property.
     */
    public List<Option12> getCallPutOptn() {
        if (callPutOptn == null) {
            callPutOptn = new ArrayList<>();
        }
        return this.callPutOptn;
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
     * Adds a new item to the callPutOptn list.
     * @see #getCallPutOptn()
     * 
     */
    public UnsecuredMarketTransaction3 addCallPutOptn(Option12 callPutOptn) {
        getCallPutOptn().add(callPutOptn);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public UnsecuredMarketTransaction3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
