
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
 * The ReversalInitiation message is sent by an acquirer, an originator or an agent to an issuer to request or advise of the reversal of an authorisation by the issuer. A reversal is a partial or complete nullification of the effects of a previous authorisation, financial presentment or financial accumulation presentment that cannot be processed as instructed (for example, is undeliverable and cancelled or the acquirer timed out waiting for a response).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversalInitiationV05", propOrder = {
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
    "convsDtTm",
    "txAmts",
    "addtlAmt",
    "tax",
    "orgnlDataElmts",
    "accptr",
    "txtr",
    "termnl",
    "cntxt",
    "iccRltdData",
    "authntcnData",
    "pyer",
    "pyee",
    "tkn",
    "cstmrDvc",
    "wllt",
    "crdhldr",
    "vrfctn",
    "spclPrgrmmQlfctn",
    "instlmt",
    "rcrngPmt",
    "acctBal",
    "addtlSvc",
    "fndsSvcs",
    "dpstDtls",
    "jursdctn",
    "sttlmSvc",
    "addtlFee",
    "rcncltn",
    "prcgRslt",
    "bnfts",
    "prtctdData",
    "prvtData",
    "ntlData",
    "sctyTrlr"
})
public class ReversalInitiationV05 {

    @XmlElement(name = "Hdr", required = true)
    protected Header72 hdr;
    @XmlElement(name = "TxChrtcs", required = true)
    protected TransactionCharacteristics5 txChrtcs;
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
    @XmlElement(name = "ConvsDtTm")
    protected DateTime2 convsDtTm;
    @XmlElement(name = "TxAmts", required = true)
    protected TransactionAmounts5 txAmts;
    @XmlElement(name = "AddtlAmt")
    protected List<AdditionalAmounts5> addtlAmt;
    @XmlElement(name = "Tax")
    protected List<Tax44> tax;
    @XmlElement(name = "OrgnlDataElmts")
    protected OriginalDataElements6 orgnlDataElmts;
    @XmlElement(name = "Accptr")
    protected AcceptorData1 accptr;
    @XmlElement(name = "Txtr")
    protected TransactorData1 txtr;
    @XmlElement(name = "Termnl")
    protected Terminal10 termnl;
    @XmlElement(name = "Cntxt")
    protected Context25 cntxt;
    @XmlElement(name = "ICCRltdData")
    protected String iccRltdData;
    @XmlElement(name = "AuthntcnData")
    protected CardAuthenticationData1 authntcnData;
    @XmlElement(name = "Pyer")
    protected PayerData1 pyer;
    @XmlElement(name = "Pyee")
    protected PayeeData1 pyee;
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
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<ATICALaxProcessing> spclPrgrmmQlfctn;
    @XmlElement(name = "Instlmt")
    protected Instalment8 instlmt;
    @XmlElement(name = "RcrngPmt")
    protected RecurringPaymentData1 rcrngPmt;
    @XmlElement(name = "AcctBal")
    protected List<AccountBalance4> acctBal;
    @XmlElement(name = "AddtlSvc")
    protected List<AdditionalService3> addtlSvc;
    @XmlElement(name = "FndsSvcs")
    protected FundingService4 fndsSvcs;
    @XmlElement(name = "DpstDtls")
    protected List<DepositDetails4> dpstDtls;
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
    @XmlElement(name = "Bnfts")
    protected List<BenefitSupportingData1> bnfts;
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
    public ReversalInitiationV05 setHdr(Header72 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the txChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCharacteristics5 }
     *     
     */
    public TransactionCharacteristics5 getTxChrtcs() {
        return txChrtcs;
    }

    /**
     * Sets the value of the txChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCharacteristics5 }
     *     
     */
    public ReversalInitiationV05 setTxChrtcs(TransactionCharacteristics5 value) {
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
    public ReversalInitiationV05 setOrgtr(OriginatorData2 value) {
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
    public ReversalInitiationV05 setAcqrr(AcquirerData1 value) {
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
    public ReversalInitiationV05 setSndr(SenderData1 value) {
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
    public ReversalInitiationV05 setCard(CardData16 value) {
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
    public ReversalInitiationV05 setAcctFr(AccountDetails4 value) {
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
    public ReversalInitiationV05 setAcctTo(AccountDetails4 value) {
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
    public ReversalInitiationV05 setRcvr(ReceiverData1 value) {
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
    public ReversalInitiationV05 setIssr(IssuerData1 value) {
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
    public ReversalInitiationV05 setDstn(DestinationData1 value) {
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
    public ReversalInitiationV05 setPrgrmm(ProgrammeMode7 value) {
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
    public ReversalInitiationV05 setTxId(TransactionIdentification58 value) {
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
    public ReversalInitiationV05 setConvsDtTm(DateTime2 value) {
        this.convsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the txAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmounts5 }
     *     
     */
    public TransactionAmounts5 getTxAmts() {
        return txAmts;
    }

    /**
     * Sets the value of the txAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmounts5 }
     *     
     */
    public ReversalInitiationV05 setTxAmts(TransactionAmounts5 value) {
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
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax44 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax44> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the orgnlDataElmts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalDataElements6 }
     *     
     */
    public OriginalDataElements6 getOrgnlDataElmts() {
        return orgnlDataElmts;
    }

    /**
     * Sets the value of the orgnlDataElmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalDataElements6 }
     *     
     */
    public ReversalInitiationV05 setOrgnlDataElmts(OriginalDataElements6 value) {
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
    public ReversalInitiationV05 setAccptr(AcceptorData1 value) {
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
    public ReversalInitiationV05 setTxtr(TransactorData1 value) {
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
    public ReversalInitiationV05 setTermnl(Terminal10 value) {
        this.termnl = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context25 }
     *     
     */
    public Context25 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context25 }
     *     
     */
    public ReversalInitiationV05 setCntxt(Context25 value) {
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
    public ReversalInitiationV05 setICCRltdData(String value) {
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
    public ReversalInitiationV05 setAuthntcnData(CardAuthenticationData1 value) {
        this.authntcnData = value;
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
    public ReversalInitiationV05 setPyer(PayerData1 value) {
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
    public ReversalInitiationV05 setPyee(PayeeData1 value) {
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
    public ReversalInitiationV05 setTkn(Token5 value) {
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
    public ReversalInitiationV05 setCstmrDvc(CustomerDevice6 value) {
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
    public ReversalInitiationV05 setWllt(Wallet4 value) {
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
     * Gets the value of the instlmt property.
     * 
     * @return
     *     possible object is
     *     {@link Instalment8 }
     *     
     */
    public Instalment8 getInstlmt() {
        return instlmt;
    }

    /**
     * Sets the value of the instlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instalment8 }
     *     
     */
    public ReversalInitiationV05 setInstlmt(Instalment8 value) {
        this.instlmt = value;
        return this;
    }

    /**
     * Gets the value of the rcrngPmt property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringPaymentData1 }
     *     
     */
    public RecurringPaymentData1 getRcrngPmt() {
        return rcrngPmt;
    }

    /**
     * Sets the value of the rcrngPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringPaymentData1 }
     *     
     */
    public ReversalInitiationV05 setRcrngPmt(RecurringPaymentData1 value) {
        this.rcrngPmt = value;
        return this;
    }

    /**
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountBalance4 }
     * 
     * 
     * @return
     *     The value of the acctBal property.
     */
    public List<AccountBalance4> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<>();
        }
        return this.acctBal;
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
     * Gets the value of the fndsSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link FundingService4 }
     *     
     */
    public FundingService4 getFndsSvcs() {
        return fndsSvcs;
    }

    /**
     * Sets the value of the fndsSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingService4 }
     *     
     */
    public ReversalInitiationV05 setFndsSvcs(FundingService4 value) {
        this.fndsSvcs = value;
        return this;
    }

    /**
     * Gets the value of the dpstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dpstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepositDetails4 }
     * 
     * 
     * @return
     *     The value of the dpstDtls property.
     */
    public List<DepositDetails4> getDpstDtls() {
        if (dpstDtls == null) {
            dpstDtls = new ArrayList<>();
        }
        return this.dpstDtls;
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
    public ReversalInitiationV05 setJursdctn(Jurisdiction2 value) {
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
    public ReversalInitiationV05 setSttlmSvc(SettlementService7 value) {
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
    public ReversalInitiationV05 setRcncltn(Reconciliation5 value) {
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
    public ReversalInitiationV05 setPrcgRslt(ProcessingResult28 value) {
        this.prcgRslt = value;
        return this;
    }

    /**
     * Gets the value of the bnfts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenefitSupportingData1 }
     * 
     * 
     * @return
     *     The value of the bnfts property.
     */
    public List<BenefitSupportingData1> getBnfts() {
        if (bnfts == null) {
            bnfts = new ArrayList<>();
        }
        return this.bnfts;
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
    public ReversalInitiationV05 setSctyTrlr(ContentInformationType41 value) {
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
     * Adds a new item to the addtlAmt list.
     * @see #getAddtlAmt()
     * 
     */
    public ReversalInitiationV05 addAddtlAmt(AdditionalAmounts5 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public ReversalInitiationV05 addTax(Tax44 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the crdhldr list.
     * @see #getCrdhldr()
     * 
     */
    public ReversalInitiationV05 addCrdhldr(Cardholder23 crdhldr) {
        getCrdhldr().add(crdhldr);
        return this;
    }

    /**
     * Adds a new item to the vrfctn list.
     * @see #getVrfctn()
     * 
     */
    public ReversalInitiationV05 addVrfctn(Verification8 vrfctn) {
        getVrfctn().add(vrfctn);
        return this;
    }

    /**
     * Adds a new item to the spclPrgrmmQlfctn list.
     * @see #getSpclPrgrmmQlfctn()
     * 
     */
    public ReversalInitiationV05 addSpclPrgrmmQlfctn(ATICALaxProcessing spclPrgrmmQlfctn) {
        getSpclPrgrmmQlfctn().add(spclPrgrmmQlfctn);
        return this;
    }

    /**
     * Adds a new item to the acctBal list.
     * @see #getAcctBal()
     * 
     */
    public ReversalInitiationV05 addAcctBal(AccountBalance4 acctBal) {
        getAcctBal().add(acctBal);
        return this;
    }

    /**
     * Adds a new item to the addtlSvc list.
     * @see #getAddtlSvc()
     * 
     */
    public ReversalInitiationV05 addAddtlSvc(AdditionalService3 addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the dpstDtls list.
     * @see #getDpstDtls()
     * 
     */
    public ReversalInitiationV05 addDpstDtls(DepositDetails4 dpstDtls) {
        getDpstDtls().add(dpstDtls);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public ReversalInitiationV05 addAddtlFee(AdditionalFee4 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the bnfts list.
     * @see #getBnfts()
     * 
     */
    public ReversalInitiationV05 addBnfts(BenefitSupportingData1 bnfts) {
        getBnfts().add(bnfts);
        return this;
    }

    /**
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public ReversalInitiationV05 addPrtctdData(EncryptedData2 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public ReversalInitiationV05 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public ReversalInitiationV05 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
