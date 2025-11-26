
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
 * The AuthorisationResponse message is sent by an issuer or an agent to an acquirer in response to an AuthorisationInitiation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationResponseV04", propOrder = {
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
    "orgnlDataElmts",
    "accptr",
    "termnl",
    "cntxt",
    "iccRltdData",
    "tkn",
    "wllt",
    "crdhldr",
    "vrfctn",
    "rsk",
    "spclPrgrmmQlfctn",
    "instlmt",
    "addtlSvc",
    "acctBal",
    "jursdctn",
    "sttlmSvc",
    "addtlFee",
    "rcncltn",
    "prcgRslt",
    "adddmData",
    "addtlData",
    "strngCstmrAuthntcn",
    "prtctdData",
    "splmtryData",
    "sctyTrlr"
})
public class AuthorisationResponseV04 {

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
    protected CardData12 card;
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
    protected ProgrammeMode5 prgrmm;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification57 txId;
    @XmlElement(name = "ConvsDtTm")
    protected DateTime2 convsDtTm;
    @XmlElement(name = "TxAmts", required = true)
    protected TransactionAmounts3 txAmts;
    @XmlElement(name = "AddtlAmt")
    protected List<AdditionalAmounts4> addtlAmt;
    @XmlElement(name = "OrgnlDataElmts")
    protected OriginalDataElements3 orgnlDataElmts;
    @XmlElement(name = "Accptr")
    protected PartyIdentification285 accptr;
    @XmlElement(name = "Termnl")
    protected Terminal8 termnl;
    @XmlElement(name = "Cntxt")
    protected Context20 cntxt;
    @XmlElement(name = "ICCRltdData")
    protected String iccRltdData;
    @XmlElement(name = "Tkn")
    protected Token2 tkn;
    @XmlElement(name = "Wllt")
    protected Wallet3 wllt;
    @XmlElement(name = "Crdhldr")
    protected Cardholder22 crdhldr;
    @XmlElement(name = "Vrfctn")
    protected List<Verification7> vrfctn;
    @XmlElement(name = "Rsk")
    protected List<RiskContext3> rsk;
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<SpecialProgrammeQualification2> spclPrgrmmQlfctn;
    @XmlElement(name = "Instlmt")
    protected Instalment6 instlmt;
    @XmlElement(name = "AddtlSvc")
    protected List<AdditionalService2> addtlSvc;
    @XmlElement(name = "AcctBal")
    protected List<AccountBalance3> acctBal;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService6 sttlmSvc;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee3> addtlFee;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation4 rcncltn;
    @XmlElement(name = "PrcgRslt", required = true)
    protected ProcessingResult22 prcgRslt;
    @XmlElement(name = "AdddmData")
    protected AddendumData7 adddmData;
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
    public AuthorisationResponseV04 setHdr(Header71 value) {
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
    public AuthorisationResponseV04 setTxChrtcs(TransactionCharacteristics1 value) {
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
    public AuthorisationResponseV04 setOrgtr(PartyIdentification286 value) {
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
    public AuthorisationResponseV04 setAcqrr(PartyIdentification286 value) {
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
    public AuthorisationResponseV04 setSndr(PartyIdentification286 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardData12 }
     *     
     */
    public CardData12 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData12 }
     *     
     */
    public AuthorisationResponseV04 setCard(CardData12 value) {
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
    public AuthorisationResponseV04 setAcctFr(AccountDetails4 value) {
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
    public AuthorisationResponseV04 setAcctTo(AccountDetails4 value) {
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
    public AuthorisationResponseV04 setRcvr(PartyIdentification286 value) {
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
    public AuthorisationResponseV04 setIssr(PartyIdentification286 value) {
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
    public AuthorisationResponseV04 setDstn(PartyIdentification286 value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the prgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammeMode5 }
     *     
     */
    public ProgrammeMode5 getPrgrmm() {
        return prgrmm;
    }

    /**
     * Sets the value of the prgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammeMode5 }
     *     
     */
    public AuthorisationResponseV04 setPrgrmm(ProgrammeMode5 value) {
        this.prgrmm = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification57 }
     *     
     */
    public TransactionIdentification57 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification57 }
     *     
     */
    public AuthorisationResponseV04 setTxId(TransactionIdentification57 value) {
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
    public AuthorisationResponseV04 setConvsDtTm(DateTime2 value) {
        this.convsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the txAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmounts3 }
     *     
     */
    public TransactionAmounts3 getTxAmts() {
        return txAmts;
    }

    /**
     * Sets the value of the txAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmounts3 }
     *     
     */
    public AuthorisationResponseV04 setTxAmts(TransactionAmounts3 value) {
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
     * Gets the value of the orgnlDataElmts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalDataElements3 }
     *     
     */
    public OriginalDataElements3 getOrgnlDataElmts() {
        return orgnlDataElmts;
    }

    /**
     * Sets the value of the orgnlDataElmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalDataElements3 }
     *     
     */
    public AuthorisationResponseV04 setOrgnlDataElmts(OriginalDataElements3 value) {
        this.orgnlDataElmts = value;
        return this;
    }

    /**
     * Gets the value of the accptr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification285 }
     *     
     */
    public PartyIdentification285 getAccptr() {
        return accptr;
    }

    /**
     * Sets the value of the accptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification285 }
     *     
     */
    public AuthorisationResponseV04 setAccptr(PartyIdentification285 value) {
        this.accptr = value;
        return this;
    }

    /**
     * Gets the value of the termnl property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal8 }
     *     
     */
    public Terminal8 getTermnl() {
        return termnl;
    }

    /**
     * Sets the value of the termnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal8 }
     *     
     */
    public AuthorisationResponseV04 setTermnl(Terminal8 value) {
        this.termnl = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context20 }
     *     
     */
    public Context20 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context20 }
     *     
     */
    public AuthorisationResponseV04 setCntxt(Context20 value) {
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
    public AuthorisationResponseV04 setICCRltdData(String value) {
        this.iccRltdData = value;
        return this;
    }

    /**
     * Gets the value of the tkn property.
     * 
     * @return
     *     possible object is
     *     {@link Token2 }
     *     
     */
    public Token2 getTkn() {
        return tkn;
    }

    /**
     * Sets the value of the tkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token2 }
     *     
     */
    public AuthorisationResponseV04 setTkn(Token2 value) {
        this.tkn = value;
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
    public AuthorisationResponseV04 setWllt(Wallet3 value) {
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
    public AuthorisationResponseV04 setCrdhldr(Cardholder22 value) {
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
     * {@link Verification7 }
     * 
     * 
     * @return
     *     The value of the vrfctn property.
     */
    public List<Verification7> getVrfctn() {
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
    public AuthorisationResponseV04 setInstlmt(Instalment6 value) {
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
     * {@link AccountBalance3 }
     * 
     * 
     * @return
     *     The value of the acctBal property.
     */
    public List<AccountBalance3> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<>();
        }
        return this.acctBal;
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
    public AuthorisationResponseV04 setJursdctn(Jurisdiction2 value) {
        this.jursdctn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSvc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementService6 }
     *     
     */
    public SettlementService6 getSttlmSvc() {
        return sttlmSvc;
    }

    /**
     * Sets the value of the sttlmSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementService6 }
     *     
     */
    public AuthorisationResponseV04 setSttlmSvc(SettlementService6 value) {
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
    public AuthorisationResponseV04 setRcncltn(Reconciliation4 value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the prcgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult22 }
     *     
     */
    public ProcessingResult22 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Sets the value of the prcgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult22 }
     *     
     */
    public AuthorisationResponseV04 setPrcgRslt(ProcessingResult22 value) {
        this.prcgRslt = value;
        return this;
    }

    /**
     * Gets the value of the adddmData property.
     * 
     * @return
     *     possible object is
     *     {@link AddendumData7 }
     *     
     */
    public AddendumData7 getAdddmData() {
        return adddmData;
    }

    /**
     * Sets the value of the adddmData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddendumData7 }
     *     
     */
    public AuthorisationResponseV04 setAdddmData(AddendumData7 value) {
        this.adddmData = value;
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
    public AuthorisationResponseV04 setStrngCstmrAuthntcn(StrongCustomerAuthentication2 value) {
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
    public AuthorisationResponseV04 setSctyTrlr(ContentInformationType41 value) {
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
    public AuthorisationResponseV04 addAddtlAmt(AdditionalAmounts4 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the vrfctn list.
     * @see #getVrfctn()
     * 
     */
    public AuthorisationResponseV04 addVrfctn(Verification7 vrfctn) {
        getVrfctn().add(vrfctn);
        return this;
    }

    /**
     * Adds a new item to the rsk list.
     * @see #getRsk()
     * 
     */
    public AuthorisationResponseV04 addRsk(RiskContext3 rsk) {
        getRsk().add(rsk);
        return this;
    }

    /**
     * Adds a new item to the spclPrgrmmQlfctn list.
     * @see #getSpclPrgrmmQlfctn()
     * 
     */
    public AuthorisationResponseV04 addSpclPrgrmmQlfctn(SpecialProgrammeQualification2 spclPrgrmmQlfctn) {
        getSpclPrgrmmQlfctn().add(spclPrgrmmQlfctn);
        return this;
    }

    /**
     * Adds a new item to the addtlSvc list.
     * @see #getAddtlSvc()
     * 
     */
    public AuthorisationResponseV04 addAddtlSvc(AdditionalService2 addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the acctBal list.
     * @see #getAcctBal()
     * 
     */
    public AuthorisationResponseV04 addAcctBal(AccountBalance3 acctBal) {
        getAcctBal().add(acctBal);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public AuthorisationResponseV04 addAddtlFee(AdditionalFee3 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public AuthorisationResponseV04 addAddtlData(AdditionalData2 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

    /**
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public AuthorisationResponseV04 addPrtctdData(ProtectedData2 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AuthorisationResponseV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
