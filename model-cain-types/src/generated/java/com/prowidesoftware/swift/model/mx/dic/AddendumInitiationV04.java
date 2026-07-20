
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
 * Provides supplemental data in addition to that which is required to complete an authorization initiation or financial initiation. 
 * 
 * The supplemental data is associated with an authorization or financial message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddendumInitiationV04", propOrder = {
    "hdr",
    "dataSrc",
    "txDesc",
    "orgtr",
    "acqrr",
    "sndr",
    "card",
    "rcvr",
    "issr",
    "dstn",
    "prgrmm",
    "txId",
    "tkn",
    "orgnlDataElmts",
    "accptr",
    "cstmr",
    "jursdctn",
    "sttlmSvc",
    "addtlFee",
    "rcncltn",
    "txSpcfcData",
    "prtctdData",
    "prvtData",
    "ntlData",
    "sctyTrlr"
})
public class AddendumInitiationV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header72 hdr;
    @XmlElement(name = "DataSrc")
    protected String dataSrc;
    @XmlElement(name = "TxDesc")
    protected String txDesc;
    @XmlElement(name = "Orgtr")
    protected OriginatorData2 orgtr;
    @XmlElement(name = "Acqrr", required = true)
    protected AcquirerData1 acqrr;
    @XmlElement(name = "Sndr")
    protected SenderData1 sndr;
    @XmlElement(name = "Card")
    protected CardData14 card;
    @XmlElement(name = "Rcvr")
    protected ReceiverData1 rcvr;
    @XmlElement(name = "Issr")
    protected IssuerData1 issr;
    @XmlElement(name = "Dstn")
    protected DestinationData1 dstn;
    @XmlElement(name = "Prgrmm")
    protected List<ProgrammeMode6> prgrmm;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification62 txId;
    @XmlElement(name = "Tkn")
    protected Token5 tkn;
    @XmlElement(name = "OrgnlDataElmts")
    protected OriginalDataElements6 orgnlDataElmts;
    @XmlElement(name = "Accptr")
    protected AcceptorData1 accptr;
    @XmlElement(name = "Cstmr")
    protected Customer4 cstmr;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService7 sttlmSvc;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee4> addtlFee;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation5 rcncltn;
    @XmlElement(name = "TxSpcfcData")
    protected TransactionSpecificData1 txSpcfcData;
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
    public AddendumInitiationV04 setHdr(Header72 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the dataSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSrc() {
        return dataSrc;
    }

    /**
     * Sets the value of the dataSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AddendumInitiationV04 setDataSrc(String value) {
        this.dataSrc = value;
        return this;
    }

    /**
     * Gets the value of the txDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxDesc() {
        return txDesc;
    }

    /**
     * Sets the value of the txDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AddendumInitiationV04 setTxDesc(String value) {
        this.txDesc = value;
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
    public AddendumInitiationV04 setOrgtr(OriginatorData2 value) {
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
    public AddendumInitiationV04 setAcqrr(AcquirerData1 value) {
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
    public AddendumInitiationV04 setSndr(SenderData1 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardData14 }
     *     
     */
    public CardData14 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData14 }
     *     
     */
    public AddendumInitiationV04 setCard(CardData14 value) {
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
    public AddendumInitiationV04 setRcvr(ReceiverData1 value) {
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
    public AddendumInitiationV04 setIssr(IssuerData1 value) {
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
    public AddendumInitiationV04 setDstn(DestinationData1 value) {
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
     *     {@link TransactionIdentification62 }
     *     
     */
    public TransactionIdentification62 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification62 }
     *     
     */
    public AddendumInitiationV04 setTxId(TransactionIdentification62 value) {
        this.txId = value;
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
    public AddendumInitiationV04 setTkn(Token5 value) {
        this.tkn = value;
        return this;
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
    public AddendumInitiationV04 setOrgnlDataElmts(OriginalDataElements6 value) {
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
    public AddendumInitiationV04 setAccptr(AcceptorData1 value) {
        this.accptr = value;
        return this;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link Customer4 }
     *     
     */
    public Customer4 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer4 }
     *     
     */
    public AddendumInitiationV04 setCstmr(Customer4 value) {
        this.cstmr = value;
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
    public AddendumInitiationV04 setJursdctn(Jurisdiction2 value) {
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
    public AddendumInitiationV04 setSttlmSvc(SettlementService7 value) {
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
    public AddendumInitiationV04 setRcncltn(Reconciliation5 value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the txSpcfcData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSpecificData1 }
     *     
     */
    public TransactionSpecificData1 getTxSpcfcData() {
        return txSpcfcData;
    }

    /**
     * Sets the value of the txSpcfcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSpecificData1 }
     *     
     */
    public AddendumInitiationV04 setTxSpcfcData(TransactionSpecificData1 value) {
        this.txSpcfcData = value;
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
    public AddendumInitiationV04 setSctyTrlr(ContentInformationType41 value) {
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
    public AddendumInitiationV04 addPrgrmm(ProgrammeMode6 prgrmm) {
        getPrgrmm().add(prgrmm);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public AddendumInitiationV04 addAddtlFee(AdditionalFee4 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public AddendumInitiationV04 addPrtctdData(EncryptedData2 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public AddendumInitiationV04 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public AddendumInitiationV04 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
