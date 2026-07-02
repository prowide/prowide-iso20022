
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
 * Obligations of a clearing member with respect to a central counterparty that are calculated based on intraday positions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraDayRequirement1", propOrder = {
    "intraDayMrgnCall",
    "peakInitlMrgnLblty",
    "peakVartnMrgnLblty",
    "aggtPeakLblty",
    "mrgnAcctId"
})
public class IntraDayRequirement1 {

    @XmlElement(name = "IntraDayMrgnCall", required = true)
    protected ActiveCurrencyAndAmount intraDayMrgnCall;
    @XmlElement(name = "PeakInitlMrgnLblty", required = true)
    protected ActiveCurrencyAndAmount peakInitlMrgnLblty;
    @XmlElement(name = "PeakVartnMrgnLblty", required = true)
    protected ActiveCurrencyAndAmount peakVartnMrgnLblty;
    @XmlElement(name = "AggtPeakLblty", required = true)
    protected ActiveCurrencyAndAmount aggtPeakLblty;
    @XmlElement(name = "MrgnAcctId", required = true)
    protected GenericIdentification165 mrgnAcctId;

    /**
     * Gets the value of the intraDayMrgnCall property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIntraDayMrgnCall() {
        return intraDayMrgnCall;
    }

    /**
     * Sets the value of the intraDayMrgnCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public IntraDayRequirement1 setIntraDayMrgnCall(ActiveCurrencyAndAmount value) {
        this.intraDayMrgnCall = value;
        return this;
    }

    /**
     * Gets the value of the peakInitlMrgnLblty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPeakInitlMrgnLblty() {
        return peakInitlMrgnLblty;
    }

    /**
     * Sets the value of the peakInitlMrgnLblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public IntraDayRequirement1 setPeakInitlMrgnLblty(ActiveCurrencyAndAmount value) {
        this.peakInitlMrgnLblty = value;
        return this;
    }

    /**
     * Gets the value of the peakVartnMrgnLblty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPeakVartnMrgnLblty() {
        return peakVartnMrgnLblty;
    }

    /**
     * Sets the value of the peakVartnMrgnLblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public IntraDayRequirement1 setPeakVartnMrgnLblty(ActiveCurrencyAndAmount value) {
        this.peakVartnMrgnLblty = value;
        return this;
    }

    /**
     * Gets the value of the aggtPeakLblty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAggtPeakLblty() {
        return aggtPeakLblty;
    }

    /**
     * Sets the value of the aggtPeakLblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public IntraDayRequirement1 setAggtPeakLblty(ActiveCurrencyAndAmount value) {
        this.aggtPeakLblty = value;
        return this;
    }

    /**
     * Gets the value of the mrgnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getMrgnAcctId() {
        return mrgnAcctId;
    }

    /**
     * Sets the value of the mrgnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public IntraDayRequirement1 setMrgnAcctId(GenericIdentification165 value) {
        this.mrgnAcctId = value;
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
