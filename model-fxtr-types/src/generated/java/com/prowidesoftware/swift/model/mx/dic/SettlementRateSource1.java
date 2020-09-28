
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the components of a settlement rate source for a non delvierable trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementRateSource1", propOrder = {
    "rateSrc",
    "tm",
    "ctryCd",
    "lctnCd"
})
public class SettlementRateSource1 {

    @XmlElement(name = "RateSrc", required = true)
    protected String rateSrc;
    @XmlElement(name = "Tm")
    protected String tm;
    @XmlElement(name = "CtryCd")
    protected String ctryCd;
    @XmlElement(name = "LctnCd")
    protected String lctnCd;

    /**
     * Gets the value of the rateSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateSrc() {
        return rateSrc;
    }

    /**
     * Sets the value of the rateSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementRateSource1 setRateSrc(String value) {
        this.rateSrc = value;
        return this;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementRateSource1 setTm(String value) {
        this.tm = value;
        return this;
    }

    /**
     * Gets the value of the ctryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryCd() {
        return ctryCd;
    }

    /**
     * Sets the value of the ctryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementRateSource1 setCtryCd(String value) {
        this.ctryCd = value;
        return this;
    }

    /**
     * Gets the value of the lctnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnCd() {
        return lctnCd;
    }

    /**
     * Sets the value of the lctnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementRateSource1 setLctnCd(String value) {
        this.lctnCd = value;
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
