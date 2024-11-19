
package com.prowidesoftware.swift.model.mx.dic;

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
 * Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion10", propOrder = {
    "rslt",
    "rsltRsn",
    "convs"
})
public class CurrencyConversion10 {

    @XmlElement(name = "Rslt", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyConversionResponse2Code rslt;
    @XmlElement(name = "RsltRsn")
    protected String rsltRsn;
    @XmlElement(name = "Convs")
    protected CurrencyConversion9 convs;

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversionResponse2Code }
     *     
     */
    public CurrencyConversionResponse2Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversionResponse2Code }
     *     
     */
    public CurrencyConversion10 setRslt(CurrencyConversionResponse2Code value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the rsltRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsltRsn() {
        return rsltRsn;
    }

    /**
     * Sets the value of the rsltRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion10 setRsltRsn(String value) {
        this.rsltRsn = value;
        return this;
    }

    /**
     * Gets the value of the convs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion9 }
     *     
     */
    public CurrencyConversion9 getConvs() {
        return convs;
    }

    /**
     * Sets the value of the convs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion9 }
     *     
     */
    public CurrencyConversion10 setConvs(CurrencyConversion9 value) {
        this.convs = value;
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
