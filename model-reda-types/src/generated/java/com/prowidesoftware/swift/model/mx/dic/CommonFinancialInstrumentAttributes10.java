
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Tangible items of value to a business.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonFinancialInstrumentAttributes10", propOrder = {
    "sctySts",
    "isoSctyLngNm",
    "isoSctyShrtNm",
    "nmVldFr",
    "dnmtnCcy",
    "certNb",
    "ctrctVrsnNb",
    "cpnAttchdNb",
    "taxLotNb",
    "poolNb",
    "cvrdInd",
    "lglRstrctns",
    "posLmt",
    "nearTermPosLmt",
    "listgDt",
    "rcrdDt",
    "xpryDt",
    "purp",
    "clssfctnTp",
    "issnc",
    "tradgMkt",
    "sprdAndBchmkCrv",
    "putTp",
    "callTp",
    "fngbInd",
    "cnfdtl",
    "prvtPlcmnt",
    "convtblInd",
    "convsPrd",
    "convsRatioNmrtr",
    "convsRatioDnmtr",
    "pmryPlcOfDpst",
    "tradgMtd",
    "tefraRule",
    "srNb",
    "clss",
    "whldgTaxRgm",
    "pmtSts",
    "initlPhysForm",
    "aftrXchgPhysForm",
    "cmonSfkpr",
    "redTp",
    "redPmtCcy",
    "rstrctn",
    "sttlmInf",
    "finInstrmForm",
    "ctctNm",
    "leadMgr",
    "prncplPngAgt",
    "pngAgt",
    "dpstry",
    "undrlygRsk"
})
public class CommonFinancialInstrumentAttributes10 {

    @XmlElement(name = "SctySts")
    protected SecurityStatus3Choice sctySts;
    @XmlElement(name = "ISOSctyLngNm")
    protected String isoSctyLngNm;
    @XmlElement(name = "ISOSctyShrtNm")
    protected String isoSctyShrtNm;
    @XmlElement(name = "NmVldFr")
    protected DateAndDateTime2Choice nmVldFr;
    @XmlElement(name = "DnmtnCcy", required = true)
    protected String dnmtnCcy;
    @XmlElement(name = "CertNb")
    protected String certNb;
    @XmlElement(name = "CtrctVrsnNb")
    protected BigDecimal ctrctVrsnNb;
    @XmlElement(name = "CpnAttchdNb")
    protected String cpnAttchdNb;
    @XmlElement(name = "TaxLotNb")
    protected String taxLotNb;
    @XmlElement(name = "PoolNb")
    protected String poolNb;
    @XmlElement(name = "CvrdInd")
    protected Boolean cvrdInd;
    @XmlElement(name = "LglRstrctns")
    protected LegalRestrictions4Choice lglRstrctns;
    @XmlElement(name = "PosLmt")
    protected FinancialInstrumentQuantity1Choice posLmt;
    @XmlElement(name = "NearTermPosLmt")
    protected FinancialInstrumentQuantity1Choice nearTermPosLmt;
    @XmlElement(name = "ListgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar listgDt;
    @XmlElement(name = "RcrdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rcrdDt;
    @XmlElement(name = "XpryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType2 clssfctnTp;
    @XmlElement(name = "Issnc")
    protected Issuance5 issnc;
    @XmlElement(name = "TradgMkt")
    protected List<TradingParameters2> tradgMkt;
    @XmlElement(name = "SprdAndBchmkCrv")
    protected List<BenchmarkCurve6> sprdAndBchmkCrv;
    @XmlElement(name = "PutTp")
    protected PutType3Choice putTp;
    @XmlElement(name = "CallTp")
    protected CallType3Choice callTp;
    @XmlElement(name = "FngbInd")
    protected Boolean fngbInd;
    @XmlElement(name = "Cnfdtl")
    protected Boolean cnfdtl;
    @XmlElement(name = "PrvtPlcmnt")
    protected Boolean prvtPlcmnt;
    @XmlElement(name = "ConvtblInd")
    protected Boolean convtblInd;
    @XmlElement(name = "ConvsPrd")
    protected DateTimePeriod1 convsPrd;
    @XmlElement(name = "ConvsRatioNmrtr")
    protected FinancialInstrumentQuantity1Choice convsRatioNmrtr;
    @XmlElement(name = "ConvsRatioDnmtr")
    protected FinancialInstrumentQuantity1Choice convsRatioDnmtr;
    @XmlElement(name = "PmryPlcOfDpst")
    protected PartyIdentification136 pmryPlcOfDpst;
    @XmlElement(name = "TradgMtd")
    protected UnitOrFaceAmount1Choice tradgMtd;
    @XmlElement(name = "TEFRARule")
    protected TEFRARules3Choice tefraRule;
    @XmlElement(name = "SrNb")
    protected String srNb;
    @XmlElement(name = "Clss")
    protected String clss;
    @XmlElement(name = "WhldgTaxRgm")
    protected List<SecurityWithHoldingTax1> whldgTaxRgm;
    @XmlElement(name = "PmtSts")
    protected SecuritiesPaymentStatus5Choice pmtSts;
    @XmlElement(name = "InitlPhysForm")
    protected InitialPhysicalForm4Choice initlPhysForm;
    @XmlElement(name = "AftrXchgPhysForm")
    protected InitialPhysicalForm3Choice aftrXchgPhysForm;
    @XmlElement(name = "CmonSfkpr")
    protected String cmonSfkpr;
    @XmlElement(name = "RedTp")
    protected MaturityRedemptionType3Choice redTp;
    @XmlElement(name = "RedPmtCcy")
    protected String redPmtCcy;
    @XmlElement(name = "Rstrctn")
    protected List<SecurityRestriction3> rstrctn;
    @XmlElement(name = "SttlmInf")
    protected List<SettlementInformation17> sttlmInf;
    @XmlElement(name = "FinInstrmForm")
    protected FinancialInstrumentForm2 finInstrmForm;
    @XmlElement(name = "CtctNm")
    protected Organisation38 ctctNm;
    @XmlElement(name = "LeadMgr")
    protected Organisation38 leadMgr;
    @XmlElement(name = "PrncplPngAgt")
    protected Organisation38 prncplPngAgt;
    @XmlElement(name = "PngAgt")
    protected Organisation38 pngAgt;
    @XmlElement(name = "Dpstry")
    protected Organisation38 dpstry;
    @XmlElement(name = "UndrlygRsk")
    protected Organisation38 undrlygRsk;

    /**
     * Gets the value of the sctySts property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityStatus3Choice }
     *     
     */
    public SecurityStatus3Choice getSctySts() {
        return sctySts;
    }

    /**
     * Sets the value of the sctySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityStatus3Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setSctySts(SecurityStatus3Choice value) {
        this.sctySts = value;
        return this;
    }

    /**
     * Gets the value of the isoSctyLngNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOSctyLngNm() {
        return isoSctyLngNm;
    }

    /**
     * Sets the value of the isoSctyLngNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setISOSctyLngNm(String value) {
        this.isoSctyLngNm = value;
        return this;
    }

    /**
     * Gets the value of the isoSctyShrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOSctyShrtNm() {
        return isoSctyShrtNm;
    }

    /**
     * Sets the value of the isoSctyShrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setISOSctyShrtNm(String value) {
        this.isoSctyShrtNm = value;
        return this;
    }

    /**
     * Gets the value of the nmVldFr property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getNmVldFr() {
        return nmVldFr;
    }

    /**
     * Sets the value of the nmVldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setNmVldFr(DateAndDateTime2Choice value) {
        this.nmVldFr = value;
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
    public CommonFinancialInstrumentAttributes10 setDnmtnCcy(String value) {
        this.dnmtnCcy = value;
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
    public CommonFinancialInstrumentAttributes10 setCertNb(String value) {
        this.certNb = value;
        return this;
    }

    /**
     * Gets the value of the ctrctVrsnNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrctVrsnNb() {
        return ctrctVrsnNb;
    }

    /**
     * Sets the value of the ctrctVrsnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setCtrctVrsnNb(BigDecimal value) {
        this.ctrctVrsnNb = value;
        return this;
    }

    /**
     * Gets the value of the cpnAttchdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnAttchdNb() {
        return cpnAttchdNb;
    }

    /**
     * Sets the value of the cpnAttchdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setCpnAttchdNb(String value) {
        this.cpnAttchdNb = value;
        return this;
    }

    /**
     * Gets the value of the taxLotNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLotNb() {
        return taxLotNb;
    }

    /**
     * Sets the value of the taxLotNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setTaxLotNb(String value) {
        this.taxLotNb = value;
        return this;
    }

    /**
     * Gets the value of the poolNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolNb() {
        return poolNb;
    }

    /**
     * Sets the value of the poolNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setPoolNb(String value) {
        this.poolNb = value;
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
    public CommonFinancialInstrumentAttributes10 setCvrdInd(Boolean value) {
        this.cvrdInd = value;
        return this;
    }

    /**
     * Gets the value of the lglRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link LegalRestrictions4Choice }
     *     
     */
    public LegalRestrictions4Choice getLglRstrctns() {
        return lglRstrctns;
    }

    /**
     * Sets the value of the lglRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalRestrictions4Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setLglRstrctns(LegalRestrictions4Choice value) {
        this.lglRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the posLmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getPosLmt() {
        return posLmt;
    }

    /**
     * Sets the value of the posLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setPosLmt(FinancialInstrumentQuantity1Choice value) {
        this.posLmt = value;
        return this;
    }

    /**
     * Gets the value of the nearTermPosLmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getNearTermPosLmt() {
        return nearTermPosLmt;
    }

    /**
     * Sets the value of the nearTermPosLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setNearTermPosLmt(FinancialInstrumentQuantity1Choice value) {
        this.nearTermPosLmt = value;
        return this;
    }

    /**
     * Gets the value of the listgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getListgDt() {
        return listgDt;
    }

    /**
     * Sets the value of the listgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setListgDt(XMLGregorianCalendar value) {
        this.listgDt = value;
        return this;
    }

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setRcrdDt(XMLGregorianCalendar value) {
        this.rcrdDt = value;
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
    public XMLGregorianCalendar getXpryDt() {
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
    public CommonFinancialInstrumentAttributes10 setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
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
    public CommonFinancialInstrumentAttributes10 setPurp(String value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType2 }
     *     
     */
    public ClassificationType2 getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType2 }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setClssfctnTp(ClassificationType2 value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the issnc property.
     * 
     * @return
     *     possible object is
     *     {@link Issuance5 }
     *     
     */
    public Issuance5 getIssnc() {
        return issnc;
    }

    /**
     * Sets the value of the issnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issuance5 }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setIssnc(Issuance5 value) {
        this.issnc = value;
        return this;
    }

    /**
     * Gets the value of the tradgMkt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradgMkt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgMkt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingParameters2 }
     * 
     * 
     */
    public List<TradingParameters2> getTradgMkt() {
        if (tradgMkt == null) {
            tradgMkt = new ArrayList<TradingParameters2>();
        }
        return this.tradgMkt;
    }

    /**
     * Gets the value of the sprdAndBchmkCrv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sprdAndBchmkCrv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSprdAndBchmkCrv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenchmarkCurve6 }
     * 
     * 
     */
    public List<BenchmarkCurve6> getSprdAndBchmkCrv() {
        if (sprdAndBchmkCrv == null) {
            sprdAndBchmkCrv = new ArrayList<BenchmarkCurve6>();
        }
        return this.sprdAndBchmkCrv;
    }

    /**
     * Gets the value of the putTp property.
     * 
     * @return
     *     possible object is
     *     {@link PutType3Choice }
     *     
     */
    public PutType3Choice getPutTp() {
        return putTp;
    }

    /**
     * Sets the value of the putTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PutType3Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setPutTp(PutType3Choice value) {
        this.putTp = value;
        return this;
    }

    /**
     * Gets the value of the callTp property.
     * 
     * @return
     *     possible object is
     *     {@link CallType3Choice }
     *     
     */
    public CallType3Choice getCallTp() {
        return callTp;
    }

    /**
     * Sets the value of the callTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallType3Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setCallTp(CallType3Choice value) {
        this.callTp = value;
        return this;
    }

    /**
     * Gets the value of the fngbInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFngbInd() {
        return fngbInd;
    }

    /**
     * Sets the value of the fngbInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setFngbInd(Boolean value) {
        this.fngbInd = value;
        return this;
    }

    /**
     * Gets the value of the cnfdtl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCnfdtl() {
        return cnfdtl;
    }

    /**
     * Sets the value of the cnfdtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setCnfdtl(Boolean value) {
        this.cnfdtl = value;
        return this;
    }

    /**
     * Gets the value of the prvtPlcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrvtPlcmnt() {
        return prvtPlcmnt;
    }

    /**
     * Sets the value of the prvtPlcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setPrvtPlcmnt(Boolean value) {
        this.prvtPlcmnt = value;
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
    public CommonFinancialInstrumentAttributes10 setConvtblInd(Boolean value) {
        this.convtblInd = value;
        return this;
    }

    /**
     * Gets the value of the convsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getConvsPrd() {
        return convsPrd;
    }

    /**
     * Sets the value of the convsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setConvsPrd(DateTimePeriod1 value) {
        this.convsPrd = value;
        return this;
    }

    /**
     * Gets the value of the convsRatioNmrtr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getConvsRatioNmrtr() {
        return convsRatioNmrtr;
    }

    /**
     * Sets the value of the convsRatioNmrtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setConvsRatioNmrtr(FinancialInstrumentQuantity1Choice value) {
        this.convsRatioNmrtr = value;
        return this;
    }

    /**
     * Gets the value of the convsRatioDnmtr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getConvsRatioDnmtr() {
        return convsRatioDnmtr;
    }

    /**
     * Sets the value of the convsRatioDnmtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setConvsRatioDnmtr(FinancialInstrumentQuantity1Choice value) {
        this.convsRatioDnmtr = value;
        return this;
    }

    /**
     * Gets the value of the pmryPlcOfDpst property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getPmryPlcOfDpst() {
        return pmryPlcOfDpst;
    }

    /**
     * Sets the value of the pmryPlcOfDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setPmryPlcOfDpst(PartyIdentification136 value) {
        this.pmryPlcOfDpst = value;
        return this;
    }

    /**
     * Gets the value of the tradgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getTradgMtd() {
        return tradgMtd;
    }

    /**
     * Sets the value of the tradgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setTradgMtd(UnitOrFaceAmount1Choice value) {
        this.tradgMtd = value;
        return this;
    }

    /**
     * Gets the value of the tefraRule property.
     * 
     * @return
     *     possible object is
     *     {@link TEFRARules3Choice }
     *     
     */
    public TEFRARules3Choice getTEFRARule() {
        return tefraRule;
    }

    /**
     * Sets the value of the tefraRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEFRARules3Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setTEFRARule(TEFRARules3Choice value) {
        this.tefraRule = value;
        return this;
    }

    /**
     * Gets the value of the srNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrNb() {
        return srNb;
    }

    /**
     * Sets the value of the srNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setSrNb(String value) {
        this.srNb = value;
        return this;
    }

    /**
     * Gets the value of the clss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClss() {
        return clss;
    }

    /**
     * Sets the value of the clss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setClss(String value) {
        this.clss = value;
        return this;
    }

    /**
     * Gets the value of the whldgTaxRgm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whldgTaxRgm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhldgTaxRgm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityWithHoldingTax1 }
     * 
     * 
     */
    public List<SecurityWithHoldingTax1> getWhldgTaxRgm() {
        if (whldgTaxRgm == null) {
            whldgTaxRgm = new ArrayList<SecurityWithHoldingTax1>();
        }
        return this.whldgTaxRgm;
    }

    /**
     * Gets the value of the pmtSts property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesPaymentStatus5Choice }
     *     
     */
    public SecuritiesPaymentStatus5Choice getPmtSts() {
        return pmtSts;
    }

    /**
     * Sets the value of the pmtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesPaymentStatus5Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setPmtSts(SecuritiesPaymentStatus5Choice value) {
        this.pmtSts = value;
        return this;
    }

    /**
     * Gets the value of the initlPhysForm property.
     * 
     * @return
     *     possible object is
     *     {@link InitialPhysicalForm4Choice }
     *     
     */
    public InitialPhysicalForm4Choice getInitlPhysForm() {
        return initlPhysForm;
    }

    /**
     * Sets the value of the initlPhysForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialPhysicalForm4Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setInitlPhysForm(InitialPhysicalForm4Choice value) {
        this.initlPhysForm = value;
        return this;
    }

    /**
     * Gets the value of the aftrXchgPhysForm property.
     * 
     * @return
     *     possible object is
     *     {@link InitialPhysicalForm3Choice }
     *     
     */
    public InitialPhysicalForm3Choice getAftrXchgPhysForm() {
        return aftrXchgPhysForm;
    }

    /**
     * Sets the value of the aftrXchgPhysForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialPhysicalForm3Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setAftrXchgPhysForm(InitialPhysicalForm3Choice value) {
        this.aftrXchgPhysForm = value;
        return this;
    }

    /**
     * Gets the value of the cmonSfkpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonSfkpr() {
        return cmonSfkpr;
    }

    /**
     * Sets the value of the cmonSfkpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setCmonSfkpr(String value) {
        this.cmonSfkpr = value;
        return this;
    }

    /**
     * Gets the value of the redTp property.
     * 
     * @return
     *     possible object is
     *     {@link MaturityRedemptionType3Choice }
     *     
     */
    public MaturityRedemptionType3Choice getRedTp() {
        return redTp;
    }

    /**
     * Sets the value of the redTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaturityRedemptionType3Choice }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setRedTp(MaturityRedemptionType3Choice value) {
        this.redTp = value;
        return this;
    }

    /**
     * Gets the value of the redPmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedPmtCcy() {
        return redPmtCcy;
    }

    /**
     * Sets the value of the redPmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setRedPmtCcy(String value) {
        this.redPmtCcy = value;
        return this;
    }

    /**
     * Gets the value of the rstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rstrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRstrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityRestriction3 }
     * 
     * 
     */
    public List<SecurityRestriction3> getRstrctn() {
        if (rstrctn == null) {
            rstrctn = new ArrayList<SecurityRestriction3>();
        }
        return this.rstrctn;
    }

    /**
     * Gets the value of the sttlmInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementInformation17 }
     * 
     * 
     */
    public List<SettlementInformation17> getSttlmInf() {
        if (sttlmInf == null) {
            sttlmInf = new ArrayList<SettlementInformation17>();
        }
        return this.sttlmInf;
    }

    /**
     * Gets the value of the finInstrmForm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentForm2 }
     *     
     */
    public FinancialInstrumentForm2 getFinInstrmForm() {
        return finInstrmForm;
    }

    /**
     * Sets the value of the finInstrmForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentForm2 }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setFinInstrmForm(FinancialInstrumentForm2 value) {
        this.finInstrmForm = value;
        return this;
    }

    /**
     * Gets the value of the ctctNm property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getCtctNm() {
        return ctctNm;
    }

    /**
     * Sets the value of the ctctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setCtctNm(Organisation38 value) {
        this.ctctNm = value;
        return this;
    }

    /**
     * Gets the value of the leadMgr property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getLeadMgr() {
        return leadMgr;
    }

    /**
     * Sets the value of the leadMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setLeadMgr(Organisation38 value) {
        this.leadMgr = value;
        return this;
    }

    /**
     * Gets the value of the prncplPngAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getPrncplPngAgt() {
        return prncplPngAgt;
    }

    /**
     * Sets the value of the prncplPngAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setPrncplPngAgt(Organisation38 value) {
        this.prncplPngAgt = value;
        return this;
    }

    /**
     * Gets the value of the pngAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getPngAgt() {
        return pngAgt;
    }

    /**
     * Sets the value of the pngAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setPngAgt(Organisation38 value) {
        this.pngAgt = value;
        return this;
    }

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setDpstry(Organisation38 value) {
        this.dpstry = value;
        return this;
    }

    /**
     * Gets the value of the undrlygRsk property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getUndrlygRsk() {
        return undrlygRsk;
    }

    /**
     * Sets the value of the undrlygRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public CommonFinancialInstrumentAttributes10 setUndrlygRsk(Organisation38 value) {
        this.undrlygRsk = value;
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
     * Adds a new item to the tradgMkt list.
     * @see #getTradgMkt()
     * 
     */
    public CommonFinancialInstrumentAttributes10 addTradgMkt(TradingParameters2 tradgMkt) {
        getTradgMkt().add(tradgMkt);
        return this;
    }

    /**
     * Adds a new item to the sprdAndBchmkCrv list.
     * @see #getSprdAndBchmkCrv()
     * 
     */
    public CommonFinancialInstrumentAttributes10 addSprdAndBchmkCrv(BenchmarkCurve6 sprdAndBchmkCrv) {
        getSprdAndBchmkCrv().add(sprdAndBchmkCrv);
        return this;
    }

    /**
     * Adds a new item to the whldgTaxRgm list.
     * @see #getWhldgTaxRgm()
     * 
     */
    public CommonFinancialInstrumentAttributes10 addWhldgTaxRgm(SecurityWithHoldingTax1 whldgTaxRgm) {
        getWhldgTaxRgm().add(whldgTaxRgm);
        return this;
    }

    /**
     * Adds a new item to the rstrctn list.
     * @see #getRstrctn()
     * 
     */
    public CommonFinancialInstrumentAttributes10 addRstrctn(SecurityRestriction3 rstrctn) {
        getRstrctn().add(rstrctn);
        return this;
    }

    /**
     * Adds a new item to the sttlmInf list.
     * @see #getSttlmInf()
     * 
     */
    public CommonFinancialInstrumentAttributes10 addSttlmInf(SettlementInformation17 sttlmInf) {
        getSttlmInf().add(sttlmInf);
        return this;
    }

}
