
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
 * The CardManagementInitiation message is sent by the acquirer to an issuer or agent to fulfil a request initiated by the cardholder at the point of service for an operation on the card account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardManagementInitiationV04", propOrder = {
    "hdr",
    "txChrtcs",
    "orgtr",
    "acqrr",
    "sndr",
    "card",
    "acctFr",
    "acctTo",
    "rcvr",
    "issr",
    "dstn",
    "prgrmm",
    "txId",
    "newPINData",
    "convsDtTm",
    "xchgRate",
    "txAmts",
    "addtlAmt",
    "orgnlDataElmts",
    "accptr",
    "txtr",
    "termnl",
    "poiCmpnt",
    "cntxt",
    "iccRltdData",
    "authntcnData",
    "tkn",
    "cstmrDvc",
    "wllt",
    "crdhldr",
    "vrfctn",
    "rsk",
    "addtlSvc",
    "jursdctn",
    "sttlmSvc",
    "addtlFee",
    "rcncltn",
    "prcgRslt",
    "strngCstmrAuthntcn",
    "prtctdData",
    "prvtData",
    "ntlData",
    "sctyTrlr"
})
public class CardManagementInitiationV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header72 hdr;
    @XmlElement(name = "TxChrtcs", required = true)
    protected TransactionCharacteristics6 txChrtcs;
    @XmlElement(name = "Orgtr")
    protected OriginatorData2 orgtr;
    @XmlElement(name = "Acqrr", required = true)
    protected AcquirerData1 acqrr;
    @XmlElement(name = "Sndr")
    protected SenderData1 sndr;
    @XmlElement(name = "Card")
    protected CardData16 card;
    @XmlElement(name = "AcctFr")
    protected AccountDetails4 acctFr;
    @XmlElement(name = "AcctTo")
    protected AccountDetails4 acctTo;
    @XmlElement(name = "Rcvr")
    protected ReceiverData1 rcvr;
    @XmlElement(name = "Issr")
    protected IssuerData1 issr;
    @XmlElement(name = "Dstn")
    protected DestinationData1 dstn;
    @XmlElement(name = "Prgrmm")
    protected ProgrammeMode7 prgrmm;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification58 txId;
    @XmlElement(name = "NewPINData")
    protected PINData1 newPINData;
    @XmlElement(name = "ConvsDtTm")
    protected DateTime2 convsDtTm;
    @XmlElement(name = "XchgRate")
    protected List<CardExchangeRate1> xchgRate;
    @XmlElement(name = "TxAmts")
    protected TransactionAmounts6 txAmts;
    @XmlElement(name = "AddtlAmt")
    protected List<AdditionalAmounts5> addtlAmt;
    @XmlElement(name = "OrgnlDataElmts")
    protected OriginalDataElements5 orgnlDataElmts;
    @XmlElement(name = "Accptr", required = true)
    protected AcceptorData1 accptr;
    @XmlElement(name = "Txtr")
    protected TransactorData1 txtr;
    @XmlElement(name = "Termnl")
    protected Terminal10 termnl;
    @XmlElement(name = "POICmpnt")
    protected List<PointOfInteractionComponent16> poiCmpnt;
    @XmlElement(name = "Cntxt", required = true)
    protected Context28 cntxt;
    @XmlElement(name = "ICCRltdData")
    protected String iccRltdData;
    @XmlElement(name = "AuthntcnData")
    protected CardAuthenticationData1 authntcnData;
    @XmlElement(name = "Tkn")
    protected Token5 tkn;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice6 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected Wallet4 wllt;
    @XmlElement(name = "Crdhldr")
    protected List<Cardholder23> crdhldr;
    @XmlElement(name = "Vrfctn")
    protected List<Verification8> vrfctn;
    @XmlElement(name = "Rsk")
    protected List<RiskContext4> rsk;
    @XmlElement(name = "AddtlSvc")
    protected List<AdditionalService3> addtlSvc;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService7 sttlmSvc;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee4> addtlFee;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation5 rcncltn;
    @XmlElement(name = "PrcgRslt")
    protected ProcessingResult28 prcgRslt;
    @XmlElement(name = "StrngCstmrAuthntcn")
    protected StrongCustomerAuthentication2 strngCstmrAuthntcn;
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
    public CardManagementInitiationV04 setHdr(Header72 value) {
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
    public CardManagementInitiationV04 setTxChrtcs(TransactionCharacteristics6 value) {
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
    public CardManagementInitiationV04 setOrgtr(OriginatorData2 value) {
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
    public CardManagementInitiationV04 setAcqrr(AcquirerData1 value) {
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
    public CardManagementInitiationV04 setSndr(SenderData1 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardData16 }
     *     
     */
    public CardData16 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData16 }
     *     
     */
    public CardManagementInitiationV04 setCard(CardData16 value) {
        this.card = value;
        return this;
    }

    /**
     * Gets the value of the acctFr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetails4 }
     *     
     */
    public AccountDetails4 getAcctFr() {
        return acctFr;
    }

    /**
     * Sets the value of the acctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetails4 }
     *     
     */
    public CardManagementInitiationV04 setAcctFr(AccountDetails4 value) {
        this.acctFr = value;
        return this;
    }

    /**
     * Gets the value of the acctTo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetails4 }
     *     
     */
    public AccountDetails4 getAcctTo() {
        return acctTo;
    }

    /**
     * Sets the value of the acctTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetails4 }
     *     
     */
    public CardManagementInitiationV04 setAcctTo(AccountDetails4 value) {
        this.acctTo = value;
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
    public CardManagementInitiationV04 setRcvr(ReceiverData1 value) {
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
    public CardManagementInitiationV04 setIssr(IssuerData1 value) {
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
    public CardManagementInitiationV04 setDstn(DestinationData1 value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the prgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammeMode7 }
     *     
     */
    public ProgrammeMode7 getPrgrmm() {
        return prgrmm;
    }

    /**
     * Sets the value of the prgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammeMode7 }
     *     
     */
    public CardManagementInitiationV04 setPrgrmm(ProgrammeMode7 value) {
        this.prgrmm = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification58 }
     *     
     */
    public TransactionIdentification58 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification58 }
     *     
     */
    public CardManagementInitiationV04 setTxId(TransactionIdentification58 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the newPINData property.
     * 
     * @return
     *     possible object is
     *     {@link PINData1 }
     *     
     */
    public PINData1 getNewPINData() {
        return newPINData;
    }

    /**
     * Sets the value of the newPINData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINData1 }
     *     
     */
    public CardManagementInitiationV04 setNewPINData(PINData1 value) {
        this.newPINData = value;
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
    public CardManagementInitiationV04 setConvsDtTm(DateTime2 value) {
        this.convsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xchgRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXchgRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardExchangeRate1 }
     * 
     * 
     * @return
     *     The value of the xchgRate property.
     */
    public List<CardExchangeRate1> getXchgRate() {
        if (xchgRate == null) {
            xchgRate = new ArrayList<>();
        }
        return this.xchgRate;
    }

    /**
     * Gets the value of the txAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmounts6 }
     *     
     */
    public TransactionAmounts6 getTxAmts() {
        return txAmts;
    }

    /**
     * Sets the value of the txAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmounts6 }
     *     
     */
    public CardManagementInitiationV04 setTxAmts(TransactionAmounts6 value) {
        this.txAmts = value;
        return this;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAmounts5 }
     * 
     * 
     * @return
     *     The value of the addtlAmt property.
     */
    public List<AdditionalAmounts5> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<>();
        }
        return this.addtlAmt;
    }

    /**
     * Gets the value of the orgnlDataElmts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalDataElements5 }
     *     
     */
    public OriginalDataElements5 getOrgnlDataElmts() {
        return orgnlDataElmts;
    }

    /**
     * Sets the value of the orgnlDataElmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalDataElements5 }
     *     
     */
    public CardManagementInitiationV04 setOrgnlDataElmts(OriginalDataElements5 value) {
        this.orgnlDataElmts = value;
        return this;
    }

    /**
     * Gets the value of the accptr property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorData1 }
     *     
     */
    public AcceptorData1 getAccptr() {
        return accptr;
    }

    /**
     * Sets the value of the accptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorData1 }
     *     
     */
    public CardManagementInitiationV04 setAccptr(AcceptorData1 value) {
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
    public CardManagementInitiationV04 setTxtr(TransactorData1 value) {
        this.txtr = value;
        return this;
    }

    /**
     * Gets the value of the termnl property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal10 }
     *     
     */
    public Terminal10 getTermnl() {
        return termnl;
    }

    /**
     * Sets the value of the termnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal10 }
     *     
     */
    public CardManagementInitiationV04 setTermnl(Terminal10 value) {
        this.termnl = value;
        return this;
    }

    /**
     * Gets the value of the poiCmpnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiCmpnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOICmpnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent16 }
     * 
     * 
     * @return
     *     The value of the poiCmpnt property.
     */
    public List<PointOfInteractionComponent16> getPOICmpnt() {
        if (poiCmpnt == null) {
            poiCmpnt = new ArrayList<>();
        }
        return this.poiCmpnt;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context28 }
     *     
     */
    public Context28 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context28 }
     *     
     */
    public CardManagementInitiationV04 setCntxt(Context28 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardManagementInitiationV04 setICCRltdData(String value) {
        this.iccRltdData = value;
        return this;
    }

    /**
     * Gets the value of the authntcnData property.
     * 
     * @return
     *     possible object is
     *     {@link CardAuthenticationData1 }
     *     
     */
    public CardAuthenticationData1 getAuthntcnData() {
        return authntcnData;
    }

    /**
     * Sets the value of the authntcnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAuthenticationData1 }
     *     
     */
    public CardManagementInitiationV04 setAuthntcnData(CardAuthenticationData1 value) {
        this.authntcnData = value;
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
    public CardManagementInitiationV04 setTkn(Token5 value) {
        this.tkn = value;
        return this;
    }

    /**
     * Gets the value of the cstmrDvc property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice6 }
     *     
     */
    public CustomerDevice6 getCstmrDvc() {
        return cstmrDvc;
    }

    /**
     * Sets the value of the cstmrDvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice6 }
     *     
     */
    public CardManagementInitiationV04 setCstmrDvc(CustomerDevice6 value) {
        this.cstmrDvc = value;
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
    public CardManagementInitiationV04 setWllt(Wallet4 value) {
        this.wllt = value;
        return this;
    }

    /**
     * Gets the value of the crdhldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crdhldr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdhldr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cardholder23 }
     * 
     * 
     * @return
     *     The value of the crdhldr property.
     */
    public List<Cardholder23> getCrdhldr() {
        if (crdhldr == null) {
            crdhldr = new ArrayList<>();
        }
        return this.crdhldr;
    }

    /**
     * Gets the value of the vrfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vrfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVrfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Verification8 }
     * 
     * 
     * @return
     *     The value of the vrfctn property.
     */
    public List<Verification8> getVrfctn() {
        if (vrfctn == null) {
            vrfctn = new ArrayList<>();
        }
        return this.vrfctn;
    }

    /**
     * Gets the value of the rsk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskContext4 }
     * 
     * 
     * @return
     *     The value of the rsk property.
     */
    public List<RiskContext4> getRsk() {
        if (rsk == null) {
            rsk = new ArrayList<>();
        }
        return this.rsk;
    }

    /**
     * Gets the value of the addtlSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalService3 }
     * 
     * 
     * @return
     *     The value of the addtlSvc property.
     */
    public List<AdditionalService3> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<>();
        }
        return this.addtlSvc;
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
    public CardManagementInitiationV04 setJursdctn(Jurisdiction2 value) {
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
    public CardManagementInitiationV04 setSttlmSvc(SettlementService7 value) {
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
    public CardManagementInitiationV04 setRcncltn(Reconciliation5 value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the prcgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult28 }
     *     
     */
    public ProcessingResult28 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Sets the value of the prcgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult28 }
     *     
     */
    public CardManagementInitiationV04 setPrcgRslt(ProcessingResult28 value) {
        this.prcgRslt = value;
        return this;
    }

    /**
     * Gets the value of the strngCstmrAuthntcn property.
     * 
     * @return
     *     possible object is
     *     {@link StrongCustomerAuthentication2 }
     *     
     */
    public StrongCustomerAuthentication2 getStrngCstmrAuthntcn() {
        return strngCstmrAuthntcn;
    }

    /**
     * Sets the value of the strngCstmrAuthntcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrongCustomerAuthentication2 }
     *     
     */
    public CardManagementInitiationV04 setStrngCstmrAuthntcn(StrongCustomerAuthentication2 value) {
        this.strngCstmrAuthntcn = value;
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
    public CardManagementInitiationV04 setSctyTrlr(ContentInformationType41 value) {
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
     * Adds a new item to the xchgRate list.
     * @see #getXchgRate()
     * 
     */
    public CardManagementInitiationV04 addXchgRate(CardExchangeRate1 xchgRate) {
        getXchgRate().add(xchgRate);
        return this;
    }

    /**
     * Adds a new item to the addtlAmt list.
     * @see #getAddtlAmt()
     * 
     */
    public CardManagementInitiationV04 addAddtlAmt(AdditionalAmounts5 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the pOICmpnt list.
     * @see #getPOICmpnt()
     * 
     */
    public CardManagementInitiationV04 addPOICmpnt(PointOfInteractionComponent16 pOICmpnt) {
        getPOICmpnt().add(pOICmpnt);
        return this;
    }

    /**
     * Adds a new item to the crdhldr list.
     * @see #getCrdhldr()
     * 
     */
    public CardManagementInitiationV04 addCrdhldr(Cardholder23 crdhldr) {
        getCrdhldr().add(crdhldr);
        return this;
    }

    /**
     * Adds a new item to the vrfctn list.
     * @see #getVrfctn()
     * 
     */
    public CardManagementInitiationV04 addVrfctn(Verification8 vrfctn) {
        getVrfctn().add(vrfctn);
        return this;
    }

    /**
     * Adds a new item to the rsk list.
     * @see #getRsk()
     * 
     */
    public CardManagementInitiationV04 addRsk(RiskContext4 rsk) {
        getRsk().add(rsk);
        return this;
    }

    /**
     * Adds a new item to the addtlSvc list.
     * @see #getAddtlSvc()
     * 
     */
    public CardManagementInitiationV04 addAddtlSvc(AdditionalService3 addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public CardManagementInitiationV04 addAddtlFee(AdditionalFee4 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public CardManagementInitiationV04 addPrtctdData(EncryptedData2 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public CardManagementInitiationV04 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public CardManagementInitiationV04 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
