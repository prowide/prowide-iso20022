
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
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
 * Set of elements providing information specific to the individual transaction(s) included in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferTransactionInformation2", propOrder = {
    "pmtId",
    "pmtTpInf",
    "intrBkSttlmAmt",
    "intrBkSttlmDt",
    "sttlmTmIndctn",
    "sttlmTmReq",
    "accptncDtTm",
    "poolgAdjstmntDt",
    "instdAmt",
    "xchgRate",
    "chrgBr",
    "chrgsInf",
    "prvsInstgAgt",
    "prvsInstgAgtAcct",
    "instgAgt",
    "instdAgt",
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
    "rltdRmtInf",
    "rmtInf"
})
public class CreditTransferTransactionInformation2 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification2 pmtId;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation3 pmtTpInf;
    @XmlElement(name = "IntrBkSttlmAmt", required = true)
    protected CurrencyAndAmount intrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar intrBkSttlmDt;
    @XmlElement(name = "SttlmTmIndctn")
    protected SettlementDateTimeIndication1 sttlmTmIndctn;
    @XmlElement(name = "SttlmTmReq")
    protected SettlementTimeRequest1 sttlmTmReq;
    @XmlElement(name = "AccptncDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar accptncDtTm;
    @XmlElement(name = "PoolgAdjstmntDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar poolgAdjstmntDt;
    @XmlElement(name = "InstdAmt")
    protected CurrencyAndAmount instdAmt;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "ChrgBr", required = true)
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "ChrgsInf")
    protected List<ChargesInformation1> chrgsInf;
    @XmlElement(name = "PrvsInstgAgt")
    protected BranchAndFinancialInstitutionIdentification3 prvsInstgAgt;
    @XmlElement(name = "PrvsInstgAgtAcct")
    protected CashAccount7 prvsInstgAgtAcct;
    @XmlElement(name = "InstgAgt")
    protected BranchAndFinancialInstitutionIdentification3 instgAgt;
    @XmlElement(name = "InstdAgt")
    protected BranchAndFinancialInstitutionIdentification3 instdAgt;
    @XmlElement(name = "IntrmyAgt1")
    protected BranchAndFinancialInstitutionIdentification3 intrmyAgt1;
    @XmlElement(name = "IntrmyAgt1Acct")
    protected CashAccount7 intrmyAgt1Acct;
    @XmlElement(name = "IntrmyAgt2")
    protected BranchAndFinancialInstitutionIdentification3 intrmyAgt2;
    @XmlElement(name = "IntrmyAgt2Acct")
    protected CashAccount7 intrmyAgt2Acct;
    @XmlElement(name = "IntrmyAgt3")
    protected BranchAndFinancialInstitutionIdentification3 intrmyAgt3;
    @XmlElement(name = "IntrmyAgt3Acct")
    protected CashAccount7 intrmyAgt3Acct;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification8 ultmtDbtr;
    @XmlElement(name = "InitgPty")
    protected PartyIdentification8 initgPty;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentification8 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount7 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification3 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount7 dbtrAgtAcct;
    @XmlElement(name = "CdtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification3 cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct")
    protected CashAccount7 cdtrAgtAcct;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentification8 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount7 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification8 ultmtCdtr;
    @XmlElement(name = "InstrForCdtrAgt")
    protected List<InstructionForCreditorAgent1> instrForCdtrAgt;
    @XmlElement(name = "InstrForNxtAgt")
    protected List<InstructionForNextAgent1> instrForNxtAgt;
    @XmlElement(name = "Purp")
    protected Purpose1Choice purp;
    @XmlElement(name = "RgltryRptg")
    protected List<RegulatoryReporting2> rgltryRptg;
    @XmlElement(name = "RltdRmtInf")
    protected List<RemittanceLocation1> rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation1 rmtInf;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification2 }
     *     
     */
    public PaymentIdentification2 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification2 }
     *     
     */
    public CreditTransferTransactionInformation2 setPmtId(PaymentIdentification2 value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation3 }
     *     
     */
    public PaymentTypeInformation3 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation3 }
     *     
     */
    public CreditTransferTransactionInformation2 setPmtTpInf(PaymentTypeInformation3 value) {
        this.pmtTpInf = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CreditTransferTransactionInformation2 setIntrBkSttlmAmt(CurrencyAndAmount value) {
        this.intrBkSttlmAmt = value;
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
    public Calendar getIntrBkSttlmDt() {
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
    public CreditTransferTransactionInformation2 setIntrBkSttlmDt(Calendar value) {
        this.intrBkSttlmDt = value;
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
    public CreditTransferTransactionInformation2 setSttlmTmIndctn(SettlementDateTimeIndication1 value) {
        this.sttlmTmIndctn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTmReq property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTimeRequest1 }
     *     
     */
    public SettlementTimeRequest1 getSttlmTmReq() {
        return sttlmTmReq;
    }

    /**
     * Sets the value of the sttlmTmReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTimeRequest1 }
     *     
     */
    public CreditTransferTransactionInformation2 setSttlmTmReq(SettlementTimeRequest1 value) {
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
    public Calendar getAccptncDtTm() {
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
    public CreditTransferTransactionInformation2 setAccptncDtTm(Calendar value) {
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
    public Calendar getPoolgAdjstmntDt() {
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
    public CreditTransferTransactionInformation2 setPoolgAdjstmntDt(Calendar value) {
        this.poolgAdjstmntDt = value;
        return this;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CreditTransferTransactionInformation2 setInstdAmt(CurrencyAndAmount value) {
        this.instdAmt = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CreditTransferTransactionInformation2 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
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
    public CreditTransferTransactionInformation2 setChrgBr(ChargeBearerType1Code value) {
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
     * {@link ChargesInformation1 }
     * 
     * 
     * @return
     *     The value of the chrgsInf property.
     */
    public List<ChargesInformation1> getChrgsInf() {
        if (chrgsInf == null) {
            chrgsInf = new ArrayList<>();
        }
        return this.chrgsInf;
    }

    /**
     * Gets the value of the prvsInstgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getPrvsInstgAgt() {
        return prvsInstgAgt;
    }

    /**
     * Sets the value of the prvsInstgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public CreditTransferTransactionInformation2 setPrvsInstgAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.prvsInstgAgt = value;
        return this;
    }

    /**
     * Gets the value of the prvsInstgAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getPrvsInstgAgtAcct() {
        return prvsInstgAgtAcct;
    }

    /**
     * Sets the value of the prvsInstgAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public CreditTransferTransactionInformation2 setPrvsInstgAgtAcct(CashAccount7 value) {
        this.prvsInstgAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public CreditTransferTransactionInformation2 setInstgAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.instgAgt = value;
        return this;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public CreditTransferTransactionInformation2 setInstdAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.instdAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getIntrmyAgt1() {
        return intrmyAgt1;
    }

    /**
     * Sets the value of the intrmyAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public CreditTransferTransactionInformation2 setIntrmyAgt1(BranchAndFinancialInstitutionIdentification3 value) {
        this.intrmyAgt1 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt1Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getIntrmyAgt1Acct() {
        return intrmyAgt1Acct;
    }

    /**
     * Sets the value of the intrmyAgt1Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public CreditTransferTransactionInformation2 setIntrmyAgt1Acct(CashAccount7 value) {
        this.intrmyAgt1Acct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getIntrmyAgt2() {
        return intrmyAgt2;
    }

    /**
     * Sets the value of the intrmyAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public CreditTransferTransactionInformation2 setIntrmyAgt2(BranchAndFinancialInstitutionIdentification3 value) {
        this.intrmyAgt2 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt2Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getIntrmyAgt2Acct() {
        return intrmyAgt2Acct;
    }

    /**
     * Sets the value of the intrmyAgt2Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public CreditTransferTransactionInformation2 setIntrmyAgt2Acct(CashAccount7 value) {
        this.intrmyAgt2Acct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt3 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getIntrmyAgt3() {
        return intrmyAgt3;
    }

    /**
     * Sets the value of the intrmyAgt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public CreditTransferTransactionInformation2 setIntrmyAgt3(BranchAndFinancialInstitutionIdentification3 value) {
        this.intrmyAgt3 = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt3Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getIntrmyAgt3Acct() {
        return intrmyAgt3Acct;
    }

    /**
     * Sets the value of the intrmyAgt3Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public CreditTransferTransactionInformation2 setIntrmyAgt3Acct(CashAccount7 value) {
        this.intrmyAgt3Acct = value;
        return this;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public CreditTransferTransactionInformation2 setUltmtDbtr(PartyIdentification8 value) {
        this.ultmtDbtr = value;
        return this;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public CreditTransferTransactionInformation2 setInitgPty(PartyIdentification8 value) {
        this.initgPty = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public CreditTransferTransactionInformation2 setDbtr(PartyIdentification8 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public CreditTransferTransactionInformation2 setDbtrAcct(CashAccount7 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public CreditTransferTransactionInformation2 setDbtrAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public CreditTransferTransactionInformation2 setDbtrAgtAcct(CashAccount7 value) {
        this.dbtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public CreditTransferTransactionInformation2 setCdtrAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    /**
     * Sets the value of the cdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public CreditTransferTransactionInformation2 setCdtrAgtAcct(CashAccount7 value) {
        this.cdtrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public CreditTransferTransactionInformation2 setCdtr(PartyIdentification8 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public CreditTransferTransactionInformation2 setCdtrAcct(CashAccount7 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public CreditTransferTransactionInformation2 setUltmtCdtr(PartyIdentification8 value) {
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
     * {@link InstructionForCreditorAgent1 }
     * 
     * 
     * @return
     *     The value of the instrForCdtrAgt property.
     */
    public List<InstructionForCreditorAgent1> getInstrForCdtrAgt() {
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
     *     {@link Purpose1Choice }
     *     
     */
    public Purpose1Choice getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose1Choice }
     *     
     */
    public CreditTransferTransactionInformation2 setPurp(Purpose1Choice value) {
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
     * {@link RegulatoryReporting2 }
     * 
     * 
     * @return
     *     The value of the rgltryRptg property.
     */
    public List<RegulatoryReporting2> getRgltryRptg() {
        if (rgltryRptg == null) {
            rgltryRptg = new ArrayList<>();
        }
        return this.rgltryRptg;
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
     * {@link RemittanceLocation1 }
     * 
     * 
     * @return
     *     The value of the rltdRmtInf property.
     */
    public List<RemittanceLocation1> getRltdRmtInf() {
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
     *     {@link RemittanceInformation1 }
     *     
     */
    public RemittanceInformation1 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation1 }
     *     
     */
    public CreditTransferTransactionInformation2 setRmtInf(RemittanceInformation1 value) {
        this.rmtInf = value;
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
    public CreditTransferTransactionInformation2 addChrgsInf(ChargesInformation1 chrgsInf) {
        getChrgsInf().add(chrgsInf);
        return this;
    }

    /**
     * Adds a new item to the instrForCdtrAgt list.
     * @see #getInstrForCdtrAgt()
     * 
     */
    public CreditTransferTransactionInformation2 addInstrForCdtrAgt(InstructionForCreditorAgent1 instrForCdtrAgt) {
        getInstrForCdtrAgt().add(instrForCdtrAgt);
        return this;
    }

    /**
     * Adds a new item to the instrForNxtAgt list.
     * @see #getInstrForNxtAgt()
     * 
     */
    public CreditTransferTransactionInformation2 addInstrForNxtAgt(InstructionForNextAgent1 instrForNxtAgt) {
        getInstrForNxtAgt().add(instrForNxtAgt);
        return this;
    }

    /**
     * Adds a new item to the rgltryRptg list.
     * @see #getRgltryRptg()
     * 
     */
    public CreditTransferTransactionInformation2 addRgltryRptg(RegulatoryReporting2 rgltryRptg) {
        getRgltryRptg().add(rgltryRptg);
        return this;
    }

    /**
     * Adds a new item to the rltdRmtInf list.
     * @see #getRltdRmtInf()
     * 
     */
    public CreditTransferTransactionInformation2 addRltdRmtInf(RemittanceLocation1 rltdRmtInf) {
        getRltdRmtInf().add(rltdRmtInf);
        return this;
    }

}
