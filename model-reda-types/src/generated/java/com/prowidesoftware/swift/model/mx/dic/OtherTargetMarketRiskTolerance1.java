
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
 * Risk tolerance target market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTargetMarketRiskTolerance1", propOrder = {
    "rskTlrnceTp",
    "trgt",
    "addtlInf"
})
public class OtherTargetMarketRiskTolerance1 {

    @XmlElement(name = "RskTlrnceTp")
    protected String rskTlrnceTp;
    @XmlElement(name = "Trgt")
    protected TargetMarket1Choice trgt;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the rskTlrnceTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRskTlrnceTp() {
        return rskTlrnceTp;
    }

    /**
     * Sets the value of the rskTlrnceTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherTargetMarketRiskTolerance1 setRskTlrnceTp(String value) {
        this.rskTlrnceTp = value;
        return this;
    }

    /**
     * Gets the value of the trgt property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Choice }
     *     
     */
    public TargetMarket1Choice getTrgt() {
        return trgt;
    }

    /**
     * Sets the value of the trgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Choice }
     *     
     */
    public OtherTargetMarketRiskTolerance1 setTrgt(TargetMarket1Choice value) {
        this.trgt = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public AdditionalInformation15 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public OtherTargetMarketRiskTolerance1 setAddtlInf(AdditionalInformation15 value) {
        this.addtlInf = value;
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
