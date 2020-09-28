
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details about the settlement obligation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementObligation6", propOrder = {
    "csdTxId",
    "cntrlCtrPtyTxId",
    "dlvryAcct",
    "sfkpgAcct",
    "clrSgmt",
    "nonClrMmb",
    "intnddSttlmDt",
    "finInstrmId",
    "tradDt",
    "dealPric",
    "qty",
    "dpstry",
    "rmngQtyToBeSttld",
    "sttlmAmt",
    "rmngAmtToBeSttld"
})
public class SettlementObligation6 {

    @XmlElement(name = "CSDTxId")
    protected String csdTxId;
    @XmlElement(name = "CntrlCtrPtyTxId")
    protected String cntrlCtrPtyTxId;
    @XmlElement(name = "DlvryAcct")
    protected SecuritiesAccount19 dlvryAcct;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification35Choice clrSgmt;
    @XmlElement(name = "NonClrMmb")
    protected PartyIdentificationAndAccount31 nonClrMmb;
    @XmlElement(name = "IntnddSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intnddSttlmDt;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "TradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "DealPric")
    protected Price4 dealPric;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "Dpstry")
    protected PartyIdentification34Choice dpstry;
    @XmlElement(name = "RmngQtyToBeSttld")
    protected FinancialInstrumentQuantity1Choice rmngQtyToBeSttld;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection27 sttlmAmt;
    @XmlElement(name = "RmngAmtToBeSttld")
    protected AmountAndDirection27 rmngAmtToBeSttld;

    /**
     * Gets the value of the csdTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSDTxId() {
        return csdTxId;
    }

    /**
     * Sets the value of the csdTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementObligation6 setCSDTxId(String value) {
        this.csdTxId = value;
        return this;
    }

    /**
     * Gets the value of the cntrlCtrPtyTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrlCtrPtyTxId() {
        return cntrlCtrPtyTxId;
    }

    /**
     * Sets the value of the cntrlCtrPtyTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementObligation6 setCntrlCtrPtyTxId(String value) {
        this.cntrlCtrPtyTxId = value;
        return this;
    }

    /**
     * Gets the value of the dlvryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getDlvryAcct() {
        return dlvryAcct;
    }

    /**
     * Sets the value of the dlvryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SettlementObligation6 setDlvryAcct(SecuritiesAccount19 value) {
        this.dlvryAcct = value;
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
    public SettlementObligation6 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the clrSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Sets the value of the clrSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public SettlementObligation6 setClrSgmt(PartyIdentification35Choice value) {
        this.clrSgmt = value;
        return this;
    }

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public PartyIdentificationAndAccount31 getNonClrMmb() {
        return nonClrMmb;
    }

    /**
     * Sets the value of the nonClrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public SettlementObligation6 setNonClrMmb(PartyIdentificationAndAccount31 value) {
        this.nonClrMmb = value;
        return this;
    }

    /**
     * Gets the value of the intnddSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Sets the value of the intnddSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SettlementObligation6 setIntnddSttlmDt(XMLGregorianCalendar value) {
        this.intnddSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SettlementObligation6 setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SettlementObligation6 setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public SettlementObligation6 setDealPric(Price4 value) {
        this.dealPric = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public SettlementObligation6 setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public PartyIdentification34Choice getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public SettlementObligation6 setDpstry(PartyIdentification34Choice value) {
        this.dpstry = value;
        return this;
    }

    /**
     * Gets the value of the rmngQtyToBeSttld property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getRmngQtyToBeSttld() {
        return rmngQtyToBeSttld;
    }

    /**
     * Sets the value of the rmngQtyToBeSttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public SettlementObligation6 setRmngQtyToBeSttld(FinancialInstrumentQuantity1Choice value) {
        this.rmngQtyToBeSttld = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public AmountAndDirection27 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public SettlementObligation6 setSttlmAmt(AmountAndDirection27 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the rmngAmtToBeSttld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public AmountAndDirection27 getRmngAmtToBeSttld() {
        return rmngAmtToBeSttld;
    }

    /**
     * Sets the value of the rmngAmtToBeSttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public SettlementObligation6 setRmngAmtToBeSttld(AmountAndDirection27 value) {
        this.rmngAmtToBeSttld = value;
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
