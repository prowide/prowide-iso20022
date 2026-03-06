
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
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
 * Specifies further details of the transaction for which the penalties apply.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyTransactionRecord1__1", propOrder = {
    "sttlmTxOrCorpActnEvtTp",
    "sttlmDt",
    "sfkpgAcct",
    "acctOwnr",
    "sctiesMvmntTp",
    "pmt",
    "pstngQty",
    "cshAcct",
    "cshAcctOwnr",
    "pstngAmt",
    "ackdStsTmStmp",
    "mtchdStsTmStmp",
    "sttlmStsFlng",
    "bizDayEvt"
})
public class PenaltyTransactionRecord11 {

    @XmlElement(name = "SttlmTxOrCorpActnEvtTp", required = true)
    protected SettlementOrCorporateActionEvent27Choice1 sttlmTxOrCorpActnEvtTp;
    @XmlElement(name = "SttlmDt", required = true)
    protected SettlementDate17Choice1Draft sttlmDt;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount191 sfkpgAcct;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification1441 acctOwnr;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "PstngQty", required = true)
    protected FinancialInstrumentQuantity1Choice1 pstngQty;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice1 cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected PartyIdentification1351 cshAcctOwnr;
    @XmlElement(name = "PstngAmt")
    protected AmountAndDirection53Draft pstngAmt;
    @XmlElement(name = "AckdStsTmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime ackdStsTmStmp;
    @XmlElement(name = "MtchdStsTmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime mtchdStsTmStmp;
    @XmlElement(name = "SttlmStsFlng")
    protected FailingStatus10Choice1 sttlmStsFlng;
    @XmlElement(name = "BizDayEvt")
    protected SystemEvent31 bizDayEvt;

    /**
     * Gets the value of the sttlmTxOrCorpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementOrCorporateActionEvent27Choice1 }
     *     
     */
    public SettlementOrCorporateActionEvent27Choice1 getSttlmTxOrCorpActnEvtTp() {
        return sttlmTxOrCorpActnEvtTp;
    }

    /**
     * Sets the value of the sttlmTxOrCorpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementOrCorporateActionEvent27Choice1 }
     *     
     */
    public PenaltyTransactionRecord11 setSttlmTxOrCorpActnEvtTp(SettlementOrCorporateActionEvent27Choice1 value) {
        this.sttlmTxOrCorpActnEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate17Choice1Draft }
     *     
     */
    public SettlementDate17Choice1Draft getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate17Choice1Draft }
     *     
     */
    public PenaltyTransactionRecord11 setSttlmDt(SettlementDate17Choice1Draft value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount191 }
     *     
     */
    public SecuritiesAccount191 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount191 }
     *     
     */
    public PenaltyTransactionRecord11 setSfkpgAcct(SecuritiesAccount191 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1441 }
     *     
     */
    public PartyIdentification1441 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1441 }
     *     
     */
    public PenaltyTransactionRecord11 setAcctOwnr(PartyIdentification1441 value) {
        this.acctOwnr = value;
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
    public PenaltyTransactionRecord11 setSctiesMvmntTp(ReceiveDelivery1Code value) {
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
    public PenaltyTransactionRecord11 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the pstngQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public FinancialInstrumentQuantity1Choice1 getPstngQty() {
        return pstngQty;
    }

    /**
     * Sets the value of the pstngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public PenaltyTransactionRecord11 setPstngQty(FinancialInstrumentQuantity1Choice1 value) {
        this.pstngQty = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice1 }
     *     
     */
    public CashAccountIdentification5Choice1 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice1 }
     *     
     */
    public PenaltyTransactionRecord11 setCshAcct(CashAccountIdentification5Choice1 value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1351 }
     *     
     */
    public PartyIdentification1351 getCshAcctOwnr() {
        return cshAcctOwnr;
    }

    /**
     * Sets the value of the cshAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1351 }
     *     
     */
    public PenaltyTransactionRecord11 setCshAcctOwnr(PartyIdentification1351 value) {
        this.cshAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the pstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53Draft }
     *     
     */
    public AmountAndDirection53Draft getPstngAmt() {
        return pstngAmt;
    }

    /**
     * Sets the value of the pstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53Draft }
     *     
     */
    public PenaltyTransactionRecord11 setPstngAmt(AmountAndDirection53Draft value) {
        this.pstngAmt = value;
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
    public PenaltyTransactionRecord11 setAckdStsTmStmp(OffsetDateTime value) {
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
    public PenaltyTransactionRecord11 setMtchdStsTmStmp(OffsetDateTime value) {
        this.mtchdStsTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the sttlmStsFlng property.
     * 
     * @return
     *     possible object is
     *     {@link FailingStatus10Choice1 }
     *     
     */
    public FailingStatus10Choice1 getSttlmStsFlng() {
        return sttlmStsFlng;
    }

    /**
     * Sets the value of the sttlmStsFlng property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailingStatus10Choice1 }
     *     
     */
    public PenaltyTransactionRecord11 setSttlmStsFlng(FailingStatus10Choice1 value) {
        this.sttlmStsFlng = value;
        return this;
    }

    /**
     * Gets the value of the bizDayEvt property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEvent31 }
     *     
     */
    public SystemEvent31 getBizDayEvt() {
        return bizDayEvt;
    }

    /**
     * Sets the value of the bizDayEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEvent31 }
     *     
     */
    public PenaltyTransactionRecord11 setBizDayEvt(SystemEvent31 value) {
        this.bizDayEvt = value;
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

}
