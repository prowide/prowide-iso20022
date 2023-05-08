
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.Calendar;
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
 * Specifies the details of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDetails114", propOrder = {
    "txActvty",
    "sttlmTxOrCorpActnEvtTp",
    "sctiesMvmntTp",
    "pmt",
    "sttlmParams",
    "plcOfTrad",
    "sfkpgPlc",
    "plcOfClr",
    "pstngQty",
    "nbOfDaysAcrd",
    "pstngAmt",
    "acrdIntrstAmt",
    "tradDt",
    "fctvSttlmDt",
    "sttlmDt",
    "valDt",
    "ackdStsTmStmp",
    "mtchdStsTmStmp",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "rvslInd",
    "txAddtlDtls"
})
public class TransactionDetails114 {

    @XmlElement(name = "TxActvty", required = true)
    protected TransactionActivity3Choice txActvty;
    @XmlElement(name = "SttlmTxOrCorpActnEvtTp")
    protected SettlementOrCorporateActionEvent26Choice sttlmTxOrCorpActnEvtTp;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails150 sttlmParams;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1 plcOfTrad;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace3 sfkpgPlc;
    @XmlElement(name = "PlcOfClr")
    protected PlaceOfClearingIdentification2 plcOfClr;
    @XmlElement(name = "PstngQty", required = true)
    protected Quantity6Choice pstngQty;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "PstngAmt")
    protected AmountAndDirection3 pstngAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection21 acrdIntrstAmt;
    @XmlElement(name = "TradDt")
    protected TradeDate8Choice tradDt;
    @XmlElement(name = "FctvSttlmDt", required = true)
    protected DateAndDateTime2Choice fctvSttlmDt;
    @XmlElement(name = "SttlmDt")
    protected SettlementDate17Choice sttlmDt;
    @XmlElement(name = "ValDt")
    protected DateAndDateTime2Choice valDt;
    @XmlElement(name = "AckdStsTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar ackdStsTmStmp;
    @XmlElement(name = "MtchdStsTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar mtchdStsTmStmp;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties78 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties78 rcvgSttlmPties;
    @XmlElement(name = "RvslInd")
    protected Boolean rvslInd;
    @XmlElement(name = "TxAddtlDtls")
    protected String txAddtlDtls;

    /**
     * Gets the value of the txActvty property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionActivity3Choice }
     *     
     */
    public TransactionActivity3Choice getTxActvty() {
        return txActvty;
    }

    /**
     * Sets the value of the txActvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionActivity3Choice }
     *     
     */
    public TransactionDetails114 setTxActvty(TransactionActivity3Choice value) {
        this.txActvty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTxOrCorpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementOrCorporateActionEvent26Choice }
     *     
     */
    public SettlementOrCorporateActionEvent26Choice getSttlmTxOrCorpActnEvtTp() {
        return sttlmTxOrCorpActnEvtTp;
    }

    /**
     * Sets the value of the sttlmTxOrCorpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementOrCorporateActionEvent26Choice }
     *     
     */
    public TransactionDetails114 setSttlmTxOrCorpActnEvtTp(SettlementOrCorporateActionEvent26Choice value) {
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
    public TransactionDetails114 setSctiesMvmntTp(ReceiveDelivery1Code value) {
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
    public TransactionDetails114 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails150 }
     *     
     */
    public SettlementDetails150 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails150 }
     *     
     */
    public TransactionDetails114 setSttlmParams(SettlementDetails150 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification1 }
     *     
     */
    public PlaceOfTradeIdentification1 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification1 }
     *     
     */
    public TransactionDetails114 setPlcOfTrad(PlaceOfTradeIdentification1 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public SafeKeepingPlace3 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public TransactionDetails114 setSfkpgPlc(SafeKeepingPlace3 value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the plcOfClr property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfClearingIdentification2 }
     *     
     */
    public PlaceOfClearingIdentification2 getPlcOfClr() {
        return plcOfClr;
    }

    /**
     * Sets the value of the plcOfClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfClearingIdentification2 }
     *     
     */
    public TransactionDetails114 setPlcOfClr(PlaceOfClearingIdentification2 value) {
        this.plcOfClr = value;
        return this;
    }

    /**
     * Gets the value of the pstngQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity6Choice }
     *     
     */
    public Quantity6Choice getPstngQty() {
        return pstngQty;
    }

    /**
     * Sets the value of the pstngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity6Choice }
     *     
     */
    public TransactionDetails114 setPstngQty(Quantity6Choice value) {
        this.pstngQty = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionDetails114 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the pstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection3 }
     *     
     */
    public AmountAndDirection3 getPstngAmt() {
        return pstngAmt;
    }

    /**
     * Sets the value of the pstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection3 }
     *     
     */
    public TransactionDetails114 setPstngAmt(AmountAndDirection3 value) {
        this.pstngAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public TransactionDetails114 setAcrdIntrstAmt(AmountAndDirection21 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate8Choice }
     *     
     */
    public TradeDate8Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate8Choice }
     *     
     */
    public TransactionDetails114 setTradDt(TradeDate8Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TransactionDetails114 setFctvSttlmDt(DateAndDateTime2Choice value) {
        this.fctvSttlmDt = value;
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
    public TransactionDetails114 setSttlmDt(SettlementDate17Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TransactionDetails114 setValDt(DateAndDateTime2Choice value) {
        this.valDt = value;
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
    public Calendar getAckdStsTmStmp() {
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
    public TransactionDetails114 setAckdStsTmStmp(Calendar value) {
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
    public Calendar getMtchdStsTmStmp() {
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
    public TransactionDetails114 setMtchdStsTmStmp(Calendar value) {
        this.mtchdStsTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties78 }
     *     
     */
    public SettlementParties78 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties78 }
     *     
     */
    public TransactionDetails114 setDlvrgSttlmPties(SettlementParties78 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties78 }
     *     
     */
    public SettlementParties78 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties78 }
     *     
     */
    public TransactionDetails114 setRcvgSttlmPties(SettlementParties78 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rvslInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRvslInd() {
        return rvslInd;
    }

    /**
     * Sets the value of the rvslInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TransactionDetails114 setRvslInd(Boolean value) {
        this.rvslInd = value;
        return this;
    }

    /**
     * Gets the value of the txAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxAddtlDtls() {
        return txAddtlDtls;
    }

    /**
     * Sets the value of the txAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionDetails114 setTxAddtlDtls(String value) {
        this.txAddtlDtls = value;
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
