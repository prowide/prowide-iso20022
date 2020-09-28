
package com.prowidesoftware.swift.model.mx.dic;

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
 * Information about an undertaking.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Undertaking4", propOrder = {
    "nm",
    "tp",
    "applcnt",
    "bnfcry",
    "dtOfIssnc",
    "advsgPty",
    "scndAdvsgPty",
    "lclUdrtkgAmt",
    "xpryDtls",
    "confInd",
    "addtlPty",
    "govncRulesAndLaw",
    "undrlygTx",
    "presntnDtls",
    "udrtkgWrdg",
    "mltplDmndInd",
    "prtlDmndInd",
    "confChrgsPyblBy",
    "trfChrgsPyblBy",
    "automtcAmtVartn",
    "dlvryChanl",
    "trfInd",
    "addtlInf"
})
public class Undertaking4 {

    @XmlElement(name = "Nm", required = true)
    @XmlSchemaType(name = "string")
    protected UndertakingName1Code nm;
    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Applcnt", required = true)
    protected List<PartyIdentification43> applcnt;
    @XmlElement(name = "Bnfcry", required = true)
    protected List<PartyIdentification43> bnfcry;
    @XmlElement(name = "DtOfIssnc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfIssnc;
    @XmlElement(name = "AdvsgPty")
    protected PartyIdentification43 advsgPty;
    @XmlElement(name = "ScndAdvsgPty")
    protected PartyIdentification43 scndAdvsgPty;
    @XmlElement(name = "LclUdrtkgAmt", required = true)
    protected UndertakingAmount1 lclUdrtkgAmt;
    @XmlElement(name = "XpryDtls", required = true)
    protected ExpiryDetails1 xpryDtls;
    @XmlElement(name = "ConfInd")
    protected Boolean confInd;
    @XmlElement(name = "AddtlPty")
    protected List<PartyAndType1> addtlPty;
    @XmlElement(name = "GovncRulesAndLaw", required = true)
    protected GovernanceRules1 govncRulesAndLaw;
    @XmlElement(name = "UndrlygTx")
    protected List<UnderlyingTradeTransaction1> undrlygTx;
    @XmlElement(name = "PresntnDtls")
    protected Presentation1 presntnDtls;
    @XmlElement(name = "UdrtkgWrdg", required = true)
    protected UndertakingWording1 udrtkgWrdg;
    @XmlElement(name = "MltplDmndInd")
    protected Boolean mltplDmndInd;
    @XmlElement(name = "PrtlDmndInd")
    protected Boolean prtlDmndInd;
    @XmlElement(name = "ConfChrgsPyblBy")
    protected String confChrgsPyblBy;
    @XmlElement(name = "TrfChrgsPyblBy")
    protected String trfChrgsPyblBy;
    @XmlElement(name = "AutomtcAmtVartn")
    protected List<AutomaticVariation1> automtcAmtVartn;
    @XmlElement(name = "DlvryChanl")
    protected CommunicationChannel1 dlvryChanl;
    @XmlElement(name = "TrfInd")
    protected Boolean trfInd;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

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
    public Undertaking4 setNm(UndertakingName1Code value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Undertaking4 setTp(String value) {
        this.tp = value;
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
     * Gets the value of the dtOfIssnc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfIssnc() {
        return dtOfIssnc;
    }

    /**
     * Sets the value of the dtOfIssnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Undertaking4 setDtOfIssnc(XMLGregorianCalendar value) {
        this.dtOfIssnc = value;
        return this;
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
    public Undertaking4 setAdvsgPty(PartyIdentification43 value) {
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
    public Undertaking4 setScndAdvsgPty(PartyIdentification43 value) {
        this.scndAdvsgPty = value;
        return this;
    }

    /**
     * Gets the value of the lclUdrtkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount1 }
     *     
     */
    public UndertakingAmount1 getLclUdrtkgAmt() {
        return lclUdrtkgAmt;
    }

    /**
     * Sets the value of the lclUdrtkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount1 }
     *     
     */
    public Undertaking4 setLclUdrtkgAmt(UndertakingAmount1 value) {
        this.lclUdrtkgAmt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public ExpiryDetails1 getXpryDtls() {
        return xpryDtls;
    }

    /**
     * Sets the value of the xpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public Undertaking4 setXpryDtls(ExpiryDetails1 value) {
        this.xpryDtls = value;
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
    public Undertaking4 setConfInd(Boolean value) {
        this.confInd = value;
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
    public Undertaking4 setGovncRulesAndLaw(GovernanceRules1 value) {
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
     *     {@link Presentation1 }
     *     
     */
    public Presentation1 getPresntnDtls() {
        return presntnDtls;
    }

    /**
     * Sets the value of the presntnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presentation1 }
     *     
     */
    public Undertaking4 setPresntnDtls(Presentation1 value) {
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
    public Undertaking4 setUdrtkgWrdg(UndertakingWording1 value) {
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
    public Undertaking4 setMltplDmndInd(Boolean value) {
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
    public Undertaking4 setPrtlDmndInd(Boolean value) {
        this.prtlDmndInd = value;
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
    public Undertaking4 setConfChrgsPyblBy(String value) {
        this.confChrgsPyblBy = value;
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
    public Undertaking4 setTrfChrgsPyblBy(String value) {
        this.trfChrgsPyblBy = value;
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
    public Undertaking4 setDlvryChanl(CommunicationChannel1 value) {
        this.dlvryChanl = value;
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
    public Undertaking4 setTrfInd(Boolean value) {
        this.trfInd = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
        }
        return this.addtlInf;
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
    public Undertaking4 addApplcnt(PartyIdentification43 applcnt) {
        getApplcnt().add(applcnt);
        return this;
    }

    /**
     * Adds a new item to the bnfcry list.
     * @see #getBnfcry()
     * 
     */
    public Undertaking4 addBnfcry(PartyIdentification43 bnfcry) {
        getBnfcry().add(bnfcry);
        return this;
    }

    /**
     * Adds a new item to the addtlPty list.
     * @see #getAddtlPty()
     * 
     */
    public Undertaking4 addAddtlPty(PartyAndType1 addtlPty) {
        getAddtlPty().add(addtlPty);
        return this;
    }

    /**
     * Adds a new item to the undrlygTx list.
     * @see #getUndrlygTx()
     * 
     */
    public Undertaking4 addUndrlygTx(UnderlyingTradeTransaction1 undrlygTx) {
        getUndrlygTx().add(undrlygTx);
        return this;
    }

    /**
     * Adds a new item to the automtcAmtVartn list.
     * @see #getAutomtcAmtVartn()
     * 
     */
    public Undertaking4 addAutomtcAmtVartn(AutomaticVariation1 automtcAmtVartn) {
        getAutomtcAmtVartn().add(automtcAmtVartn);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Undertaking4 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
