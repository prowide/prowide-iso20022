
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "TransactionDetails104", propOrder = {
    "txActvty",
    "sttlmTxOrCorpActnEvtTp",
    "sctiesMvmntTp",
    "pmt",
    "sttlmParams",
    "plcOfTrad",
    "sfkpgPlc",
    "plcOfClr",
    "finInstrmId",
    "pstngQty",
    "pstngAmt",
    "tradDt",
    "xpctdSttlmDt",
    "sttlmDt",
    "lateDlvryDt",
    "xpctdValDt",
    "ackdStsTmStmp",
    "mtchdStsTmStmp",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "txAddtlDtls",
    "splmtryData"
})
public class TransactionDetails104 {

    @XmlElement(name = "TxActvty", required = true)
    protected TransactionActivity3Choice txActvty;
    @XmlElement(name = "SttlmTxOrCorpActnEvtTp")
    protected SettlementOrCorporateActionEvent23Choice sttlmTxOrCorpActnEvtTp;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails149 sttlmParams;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1 plcOfTrad;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace1 sfkpgPlc;
    @XmlElement(name = "PlcOfClr")
    protected PlaceOfClearingIdentification1 plcOfClr;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "PstngQty", required = true)
    protected Quantity6Choice pstngQty;
    @XmlElement(name = "PstngAmt")
    protected AmountAndDirection51 pstngAmt;
    @XmlElement(name = "TradDt")
    protected TradeDate8Choice tradDt;
    @XmlElement(name = "XpctdSttlmDt")
    protected DateAndDateTime2Choice xpctdSttlmDt;
    @XmlElement(name = "SttlmDt", required = true)
    protected SettlementDate19Choice sttlmDt;
    @XmlElement(name = "LateDlvryDt")
    protected DateAndDateTime2Choice lateDlvryDt;
    @XmlElement(name = "XpctdValDt")
    protected DateAndDateTime2Choice xpctdValDt;
    @XmlElement(name = "AckdStsTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ackdStsTmStmp;
    @XmlElement(name = "MtchdStsTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mtchdStsTmStmp;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties40 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties40 rcvgSttlmPties;
    @XmlElement(name = "TxAddtlDtls")
    protected String txAddtlDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public TransactionDetails104 setTxActvty(TransactionActivity3Choice value) {
        this.txActvty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTxOrCorpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementOrCorporateActionEvent23Choice }
     *     
     */
    public SettlementOrCorporateActionEvent23Choice getSttlmTxOrCorpActnEvtTp() {
        return sttlmTxOrCorpActnEvtTp;
    }

    /**
     * Sets the value of the sttlmTxOrCorpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementOrCorporateActionEvent23Choice }
     *     
     */
    public TransactionDetails104 setSttlmTxOrCorpActnEvtTp(SettlementOrCorporateActionEvent23Choice value) {
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
    public TransactionDetails104 setSctiesMvmntTp(ReceiveDelivery1Code value) {
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
    public TransactionDetails104 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails149 }
     *     
     */
    public SettlementDetails149 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails149 }
     *     
     */
    public TransactionDetails104 setSttlmParams(SettlementDetails149 value) {
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
    public TransactionDetails104 setPlcOfTrad(PlaceOfTradeIdentification1 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace1 }
     *     
     */
    public SafeKeepingPlace1 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace1 }
     *     
     */
    public TransactionDetails104 setSfkpgPlc(SafeKeepingPlace1 value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the plcOfClr property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfClearingIdentification1 }
     *     
     */
    public PlaceOfClearingIdentification1 getPlcOfClr() {
        return plcOfClr;
    }

    /**
     * Sets the value of the plcOfClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfClearingIdentification1 }
     *     
     */
    public TransactionDetails104 setPlcOfClr(PlaceOfClearingIdentification1 value) {
        this.plcOfClr = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public TransactionDetails104 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
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
    public TransactionDetails104 setPstngQty(Quantity6Choice value) {
        this.pstngQty = value;
        return this;
    }

    /**
     * Gets the value of the pstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection51 }
     *     
     */
    public AmountAndDirection51 getPstngAmt() {
        return pstngAmt;
    }

    /**
     * Sets the value of the pstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection51 }
     *     
     */
    public TransactionDetails104 setPstngAmt(AmountAndDirection51 value) {
        this.pstngAmt = value;
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
    public TransactionDetails104 setTradDt(TradeDate8Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getXpctdSttlmDt() {
        return xpctdSttlmDt;
    }

    /**
     * Sets the value of the xpctdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TransactionDetails104 setXpctdSttlmDt(DateAndDateTime2Choice value) {
        this.xpctdSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate19Choice }
     *     
     */
    public SettlementDate19Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate19Choice }
     *     
     */
    public TransactionDetails104 setSttlmDt(SettlementDate19Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the lateDlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getLateDlvryDt() {
        return lateDlvryDt;
    }

    /**
     * Sets the value of the lateDlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TransactionDetails104 setLateDlvryDt(DateAndDateTime2Choice value) {
        this.lateDlvryDt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdValDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getXpctdValDt() {
        return xpctdValDt;
    }

    /**
     * Sets the value of the xpctdValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TransactionDetails104 setXpctdValDt(DateAndDateTime2Choice value) {
        this.xpctdValDt = value;
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
    public XMLGregorianCalendar getAckdStsTmStmp() {
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
    public TransactionDetails104 setAckdStsTmStmp(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getMtchdStsTmStmp() {
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
    public TransactionDetails104 setMtchdStsTmStmp(XMLGregorianCalendar value) {
        this.mtchdStsTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties40 }
     *     
     */
    public SettlementParties40 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties40 }
     *     
     */
    public TransactionDetails104 setDlvrgSttlmPties(SettlementParties40 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties40 }
     *     
     */
    public SettlementParties40 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties40 }
     *     
     */
    public TransactionDetails104 setRcvgSttlmPties(SettlementParties40 value) {
        this.rcvgSttlmPties = value;
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
    public TransactionDetails104 setTxAddtlDtls(String value) {
        this.txAddtlDtls = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TransactionDetails104 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
