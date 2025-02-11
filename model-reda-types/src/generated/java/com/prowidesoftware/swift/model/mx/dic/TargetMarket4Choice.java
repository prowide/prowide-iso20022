
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
 * Choice of formats for the specification of how a financial product is in scope of a target market parameter.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetMarket4Choice", propOrder = {
    "tp",
    "othr"
})
public class TargetMarket4Choice {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected InvestorType2Code tp;
    @XmlElement(name = "Othr")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code othr;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorType2Code }
     *     
     */
    public InvestorType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorType2Code }
     *     
     */
    public TargetMarket4Choice setTp(InvestorType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket4Choice setOthr(TargetMarket1Code value) {
        this.othr = value;
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
