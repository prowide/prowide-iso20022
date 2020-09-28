
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
 * Specifies the value date and the amounts traded in a foreign exchange transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountsAndValueDate1", propOrder = {
    "tradgSdBuyAmt",
    "tradgSdSellAmt",
    "sttlmDt"
})
public class AmountsAndValueDate1 {

    @XmlElement(name = "TradgSdBuyAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount tradgSdBuyAmt;
    @XmlElement(name = "TradgSdSellAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount tradgSdSellAmt;
    @XmlElement(name = "SttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;

    /**
     * Gets the value of the tradgSdBuyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTradgSdBuyAmt() {
        return tradgSdBuyAmt;
    }

    /**
     * Sets the value of the tradgSdBuyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public AmountsAndValueDate1 setTradgSdBuyAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.tradgSdBuyAmt = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdSellAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTradgSdSellAmt() {
        return tradgSdSellAmt;
    }

    /**
     * Sets the value of the tradgSdSellAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public AmountsAndValueDate1 setTradgSdSellAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.tradgSdSellAmt = value;
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
    public AmountsAndValueDate1 setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
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
