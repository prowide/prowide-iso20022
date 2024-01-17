
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
@XmlType(name = "CurrencyExchangeReport3", propOrder = {
    "ccyRef",
    "ccyXchgOrErr"
})
public class CurrencyExchangeReport3 {

    @XmlElement(name = "CcyRef", required = true)
    protected CurrencySourceTarget1 ccyRef;
    @XmlElement(name = "CcyXchgOrErr", required = true)
    protected ExchangeRateReportOrError2Choice ccyXchgOrErr;

    /**
     * Gets the value of the ccyRef property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencySourceTarget1 }
     *     
     */
    public CurrencySourceTarget1 getCcyRef() {
        return ccyRef;
    }

    /**
     * Sets the value of the ccyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencySourceTarget1 }
     *     
     */
    public CurrencyExchangeReport3 setCcyRef(CurrencySourceTarget1 value) {
        this.ccyRef = value;
        return this;
    }

    /**
     * Gets the value of the ccyXchgOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateReportOrError2Choice }
     *     
     */
    public ExchangeRateReportOrError2Choice getCcyXchgOrErr() {
        return ccyXchgOrErr;
    }

    /**
     * Sets the value of the ccyXchgOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateReportOrError2Choice }
     *     
     */
    public CurrencyExchangeReport3 setCcyXchgOrErr(ExchangeRateReportOrError2Choice value) {
        this.ccyXchgOrErr = value;
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
