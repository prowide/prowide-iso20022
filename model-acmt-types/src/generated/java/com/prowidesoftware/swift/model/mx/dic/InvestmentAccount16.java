
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccount16", propOrder = {
    "id",
    "nm",
    "dsgnt",
    "tp",
    "xtndedTp",
    "ownrshTp",
    "xtndedOwnrshTp",
    "taxXmptnRsn",
    "xtndedTaxXmptnRsn",
    "stmtFrqcy",
    "xtndedStmtFrqcy",
    "refCcy",
    "lang",
    "incmPref",
    "taxWhldgMtd",
    "lttrInttRef",
    "acmltnRghtRef",
    "reqrdSgntriesNb",
    "fndFmlyNm",
    "fndDtls",
    "rndgDtls",
    "acctSvcr"
})
public class InvestmentAccount16 {

    @XmlElement(name = "Id")
    protected AccountIdentification1 id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Dsgnt")
    protected String dsgnt;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected FundCashAccount2Code tp;
    @XmlElement(name = "XtndedTp")
    protected String xtndedTp;
    @XmlElement(name = "OwnrshTp")
    @XmlSchemaType(name = "string")
    protected AccountOwnershipType2Code ownrshTp;
    @XmlElement(name = "XtndedOwnrshTp")
    protected String xtndedOwnrshTp;
    @XmlElement(name = "TaxXmptnRsn")
    protected String taxXmptnRsn;
    @XmlElement(name = "XtndedTaxXmptnRsn")
    protected String xtndedTaxXmptnRsn;
    @XmlElement(name = "StmtFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code stmtFrqcy;
    @XmlElement(name = "XtndedStmtFrqcy")
    protected String xtndedStmtFrqcy;
    @XmlElement(name = "RefCcy")
    protected String refCcy;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "TaxWhldgMtd")
    @XmlSchemaType(name = "string")
    protected TaxWithholdingMethod1Code taxWhldgMtd;
    @XmlElement(name = "LttrInttRef")
    protected String lttrInttRef;
    @XmlElement(name = "AcmltnRghtRef")
    protected String acmltnRghtRef;
    @XmlElement(name = "ReqrdSgntriesNb")
    protected BigDecimal reqrdSgntriesNb;
    @XmlElement(name = "FndFmlyNm")
    protected String fndFmlyNm;
    @XmlElement(name = "FndDtls")
    protected FinancialInstrument6 fndDtls;
    @XmlElement(name = "RndgDtls")
    protected RoundingParameters1 rndgDtls;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification2Choice acctSvcr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1 }
     *     
     */
    public AccountIdentification1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1 }
     *     
     */
    public InvestmentAccount16 setId(AccountIdentification1 value) {
        this.id = value;
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
    public InvestmentAccount16 setNm(String value) {
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
    public InvestmentAccount16 setDsgnt(String value) {
        this.dsgnt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link FundCashAccount2Code }
     *     
     */
    public FundCashAccount2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundCashAccount2Code }
     *     
     */
    public InvestmentAccount16 setTp(FundCashAccount2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedTp() {
        return xtndedTp;
    }

    /**
     * Sets the value of the xtndedTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount16 setXtndedTp(String value) {
        this.xtndedTp = value;
        return this;
    }

    /**
     * Gets the value of the ownrshTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOwnershipType2Code }
     *     
     */
    public AccountOwnershipType2Code getOwnrshTp() {
        return ownrshTp;
    }

    /**
     * Sets the value of the ownrshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOwnershipType2Code }
     *     
     */
    public InvestmentAccount16 setOwnrshTp(AccountOwnershipType2Code value) {
        this.ownrshTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedOwnrshTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedOwnrshTp() {
        return xtndedOwnrshTp;
    }

    /**
     * Sets the value of the xtndedOwnrshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount16 setXtndedOwnrshTp(String value) {
        this.xtndedOwnrshTp = value;
        return this;
    }

    /**
     * Gets the value of the taxXmptnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxXmptnRsn() {
        return taxXmptnRsn;
    }

    /**
     * Sets the value of the taxXmptnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount16 setTaxXmptnRsn(String value) {
        this.taxXmptnRsn = value;
        return this;
    }

    /**
     * Gets the value of the xtndedTaxXmptnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedTaxXmptnRsn() {
        return xtndedTaxXmptnRsn;
    }

    /**
     * Sets the value of the xtndedTaxXmptnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount16 setXtndedTaxXmptnRsn(String value) {
        this.xtndedTaxXmptnRsn = value;
        return this;
    }

    /**
     * Gets the value of the stmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getStmtFrqcy() {
        return stmtFrqcy;
    }

    /**
     * Sets the value of the stmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public InvestmentAccount16 setStmtFrqcy(Frequency1Code value) {
        this.stmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the xtndedStmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedStmtFrqcy() {
        return xtndedStmtFrqcy;
    }

    /**
     * Sets the value of the xtndedStmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount16 setXtndedStmtFrqcy(String value) {
        this.xtndedStmtFrqcy = value;
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
    public InvestmentAccount16 setRefCcy(String value) {
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
    public InvestmentAccount16 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference1Code }
     *     
     */
    public IncomePreference1Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference1Code }
     *     
     */
    public InvestmentAccount16 setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the taxWhldgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxWithholdingMethod1Code }
     *     
     */
    public TaxWithholdingMethod1Code getTaxWhldgMtd() {
        return taxWhldgMtd;
    }

    /**
     * Sets the value of the taxWhldgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxWithholdingMethod1Code }
     *     
     */
    public InvestmentAccount16 setTaxWhldgMtd(TaxWithholdingMethod1Code value) {
        this.taxWhldgMtd = value;
        return this;
    }

    /**
     * Gets the value of the lttrInttRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLttrInttRef() {
        return lttrInttRef;
    }

    /**
     * Sets the value of the lttrInttRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccount16 setLttrInttRef(String value) {
        this.lttrInttRef = value;
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
    public InvestmentAccount16 setAcmltnRghtRef(String value) {
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
    public InvestmentAccount16 setReqrdSgntriesNb(BigDecimal value) {
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
    public InvestmentAccount16 setFndFmlyNm(String value) {
        this.fndFmlyNm = value;
        return this;
    }

    /**
     * Gets the value of the fndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument6 }
     *     
     */
    public FinancialInstrument6 getFndDtls() {
        return fndDtls;
    }

    /**
     * Sets the value of the fndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument6 }
     *     
     */
    public InvestmentAccount16 setFndDtls(FinancialInstrument6 value) {
        this.fndDtls = value;
        return this;
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
    public InvestmentAccount16 setRndgDtls(RoundingParameters1 value) {
        this.rndgDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public InvestmentAccount16 setAcctSvcr(PartyIdentification2Choice value) {
        this.acctSvcr = value;
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
