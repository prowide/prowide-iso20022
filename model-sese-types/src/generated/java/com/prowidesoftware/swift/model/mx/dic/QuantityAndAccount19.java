
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details on the quantity, account and other related information involved in a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityAndAccount19", propOrder = {
    "sttldQty",
    "prevslySttldQty",
    "rmngToBeSttldQty",
    "prevslySttldAmt",
    "rmngToBeSttldAmt",
    "acctOwnr",
    "sfkpgAcct",
    "cshAcct",
    "sfkpgPlc"
})
public class QuantityAndAccount19 {

    @XmlElement(name = "SttldQty", required = true)
    protected Quantity10Choice sttldQty;
    @XmlElement(name = "PrevslySttldQty")
    protected FinancialInstrumentQuantity15Choice prevslySttldQty;
    @XmlElement(name = "RmngToBeSttldQty")
    protected FinancialInstrumentQuantity15Choice rmngToBeSttldQty;
    @XmlElement(name = "PrevslySttldAmt")
    protected AmountAndDirection19 prevslySttldAmt;
    @XmlElement(name = "RmngToBeSttldAmt")
    protected AmountAndDirection19 rmngToBeSttldAmt;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification51Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount17 sfkpgAcct;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification6Choice cshAcct;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat4Choice sfkpgPlc;

    /**
     * Gets the value of the sttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity10Choice }
     *     
     */
    public Quantity10Choice getSttldQty() {
        return sttldQty;
    }

    /**
     * Sets the value of the sttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity10Choice }
     *     
     */
    public QuantityAndAccount19 setSttldQty(Quantity10Choice value) {
        this.sttldQty = value;
        return this;
    }

    /**
     * Gets the value of the prevslySttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getPrevslySttldQty() {
        return prevslySttldQty;
    }

    /**
     * Sets the value of the prevslySttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public QuantityAndAccount19 setPrevslySttldQty(FinancialInstrumentQuantity15Choice value) {
        this.prevslySttldQty = value;
        return this;
    }

    /**
     * Gets the value of the rmngToBeSttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getRmngToBeSttldQty() {
        return rmngToBeSttldQty;
    }

    /**
     * Sets the value of the rmngToBeSttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public QuantityAndAccount19 setRmngToBeSttldQty(FinancialInstrumentQuantity15Choice value) {
        this.rmngToBeSttldQty = value;
        return this;
    }

    /**
     * Gets the value of the prevslySttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection19 }
     *     
     */
    public AmountAndDirection19 getPrevslySttldAmt() {
        return prevslySttldAmt;
    }

    /**
     * Sets the value of the prevslySttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection19 }
     *     
     */
    public QuantityAndAccount19 setPrevslySttldAmt(AmountAndDirection19 value) {
        this.prevslySttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the rmngToBeSttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection19 }
     *     
     */
    public AmountAndDirection19 getRmngToBeSttldAmt() {
        return rmngToBeSttldAmt;
    }

    /**
     * Sets the value of the rmngToBeSttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection19 }
     *     
     */
    public QuantityAndAccount19 setRmngToBeSttldAmt(AmountAndDirection19 value) {
        this.rmngToBeSttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification51Choice }
     *     
     */
    public PartyIdentification51Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification51Choice }
     *     
     */
    public QuantityAndAccount19 setAcctOwnr(PartyIdentification51Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount17 }
     *     
     */
    public SecuritiesAccount17 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount17 }
     *     
     */
    public QuantityAndAccount19 setSfkpgAcct(SecuritiesAccount17 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public QuantityAndAccount19 setCshAcct(CashAccountIdentification6Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat4Choice }
     *     
     */
    public SafekeepingPlaceFormat4Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat4Choice }
     *     
     */
    public QuantityAndAccount19 setSfkpgPlc(SafekeepingPlaceFormat4Choice value) {
        this.sfkpgPlc = value;
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
