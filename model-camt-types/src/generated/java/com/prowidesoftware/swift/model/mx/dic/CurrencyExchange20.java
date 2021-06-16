
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Information needed to process a currency exchange or conversion.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchange20", propOrder = {
    "xchgRate",
    "qtdCcy",
    "qtnDt",
    "lwLmt",
    "hghLmt"
})
public class CurrencyExchange20 {

    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;
    @XmlElement(name = "QtdCcy", required = true)
    protected String qtdCcy;
    @XmlElement(name = "QtnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar qtnDt;
    @XmlElement(name = "LwLmt")
    protected ExchangeRateOrPercentage1Choice lwLmt;
    @XmlElement(name = "HghLmt")
    protected ExchangeRateOrPercentage1Choice hghLmt;

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyExchange20 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the qtdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtdCcy() {
        return qtdCcy;
    }

    /**
     * Sets the value of the qtdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyExchange20 setQtdCcy(String value) {
        this.qtdCcy = value;
        return this;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CurrencyExchange20 setQtnDt(XMLGregorianCalendar value) {
        this.qtnDt = value;
        return this;
    }

    /**
     * Gets the value of the lwLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateOrPercentage1Choice }
     *     
     */
    public ExchangeRateOrPercentage1Choice getLwLmt() {
        return lwLmt;
    }

    /**
     * Sets the value of the lwLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateOrPercentage1Choice }
     *     
     */
    public CurrencyExchange20 setLwLmt(ExchangeRateOrPercentage1Choice value) {
        this.lwLmt = value;
        return this;
    }

    /**
     * Gets the value of the hghLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateOrPercentage1Choice }
     *     
     */
    public ExchangeRateOrPercentage1Choice getHghLmt() {
        return hghLmt;
    }

    /**
     * Sets the value of the hghLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateOrPercentage1Choice }
     *     
     */
    public CurrencyExchange20 setHghLmt(ExchangeRateOrPercentage1Choice value) {
        this.hghLmt = value;
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
