
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "AmountsAndValueDate6", propOrder = {
    "tradgSdBuyAmt",
    "tradgSdSellAmt",
    "sttlmDt"
})
public class AmountsAndValueDate6 {

    @XmlElement(name = "TradgSdBuyAmt", required = true)
    protected CurrencyOrDigitalTokenAmount1Choice tradgSdBuyAmt;
    @XmlElement(name = "TradgSdSellAmt", required = true)
    protected CurrencyOrDigitalTokenAmount1Choice tradgSdSellAmt;
    @XmlElement(name = "SttlmDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;

    /**
     * Gets the value of the tradgSdBuyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyOrDigitalTokenAmount1Choice }
     *     
     */
    public CurrencyOrDigitalTokenAmount1Choice getTradgSdBuyAmt() {
        return tradgSdBuyAmt;
    }

    /**
     * Sets the value of the tradgSdBuyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyOrDigitalTokenAmount1Choice }
     *     
     */
    public AmountsAndValueDate6 setTradgSdBuyAmt(CurrencyOrDigitalTokenAmount1Choice value) {
        this.tradgSdBuyAmt = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdSellAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyOrDigitalTokenAmount1Choice }
     *     
     */
    public CurrencyOrDigitalTokenAmount1Choice getTradgSdSellAmt() {
        return tradgSdSellAmt;
    }

    /**
     * Sets the value of the tradgSdSellAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyOrDigitalTokenAmount1Choice }
     *     
     */
    public AmountsAndValueDate6 setTradgSdSellAmt(CurrencyOrDigitalTokenAmount1Choice value) {
        this.tradgSdSellAmt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public AmountsAndValueDate6 setSttlmDt(XMLGregorianCalendar value) {
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
