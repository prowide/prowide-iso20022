
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
 * Provides additional information regarding corporate action movement option details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionTransactionDetailsSD2", propOrder = {
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
    "rfnddOvrsbcptAmt",
    "sbcptAmt",
    "ovrsbcptAmt",
    "fnlSbcptAdjstmntAmt",
    "cshInLieuOfShr",
    "cstmrRefId",
    "agtNtrdQty"
})
public class OptionTransactionDetailsSD2 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "TxSeqNb")
    protected String txSeqNb;
    @XmlElement(name = "TxIdDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txIdDt;
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
    @XmlElement(name = "RfnddOvrsbcptAmt")
    protected RestrictedFINActiveCurrencyAndAmount rfnddOvrsbcptAmt;
    @XmlElement(name = "SbcptAmt")
    protected RestrictedFINActiveCurrencyAndAmount sbcptAmt;
    @XmlElement(name = "OvrsbcptAmt")
    protected RestrictedFINActiveCurrencyAndAmount ovrsbcptAmt;
    @XmlElement(name = "FnlSbcptAdjstmntAmt")
    protected RestrictedFINActiveCurrencyAndAmount fnlSbcptAdjstmntAmt;
    @XmlElement(name = "CshInLieuOfShr")
    protected RestrictedFINActiveCurrencyAndAmount cshInLieuOfShr;
    @XmlElement(name = "CstmrRefId")
    protected String cstmrRefId;
    @XmlElement(name = "AgtNtrdQty")
    protected FinancialInstrumentQuantity15Choice agtNtrdQty;

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
    public OptionTransactionDetailsSD2 setPlcAndNm(String value) {
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
    public OptionTransactionDetailsSD2 setTxId(String value) {
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
    public OptionTransactionDetailsSD2 setTxSeqNb(String value) {
        this.txSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the txIdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxIdDt() {
        return txIdDt;
    }

    /**
     * Sets the value of the txIdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public OptionTransactionDetailsSD2 setTxIdDt(XMLGregorianCalendar value) {
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
    public OptionTransactionDetailsSD2 setTxIdQty(FinancialInstrumentQuantity15Choice value) {
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
    public OptionTransactionDetailsSD2 setTxIdOvrsbcptQty(FinancialInstrumentQuantity15Choice value) {
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
    public OptionTransactionDetailsSD2 setAccptdQty(FinancialInstrumentQuantity15Choice value) {
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
    public OptionTransactionDetailsSD2 setUaccptdQty(FinancialInstrumentQuantity15Choice value) {
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
    public OptionTransactionDetailsSD2 setEntitldAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public OptionTransactionDetailsSD2 setEntitldQty(FinancialInstrumentQuantity15Choice value) {
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
    public OptionTransactionDetailsSD2 setEntitldOvrsbcptQty(FinancialInstrumentQuantity15Choice value) {
        this.entitldOvrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the rfnddOvrsbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRfnddOvrsbcptAmt() {
        return rfnddOvrsbcptAmt;
    }

    /**
     * Sets the value of the rfnddOvrsbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public OptionTransactionDetailsSD2 setRfnddOvrsbcptAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.rfnddOvrsbcptAmt = value;
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
    public OptionTransactionDetailsSD2 setSbcptAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public OptionTransactionDetailsSD2 setOvrsbcptAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.ovrsbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the fnlSbcptAdjstmntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getFnlSbcptAdjstmntAmt() {
        return fnlSbcptAdjstmntAmt;
    }

    /**
     * Sets the value of the fnlSbcptAdjstmntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public OptionTransactionDetailsSD2 setFnlSbcptAdjstmntAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.fnlSbcptAdjstmntAmt = value;
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
    public OptionTransactionDetailsSD2 setCshInLieuOfShr(RestrictedFINActiveCurrencyAndAmount value) {
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
    public OptionTransactionDetailsSD2 setCstmrRefId(String value) {
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
    public OptionTransactionDetailsSD2 setAgtNtrdQty(FinancialInstrumentQuantity15Choice value) {
        this.agtNtrdQty = value;
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
