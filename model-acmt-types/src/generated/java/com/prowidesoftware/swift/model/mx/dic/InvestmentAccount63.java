
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about a securities account and its characteristics.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccount63", propOrder = {
    "acctStsUpdInstr",
    "nm",
    "dsgnt",
    "tp",
    "ownrshTp",
    "taxXmptn",
    "stmtFrqcy",
    "refCcy",
    "lang",
    "incmPref",
    "rinvstmtDtls",
    "taxWhldgMtd",
    "taxRptg",
    "lttrInttDtls",
    "acmltnRghtRef",
    "reqrdSgntriesNb",
    "fndFmlyNm",
    "modfdFinInstrmDtls",
    "rndgDtls",
    "acctSvcr",
    "blckdSts",
    "acctUsgTp",
    "frgnStsCertfctn",
    "acctSgntrDtTm",
    "txChanlTp",
    "invstmtAcctCtgy",
    "pldgg",
    "coll",
    "thrdPtyRghts",
    "pwrOfAttnyLvlOfCtrl",
    "acctgSts",
    "opngDt",
    "clsgDt",
    "negInd",
    "prcgOrdr",
    "lblty",
    "modfdInvstrPrfl",
    "fsclYr"
})
public class InvestmentAccount63 {

    @XmlElement(name = "AcctStsUpdInstr")
    protected AccountStatusUpdateInstruction1 acctStsUpdInstr;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Dsgnt")
    protected String dsgnt;
    @XmlElement(name = "Tp")
    protected AccountType2Choice tp;
    @XmlElement(name = "OwnrshTp")
    protected OwnershipType2Choice ownrshTp;
    @XmlElement(name = "TaxXmptn")
    protected TaxExemptionReason2Choice taxXmptn;
    @XmlElement(name = "StmtFrqcy")
    protected StatementFrequencyReason2Choice stmtFrqcy;
    @XmlElement(name = "RefCcy")
    protected String refCcy;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference2Code incmPref;
    @XmlElement(name = "RinvstmtDtls")
    protected List<Reinvestment3> rinvstmtDtls;
    @XmlElement(name = "TaxWhldgMtd")
    @XmlSchemaType(name = "string")
    protected TaxWithholdingMethod3Code taxWhldgMtd;
    @XmlElement(name = "TaxRptg")
    protected List<TaxReporting2> taxRptg;
    @XmlElement(name = "LttrInttDtls")
    protected LetterIntent1 lttrInttDtls;
    @XmlElement(name = "AcmltnRghtRef")
    protected String acmltnRghtRef;
    @XmlElement(name = "ReqrdSgntriesNb")
    protected BigDecimal reqrdSgntriesNb;
    @XmlElement(name = "FndFmlyNm")
    protected String fndFmlyNm;
    @XmlElement(name = "ModfdFinInstrmDtls")
    protected List<ModificationScope36> modfdFinInstrmDtls;
    @XmlElement(name = "RndgDtls")
    protected RoundingParameters1 rndgDtls;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification70Choice acctSvcr;
    @XmlElement(name = "BlckdSts")
    protected BlockedStatusReason2Choice blckdSts;
    @XmlElement(name = "AcctUsgTp")
    protected AccountUsageType2Choice acctUsgTp;
    @XmlElement(name = "FrgnStsCertfctn")
    @XmlSchemaType(name = "string")
    protected Provided1Code frgnStsCertfctn;
    @XmlElement(name = "AcctSgntrDtTm")
    protected DateAndDateTimeChoice acctSgntrDtTm;
    @XmlElement(name = "TxChanlTp")
    protected TransactionChannelType1Choice txChanlTp;
    @XmlElement(name = "InvstmtAcctCtgy")
    protected InvestmentAccountCategory1Choice invstmtAcctCtgy;
    @XmlElement(name = "Pldgg")
    @XmlSchemaType(name = "string")
    protected Eligible1Code pldgg;
    @XmlElement(name = "Coll")
    @XmlSchemaType(name = "string")
    protected Collateral1Code coll;
    @XmlElement(name = "ThrdPtyRghts")
    protected ThirdPartyRights1 thrdPtyRghts;
    @XmlElement(name = "PwrOfAttnyLvlOfCtrl")
    protected LevelOfControl1Choice pwrOfAttnyLvlOfCtrl;
    @XmlElement(name = "AcctgSts")
    protected AccountingStatus1Choice acctgSts;
    @XmlElement(name = "OpngDt")
    protected DateAndDateTimeChoice opngDt;
    @XmlElement(name = "ClsgDt")
    protected DateAndDateTimeChoice clsgDt;
    @XmlElement(name = "NegInd")
    protected Boolean negInd;
    @XmlElement(name = "PrcgOrdr")
    @XmlSchemaType(name = "string")
    protected PositionEffect3Code prcgOrdr;
    @XmlElement(name = "Lblty")
    protected Liability1Choice lblty;
    @XmlElement(name = "ModfdInvstrPrfl")
    protected List<ModificationScope32> modfdInvstrPrfl;
    @XmlElement(name = "FsclYr")
    protected FiscalYear1Choice fsclYr;

    /**
     * Gets the value of the acctStsUpdInstr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusUpdateInstruction1 }
     *     
     */
    public AccountStatusUpdateInstruction1 getAcctStsUpdInstr() {
        return acctStsUpdInstr;
    }

    /**
     * Sets the value of the acctStsUpdInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusUpdateInstruction1 }
     *     
     */
    public InvestmentAccount63 setAcctStsUpdInstr(AccountStatusUpdateInstruction1 value) {
        this.acctStsUpdInstr = value;
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
    public InvestmentAccount63 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the dsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsgnt() {
        return dsgnt;
    }

    /**
     * Sets the value of the dsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount63 setDsgnt(String value) {
        this.dsgnt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType2Choice }
     *     
     */
    public AccountType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType2Choice }
     *     
     */
    public InvestmentAccount63 setTp(AccountType2Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ownrshTp property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipType2Choice }
     *     
     */
    public OwnershipType2Choice getOwnrshTp() {
        return ownrshTp;
    }

    /**
     * Sets the value of the ownrshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipType2Choice }
     *     
     */
    public InvestmentAccount63 setOwnrshTp(OwnershipType2Choice value) {
        this.ownrshTp = value;
        return this;
    }

    /**
     * Gets the value of the taxXmptn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReason2Choice }
     *     
     */
    public TaxExemptionReason2Choice getTaxXmptn() {
        return taxXmptn;
    }

    /**
     * Sets the value of the taxXmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReason2Choice }
     *     
     */
    public InvestmentAccount63 setTaxXmptn(TaxExemptionReason2Choice value) {
        this.taxXmptn = value;
        return this;
    }

    /**
     * Gets the value of the stmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link StatementFrequencyReason2Choice }
     *     
     */
    public StatementFrequencyReason2Choice getStmtFrqcy() {
        return stmtFrqcy;
    }

    /**
     * Sets the value of the stmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementFrequencyReason2Choice }
     *     
     */
    public InvestmentAccount63 setStmtFrqcy(StatementFrequencyReason2Choice value) {
        this.stmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the refCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCcy() {
        return refCcy;
    }

    /**
     * Sets the value of the refCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount63 setRefCcy(String value) {
        this.refCcy = value;
        return this;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount63 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference2Code }
     *     
     */
    public IncomePreference2Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference2Code }
     *     
     */
    public InvestmentAccount63 setIncmPref(IncomePreference2Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rinvstmtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRinvstmtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reinvestment3 }
     * 
     * 
     */
    public List<Reinvestment3> getRinvstmtDtls() {
        if (rinvstmtDtls == null) {
            rinvstmtDtls = new ArrayList<Reinvestment3>();
        }
        return this.rinvstmtDtls;
    }

    /**
     * Gets the value of the taxWhldgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxWithholdingMethod3Code }
     *     
     */
    public TaxWithholdingMethod3Code getTaxWhldgMtd() {
        return taxWhldgMtd;
    }

    /**
     * Sets the value of the taxWhldgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxWithholdingMethod3Code }
     *     
     */
    public InvestmentAccount63 setTaxWhldgMtd(TaxWithholdingMethod3Code value) {
        this.taxWhldgMtd = value;
        return this;
    }

    /**
     * Gets the value of the taxRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReporting2 }
     * 
     * 
     */
    public List<TaxReporting2> getTaxRptg() {
        if (taxRptg == null) {
            taxRptg = new ArrayList<TaxReporting2>();
        }
        return this.taxRptg;
    }

    /**
     * Gets the value of the lttrInttDtls property.
     * 
     * @return
     *     possible object is
     *     {@link LetterIntent1 }
     *     
     */
    public LetterIntent1 getLttrInttDtls() {
        return lttrInttDtls;
    }

    /**
     * Sets the value of the lttrInttDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterIntent1 }
     *     
     */
    public InvestmentAccount63 setLttrInttDtls(LetterIntent1 value) {
        this.lttrInttDtls = value;
        return this;
    }

    /**
     * Gets the value of the acmltnRghtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcmltnRghtRef() {
        return acmltnRghtRef;
    }

    /**
     * Sets the value of the acmltnRghtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount63 setAcmltnRghtRef(String value) {
        this.acmltnRghtRef = value;
        return this;
    }

    /**
     * Gets the value of the reqrdSgntriesNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqrdSgntriesNb() {
        return reqrdSgntriesNb;
    }

    /**
     * Sets the value of the reqrdSgntriesNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentAccount63 setReqrdSgntriesNb(BigDecimal value) {
        this.reqrdSgntriesNb = value;
        return this;
    }

    /**
     * Gets the value of the fndFmlyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndFmlyNm() {
        return fndFmlyNm;
    }

    /**
     * Sets the value of the fndFmlyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount63 setFndFmlyNm(String value) {
        this.fndFmlyNm = value;
        return this;
    }

    /**
     * Gets the value of the modfdFinInstrmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdFinInstrmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdFinInstrmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope36 }
     * 
     * 
     */
    public List<ModificationScope36> getModfdFinInstrmDtls() {
        if (modfdFinInstrmDtls == null) {
            modfdFinInstrmDtls = new ArrayList<ModificationScope36>();
        }
        return this.modfdFinInstrmDtls;
    }

    /**
     * Gets the value of the rndgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingParameters1 }
     *     
     */
    public RoundingParameters1 getRndgDtls() {
        return rndgDtls;
    }

    /**
     * Sets the value of the rndgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingParameters1 }
     *     
     */
    public InvestmentAccount63 setRndgDtls(RoundingParameters1 value) {
        this.rndgDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public PartyIdentification70Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public InvestmentAccount63 setAcctSvcr(PartyIdentification70Choice value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the blckdSts property.
     * 
     * @return
     *     possible object is
     *     {@link BlockedStatusReason2Choice }
     *     
     */
    public BlockedStatusReason2Choice getBlckdSts() {
        return blckdSts;
    }

    /**
     * Sets the value of the blckdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockedStatusReason2Choice }
     *     
     */
    public InvestmentAccount63 setBlckdSts(BlockedStatusReason2Choice value) {
        this.blckdSts = value;
        return this;
    }

    /**
     * Gets the value of the acctUsgTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountUsageType2Choice }
     *     
     */
    public AccountUsageType2Choice getAcctUsgTp() {
        return acctUsgTp;
    }

    /**
     * Sets the value of the acctUsgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountUsageType2Choice }
     *     
     */
    public InvestmentAccount63 setAcctUsgTp(AccountUsageType2Choice value) {
        this.acctUsgTp = value;
        return this;
    }

    /**
     * Gets the value of the frgnStsCertfctn property.
     * 
     * @return
     *     possible object is
     *     {@link Provided1Code }
     *     
     */
    public Provided1Code getFrgnStsCertfctn() {
        return frgnStsCertfctn;
    }

    /**
     * Sets the value of the frgnStsCertfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provided1Code }
     *     
     */
    public InvestmentAccount63 setFrgnStsCertfctn(Provided1Code value) {
        this.frgnStsCertfctn = value;
        return this;
    }

    /**
     * Gets the value of the acctSgntrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getAcctSgntrDtTm() {
        return acctSgntrDtTm;
    }

    /**
     * Sets the value of the acctSgntrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public InvestmentAccount63 setAcctSgntrDtTm(DateAndDateTimeChoice value) {
        this.acctSgntrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the txChanlTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionChannelType1Choice }
     *     
     */
    public TransactionChannelType1Choice getTxChanlTp() {
        return txChanlTp;
    }

    /**
     * Sets the value of the txChanlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionChannelType1Choice }
     *     
     */
    public InvestmentAccount63 setTxChanlTp(TransactionChannelType1Choice value) {
        this.txChanlTp = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountCategory1Choice }
     *     
     */
    public InvestmentAccountCategory1Choice getInvstmtAcctCtgy() {
        return invstmtAcctCtgy;
    }

    /**
     * Sets the value of the invstmtAcctCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountCategory1Choice }
     *     
     */
    public InvestmentAccount63 setInvstmtAcctCtgy(InvestmentAccountCategory1Choice value) {
        this.invstmtAcctCtgy = value;
        return this;
    }

    /**
     * Gets the value of the pldgg property.
     * 
     * @return
     *     possible object is
     *     {@link Eligible1Code }
     *     
     */
    public Eligible1Code getPldgg() {
        return pldgg;
    }

    /**
     * Sets the value of the pldgg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligible1Code }
     *     
     */
    public InvestmentAccount63 setPldgg(Eligible1Code value) {
        this.pldgg = value;
        return this;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral1Code }
     *     
     */
    public Collateral1Code getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral1Code }
     *     
     */
    public InvestmentAccount63 setColl(Collateral1Code value) {
        this.coll = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyRghts property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyRights1 }
     *     
     */
    public ThirdPartyRights1 getThrdPtyRghts() {
        return thrdPtyRghts;
    }

    /**
     * Sets the value of the thrdPtyRghts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyRights1 }
     *     
     */
    public InvestmentAccount63 setThrdPtyRghts(ThirdPartyRights1 value) {
        this.thrdPtyRghts = value;
        return this;
    }

    /**
     * Gets the value of the pwrOfAttnyLvlOfCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link LevelOfControl1Choice }
     *     
     */
    public LevelOfControl1Choice getPwrOfAttnyLvlOfCtrl() {
        return pwrOfAttnyLvlOfCtrl;
    }

    /**
     * Sets the value of the pwrOfAttnyLvlOfCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelOfControl1Choice }
     *     
     */
    public InvestmentAccount63 setPwrOfAttnyLvlOfCtrl(LevelOfControl1Choice value) {
        this.pwrOfAttnyLvlOfCtrl = value;
        return this;
    }

    /**
     * Gets the value of the acctgSts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingStatus1Choice }
     *     
     */
    public AccountingStatus1Choice getAcctgSts() {
        return acctgSts;
    }

    /**
     * Sets the value of the acctgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingStatus1Choice }
     *     
     */
    public InvestmentAccount63 setAcctgSts(AccountingStatus1Choice value) {
        this.acctgSts = value;
        return this;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public InvestmentAccount63 setOpngDt(DateAndDateTimeChoice value) {
        this.opngDt = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public InvestmentAccount63 setClsgDt(DateAndDateTimeChoice value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the negInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegInd() {
        return negInd;
    }

    /**
     * Sets the value of the negInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentAccount63 setNegInd(Boolean value) {
        this.negInd = value;
        return this;
    }

    /**
     * Gets the value of the prcgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link PositionEffect3Code }
     *     
     */
    public PositionEffect3Code getPrcgOrdr() {
        return prcgOrdr;
    }

    /**
     * Sets the value of the prcgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionEffect3Code }
     *     
     */
    public InvestmentAccount63 setPrcgOrdr(PositionEffect3Code value) {
        this.prcgOrdr = value;
        return this;
    }

    /**
     * Gets the value of the lblty property.
     * 
     * @return
     *     possible object is
     *     {@link Liability1Choice }
     *     
     */
    public Liability1Choice getLblty() {
        return lblty;
    }

    /**
     * Sets the value of the lblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Liability1Choice }
     *     
     */
    public InvestmentAccount63 setLblty(Liability1Choice value) {
        this.lblty = value;
        return this;
    }

    /**
     * Gets the value of the modfdInvstrPrfl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdInvstrPrfl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdInvstrPrfl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope32 }
     * 
     * 
     */
    public List<ModificationScope32> getModfdInvstrPrfl() {
        if (modfdInvstrPrfl == null) {
            modfdInvstrPrfl = new ArrayList<ModificationScope32>();
        }
        return this.modfdInvstrPrfl;
    }

    /**
     * Gets the value of the fsclYr property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalYear1Choice }
     *     
     */
    public FiscalYear1Choice getFsclYr() {
        return fsclYr;
    }

    /**
     * Sets the value of the fsclYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalYear1Choice }
     *     
     */
    public InvestmentAccount63 setFsclYr(FiscalYear1Choice value) {
        this.fsclYr = value;
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
     * Adds a new item to the rinvstmtDtls list.
     * @see #getRinvstmtDtls()
     * 
     */
    public InvestmentAccount63 addRinvstmtDtls(Reinvestment3 rinvstmtDtls) {
        getRinvstmtDtls().add(rinvstmtDtls);
        return this;
    }

    /**
     * Adds a new item to the taxRptg list.
     * @see #getTaxRptg()
     * 
     */
    public InvestmentAccount63 addTaxRptg(TaxReporting2 taxRptg) {
        getTaxRptg().add(taxRptg);
        return this;
    }

    /**
     * Adds a new item to the modfdFinInstrmDtls list.
     * @see #getModfdFinInstrmDtls()
     * 
     */
    public InvestmentAccount63 addModfdFinInstrmDtls(ModificationScope36 modfdFinInstrmDtls) {
        getModfdFinInstrmDtls().add(modfdFinInstrmDtls);
        return this;
    }

    /**
     * Adds a new item to the modfdInvstrPrfl list.
     * @see #getModfdInvstrPrfl()
     * 
     */
    public InvestmentAccount63 addModfdInvstrPrfl(ModificationScope32 modfdInvstrPrfl) {
        getModfdInvstrPrfl().add(modfdInvstrPrfl);
        return this;
    }

}
