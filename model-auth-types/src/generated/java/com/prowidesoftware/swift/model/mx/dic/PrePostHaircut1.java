
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
 * Amount of collateral calculated pre-haircut and/or post-haircut.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrePostHaircut1", propOrder = {
    "preHrcut",
    "pstHrcut"
})
public class PrePostHaircut1 {

    @XmlElement(name = "PreHrcut")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount preHrcut;
    @XmlElement(name = "PstHrcut")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount pstHrcut;

    /**
     * Gets the value of the preHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getPreHrcut() {
        return preHrcut;
    }

    /**
     * Sets the value of the preHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public PrePostHaircut1 setPreHrcut(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.preHrcut = value;
        return this;
    }

    /**
     * Gets the value of the pstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getPstHrcut() {
        return pstHrcut;
    }

    /**
     * Sets the value of the pstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public PrePostHaircut1 setPstHrcut(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.pstHrcut = value;
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
