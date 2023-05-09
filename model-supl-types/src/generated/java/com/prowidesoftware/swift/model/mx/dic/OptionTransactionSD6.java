
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
 * Provides additional information regarding corporate action movement option details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionTransactionSD6", propOrder = {
    "plcAndNm",
    "txId",
    "txSeqNb",
    "txIdDt",
    "txIdQty",
    "txIdOvrsbcptQty",
    "accptdQty",
    "uaccptdQty",
    "entitldAmt",
    "entitldQty",
    "entitldOvrsbcptQty",
    "sbcptAmt",
    "ovrsbcptAmt",
    "cshInLieuOfShr",
    "cstmrRefId",
    "agtNtrdQty",
    "instrCmnts",
    "adjstdSbcptAmt",
    "rfnddSbcptAmt"
})
public class OptionTransactionSD6 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "TxSeqNb")
    protected String txSeqNb;
    @XmlElement(name = "TxIdDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime txIdDt;
    @XmlElement(name = "TxIdQty", required = true)
    protected FinancialInstrumentQuantity15Choice txIdQty;
    @XmlElement(name = "TxIdOvrsbcptQty")
    protected FinancialInstrumentQuantity15Choice txIdOvrsbcptQty;
    @XmlElement(name = "AccptdQty")
    protected FinancialInstrumentQuantity15Choice accptdQty;
    @XmlElement(name = "UaccptdQty")
    protected FinancialInstrumentQuantity15Choice uaccptdQty;
    @XmlElement(name = "EntitldAmt")
    protected RestrictedFINActiveCurrencyAndAmount entitldAmt;
    @XmlElement(name = "EntitldQty")
    protected FinancialInstrumentQuantity15Choice entitldQty;
    @XmlElement(name = "EntitldOvrsbcptQty")
    protected FinancialInstrumentQuantity15Choice entitldOvrsbcptQty;
    @XmlElement(name = "SbcptAmt")
    protected RestrictedFINActiveCurrencyAndAmount sbcptAmt;
    @XmlElement(name = "OvrsbcptAmt")
    protected RestrictedFINActiveCurrencyAndAmount ovrsbcptAmt;
    @XmlElement(name = "CshInLieuOfShr")
    protected RestrictedFINActiveCurrencyAndAmount cshInLieuOfShr;
    @XmlElement(name = "CstmrRefId")
    protected String cstmrRefId;
    @XmlElement(name = "AgtNtrdQty")
    protected FinancialInstrumentQuantity15Choice agtNtrdQty;
    @XmlElement(name = "InstrCmnts")
    protected String instrCmnts;
    @XmlElement(name = "AdjstdSbcptAmt")
    protected RestrictedFINActiveCurrencyAndAmount adjstdSbcptAmt;
    @XmlElement(name = "RfnddSbcptAmt")
    protected RestrictedFINActiveCurrencyAndAmount rfnddSbcptAmt;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionTransactionSD6 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionTransactionSD6 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the txSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSeqNb() {
        return txSeqNb;
    }

    /**
     * Sets the value of the txSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionTransactionSD6 setTxSeqNb(String value) {
        this.txSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the txIdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTxIdDt() {
        return txIdDt;
    }

    /**
     * Sets the value of the txIdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionTransactionSD6 setTxIdDt(OffsetDateTime value) {
        this.txIdDt = value;
        return this;
    }

    /**
     * Gets the value of the txIdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getTxIdQty() {
        return txIdQty;
    }

    /**
     * Sets the value of the txIdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public OptionTransactionSD6 setTxIdQty(FinancialInstrumentQuantity15Choice value) {
        this.txIdQty = value;
        return this;
    }

    /**
     * Gets the value of the txIdOvrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getTxIdOvrsbcptQty() {
        return txIdOvrsbcptQty;
    }

    /**
     * Sets the value of the txIdOvrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public OptionTransactionSD6 setTxIdOvrsbcptQty(FinancialInstrumentQuantity15Choice value) {
        this.txIdOvrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the accptdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getAccptdQty() {
        return accptdQty;
    }

    /**
     * Sets the value of the accptdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public OptionTransactionSD6 setAccptdQty(FinancialInstrumentQuantity15Choice value) {
        this.accptdQty = value;
        return this;
    }

    /**
     * Gets the value of the uaccptdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getUaccptdQty() {
        return uaccptdQty;
    }

    /**
     * Sets the value of the uaccptdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public OptionTransactionSD6 setUaccptdQty(FinancialInstrumentQuantity15Choice value) {
        this.uaccptdQty = value;
        return this;
    }

    /**
     * Gets the value of the entitldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getEntitldAmt() {
        return entitldAmt;
    }

    /**
     * Sets the value of the entitldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public OptionTransactionSD6 setEntitldAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.entitldAmt = value;
        return this;
    }

    /**
     * Gets the value of the entitldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getEntitldQty() {
        return entitldQty;
    }

    /**
     * Sets the value of the entitldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public OptionTransactionSD6 setEntitldQty(FinancialInstrumentQuantity15Choice value) {
        this.entitldQty = value;
        return this;
    }

    /**
     * Gets the value of the entitldOvrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getEntitldOvrsbcptQty() {
        return entitldOvrsbcptQty;
    }

    /**
     * Sets the value of the entitldOvrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public OptionTransactionSD6 setEntitldOvrsbcptQty(FinancialInstrumentQuantity15Choice value) {
        this.entitldOvrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the sbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getSbcptAmt() {
        return sbcptAmt;
    }

    /**
     * Sets the value of the sbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public OptionTransactionSD6 setSbcptAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.sbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the ovrsbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getOvrsbcptAmt() {
        return ovrsbcptAmt;
    }

    /**
     * Sets the value of the ovrsbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public OptionTransactionSD6 setOvrsbcptAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.ovrsbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshInLieuOfShr property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getCshInLieuOfShr() {
        return cshInLieuOfShr;
    }

    /**
     * Sets the value of the cshInLieuOfShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public OptionTransactionSD6 setCshInLieuOfShr(RestrictedFINActiveCurrencyAndAmount value) {
        this.cshInLieuOfShr = value;
        return this;
    }

    /**
     * Gets the value of the cstmrRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrRefId() {
        return cstmrRefId;
    }

    /**
     * Sets the value of the cstmrRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionTransactionSD6 setCstmrRefId(String value) {
        this.cstmrRefId = value;
        return this;
    }

    /**
     * Gets the value of the agtNtrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getAgtNtrdQty() {
        return agtNtrdQty;
    }

    /**
     * Sets the value of the agtNtrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public OptionTransactionSD6 setAgtNtrdQty(FinancialInstrumentQuantity15Choice value) {
        this.agtNtrdQty = value;
        return this;
    }

    /**
     * Gets the value of the instrCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrCmnts() {
        return instrCmnts;
    }

    /**
     * Sets the value of the instrCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionTransactionSD6 setInstrCmnts(String value) {
        this.instrCmnts = value;
        return this;
    }

    /**
     * Gets the value of the adjstdSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getAdjstdSbcptAmt() {
        return adjstdSbcptAmt;
    }

    /**
     * Sets the value of the adjstdSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public OptionTransactionSD6 setAdjstdSbcptAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.adjstdSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the rfnddSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRfnddSbcptAmt() {
        return rfnddSbcptAmt;
    }

    /**
     * Sets the value of the rfnddSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public OptionTransactionSD6 setRfnddSbcptAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.rfnddSbcptAmt = value;
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
