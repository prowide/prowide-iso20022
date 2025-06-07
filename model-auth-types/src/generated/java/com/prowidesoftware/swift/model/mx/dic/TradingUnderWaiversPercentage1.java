
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
 * Specifies the details for the trading under waiver of the instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingUnderWaiversPercentage1", propOrder = {
    "tradgUdrWvrPctg",
    "tradgVn",
    "dsclmr"
})
public class TradingUnderWaiversPercentage1 {

    @XmlElement(name = "TradgUdrWvrPctg", required = true)
    protected BigDecimal tradgUdrWvrPctg;
    @XmlElement(name = "TradgVn", required = true)
    protected String tradgVn;
    @XmlElement(name = "Dsclmr")
    protected String dsclmr;

    /**
     * Gets the value of the tradgUdrWvrPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradgUdrWvrPctg() {
        return tradgUdrWvrPctg;
    }

    /**
     * Sets the value of the tradgUdrWvrPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TradingUnderWaiversPercentage1 setTradgUdrWvrPctg(BigDecimal value) {
        this.tradgUdrWvrPctg = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingUnderWaiversPercentage1 setTradgVn(String value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingUnderWaiversPercentage1 setDsclmr(String value) {
        this.dsclmr = value;
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
