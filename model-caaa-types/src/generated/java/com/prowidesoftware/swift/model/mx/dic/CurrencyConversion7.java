
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
@XmlType(name = "CurrencyConversion7", propOrder = {
    "rslt",
    "rsltRsn",
    "convsDtls"
})
public class CurrencyConversion7 {

    @XmlElement(name = "Rslt", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyConversionResponse1Code rslt;
    @XmlElement(name = "RsltRsn")
    protected String rsltRsn;
    @XmlElement(name = "ConvsDtls")
    protected CurrencyConversion6 convsDtls;

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversionResponse1Code }
     *     
     */
    public CurrencyConversionResponse1Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversionResponse1Code }
     *     
     */
    public CurrencyConversion7 setRslt(CurrencyConversionResponse1Code value) {
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
    public CurrencyConversion7 setRsltRsn(String value) {
        this.rsltRsn = value;
        return this;
    }

    /**
     * Gets the value of the convsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion6 }
     *     
     */
    public CurrencyConversion6 getConvsDtls() {
        return convsDtls;
    }

    /**
     * Sets the value of the convsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion6 }
     *     
     */
    public CurrencyConversion7 setConvsDtls(CurrencyConversion6 value) {
        this.convsDtls = value;
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
