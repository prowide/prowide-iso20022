
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
 * Loss bearing target market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTargetMarketLossBearing1", propOrder = {
    "abltyToBearLossesTp",
    "trgt",
    "addtlInf"
})
public class OtherTargetMarketLossBearing1 {

    @XmlElement(name = "AbltyToBearLossesTp")
    protected String abltyToBearLossesTp;
    @XmlElement(name = "Trgt")
    protected TargetMarket1Choice trgt;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the abltyToBearLossesTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbltyToBearLossesTp() {
        return abltyToBearLossesTp;
    }

    /**
     * Sets the value of the abltyToBearLossesTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherTargetMarketLossBearing1 setAbltyToBearLossesTp(String value) {
        this.abltyToBearLossesTp = value;
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
    public OtherTargetMarketLossBearing1 setTrgt(TargetMarket1Choice value) {
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
    public OtherTargetMarketLossBearing1 setAddtlInf(AdditionalInformation15 value) {
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
