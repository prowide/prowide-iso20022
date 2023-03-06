
package com.prowidesoftware.swift.model.mx.dic;

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
 * Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be honoured on the presentation of documents that comply with its terms and conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Undertaking1", propOrder = {
    "applcntRefNb",
    "purp",
    "nm",
    "tp",
    "oblgr",
    "applcnt",
    "issr",
    "bnfcry",
    "advsgPty",
    "scndAdvsgPty",
    "cnfrmr",
    "confInd",
    "cntrUdrtkgInd",
    "cntrUdrtkg",
    "udrtkgAmt",
    "xpryDtls",
    "addtlPty",
    "govncRulesAndLaw",
    "undrlygTx",
    "presntnDtls",
    "udrtkgWrdg",
    "mltplDmndInd",
    "prtlDmndInd",
    "trfInd",
    "trfChrgsPyblBy",
    "confChrgsPyblBy",
    "automtcAmtVartn",
    "dlvryChanl",
    "oblgrLbltyAcct",
    "oblgrChrgAcct",
    "oblgrSttlmAcct",
    "nclsdFile",
    "addtlApplInf"
})
public class Undertaking1 {

    @XmlElement(name = "ApplcntRefNb", required = true)
    protected String applcntRefNb;
    @XmlElement(name = "Purp", required = true)
    protected String purp;
    @XmlElement(name = "Nm", required = true)
    @XmlSchemaType(name = "string")
    protected UndertakingName1Code nm;
    @XmlElement(name = "Tp", required = true)
    protected UndertakingType1Choice tp;
    @XmlElement(name = "Oblgr", required = true)
    protected PartyIdentification43 oblgr;
    @XmlElement(name = "Applcnt")
    protected List<PartyIdentification43> applcnt;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification43 issr;
    @XmlElement(name = "Bnfcry", required = true)
    protected List<PartyIdentification43> bnfcry;
    @XmlElement(name = "AdvsgPty")
    protected PartyIdentification43 advsgPty;
    @XmlElement(name = "ScndAdvsgPty")
    protected PartyIdentification43 scndAdvsgPty;
    @XmlElement(name = "Cnfrmr")
    protected PartyIdentification43 cnfrmr;
    @XmlElement(name = "ConfInd")
    protected Boolean confInd;
    @XmlElement(name = "CntrUdrtkgInd")
    protected boolean cntrUdrtkgInd;
    @XmlElement(name = "CntrUdrtkg")
    protected Undertaking2 cntrUdrtkg;
    @XmlElement(name = "UdrtkgAmt", required = true)
    protected UndertakingAmount1 udrtkgAmt;
    @XmlElement(name = "XpryDtls", required = true)
    protected ExpiryDetails2 xpryDtls;
    @XmlElement(name = "AddtlPty")
    protected List<PartyAndType1> addtlPty;
    @XmlElement(name = "GovncRulesAndLaw", required = true)
    protected GovernanceRules1 govncRulesAndLaw;
    @XmlElement(name = "UndrlygTx")
    protected List<UnderlyingTradeTransaction1> undrlygTx;
    @XmlElement(name = "PresntnDtls")
    protected Presentation4 presntnDtls;
    @XmlElement(name = "UdrtkgWrdg", required = true)
    protected UndertakingWording1 udrtkgWrdg;
    @XmlElement(name = "MltplDmndInd")
    protected Boolean mltplDmndInd;
    @XmlElement(name = "PrtlDmndInd")
    protected Boolean prtlDmndInd;
    @XmlElement(name = "TrfInd")
    protected Boolean trfInd;
    @XmlElement(name = "TrfChrgsPyblBy")
    protected String trfChrgsPyblBy;
    @XmlElement(name = "ConfChrgsPyblBy")
    protected String confChrgsPyblBy;
    @XmlElement(name = "AutomtcAmtVartn")
    protected List<AutomaticVariation1> automtcAmtVartn;
    @XmlElement(name = "DlvryChanl", required = true)
    protected CommunicationChannel1 dlvryChanl;
    @XmlElement(name = "OblgrLbltyAcct")
    protected CashAccount28 oblgrLbltyAcct;
    @XmlElement(name = "OblgrChrgAcct")
    protected CashAccount28 oblgrChrgAcct;
    @XmlElement(name = "OblgrSttlmAcct")
    protected CashAccount28 oblgrSttlmAcct;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlApplInf")
    protected List<String> addtlApplInf;

    /**
     * Gets the value of the applcntRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcntRefNb() {
        return applcntRefNb;
    }

    /**
     * Sets the value of the applcntRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Undertaking1 setApplcntRefNb(String value) {
        this.applcntRefNb = value;
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
    public Undertaking1 setPurp(String value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingName1Code }
     *     
     */
    public UndertakingName1Code getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingName1Code }
     *     
     */
    public Undertaking1 setNm(UndertakingName1Code value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingType1Choice }
     *     
     */
    public UndertakingType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingType1Choice }
     *     
     */
    public Undertaking1 setTp(UndertakingType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the oblgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getOblgr() {
        return oblgr;
    }

    /**
     * Sets the value of the oblgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Undertaking1 setOblgr(PartyIdentification43 value) {
        this.oblgr = value;
        return this;
    }

    /**
     * Gets the value of the applcnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applcnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplcnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification43 }
     * 
     * 
     */
    public List<PartyIdentification43> getApplcnt() {
        if (applcnt == null) {
            applcnt = new ArrayList<PartyIdentification43>();
        }
        return this.applcnt;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Undertaking1 setIssr(PartyIdentification43 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bnfcry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfcry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification43 }
     * 
     * 
     */
    public List<PartyIdentification43> getBnfcry() {
        if (bnfcry == null) {
            bnfcry = new ArrayList<PartyIdentification43>();
        }
        return this.bnfcry;
    }

    /**
     * Gets the value of the advsgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getAdvsgPty() {
        return advsgPty;
    }

    /**
     * Sets the value of the advsgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Undertaking1 setAdvsgPty(PartyIdentification43 value) {
        this.advsgPty = value;
        return this;
    }

    /**
     * Gets the value of the scndAdvsgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getScndAdvsgPty() {
        return scndAdvsgPty;
    }

    /**
     * Sets the value of the scndAdvsgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Undertaking1 setScndAdvsgPty(PartyIdentification43 value) {
        this.scndAdvsgPty = value;
        return this;
    }

    /**
     * Gets the value of the cnfrmr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getCnfrmr() {
        return cnfrmr;
    }

    /**
     * Sets the value of the cnfrmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Undertaking1 setCnfrmr(PartyIdentification43 value) {
        this.cnfrmr = value;
        return this;
    }

    /**
     * Gets the value of the confInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfInd() {
        return confInd;
    }

    /**
     * Sets the value of the confInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Undertaking1 setConfInd(Boolean value) {
        this.confInd = value;
        return this;
    }

    /**
     * Gets the value of the cntrUdrtkgInd property.
     * 
     */
    public boolean isCntrUdrtkgInd() {
        return cntrUdrtkgInd;
    }

    /**
     * Sets the value of the cntrUdrtkgInd property.
     * 
     */
    public Undertaking1 setCntrUdrtkgInd(boolean value) {
        this.cntrUdrtkgInd = value;
        return this;
    }

    /**
     * Gets the value of the cntrUdrtkg property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking2 }
     *     
     */
    public Undertaking2 getCntrUdrtkg() {
        return cntrUdrtkg;
    }

    /**
     * Sets the value of the cntrUdrtkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking2 }
     *     
     */
    public Undertaking1 setCntrUdrtkg(Undertaking2 value) {
        this.cntrUdrtkg = value;
        return this;
    }

    /**
     * Gets the value of the udrtkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount1 }
     *     
     */
    public UndertakingAmount1 getUdrtkgAmt() {
        return udrtkgAmt;
    }

    /**
     * Sets the value of the udrtkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount1 }
     *     
     */
    public Undertaking1 setUdrtkgAmt(UndertakingAmount1 value) {
        this.udrtkgAmt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails2 }
     *     
     */
    public ExpiryDetails2 getXpryDtls() {
        return xpryDtls;
    }

    /**
     * Sets the value of the xpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails2 }
     *     
     */
    public Undertaking1 setXpryDtls(ExpiryDetails2 value) {
        this.xpryDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndType1 }
     * 
     * 
     */
    public List<PartyAndType1> getAddtlPty() {
        if (addtlPty == null) {
            addtlPty = new ArrayList<PartyAndType1>();
        }
        return this.addtlPty;
    }

    /**
     * Gets the value of the govncRulesAndLaw property.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceRules1 }
     *     
     */
    public GovernanceRules1 getGovncRulesAndLaw() {
        return govncRulesAndLaw;
    }

    /**
     * Sets the value of the govncRulesAndLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceRules1 }
     *     
     */
    public Undertaking1 setGovncRulesAndLaw(GovernanceRules1 value) {
        this.govncRulesAndLaw = value;
        return this;
    }

    /**
     * Gets the value of the undrlygTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingTradeTransaction1 }
     * 
     * 
     */
    public List<UnderlyingTradeTransaction1> getUndrlygTx() {
        if (undrlygTx == null) {
            undrlygTx = new ArrayList<UnderlyingTradeTransaction1>();
        }
        return this.undrlygTx;
    }

    /**
     * Gets the value of the presntnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Presentation4 }
     *     
     */
    public Presentation4 getPresntnDtls() {
        return presntnDtls;
    }

    /**
     * Sets the value of the presntnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presentation4 }
     *     
     */
    public Undertaking1 setPresntnDtls(Presentation4 value) {
        this.presntnDtls = value;
        return this;
    }

    /**
     * Gets the value of the udrtkgWrdg property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingWording1 }
     *     
     */
    public UndertakingWording1 getUdrtkgWrdg() {
        return udrtkgWrdg;
    }

    /**
     * Sets the value of the udrtkgWrdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingWording1 }
     *     
     */
    public Undertaking1 setUdrtkgWrdg(UndertakingWording1 value) {
        this.udrtkgWrdg = value;
        return this;
    }

    /**
     * Gets the value of the mltplDmndInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMltplDmndInd() {
        return mltplDmndInd;
    }

    /**
     * Sets the value of the mltplDmndInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Undertaking1 setMltplDmndInd(Boolean value) {
        this.mltplDmndInd = value;
        return this;
    }

    /**
     * Gets the value of the prtlDmndInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlDmndInd() {
        return prtlDmndInd;
    }

    /**
     * Sets the value of the prtlDmndInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Undertaking1 setPrtlDmndInd(Boolean value) {
        this.prtlDmndInd = value;
        return this;
    }

    /**
     * Gets the value of the trfInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrfInd() {
        return trfInd;
    }

    /**
     * Sets the value of the trfInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Undertaking1 setTrfInd(Boolean value) {
        this.trfInd = value;
        return this;
    }

    /**
     * Gets the value of the trfChrgsPyblBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfChrgsPyblBy() {
        return trfChrgsPyblBy;
    }

    /**
     * Sets the value of the trfChrgsPyblBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Undertaking1 setTrfChrgsPyblBy(String value) {
        this.trfChrgsPyblBy = value;
        return this;
    }

    /**
     * Gets the value of the confChrgsPyblBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfChrgsPyblBy() {
        return confChrgsPyblBy;
    }

    /**
     * Sets the value of the confChrgsPyblBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Undertaking1 setConfChrgsPyblBy(String value) {
        this.confChrgsPyblBy = value;
        return this;
    }

    /**
     * Gets the value of the automtcAmtVartn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the automtcAmtVartn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutomtcAmtVartn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutomaticVariation1 }
     * 
     * 
     */
    public List<AutomaticVariation1> getAutomtcAmtVartn() {
        if (automtcAmtVartn == null) {
            automtcAmtVartn = new ArrayList<AutomaticVariation1>();
        }
        return this.automtcAmtVartn;
    }

    /**
     * Gets the value of the dlvryChanl property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationChannel1 }
     *     
     */
    public CommunicationChannel1 getDlvryChanl() {
        return dlvryChanl;
    }

    /**
     * Sets the value of the dlvryChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationChannel1 }
     *     
     */
    public Undertaking1 setDlvryChanl(CommunicationChannel1 value) {
        this.dlvryChanl = value;
        return this;
    }

    /**
     * Gets the value of the oblgrLbltyAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount28 }
     *     
     */
    public CashAccount28 getOblgrLbltyAcct() {
        return oblgrLbltyAcct;
    }

    /**
     * Sets the value of the oblgrLbltyAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount28 }
     *     
     */
    public Undertaking1 setOblgrLbltyAcct(CashAccount28 value) {
        this.oblgrLbltyAcct = value;
        return this;
    }

    /**
     * Gets the value of the oblgrChrgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount28 }
     *     
     */
    public CashAccount28 getOblgrChrgAcct() {
        return oblgrChrgAcct;
    }

    /**
     * Sets the value of the oblgrChrgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount28 }
     *     
     */
    public Undertaking1 setOblgrChrgAcct(CashAccount28 value) {
        this.oblgrChrgAcct = value;
        return this;
    }

    /**
     * Gets the value of the oblgrSttlmAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount28 }
     *     
     */
    public CashAccount28 getOblgrSttlmAcct() {
        return oblgrSttlmAcct;
    }

    /**
     * Sets the value of the oblgrSttlmAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount28 }
     *     
     */
    public Undertaking1 setOblgrSttlmAcct(CashAccount28 value) {
        this.oblgrSttlmAcct = value;
        return this;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document9 }
     * 
     * 
     */
    public List<Document9> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<Document9>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the addtlApplInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlApplInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlApplInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlApplInf() {
        if (addtlApplInf == null) {
            addtlApplInf = new ArrayList<String>();
        }
        return this.addtlApplInf;
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
     * Adds a new item to the applcnt list.
     * @see #getApplcnt()
     * 
     */
    public Undertaking1 addApplcnt(PartyIdentification43 applcnt) {
        getApplcnt().add(applcnt);
        return this;
    }

    /**
     * Adds a new item to the bnfcry list.
     * @see #getBnfcry()
     * 
     */
    public Undertaking1 addBnfcry(PartyIdentification43 bnfcry) {
        getBnfcry().add(bnfcry);
        return this;
    }

    /**
     * Adds a new item to the addtlPty list.
     * @see #getAddtlPty()
     * 
     */
    public Undertaking1 addAddtlPty(PartyAndType1 addtlPty) {
        getAddtlPty().add(addtlPty);
        return this;
    }

    /**
     * Adds a new item to the undrlygTx list.
     * @see #getUndrlygTx()
     * 
     */
    public Undertaking1 addUndrlygTx(UnderlyingTradeTransaction1 undrlygTx) {
        getUndrlygTx().add(undrlygTx);
        return this;
    }

    /**
     * Adds a new item to the automtcAmtVartn list.
     * @see #getAutomtcAmtVartn()
     * 
     */
    public Undertaking1 addAutomtcAmtVartn(AutomaticVariation1 automtcAmtVartn) {
        getAutomtcAmtVartn().add(automtcAmtVartn);
        return this;
    }

    /**
     * Adds a new item to the nclsdFile list.
     * @see #getNclsdFile()
     * 
     */
    public Undertaking1 addNclsdFile(Document9 nclsdFile) {
        getNclsdFile().add(nclsdFile);
        return this;
    }

    /**
     * Adds a new item to the addtlApplInf list.
     * @see #getAddtlApplInf()
     * 
     */
    public Undertaking1 addAddtlApplInf(String addtlApplInf) {
        getAddtlApplInf().add(addtlApplInf);
        return this;
    }

}
