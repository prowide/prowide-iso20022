
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
 * Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Debt1", propOrder = {
    "faceAmt",
    "pmtFrqcy",
    "dtdDt",
    "frstPmtDt",
    "mtrtyDt",
    "nxtCpnDt",
    "putblDt",
    "nxtCllblDt",
    "nxtFctrDt",
    "dayCntBsis",
    "pmtDrctnInd",
    "intrstRate",
    "nxtIntrstRate",
    "oddCpnInd",
    "cllblInd",
    "cpPrgm",
    "cpRegnTp",
    "intrstAcrlDt",
    "putblInd",
    "convtblInd",
    "preFnddInd",
    "escrwdInd",
    "perptlInd",
    "subrdntdInd",
    "xtndblInd",
    "xtndblPrd",
    "varblRateInd",
    "overAlltmtAmt",
    "overAlltmtRate",
    "amtsblInd",
    "intrstClctnMtd",
    "cptlsdIntrst",
    "actlDnmtnAmt",
    "curFctr",
    "nxtFctr",
    "prvsFctr",
    "convsPrd",
    "convsRatioDnmtr",
    "convsRatioNmrtr",
    "pcs",
    "plsMax",
    "plsPerMln",
    "plsPerLot",
    "plsPerTrad",
    "cstPrePmtPnltyInd",
    "lotId",
    "prePmtSpd",
    "cstPrePmtYld",
    "wghtdAvrgCpn",
    "wghtdAvrgLife",
    "wghtdAvrgLn",
    "wghtdAvrgMtrty",
    "insrdInd",
    "bkQlfdInd",
    "varblIntrstDtls",
    "yldDtls"
})
public class Debt1 {

    @XmlElement(name = "FaceAmt")
    protected ActiveCurrencyAndAmount faceAmt;
    @XmlElement(name = "PmtFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code pmtFrqcy;
    @XmlElement(name = "DtdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtdDt;
    @XmlElement(name = "FrstPmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frstPmtDt;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "NxtCpnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nxtCpnDt;
    @XmlElement(name = "PutblDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar putblDt;
    @XmlElement(name = "NxtCllblDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nxtCllblDt;
    @XmlElement(name = "NxtFctrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nxtFctrDt;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethod1Choice dayCntBsis;
    @XmlElement(name = "PmtDrctnInd")
    protected Boolean pmtDrctnInd;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "NxtIntrstRate")
    protected BigDecimal nxtIntrstRate;
    @XmlElement(name = "OddCpnInd")
    protected Boolean oddCpnInd;
    @XmlElement(name = "CllblInd")
    protected Boolean cllblInd;
    @XmlElement(name = "CPPrgm")
    protected BigDecimal cpPrgm;
    @XmlElement(name = "CPRegnTp")
    protected String cpRegnTp;
    @XmlElement(name = "IntrstAcrlDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar intrstAcrlDt;
    @XmlElement(name = "PutblInd")
    protected Boolean putblInd;
    @XmlElement(name = "ConvtblInd")
    protected Boolean convtblInd;
    @XmlElement(name = "PreFnddInd")
    protected Boolean preFnddInd;
    @XmlElement(name = "EscrwdInd")
    protected Boolean escrwdInd;
    @XmlElement(name = "PerptlInd")
    protected Boolean perptlInd;
    @XmlElement(name = "SubrdntdInd")
    protected Boolean subrdntdInd;
    @XmlElement(name = "XtndblInd")
    protected Boolean xtndblInd;
    @XmlElement(name = "XtndblPrd")
    protected DateTimePeriodChoice xtndblPrd;
    @XmlElement(name = "VarblRateInd")
    protected Boolean varblRateInd;
    @XmlElement(name = "OverAlltmtAmt")
    protected ActiveCurrencyAndAmount overAlltmtAmt;
    @XmlElement(name = "OverAlltmtRate")
    protected BigDecimal overAlltmtRate;
    @XmlElement(name = "AmtsblInd")
    protected Boolean amtsblInd;
    @XmlElement(name = "IntrstClctnMtd")
    protected String intrstClctnMtd;
    @XmlElement(name = "CptlsdIntrst")
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code cptlsdIntrst;
    @XmlElement(name = "ActlDnmtnAmt")
    protected List<ActiveCurrencyAndAmount> actlDnmtnAmt;
    @XmlElement(name = "CurFctr")
    protected BigDecimal curFctr;
    @XmlElement(name = "NxtFctr")
    protected BigDecimal nxtFctr;
    @XmlElement(name = "PrvsFctr")
    protected BigDecimal prvsFctr;
    @XmlElement(name = "ConvsPrd")
    protected DateTimePeriodDetails convsPrd;
    @XmlElement(name = "ConvsRatioDnmtr")
    protected FinancialInstrumentQuantityChoice convsRatioDnmtr;
    @XmlElement(name = "ConvsRatioNmrtr")
    protected FinancialInstrumentQuantityChoice convsRatioNmrtr;
    @XmlElement(name = "Pcs")
    protected BigDecimal pcs;
    @XmlElement(name = "PlsMax")
    protected BigDecimal plsMax;
    @XmlElement(name = "PlsPerMln")
    protected BigDecimal plsPerMln;
    @XmlElement(name = "PlsPerLot")
    protected BigDecimal plsPerLot;
    @XmlElement(name = "PlsPerTrad")
    protected BigDecimal plsPerTrad;
    @XmlElement(name = "CstPrePmtPnltyInd")
    protected boolean cstPrePmtPnltyInd;
    @XmlElement(name = "LotId")
    protected String lotId;
    @XmlElement(name = "PrePmtSpd")
    protected PrePaymentSpeed1 prePmtSpd;
    @XmlElement(name = "CstPrePmtYld")
    protected BigDecimal cstPrePmtYld;
    @XmlElement(name = "WghtdAvrgCpn")
    protected BigDecimal wghtdAvrgCpn;
    @XmlElement(name = "WghtdAvrgLife")
    protected BigDecimal wghtdAvrgLife;
    @XmlElement(name = "WghtdAvrgLn")
    protected BigDecimal wghtdAvrgLn;
    @XmlElement(name = "WghtdAvrgMtrty")
    protected BigDecimal wghtdAvrgMtrty;
    @XmlElement(name = "InsrdInd")
    protected Boolean insrdInd;
    @XmlElement(name = "BkQlfdInd")
    protected Boolean bkQlfdInd;
    @XmlElement(name = "VarblIntrstDtls")
    protected InterestChange1 varblIntrstDtls;
    @XmlElement(name = "YldDtls")
    protected YieldCalculation1 yldDtls;

    /**
     * Gets the value of the faceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFaceAmt() {
        return faceAmt;
    }

    /**
     * Sets the value of the faceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Debt1 setFaceAmt(ActiveCurrencyAndAmount value) {
        this.faceAmt = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public Debt1 setPmtFrqcy(Frequency1Code value) {
        this.pmtFrqcy = value;
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
    public XMLGregorianCalendar getDtdDt() {
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
    public Debt1 setDtdDt(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getFrstPmtDt() {
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
    public Debt1 setFrstPmtDt(XMLGregorianCalendar value) {
        this.frstPmtDt = value;
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
    public XMLGregorianCalendar getMtrtyDt() {
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
    public Debt1 setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the nxtCpnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getNxtCpnDt() {
        return nxtCpnDt;
    }

    /**
     * Sets the value of the nxtCpnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Debt1 setNxtCpnDt(XMLGregorianCalendar value) {
        this.nxtCpnDt = value;
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
    public XMLGregorianCalendar getPutblDt() {
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
    public Debt1 setPutblDt(XMLGregorianCalendar value) {
        this.putblDt = value;
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
    public XMLGregorianCalendar getNxtCllblDt() {
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
    public Debt1 setNxtCllblDt(XMLGregorianCalendar value) {
        this.nxtCllblDt = value;
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
    public XMLGregorianCalendar getNxtFctrDt() {
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
    public Debt1 setNxtFctrDt(XMLGregorianCalendar value) {
        this.nxtFctrDt = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod1Choice }
     *     
     */
    public InterestComputationMethod1Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod1Choice }
     *     
     */
    public Debt1 setDayCntBsis(InterestComputationMethod1Choice value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the pmtDrctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtDrctnInd() {
        return pmtDrctnInd;
    }

    /**
     * Sets the value of the pmtDrctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt1 setPmtDrctnInd(Boolean value) {
        this.pmtDrctnInd = value;
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
    public Debt1 setIntrstRate(BigDecimal value) {
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
    public Debt1 setNxtIntrstRate(BigDecimal value) {
        this.nxtIntrstRate = value;
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
    public Debt1 setOddCpnInd(Boolean value) {
        this.oddCpnInd = value;
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
    public Debt1 setCllblInd(Boolean value) {
        this.cllblInd = value;
        return this;
    }

    /**
     * Gets the value of the cpPrgm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCPPrgm() {
        return cpPrgm;
    }

    /**
     * Sets the value of the cpPrgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt1 setCPPrgm(BigDecimal value) {
        this.cpPrgm = value;
        return this;
    }

    /**
     * Gets the value of the cpRegnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPRegnTp() {
        return cpRegnTp;
    }

    /**
     * Sets the value of the cpRegnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Debt1 setCPRegnTp(String value) {
        this.cpRegnTp = value;
        return this;
    }

    /**
     * Gets the value of the intrstAcrlDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getIntrstAcrlDt() {
        return intrstAcrlDt;
    }

    /**
     * Sets the value of the intrstAcrlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Debt1 setIntrstAcrlDt(XMLGregorianCalendar value) {
        this.intrstAcrlDt = value;
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
    public Debt1 setPutblInd(Boolean value) {
        this.putblInd = value;
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
    public Debt1 setConvtblInd(Boolean value) {
        this.convtblInd = value;
        return this;
    }

    /**
     * Gets the value of the preFnddInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreFnddInd() {
        return preFnddInd;
    }

    /**
     * Sets the value of the preFnddInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt1 setPreFnddInd(Boolean value) {
        this.preFnddInd = value;
        return this;
    }

    /**
     * Gets the value of the escrwdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscrwdInd() {
        return escrwdInd;
    }

    /**
     * Sets the value of the escrwdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt1 setEscrwdInd(Boolean value) {
        this.escrwdInd = value;
        return this;
    }

    /**
     * Gets the value of the perptlInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerptlInd() {
        return perptlInd;
    }

    /**
     * Sets the value of the perptlInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt1 setPerptlInd(Boolean value) {
        this.perptlInd = value;
        return this;
    }

    /**
     * Gets the value of the subrdntdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubrdntdInd() {
        return subrdntdInd;
    }

    /**
     * Sets the value of the subrdntdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt1 setSubrdntdInd(Boolean value) {
        this.subrdntdInd = value;
        return this;
    }

    /**
     * Gets the value of the xtndblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXtndblInd() {
        return xtndblInd;
    }

    /**
     * Sets the value of the xtndblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt1 setXtndblInd(Boolean value) {
        this.xtndblInd = value;
        return this;
    }

    /**
     * Gets the value of the xtndblPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public DateTimePeriodChoice getXtndblPrd() {
        return xtndblPrd;
    }

    /**
     * Sets the value of the xtndblPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public Debt1 setXtndblPrd(DateTimePeriodChoice value) {
        this.xtndblPrd = value;
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
    public Debt1 setVarblRateInd(Boolean value) {
        this.varblRateInd = value;
        return this;
    }

    /**
     * Gets the value of the overAlltmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOverAlltmtAmt() {
        return overAlltmtAmt;
    }

    /**
     * Sets the value of the overAlltmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Debt1 setOverAlltmtAmt(ActiveCurrencyAndAmount value) {
        this.overAlltmtAmt = value;
        return this;
    }

    /**
     * Gets the value of the overAlltmtRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverAlltmtRate() {
        return overAlltmtRate;
    }

    /**
     * Sets the value of the overAlltmtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt1 setOverAlltmtRate(BigDecimal value) {
        this.overAlltmtRate = value;
        return this;
    }

    /**
     * Gets the value of the amtsblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmtsblInd() {
        return amtsblInd;
    }

    /**
     * Sets the value of the amtsblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt1 setAmtsblInd(Boolean value) {
        this.amtsblInd = value;
        return this;
    }

    /**
     * Gets the value of the intrstClctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstClctnMtd() {
        return intrstClctnMtd;
    }

    /**
     * Sets the value of the intrstClctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Debt1 setIntrstClctnMtd(String value) {
        this.intrstClctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the cptlsdIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public DistributionPolicy1Code getCptlsdIntrst() {
        return cptlsdIntrst;
    }

    /**
     * Sets the value of the cptlsdIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public Debt1 setCptlsdIntrst(DistributionPolicy1Code value) {
        this.cptlsdIntrst = value;
        return this;
    }

    /**
     * Gets the value of the actlDnmtnAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actlDnmtnAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActlDnmtnAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveCurrencyAndAmount }
     * 
     * 
     */
    public List<ActiveCurrencyAndAmount> getActlDnmtnAmt() {
        if (actlDnmtnAmt == null) {
            actlDnmtnAmt = new ArrayList<ActiveCurrencyAndAmount>();
        }
        return this.actlDnmtnAmt;
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
    public Debt1 setCurFctr(BigDecimal value) {
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
    public Debt1 setNxtFctr(BigDecimal value) {
        this.nxtFctr = value;
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
    public Debt1 setPrvsFctr(BigDecimal value) {
        this.prvsFctr = value;
        return this;
    }

    /**
     * Gets the value of the convsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public DateTimePeriodDetails getConvsPrd() {
        return convsPrd;
    }

    /**
     * Sets the value of the convsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public Debt1 setConvsPrd(DateTimePeriodDetails value) {
        this.convsPrd = value;
        return this;
    }

    /**
     * Gets the value of the convsRatioDnmtr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getConvsRatioDnmtr() {
        return convsRatioDnmtr;
    }

    /**
     * Sets the value of the convsRatioDnmtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public Debt1 setConvsRatioDnmtr(FinancialInstrumentQuantityChoice value) {
        this.convsRatioDnmtr = value;
        return this;
    }

    /**
     * Gets the value of the convsRatioNmrtr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getConvsRatioNmrtr() {
        return convsRatioNmrtr;
    }

    /**
     * Sets the value of the convsRatioNmrtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public Debt1 setConvsRatioNmrtr(FinancialInstrumentQuantityChoice value) {
        this.convsRatioNmrtr = value;
        return this;
    }

    /**
     * Gets the value of the pcs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPcs() {
        return pcs;
    }

    /**
     * Sets the value of the pcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt1 setPcs(BigDecimal value) {
        this.pcs = value;
        return this;
    }

    /**
     * Gets the value of the plsMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlsMax() {
        return plsMax;
    }

    /**
     * Sets the value of the plsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt1 setPlsMax(BigDecimal value) {
        this.plsMax = value;
        return this;
    }

    /**
     * Gets the value of the plsPerMln property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlsPerMln() {
        return plsPerMln;
    }

    /**
     * Sets the value of the plsPerMln property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt1 setPlsPerMln(BigDecimal value) {
        this.plsPerMln = value;
        return this;
    }

    /**
     * Gets the value of the plsPerLot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlsPerLot() {
        return plsPerLot;
    }

    /**
     * Sets the value of the plsPerLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt1 setPlsPerLot(BigDecimal value) {
        this.plsPerLot = value;
        return this;
    }

    /**
     * Gets the value of the plsPerTrad property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlsPerTrad() {
        return plsPerTrad;
    }

    /**
     * Sets the value of the plsPerTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt1 setPlsPerTrad(BigDecimal value) {
        this.plsPerTrad = value;
        return this;
    }

    /**
     * Gets the value of the cstPrePmtPnltyInd property.
     * 
     */
    public boolean isCstPrePmtPnltyInd() {
        return cstPrePmtPnltyInd;
    }

    /**
     * Sets the value of the cstPrePmtPnltyInd property.
     * 
     */
    public Debt1 setCstPrePmtPnltyInd(boolean value) {
        this.cstPrePmtPnltyInd = value;
        return this;
    }

    /**
     * Gets the value of the lotId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotId() {
        return lotId;
    }

    /**
     * Sets the value of the lotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Debt1 setLotId(String value) {
        this.lotId = value;
        return this;
    }

    /**
     * Gets the value of the prePmtSpd property.
     * 
     * @return
     *     possible object is
     *     {@link PrePaymentSpeed1 }
     *     
     */
    public PrePaymentSpeed1 getPrePmtSpd() {
        return prePmtSpd;
    }

    /**
     * Sets the value of the prePmtSpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePaymentSpeed1 }
     *     
     */
    public Debt1 setPrePmtSpd(PrePaymentSpeed1 value) {
        this.prePmtSpd = value;
        return this;
    }

    /**
     * Gets the value of the cstPrePmtYld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCstPrePmtYld() {
        return cstPrePmtYld;
    }

    /**
     * Sets the value of the cstPrePmtYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt1 setCstPrePmtYld(BigDecimal value) {
        this.cstPrePmtYld = value;
        return this;
    }

    /**
     * Gets the value of the wghtdAvrgCpn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgCpn() {
        return wghtdAvrgCpn;
    }

    /**
     * Sets the value of the wghtdAvrgCpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt1 setWghtdAvrgCpn(BigDecimal value) {
        this.wghtdAvrgCpn = value;
        return this;
    }

    /**
     * Gets the value of the wghtdAvrgLife property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgLife() {
        return wghtdAvrgLife;
    }

    /**
     * Sets the value of the wghtdAvrgLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt1 setWghtdAvrgLife(BigDecimal value) {
        this.wghtdAvrgLife = value;
        return this;
    }

    /**
     * Gets the value of the wghtdAvrgLn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgLn() {
        return wghtdAvrgLn;
    }

    /**
     * Sets the value of the wghtdAvrgLn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt1 setWghtdAvrgLn(BigDecimal value) {
        this.wghtdAvrgLn = value;
        return this;
    }

    /**
     * Gets the value of the wghtdAvrgMtrty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgMtrty() {
        return wghtdAvrgMtrty;
    }

    /**
     * Sets the value of the wghtdAvrgMtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt1 setWghtdAvrgMtrty(BigDecimal value) {
        this.wghtdAvrgMtrty = value;
        return this;
    }

    /**
     * Gets the value of the insrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrdInd() {
        return insrdInd;
    }

    /**
     * Sets the value of the insrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt1 setInsrdInd(Boolean value) {
        this.insrdInd = value;
        return this;
    }

    /**
     * Gets the value of the bkQlfdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBkQlfdInd() {
        return bkQlfdInd;
    }

    /**
     * Sets the value of the bkQlfdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt1 setBkQlfdInd(Boolean value) {
        this.bkQlfdInd = value;
        return this;
    }

    /**
     * Gets the value of the varblIntrstDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InterestChange1 }
     *     
     */
    public InterestChange1 getVarblIntrstDtls() {
        return varblIntrstDtls;
    }

    /**
     * Sets the value of the varblIntrstDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestChange1 }
     *     
     */
    public Debt1 setVarblIntrstDtls(InterestChange1 value) {
        this.varblIntrstDtls = value;
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
    public Debt1 setYldDtls(YieldCalculation1 value) {
        this.yldDtls = value;
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
     * Adds a new item to the actlDnmtnAmt list.
     * @see #getActlDnmtnAmt()
     * 
     */
    public Debt1 addActlDnmtnAmt(ActiveCurrencyAndAmount actlDnmtnAmt) {
        getActlDnmtnAmt().add(actlDnmtnAmt);
        return this;
    }

}
