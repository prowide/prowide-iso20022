
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The RetrievaFulfilmentInitiation message is sent by an acquirer or agent to an issuer to support an issuer's retrieval request.
 * 
 * The RetrievaFulfilmentInitiation message is the activity initiated by the acceptor, the acquirer or the relevant agent to support the issuer who has determined that a transaction information document needs to be examined before a potential chargeback is sent or to satisfy another need of the issuer or the cardholder. Only an issuer or its agent can initiate a retrieval request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalFulfilmentInitiationV04", propOrder = {
    "hdr",
    "txChrtcs",
    "orgtr",
    "acqrr",
    "sndr",
    "card",
    "rcvr",
    "issr",
    "dstn",
    "prgrmm",
    "txId",
    "convsDtTm",
    "accptr",
    "txtr",
    "termnl",
    "cntxt",
    "pyer",
    "pyee",
    "tkn",
    "wllt",
    "spclPrgrmmQlfctn",
    "jursdctn",
    "sttlmSvc",
    "addtlFee",
    "rcncltn",
    "dsptData",
    "orgnlTx",
    "rtrvlFlfmtInstrs",
    "prcgRslt",
    "prtctdData",
    "prvtData",
    "ntlData",
    "sctyTrlr"
})
public class RetrievalFulfilmentInitiationV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header72 hdr;
    @XmlElement(name = "TxChrtcs")
    protected TransactionCharacteristics6 txChrtcs;
    @XmlElement(name = "Orgtr")
    protected OriginatorData2 orgtr;
    @XmlElement(name = "Acqrr", required = true)
    protected AcquirerData1 acqrr;
    @XmlElement(name = "Sndr")
    protected SenderData1 sndr;
    @XmlElement(name = "Card")
    protected CardData17 card;
    @XmlElement(name = "Rcvr")
    protected ReceiverData1 rcvr;
    @XmlElement(name = "Issr")
    protected IssuerData1 issr;
    @XmlElement(name = "Dstn")
    protected DestinationData1 dstn;
    @XmlElement(name = "Prgrmm")
    protected List<ProgrammeMode6> prgrmm;
    @XmlElement(name = "TxId")
    protected TransactionIdentification60 txId;
    @XmlElement(name = "ConvsDtTm")
    protected DateTime2 convsDtTm;
    @XmlElement(name = "Accptr")
    protected AcceptorData2 accptr;
    @XmlElement(name = "Txtr")
    protected TransactorData1 txtr;
    @XmlElement(name = "Termnl")
    protected Terminal12 termnl;
    @XmlElement(name = "Cntxt")
    protected Context30 cntxt;
    @XmlElement(name = "Pyer")
    protected PayerData1 pyer;
    @XmlElement(name = "Pyee")
    protected PayeeData1 pyee;
    @XmlElement(name = "Tkn")
    protected Token5 tkn;
    @XmlElement(name = "Wllt")
    protected Wallet4 wllt;
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<ATICALaxProcessing> spclPrgrmmQlfctn;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService7 sttlmSvc;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee4> addtlFee;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation5 rcncltn;
    @XmlElement(name = "DsptData", required = true)
    protected List<DisputeData5> dsptData;
    @XmlElement(name = "OrgnlTx")
    protected OriginalTransaction4 orgnlTx;
    @XmlElement(name = "RtrvlFlfmtInstrs")
    protected List<ATICALaxProcessing> rtrvlFlfmtInstrs;
    @XmlElement(name = "PrcgRslt")
    protected ProcessingResult31 prcgRslt;
    @XmlElement(name = "PrtctdData")
    protected List<EncryptedData2> prtctdData;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType41 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header72 }
     *     
     */
    public Header72 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header72 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setHdr(Header72 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the txChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCharacteristics6 }
     *     
     */
    public TransactionCharacteristics6 getTxChrtcs() {
        return txChrtcs;
    }

    /**
     * Sets the value of the txChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCharacteristics6 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setTxChrtcs(TransactionCharacteristics6 value) {
        this.txChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorData2 }
     *     
     */
    public OriginatorData2 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorData2 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setOrgtr(OriginatorData2 value) {
        this.orgtr = value;
        return this;
    }

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerData1 }
     *     
     */
    public AcquirerData1 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerData1 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setAcqrr(AcquirerData1 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link SenderData1 }
     *     
     */
    public SenderData1 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderData1 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setSndr(SenderData1 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardData17 }
     *     
     */
    public CardData17 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData17 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setCard(CardData17 value) {
        this.card = value;
        return this;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverData1 }
     *     
     */
    public ReceiverData1 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverData1 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setRcvr(ReceiverData1 value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerData1 }
     *     
     */
    public IssuerData1 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerData1 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setIssr(IssuerData1 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationData1 }
     *     
     */
    public DestinationData1 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationData1 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setDstn(DestinationData1 value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the prgrmm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prgrmm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrgrmm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgrammeMode6 }
     * 
     * 
     * @return
     *     The value of the prgrmm property.
     */
    public List<ProgrammeMode6> getPrgrmm() {
        if (prgrmm == null) {
            prgrmm = new ArrayList<>();
        }
        return this.prgrmm;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification60 }
     *     
     */
    public TransactionIdentification60 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification60 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setTxId(TransactionIdentification60 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the convsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime2 }
     *     
     */
    public DateTime2 getConvsDtTm() {
        return convsDtTm;
    }

    /**
     * Sets the value of the convsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime2 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setConvsDtTm(DateTime2 value) {
        this.convsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the accptr property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorData2 }
     *     
     */
    public AcceptorData2 getAccptr() {
        return accptr;
    }

    /**
     * Sets the value of the accptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorData2 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setAccptr(AcceptorData2 value) {
        this.accptr = value;
        return this;
    }

    /**
     * Gets the value of the txtr property.
     * 
     * @return
     *     possible object is
     *     {@link TransactorData1 }
     *     
     */
    public TransactorData1 getTxtr() {
        return txtr;
    }

    /**
     * Sets the value of the txtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactorData1 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setTxtr(TransactorData1 value) {
        this.txtr = value;
        return this;
    }

    /**
     * Gets the value of the termnl property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal12 }
     *     
     */
    public Terminal12 getTermnl() {
        return termnl;
    }

    /**
     * Sets the value of the termnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal12 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setTermnl(Terminal12 value) {
        this.termnl = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context30 }
     *     
     */
    public Context30 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context30 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setCntxt(Context30 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the pyer property.
     * 
     * @return
     *     possible object is
     *     {@link PayerData1 }
     *     
     */
    public PayerData1 getPyer() {
        return pyer;
    }

    /**
     * Sets the value of the pyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerData1 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setPyer(PayerData1 value) {
        this.pyer = value;
        return this;
    }

    /**
     * Gets the value of the pyee property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeData1 }
     *     
     */
    public PayeeData1 getPyee() {
        return pyee;
    }

    /**
     * Sets the value of the pyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeData1 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setPyee(PayeeData1 value) {
        this.pyee = value;
        return this;
    }

    /**
     * Gets the value of the tkn property.
     * 
     * @return
     *     possible object is
     *     {@link Token5 }
     *     
     */
    public Token5 getTkn() {
        return tkn;
    }

    /**
     * Sets the value of the tkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token5 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setTkn(Token5 value) {
        this.tkn = value;
        return this;
    }

    /**
     * Gets the value of the wllt property.
     * 
     * @return
     *     possible object is
     *     {@link Wallet4 }
     *     
     */
    public Wallet4 getWllt() {
        return wllt;
    }

    /**
     * Sets the value of the wllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wallet4 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setWllt(Wallet4 value) {
        this.wllt = value;
        return this;
    }

    /**
     * Gets the value of the spclPrgrmmQlfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spclPrgrmmQlfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpclPrgrmmQlfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the spclPrgrmmQlfctn property.
     */
    public List<ATICALaxProcessing> getSpclPrgrmmQlfctn() {
        if (spclPrgrmmQlfctn == null) {
            spclPrgrmmQlfctn = new ArrayList<>();
        }
        return this.spclPrgrmmQlfctn;
    }

    /**
     * Gets the value of the jursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link Jurisdiction2 }
     *     
     */
    public Jurisdiction2 getJursdctn() {
        return jursdctn;
    }

    /**
     * Sets the value of the jursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jurisdiction2 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setJursdctn(Jurisdiction2 value) {
        this.jursdctn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSvc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementService7 }
     *     
     */
    public SettlementService7 getSttlmSvc() {
        return sttlmSvc;
    }

    /**
     * Sets the value of the sttlmSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementService7 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setSttlmSvc(SettlementService7 value) {
        this.sttlmSvc = value;
        return this;
    }

    /**
     * Gets the value of the addtlFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee4 }
     * 
     * 
     * @return
     *     The value of the addtlFee property.
     */
    public List<AdditionalFee4> getAddtlFee() {
        if (addtlFee == null) {
            addtlFee = new ArrayList<>();
        }
        return this.addtlFee;
    }

    /**
     * Gets the value of the rcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link Reconciliation5 }
     *     
     */
    public Reconciliation5 getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconciliation5 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setRcncltn(Reconciliation5 value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the dsptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeData5 }
     * 
     * 
     * @return
     *     The value of the dsptData property.
     */
    public List<DisputeData5> getDsptData() {
        if (dsptData == null) {
            dsptData = new ArrayList<>();
        }
        return this.dsptData;
    }

    /**
     * Gets the value of the orgnlTx property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransaction4 }
     *     
     */
    public OriginalTransaction4 getOrgnlTx() {
        return orgnlTx;
    }

    /**
     * Sets the value of the orgnlTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransaction4 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setOrgnlTx(OriginalTransaction4 value) {
        this.orgnlTx = value;
        return this;
    }

    /**
     * Gets the value of the rtrvlFlfmtInstrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rtrvlFlfmtInstrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtrvlFlfmtInstrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the rtrvlFlfmtInstrs property.
     */
    public List<ATICALaxProcessing> getRtrvlFlfmtInstrs() {
        if (rtrvlFlfmtInstrs == null) {
            rtrvlFlfmtInstrs = new ArrayList<>();
        }
        return this.rtrvlFlfmtInstrs;
    }

    /**
     * Gets the value of the prcgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult31 }
     *     
     */
    public ProcessingResult31 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Sets the value of the prcgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult31 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setPrcgRslt(ProcessingResult31 value) {
        this.prcgRslt = value;
        return this;
    }

    /**
     * Gets the value of the prtctdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtctdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtctdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptedData2 }
     * 
     * 
     * @return
     *     The value of the prtctdData property.
     */
    public List<EncryptedData2> getPrtctdData() {
        if (prtctdData == null) {
            prtctdData = new ArrayList<>();
        }
        return this.prtctdData;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType41 }
     *     
     */
    public ContentInformationType41 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType41 }
     *     
     */
    public RetrievalFulfilmentInitiationV04 setSctyTrlr(ContentInformationType41 value) {
        this.sctyTrlr = value;
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
     * Adds a new item to the prgrmm list.
     * @see #getPrgrmm()
     * 
     */
    public RetrievalFulfilmentInitiationV04 addPrgrmm(ProgrammeMode6 prgrmm) {
        getPrgrmm().add(prgrmm);
        return this;
    }

    /**
     * Adds a new item to the spclPrgrmmQlfctn list.
     * @see #getSpclPrgrmmQlfctn()
     * 
     */
    public RetrievalFulfilmentInitiationV04 addSpclPrgrmmQlfctn(ATICALaxProcessing spclPrgrmmQlfctn) {
        getSpclPrgrmmQlfctn().add(spclPrgrmmQlfctn);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public RetrievalFulfilmentInitiationV04 addAddtlFee(AdditionalFee4 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the dsptData list.
     * @see #getDsptData()
     * 
     */
    public RetrievalFulfilmentInitiationV04 addDsptData(DisputeData5 dsptData) {
        getDsptData().add(dsptData);
        return this;
    }

    /**
     * Adds a new item to the rtrvlFlfmtInstrs list.
     * @see #getRtrvlFlfmtInstrs()
     * 
     */
    public RetrievalFulfilmentInitiationV04 addRtrvlFlfmtInstrs(ATICALaxProcessing rtrvlFlfmtInstrs) {
        getRtrvlFlfmtInstrs().add(rtrvlFlfmtInstrs);
        return this;
    }

    /**
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public RetrievalFulfilmentInitiationV04 addPrtctdData(EncryptedData2 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public RetrievalFulfilmentInitiationV04 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public RetrievalFulfilmentInitiationV04 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
