
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Context of the card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransactionContext2", propOrder = {
    "cardPres",
    "crdhldrPres",
    "lctnCtgy",
    "attndncCntxt",
    "txEnvt",
    "hstgCtgy",
    "txChanl",
    "cardDataNtryMd",
    "fllbckInd",
    "spprtdOptn",
    "spclConds",
    "rskInd"
})
public class CardTransactionContext2 {

    @XmlElement(name = "CardPres")
    protected Boolean cardPres;
    @XmlElement(name = "CrdhldrPres")
    protected Boolean crdhldrPres;
    @XmlElement(name = "LctnCtgy")
    @XmlSchemaType(name = "string")
    protected LocationCategory2Code lctnCtgy;
    @XmlElement(name = "AttndncCntxt")
    @XmlSchemaType(name = "string")
    protected AttendanceContext1Code attndncCntxt;
    @XmlElement(name = "TxEnvt")
    @XmlSchemaType(name = "string")
    protected TransactionEnvironment2Code txEnvt;
    @XmlElement(name = "HstgCtgy")
    @XmlSchemaType(name = "string")
    protected TransactionEnvironment3Code hstgCtgy;
    @XmlElement(name = "TxChanl")
    @XmlSchemaType(name = "string")
    protected TransactionChannel3Code txChanl;
    @XmlElement(name = "CardDataNtryMd", required = true)
    @XmlSchemaType(name = "string")
    protected CardDataReading2Code cardDataNtryMd;
    @XmlElement(name = "FllbckInd")
    @XmlSchemaType(name = "string")
    protected CardFallback1Code fllbckInd;
    @XmlElement(name = "SpprtdOptn")
    @XmlSchemaType(name = "string")
    protected List<SupportedPaymentOption1Code> spprtdOptn;
    @XmlElement(name = "SpclConds")
    protected List<CardTransactionCondition1> spclConds;
    @XmlElement(name = "RskInd")
    protected List<CardTransactionRiskIndicator1> rskInd;

    /**
     * Gets the value of the cardPres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardPres() {
        return cardPres;
    }

    /**
     * Sets the value of the cardPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardTransactionContext2 setCardPres(Boolean value) {
        this.cardPres = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrPres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrdhldrPres() {
        return crdhldrPres;
    }

    /**
     * Sets the value of the crdhldrPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardTransactionContext2 setCrdhldrPres(Boolean value) {
        this.crdhldrPres = value;
        return this;
    }

    /**
     * Gets the value of the lctnCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCategory2Code }
     *     
     */
    public LocationCategory2Code getLctnCtgy() {
        return lctnCtgy;
    }

    /**
     * Sets the value of the lctnCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCategory2Code }
     *     
     */
    public CardTransactionContext2 setLctnCtgy(LocationCategory2Code value) {
        this.lctnCtgy = value;
        return this;
    }

    /**
     * Gets the value of the attndncCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public AttendanceContext1Code getAttndncCntxt() {
        return attndncCntxt;
    }

    /**
     * Sets the value of the attndncCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public CardTransactionContext2 setAttndncCntxt(AttendanceContext1Code value) {
        this.attndncCntxt = value;
        return this;
    }

    /**
     * Gets the value of the txEnvt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEnvironment2Code }
     *     
     */
    public TransactionEnvironment2Code getTxEnvt() {
        return txEnvt;
    }

    /**
     * Sets the value of the txEnvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEnvironment2Code }
     *     
     */
    public CardTransactionContext2 setTxEnvt(TransactionEnvironment2Code value) {
        this.txEnvt = value;
        return this;
    }

    /**
     * Gets the value of the hstgCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEnvironment3Code }
     *     
     */
    public TransactionEnvironment3Code getHstgCtgy() {
        return hstgCtgy;
    }

    /**
     * Sets the value of the hstgCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEnvironment3Code }
     *     
     */
    public CardTransactionContext2 setHstgCtgy(TransactionEnvironment3Code value) {
        this.hstgCtgy = value;
        return this;
    }

    /**
     * Gets the value of the txChanl property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionChannel3Code }
     *     
     */
    public TransactionChannel3Code getTxChanl() {
        return txChanl;
    }

    /**
     * Sets the value of the txChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionChannel3Code }
     *     
     */
    public CardTransactionContext2 setTxChanl(TransactionChannel3Code value) {
        this.txChanl = value;
        return this;
    }

    /**
     * Gets the value of the cardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading2Code }
     *     
     */
    public CardDataReading2Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading2Code }
     *     
     */
    public CardTransactionContext2 setCardDataNtryMd(CardDataReading2Code value) {
        this.cardDataNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the fllbckInd property.
     * 
     * @return
     *     possible object is
     *     {@link CardFallback1Code }
     *     
     */
    public CardFallback1Code getFllbckInd() {
        return fllbckInd;
    }

    /**
     * Sets the value of the fllbckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardFallback1Code }
     *     
     */
    public CardTransactionContext2 setFllbckInd(CardFallback1Code value) {
        this.fllbckInd = value;
        return this;
    }

    /**
     * Gets the value of the spprtdOptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spprtdOptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpprtdOptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedPaymentOption1Code }
     * 
     * 
     */
    public List<SupportedPaymentOption1Code> getSpprtdOptn() {
        if (spprtdOptn == null) {
            spprtdOptn = new ArrayList<SupportedPaymentOption1Code>();
        }
        return this.spprtdOptn;
    }

    /**
     * Gets the value of the spclConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spclConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpclConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardTransactionCondition1 }
     * 
     * 
     */
    public List<CardTransactionCondition1> getSpclConds() {
        if (spclConds == null) {
            spclConds = new ArrayList<CardTransactionCondition1>();
        }
        return this.spclConds;
    }

    /**
     * Gets the value of the rskInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rskInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRskInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardTransactionRiskIndicator1 }
     * 
     * 
     */
    public List<CardTransactionRiskIndicator1> getRskInd() {
        if (rskInd == null) {
            rskInd = new ArrayList<CardTransactionRiskIndicator1>();
        }
        return this.rskInd;
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
     * Adds a new item to the spprtdOptn list.
     * @see #getSpprtdOptn()
     * 
     */
    public CardTransactionContext2 addSpprtdOptn(SupportedPaymentOption1Code spprtdOptn) {
        getSpprtdOptn().add(spprtdOptn);
        return this;
    }

    /**
     * Adds a new item to the spclConds list.
     * @see #getSpclConds()
     * 
     */
    public CardTransactionContext2 addSpclConds(CardTransactionCondition1 spclConds) {
        getSpclConds().add(spclConds);
        return this;
    }

    /**
     * Adds a new item to the rskInd list.
     * @see #getRskInd()
     * 
     */
    public CardTransactionContext2 addRskInd(CardTransactionRiskIndicator1 rskInd) {
        getRskInd().add(rskInd);
        return this;
    }

}
