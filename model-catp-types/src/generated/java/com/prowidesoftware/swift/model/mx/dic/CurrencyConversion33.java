
package com.prowidesoftware.swift.model.mx.dic;

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
 * Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion33", propOrder = {
    "rslt",
    "rsltRsn",
    "convs"
})
public class CurrencyConversion33 {

    @XmlElement(name = "Rslt", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyConversionResponse2Code rslt;
    @XmlElement(name = "RsltRsn")
    protected String rsltRsn;
    @XmlElement(name = "Convs")
    protected CurrencyConversion32 convs;

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
    public CurrencyConversion33 setRslt(CurrencyConversionResponse2Code value) {
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
    public CurrencyConversion33 setRsltRsn(String value) {
        this.rsltRsn = value;
        return this;
    }

    /**
     * Gets the value of the convs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion32 }
     *     
     */
    public CurrencyConversion32 getConvs() {
        return convs;
    }

    /**
     * Sets the value of the convs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion32 }
     *     
     */
    public CurrencyConversion33 setConvs(CurrencyConversion32 value) {
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
