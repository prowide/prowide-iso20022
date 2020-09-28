
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Details of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDetails1", propOrder = {
    "tradRef",
    "assoctdTradRef",
    "plcOfTrad",
    "tradDtTm",
    "finInstrmDtls",
    "sd",
    "txRptMrkr",
    "ctrPty",
    "clnt",
    "cpcty",
    "exctdTradPric",
    "exctdTradQty",
    "sttlmAmt",
    "sttlmDt",
    "prxyHldr",
    "addtlInf"
})
public class TransactionDetails1 {

    @XmlElement(name = "TradRef", required = true)
    protected String tradRef;
    @XmlElement(name = "AssoctdTradRef")
    protected List<String> assoctdTradRef;
    @XmlElement(name = "PlcOfTrad", required = true)
    protected PlaceOfTradeIdentification2Choice plcOfTrad;
    @XmlElement(name = "TradDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradDtTm;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument14 finInstrmDtls;
    @XmlElement(name = "Sd", required = true)
    @XmlSchemaType(name = "string")
    protected OrderDriverCode sd;
    @XmlElement(name = "TxRptMrkr")
    protected List<PartyIdentification24Choice> txRptMrkr;
    @XmlElement(name = "CtrPty", required = true)
    protected PartyIdentification11Choice ctrPty;
    @XmlElement(name = "Clnt")
    protected PartyIdentification23 clnt;
    @XmlElement(name = "Cpcty", required = true)
    @XmlSchemaType(name = "string")
    protected TradingCapacity3Code cpcty;
    @XmlElement(name = "ExctdTradPric", required = true)
    protected PriceRateOrAmountChoice exctdTradPric;
    @XmlElement(name = "ExctdTradQty", required = true)
    protected UnitOrFaceAmountChoice exctdTradQty;
    @XmlElement(name = "SttlmAmt")
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "SttlmDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sttlmDt;
    @XmlElement(name = "PrxyHldr")
    protected PartyIdentification2Choice prxyHldr;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the tradRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradRef() {
        return tradRef;
    }

    /**
     * Sets the value of the tradRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionDetails1 setTradRef(String value) {
        this.tradRef = value;
        return this;
    }

    /**
     * Gets the value of the assoctdTradRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assoctdTradRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssoctdTradRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssoctdTradRef() {
        if (assoctdTradRef == null) {
            assoctdTradRef = new ArrayList<String>();
        }
        return this.assoctdTradRef;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification2Choice }
     *     
     */
    public PlaceOfTradeIdentification2Choice getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification2Choice }
     *     
     */
    public TransactionDetails1 setPlcOfTrad(PlaceOfTradeIdentification2Choice value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the tradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDtTm() {
        return tradDtTm;
    }

    /**
     * Sets the value of the tradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TransactionDetails1 setTradDtTm(XMLGregorianCalendar value) {
        this.tradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument14 }
     *     
     */
    public FinancialInstrument14 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument14 }
     *     
     */
    public TransactionDetails1 setFinInstrmDtls(FinancialInstrument14 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDriverCode }
     *     
     */
    public OrderDriverCode getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDriverCode }
     *     
     */
    public TransactionDetails1 setSd(OrderDriverCode value) {
        this.sd = value;
        return this;
    }

    /**
     * Gets the value of the txRptMrkr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txRptMrkr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxRptMrkr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification24Choice }
     * 
     * 
     */
    public List<PartyIdentification24Choice> getTxRptMrkr() {
        if (txRptMrkr == null) {
            txRptMrkr = new ArrayList<PartyIdentification24Choice>();
        }
        return this.txRptMrkr;
    }

    /**
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification11Choice }
     *     
     */
    public PartyIdentification11Choice getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification11Choice }
     *     
     */
    public TransactionDetails1 setCtrPty(PartyIdentification11Choice value) {
        this.ctrPty = value;
        return this;
    }

    /**
     * Gets the value of the clnt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification23 }
     *     
     */
    public PartyIdentification23 getClnt() {
        return clnt;
    }

    /**
     * Sets the value of the clnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification23 }
     *     
     */
    public TransactionDetails1 setClnt(PartyIdentification23 value) {
        this.clnt = value;
        return this;
    }

    /**
     * Gets the value of the cpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity3Code }
     *     
     */
    public TradingCapacity3Code getCpcty() {
        return cpcty;
    }

    /**
     * Sets the value of the cpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity3Code }
     *     
     */
    public TransactionDetails1 setCpcty(TradingCapacity3Code value) {
        this.cpcty = value;
        return this;
    }

    /**
     * Gets the value of the exctdTradPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmountChoice }
     *     
     */
    public PriceRateOrAmountChoice getExctdTradPric() {
        return exctdTradPric;
    }

    /**
     * Sets the value of the exctdTradPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmountChoice }
     *     
     */
    public TransactionDetails1 setExctdTradPric(PriceRateOrAmountChoice value) {
        this.exctdTradPric = value;
        return this;
    }

    /**
     * Gets the value of the exctdTradQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmountChoice }
     *     
     */
    public UnitOrFaceAmountChoice getExctdTradQty() {
        return exctdTradQty;
    }

    /**
     * Sets the value of the exctdTradQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmountChoice }
     *     
     */
    public TransactionDetails1 setExctdTradQty(UnitOrFaceAmountChoice value) {
        this.exctdTradQty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TransactionDetails1 setSttlmAmt(ActiveCurrencyAndAmount value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TransactionDetails1 setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the prxyHldr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getPrxyHldr() {
        return prxyHldr;
    }

    /**
     * Sets the value of the prxyHldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public TransactionDetails1 setPrxyHldr(PartyIdentification2Choice value) {
        this.prxyHldr = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionDetails1 setAddtlInf(String value) {
        this.addtlInf = value;
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
     * Adds a new item to the assoctdTradRef list.
     * @see #getAssoctdTradRef()
     * 
     */
    public TransactionDetails1 addAssoctdTradRef(String assoctdTradRef) {
        getAssoctdTradRef().add(assoctdTradRef);
        return this;
    }

    /**
     * Adds a new item to the txRptMrkr list.
     * @see #getTxRptMrkr()
     * 
     */
    public TransactionDetails1 addTxRptMrkr(PartyIdentification24Choice txRptMrkr) {
        getTxRptMrkr().add(txRptMrkr);
        return this;
    }

}
