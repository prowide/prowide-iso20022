
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
@XmlType(name = "PenaltyTransactionRecord1", propOrder = {
    "sttlmTxOrCorpActnEvtTp",
    "sttlmDt",
    "corpActnRltdDt",
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
public class PenaltyTransactionRecord1 {

    @XmlElement(name = "SttlmTxOrCorpActnEvtTp", required = true)
    protected SettlementOrCorporateActionEvent27Choice sttlmTxOrCorpActnEvtTp;
    @XmlElement(name = "SttlmDt", required = true)
    protected SettlementDate17Choice sttlmDt;
    @XmlElement(name = "CorpActnRltdDt")
    protected DateAndDateTime2Choice corpActnRltdDt;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification144 acctOwnr;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "PstngQty", required = true)
    protected FinancialInstrumentQuantity1Choice pstngQty;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected PartyIdentification135 cshAcctOwnr;
    @XmlElement(name = "PstngAmt")
    protected AmountAndDirection5 pstngAmt;
    @XmlElement(name = "AckdStsTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime ackdStsTmStmp;
    @XmlElement(name = "MtchdStsTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime mtchdStsTmStmp;
    @XmlElement(name = "SttlmStsFlng")
    protected FailingStatus10Choice sttlmStsFlng;
    @XmlElement(name = "BizDayEvt")
    protected SystemEvent3 bizDayEvt;

    /**
     * Gets the value of the sttlmTxOrCorpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementOrCorporateActionEvent27Choice }
     *     
     */
    public SettlementOrCorporateActionEvent27Choice getSttlmTxOrCorpActnEvtTp() {
        return sttlmTxOrCorpActnEvtTp;
    }

    /**
     * Sets the value of the sttlmTxOrCorpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementOrCorporateActionEvent27Choice }
     *     
     */
    public PenaltyTransactionRecord1 setSttlmTxOrCorpActnEvtTp(SettlementOrCorporateActionEvent27Choice value) {
        this.sttlmTxOrCorpActnEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate17Choice }
     *     
     */
    public SettlementDate17Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate17Choice }
     *     
     */
    public PenaltyTransactionRecord1 setSttlmDt(SettlementDate17Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the corpActnRltdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getCorpActnRltdDt() {
        return corpActnRltdDt;
    }

    /**
     * Sets the value of the corpActnRltdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public PenaltyTransactionRecord1 setCorpActnRltdDt(DateAndDateTime2Choice value) {
        this.corpActnRltdDt = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public PenaltyTransactionRecord1 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification144 }
     *     
     */
    public PartyIdentification144 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification144 }
     *     
     */
    public PenaltyTransactionRecord1 setAcctOwnr(PartyIdentification144 value) {
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
    public PenaltyTransactionRecord1 setSctiesMvmntTp(ReceiveDelivery1Code value) {
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
    public PenaltyTransactionRecord1 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the pstngQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getPstngQty() {
        return pstngQty;
    }

    /**
     * Sets the value of the pstngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public PenaltyTransactionRecord1 setPstngQty(FinancialInstrumentQuantity1Choice value) {
        this.pstngQty = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public PenaltyTransactionRecord1 setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getCshAcctOwnr() {
        return cshAcctOwnr;
    }

    /**
     * Sets the value of the cshAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PenaltyTransactionRecord1 setCshAcctOwnr(PartyIdentification135 value) {
        this.cshAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the pstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getPstngAmt() {
        return pstngAmt;
    }

    /**
     * Sets the value of the pstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public PenaltyTransactionRecord1 setPstngAmt(AmountAndDirection5 value) {
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
    public PenaltyTransactionRecord1 setAckdStsTmStmp(OffsetDateTime value) {
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
    public PenaltyTransactionRecord1 setMtchdStsTmStmp(OffsetDateTime value) {
        this.mtchdStsTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the sttlmStsFlng property.
     * 
     * @return
     *     possible object is
     *     {@link FailingStatus10Choice }
     *     
     */
    public FailingStatus10Choice getSttlmStsFlng() {
        return sttlmStsFlng;
    }

    /**
     * Sets the value of the sttlmStsFlng property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailingStatus10Choice }
     *     
     */
    public PenaltyTransactionRecord1 setSttlmStsFlng(FailingStatus10Choice value) {
        this.sttlmStsFlng = value;
        return this;
    }

    /**
     * Gets the value of the bizDayEvt property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEvent3 }
     *     
     */
    public SystemEvent3 getBizDayEvt() {
        return bizDayEvt;
    }

    /**
     * Sets the value of the bizDayEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEvent3 }
     *     
     */
    public PenaltyTransactionRecord1 setBizDayEvt(SystemEvent3 value) {
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
