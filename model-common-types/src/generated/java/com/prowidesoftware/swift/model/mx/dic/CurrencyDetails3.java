
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
 * Details of a currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyDetails3", propOrder = {
    "alphaCd",
    "nmrcCd",
    "dcml",
    "nm"
})
public class CurrencyDetails3 {

    @XmlElement(name = "AlphaCd", required = true)
    protected String alphaCd;
    @XmlElement(name = "NmrcCd", required = true)
    protected String nmrcCd;
    @XmlElement(name = "Dcml", required = true)
    protected BigDecimal dcml;
    @XmlElement(name = "Nm")
    protected String nm;

    /**
     * Gets the value of the alphaCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaCd() {
        return alphaCd;
    }

    /**
     * Sets the value of the alphaCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyDetails3 setAlphaCd(String value) {
        this.alphaCd = value;
        return this;
    }

    /**
     * Gets the value of the nmrcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmrcCd() {
        return nmrcCd;
    }

    /**
     * Sets the value of the nmrcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyDetails3 setNmrcCd(String value) {
        this.nmrcCd = value;
        return this;
    }

    /**
     * Gets the value of the dcml property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDcml() {
        return dcml;
    }

    /**
     * Sets the value of the dcml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyDetails3 setDcml(BigDecimal value) {
        this.dcml = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyDetails3 setNm(String value) {
        this.nm = value;
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
