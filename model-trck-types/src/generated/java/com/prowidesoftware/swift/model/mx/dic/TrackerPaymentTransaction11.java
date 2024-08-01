
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Key elements used to identify the original transaction(s) that is being referred to.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerPaymentTransaction11", propOrder = {
    "trckdMsgId",
    "trckrInfrmgPty",
    "trckrInfrmdPty",
    "techSndr",
    "techRcvr",
    "pmtId",
    "rltdPmtId",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "pmtTpInf",
    "pmtScnro",
    "sttlmInf",
    "instgAgt",
    "instdAgt",
    "intrBkSttlmAmt",
    "rtrdIntrBkSttlmAmt",
    "intrBkSttlmDt",
    "reqdExctnDt",
    "sttlmPrty",
    "sttlmTmIndctn",
    "sttlmTmReq",
    "accptncDtTm",
    "poolgAdjstmntDt",
    "instdAmt",
    "eqvtAmt",
    "rtrdInstdAmt",
    "xchgRateData",
    "chrgBr",
    "chrgsInf",
    "trckrRcrd",
    "trckrData",
    "dbtConfURLAdr",
    "prvsInstgAgt1",
    "prvsInstgAgt1Acct",
    "prvsInstgAgt2",
    "prvsInstgAgt2Acct",
    "prvsInstgAgt3",
    "prvsInstgAgt3Acct",
    "intrmyAgt1",
    "intrmyAgt1Acct",
    "intrmyAgt2",
    "intrmyAgt2Acct",
    "intrmyAgt3",
    "intrmyAgt3Acct",
    "ultmtDbtr",
    "initgPty",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "dbtrAgtAcct",
    "cdtrAgt",
    "cdtrAgtAcct",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr",
    "instrForCdtrAgt",
    "instrForNxtAgt",
    "purp",
    "rgltryRptg",
    "tax",
    "rltdRmtInf",
    "rmtInf",
    "rjctRtrRsn",
    "rtrChain",
    "undrlygCstmrCdtTrf"
})
public class TrackerPaymentTransaction11 {

    @XmlElement(name = "TrckdMsgId")
    protected OriginalBusinessInstruction4 trckdMsgId;
    @XmlElement(name = "TrckrInfrmgPty")
    protected TrackerPartyIdentification2 trckrInfrmgPty;
    @XmlElement(name = "TrckrInfrmdPty")
    protected TrackerPartyIdentification2 trckrInfrmdPty;
    @XmlElement(name = "TechSndr")
    protected String techSndr;
    @XmlElement(name = "TechRcvr")
    protected String techRcvr;
    @XmlElement(name = "PmtId")
    protected PaymentIdentification10 pmtId;
    @XmlElement(name = "RltdPmtId")
    protected RelatedTransactionData1 rltdPmtId;
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlEndToEndId")
    protected String orgnlEndToEndId;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation28 pmtTpInf;
    @XmlElement(name = "PmtScnro")
    protected String pmtScnro;
    @XmlElement(name = "SttlmInf")
    protected SettlementInstruction9 sttlmInf;
    @XmlElement(name = "InstgAgt")
    protected BranchAndFinancialInstitutionIdentification6 instgAgt;
    @XmlElement(name = "InstdAgt")
    protected BranchAndFinancialInstitutionIdentification6 instdAgt;
    @XmlElement(name = "IntrBkSttlmAmt")
    protected ActiveCurrencyAndAmount intrBkSttlmAmt;
    @XmlElement(name = "RtrdIntrBkSttlmAmt")
    protected ActiveCurrencyAndAmount rtrdIntrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate intrBkSttlmDt;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTime2Choice reqdExctnDt;
    @XmlElement(name = "SttlmPrty")
    @XmlSchemaType(name = "string")
    protected Priority3Code sttlmPrty;
    @XmlElement(name = "SttlmTmIndctn")
    protected SettlementDateTimeIndication1 sttlmTmIndctn;
    @XmlElement(name = "SttlmTmReq")
    protected SettlementTimeRequest2 sttlmTmReq;
    @XmlElement(name = "AccptncDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime accptncDtTm;
    @XmlElement(name = "PoolgAdjstmntDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate poolgAdjstmntDt;
    @XmlElement(name = "InstdAmt")
    protected ActiveOrHistoricCurrencyAndAmount instdAmt;
    @XmlElement(name = "EqvtAmt")
    protected EquivalentAmount2 eqvtAmt;
    @XmlElement(name = "RtrdInstdAmt")
    protected ActiveOrHistoricCurrencyAndAmount rtrdInstdAmt;
    @XmlElement(name = "XchgRateData")
    protected CurrencyExchange15 xchgRateData;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "ChrgsInf")
    protected List<Charges7> chrgsInf;
    @XmlElement(name = "TrckrRcrd")
    protected List<TrackerRecord6> trckrRcrd;
    @XmlElement(name = "TrckrData")
    protected TrackerData8 trckrData;
    @XmlElement(name = "DbtConfURLAdr")
    protected String dbtConfURLAdr;
    @XmlElement(name = "PrvsInstgAgt1")
    protected BranchAndFinancialInstitutionIdentification6 prvsInstgAgt1;
    @XmlElement(name = "PrvsInstgAgt1Acct")
    protected CashAccount38 prvsInstgAgt1Acct;
    @XmlElement(name = "PrvsInstgAgt2")
    protected BranchAndFinancialInstitutionIdentification6 prvsInstgAgt2;
    @XmlElement(name = "PrvsInstgAgt2Acct")
    protected CashAccount38 prvsInstgAgt2Acct;
    @XmlElement(name = "PrvsInstgAgt3")
    protected BranchAndFinancialInstitutionIdentification6 prvsInstgAgt3;
    @XmlElement(name = "PrvsInstgAgt3Acct")
    protected CashAccount38 prvsInstgAgt3Acct;
    @XmlElement(name = "IntrmyAgt1")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt1;
    @XmlElement(name = "IntrmyAgt1Acct")
    protected CashAccount38 intrmyAgt1Acct;
    @XmlElement(name = "IntrmyAgt2")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt2;
    @XmlElement(name = "IntrmyAgt2Acct")
    protected CashAccount38 intrmyAgt2Acct;
    @XmlElement(name = "IntrmyAgt3")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt3;
    @XmlElement(name = "IntrmyAgt3Acct")
    protected CashAccount38 intrmyAgt3Acct;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification135 ultmtDbtr;
    @XmlElement(name = "InitgPty")
    protected PartyIdentification135 initgPty;
    @XmlElement(name = "Dbtr")
    protected Party40Choice dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount38 dbtrAcct;
    @XmlElement(name = "DbtrAgt")
    protected BranchAndFinancialInstitutionIdentification6 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount38 dbtrAgtAcct;
    @XmlElement(name = "CdtrAgt")
    protected BranchAndFinancialInstitutionIdentification6 cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct")
    protected CashAccount38 cdtrAgtAcct;
    @XmlElement(name = "Cdtr")
    protected Party40Choice cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount38 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification135 ultmtCdtr;
    @XmlElement(name = "InstrForCdtrAgt")
    protected List<InstructionForCreditorAgent3> instrForCdtrAgt;
    @XmlElement(name = "InstrForNxtAgt")
    protected List<InstructionForNextAgent1> instrForNxtAgt;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RgltryRptg")
    protected List<RegulatoryReporting3> rgltryRptg;
    @XmlElement(name = "Tax")
    protected TaxInformation8 tax;
    @XmlElement(name = "RltdRmtInf")
    protected List<RemittanceLocation7> rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation16 rmtInf;
    @XmlElement(name = "RjctRtrRsn")
    protected List<PaymentRejectReturnReason1> rjctRtrRsn;
    @XmlElement(name = "RtrChain")
    protected TransactionParties8 rtrChain;
    @XmlElement(name = "UndrlygCstmrCdtTrf")
    protected CreditTransferTransaction46 undrlygCstmrCdtTrf;

    /**
     * Gets the value of the trckdMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessInstruction4 }
     *     
     */
    public OriginalBusinessInstruction4 getTrckdMsgId() {
        return trckdMsgId;
    }

    /**
     * Sets the value of the trckdMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessInstruction4 }
     *     
     */
    public TrackerPaymentTransaction11 setTrckdMsgId(OriginalBusinessInstruction4 value) {
        this.trckdMsgId = value;
        return this;
    }

    /**
     * Gets the value of the trckrInfrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerPartyIdentification2 getTrckrInfrmgPty() {
        return trckrInfrmgPty;
    }

    /**
     * Sets the value of the trckrInfrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerPaymentTransaction11 setTrckrInfrmgPty(TrackerPartyIdentification2 value) {
        this.trckrInfrmgPty = value;
        return this;
    }

    /**
     * Gets the value of the trckrInfrmdPty property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerPartyIdentification2 getTrckrInfrmdPty() {
        return trckrInfrmdPty;
    }

    /**
     * Sets the value of the trckrInfrmdPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerPaymentTransaction11 setTrckrInfrmdPty(TrackerPartyIdentification2 value) {
        this.trckrInfrmdPty = value;
        return this;
    }

    /**
     * Gets the value of the techSndr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechSndr() {
        return techSndr;
    }

    /**
     * Sets the value of the techSndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TrackerPaymentTransaction11 setTechSndr(String value) {
        this.techSndr = value;
        return this;
    }

    /**
     * Gets the value of the techRcvr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcvr() {
        return techRcvr;
    }

    /**
     * Sets the value of the techRcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TrackerPaymentTransaction11 setTechRcvr(String value) {
        this.techRcvr = value;
        return this;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification10 }
     *     
     */
    public PaymentIdentification10 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification10 }
     *     
     */
    public TrackerPaymentTransaction11 setPmtId(PaymentIdentification10 value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the rltdPmtId property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedTransactionData1 }
     *     
     */
    public RelatedTransactionData1 getRltdPmtId() {
        return rltdPmtId;
    }

    /**
     * Sets the value of the rltdPmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedTransactionData1 }
     *     
     */
    public TrackerPaymentTransaction11 setRltdPmtId(RelatedTransactionData1 value) {
        this.rltdPmtId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TrackerPaymentTransaction11 setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TrackerPaymentTransaction11 setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
        return this;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation28 }
     *     
     */
    public PaymentTypeInformation28 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation28 }
     *     
     */
    public TrackerPaymentTransaction11 setPmtTpInf(PaymentTypeInformation28 value) {
        this.pmtTpInf = value;
        return this;
    }

    /**
     * Gets the value of the pmtScnro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtScnro() {
        return pmtScnro;
    }

    /**
     * Sets the value of the pmtScnro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TrackerPaymentTransaction11 setPmtScnro(String value) {
        this.pmtScnro = value;
        return this;
    }

    /**
     * Gets the value of the sttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstruction9 }
     *     
     */
    public SettlementInstruction9 getSttlmInf() {
        return sttlmInf;
    }

    /**
     * Sets the value of the sttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstruction9 }
     *     
     */
    public TrackerPaymentTransaction11 setSttlmInf(SettlementInstruction9 value) {
        this.sttlmInf = value;
        return this;
    }

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public TrackerPaymentTransaction11 setInstgAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instgAgt = value;
        return this;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public TrackerPaymentTransaction11 setInstdAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instdAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TrackerPaymentTransaction11 setIntrBkSttlmAmt(ActiveCurrencyAndAmount value) {
        this.intrBkSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the rtrdIntrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRtrdIntrBkSttlmAmt() {
        return rtrdIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the rtrdIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TrackerPaymentTransaction11 setRtrdIntrBkSttlmAmt(ActiveCurrencyAndAmount value) {
        this.rtrdIntrBkSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TrackerPaymentTransaction11 setIntrBkSttlmDt(LocalDate value) {
        this.intrBkSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TrackerPaymentTransaction11 setReqdExctnDt(DateAndDateTime2Choice value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getSttlmPrty() {
        return sttlmPrty;
    }

    /**
     * Sets the value of the sttlmPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     */
    public TrackerPaymentTransaction11 setSttlmPrty(Priority3Code value) {
        this.sttlmPrty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTmIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDateTimeIndication1 }
     *     
     */
    public SettlementDateTimeIndication1 getSttlmTmIndctn() {
        return sttlmTmIndctn;
    }

    /**
     * Sets the value of the sttlmTmIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDateTimeIndication1 }
     *     
     */
    public TrackerPaymentTransaction11 setSttlmTmIndctn(SettlementDateTimeIndication1 value) {
        this.sttlmTmIndctn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTmReq property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public SettlementTimeRequest2 getSttlmTmReq() {
        return sttlmTmReq;
    }

    /**
     * Sets the value of the sttlmTmReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public TrackerPaymentTransaction11 setSttlmTmReq(SettlementTimeRequest2 value) {
        this.sttlmTmReq = value;
        return this;
    }

    /**
     * Gets the value of the accptncDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getAccptncDtTm() {
        return accptncDtTm;
    }

    /**
     * Sets the value of the accptncDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TrackerPaymentTransaction11 setAccptncDtTm(OffsetDateTime value) {
        this.accptncDtTm = value;
        return this;
    }

    /**
     * Gets the value of the poolgAdjstmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPoolgAdjstmntDt() {
        return poolgAdjstmntDt;
    }

    /**
     * Sets the value of the poolgAdjstmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TrackerPaymentTransaction11 setPoolgAdjstmntDt(LocalDate value) {
        this.poolgAdjstmntDt = value;
        return this;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public TrackerPaymentTransaction11 setInstdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.instdAmt = value;
        return this;
    }

    /**
     * Gets the value of the eqvtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EquivalentAmount2 }
     *     
     */
    public EquivalentAmount2 getEqvtAmt() {
        return eqvtAmt;
    }

    /**
     * Sets the value of the eqvtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivalentAmount2 }
     *     
     */
    public TrackerPaymentTransaction11 setEqvtAmt(EquivalentAmount2 value) {
        this.eqvtAmt = value;
        return this;
    }

    /**
     * Gets the value of the rtrdInstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRtrdInstdAmt() {
        return rtrdInstdAmt;
    }

    /**
     * Sets the value of the rtrdInstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public TrackerPaymentTransaction11 setRtrdInstdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rtrdInstdAmt = value;
        return this;
    }

    /**
     * Gets the value of the xchgRateData property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange15 }
     *     
     */
    public CurrencyExchange15 getXchgRateData() {
        return xchgRateData;
    }

    /**
     * Sets the value of the xchgRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange15 }
     *     
     */
    public TrackerPaymentTransaction11 setXchgRateData(CurrencyExchange15 value) {
        this.xchgRateData = value;
        return this;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public TrackerPaymentTransaction11 setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
        return this;
    }

    /**
     * Gets the value of the chrgsInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgsInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgsInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charges7 }
     * 
     * 
     * @return
     *     The value of the chrgsInf property.
     */
    public List<Charges7> getChrgsInf() {
        if (chrgsInf == null) {
            chrgsInf = new ArrayList<>();
        }
        return this.chrgsInf;
    }

    /**
     * Gets the value of the trckrRcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trckrRcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrckrRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackerRecord6 }
     * 
     * 
     * @return
     *     The value of the trckrRcrd property.
     */
    public List<TrackerRecord6> getTrckrRcrd() {
        if (trckrRcrd == null) {
            trckrRcrd = new ArrayList<>();
        }
        return this.trckrRcrd;
    }

    /**
     * Gets the value of the trckrData property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerData8 }
     *     
     */
    public TrackerData8 getTrckrData() {
        return trckrData;
    }

    /**
     * Sets the value of the trckrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerData8 }
     *     
     */
    public TrackerPaymentTransaction11 setTrckrData(TrackerData8 value) {
        this.trckrData = value;
        return this;
    }

    /**
     * Gets the value of the dbtConfURLAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtConfURLAdr() {
        return dbtConfURLAdr;
    }

    /**
     * Sets the value of the dbtConfURLAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TrackerPaymentTransaction11 setDbtConfURLAdr(String value) {
        this.dbtConfURLAdr = value;
        return this;
    }

    /**
     * Gets the value of the prvsInstgAgt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getPrvsInstgAgt1() {
        return prvsInstgAgt1;
    }

    /**
     * Sets the value of the prvsInstgAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public TrackerPaymentTransaction11 setPrvsInstgAgt1(BranchAndFinancialInstitutionIdentification6 value) {
        this.prvsInstgAgt1 = value;
        return this;
    }

    /**
     * Gets the value of the prvsInstgAgt1Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getPrvsInstgAgt1Acct() {
        return prvsInstgAgt1Acct;
    }

    /**
     * Sets the value of the prvsInstgAgt1Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public TrackerPaymentTransaction11 setPrvsInstgAgt1Acct(CashAccount38 value) {
        this.prvsInstgAgt1Acct = value;
        return this;
    }

    /**
     * Gets the value of the prvsInstgAgt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getPrvsInstgAgt2() {
        return prvsInstgAgt2;
    }

    /**
     * Sets the value of the prvsInstgAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public TrackerPaymentTransaction11 setPrvsInstgAgt2(BranchAndFinancialInstitutionIdentification6 value) {
        this.prvsInstgAgt2 = value;
        return this;
    }

    /**
     * Gets the value of the prvsInstgAgt2Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getPrvsInstgAgt2Acct() {
        return prvsInstgAgt2Acct;
    }

    /**
     * Sets the value of the prvsInstgAgt2Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public TrackerPaymentTransaction11 setPrvsInstgAgt2Acct(CashAccount38 value) {
        this.prvsInstgAgt2Acct = value;
        return this;
    }

    /**
     * Gets the value of the prvsInstgAgt3 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getPrvsInstgAgt3() {
        return prvsInstgAgt3;
    }

    /**
     * Sets the value of the prvsInstgAgt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public TrackerPaymentTransaction11 setPrvsInstgAgt3(BranchAndFinancialInstitutionIdentification6 value) {
        this.prvsInstgAgt3 = value;
        return this;
    }

    /**
     * Gets the value of the prvsInstgAgt3Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getPrvsInstgAgt3Acct() {
        return prvsInstgAgt3Acct;
    }

    /**
     * Sets the value of the prvsInstgAgt3Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public TrackerPaymentTransaction11 setPrvsInstgAgt3Acct(CashAccount38 value) {
        this.prvsInstgAgt3Acct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt1() {
        return intrmyAgt1;
    }

    /**
     * Sets the value of the intrmyAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public TrackerPaymentTransaction11 setIntrmyAgt1(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt1 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt1Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getIntrmyAgt1Acct() {
        return intrmyAgt1Acct;
    }

    /**
     * Sets the value of the intrmyAgt1Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public TrackerPaymentTransaction11 setIntrmyAgt1Acct(CashAccount38 value) {
        this.intrmyAgt1Acct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt2() {
        return intrmyAgt2;
    }

    /**
     * Sets the value of the intrmyAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public TrackerPaymentTransaction11 setIntrmyAgt2(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt2 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt2Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getIntrmyAgt2Acct() {
        return intrmyAgt2Acct;
    }

    /**
     * Sets the value of the intrmyAgt2Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public TrackerPaymentTransaction11 setIntrmyAgt2Acct(CashAccount38 value) {
        this.intrmyAgt2Acct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt3 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt3() {
        return intrmyAgt3;
    }

    /**
     * Sets the value of the intrmyAgt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public TrackerPaymentTransaction11 setIntrmyAgt3(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt3 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt3Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getIntrmyAgt3Acct() {
        return intrmyAgt3Acct;
    }

    /**
     * Sets the value of the intrmyAgt3Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public TrackerPaymentTransaction11 setIntrmyAgt3Acct(CashAccount38 value) {
        this.intrmyAgt3Acct = value;
        return this;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public TrackerPaymentTransaction11 setUltmtDbtr(PartyIdentification135 value) {
        this.ultmtDbtr = value;
        return this;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public TrackerPaymentTransaction11 setInitgPty(PartyIdentification135 value) {
        this.initgPty = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public TrackerPaymentTransaction11 setDbtr(Party40Choice value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public TrackerPaymentTransaction11 setDbtrAcct(CashAccount38 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public TrackerPaymentTransaction11 setDbtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public TrackerPaymentTransaction11 setDbtrAgtAcct(CashAccount38 value) {
        this.dbtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public TrackerPaymentTransaction11 setCdtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    /**
     * Sets the value of the cdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public TrackerPaymentTransaction11 setCdtrAgtAcct(CashAccount38 value) {
        this.cdtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public TrackerPaymentTransaction11 setCdtr(Party40Choice value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public TrackerPaymentTransaction11 setCdtrAcct(CashAccount38 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public TrackerPaymentTransaction11 setUltmtCdtr(PartyIdentification135 value) {
        this.ultmtCdtr = value;
        return this;
    }

    /**
     * Gets the value of the instrForCdtrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrForCdtrAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrForCdtrAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionForCreditorAgent3 }
     * 
     * 
     * @return
     *     The value of the instrForCdtrAgt property.
     */
    public List<InstructionForCreditorAgent3> getInstrForCdtrAgt() {
        if (instrForCdtrAgt == null) {
            instrForCdtrAgt = new ArrayList<>();
        }
        return this.instrForCdtrAgt;
    }

    /**
     * Gets the value of the instrForNxtAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrForNxtAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrForNxtAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionForNextAgent1 }
     * 
     * 
     * @return
     *     The value of the instrForNxtAgt property.
     */
    public List<InstructionForNextAgent1> getInstrForNxtAgt() {
        if (instrForNxtAgt == null) {
            instrForNxtAgt = new ArrayList<>();
        }
        return this.instrForNxtAgt;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose2Choice }
     *     
     */
    public Purpose2Choice getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose2Choice }
     *     
     */
    public TrackerPaymentTransaction11 setPurp(Purpose2Choice value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the rgltryRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rgltryRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgltryRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatoryReporting3 }
     * 
     * 
     * @return
     *     The value of the rgltryRptg property.
     */
    public List<RegulatoryReporting3> getRgltryRptg() {
        if (rgltryRptg == null) {
            rgltryRptg = new ArrayList<>();
        }
        return this.rgltryRptg;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInformation8 }
     *     
     */
    public TaxInformation8 getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInformation8 }
     *     
     */
    public TrackerPaymentTransaction11 setTax(TaxInformation8 value) {
        this.tax = value;
        return this;
    }

    /**
     * Gets the value of the rltdRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocation7 }
     * 
     * 
     * @return
     *     The value of the rltdRmtInf property.
     */
    public List<RemittanceLocation7> getRltdRmtInf() {
        if (rltdRmtInf == null) {
            rltdRmtInf = new ArrayList<>();
        }
        return this.rltdRmtInf;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation16 }
     *     
     */
    public RemittanceInformation16 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation16 }
     *     
     */
    public TrackerPaymentTransaction11 setRmtInf(RemittanceInformation16 value) {
        this.rmtInf = value;
        return this;
    }

    /**
     * Gets the value of the rjctRtrRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctRtrRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctRtrRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRejectReturnReason1 }
     * 
     * 
     * @return
     *     The value of the rjctRtrRsn property.
     */
    public List<PaymentRejectReturnReason1> getRjctRtrRsn() {
        if (rjctRtrRsn == null) {
            rjctRtrRsn = new ArrayList<>();
        }
        return this.rjctRtrRsn;
    }

    /**
     * Gets the value of the rtrChain property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionParties8 }
     *     
     */
    public TransactionParties8 getRtrChain() {
        return rtrChain;
    }

    /**
     * Sets the value of the rtrChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionParties8 }
     *     
     */
    public TrackerPaymentTransaction11 setRtrChain(TransactionParties8 value) {
        this.rtrChain = value;
        return this;
    }

    /**
     * Gets the value of the undrlygCstmrCdtTrf property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction46 }
     *     
     */
    public CreditTransferTransaction46 getUndrlygCstmrCdtTrf() {
        return undrlygCstmrCdtTrf;
    }

    /**
     * Sets the value of the undrlygCstmrCdtTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction46 }
     *     
     */
    public TrackerPaymentTransaction11 setUndrlygCstmrCdtTrf(CreditTransferTransaction46 value) {
        this.undrlygCstmrCdtTrf = value;
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
     * Adds a new item to the chrgsInf list.
     * @see #getChrgsInf()
     * 
     */
    public TrackerPaymentTransaction11 addChrgsInf(Charges7 chrgsInf) {
        getChrgsInf().add(chrgsInf);
        return this;
    }

    /**
     * Adds a new item to the trckrRcrd list.
     * @see #getTrckrRcrd()
     * 
     */
    public TrackerPaymentTransaction11 addTrckrRcrd(TrackerRecord6 trckrRcrd) {
        getTrckrRcrd().add(trckrRcrd);
        return this;
    }

    /**
     * Adds a new item to the instrForCdtrAgt list.
     * @see #getInstrForCdtrAgt()
     * 
     */
    public TrackerPaymentTransaction11 addInstrForCdtrAgt(InstructionForCreditorAgent3 instrForCdtrAgt) {
        getInstrForCdtrAgt().add(instrForCdtrAgt);
        return this;
    }

    /**
     * Adds a new item to the instrForNxtAgt list.
     * @see #getInstrForNxtAgt()
     * 
     */
    public TrackerPaymentTransaction11 addInstrForNxtAgt(InstructionForNextAgent1 instrForNxtAgt) {
        getInstrForNxtAgt().add(instrForNxtAgt);
        return this;
    }

    /**
     * Adds a new item to the rgltryRptg list.
     * @see #getRgltryRptg()
     * 
     */
    public TrackerPaymentTransaction11 addRgltryRptg(RegulatoryReporting3 rgltryRptg) {
        getRgltryRptg().add(rgltryRptg);
        return this;
    }

    /**
     * Adds a new item to the rltdRmtInf list.
     * @see #getRltdRmtInf()
     * 
     */
    public TrackerPaymentTransaction11 addRltdRmtInf(RemittanceLocation7 rltdRmtInf) {
        getRltdRmtInf().add(rltdRmtInf);
        return this;
    }

    /**
     * Adds a new item to the rjctRtrRsn list.
     * @see #getRjctRtrRsn()
     * 
     */
    public TrackerPaymentTransaction11 addRjctRtrRsn(PaymentRejectReturnReason1 rjctRtrRsn) {
        getRjctRtrRsn().add(rjctRtrRsn);
        return this;
    }

}
