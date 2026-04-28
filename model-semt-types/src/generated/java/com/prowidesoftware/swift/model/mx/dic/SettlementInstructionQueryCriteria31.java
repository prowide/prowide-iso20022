
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria based on which information is included.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInstructionQueryCriteria3__1", propOrder = {
    "refs",
    "sts",
    "sctiesMvmntTp",
    "pmt",
    "sctiesTxTp",
    "finInstrmId",
    "prty",
    "sfkpgAcct",
    "cshAcct",
    "tradDt",
    "sttlmQty",
    "sttldQty",
    "sttlmAmt",
    "sttldAmt",
    "intnddSttlmDt",
    "fctvSttlmDt",
    "sttlmCcy",
    "sfkpgAcctOwnr",
    "msgOrgtr",
    "cntrptSttlmPties",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "tradTxCond",
    "sctiesTxCond",
    "prtlSttlmInd",
    "condlSctiesDlvry",
    "ctryOfIsse",
    "issrCSD"
})
public class SettlementInstructionQueryCriteria31 {

    @XmlElement(name = "Refs")
    protected List<References67Choice1> refs;
    @XmlElement(name = "Sts")
    protected SettlementInstructionQueryStatus31 sts;
    @XmlElement(name = "SctiesMvmntTp")
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt")
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SctiesTxTp")
    protected List<SecuritiesTransactionType48Choice1> sctiesTxTp;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification191 finInstrmId;
    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice1 prty;
    @XmlElement(name = "SfkpgAcct")
    protected List<SecuritiesAccount191> sfkpgAcct;
    @XmlElement(name = "CshAcct")
    protected List<AccountIdentificationSearchCriteria2Choice1> cshAcct;
    @XmlElement(name = "TradDt")
    protected DateAndDateTimeSearch5Choice1 tradDt;
    @XmlElement(name = "SttlmQty")
    protected QuantitySearch2Choice1 sttlmQty;
    @XmlElement(name = "SttldQty")
    protected QuantitySearch2Choice1 sttldQty;
    @XmlElement(name = "SttlmAmt")
    protected ActiveCurrencyAndAmountRange31 sttlmAmt;
    @XmlElement(name = "SttldAmt")
    protected ActiveCurrencyAndAmountRange31 sttldAmt;
    @XmlElement(name = "IntnddSttlmDt")
    protected DateAndDateTimeSearch5Choice1 intnddSttlmDt;
    @XmlElement(name = "FctvSttlmDt")
    protected DateAndDateTimeSearch5Choice1 fctvSttlmDt;
    @XmlElement(name = "SttlmCcy")
    protected List<String> sttlmCcy;
    @XmlElement(name = "SfkpgAcctOwnr")
    protected List<PartyIdentification1481> sfkpgAcctOwnr;
    @XmlElement(name = "MsgOrgtr")
    protected List<SystemPartyIdentification81> msgOrgtr;
    @XmlElement(name = "CntrptSttlmPties")
    protected List<SettlementParties781Semt026Draft> cntrptSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected List<SettlementParties781Semt026Draft> dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected List<SettlementParties781Semt026Draft> rcvgSttlmPties;
    @XmlElement(name = "TradTxCond")
    @XmlSchemaType(name = "string")
    protected TradeTransactionCondition1Code1 tradTxCond;
    @XmlElement(name = "SctiesTxCond")
    protected List<SettlementTransactionCondition16Choice1> sctiesTxCond;
    @XmlElement(name = "PrtlSttlmInd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition5Code prtlSttlmInd;
    @XmlElement(name = "CondlSctiesDlvry")
    protected Boolean condlSctiesDlvry;
    @XmlElement(name = "CtryOfIsse")
    protected List<String> ctryOfIsse;
    @XmlElement(name = "IssrCSD")
    protected List<PartyIdentification1361> issrCSD;

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link References67Choice1 }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<References67Choice1> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstructionQueryStatus31 }
     *     
     */
    public SettlementInstructionQueryStatus31 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstructionQueryStatus31 }
     *     
     */
    public SettlementInstructionQueryCriteria31 setSts(SettlementInstructionQueryStatus31 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public ReceiveDelivery1Code getSctiesMvmntTp() {
        return sctiesMvmntTp;
    }

    /**
     * Sets the value of the sctiesMvmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public SettlementInstructionQueryCriteria31 setSctiesMvmntTp(ReceiveDelivery1Code value) {
        this.sctiesMvmntTp = value;
        return this;
    }

    /**
     * Gets the value of the pmt property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getPmt() {
        return pmt;
    }

    /**
     * Sets the value of the pmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public SettlementInstructionQueryCriteria31 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesTxTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesTxTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesTxTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesTransactionType48Choice1 }
     * 
     * 
     * @return
     *     The value of the sctiesTxTp property.
     */
    public List<SecuritiesTransactionType48Choice1> getSctiesTxTp() {
        if (sctiesTxTp == null) {
            sctiesTxTp = new ArrayList<>();
        }
        return this.sctiesTxTp;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public SecurityIdentification191 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public SettlementInstructionQueryCriteria31 setFinInstrmId(SecurityIdentification191 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric4Choice1 }
     *     
     */
    public PriorityNumeric4Choice1 getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric4Choice1 }
     *     
     */
    public SettlementInstructionQueryCriteria31 setPrty(PriorityNumeric4Choice1 value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sfkpgAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfkpgAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesAccount191 }
     * 
     * 
     * @return
     *     The value of the sfkpgAcct property.
     */
    public List<SecuritiesAccount191> getSfkpgAcct() {
        if (sfkpgAcct == null) {
            sfkpgAcct = new ArrayList<>();
        }
        return this.sfkpgAcct;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentificationSearchCriteria2Choice1 }
     * 
     * 
     * @return
     *     The value of the cshAcct property.
     */
    public List<AccountIdentificationSearchCriteria2Choice1> getCshAcct() {
        if (cshAcct == null) {
            cshAcct = new ArrayList<>();
        }
        return this.cshAcct;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice1 }
     *     
     */
    public DateAndDateTimeSearch5Choice1 getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice1 }
     *     
     */
    public SettlementInstructionQueryCriteria31 setTradDt(DateAndDateTimeSearch5Choice1 value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitySearch2Choice1 }
     *     
     */
    public QuantitySearch2Choice1 getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitySearch2Choice1 }
     *     
     */
    public SettlementInstructionQueryCriteria31 setSttlmQty(QuantitySearch2Choice1 value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the sttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitySearch2Choice1 }
     *     
     */
    public QuantitySearch2Choice1 getSttldQty() {
        return sttldQty;
    }

    /**
     * Sets the value of the sttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitySearch2Choice1 }
     *     
     */
    public SettlementInstructionQueryCriteria31 setSttldQty(QuantitySearch2Choice1 value) {
        this.sttldQty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmountRange31 }
     *     
     */
    public ActiveCurrencyAndAmountRange31 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmountRange31 }
     *     
     */
    public SettlementInstructionQueryCriteria31 setSttlmAmt(ActiveCurrencyAndAmountRange31 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmountRange31 }
     *     
     */
    public ActiveCurrencyAndAmountRange31 getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmountRange31 }
     *     
     */
    public SettlementInstructionQueryCriteria31 setSttldAmt(ActiveCurrencyAndAmountRange31 value) {
        this.sttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the intnddSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice1 }
     *     
     */
    public DateAndDateTimeSearch5Choice1 getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Sets the value of the intnddSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice1 }
     *     
     */
    public SettlementInstructionQueryCriteria31 setIntnddSttlmDt(DateAndDateTimeSearch5Choice1 value) {
        this.intnddSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice1 }
     *     
     */
    public DateAndDateTimeSearch5Choice1 getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice1 }
     *     
     */
    public SettlementInstructionQueryCriteria31 setFctvSttlmDt(DateAndDateTimeSearch5Choice1 value) {
        this.fctvSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the sttlmCcy property.
     */
    public List<String> getSttlmCcy() {
        if (sttlmCcy == null) {
            sttlmCcy = new ArrayList<>();
        }
        return this.sttlmCcy;
    }

    /**
     * Gets the value of the sfkpgAcctOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sfkpgAcctOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfkpgAcctOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification1481 }
     * 
     * 
     * @return
     *     The value of the sfkpgAcctOwnr property.
     */
    public List<PartyIdentification1481> getSfkpgAcctOwnr() {
        if (sfkpgAcctOwnr == null) {
            sfkpgAcctOwnr = new ArrayList<>();
        }
        return this.sfkpgAcctOwnr;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgOrgtr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgOrgtr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemPartyIdentification81 }
     * 
     * 
     * @return
     *     The value of the msgOrgtr property.
     */
    public List<SystemPartyIdentification81> getMsgOrgtr() {
        if (msgOrgtr == null) {
            msgOrgtr = new ArrayList<>();
        }
        return this.msgOrgtr;
    }

    /**
     * Gets the value of the cntrptSttlmPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cntrptSttlmPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCntrptSttlmPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementParties781Semt026Draft }
     * 
     * 
     * @return
     *     The value of the cntrptSttlmPties property.
     */
    public List<SettlementParties781Semt026Draft> getCntrptSttlmPties() {
        if (cntrptSttlmPties == null) {
            cntrptSttlmPties = new ArrayList<>();
        }
        return this.cntrptSttlmPties;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvrgSttlmPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvrgSttlmPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementParties781Semt026Draft }
     * 
     * 
     * @return
     *     The value of the dlvrgSttlmPties property.
     */
    public List<SettlementParties781Semt026Draft> getDlvrgSttlmPties() {
        if (dlvrgSttlmPties == null) {
            dlvrgSttlmPties = new ArrayList<>();
        }
        return this.dlvrgSttlmPties;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcvgSttlmPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcvgSttlmPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementParties781Semt026Draft }
     * 
     * 
     * @return
     *     The value of the rcvgSttlmPties property.
     */
    public List<SettlementParties781Semt026Draft> getRcvgSttlmPties() {
        if (rcvgSttlmPties == null) {
            rcvgSttlmPties = new ArrayList<>();
        }
        return this.rcvgSttlmPties;
    }

    /**
     * Gets the value of the tradTxCond property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCondition1Code1 }
     *     
     */
    public TradeTransactionCondition1Code1 getTradTxCond() {
        return tradTxCond;
    }

    /**
     * Sets the value of the tradTxCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCondition1Code1 }
     *     
     */
    public SettlementInstructionQueryCriteria31 setTradTxCond(TradeTransactionCondition1Code1 value) {
        this.tradTxCond = value;
        return this;
    }

    /**
     * Gets the value of the sctiesTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementTransactionCondition16Choice1 }
     * 
     * 
     * @return
     *     The value of the sctiesTxCond property.
     */
    public List<SettlementTransactionCondition16Choice1> getSctiesTxCond() {
        if (sctiesTxCond == null) {
            sctiesTxCond = new ArrayList<>();
        }
        return this.sctiesTxCond;
    }

    /**
     * Gets the value of the prtlSttlmInd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public SettlementTransactionCondition5Code getPrtlSttlmInd() {
        return prtlSttlmInd;
    }

    /**
     * Sets the value of the prtlSttlmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public SettlementInstructionQueryCriteria31 setPrtlSttlmInd(SettlementTransactionCondition5Code value) {
        this.prtlSttlmInd = value;
        return this;
    }

    /**
     * Gets the value of the condlSctiesDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCondlSctiesDlvry() {
        return condlSctiesDlvry;
    }

    /**
     * Sets the value of the condlSctiesDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SettlementInstructionQueryCriteria31 setCondlSctiesDlvry(Boolean value) {
        this.condlSctiesDlvry = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfIsse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctryOfIsse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtryOfIsse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ctryOfIsse property.
     */
    public List<String> getCtryOfIsse() {
        if (ctryOfIsse == null) {
            ctryOfIsse = new ArrayList<>();
        }
        return this.ctryOfIsse;
    }

    /**
     * Gets the value of the issrCSD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the issrCSD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssrCSD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification1361 }
     * 
     * 
     * @return
     *     The value of the issrCSD property.
     */
    public List<PartyIdentification1361> getIssrCSD() {
        if (issrCSD == null) {
            issrCSD = new ArrayList<>();
        }
        return this.issrCSD;
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
     * Adds a new item to the refs list.
     * @see #getRefs()
     * 
     */
    public SettlementInstructionQueryCriteria31 addRefs(References67Choice1 refs) {
        getRefs().add(refs);
        return this;
    }

    /**
     * Adds a new item to the sctiesTxTp list.
     * @see #getSctiesTxTp()
     * 
     */
    public SettlementInstructionQueryCriteria31 addSctiesTxTp(SecuritiesTransactionType48Choice1 sctiesTxTp) {
        getSctiesTxTp().add(sctiesTxTp);
        return this;
    }

    /**
     * Adds a new item to the sfkpgAcct list.
     * @see #getSfkpgAcct()
     * 
     */
    public SettlementInstructionQueryCriteria31 addSfkpgAcct(SecuritiesAccount191 sfkpgAcct) {
        getSfkpgAcct().add(sfkpgAcct);
        return this;
    }

    /**
     * Adds a new item to the cshAcct list.
     * @see #getCshAcct()
     * 
     */
    public SettlementInstructionQueryCriteria31 addCshAcct(AccountIdentificationSearchCriteria2Choice1 cshAcct) {
        getCshAcct().add(cshAcct);
        return this;
    }

    /**
     * Adds a new item to the sttlmCcy list.
     * @see #getSttlmCcy()
     * 
     */
    public SettlementInstructionQueryCriteria31 addSttlmCcy(String sttlmCcy) {
        getSttlmCcy().add(sttlmCcy);
        return this;
    }

    /**
     * Adds a new item to the sfkpgAcctOwnr list.
     * @see #getSfkpgAcctOwnr()
     * 
     */
    public SettlementInstructionQueryCriteria31 addSfkpgAcctOwnr(PartyIdentification1481 sfkpgAcctOwnr) {
        getSfkpgAcctOwnr().add(sfkpgAcctOwnr);
        return this;
    }

    /**
     * Adds a new item to the msgOrgtr list.
     * @see #getMsgOrgtr()
     * 
     */
    public SettlementInstructionQueryCriteria31 addMsgOrgtr(SystemPartyIdentification81 msgOrgtr) {
        getMsgOrgtr().add(msgOrgtr);
        return this;
    }

    /**
     * Adds a new item to the cntrptSttlmPties list.
     * @see #getCntrptSttlmPties()
     * 
     */
    public SettlementInstructionQueryCriteria31 addCntrptSttlmPties(SettlementParties781Semt026Draft cntrptSttlmPties) {
        getCntrptSttlmPties().add(cntrptSttlmPties);
        return this;
    }

    /**
     * Adds a new item to the dlvrgSttlmPties list.
     * @see #getDlvrgSttlmPties()
     * 
     */
    public SettlementInstructionQueryCriteria31 addDlvrgSttlmPties(SettlementParties781Semt026Draft dlvrgSttlmPties) {
        getDlvrgSttlmPties().add(dlvrgSttlmPties);
        return this;
    }

    /**
     * Adds a new item to the rcvgSttlmPties list.
     * @see #getRcvgSttlmPties()
     * 
     */
    public SettlementInstructionQueryCriteria31 addRcvgSttlmPties(SettlementParties781Semt026Draft rcvgSttlmPties) {
        getRcvgSttlmPties().add(rcvgSttlmPties);
        return this;
    }

    /**
     * Adds a new item to the sctiesTxCond list.
     * @see #getSctiesTxCond()
     * 
     */
    public SettlementInstructionQueryCriteria31 addSctiesTxCond(SettlementTransactionCondition16Choice1 sctiesTxCond) {
        getSctiesTxCond().add(sctiesTxCond);
        return this;
    }

    /**
     * Adds a new item to the ctryOfIsse list.
     * @see #getCtryOfIsse()
     * 
     */
    public SettlementInstructionQueryCriteria31 addCtryOfIsse(String ctryOfIsse) {
        getCtryOfIsse().add(ctryOfIsse);
        return this;
    }

    /**
     * Adds a new item to the issrCSD list.
     * @see #getIssrCSD()
     * 
     */
    public SettlementInstructionQueryCriteria31 addIssrCSD(PartyIdentification1361 issrCSD) {
        getIssrCSD().add(issrCSD);
        return this;
    }

}
