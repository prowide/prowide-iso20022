
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * Identifies additional details of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDetails125__1", propOrder = {
    "txActvty",
    "sttlmTxOrCorpActnEvtTp",
    "sctiesMvmntTp",
    "pmt",
    "sttlmParams",
    "plcOfTrad",
    "plcOfClr",
    "finInstrmId",
    "ctryOfIsse",
    "condlSctiesDlvry",
    "sttlmQty",
    "sttldQty",
    "prevslySttldQty",
    "rmngToBeSttldQty",
    "sttlmAmt",
    "sttldAmt",
    "prevslySttldAmt",
    "rmngSttlmAmt",
    "tradDt",
    "intnddSttlmDt",
    "fctvSttlmDt",
    "stsDt",
    "ackdStsTmStmp",
    "mtchdStsTmStmp",
    "lnkgs",
    "prty",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "msgOrgtr",
    "creDtTm"
})
public class TransactionDetails1251 {

    @XmlElement(name = "TxActvty", required = true)
    protected TransactionActivity3Choice1 txActvty;
    @XmlElement(name = "SttlmTxOrCorpActnEvtTp")
    protected SettlementOrCorporateActionEvent26Choice1 sttlmTxOrCorpActnEvtTp;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails1821 sttlmParams;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification11 plcOfTrad;
    @XmlElement(name = "PlcOfClr")
    protected PlaceOfClearingIdentification21 plcOfClr;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification191 finInstrmId;
    @XmlElement(name = "CtryOfIsse")
    protected String ctryOfIsse;
    @XmlElement(name = "CondlSctiesDlvry")
    protected Boolean condlSctiesDlvry;
    @XmlElement(name = "SttlmQty", required = true)
    protected FinancialInstrumentQuantity1Choice1 sttlmQty;
    @XmlElement(name = "SttldQty")
    protected FinancialInstrumentQuantity1Choice1 sttldQty;
    @XmlElement(name = "PrevslySttldQty")
    protected FinancialInstrumentQuantity1Choice1 prevslySttldQty;
    @XmlElement(name = "RmngToBeSttldQty")
    protected FinancialInstrumentQuantity1Choice1 rmngToBeSttldQty;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection201 sttlmAmt;
    @XmlElement(name = "SttldAmt")
    protected AmountAndDirection201 sttldAmt;
    @XmlElement(name = "PrevslySttldAmt")
    protected AmountAndDirection201 prevslySttldAmt;
    @XmlElement(name = "RmngSttlmAmt")
    protected AmountAndDirection201 rmngSttlmAmt;
    @XmlElement(name = "TradDt")
    protected TradeDate8Choice1Draft tradDt;
    @XmlElement(name = "IntnddSttlmDt", required = true)
    protected SettlementDate19Choice1 intnddSttlmDt;
    @XmlElement(name = "FctvSttlmDt")
    protected DateAndDateTime2Choice1Draft fctvSttlmDt;
    @XmlElement(name = "StsDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime stsDt;
    @XmlElement(name = "AckdStsTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime ackdStsTmStmp;
    @XmlElement(name = "MtchdStsTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime mtchdStsTmStmp;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages571> lnkgs;
    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice1 prty;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties781 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties781 rcvgSttlmPties;
    @XmlElement(name = "MsgOrgtr")
    protected SystemPartyIdentification81 msgOrgtr;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime creDtTm;

    /**
     * Gets the value of the txActvty property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionActivity3Choice1 }
     *     
     */
    public TransactionActivity3Choice1 getTxActvty() {
        return txActvty;
    }

    /**
     * Sets the value of the txActvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionActivity3Choice1 }
     *     
     */
    public TransactionDetails1251 setTxActvty(TransactionActivity3Choice1 value) {
        this.txActvty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTxOrCorpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementOrCorporateActionEvent26Choice1 }
     *     
     */
    public SettlementOrCorporateActionEvent26Choice1 getSttlmTxOrCorpActnEvtTp() {
        return sttlmTxOrCorpActnEvtTp;
    }

    /**
     * Sets the value of the sttlmTxOrCorpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementOrCorporateActionEvent26Choice1 }
     *     
     */
    public TransactionDetails1251 setSttlmTxOrCorpActnEvtTp(SettlementOrCorporateActionEvent26Choice1 value) {
        this.sttlmTxOrCorpActnEvtTp = value;
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
    public TransactionDetails1251 setSctiesMvmntTp(ReceiveDelivery1Code value) {
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
    public TransactionDetails1251 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails1821 }
     *     
     */
    public SettlementDetails1821 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails1821 }
     *     
     */
    public TransactionDetails1251 setSttlmParams(SettlementDetails1821 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification11 }
     *     
     */
    public PlaceOfTradeIdentification11 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification11 }
     *     
     */
    public TransactionDetails1251 setPlcOfTrad(PlaceOfTradeIdentification11 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the plcOfClr property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfClearingIdentification21 }
     *     
     */
    public PlaceOfClearingIdentification21 getPlcOfClr() {
        return plcOfClr;
    }

    /**
     * Sets the value of the plcOfClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfClearingIdentification21 }
     *     
     */
    public TransactionDetails1251 setPlcOfClr(PlaceOfClearingIdentification21 value) {
        this.plcOfClr = value;
        return this;
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
    public TransactionDetails1251 setFinInstrmId(SecurityIdentification191 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfIsse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIsse() {
        return ctryOfIsse;
    }

    /**
     * Sets the value of the ctryOfIsse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionDetails1251 setCtryOfIsse(String value) {
        this.ctryOfIsse = value;
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
    public TransactionDetails1251 setCondlSctiesDlvry(Boolean value) {
        this.condlSctiesDlvry = value;
        return this;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public FinancialInstrumentQuantity1Choice1 getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public TransactionDetails1251 setSttlmQty(FinancialInstrumentQuantity1Choice1 value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the sttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public FinancialInstrumentQuantity1Choice1 getSttldQty() {
        return sttldQty;
    }

    /**
     * Sets the value of the sttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public TransactionDetails1251 setSttldQty(FinancialInstrumentQuantity1Choice1 value) {
        this.sttldQty = value;
        return this;
    }

    /**
     * Gets the value of the prevslySttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public FinancialInstrumentQuantity1Choice1 getPrevslySttldQty() {
        return prevslySttldQty;
    }

    /**
     * Sets the value of the prevslySttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public TransactionDetails1251 setPrevslySttldQty(FinancialInstrumentQuantity1Choice1 value) {
        this.prevslySttldQty = value;
        return this;
    }

    /**
     * Gets the value of the rmngToBeSttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public FinancialInstrumentQuantity1Choice1 getRmngToBeSttldQty() {
        return rmngToBeSttldQty;
    }

    /**
     * Sets the value of the rmngToBeSttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public TransactionDetails1251 setRmngToBeSttldQty(FinancialInstrumentQuantity1Choice1 value) {
        this.rmngToBeSttldQty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection201 }
     *     
     */
    public AmountAndDirection201 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection201 }
     *     
     */
    public TransactionDetails1251 setSttlmAmt(AmountAndDirection201 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection201 }
     *     
     */
    public AmountAndDirection201 getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection201 }
     *     
     */
    public TransactionDetails1251 setSttldAmt(AmountAndDirection201 value) {
        this.sttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the prevslySttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection201 }
     *     
     */
    public AmountAndDirection201 getPrevslySttldAmt() {
        return prevslySttldAmt;
    }

    /**
     * Sets the value of the prevslySttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection201 }
     *     
     */
    public TransactionDetails1251 setPrevslySttldAmt(AmountAndDirection201 value) {
        this.prevslySttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the rmngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection201 }
     *     
     */
    public AmountAndDirection201 getRmngSttlmAmt() {
        return rmngSttlmAmt;
    }

    /**
     * Sets the value of the rmngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection201 }
     *     
     */
    public TransactionDetails1251 setRmngSttlmAmt(AmountAndDirection201 value) {
        this.rmngSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate8Choice1Draft }
     *     
     */
    public TradeDate8Choice1Draft getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate8Choice1Draft }
     *     
     */
    public TransactionDetails1251 setTradDt(TradeDate8Choice1Draft value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the intnddSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate19Choice1 }
     *     
     */
    public SettlementDate19Choice1 getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Sets the value of the intnddSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate19Choice1 }
     *     
     */
    public TransactionDetails1251 setIntnddSttlmDt(SettlementDate19Choice1 value) {
        this.intnddSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice1Draft }
     *     
     */
    public DateAndDateTime2Choice1Draft getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice1Draft }
     *     
     */
    public TransactionDetails1251 setFctvSttlmDt(DateAndDateTime2Choice1Draft value) {
        this.fctvSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the stsDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getStsDt() {
        return stsDt;
    }

    /**
     * Sets the value of the stsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionDetails1251 setStsDt(OffsetDateTime value) {
        this.stsDt = value;
        return this;
    }

    /**
     * Gets the value of the ackdStsTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getAckdStsTmStmp() {
        return ackdStsTmStmp;
    }

    /**
     * Sets the value of the ackdStsTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionDetails1251 setAckdStsTmStmp(OffsetDateTime value) {
        this.ackdStsTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the mtchdStsTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getMtchdStsTmStmp() {
        return mtchdStsTmStmp;
    }

    /**
     * Sets the value of the mtchdStsTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionDetails1251 setMtchdStsTmStmp(OffsetDateTime value) {
        this.mtchdStsTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages571 }
     * 
     * 
     * @return
     *     The value of the lnkgs property.
     */
    public List<Linkages571> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<>();
        }
        return this.lnkgs;
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
    public TransactionDetails1251 setPrty(PriorityNumeric4Choice1 value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties781 }
     *     
     */
    public SettlementParties781 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties781 }
     *     
     */
    public TransactionDetails1251 setDlvrgSttlmPties(SettlementParties781 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties781 }
     *     
     */
    public SettlementParties781 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties781 }
     *     
     */
    public TransactionDetails1251 setRcvgSttlmPties(SettlementParties781 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification81 }
     *     
     */
    public SystemPartyIdentification81 getMsgOrgtr() {
        return msgOrgtr;
    }

    /**
     * Sets the value of the msgOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification81 }
     *     
     */
    public TransactionDetails1251 setMsgOrgtr(SystemPartyIdentification81 value) {
        this.msgOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionDetails1251 setCreDtTm(OffsetDateTime value) {
        this.creDtTm = value;
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
     * Adds a new item to the lnkgs list.
     * @see #getLnkgs()
     * 
     */
    public TransactionDetails1251 addLnkgs(Linkages571 lnkgs) {
        getLnkgs().add(lnkgs);
        return this;
    }

}
