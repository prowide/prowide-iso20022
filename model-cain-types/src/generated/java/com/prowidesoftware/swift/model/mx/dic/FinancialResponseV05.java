
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
 * The FinancialResponse message is sent by an issuer or an agent to an acquirer in response to a FinancialInitiation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialResponseV05", propOrder = {
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
    "wllt",
    "crdhldr",
    "vrfctn",
    "rsk",
    "spclPrgrmmQlfctn",
    "instlmt",
    "rcrngPmt",
    "addtlSvc",
    "acctBal",
    "fndsSvcs",
    "jursdctn",
    "sttlmSvc",
    "addtlFee",
    "rcncltn",
    "bnfts",
    "prmtn",
    "dsptData",
    "dcmnttn",
    "prcgRslt",
    "adddmData",
    "strngCstmrAuthntcn",
    "prtctdData",
    "prvtData",
    "ntlData",
    "sctyTrlr"
})
public class FinancialResponseV05 {

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
    protected CardData17 card;
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
    protected List<ProgrammeMode6> prgrmm;
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
    protected AcceptorData2 accptr;
    @XmlElement(name = "Txtr")
    protected TransactorData1 txtr;
    @XmlElement(name = "Termnl")
    protected Terminal12 termnl;
    @XmlElement(name = "Cntxt")
    protected Context27 cntxt;
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
    @XmlElement(name = "Wllt")
    protected Wallet4 wllt;
    @XmlElement(name = "Crdhldr")
    protected List<Cardholder23> crdhldr;
    @XmlElement(name = "Vrfctn")
    protected List<Verification9> vrfctn;
    @XmlElement(name = "Rsk")
    protected List<RiskContext4> rsk;
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<ATICALaxProcessing> spclPrgrmmQlfctn;
    @XmlElement(name = "Instlmt")
    protected Instalment8 instlmt;
    @XmlElement(name = "RcrngPmt")
    protected RecurringPaymentData1 rcrngPmt;
    @XmlElement(name = "AddtlSvc")
    protected List<AdditionalService3> addtlSvc;
    @XmlElement(name = "AcctBal")
    protected List<AccountBalance4> acctBal;
    @XmlElement(name = "FndsSvcs")
    protected FundingService4 fndsSvcs;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService7 sttlmSvc;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee4> addtlFee;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation5 rcncltn;
    @XmlElement(name = "Bnfts")
    protected List<BenefitSupportingData1> bnfts;
    @XmlElement(name = "Prmtn")
    protected List<PromotionData1> prmtn;
    @XmlElement(name = "DsptData")
    protected List<DisputeData5> dsptData;
    @XmlElement(name = "Dcmnttn")
    protected List<DisputeDocumentation2> dcmnttn;
    @XmlElement(name = "PrcgRslt", required = true)
    protected ProcessingResult29 prcgRslt;
    @XmlElement(name = "AdddmData")
    protected TransactionSpecificData2 adddmData;
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
    public FinancialResponseV05 setHdr(Header72 value) {
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
    public FinancialResponseV05 setTxChrtcs(TransactionCharacteristics5 value) {
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
    public FinancialResponseV05 setOrgtr(OriginatorData2 value) {
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
    public FinancialResponseV05 setAcqrr(AcquirerData1 value) {
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
    public FinancialResponseV05 setSndr(SenderData1 value) {
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
    public FinancialResponseV05 setCard(CardData17 value) {
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
    public FinancialResponseV05 setAcctFr(AccountDetails4 value) {
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
    public FinancialResponseV05 setAcctTo(AccountDetails4 value) {
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
    public FinancialResponseV05 setRcvr(ReceiverData1 value) {
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
    public FinancialResponseV05 setIssr(IssuerData1 value) {
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
    public FinancialResponseV05 setDstn(DestinationData1 value) {
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
    public FinancialResponseV05 setTxId(TransactionIdentification58 value) {
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
    public FinancialResponseV05 setConvsDtTm(DateTime2 value) {
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
    public FinancialResponseV05 setTxAmts(TransactionAmounts5 value) {
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
    public FinancialResponseV05 setOrgnlDataElmts(OriginalDataElements6 value) {
        this.orgnlDataElmts = value;
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
    public FinancialResponseV05 setAccptr(AcceptorData2 value) {
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
    public FinancialResponseV05 setTxtr(TransactorData1 value) {
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
    public FinancialResponseV05 setTermnl(Terminal12 value) {
        this.termnl = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context27 }
     *     
     */
    public Context27 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context27 }
     *     
     */
    public FinancialResponseV05 setCntxt(Context27 value) {
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
    public FinancialResponseV05 setICCRltdData(String value) {
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
    public FinancialResponseV05 setAuthntcnData(CardAuthenticationData1 value) {
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
    public FinancialResponseV05 setPyer(PayerData1 value) {
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
    public FinancialResponseV05 setPyee(PayeeData1 value) {
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
    public FinancialResponseV05 setTkn(Token5 value) {
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
    public FinancialResponseV05 setWllt(Wallet4 value) {
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
     * {@link Verification9 }
     * 
     * 
     * @return
     *     The value of the vrfctn property.
     */
    public List<Verification9> getVrfctn() {
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
    public FinancialResponseV05 setInstlmt(Instalment8 value) {
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
    public FinancialResponseV05 setRcrngPmt(RecurringPaymentData1 value) {
        this.rcrngPmt = value;
        return this;
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
    public FinancialResponseV05 setFndsSvcs(FundingService4 value) {
        this.fndsSvcs = value;
        return this;
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
    public FinancialResponseV05 setJursdctn(Jurisdiction2 value) {
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
    public FinancialResponseV05 setSttlmSvc(SettlementService7 value) {
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
    public FinancialResponseV05 setRcncltn(Reconciliation5 value) {
        this.rcncltn = value;
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
     * Gets the value of the prmtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prmtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrmtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionData1 }
     * 
     * 
     * @return
     *     The value of the prmtn property.
     */
    public List<PromotionData1> getPrmtn() {
        if (prmtn == null) {
            prmtn = new ArrayList<>();
        }
        return this.prmtn;
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
     * Gets the value of the dcmnttn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dcmnttn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDcmnttn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeDocumentation2 }
     * 
     * 
     * @return
     *     The value of the dcmnttn property.
     */
    public List<DisputeDocumentation2> getDcmnttn() {
        if (dcmnttn == null) {
            dcmnttn = new ArrayList<>();
        }
        return this.dcmnttn;
    }

    /**
     * Gets the value of the prcgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult29 }
     *     
     */
    public ProcessingResult29 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Sets the value of the prcgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult29 }
     *     
     */
    public FinancialResponseV05 setPrcgRslt(ProcessingResult29 value) {
        this.prcgRslt = value;
        return this;
    }

    /**
     * Gets the value of the adddmData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSpecificData2 }
     *     
     */
    public TransactionSpecificData2 getAdddmData() {
        return adddmData;
    }

    /**
     * Sets the value of the adddmData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSpecificData2 }
     *     
     */
    public FinancialResponseV05 setAdddmData(TransactionSpecificData2 value) {
        this.adddmData = value;
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
    public FinancialResponseV05 setStrngCstmrAuthntcn(StrongCustomerAuthentication2 value) {
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
    public FinancialResponseV05 setSctyTrlr(ContentInformationType41 value) {
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
    public FinancialResponseV05 addPrgrmm(ProgrammeMode6 prgrmm) {
        getPrgrmm().add(prgrmm);
        return this;
    }

    /**
     * Adds a new item to the addtlAmt list.
     * @see #getAddtlAmt()
     * 
     */
    public FinancialResponseV05 addAddtlAmt(AdditionalAmounts5 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public FinancialResponseV05 addTax(Tax44 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the crdhldr list.
     * @see #getCrdhldr()
     * 
     */
    public FinancialResponseV05 addCrdhldr(Cardholder23 crdhldr) {
        getCrdhldr().add(crdhldr);
        return this;
    }

    /**
     * Adds a new item to the vrfctn list.
     * @see #getVrfctn()
     * 
     */
    public FinancialResponseV05 addVrfctn(Verification9 vrfctn) {
        getVrfctn().add(vrfctn);
        return this;
    }

    /**
     * Adds a new item to the rsk list.
     * @see #getRsk()
     * 
     */
    public FinancialResponseV05 addRsk(RiskContext4 rsk) {
        getRsk().add(rsk);
        return this;
    }

    /**
     * Adds a new item to the spclPrgrmmQlfctn list.
     * @see #getSpclPrgrmmQlfctn()
     * 
     */
    public FinancialResponseV05 addSpclPrgrmmQlfctn(ATICALaxProcessing spclPrgrmmQlfctn) {
        getSpclPrgrmmQlfctn().add(spclPrgrmmQlfctn);
        return this;
    }

    /**
     * Adds a new item to the addtlSvc list.
     * @see #getAddtlSvc()
     * 
     */
    public FinancialResponseV05 addAddtlSvc(AdditionalService3 addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the acctBal list.
     * @see #getAcctBal()
     * 
     */
    public FinancialResponseV05 addAcctBal(AccountBalance4 acctBal) {
        getAcctBal().add(acctBal);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public FinancialResponseV05 addAddtlFee(AdditionalFee4 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the bnfts list.
     * @see #getBnfts()
     * 
     */
    public FinancialResponseV05 addBnfts(BenefitSupportingData1 bnfts) {
        getBnfts().add(bnfts);
        return this;
    }

    /**
     * Adds a new item to the prmtn list.
     * @see #getPrmtn()
     * 
     */
    public FinancialResponseV05 addPrmtn(PromotionData1 prmtn) {
        getPrmtn().add(prmtn);
        return this;
    }

    /**
     * Adds a new item to the dsptData list.
     * @see #getDsptData()
     * 
     */
    public FinancialResponseV05 addDsptData(DisputeData5 dsptData) {
        getDsptData().add(dsptData);
        return this;
    }

    /**
     * Adds a new item to the dcmnttn list.
     * @see #getDcmnttn()
     * 
     */
    public FinancialResponseV05 addDcmnttn(DisputeDocumentation2 dcmnttn) {
        getDcmnttn().add(dcmnttn);
        return this;
    }

    /**
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public FinancialResponseV05 addPrtctdData(EncryptedData2 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public FinancialResponseV05 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public FinancialResponseV05 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
