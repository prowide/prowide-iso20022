
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
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
@XmlType(name = "FinancialInstrumentAttributes124", propOrder = {
    "plcOfListg",
    "ratg",
    "certNb",
    "dayCntBsis",
    "regnForm",
    "pmtFrqcy",
    "varblRateChngFrqcy",
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
    "convsDt",
    "putblDt",
    "dtdDt",
    "frstPmtDt",
    "nxtFctrDt",
    "prvsFctr",
    "curFctr",
    "nxtFctr",
    "endFctr",
    "intrstRate",
    "nxtIntrstRate",
    "indxRateBsis",
    "pctgOfDebtClms",
    "cpnAttchdNb",
    "poolNb",
    "vrsnNb",
    "convtblInd",
    "varblRateInd",
    "cvrdInd",
    "cllblInd",
    "putblInd",
    "warrtAttchdOnDlvry",
    "oddCpnInd",
    "redYldImpct",
    "yldVar",
    "exrcPric",
    "sbcptPric",
    "convsPric",
    "taxblIncmPerShr",
    "minNmnlQty",
    "minExrcblQty",
    "minExrcblMltplQty",
    "faceAmt",
    "ctrctSz",
    "finInstrmAttrAddtlDtls"
})
public class FinancialInstrumentAttributes124 {

    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification3Choice plcOfListg;
    @XmlElement(name = "Ratg")
    protected Rating1 ratg;
    @XmlElement(name = "CertNb")
    protected String certNb;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethodFormat4Choice dayCntBsis;
    @XmlElement(name = "RegnForm")
    protected FormOfSecurity6Choice regnForm;
    @XmlElement(name = "PmtFrqcy")
    protected Frequency23Choice pmtFrqcy;
    @XmlElement(name = "VarblRateChngFrqcy")
    protected Frequency23Choice varblRateChngFrqcy;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType32Choice clssfctnTp;
    @XmlElement(name = "OptnStyle")
    protected OptionStyle10Choice optnStyle;
    @XmlElement(name = "OptnTp")
    protected OptionType6Choice optnTp;
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
    @XmlElement(name = "ConvsDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate convsDt;
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
    @XmlElement(name = "NxtFctrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate nxtFctrDt;
    @XmlElement(name = "PrvsFctr")
    protected BigDecimal prvsFctr;
    @XmlElement(name = "CurFctr")
    protected BigDecimal curFctr;
    @XmlElement(name = "NxtFctr")
    protected BigDecimal nxtFctr;
    @XmlElement(name = "EndFctr")
    protected BigDecimal endFctr;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "NxtIntrstRate")
    protected BigDecimal nxtIntrstRate;
    @XmlElement(name = "IndxRateBsis")
    protected BigDecimal indxRateBsis;
    @XmlElement(name = "PctgOfDebtClms")
    protected BigDecimal pctgOfDebtClms;
    @XmlElement(name = "CpnAttchdNb")
    protected Number1Choice cpnAttchdNb;
    @XmlElement(name = "PoolNb")
    protected GenericIdentification37 poolNb;
    @XmlElement(name = "VrsnNb")
    protected Number1Choice vrsnNb;
    @XmlElement(name = "ConvtblInd")
    protected Boolean convtblInd;
    @XmlElement(name = "VarblRateInd")
    protected Boolean varblRateInd;
    @XmlElement(name = "CvrdInd")
    protected Boolean cvrdInd;
    @XmlElement(name = "CllblInd")
    protected Boolean cllblInd;
    @XmlElement(name = "PutblInd")
    protected Boolean putblInd;
    @XmlElement(name = "WarrtAttchdOnDlvry")
    protected Boolean warrtAttchdOnDlvry;
    @XmlElement(name = "OddCpnInd")
    protected Boolean oddCpnInd;
    @XmlElement(name = "RedYldImpct")
    protected Boolean redYldImpct;
    @XmlElement(name = "YldVar")
    protected Boolean yldVar;
    @XmlElement(name = "ExrcPric")
    protected Price14 exrcPric;
    @XmlElement(name = "SbcptPric")
    protected Price14 sbcptPric;
    @XmlElement(name = "ConvsPric")
    protected Price14 convsPric;
    @XmlElement(name = "TaxblIncmPerShr")
    protected Price14 taxblIncmPerShr;
    @XmlElement(name = "MinNmnlQty")
    protected FinancialInstrumentQuantity1Choice minNmnlQty;
    @XmlElement(name = "MinExrcblQty")
    protected FinancialInstrumentQuantity1Choice minExrcblQty;
    @XmlElement(name = "MinExrcblMltplQty")
    protected FinancialInstrumentQuantity1Choice minExrcblMltplQty;
    @XmlElement(name = "FaceAmt")
    protected BigDecimal faceAmt;
    @XmlElement(name = "CtrctSz")
    protected FinancialInstrumentQuantity18Choice ctrctSz;
    @XmlElement(name = "FinInstrmAttrAddtlDtls")
    protected String finInstrmAttrAddtlDtls;

    /**
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification3Choice }
     *     
     */
    public MarketIdentification3Choice getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification3Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setPlcOfListg(MarketIdentification3Choice value) {
        this.plcOfListg = value;
        return this;
    }

    /**
     * Gets the value of the ratg property.
     * 
     * @return
     *     possible object is
     *     {@link Rating1 }
     *     
     */
    public Rating1 getRatg() {
        return ratg;
    }

    /**
     * Sets the value of the ratg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rating1 }
     *     
     */
    public FinancialInstrumentAttributes124 setRatg(Rating1 value) {
        this.ratg = value;
        return this;
    }

    /**
     * Gets the value of the certNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertNb() {
        return certNb;
    }

    /**
     * Sets the value of the certNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes124 setCertNb(String value) {
        this.certNb = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public InterestComputationMethodFormat4Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setDayCntBsis(InterestComputationMethodFormat4Choice value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the regnForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity6Choice }
     *     
     */
    public FormOfSecurity6Choice getRegnForm() {
        return regnForm;
    }

    /**
     * Sets the value of the regnForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity6Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setRegnForm(FormOfSecurity6Choice value) {
        this.regnForm = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency23Choice }
     *     
     */
    public Frequency23Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency23Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setPmtFrqcy(Frequency23Choice value) {
        this.pmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the varblRateChngFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency23Choice }
     *     
     */
    public Frequency23Choice getVarblRateChngFrqcy() {
        return varblRateChngFrqcy;
    }

    /**
     * Sets the value of the varblRateChngFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency23Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setVarblRateChngFrqcy(Frequency23Choice value) {
        this.varblRateChngFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public ClassificationType32Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setClssfctnTp(ClassificationType32Choice value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the optnStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle10Choice }
     *     
     */
    public OptionStyle10Choice getOptnStyle() {
        return optnStyle;
    }

    /**
     * Sets the value of the optnStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle10Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setOptnStyle(OptionStyle10Choice value) {
        this.optnStyle = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType6Choice }
     *     
     */
    public OptionType6Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType6Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setOptnTp(OptionType6Choice value) {
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
    public FinancialInstrumentAttributes124 setDnmtnCcy(String value) {
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
    public FinancialInstrumentAttributes124 setCpnDt(LocalDate value) {
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
    public FinancialInstrumentAttributes124 setXpryDt(LocalDate value) {
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
    public FinancialInstrumentAttributes124 setFltgRateFxgDt(LocalDate value) {
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
    public FinancialInstrumentAttributes124 setMtrtyDt(LocalDate value) {
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
    public FinancialInstrumentAttributes124 setIsseDt(LocalDate value) {
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
    public FinancialInstrumentAttributes124 setNxtCllblDt(LocalDate value) {
        this.nxtCllblDt = value;
        return this;
    }

    /**
     * Gets the value of the convsDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getConvsDt() {
        return convsDt;
    }

    /**
     * Sets the value of the convsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes124 setConvsDt(LocalDate value) {
        this.convsDt = value;
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
    public FinancialInstrumentAttributes124 setPutblDt(LocalDate value) {
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
    public FinancialInstrumentAttributes124 setDtdDt(LocalDate value) {
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
    public FinancialInstrumentAttributes124 setFrstPmtDt(LocalDate value) {
        this.frstPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the nxtFctrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getNxtFctrDt() {
        return nxtFctrDt;
    }

    /**
     * Sets the value of the nxtFctrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes124 setNxtFctrDt(LocalDate value) {
        this.nxtFctrDt = value;
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
    public FinancialInstrumentAttributes124 setPrvsFctr(BigDecimal value) {
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
    public FinancialInstrumentAttributes124 setCurFctr(BigDecimal value) {
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
    public FinancialInstrumentAttributes124 setNxtFctr(BigDecimal value) {
        this.nxtFctr = value;
        return this;
    }

    /**
     * Gets the value of the endFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndFctr() {
        return endFctr;
    }

    /**
     * Sets the value of the endFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes124 setEndFctr(BigDecimal value) {
        this.endFctr = value;
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
    public FinancialInstrumentAttributes124 setIntrstRate(BigDecimal value) {
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
    public FinancialInstrumentAttributes124 setNxtIntrstRate(BigDecimal value) {
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
    public FinancialInstrumentAttributes124 setIndxRateBsis(BigDecimal value) {
        this.indxRateBsis = value;
        return this;
    }

    /**
     * Gets the value of the pctgOfDebtClms property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfDebtClms() {
        return pctgOfDebtClms;
    }

    /**
     * Sets the value of the pctgOfDebtClms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes124 setPctgOfDebtClms(BigDecimal value) {
        this.pctgOfDebtClms = value;
        return this;
    }

    /**
     * Gets the value of the cpnAttchdNb property.
     * 
     * @return
     *     possible object is
     *     {@link Number1Choice }
     *     
     */
    public Number1Choice getCpnAttchdNb() {
        return cpnAttchdNb;
    }

    /**
     * Sets the value of the cpnAttchdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number1Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setCpnAttchdNb(Number1Choice value) {
        this.cpnAttchdNb = value;
        return this;
    }

    /**
     * Gets the value of the poolNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getPoolNb() {
        return poolNb;
    }

    /**
     * Sets the value of the poolNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public FinancialInstrumentAttributes124 setPoolNb(GenericIdentification37 value) {
        this.poolNb = value;
        return this;
    }

    /**
     * Gets the value of the vrsnNb property.
     * 
     * @return
     *     possible object is
     *     {@link Number1Choice }
     *     
     */
    public Number1Choice getVrsnNb() {
        return vrsnNb;
    }

    /**
     * Sets the value of the vrsnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number1Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setVrsnNb(Number1Choice value) {
        this.vrsnNb = value;
        return this;
    }

    /**
     * Gets the value of the convtblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvtblInd() {
        return convtblInd;
    }

    /**
     * Sets the value of the convtblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributes124 setConvtblInd(Boolean value) {
        this.convtblInd = value;
        return this;
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
    public FinancialInstrumentAttributes124 setVarblRateInd(Boolean value) {
        this.varblRateInd = value;
        return this;
    }

    /**
     * Gets the value of the cvrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCvrdInd() {
        return cvrdInd;
    }

    /**
     * Sets the value of the cvrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributes124 setCvrdInd(Boolean value) {
        this.cvrdInd = value;
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
    public FinancialInstrumentAttributes124 setCllblInd(Boolean value) {
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
    public FinancialInstrumentAttributes124 setPutblInd(Boolean value) {
        this.putblInd = value;
        return this;
    }

    /**
     * Gets the value of the warrtAttchdOnDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarrtAttchdOnDlvry() {
        return warrtAttchdOnDlvry;
    }

    /**
     * Sets the value of the warrtAttchdOnDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributes124 setWarrtAttchdOnDlvry(Boolean value) {
        this.warrtAttchdOnDlvry = value;
        return this;
    }

    /**
     * Gets the value of the oddCpnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOddCpnInd() {
        return oddCpnInd;
    }

    /**
     * Sets the value of the oddCpnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributes124 setOddCpnInd(Boolean value) {
        this.oddCpnInd = value;
        return this;
    }

    /**
     * Gets the value of the redYldImpct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedYldImpct() {
        return redYldImpct;
    }

    /**
     * Sets the value of the redYldImpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributes124 setRedYldImpct(Boolean value) {
        this.redYldImpct = value;
        return this;
    }

    /**
     * Gets the value of the yldVar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYldVar() {
        return yldVar;
    }

    /**
     * Sets the value of the yldVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributes124 setYldVar(Boolean value) {
        this.yldVar = value;
        return this;
    }

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public FinancialInstrumentAttributes124 setExrcPric(Price14 value) {
        this.exrcPric = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getSbcptPric() {
        return sbcptPric;
    }

    /**
     * Sets the value of the sbcptPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public FinancialInstrumentAttributes124 setSbcptPric(Price14 value) {
        this.sbcptPric = value;
        return this;
    }

    /**
     * Gets the value of the convsPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getConvsPric() {
        return convsPric;
    }

    /**
     * Sets the value of the convsPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public FinancialInstrumentAttributes124 setConvsPric(Price14 value) {
        this.convsPric = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerShr property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getTaxblIncmPerShr() {
        return taxblIncmPerShr;
    }

    /**
     * Sets the value of the taxblIncmPerShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public FinancialInstrumentAttributes124 setTaxblIncmPerShr(Price14 value) {
        this.taxblIncmPerShr = value;
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
    public FinancialInstrumentAttributes124 setMinNmnlQty(FinancialInstrumentQuantity1Choice value) {
        this.minNmnlQty = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinExrcblQty() {
        return minExrcblQty;
    }

    /**
     * Sets the value of the minExrcblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setMinExrcblQty(FinancialInstrumentQuantity1Choice value) {
        this.minExrcblQty = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblMltplQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinExrcblMltplQty() {
        return minExrcblMltplQty;
    }

    /**
     * Sets the value of the minExrcblMltplQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setMinExrcblMltplQty(FinancialInstrumentQuantity1Choice value) {
        this.minExrcblMltplQty = value;
        return this;
    }

    /**
     * Gets the value of the faceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFaceAmt() {
        return faceAmt;
    }

    /**
     * Sets the value of the faceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes124 setFaceAmt(BigDecimal value) {
        this.faceAmt = value;
        return this;
    }

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentAttributes124 setCtrctSz(FinancialInstrumentQuantity18Choice value) {
        this.ctrctSz = value;
        return this;
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
    public FinancialInstrumentAttributes124 setFinInstrmAttrAddtlDtls(String value) {
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

}
