
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Debt5", propOrder = {
    "pmtCcy",
    "faceAmt",
    "pmtFrqcy",
    "intrstFxgDt",
    "dtdDt",
    "frstPmtDt",
    "mtrtyDt",
    "nxtCpnDt",
    "putblDt",
    "nxtCllblDt",
    "nxtFctrDt",
    "xprtnDt",
    "pmtDrctnInd",
    "intrstRate",
    "nxtIntrstRate",
    "oddCpnInd",
    "cllblInd",
    "cpPrgm",
    "cpRegnTp",
    "intrstAcrlDt",
    "putblInd",
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
    "pcs",
    "plsMax",
    "plsPerMln",
    "plsPerLot",
    "plsPerTrad",
    "cstPrePmtPnltyInd",
    "lotId",
    "cstPrePmtYld",
    "wghtdAvrgCpn",
    "wghtdAvrgLife",
    "wghtdAvrgLn",
    "wghtdAvrgMtrty",
    "insrdInd",
    "bkQlfdInd",
    "yldClctn",
    "intrstTp",
    "instrmStrTp",
    "gblTp",
    "potntlEuroSysElgblty",
    "geogcs",
    "yldRg",
    "cpnRg",
    "purp",
    "altrntvMinTaxInd",
    "autoRinvstmt",
    "hrcut",
    "txConds",
    "lookBck",
    "maxSbstitn",
    "minIncrmt",
    "minQty",
    "pdctn",
    "rstrctdInd",
    "pricFrqcy",
    "sctr",
    "sbstitnFrqcy",
    "sbstitnLft",
    "whlPoolInd",
    "pricSrc",
    "pricRg"
})
public class Debt5 {

    @XmlElement(name = "PmtCcy")
    protected String pmtCcy;
    @XmlElement(name = "FaceAmt")
    protected ActiveCurrencyAndAmount faceAmt;
    @XmlElement(name = "PmtFrqcy")
    protected Frequency35Choice pmtFrqcy;
    @XmlElement(name = "IntrstFxgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime intrstFxgDt;
    @XmlElement(name = "DtdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dtdDt;
    @XmlElement(name = "FrstPmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime frstPmtDt;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime mtrtyDt;
    @XmlElement(name = "NxtCpnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime nxtCpnDt;
    @XmlElement(name = "PutblDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime putblDt;
    @XmlElement(name = "NxtCllblDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime nxtCllblDt;
    @XmlElement(name = "NxtFctrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime nxtFctrDt;
    @XmlElement(name = "XprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime xprtnDt;
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
    protected OffsetDateTime intrstAcrlDt;
    @XmlElement(name = "PutblInd")
    protected Boolean putblInd;
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
    protected DateTimePeriod1Choice xtndblPrd;
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
    protected DistributionPolicy2Choice cptlsdIntrst;
    @XmlElement(name = "ActlDnmtnAmt")
    protected List<ActiveCurrencyAndAmount> actlDnmtnAmt;
    @XmlElement(name = "CurFctr")
    protected BigDecimal curFctr;
    @XmlElement(name = "NxtFctr")
    protected BigDecimal nxtFctr;
    @XmlElement(name = "PrvsFctr")
    protected BigDecimal prvsFctr;
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
    protected Boolean cstPrePmtPnltyInd;
    @XmlElement(name = "LotId")
    protected String lotId;
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
    @XmlElement(name = "YldClctn")
    protected List<YieldCalculation6> yldClctn;
    @XmlElement(name = "IntrstTp")
    @XmlSchemaType(name = "string")
    protected InterestType3Code intrstTp;
    @XmlElement(name = "InstrmStrTp")
    protected InstrumentSubStructureType2Choice instrmStrTp;
    @XmlElement(name = "GblTp")
    protected GlobalNote2Choice gblTp;
    @XmlElement(name = "PotntlEuroSysElgblty")
    protected Boolean potntlEuroSysElgblty;
    @XmlElement(name = "Geogcs")
    protected String geogcs;
    @XmlElement(name = "YldRg")
    protected AmountOrPercentageRange1 yldRg;
    @XmlElement(name = "CpnRg")
    protected AmountOrPercentageRange1 cpnRg;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "AltrntvMinTaxInd")
    protected Boolean altrntvMinTaxInd;
    @XmlElement(name = "AutoRinvstmt")
    protected BigDecimal autoRinvstmt;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "TxConds")
    protected TradeTransactionCondition7Choice txConds;
    @XmlElement(name = "LookBck")
    protected BigDecimal lookBck;
    @XmlElement(name = "MaxSbstitn")
    protected BigDecimal maxSbstitn;
    @XmlElement(name = "MinIncrmt")
    protected FinancialInstrumentQuantity1Choice minIncrmt;
    @XmlElement(name = "MinQty")
    protected FinancialInstrumentQuantity1Choice minQty;
    @XmlElement(name = "Pdctn")
    protected String pdctn;
    @XmlElement(name = "RstrctdInd")
    protected Boolean rstrctdInd;
    @XmlElement(name = "PricFrqcy")
    protected Frequency35Choice pricFrqcy;
    @XmlElement(name = "Sctr")
    protected String sctr;
    @XmlElement(name = "SbstitnFrqcy")
    protected Frequency35Choice sbstitnFrqcy;
    @XmlElement(name = "SbstitnLft")
    protected BigDecimal sbstitnLft;
    @XmlElement(name = "WhlPoolInd")
    protected Boolean whlPoolInd;
    @XmlElement(name = "PricSrc")
    protected String pricSrc;
    @XmlElement(name = "PricRg")
    protected AmountOrPercentageRange1 pricRg;

    /**
     * Gets the value of the pmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtCcy() {
        return pmtCcy;
    }

    /**
     * Sets the value of the pmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Debt5 setPmtCcy(String value) {
        this.pmtCcy = value;
        return this;
    }

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
    public Debt5 setFaceAmt(ActiveCurrencyAndAmount value) {
        this.faceAmt = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency35Choice }
     *     
     */
    public Frequency35Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency35Choice }
     *     
     */
    public Debt5 setPmtFrqcy(Frequency35Choice value) {
        this.pmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the intrstFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getIntrstFxgDt() {
        return intrstFxgDt;
    }

    /**
     * Sets the value of the intrstFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Debt5 setIntrstFxgDt(OffsetDateTime value) {
        this.intrstFxgDt = value;
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
    public OffsetDateTime getDtdDt() {
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
    public Debt5 setDtdDt(OffsetDateTime value) {
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
    public OffsetDateTime getFrstPmtDt() {
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
    public Debt5 setFrstPmtDt(OffsetDateTime value) {
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
    public OffsetDateTime getMtrtyDt() {
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
    public Debt5 setMtrtyDt(OffsetDateTime value) {
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
    public OffsetDateTime getNxtCpnDt() {
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
    public Debt5 setNxtCpnDt(OffsetDateTime value) {
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
    public OffsetDateTime getPutblDt() {
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
    public Debt5 setPutblDt(OffsetDateTime value) {
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
    public OffsetDateTime getNxtCllblDt() {
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
    public Debt5 setNxtCllblDt(OffsetDateTime value) {
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
    public OffsetDateTime getNxtFctrDt() {
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
    public Debt5 setNxtFctrDt(OffsetDateTime value) {
        this.nxtFctrDt = value;
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
    public OffsetDateTime getXprtnDt() {
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
    public Debt5 setXprtnDt(OffsetDateTime value) {
        this.xprtnDt = value;
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
    public Debt5 setPmtDrctnInd(Boolean value) {
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
    public Debt5 setIntrstRate(BigDecimal value) {
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
    public Debt5 setNxtIntrstRate(BigDecimal value) {
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
    public Debt5 setOddCpnInd(Boolean value) {
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
    public Debt5 setCllblInd(Boolean value) {
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
    public Debt5 setCPPrgm(BigDecimal value) {
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
    public Debt5 setCPRegnTp(String value) {
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
    public OffsetDateTime getIntrstAcrlDt() {
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
    public Debt5 setIntrstAcrlDt(OffsetDateTime value) {
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
    public Debt5 setPutblInd(Boolean value) {
        this.putblInd = value;
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
    public Debt5 setPreFnddInd(Boolean value) {
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
    public Debt5 setEscrwdInd(Boolean value) {
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
    public Debt5 setPerptlInd(Boolean value) {
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
    public Debt5 setSubrdntdInd(Boolean value) {
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
    public Debt5 setXtndblInd(Boolean value) {
        this.xtndblInd = value;
        return this;
    }

    /**
     * Gets the value of the xtndblPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getXtndblPrd() {
        return xtndblPrd;
    }

    /**
     * Sets the value of the xtndblPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public Debt5 setXtndblPrd(DateTimePeriod1Choice value) {
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
    public Debt5 setVarblRateInd(Boolean value) {
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
    public Debt5 setOverAlltmtAmt(ActiveCurrencyAndAmount value) {
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
    public Debt5 setOverAlltmtRate(BigDecimal value) {
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
    public Debt5 setAmtsblInd(Boolean value) {
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
    public Debt5 setIntrstClctnMtd(String value) {
        this.intrstClctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the cptlsdIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy2Choice }
     *     
     */
    public DistributionPolicy2Choice getCptlsdIntrst() {
        return cptlsdIntrst;
    }

    /**
     * Sets the value of the cptlsdIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy2Choice }
     *     
     */
    public Debt5 setCptlsdIntrst(DistributionPolicy2Choice value) {
        this.cptlsdIntrst = value;
        return this;
    }

    /**
     * Gets the value of the actlDnmtnAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actlDnmtnAmt property.
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
     * @return
     *     The value of the actlDnmtnAmt property.
     */
    public List<ActiveCurrencyAndAmount> getActlDnmtnAmt() {
        if (actlDnmtnAmt == null) {
            actlDnmtnAmt = new ArrayList<>();
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
    public Debt5 setCurFctr(BigDecimal value) {
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
    public Debt5 setNxtFctr(BigDecimal value) {
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
    public Debt5 setPrvsFctr(BigDecimal value) {
        this.prvsFctr = value;
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
    public Debt5 setPcs(BigDecimal value) {
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
    public Debt5 setPlsMax(BigDecimal value) {
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
    public Debt5 setPlsPerMln(BigDecimal value) {
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
    public Debt5 setPlsPerLot(BigDecimal value) {
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
    public Debt5 setPlsPerTrad(BigDecimal value) {
        this.plsPerTrad = value;
        return this;
    }

    /**
     * Gets the value of the cstPrePmtPnltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstPrePmtPnltyInd() {
        return cstPrePmtPnltyInd;
    }

    /**
     * Sets the value of the cstPrePmtPnltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt5 setCstPrePmtPnltyInd(Boolean value) {
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
    public Debt5 setLotId(String value) {
        this.lotId = value;
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
    public Debt5 setCstPrePmtYld(BigDecimal value) {
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
    public Debt5 setWghtdAvrgCpn(BigDecimal value) {
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
    public Debt5 setWghtdAvrgLife(BigDecimal value) {
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
    public Debt5 setWghtdAvrgLn(BigDecimal value) {
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
    public Debt5 setWghtdAvrgMtrty(BigDecimal value) {
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
    public Debt5 setInsrdInd(Boolean value) {
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
    public Debt5 setBkQlfdInd(Boolean value) {
        this.bkQlfdInd = value;
        return this;
    }

    /**
     * Gets the value of the yldClctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the yldClctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYldClctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YieldCalculation6 }
     * 
     * 
     * @return
     *     The value of the yldClctn property.
     */
    public List<YieldCalculation6> getYldClctn() {
        if (yldClctn == null) {
            yldClctn = new ArrayList<>();
        }
        return this.yldClctn;
    }

    /**
     * Gets the value of the intrstTp property.
     * 
     * @return
     *     possible object is
     *     {@link InterestType3Code }
     *     
     */
    public InterestType3Code getIntrstTp() {
        return intrstTp;
    }

    /**
     * Sets the value of the intrstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestType3Code }
     *     
     */
    public Debt5 setIntrstTp(InterestType3Code value) {
        this.intrstTp = value;
        return this;
    }

    /**
     * Gets the value of the instrmStrTp property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentSubStructureType2Choice }
     *     
     */
    public InstrumentSubStructureType2Choice getInstrmStrTp() {
        return instrmStrTp;
    }

    /**
     * Sets the value of the instrmStrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentSubStructureType2Choice }
     *     
     */
    public Debt5 setInstrmStrTp(InstrumentSubStructureType2Choice value) {
        this.instrmStrTp = value;
        return this;
    }

    /**
     * Gets the value of the gblTp property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalNote2Choice }
     *     
     */
    public GlobalNote2Choice getGblTp() {
        return gblTp;
    }

    /**
     * Sets the value of the gblTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalNote2Choice }
     *     
     */
    public Debt5 setGblTp(GlobalNote2Choice value) {
        this.gblTp = value;
        return this;
    }

    /**
     * Gets the value of the potntlEuroSysElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPotntlEuroSysElgblty() {
        return potntlEuroSysElgblty;
    }

    /**
     * Sets the value of the potntlEuroSysElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt5 setPotntlEuroSysElgblty(Boolean value) {
        this.potntlEuroSysElgblty = value;
        return this;
    }

    /**
     * Gets the value of the geogcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcs() {
        return geogcs;
    }

    /**
     * Sets the value of the geogcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Debt5 setGeogcs(String value) {
        this.geogcs = value;
        return this;
    }

    /**
     * Gets the value of the yldRg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentageRange1 }
     *     
     */
    public AmountOrPercentageRange1 getYldRg() {
        return yldRg;
    }

    /**
     * Sets the value of the yldRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentageRange1 }
     *     
     */
    public Debt5 setYldRg(AmountOrPercentageRange1 value) {
        this.yldRg = value;
        return this;
    }

    /**
     * Gets the value of the cpnRg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentageRange1 }
     *     
     */
    public AmountOrPercentageRange1 getCpnRg() {
        return cpnRg;
    }

    /**
     * Sets the value of the cpnRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentageRange1 }
     *     
     */
    public Debt5 setCpnRg(AmountOrPercentageRange1 value) {
        this.cpnRg = value;
        return this;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Debt5 setPurp(String value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the altrntvMinTaxInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAltrntvMinTaxInd() {
        return altrntvMinTaxInd;
    }

    /**
     * Sets the value of the altrntvMinTaxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt5 setAltrntvMinTaxInd(Boolean value) {
        this.altrntvMinTaxInd = value;
        return this;
    }

    /**
     * Gets the value of the autoRinvstmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAutoRinvstmt() {
        return autoRinvstmt;
    }

    /**
     * Sets the value of the autoRinvstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt5 setAutoRinvstmt(BigDecimal value) {
        this.autoRinvstmt = value;
        return this;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt5 setHrcut(BigDecimal value) {
        this.hrcut = value;
        return this;
    }

    /**
     * Gets the value of the txConds property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCondition7Choice }
     *     
     */
    public TradeTransactionCondition7Choice getTxConds() {
        return txConds;
    }

    /**
     * Sets the value of the txConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCondition7Choice }
     *     
     */
    public Debt5 setTxConds(TradeTransactionCondition7Choice value) {
        this.txConds = value;
        return this;
    }

    /**
     * Gets the value of the lookBck property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLookBck() {
        return lookBck;
    }

    /**
     * Sets the value of the lookBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt5 setLookBck(BigDecimal value) {
        this.lookBck = value;
        return this;
    }

    /**
     * Gets the value of the maxSbstitn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSbstitn() {
        return maxSbstitn;
    }

    /**
     * Sets the value of the maxSbstitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt5 setMaxSbstitn(BigDecimal value) {
        this.maxSbstitn = value;
        return this;
    }

    /**
     * Gets the value of the minIncrmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinIncrmt() {
        return minIncrmt;
    }

    /**
     * Sets the value of the minIncrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public Debt5 setMinIncrmt(FinancialInstrumentQuantity1Choice value) {
        this.minIncrmt = value;
        return this;
    }

    /**
     * Gets the value of the minQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinQty() {
        return minQty;
    }

    /**
     * Sets the value of the minQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public Debt5 setMinQty(FinancialInstrumentQuantity1Choice value) {
        this.minQty = value;
        return this;
    }

    /**
     * Gets the value of the pdctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctn() {
        return pdctn;
    }

    /**
     * Sets the value of the pdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Debt5 setPdctn(String value) {
        this.pdctn = value;
        return this;
    }

    /**
     * Gets the value of the rstrctdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRstrctdInd() {
        return rstrctdInd;
    }

    /**
     * Sets the value of the rstrctdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt5 setRstrctdInd(Boolean value) {
        this.rstrctdInd = value;
        return this;
    }

    /**
     * Gets the value of the pricFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency35Choice }
     *     
     */
    public Frequency35Choice getPricFrqcy() {
        return pricFrqcy;
    }

    /**
     * Sets the value of the pricFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency35Choice }
     *     
     */
    public Debt5 setPricFrqcy(Frequency35Choice value) {
        this.pricFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the sctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctr() {
        return sctr;
    }

    /**
     * Sets the value of the sctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Debt5 setSctr(String value) {
        this.sctr = value;
        return this;
    }

    /**
     * Gets the value of the sbstitnFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency35Choice }
     *     
     */
    public Frequency35Choice getSbstitnFrqcy() {
        return sbstitnFrqcy;
    }

    /**
     * Sets the value of the sbstitnFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency35Choice }
     *     
     */
    public Debt5 setSbstitnFrqcy(Frequency35Choice value) {
        this.sbstitnFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the sbstitnLft property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSbstitnLft() {
        return sbstitnLft;
    }

    /**
     * Sets the value of the sbstitnLft property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Debt5 setSbstitnLft(BigDecimal value) {
        this.sbstitnLft = value;
        return this;
    }

    /**
     * Gets the value of the whlPoolInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWhlPoolInd() {
        return whlPoolInd;
    }

    /**
     * Sets the value of the whlPoolInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Debt5 setWhlPoolInd(Boolean value) {
        this.whlPoolInd = value;
        return this;
    }

    /**
     * Gets the value of the pricSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricSrc() {
        return pricSrc;
    }

    /**
     * Sets the value of the pricSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Debt5 setPricSrc(String value) {
        this.pricSrc = value;
        return this;
    }

    /**
     * Gets the value of the pricRg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentageRange1 }
     *     
     */
    public AmountOrPercentageRange1 getPricRg() {
        return pricRg;
    }

    /**
     * Sets the value of the pricRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentageRange1 }
     *     
     */
    public Debt5 setPricRg(AmountOrPercentageRange1 value) {
        this.pricRg = value;
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
    public Debt5 addActlDnmtnAmt(ActiveCurrencyAndAmount actlDnmtnAmt) {
        getActlDnmtnAmt().add(actlDnmtnAmt);
        return this;
    }

    /**
     * Adds a new item to the yldClctn list.
     * @see #getYldClctn()
     * 
     */
    public Debt5 addYldClctn(YieldCalculation6 yldClctn) {
        getYldClctn().add(yldClctn);
        return this;
    }

}
