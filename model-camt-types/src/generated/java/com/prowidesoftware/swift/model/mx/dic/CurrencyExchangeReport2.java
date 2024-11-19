
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
 * Reports either on currency exchange information or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchangeReport2", propOrder = {
    "ccyRef",
    "bizErr",
    "ccyXchgInf"
})
public class CurrencyExchangeReport2 {

    @XmlElement(name = "CcyRef", required = true)
    protected CurrencyReferenceDetails ccyRef;
    @XmlElement(name = "BizErr")
    protected ErrorHandling3 bizErr;
    @XmlElement(name = "CcyXchgInf")
    protected CurrencyExchangeDetails ccyXchgInf;

    /**
     * Gets the value of the ccyRef property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyReferenceDetails }
     *     
     */
    public CurrencyReferenceDetails getCcyRef() {
        return ccyRef;
    }

    /**
     * Sets the value of the ccyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyReferenceDetails }
     *     
     */
    public CurrencyExchangeReport2 setCcyRef(CurrencyReferenceDetails value) {
        this.ccyRef = value;
        return this;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ErrorHandling3 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling3 }
     *     
     */
    public CurrencyExchangeReport2 setBizErr(ErrorHandling3 value) {
        this.bizErr = value;
        return this;
    }

    /**
     * Gets the value of the ccyXchgInf property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchangeDetails }
     *     
     */
    public CurrencyExchangeDetails getCcyXchgInf() {
        return ccyXchgInf;
    }

    /**
     * Sets the value of the ccyXchgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchangeDetails }
     *     
     */
    public CurrencyExchangeReport2 setCcyXchgInf(CurrencyExchangeDetails value) {
        this.ccyXchgInf = value;
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
