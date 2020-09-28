
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes1", propOrder = {
    "certNb",
    "props",
    "clssfctnTp",
    "ctrctVrsnNb",
    "ctryOfIsse",
    "cpnAttchdNb",
    "cvrdInd",
    "dnmtnCcy",
    "apprnc",
    "isseDt",
    "lglRstrctns",
    "taxLotNb",
    "tradLotSz",
    "minTraddNmnlQty",
    "nm",
    "plcOfIsseId",
    "plcOfRegy",
    "poolNb",
    "pmryPlcOfListgId",
    "posLmt",
    "listgDt",
    "ntPosLmt",
    "pdctTp",
    "ctrctSttlmMnth",
    "minTradgPricgIncrmt",
    "purp",
    "ratg",
    "sctySts",
    "scndryPlcOfListg",
    "sttlStyle",
    "issr",
    "regnForm",
    "legAttrbts",
    "evtGrpDtls",
    "addtlUndrlygAttrbts"
})
public class FinancialInstrumentAttributes1 {

    @XmlElement(name = "CertNb")
    protected String certNb;
    @XmlElement(name = "Props")
    protected FinancialInstrumentProperties1Choice props;
    @XmlElement(name = "ClssfctnTp")
    protected SecurityClassificationType1Choice clssfctnTp;
    @XmlElement(name = "CtrctVrsnNb")
    protected BigDecimal ctrctVrsnNb;
    @XmlElement(name = "CtryOfIsse")
    protected String ctryOfIsse;
    @XmlElement(name = "CpnAttchdNb")
    protected String cpnAttchdNb;
    @XmlElement(name = "CvrdInd")
    protected Boolean cvrdInd;
    @XmlElement(name = "DnmtnCcy")
    protected String dnmtnCcy;
    @XmlElement(name = "Apprnc")
    @XmlSchemaType(name = "string")
    protected Appearance1Code apprnc;
    @XmlElement(name = "IsseDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "LglRstrctns")
    @XmlSchemaType(name = "string")
    protected LegalRestrictions1Code lglRstrctns;
    @XmlElement(name = "TaxLotNb")
    protected String taxLotNb;
    @XmlElement(name = "TradLotSz")
    protected FinancialInstrumentQuantityChoice tradLotSz;
    @XmlElement(name = "MinTraddNmnlQty")
    protected UnitOrFaceAmountChoice minTraddNmnlQty;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "PlcOfIsseId")
    protected String plcOfIsseId;
    @XmlElement(name = "PlcOfRegy")
    protected BICOrCountryCodeChoice plcOfRegy;
    @XmlElement(name = "PoolNb")
    protected String poolNb;
    @XmlElement(name = "PmryPlcOfListgId")
    protected String pmryPlcOfListgId;
    @XmlElement(name = "PosLmt")
    protected FinancialInstrumentQuantityChoice posLmt;
    @XmlElement(name = "ListgDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar listgDt;
    @XmlElement(name = "NTPosLmt")
    protected FinancialInstrumentQuantityChoice ntPosLmt;
    @XmlElement(name = "PdctTp")
    @XmlSchemaType(name = "string")
    protected ProductType1Code pdctTp;
    @XmlElement(name = "CtrctSttlmMnth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar ctrctSttlmMnth;
    @XmlElement(name = "MinTradgPricgIncrmt")
    protected BigDecimal minTradgPricgIncrmt;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "Ratg")
    protected Rating1 ratg;
    @XmlElement(name = "SctySts")
    @XmlSchemaType(name = "string")
    protected SecurityStatus1Code sctySts;
    @XmlElement(name = "ScndryPlcOfListg")
    protected List<String> scndryPlcOfListg;
    @XmlElement(name = "SttlStyle")
    @XmlSchemaType(name = "string")
    protected SettleStyle1Code sttlStyle;
    @XmlElement(name = "Issr")
    protected PartyIdentification12Choice issr;
    @XmlElement(name = "RegnForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code regnForm;
    @XmlElement(name = "LegAttrbts")
    protected LegDetails1 legAttrbts;
    @XmlElement(name = "EvtGrpDtls")
    protected List<EventGroup1> evtGrpDtls;
    @XmlElement(name = "AddtlUndrlygAttrbts")
    protected UnderlyingAttributes addtlUndrlygAttrbts;

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
    public FinancialInstrumentAttributes1 setCertNb(String value) {
        this.certNb = value;
        return this;
    }

    /**
     * Gets the value of the props property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentProperties1Choice }
     *     
     */
    public FinancialInstrumentProperties1Choice getProps() {
        return props;
    }

    /**
     * Sets the value of the props property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentProperties1Choice }
     *     
     */
    public FinancialInstrumentAttributes1 setProps(FinancialInstrumentProperties1Choice value) {
        this.props = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityClassificationType1Choice }
     *     
     */
    public SecurityClassificationType1Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityClassificationType1Choice }
     *     
     */
    public FinancialInstrumentAttributes1 setClssfctnTp(SecurityClassificationType1Choice value) {
        this.clssfctnTp = value;
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
    public FinancialInstrumentAttributes1 setCtrctVrsnNb(BigDecimal value) {
        this.ctrctVrsnNb = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfIsse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIsse() {
        return ctryOfIsse;
    }

    /**
     * Sets the value of the ctryOfIsse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes1 setCtryOfIsse(String value) {
        this.ctryOfIsse = value;
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
    public FinancialInstrumentAttributes1 setCpnAttchdNb(String value) {
        this.cpnAttchdNb = value;
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
    public FinancialInstrumentAttributes1 setCvrdInd(Boolean value) {
        this.cvrdInd = value;
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
    public FinancialInstrumentAttributes1 setDnmtnCcy(String value) {
        this.dnmtnCcy = value;
        return this;
    }

    /**
     * Gets the value of the apprnc property.
     * 
     * @return
     *     possible object is
     *     {@link Appearance1Code }
     *     
     */
    public Appearance1Code getApprnc() {
        return apprnc;
    }

    /**
     * Sets the value of the apprnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appearance1Code }
     *     
     */
    public FinancialInstrumentAttributes1 setApprnc(Appearance1Code value) {
        this.apprnc = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrumentAttributes1 setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the lglRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link LegalRestrictions1Code }
     *     
     */
    public LegalRestrictions1Code getLglRstrctns() {
        return lglRstrctns;
    }

    /**
     * Sets the value of the lglRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalRestrictions1Code }
     *     
     */
    public FinancialInstrumentAttributes1 setLglRstrctns(LegalRestrictions1Code value) {
        this.lglRstrctns = value;
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
    public FinancialInstrumentAttributes1 setTaxLotNb(String value) {
        this.taxLotNb = value;
        return this;
    }

    /**
     * Gets the value of the tradLotSz property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getTradLotSz() {
        return tradLotSz;
    }

    /**
     * Sets the value of the tradLotSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentAttributes1 setTradLotSz(FinancialInstrumentQuantityChoice value) {
        this.tradLotSz = value;
        return this;
    }

    /**
     * Gets the value of the minTraddNmnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmountChoice }
     *     
     */
    public UnitOrFaceAmountChoice getMinTraddNmnlQty() {
        return minTraddNmnlQty;
    }

    /**
     * Sets the value of the minTraddNmnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmountChoice }
     *     
     */
    public FinancialInstrumentAttributes1 setMinTraddNmnlQty(UnitOrFaceAmountChoice value) {
        this.minTraddNmnlQty = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes1 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the plcOfIsseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfIsseId() {
        return plcOfIsseId;
    }

    /**
     * Sets the value of the plcOfIsseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes1 setPlcOfIsseId(String value) {
        this.plcOfIsseId = value;
        return this;
    }

    /**
     * Gets the value of the plcOfRegy property.
     * 
     * @return
     *     possible object is
     *     {@link BICOrCountryCodeChoice }
     *     
     */
    public BICOrCountryCodeChoice getPlcOfRegy() {
        return plcOfRegy;
    }

    /**
     * Sets the value of the plcOfRegy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICOrCountryCodeChoice }
     *     
     */
    public FinancialInstrumentAttributes1 setPlcOfRegy(BICOrCountryCodeChoice value) {
        this.plcOfRegy = value;
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
    public FinancialInstrumentAttributes1 setPoolNb(String value) {
        this.poolNb = value;
        return this;
    }

    /**
     * Gets the value of the pmryPlcOfListgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmryPlcOfListgId() {
        return pmryPlcOfListgId;
    }

    /**
     * Sets the value of the pmryPlcOfListgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes1 setPmryPlcOfListgId(String value) {
        this.pmryPlcOfListgId = value;
        return this;
    }

    /**
     * Gets the value of the posLmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getPosLmt() {
        return posLmt;
    }

    /**
     * Sets the value of the posLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentAttributes1 setPosLmt(FinancialInstrumentQuantityChoice value) {
        this.posLmt = value;
        return this;
    }

    /**
     * Gets the value of the listgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrumentAttributes1 setListgDt(XMLGregorianCalendar value) {
        this.listgDt = value;
        return this;
    }

    /**
     * Gets the value of the ntPosLmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getNTPosLmt() {
        return ntPosLmt;
    }

    /**
     * Sets the value of the ntPosLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentAttributes1 setNTPosLmt(FinancialInstrumentQuantityChoice value) {
        this.ntPosLmt = value;
        return this;
    }

    /**
     * Gets the value of the pdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType1Code }
     *     
     */
    public ProductType1Code getPdctTp() {
        return pdctTp;
    }

    /**
     * Sets the value of the pdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType1Code }
     *     
     */
    public FinancialInstrumentAttributes1 setPdctTp(ProductType1Code value) {
        this.pdctTp = value;
        return this;
    }

    /**
     * Gets the value of the ctrctSttlmMnth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCtrctSttlmMnth() {
        return ctrctSttlmMnth;
    }

    /**
     * Sets the value of the ctrctSttlmMnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrumentAttributes1 setCtrctSttlmMnth(XMLGregorianCalendar value) {
        this.ctrctSttlmMnth = value;
        return this;
    }

    /**
     * Gets the value of the minTradgPricgIncrmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinTradgPricgIncrmt() {
        return minTradgPricgIncrmt;
    }

    /**
     * Sets the value of the minTradgPricgIncrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes1 setMinTradgPricgIncrmt(BigDecimal value) {
        this.minTradgPricgIncrmt = value;
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
    public FinancialInstrumentAttributes1 setPurp(String value) {
        this.purp = value;
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
    public FinancialInstrumentAttributes1 setRatg(Rating1 value) {
        this.ratg = value;
        return this;
    }

    /**
     * Gets the value of the sctySts property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityStatus1Code }
     *     
     */
    public SecurityStatus1Code getSctySts() {
        return sctySts;
    }

    /**
     * Sets the value of the sctySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityStatus1Code }
     *     
     */
    public FinancialInstrumentAttributes1 setSctySts(SecurityStatus1Code value) {
        this.sctySts = value;
        return this;
    }

    /**
     * Gets the value of the scndryPlcOfListg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scndryPlcOfListg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndryPlcOfListg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScndryPlcOfListg() {
        if (scndryPlcOfListg == null) {
            scndryPlcOfListg = new ArrayList<String>();
        }
        return this.scndryPlcOfListg;
    }

    /**
     * Gets the value of the sttlStyle property.
     * 
     * @return
     *     possible object is
     *     {@link SettleStyle1Code }
     *     
     */
    public SettleStyle1Code getSttlStyle() {
        return sttlStyle;
    }

    /**
     * Sets the value of the sttlStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettleStyle1Code }
     *     
     */
    public FinancialInstrumentAttributes1 setSttlStyle(SettleStyle1Code value) {
        this.sttlStyle = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification12Choice }
     *     
     */
    public PartyIdentification12Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification12Choice }
     *     
     */
    public FinancialInstrumentAttributes1 setIssr(PartyIdentification12Choice value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the regnForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getRegnForm() {
        return regnForm;
    }

    /**
     * Sets the value of the regnForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FinancialInstrumentAttributes1 setRegnForm(FormOfSecurity1Code value) {
        this.regnForm = value;
        return this;
    }

    /**
     * Gets the value of the legAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link LegDetails1 }
     *     
     */
    public LegDetails1 getLegAttrbts() {
        return legAttrbts;
    }

    /**
     * Sets the value of the legAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegDetails1 }
     *     
     */
    public FinancialInstrumentAttributes1 setLegAttrbts(LegDetails1 value) {
        this.legAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the evtGrpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtGrpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtGrpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventGroup1 }
     * 
     * 
     */
    public List<EventGroup1> getEvtGrpDtls() {
        if (evtGrpDtls == null) {
            evtGrpDtls = new ArrayList<EventGroup1>();
        }
        return this.evtGrpDtls;
    }

    /**
     * Gets the value of the addtlUndrlygAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingAttributes }
     *     
     */
    public UnderlyingAttributes getAddtlUndrlygAttrbts() {
        return addtlUndrlygAttrbts;
    }

    /**
     * Sets the value of the addtlUndrlygAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingAttributes }
     *     
     */
    public FinancialInstrumentAttributes1 setAddtlUndrlygAttrbts(UnderlyingAttributes value) {
        this.addtlUndrlygAttrbts = value;
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
     * Adds a new item to the scndryPlcOfListg list.
     * @see #getScndryPlcOfListg()
     * 
     */
    public FinancialInstrumentAttributes1 addScndryPlcOfListg(String scndryPlcOfListg) {
        getScndryPlcOfListg().add(scndryPlcOfListg);
        return this;
    }

    /**
     * Adds a new item to the evtGrpDtls list.
     * @see #getEvtGrpDtls()
     * 
     */
    public FinancialInstrumentAttributes1 addEvtGrpDtls(EventGroup1 evtGrpDtls) {
        getEvtGrpDtls().add(evtGrpDtls);
        return this;
    }

}
