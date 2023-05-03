
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
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
 * Elements characterising a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes21", propOrder = {
    "plcOfListg",
    "dayCntBsis",
    "regnForm",
    "pmtFrqcy",
    "pmtSts",
    "pmtDrctn",
    "varblRateChngFrqcy",
    "prefToIncm",
    "clssfctnTp",
    "optnStyle",
    "optnTp",
    "dnmtnCcy",
    "cpnDt",
    "xpryDt",
    "fltgRateFxgDt",
    "mtrtyDt",
    "isseDt",
    "nxtCllblDt",
    "putblDt",
    "dtdDt",
    "frstPmtDt",
    "prvsFctr",
    "curFctr",
    "nxtFctr",
    "intrstRate",
    "nxtIntrstRate",
    "indxRateBsis",
    "cpnAttchdNb",
    "poolNb",
    "qtyBrkdwn",
    "varblRateInd",
    "cllblInd",
    "putblInd",
    "mktOrIndctvPric",
    "exrcPric",
    "sbcptPric",
    "convsPric",
    "strkPric",
    "minNmnlQty",
    "ctrctSz",
    "undrlygFinInstrmId",
    "finInstrmAttrAddtlDtls"
})
public class FinancialInstrumentAttributes21 {

    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification5 plcOfListg;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethodFormat1Choice dayCntBsis;
    @XmlElement(name = "RegnForm")
    protected FormOfSecurity2Choice regnForm;
    @XmlElement(name = "PmtFrqcy")
    protected Frequency3Choice pmtFrqcy;
    @XmlElement(name = "PmtSts")
    protected SecuritiesPaymentStatus2Choice pmtSts;
    @XmlElement(name = "PmtDrctn")
    protected PaymentDirection2Choice pmtDrctn;
    @XmlElement(name = "VarblRateChngFrqcy")
    protected Frequency3Choice varblRateChngFrqcy;
    @XmlElement(name = "PrefToIncm")
    protected PreferenceToIncome2Choice prefToIncm;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType2Choice clssfctnTp;
    @XmlElement(name = "OptnStyle")
    protected OptionStyle4Choice optnStyle;
    @XmlElement(name = "OptnTp")
    protected OptionType2Choice optnTp;
    @XmlElement(name = "DnmtnCcy")
    protected String dnmtnCcy;
    @XmlElement(name = "CpnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate cpnDt;
    @XmlElement(name = "XpryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate xpryDt;
    @XmlElement(name = "FltgRateFxgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fltgRateFxgDt;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate mtrtyDt;
    @XmlElement(name = "IsseDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate isseDt;
    @XmlElement(name = "NxtCllblDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate nxtCllblDt;
    @XmlElement(name = "PutblDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate putblDt;
    @XmlElement(name = "DtdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtdDt;
    @XmlElement(name = "FrstPmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate frstPmtDt;
    @XmlElement(name = "PrvsFctr")
    protected BigDecimal prvsFctr;
    @XmlElement(name = "CurFctr")
    protected BigDecimal curFctr;
    @XmlElement(name = "NxtFctr")
    protected BigDecimal nxtFctr;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "NxtIntrstRate")
    protected BigDecimal nxtIntrstRate;
    @XmlElement(name = "IndxRateBsis")
    protected BigDecimal indxRateBsis;
    @XmlElement(name = "CpnAttchdNb")
    protected Number2Choice cpnAttchdNb;
    @XmlElement(name = "PoolNb")
    protected Number2Choice poolNb;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown5> qtyBrkdwn;
    @XmlElement(name = "VarblRateInd")
    protected Boolean varblRateInd;
    @XmlElement(name = "CllblInd")
    protected Boolean cllblInd;
    @XmlElement(name = "PutblInd")
    protected Boolean putblInd;
    @XmlElement(name = "MktOrIndctvPric")
    protected PriceType1Choice mktOrIndctvPric;
    @XmlElement(name = "ExrcPric")
    protected Price2 exrcPric;
    @XmlElement(name = "SbcptPric")
    protected Price2 sbcptPric;
    @XmlElement(name = "ConvsPric")
    protected Price2 convsPric;
    @XmlElement(name = "StrkPric")
    protected Price2 strkPric;
    @XmlElement(name = "MinNmnlQty")
    protected FinancialInstrumentQuantity1Choice minNmnlQty;
    @XmlElement(name = "CtrctSz")
    protected FinancialInstrumentQuantity1Choice ctrctSz;
    @XmlElement(name = "UndrlygFinInstrmId")
    protected List<SecurityIdentification14> undrlygFinInstrmId;
    @XmlElement(name = "FinInstrmAttrAddtlDtls")
    protected String finInstrmAttrAddtlDtls;

    /**
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification5 }
     *     
     */
    public MarketIdentification5 getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification5 }
     *     
     */
    public FinancialInstrumentAttributes21 setPlcOfListg(MarketIdentification5 value) {
        this.plcOfListg = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat1Choice }
     *     
     */
    public InterestComputationMethodFormat1Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat1Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setDayCntBsis(InterestComputationMethodFormat1Choice value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the regnForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity2Choice }
     *     
     */
    public FormOfSecurity2Choice getRegnForm() {
        return regnForm;
    }

    /**
     * Sets the value of the regnForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity2Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setRegnForm(FormOfSecurity2Choice value) {
        this.regnForm = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency3Choice }
     *     
     */
    public Frequency3Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency3Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setPmtFrqcy(Frequency3Choice value) {
        this.pmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the pmtSts property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesPaymentStatus2Choice }
     *     
     */
    public SecuritiesPaymentStatus2Choice getPmtSts() {
        return pmtSts;
    }

    /**
     * Sets the value of the pmtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesPaymentStatus2Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setPmtSts(SecuritiesPaymentStatus2Choice value) {
        this.pmtSts = value;
        return this;
    }

    /**
     * Gets the value of the pmtDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDirection2Choice }
     *     
     */
    public PaymentDirection2Choice getPmtDrctn() {
        return pmtDrctn;
    }

    /**
     * Sets the value of the pmtDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDirection2Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setPmtDrctn(PaymentDirection2Choice value) {
        this.pmtDrctn = value;
        return this;
    }

    /**
     * Gets the value of the varblRateChngFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency3Choice }
     *     
     */
    public Frequency3Choice getVarblRateChngFrqcy() {
        return varblRateChngFrqcy;
    }

    /**
     * Sets the value of the varblRateChngFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency3Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setVarblRateChngFrqcy(Frequency3Choice value) {
        this.varblRateChngFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the prefToIncm property.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceToIncome2Choice }
     *     
     */
    public PreferenceToIncome2Choice getPrefToIncm() {
        return prefToIncm;
    }

    /**
     * Sets the value of the prefToIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceToIncome2Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setPrefToIncm(PreferenceToIncome2Choice value) {
        this.prefToIncm = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType2Choice }
     *     
     */
    public ClassificationType2Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType2Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setClssfctnTp(ClassificationType2Choice value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the optnStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle4Choice }
     *     
     */
    public OptionStyle4Choice getOptnStyle() {
        return optnStyle;
    }

    /**
     * Sets the value of the optnStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle4Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setOptnStyle(OptionStyle4Choice value) {
        this.optnStyle = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType2Choice }
     *     
     */
    public OptionType2Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType2Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setOptnTp(OptionType2Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the dnmtnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnmtnCcy() {
        return dnmtnCcy;
    }

    /**
     * Sets the value of the dnmtnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes21 setDnmtnCcy(String value) {
        this.dnmtnCcy = value;
        return this;
    }

    /**
     * Gets the value of the cpnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCpnDt() {
        return cpnDt;
    }

    /**
     * Sets the value of the cpnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes21 setCpnDt(LocalDate value) {
        this.cpnDt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes21 setXpryDt(LocalDate value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the fltgRateFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFltgRateFxgDt() {
        return fltgRateFxgDt;
    }

    /**
     * Sets the value of the fltgRateFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes21 setFltgRateFxgDt(LocalDate value) {
        this.fltgRateFxgDt = value;
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
    public FinancialInstrumentAttributes21 setMtrtyDt(LocalDate value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes21 setIsseDt(LocalDate value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the nxtCllblDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getNxtCllblDt() {
        return nxtCllblDt;
    }

    /**
     * Sets the value of the nxtCllblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes21 setNxtCllblDt(LocalDate value) {
        this.nxtCllblDt = value;
        return this;
    }

    /**
     * Gets the value of the putblDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPutblDt() {
        return putblDt;
    }

    /**
     * Sets the value of the putblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes21 setPutblDt(LocalDate value) {
        this.putblDt = value;
        return this;
    }

    /**
     * Gets the value of the dtdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtdDt() {
        return dtdDt;
    }

    /**
     * Sets the value of the dtdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes21 setDtdDt(LocalDate value) {
        this.dtdDt = value;
        return this;
    }

    /**
     * Gets the value of the frstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFrstPmtDt() {
        return frstPmtDt;
    }

    /**
     * Sets the value of the frstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes21 setFrstPmtDt(LocalDate value) {
        this.frstPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the prvsFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrvsFctr() {
        return prvsFctr;
    }

    /**
     * Sets the value of the prvsFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes21 setPrvsFctr(BigDecimal value) {
        this.prvsFctr = value;
        return this;
    }

    /**
     * Gets the value of the curFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurFctr() {
        return curFctr;
    }

    /**
     * Sets the value of the curFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes21 setCurFctr(BigDecimal value) {
        this.curFctr = value;
        return this;
    }

    /**
     * Gets the value of the nxtFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNxtFctr() {
        return nxtFctr;
    }

    /**
     * Sets the value of the nxtFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes21 setNxtFctr(BigDecimal value) {
        this.nxtFctr = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes21 setIntrstRate(BigDecimal value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the nxtIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNxtIntrstRate() {
        return nxtIntrstRate;
    }

    /**
     * Sets the value of the nxtIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes21 setNxtIntrstRate(BigDecimal value) {
        this.nxtIntrstRate = value;
        return this;
    }

    /**
     * Gets the value of the indxRateBsis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndxRateBsis() {
        return indxRateBsis;
    }

    /**
     * Sets the value of the indxRateBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes21 setIndxRateBsis(BigDecimal value) {
        this.indxRateBsis = value;
        return this;
    }

    /**
     * Gets the value of the cpnAttchdNb property.
     * 
     * @return
     *     possible object is
     *     {@link Number2Choice }
     *     
     */
    public Number2Choice getCpnAttchdNb() {
        return cpnAttchdNb;
    }

    /**
     * Sets the value of the cpnAttchdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number2Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setCpnAttchdNb(Number2Choice value) {
        this.cpnAttchdNb = value;
        return this;
    }

    /**
     * Gets the value of the poolNb property.
     * 
     * @return
     *     possible object is
     *     {@link Number2Choice }
     *     
     */
    public Number2Choice getPoolNb() {
        return poolNb;
    }

    /**
     * Sets the value of the poolNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number2Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setPoolNb(Number2Choice value) {
        this.poolNb = value;
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
     * {@link QuantityBreakdown5 }
     * 
     * 
     * @return
     *     The value of the qtyBrkdwn property.
     */
    public List<QuantityBreakdown5> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the varblRateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVarblRateInd() {
        return varblRateInd;
    }

    /**
     * Sets the value of the varblRateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributes21 setVarblRateInd(Boolean value) {
        this.varblRateInd = value;
        return this;
    }

    /**
     * Gets the value of the cllblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCllblInd() {
        return cllblInd;
    }

    /**
     * Sets the value of the cllblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributes21 setCllblInd(Boolean value) {
        this.cllblInd = value;
        return this;
    }

    /**
     * Gets the value of the putblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPutblInd() {
        return putblInd;
    }

    /**
     * Sets the value of the putblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributes21 setPutblInd(Boolean value) {
        this.putblInd = value;
        return this;
    }

    /**
     * Gets the value of the mktOrIndctvPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType1Choice }
     *     
     */
    public PriceType1Choice getMktOrIndctvPric() {
        return mktOrIndctvPric;
    }

    /**
     * Sets the value of the mktOrIndctvPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType1Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setMktOrIndctvPric(PriceType1Choice value) {
        this.mktOrIndctvPric = value;
        return this;
    }

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price2 }
     *     
     */
    public Price2 getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price2 }
     *     
     */
    public FinancialInstrumentAttributes21 setExrcPric(Price2 value) {
        this.exrcPric = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price2 }
     *     
     */
    public Price2 getSbcptPric() {
        return sbcptPric;
    }

    /**
     * Sets the value of the sbcptPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price2 }
     *     
     */
    public FinancialInstrumentAttributes21 setSbcptPric(Price2 value) {
        this.sbcptPric = value;
        return this;
    }

    /**
     * Gets the value of the convsPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price2 }
     *     
     */
    public Price2 getConvsPric() {
        return convsPric;
    }

    /**
     * Sets the value of the convsPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price2 }
     *     
     */
    public FinancialInstrumentAttributes21 setConvsPric(Price2 value) {
        this.convsPric = value;
        return this;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price2 }
     *     
     */
    public Price2 getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price2 }
     *     
     */
    public FinancialInstrumentAttributes21 setStrkPric(Price2 value) {
        this.strkPric = value;
        return this;
    }

    /**
     * Gets the value of the minNmnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinNmnlQty() {
        return minNmnlQty;
    }

    /**
     * Sets the value of the minNmnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setMinNmnlQty(FinancialInstrumentQuantity1Choice value) {
        this.minNmnlQty = value;
        return this;
    }

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentAttributes21 setCtrctSz(FinancialInstrumentQuantity1Choice value) {
        this.ctrctSz = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygFinInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification14 }
     * 
     * 
     * @return
     *     The value of the undrlygFinInstrmId property.
     */
    public List<SecurityIdentification14> getUndrlygFinInstrmId() {
        if (undrlygFinInstrmId == null) {
            undrlygFinInstrmId = new ArrayList<>();
        }
        return this.undrlygFinInstrmId;
    }

    /**
     * Gets the value of the finInstrmAttrAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrmAttrAddtlDtls() {
        return finInstrmAttrAddtlDtls;
    }

    /**
     * Sets the value of the finInstrmAttrAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes21 setFinInstrmAttrAddtlDtls(String value) {
        this.finInstrmAttrAddtlDtls = value;
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
     * Adds a new item to the qtyBrkdwn list.
     * @see #getQtyBrkdwn()
     * 
     */
    public FinancialInstrumentAttributes21 addQtyBrkdwn(QuantityBreakdown5 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmId list.
     * @see #getUndrlygFinInstrmId()
     * 
     */
    public FinancialInstrumentAttributes21 addUndrlygFinInstrmId(SecurityIdentification14 undrlygFinInstrmId) {
        getUndrlygFinInstrmId().add(undrlygFinInstrmId);
        return this;
    }

}
