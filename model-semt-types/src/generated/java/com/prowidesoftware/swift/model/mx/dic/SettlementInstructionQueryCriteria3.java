
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "SettlementInstructionQueryCriteria3", propOrder = {
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
    "issrCSD",
    "hldInd"
})
public class SettlementInstructionQueryCriteria3 {

    @XmlElement(name = "Refs")
    protected List<References67Choice> refs;
    @XmlElement(name = "Sts")
    protected List<SettlementInstructionQueryStatus3> sts;
    @XmlElement(name = "SctiesMvmntTp")
    @XmlSchemaType(name = "string")
    protected List<ReceiveDelivery1Code> sctiesMvmntTp;
    @XmlElement(name = "Pmt")
    @XmlSchemaType(name = "string")
    protected List<DeliveryReceiptType2Code> pmt;
    @XmlElement(name = "SctiesTxTp")
    protected List<SecuritiesTransactionType48Choice> sctiesTxTp;
    @XmlElement(name = "FinInstrmId")
    protected List<SecurityIdentification19> finInstrmId;
    @XmlElement(name = "Prty")
    protected List<PriorityNumeric4Choice> prty;
    @XmlElement(name = "SfkpgAcct")
    protected List<SecuritiesAccount19> sfkpgAcct;
    @XmlElement(name = "CshAcct")
    protected List<AccountIdentificationSearchCriteria2Choice> cshAcct;
    @XmlElement(name = "TradDt")
    protected DateAndDateTimeSearch5Choice tradDt;
    @XmlElement(name = "SttlmQty")
    protected QuantitySearch2Choice sttlmQty;
    @XmlElement(name = "SttldQty")
    protected QuantitySearch2Choice sttldQty;
    @XmlElement(name = "SttlmAmt")
    protected ActiveCurrencyAndAmountRange3 sttlmAmt;
    @XmlElement(name = "SttldAmt")
    protected ActiveCurrencyAndAmountRange3 sttldAmt;
    @XmlElement(name = "IntnddSttlmDt")
    protected DateAndDateTimeSearch5Choice intnddSttlmDt;
    @XmlElement(name = "FctvSttlmDt")
    protected DateAndDateTimeSearch5Choice fctvSttlmDt;
    @XmlElement(name = "SttlmCcy")
    protected List<String> sttlmCcy;
    @XmlElement(name = "SfkpgAcctOwnr")
    protected List<PartyIdentification148> sfkpgAcctOwnr;
    @XmlElement(name = "MsgOrgtr")
    protected List<SystemPartyIdentification8> msgOrgtr;
    @XmlElement(name = "CntrptSttlmPties")
    protected List<SettlementParties78> cntrptSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected List<SettlementParties78> dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected List<SettlementParties78> rcvgSttlmPties;
    @XmlElement(name = "TradTxCond")
    @XmlSchemaType(name = "string")
    protected List<TradeTransactionCondition1Code> tradTxCond;
    @XmlElement(name = "SctiesTxCond")
    protected List<SettlementTransactionCondition16Choice> sctiesTxCond;
    @XmlElement(name = "PrtlSttlmInd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition5Code prtlSttlmInd;
    @XmlElement(name = "CondlSctiesDlvry")
    protected Boolean condlSctiesDlvry;
    @XmlElement(name = "CtryOfIsse")
    protected List<String> ctryOfIsse;
    @XmlElement(name = "IssrCSD")
    protected List<PartyIdentification136> issrCSD;
    @XmlElement(name = "HldInd")
    protected List<Registration10Choice> hldInd;

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
     * {@link References67Choice }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<References67Choice> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the sts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementInstructionQueryStatus3 }
     * 
     * 
     * @return
     *     The value of the sts property.
     */
    public List<SettlementInstructionQueryStatus3> getSts() {
        if (sts == null) {
            sts = new ArrayList<>();
        }
        return this.sts;
    }

    /**
     * Gets the value of the sctiesMvmntTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiveDelivery1Code }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntTp property.
     */
    public List<ReceiveDelivery1Code> getSctiesMvmntTp() {
        if (sctiesMvmntTp == null) {
            sctiesMvmntTp = new ArrayList<>();
        }
        return this.sctiesMvmntTp;
    }

    /**
     * Gets the value of the pmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryReceiptType2Code }
     * 
     * 
     * @return
     *     The value of the pmt property.
     */
    public List<DeliveryReceiptType2Code> getPmt() {
        if (pmt == null) {
            pmt = new ArrayList<>();
        }
        return this.pmt;
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
     * {@link SecuritiesTransactionType48Choice }
     * 
     * 
     * @return
     *     The value of the sctiesTxTp property.
     */
    public List<SecuritiesTransactionType48Choice> getSctiesTxTp() {
        if (sctiesTxTp == null) {
            sctiesTxTp = new ArrayList<>();
        }
        return this.sctiesTxTp;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification19 }
     * 
     * 
     * @return
     *     The value of the finInstrmId property.
     */
    public List<SecurityIdentification19> getFinInstrmId() {
        if (finInstrmId == null) {
            finInstrmId = new ArrayList<>();
        }
        return this.finInstrmId;
    }

    /**
     * Gets the value of the prty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityNumeric4Choice }
     * 
     * 
     * @return
     *     The value of the prty property.
     */
    public List<PriorityNumeric4Choice> getPrty() {
        if (prty == null) {
            prty = new ArrayList<>();
        }
        return this.prty;
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
     * {@link SecuritiesAccount19 }
     * 
     * 
     * @return
     *     The value of the sfkpgAcct property.
     */
    public List<SecuritiesAccount19> getSfkpgAcct() {
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
     * {@link AccountIdentificationSearchCriteria2Choice }
     * 
     * 
     * @return
     *     The value of the cshAcct property.
     */
    public List<AccountIdentificationSearchCriteria2Choice> getCshAcct() {
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
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public DateAndDateTimeSearch5Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public SettlementInstructionQueryCriteria3 setTradDt(DateAndDateTimeSearch5Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitySearch2Choice }
     *     
     */
    public QuantitySearch2Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitySearch2Choice }
     *     
     */
    public SettlementInstructionQueryCriteria3 setSttlmQty(QuantitySearch2Choice value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the sttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitySearch2Choice }
     *     
     */
    public QuantitySearch2Choice getSttldQty() {
        return sttldQty;
    }

    /**
     * Sets the value of the sttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitySearch2Choice }
     *     
     */
    public SettlementInstructionQueryCriteria3 setSttldQty(QuantitySearch2Choice value) {
        this.sttldQty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmountRange3 }
     *     
     */
    public ActiveCurrencyAndAmountRange3 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmountRange3 }
     *     
     */
    public SettlementInstructionQueryCriteria3 setSttlmAmt(ActiveCurrencyAndAmountRange3 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmountRange3 }
     *     
     */
    public ActiveCurrencyAndAmountRange3 getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmountRange3 }
     *     
     */
    public SettlementInstructionQueryCriteria3 setSttldAmt(ActiveCurrencyAndAmountRange3 value) {
        this.sttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the intnddSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public DateAndDateTimeSearch5Choice getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Sets the value of the intnddSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public SettlementInstructionQueryCriteria3 setIntnddSttlmDt(DateAndDateTimeSearch5Choice value) {
        this.intnddSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public DateAndDateTimeSearch5Choice getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public SettlementInstructionQueryCriteria3 setFctvSttlmDt(DateAndDateTimeSearch5Choice value) {
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
     * {@link PartyIdentification148 }
     * 
     * 
     * @return
     *     The value of the sfkpgAcctOwnr property.
     */
    public List<PartyIdentification148> getSfkpgAcctOwnr() {
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
     * {@link SystemPartyIdentification8 }
     * 
     * 
     * @return
     *     The value of the msgOrgtr property.
     */
    public List<SystemPartyIdentification8> getMsgOrgtr() {
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
     * {@link SettlementParties78 }
     * 
     * 
     * @return
     *     The value of the cntrptSttlmPties property.
     */
    public List<SettlementParties78> getCntrptSttlmPties() {
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
     * {@link SettlementParties78 }
     * 
     * 
     * @return
     *     The value of the dlvrgSttlmPties property.
     */
    public List<SettlementParties78> getDlvrgSttlmPties() {
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
     * {@link SettlementParties78 }
     * 
     * 
     * @return
     *     The value of the rcvgSttlmPties property.
     */
    public List<SettlementParties78> getRcvgSttlmPties() {
        if (rcvgSttlmPties == null) {
            rcvgSttlmPties = new ArrayList<>();
        }
        return this.rcvgSttlmPties;
    }

    /**
     * Gets the value of the tradTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTransactionCondition1Code }
     * 
     * 
     * @return
     *     The value of the tradTxCond property.
     */
    public List<TradeTransactionCondition1Code> getTradTxCond() {
        if (tradTxCond == null) {
            tradTxCond = new ArrayList<>();
        }
        return this.tradTxCond;
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
     * {@link SettlementTransactionCondition16Choice }
     * 
     * 
     * @return
     *     The value of the sctiesTxCond property.
     */
    public List<SettlementTransactionCondition16Choice> getSctiesTxCond() {
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
    public SettlementInstructionQueryCriteria3 setPrtlSttlmInd(SettlementTransactionCondition5Code value) {
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
    public SettlementInstructionQueryCriteria3 setCondlSctiesDlvry(Boolean value) {
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
     * {@link PartyIdentification136 }
     * 
     * 
     * @return
     *     The value of the issrCSD property.
     */
    public List<PartyIdentification136> getIssrCSD() {
        if (issrCSD == null) {
            issrCSD = new ArrayList<>();
        }
        return this.issrCSD;
    }

    /**
     * Gets the value of the hldInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hldInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHldInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Registration10Choice }
     * 
     * 
     * @return
     *     The value of the hldInd property.
     */
    public List<Registration10Choice> getHldInd() {
        if (hldInd == null) {
            hldInd = new ArrayList<>();
        }
        return this.hldInd;
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
    public SettlementInstructionQueryCriteria3 addRefs(References67Choice refs) {
        getRefs().add(refs);
        return this;
    }

    /**
     * Adds a new item to the sts list.
     * @see #getSts()
     * 
     */
    public SettlementInstructionQueryCriteria3 addSts(SettlementInstructionQueryStatus3 sts) {
        getSts().add(sts);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntTp list.
     * @see #getSctiesMvmntTp()
     * 
     */
    public SettlementInstructionQueryCriteria3 addSctiesMvmntTp(ReceiveDelivery1Code sctiesMvmntTp) {
        getSctiesMvmntTp().add(sctiesMvmntTp);
        return this;
    }

    /**
     * Adds a new item to the pmt list.
     * @see #getPmt()
     * 
     */
    public SettlementInstructionQueryCriteria3 addPmt(DeliveryReceiptType2Code pmt) {
        getPmt().add(pmt);
        return this;
    }

    /**
     * Adds a new item to the sctiesTxTp list.
     * @see #getSctiesTxTp()
     * 
     */
    public SettlementInstructionQueryCriteria3 addSctiesTxTp(SecuritiesTransactionType48Choice sctiesTxTp) {
        getSctiesTxTp().add(sctiesTxTp);
        return this;
    }

    /**
     * Adds a new item to the finInstrmId list.
     * @see #getFinInstrmId()
     * 
     */
    public SettlementInstructionQueryCriteria3 addFinInstrmId(SecurityIdentification19 finInstrmId) {
        getFinInstrmId().add(finInstrmId);
        return this;
    }

    /**
     * Adds a new item to the prty list.
     * @see #getPrty()
     * 
     */
    public SettlementInstructionQueryCriteria3 addPrty(PriorityNumeric4Choice prty) {
        getPrty().add(prty);
        return this;
    }

    /**
     * Adds a new item to the sfkpgAcct list.
     * @see #getSfkpgAcct()
     * 
     */
    public SettlementInstructionQueryCriteria3 addSfkpgAcct(SecuritiesAccount19 sfkpgAcct) {
        getSfkpgAcct().add(sfkpgAcct);
        return this;
    }

    /**
     * Adds a new item to the cshAcct list.
     * @see #getCshAcct()
     * 
     */
    public SettlementInstructionQueryCriteria3 addCshAcct(AccountIdentificationSearchCriteria2Choice cshAcct) {
        getCshAcct().add(cshAcct);
        return this;
    }

    /**
     * Adds a new item to the sttlmCcy list.
     * @see #getSttlmCcy()
     * 
     */
    public SettlementInstructionQueryCriteria3 addSttlmCcy(String sttlmCcy) {
        getSttlmCcy().add(sttlmCcy);
        return this;
    }

    /**
     * Adds a new item to the sfkpgAcctOwnr list.
     * @see #getSfkpgAcctOwnr()
     * 
     */
    public SettlementInstructionQueryCriteria3 addSfkpgAcctOwnr(PartyIdentification148 sfkpgAcctOwnr) {
        getSfkpgAcctOwnr().add(sfkpgAcctOwnr);
        return this;
    }

    /**
     * Adds a new item to the msgOrgtr list.
     * @see #getMsgOrgtr()
     * 
     */
    public SettlementInstructionQueryCriteria3 addMsgOrgtr(SystemPartyIdentification8 msgOrgtr) {
        getMsgOrgtr().add(msgOrgtr);
        return this;
    }

    /**
     * Adds a new item to the cntrptSttlmPties list.
     * @see #getCntrptSttlmPties()
     * 
     */
    public SettlementInstructionQueryCriteria3 addCntrptSttlmPties(SettlementParties78 cntrptSttlmPties) {
        getCntrptSttlmPties().add(cntrptSttlmPties);
        return this;
    }

    /**
     * Adds a new item to the dlvrgSttlmPties list.
     * @see #getDlvrgSttlmPties()
     * 
     */
    public SettlementInstructionQueryCriteria3 addDlvrgSttlmPties(SettlementParties78 dlvrgSttlmPties) {
        getDlvrgSttlmPties().add(dlvrgSttlmPties);
        return this;
    }

    /**
     * Adds a new item to the rcvgSttlmPties list.
     * @see #getRcvgSttlmPties()
     * 
     */
    public SettlementInstructionQueryCriteria3 addRcvgSttlmPties(SettlementParties78 rcvgSttlmPties) {
        getRcvgSttlmPties().add(rcvgSttlmPties);
        return this;
    }

    /**
     * Adds a new item to the tradTxCond list.
     * @see #getTradTxCond()
     * 
     */
    public SettlementInstructionQueryCriteria3 addTradTxCond(TradeTransactionCondition1Code tradTxCond) {
        getTradTxCond().add(tradTxCond);
        return this;
    }

    /**
     * Adds a new item to the sctiesTxCond list.
     * @see #getSctiesTxCond()
     * 
     */
    public SettlementInstructionQueryCriteria3 addSctiesTxCond(SettlementTransactionCondition16Choice sctiesTxCond) {
        getSctiesTxCond().add(sctiesTxCond);
        return this;
    }

    /**
     * Adds a new item to the ctryOfIsse list.
     * @see #getCtryOfIsse()
     * 
     */
    public SettlementInstructionQueryCriteria3 addCtryOfIsse(String ctryOfIsse) {
        getCtryOfIsse().add(ctryOfIsse);
        return this;
    }

    /**
     * Adds a new item to the issrCSD list.
     * @see #getIssrCSD()
     * 
     */
    public SettlementInstructionQueryCriteria3 addIssrCSD(PartyIdentification136 issrCSD) {
        getIssrCSD().add(issrCSD);
        return this;
    }

    /**
     * Adds a new item to the hldInd list.
     * @see #getHldInd()
     * 
     */
    public SettlementInstructionQueryCriteria3 addHldInd(Registration10Choice hldInd) {
        getHldInd().add(hldInd);
        return this;
    }

}
