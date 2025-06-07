
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the terms of the foreign exchange transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTerms27", propOrder = {
    "unitCcy",
    "qtdCcy",
    "xchgRate",
    "rsltgAmt"
})
public class ForeignExchangeTerms27 {

    @XmlElement(name = "UnitCcy", required = true)
    protected String unitCcy;
    @XmlElement(name = "QtdCcy", required = true)
    protected String qtdCcy;
    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;
    @XmlElement(name = "RsltgAmt", required = true)
    protected RestrictedFINActiveCurrencyAndAmount rsltgAmt;

    /**
     * Gets the value of the unitCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCcy() {
        return unitCcy;
    }

    /**
     * Sets the value of the unitCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTerms27 setUnitCcy(String value) {
        this.unitCcy = value;
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
    public ForeignExchangeTerms27 setQtdCcy(String value) {
        this.qtdCcy = value;
        return this;
    }

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
    public ForeignExchangeTerms27 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the rsltgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRsltgAmt() {
        return rsltgAmt;
    }

    /**
     * Sets the value of the rsltgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public ForeignExchangeTerms27 setRsltgAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.rsltgAmt = value;
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
