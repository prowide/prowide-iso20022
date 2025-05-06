
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
 * Provides details about the settlement obligation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementObligation9", propOrder = {
    "sttlmOblgtnId",
    "finInstrmId",
    "intnddSttlmDt",
    "qty",
    "sttlmAmt",
    "plcOfTrad",
    "tradDt",
    "tradgCpcty",
    "clrAcctTp",
    "sfkpgPlc",
    "sfkpgAcct",
    "sctiesMvmntTp",
    "pmt",
    "sttlmPties",
    "addtlSttlmOblgtnDtls"
})
public class SettlementObligation9 {

    @XmlElement(name = "SttlmOblgtnId", required = true)
    protected String sttlmOblgtnId;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification48 finInstrmId;
    @XmlElement(name = "IntnddSttlmDt", required = true)
    protected DateFormat65Choice intnddSttlmDt;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection27 sttlmAmt;
    @XmlElement(name = "PlcOfTrad", required = true)
    protected MarketIdentification84 plcOfTrad;
    @XmlElement(name = "TradDt")
    protected TradeDate3Choice tradDt;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity5Code tradgCpcty;
    @XmlElement(name = "ClrAcctTp")
    @XmlSchemaType(name = "string")
    protected ClearingAccountType1Code clrAcctTp;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat43Choice sfkpgPlc;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "SctiesMvmntTp")
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SttlmPties")
    protected SettlementParties38Choice sttlmPties;
    @XmlElement(name = "AddtlSttlmOblgtnDtls")
    protected List<SettlementObligation10> addtlSttlmOblgtnDtls;

    /**
     * Gets the value of the sttlmOblgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmOblgtnId() {
        return sttlmOblgtnId;
    }

    /**
     * Sets the value of the sttlmOblgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementObligation9 setSttlmOblgtnId(String value) {
        this.sttlmOblgtnId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification48 }
     *     
     */
    public SecurityIdentification48 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification48 }
     *     
     */
    public SettlementObligation9 setFinInstrmId(SecurityIdentification48 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the intnddSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat65Choice }
     *     
     */
    public DateFormat65Choice getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Sets the value of the intnddSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat65Choice }
     *     
     */
    public SettlementObligation9 setIntnddSttlmDt(DateFormat65Choice value) {
        this.intnddSttlmDt = value;
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
    public SettlementObligation9 setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
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
    public SettlementObligation9 setSttlmAmt(AmountAndDirection27 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification84 }
     *     
     */
    public MarketIdentification84 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification84 }
     *     
     */
    public SettlementObligation9 setPlcOfTrad(MarketIdentification84 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate3Choice }
     *     
     */
    public TradeDate3Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate3Choice }
     *     
     */
    public SettlementObligation9 setTradDt(TradeDate3Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public TradingCapacity5Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public SettlementObligation9 setTradgCpcty(TradingCapacity5Code value) {
        this.tradgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the clrAcctTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingAccountType1Code }
     *     
     */
    public ClearingAccountType1Code getClrAcctTp() {
        return clrAcctTp;
    }

    /**
     * Sets the value of the clrAcctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingAccountType1Code }
     *     
     */
    public SettlementObligation9 setClrAcctTp(ClearingAccountType1Code value) {
        this.clrAcctTp = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat43Choice }
     *     
     */
    public SafekeepingPlaceFormat43Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat43Choice }
     *     
     */
    public SettlementObligation9 setSfkpgPlc(SafekeepingPlaceFormat43Choice value) {
        this.sfkpgPlc = value;
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
    public SettlementObligation9 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
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
    public SettlementObligation9 setSctiesMvmntTp(ReceiveDelivery1Code value) {
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
    public SettlementObligation9 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties38Choice }
     *     
     */
    public SettlementParties38Choice getSttlmPties() {
        return sttlmPties;
    }

    /**
     * Sets the value of the sttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties38Choice }
     *     
     */
    public SettlementObligation9 setSttlmPties(SettlementParties38Choice value) {
        this.sttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the addtlSttlmOblgtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSttlmOblgtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSttlmOblgtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementObligation10 }
     * 
     * 
     * @return
     *     The value of the addtlSttlmOblgtnDtls property.
     */
    public List<SettlementObligation10> getAddtlSttlmOblgtnDtls() {
        if (addtlSttlmOblgtnDtls == null) {
            addtlSttlmOblgtnDtls = new ArrayList<>();
        }
        return this.addtlSttlmOblgtnDtls;
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
     * Adds a new item to the addtlSttlmOblgtnDtls list.
     * @see #getAddtlSttlmOblgtnDtls()
     * 
     */
    public SettlementObligation9 addAddtlSttlmOblgtnDtls(SettlementObligation10 addtlSttlmOblgtnDtls) {
        getAddtlSttlmOblgtnDtls().add(addtlSttlmOblgtnDtls);
        return this;
    }

}
