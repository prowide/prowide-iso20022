
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the status of a transfer instruction and its reason.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferStatusAndReason8", propOrder = {
    "mstrRef",
    "trfRef",
    "clntRef",
    "cxlRef",
    "trfEvtTp",
    "trfSts",
    "instrm",
    "invstmtAcctDtls",
    "intrmyInf",
    "tradDt",
    "sttlmDt",
    "sndOutDt",
    "cshSttlmDt",
    "ttlUnitsNb",
    "avrgPric",
    "unitsDtls",
    "convs",
    "ttlTrfVal",
    "pmtDtls",
    "bnftCrstllstnEvt",
    "drwdwnTrch",
    "othrDrwdwnInf",
    "qryRspn",
    "stsInitr",
    "stsIssr",
    "stsRcpt",
    "addtlInf"
})
public class TransferStatusAndReason8 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "TrfEvtTp")
    protected List<TransferStatusType3Choice> trfEvtTp;
    @XmlElement(name = "TrfSts", required = true)
    protected TransferStatus5Choice trfSts;
    @XmlElement(name = "Instrm")
    protected FinancialInstrument63Choice instrm;
    @XmlElement(name = "InvstmtAcctDtls")
    protected Account33 invstmtAcctDtls;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary48> intrmyInf;
    @XmlElement(name = "TradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "SttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;
    @XmlElement(name = "SndOutDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sndOutDt;
    @XmlElement(name = "CshSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "TtlUnitsNb")
    protected BigDecimal ttlUnitsNb;
    @XmlElement(name = "AvrgPric")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount avrgPric;
    @XmlElement(name = "UnitsDtls")
    protected List<Unit11> unitsDtls;
    @XmlElement(name = "Convs")
    protected Conversion2 convs;
    @XmlElement(name = "TtlTrfVal")
    protected ActiveCurrencyAnd13DecimalAmount ttlTrfVal;
    @XmlElement(name = "PmtDtls")
    protected List<PaymentInstrument18> pmtDtls;
    @XmlElement(name = "BnftCrstllstnEvt")
    protected List<BenefitCrystallisationEvent2> bnftCrstllstnEvt;
    @XmlElement(name = "DrwdwnTrch")
    protected List<Drawdown2> drwdwnTrch;
    @XmlElement(name = "OthrDrwdwnInf")
    protected Drawdown3 othrDrwdwnInf;
    @XmlElement(name = "QryRspn")
    protected List<String> qryRspn;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification139 stsInitr;
    @XmlElement(name = "StsIssr")
    protected PartyIdentification139 stsIssr;
    @XmlElement(name = "StsRcpt")
    protected PartyIdentification139 stsRcpt;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason8 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason8 setTrfRef(String value) {
        this.trfRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public TransferStatusAndReason8 setClntRef(AdditionalReference10 value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason8 setCxlRef(String value) {
        this.cxlRef = value;
        return this;
    }

    /**
     * Gets the value of the trfEvtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trfEvtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrfEvtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferStatusType3Choice }
     * 
     * 
     */
    public List<TransferStatusType3Choice> getTrfEvtTp() {
        if (trfEvtTp == null) {
            trfEvtTp = new ArrayList<TransferStatusType3Choice>();
        }
        return this.trfEvtTp;
    }

    /**
     * Gets the value of the trfSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferStatus5Choice }
     *     
     */
    public TransferStatus5Choice getTrfSts() {
        return trfSts;
    }

    /**
     * Sets the value of the trfSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferStatus5Choice }
     *     
     */
    public TransferStatusAndReason8 setTrfSts(TransferStatus5Choice value) {
        this.trfSts = value;
        return this;
    }

    /**
     * Gets the value of the instrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument63Choice }
     *     
     */
    public FinancialInstrument63Choice getInstrm() {
        return instrm;
    }

    /**
     * Sets the value of the instrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument63Choice }
     *     
     */
    public TransferStatusAndReason8 setInstrm(FinancialInstrument63Choice value) {
        this.instrm = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Account33 }
     *     
     */
    public Account33 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account33 }
     *     
     */
    public TransferStatusAndReason8 setInvstmtAcctDtls(Account33 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary48 }
     * 
     * 
     */
    public List<Intermediary48> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<Intermediary48>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason8 setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason8 setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sndOutDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getSndOutDt() {
        return sndOutDt;
    }

    /**
     * Sets the value of the sndOutDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason8 setSndOutDt(XMLGregorianCalendar value) {
        this.sndOutDt = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason8 setCshSttlmDt(XMLGregorianCalendar value) {
        this.cshSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the ttlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlUnitsNb() {
        return ttlUnitsNb;
    }

    /**
     * Sets the value of the ttlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransferStatusAndReason8 setTtlUnitsNb(BigDecimal value) {
        this.ttlUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the avrgPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getAvrgPric() {
        return avrgPric;
    }

    /**
     * Sets the value of the avrgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public TransferStatusAndReason8 setAvrgPric(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.avrgPric = value;
        return this;
    }

    /**
     * Gets the value of the unitsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unit11 }
     * 
     * 
     */
    public List<Unit11> getUnitsDtls() {
        if (unitsDtls == null) {
            unitsDtls = new ArrayList<Unit11>();
        }
        return this.unitsDtls;
    }

    /**
     * Gets the value of the convs property.
     * 
     * @return
     *     possible object is
     *     {@link Conversion2 }
     *     
     */
    public Conversion2 getConvs() {
        return convs;
    }

    /**
     * Sets the value of the convs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conversion2 }
     *     
     */
    public TransferStatusAndReason8 setConvs(Conversion2 value) {
        this.convs = value;
        return this;
    }

    /**
     * Gets the value of the ttlTrfVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTtlTrfVal() {
        return ttlTrfVal;
    }

    /**
     * Sets the value of the ttlTrfVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TransferStatusAndReason8 setTtlTrfVal(ActiveCurrencyAnd13DecimalAmount value) {
        this.ttlTrfVal = value;
        return this;
    }

    /**
     * Gets the value of the pmtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstrument18 }
     * 
     * 
     */
    public List<PaymentInstrument18> getPmtDtls() {
        if (pmtDtls == null) {
            pmtDtls = new ArrayList<PaymentInstrument18>();
        }
        return this.pmtDtls;
    }

    /**
     * Gets the value of the bnftCrstllstnEvt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bnftCrstllstnEvt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnftCrstllstnEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenefitCrystallisationEvent2 }
     * 
     * 
     */
    public List<BenefitCrystallisationEvent2> getBnftCrstllstnEvt() {
        if (bnftCrstllstnEvt == null) {
            bnftCrstllstnEvt = new ArrayList<BenefitCrystallisationEvent2>();
        }
        return this.bnftCrstllstnEvt;
    }

    /**
     * Gets the value of the drwdwnTrch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drwdwnTrch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrwdwnTrch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Drawdown2 }
     * 
     * 
     */
    public List<Drawdown2> getDrwdwnTrch() {
        if (drwdwnTrch == null) {
            drwdwnTrch = new ArrayList<Drawdown2>();
        }
        return this.drwdwnTrch;
    }

    /**
     * Gets the value of the othrDrwdwnInf property.
     * 
     * @return
     *     possible object is
     *     {@link Drawdown3 }
     *     
     */
    public Drawdown3 getOthrDrwdwnInf() {
        return othrDrwdwnInf;
    }

    /**
     * Sets the value of the othrDrwdwnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drawdown3 }
     *     
     */
    public TransferStatusAndReason8 setOthrDrwdwnInf(Drawdown3 value) {
        this.othrDrwdwnInf = value;
        return this;
    }

    /**
     * Gets the value of the qryRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qryRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQryRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQryRspn() {
        if (qryRspn == null) {
            qryRspn = new ArrayList<String>();
        }
        return this.qryRspn;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public TransferStatusAndReason8 setStsInitr(PartyIdentification139 value) {
        this.stsInitr = value;
        return this;
    }

    /**
     * Gets the value of the stsIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getStsIssr() {
        return stsIssr;
    }

    /**
     * Sets the value of the stsIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public TransferStatusAndReason8 setStsIssr(PartyIdentification139 value) {
        this.stsIssr = value;
        return this;
    }

    /**
     * Gets the value of the stsRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getStsRcpt() {
        return stsRcpt;
    }

    /**
     * Sets the value of the stsRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public TransferStatusAndReason8 setStsRcpt(PartyIdentification139 value) {
        this.stsRcpt = value;
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
     * {@link AdditionalInformation15 }
     * 
     * 
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation15>();
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
     * Adds a new item to the trfEvtTp list.
     * @see #getTrfEvtTp()
     * 
     */
    public TransferStatusAndReason8 addTrfEvtTp(TransferStatusType3Choice trfEvtTp) {
        getTrfEvtTp().add(trfEvtTp);
        return this;
    }

    /**
     * Adds a new item to the intrmyInf list.
     * @see #getIntrmyInf()
     * 
     */
    public TransferStatusAndReason8 addIntrmyInf(Intermediary48 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

    /**
     * Adds a new item to the unitsDtls list.
     * @see #getUnitsDtls()
     * 
     */
    public TransferStatusAndReason8 addUnitsDtls(Unit11 unitsDtls) {
        getUnitsDtls().add(unitsDtls);
        return this;
    }

    /**
     * Adds a new item to the pmtDtls list.
     * @see #getPmtDtls()
     * 
     */
    public TransferStatusAndReason8 addPmtDtls(PaymentInstrument18 pmtDtls) {
        getPmtDtls().add(pmtDtls);
        return this;
    }

    /**
     * Adds a new item to the bnftCrstllstnEvt list.
     * @see #getBnftCrstllstnEvt()
     * 
     */
    public TransferStatusAndReason8 addBnftCrstllstnEvt(BenefitCrystallisationEvent2 bnftCrstllstnEvt) {
        getBnftCrstllstnEvt().add(bnftCrstllstnEvt);
        return this;
    }

    /**
     * Adds a new item to the drwdwnTrch list.
     * @see #getDrwdwnTrch()
     * 
     */
    public TransferStatusAndReason8 addDrwdwnTrch(Drawdown2 drwdwnTrch) {
        getDrwdwnTrch().add(drwdwnTrch);
        return this;
    }

    /**
     * Adds a new item to the qryRspn list.
     * @see #getQryRspn()
     * 
     */
    public TransferStatusAndReason8 addQryRspn(String qryRspn) {
        getQryRspn().add(qryRspn);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public TransferStatusAndReason8 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
