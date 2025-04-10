
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "InvestmentAccount46", propOrder = {
    "id",
    "sts",
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
    "lttrInttDtls",
    "acmltnRghtRef",
    "reqrdSgntriesNb",
    "fndFmlyNm",
    "rndgDtls",
    "acctSvcr",
    "fndsDtls",
    "cshAcct",
    "sctiesAcct",
    "blckdSts",
    "acctUsgTp",
    "frgnStsCertfctn",
    "acctSgntrDtTm",
    "txChanlTp",
    "invstmtAcctCtgy"
})
public class InvestmentAccount46 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentification1 id;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected AccountStatus2Code sts;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Dsgnt")
    protected String dsgnt;
    @XmlElement(name = "Tp")
    protected AccountType1Choice tp;
    @XmlElement(name = "OwnrshTp", required = true)
    protected OwnershipType1Choice ownrshTp;
    @XmlElement(name = "TaxXmptn")
    protected TaxExemptionReason1Choice taxXmptn;
    @XmlElement(name = "StmtFrqcy")
    protected StatementFrequencyReason1Choice stmtFrqcy;
    @XmlElement(name = "RefCcy")
    protected String refCcy;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "RinvstmtDtls")
    protected List<Reinvestment1> rinvstmtDtls;
    @XmlElement(name = "TaxWhldgMtd")
    @XmlSchemaType(name = "string")
    protected TaxWithholdingMethod2Code taxWhldgMtd;
    @XmlElement(name = "LttrInttDtls")
    protected LetterIntent1 lttrInttDtls;
    @XmlElement(name = "AcmltnRghtRef")
    protected String acmltnRghtRef;
    @XmlElement(name = "ReqrdSgntriesNb")
    protected BigDecimal reqrdSgntriesNb;
    @XmlElement(name = "FndFmlyNm")
    protected String fndFmlyNm;
    @XmlElement(name = "RndgDtls")
    protected RoundingParameters1 rndgDtls;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification2Choice acctSvcr;
    @XmlElement(name = "FndsDtls")
    protected List<FinancialInstrument29> fndsDtls;
    @XmlElement(name = "CshAcct")
    protected List<CashAccount12> cshAcct;
    @XmlElement(name = "SctiesAcct")
    protected List<SecuritiesAccount4> sctiesAcct;
    @XmlElement(name = "BlckdSts")
    protected List<Blocked1> blckdSts;
    @XmlElement(name = "AcctUsgTp")
    protected AccountUsageType1Choice acctUsgTp;
    @XmlElement(name = "FrgnStsCertfctn")
    @XmlSchemaType(name = "string")
    protected Provided1Code frgnStsCertfctn;
    @XmlElement(name = "AcctSgntrDtTm")
    protected DateAndDateTimeChoice acctSgntrDtTm;
    @XmlElement(name = "TxChanlTp")
    protected TransactionChannelType1Choice txChanlTp;
    @XmlElement(name = "InvstmtAcctCtgy")
    protected InvestmentAccountCategory1Choice invstmtAcctCtgy;

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
    public InvestmentAccount46 setId(AccountIdentification1 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus2Code }
     *     
     */
    public AccountStatus2Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus2Code }
     *     
     */
    public InvestmentAccount46 setSts(AccountStatus2Code value) {
        this.sts = value;
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
    public InvestmentAccount46 setNm(String value) {
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
    public InvestmentAccount46 setDsgnt(String value) {
        this.dsgnt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType1Choice }
     *     
     */
    public AccountType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType1Choice }
     *     
     */
    public InvestmentAccount46 setTp(AccountType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ownrshTp property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipType1Choice }
     *     
     */
    public OwnershipType1Choice getOwnrshTp() {
        return ownrshTp;
    }

    /**
     * Sets the value of the ownrshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipType1Choice }
     *     
     */
    public InvestmentAccount46 setOwnrshTp(OwnershipType1Choice value) {
        this.ownrshTp = value;
        return this;
    }

    /**
     * Gets the value of the taxXmptn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReason1Choice }
     *     
     */
    public TaxExemptionReason1Choice getTaxXmptn() {
        return taxXmptn;
    }

    /**
     * Sets the value of the taxXmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReason1Choice }
     *     
     */
    public InvestmentAccount46 setTaxXmptn(TaxExemptionReason1Choice value) {
        this.taxXmptn = value;
        return this;
    }

    /**
     * Gets the value of the stmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link StatementFrequencyReason1Choice }
     *     
     */
    public StatementFrequencyReason1Choice getStmtFrqcy() {
        return stmtFrqcy;
    }

    /**
     * Sets the value of the stmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementFrequencyReason1Choice }
     *     
     */
    public InvestmentAccount46 setStmtFrqcy(StatementFrequencyReason1Choice value) {
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
    public InvestmentAccount46 setRefCcy(String value) {
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
    public InvestmentAccount46 setLang(String value) {
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
    public InvestmentAccount46 setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rinvstmtDtls property.
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
     * {@link Reinvestment1 }
     * 
     * 
     * @return
     *     The value of the rinvstmtDtls property.
     */
    public List<Reinvestment1> getRinvstmtDtls() {
        if (rinvstmtDtls == null) {
            rinvstmtDtls = new ArrayList<>();
        }
        return this.rinvstmtDtls;
    }

    /**
     * Gets the value of the taxWhldgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxWithholdingMethod2Code }
     *     
     */
    public TaxWithholdingMethod2Code getTaxWhldgMtd() {
        return taxWhldgMtd;
    }

    /**
     * Sets the value of the taxWhldgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxWithholdingMethod2Code }
     *     
     */
    public InvestmentAccount46 setTaxWhldgMtd(TaxWithholdingMethod2Code value) {
        this.taxWhldgMtd = value;
        return this;
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
    public InvestmentAccount46 setLttrInttDtls(LetterIntent1 value) {
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
    public InvestmentAccount46 setAcmltnRghtRef(String value) {
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
    public InvestmentAccount46 setReqrdSgntriesNb(BigDecimal value) {
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
    public InvestmentAccount46 setFndFmlyNm(String value) {
        this.fndFmlyNm = value;
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
    public InvestmentAccount46 setRndgDtls(RoundingParameters1 value) {
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
    public InvestmentAccount46 setAcctSvcr(PartyIdentification2Choice value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the fndsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fndsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument29 }
     * 
     * 
     * @return
     *     The value of the fndsDtls property.
     */
    public List<FinancialInstrument29> getFndsDtls() {
        if (fndsDtls == null) {
            fndsDtls = new ArrayList<>();
        }
        return this.fndsDtls;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount12 }
     * 
     * 
     * @return
     *     The value of the cshAcct property.
     */
    public List<CashAccount12> getCshAcct() {
        if (cshAcct == null) {
            cshAcct = new ArrayList<>();
        }
        return this.cshAcct;
    }

    /**
     * Gets the value of the sctiesAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesAccount4 }
     * 
     * 
     * @return
     *     The value of the sctiesAcct property.
     */
    public List<SecuritiesAccount4> getSctiesAcct() {
        if (sctiesAcct == null) {
            sctiesAcct = new ArrayList<>();
        }
        return this.sctiesAcct;
    }

    /**
     * Gets the value of the blckdSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the blckdSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlckdSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Blocked1 }
     * 
     * 
     * @return
     *     The value of the blckdSts property.
     */
    public List<Blocked1> getBlckdSts() {
        if (blckdSts == null) {
            blckdSts = new ArrayList<>();
        }
        return this.blckdSts;
    }

    /**
     * Gets the value of the acctUsgTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountUsageType1Choice }
     *     
     */
    public AccountUsageType1Choice getAcctUsgTp() {
        return acctUsgTp;
    }

    /**
     * Sets the value of the acctUsgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountUsageType1Choice }
     *     
     */
    public InvestmentAccount46 setAcctUsgTp(AccountUsageType1Choice value) {
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
    public InvestmentAccount46 setFrgnStsCertfctn(Provided1Code value) {
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
    public InvestmentAccount46 setAcctSgntrDtTm(DateAndDateTimeChoice value) {
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
    public InvestmentAccount46 setTxChanlTp(TransactionChannelType1Choice value) {
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
    public InvestmentAccount46 setInvstmtAcctCtgy(InvestmentAccountCategory1Choice value) {
        this.invstmtAcctCtgy = value;
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
    public InvestmentAccount46 addRinvstmtDtls(Reinvestment1 rinvstmtDtls) {
        getRinvstmtDtls().add(rinvstmtDtls);
        return this;
    }

    /**
     * Adds a new item to the fndsDtls list.
     * @see #getFndsDtls()
     * 
     */
    public InvestmentAccount46 addFndsDtls(FinancialInstrument29 fndsDtls) {
        getFndsDtls().add(fndsDtls);
        return this;
    }

    /**
     * Adds a new item to the cshAcct list.
     * @see #getCshAcct()
     * 
     */
    public InvestmentAccount46 addCshAcct(CashAccount12 cshAcct) {
        getCshAcct().add(cshAcct);
        return this;
    }

    /**
     * Adds a new item to the sctiesAcct list.
     * @see #getSctiesAcct()
     * 
     */
    public InvestmentAccount46 addSctiesAcct(SecuritiesAccount4 sctiesAcct) {
        getSctiesAcct().add(sctiesAcct);
        return this;
    }

    /**
     * Adds a new item to the blckdSts list.
     * @see #getBlckdSts()
     * 
     */
    public InvestmentAccount46 addBlckdSts(Blocked1 blckdSts) {
        getBlckdSts().add(blckdSts);
        return this;
    }

}
