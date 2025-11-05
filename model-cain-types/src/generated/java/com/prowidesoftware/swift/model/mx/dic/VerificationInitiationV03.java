
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
 * The VerificationInitiation message can be initiated by any party and received by any party (acquirer, agent or issuer). It conveys information to a receiver requiring verification or authentication. 
 * 
 * Examples of usages are: authentication of certificates, assurance levels of tokens, certificate management, address verification, account verification and cheque verification. It is also used to inform the receiver of a verification that has been completed on its behalf.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationInitiationV03", propOrder = {
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
    "xchgRate",
    "txAmts",
    "addtlAmt",
    "accptr",
    "termnl",
    "poiCmpnt",
    "cntxt",
    "pyer",
    "pyee",
    "iccRltdData",
    "tkn",
    "cstmrDvc",
    "wllt",
    "crdhldr",
    "vrfctn",
    "rsk",
    "spclPrgrmmQlfctn",
    "instlmt",
    "addtlSvc",
    "fndsSvcs",
    "jursdctn",
    "sttlmSvc",
    "addtlFee",
    "rcncltn",
    "orgnlRspnCd",
    "prcgRslt",
    "addtlData",
    "strngCstmrAuthntcn",
    "prtctdData",
    "splmtryData",
    "sctyTrlr"
})
public class VerificationInitiationV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header71 hdr;
    @XmlElement(name = "TxChrtcs", required = true)
    protected TransactionCharacteristics1 txChrtcs;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification286 orgtr;
    @XmlElement(name = "Acqrr", required = true)
    protected PartyIdentification286 acqrr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification286 sndr;
    @XmlElement(name = "Card")
    protected CardData11 card;
    @XmlElement(name = "AcctFr")
    protected AccountDetails4 acctFr;
    @XmlElement(name = "AcctTo")
    protected AccountDetails4 acctTo;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification286 rcvr;
    @XmlElement(name = "Issr")
    protected PartyIdentification286 issr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification286 dstn;
    @XmlElement(name = "Prgrmm")
    protected ProgrammeMode4 prgrmm;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification54 txId;
    @XmlElement(name = "ConvsDtTm")
    protected DateTime2 convsDtTm;
    @XmlElement(name = "XchgRate")
    protected List<ExchangeRateInformation5> xchgRate;
    @XmlElement(name = "TxAmts")
    protected TransactionAmounts4 txAmts;
    @XmlElement(name = "AddtlAmt")
    protected List<AdditionalAmounts4> addtlAmt;
    @XmlElement(name = "Accptr", required = true)
    protected PartyIdentification288 accptr;
    @XmlElement(name = "Termnl")
    protected Terminal7 termnl;
    @XmlElement(name = "POICmpnt")
    protected List<PointOfInteractionComponent16> poiCmpnt;
    @XmlElement(name = "Cntxt", required = true)
    protected Context23 cntxt;
    @XmlElement(name = "Pyer")
    protected PartyIdentification287 pyer;
    @XmlElement(name = "Pyee")
    protected PartyIdentification287 pyee;
    @XmlElement(name = "ICCRltdData")
    protected String iccRltdData;
    @XmlElement(name = "Tkn")
    protected Token3 tkn;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice5 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected Wallet3 wllt;
    @XmlElement(name = "Crdhldr")
    protected Cardholder22 crdhldr;
    @XmlElement(name = "Vrfctn")
    protected List<Verification6> vrfctn;
    @XmlElement(name = "Rsk")
    protected List<RiskContext3> rsk;
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<SpecialProgrammeQualification2> spclPrgrmmQlfctn;
    @XmlElement(name = "Instlmt")
    protected Instalment6 instlmt;
    @XmlElement(name = "AddtlSvc")
    protected List<AdditionalService2> addtlSvc;
    @XmlElement(name = "FndsSvcs")
    protected FundingService3 fndsSvcs;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService5 sttlmSvc;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee3> addtlFee;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation4 rcncltn;
    @XmlElement(name = "OrgnlRspnCd")
    protected String orgnlRspnCd;
    @XmlElement(name = "PrcgRslt")
    protected ProcessingResult27 prcgRslt;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData2> addtlData;
    @XmlElement(name = "StrngCstmrAuthntcn")
    protected StrongCustomerAuthentication2 strngCstmrAuthntcn;
    @XmlElement(name = "PrtctdData")
    protected List<ProtectedData2> prtctdData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType41 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header71 }
     *     
     */
    public Header71 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header71 }
     *     
     */
    public VerificationInitiationV03 setHdr(Header71 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the txChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCharacteristics1 }
     *     
     */
    public TransactionCharacteristics1 getTxChrtcs() {
        return txChrtcs;
    }

    /**
     * Sets the value of the txChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCharacteristics1 }
     *     
     */
    public VerificationInitiationV03 setTxChrtcs(TransactionCharacteristics1 value) {
        this.txChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification286 }
     *     
     */
    public PartyIdentification286 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification286 }
     *     
     */
    public VerificationInitiationV03 setOrgtr(PartyIdentification286 value) {
        this.orgtr = value;
        return this;
    }

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification286 }
     *     
     */
    public PartyIdentification286 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification286 }
     *     
     */
    public VerificationInitiationV03 setAcqrr(PartyIdentification286 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification286 }
     *     
     */
    public PartyIdentification286 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification286 }
     *     
     */
    public VerificationInitiationV03 setSndr(PartyIdentification286 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardData11 }
     *     
     */
    public CardData11 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData11 }
     *     
     */
    public VerificationInitiationV03 setCard(CardData11 value) {
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
    public VerificationInitiationV03 setAcctFr(AccountDetails4 value) {
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
    public VerificationInitiationV03 setAcctTo(AccountDetails4 value) {
        this.acctTo = value;
        return this;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification286 }
     *     
     */
    public PartyIdentification286 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification286 }
     *     
     */
    public VerificationInitiationV03 setRcvr(PartyIdentification286 value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification286 }
     *     
     */
    public PartyIdentification286 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification286 }
     *     
     */
    public VerificationInitiationV03 setIssr(PartyIdentification286 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification286 }
     *     
     */
    public PartyIdentification286 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification286 }
     *     
     */
    public VerificationInitiationV03 setDstn(PartyIdentification286 value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the prgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammeMode4 }
     *     
     */
    public ProgrammeMode4 getPrgrmm() {
        return prgrmm;
    }

    /**
     * Sets the value of the prgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammeMode4 }
     *     
     */
    public VerificationInitiationV03 setPrgrmm(ProgrammeMode4 value) {
        this.prgrmm = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification54 }
     *     
     */
    public TransactionIdentification54 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification54 }
     *     
     */
    public VerificationInitiationV03 setTxId(TransactionIdentification54 value) {
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
    public VerificationInitiationV03 setConvsDtTm(DateTime2 value) {
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
     * {@link ExchangeRateInformation5 }
     * 
     * 
     * @return
     *     The value of the xchgRate property.
     */
    public List<ExchangeRateInformation5> getXchgRate() {
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
     *     {@link TransactionAmounts4 }
     *     
     */
    public TransactionAmounts4 getTxAmts() {
        return txAmts;
    }

    /**
     * Sets the value of the txAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmounts4 }
     *     
     */
    public VerificationInitiationV03 setTxAmts(TransactionAmounts4 value) {
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
     * {@link AdditionalAmounts4 }
     * 
     * 
     * @return
     *     The value of the addtlAmt property.
     */
    public List<AdditionalAmounts4> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<>();
        }
        return this.addtlAmt;
    }

    /**
     * Gets the value of the accptr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification288 }
     *     
     */
    public PartyIdentification288 getAccptr() {
        return accptr;
    }

    /**
     * Sets the value of the accptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification288 }
     *     
     */
    public VerificationInitiationV03 setAccptr(PartyIdentification288 value) {
        this.accptr = value;
        return this;
    }

    /**
     * Gets the value of the termnl property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal7 }
     *     
     */
    public Terminal7 getTermnl() {
        return termnl;
    }

    /**
     * Sets the value of the termnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal7 }
     *     
     */
    public VerificationInitiationV03 setTermnl(Terminal7 value) {
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
     *     {@link Context23 }
     *     
     */
    public Context23 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context23 }
     *     
     */
    public VerificationInitiationV03 setCntxt(Context23 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the pyer property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification287 }
     *     
     */
    public PartyIdentification287 getPyer() {
        return pyer;
    }

    /**
     * Sets the value of the pyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification287 }
     *     
     */
    public VerificationInitiationV03 setPyer(PartyIdentification287 value) {
        this.pyer = value;
        return this;
    }

    /**
     * Gets the value of the pyee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification287 }
     *     
     */
    public PartyIdentification287 getPyee() {
        return pyee;
    }

    /**
     * Sets the value of the pyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification287 }
     *     
     */
    public VerificationInitiationV03 setPyee(PartyIdentification287 value) {
        this.pyee = value;
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
    public VerificationInitiationV03 setICCRltdData(String value) {
        this.iccRltdData = value;
        return this;
    }

    /**
     * Gets the value of the tkn property.
     * 
     * @return
     *     possible object is
     *     {@link Token3 }
     *     
     */
    public Token3 getTkn() {
        return tkn;
    }

    /**
     * Sets the value of the tkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token3 }
     *     
     */
    public VerificationInitiationV03 setTkn(Token3 value) {
        this.tkn = value;
        return this;
    }

    /**
     * Gets the value of the cstmrDvc property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice5 }
     *     
     */
    public CustomerDevice5 getCstmrDvc() {
        return cstmrDvc;
    }

    /**
     * Sets the value of the cstmrDvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice5 }
     *     
     */
    public VerificationInitiationV03 setCstmrDvc(CustomerDevice5 value) {
        this.cstmrDvc = value;
        return this;
    }

    /**
     * Gets the value of the wllt property.
     * 
     * @return
     *     possible object is
     *     {@link Wallet3 }
     *     
     */
    public Wallet3 getWllt() {
        return wllt;
    }

    /**
     * Sets the value of the wllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wallet3 }
     *     
     */
    public VerificationInitiationV03 setWllt(Wallet3 value) {
        this.wllt = value;
        return this;
    }

    /**
     * Gets the value of the crdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder22 }
     *     
     */
    public Cardholder22 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Sets the value of the crdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder22 }
     *     
     */
    public VerificationInitiationV03 setCrdhldr(Cardholder22 value) {
        this.crdhldr = value;
        return this;
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
     * {@link Verification6 }
     * 
     * 
     * @return
     *     The value of the vrfctn property.
     */
    public List<Verification6> getVrfctn() {
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
     * {@link RiskContext3 }
     * 
     * 
     * @return
     *     The value of the rsk property.
     */
    public List<RiskContext3> getRsk() {
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
     * {@link SpecialProgrammeQualification2 }
     * 
     * 
     * @return
     *     The value of the spclPrgrmmQlfctn property.
     */
    public List<SpecialProgrammeQualification2> getSpclPrgrmmQlfctn() {
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
     *     {@link Instalment6 }
     *     
     */
    public Instalment6 getInstlmt() {
        return instlmt;
    }

    /**
     * Sets the value of the instlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instalment6 }
     *     
     */
    public VerificationInitiationV03 setInstlmt(Instalment6 value) {
        this.instlmt = value;
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
     * {@link AdditionalService2 }
     * 
     * 
     * @return
     *     The value of the addtlSvc property.
     */
    public List<AdditionalService2> getAddtlSvc() {
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
     *     {@link FundingService3 }
     *     
     */
    public FundingService3 getFndsSvcs() {
        return fndsSvcs;
    }

    /**
     * Sets the value of the fndsSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingService3 }
     *     
     */
    public VerificationInitiationV03 setFndsSvcs(FundingService3 value) {
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
    public VerificationInitiationV03 setJursdctn(Jurisdiction2 value) {
        this.jursdctn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSvc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementService5 }
     *     
     */
    public SettlementService5 getSttlmSvc() {
        return sttlmSvc;
    }

    /**
     * Sets the value of the sttlmSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementService5 }
     *     
     */
    public VerificationInitiationV03 setSttlmSvc(SettlementService5 value) {
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
     * {@link AdditionalFee3 }
     * 
     * 
     * @return
     *     The value of the addtlFee property.
     */
    public List<AdditionalFee3> getAddtlFee() {
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
     *     {@link Reconciliation4 }
     *     
     */
    public Reconciliation4 getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconciliation4 }
     *     
     */
    public VerificationInitiationV03 setRcncltn(Reconciliation4 value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRspnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlRspnCd() {
        return orgnlRspnCd;
    }

    /**
     * Sets the value of the orgnlRspnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VerificationInitiationV03 setOrgnlRspnCd(String value) {
        this.orgnlRspnCd = value;
        return this;
    }

    /**
     * Gets the value of the prcgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult27 }
     *     
     */
    public ProcessingResult27 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Sets the value of the prcgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult27 }
     *     
     */
    public VerificationInitiationV03 setPrcgRslt(ProcessingResult27 value) {
        this.prcgRslt = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData2 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData2> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
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
    public VerificationInitiationV03 setStrngCstmrAuthntcn(StrongCustomerAuthentication2 value) {
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
     * {@link ProtectedData2 }
     * 
     * 
     * @return
     *     The value of the prtctdData property.
     */
    public List<ProtectedData2> getPrtctdData() {
        if (prtctdData == null) {
            prtctdData = new ArrayList<>();
        }
        return this.prtctdData;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
    public VerificationInitiationV03 setSctyTrlr(ContentInformationType41 value) {
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
    public VerificationInitiationV03 addXchgRate(ExchangeRateInformation5 xchgRate) {
        getXchgRate().add(xchgRate);
        return this;
    }

    /**
     * Adds a new item to the addtlAmt list.
     * @see #getAddtlAmt()
     * 
     */
    public VerificationInitiationV03 addAddtlAmt(AdditionalAmounts4 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the pOICmpnt list.
     * @see #getPOICmpnt()
     * 
     */
    public VerificationInitiationV03 addPOICmpnt(PointOfInteractionComponent16 pOICmpnt) {
        getPOICmpnt().add(pOICmpnt);
        return this;
    }

    /**
     * Adds a new item to the vrfctn list.
     * @see #getVrfctn()
     * 
     */
    public VerificationInitiationV03 addVrfctn(Verification6 vrfctn) {
        getVrfctn().add(vrfctn);
        return this;
    }

    /**
     * Adds a new item to the rsk list.
     * @see #getRsk()
     * 
     */
    public VerificationInitiationV03 addRsk(RiskContext3 rsk) {
        getRsk().add(rsk);
        return this;
    }

    /**
     * Adds a new item to the spclPrgrmmQlfctn list.
     * @see #getSpclPrgrmmQlfctn()
     * 
     */
    public VerificationInitiationV03 addSpclPrgrmmQlfctn(SpecialProgrammeQualification2 spclPrgrmmQlfctn) {
        getSpclPrgrmmQlfctn().add(spclPrgrmmQlfctn);
        return this;
    }

    /**
     * Adds a new item to the addtlSvc list.
     * @see #getAddtlSvc()
     * 
     */
    public VerificationInitiationV03 addAddtlSvc(AdditionalService2 addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public VerificationInitiationV03 addAddtlFee(AdditionalFee3 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public VerificationInitiationV03 addAddtlData(AdditionalData2 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

    /**
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public VerificationInitiationV03 addPrtctdData(ProtectedData2 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public VerificationInitiationV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
