
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
 * Amount of expected margin required by any of the parties of the margin calculation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginRequirement1", propOrder = {
    "dlvrMrgnAmt",
    "rtrMrgnAmt"
})
public class MarginRequirement1 {

    @XmlElement(name = "DlvrMrgnAmt")
    protected ActiveCurrencyAndAmount dlvrMrgnAmt;
    @XmlElement(name = "RtrMrgnAmt")
    protected ActiveCurrencyAndAmount rtrMrgnAmt;

    /**
     * Gets the value of the dlvrMrgnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDlvrMrgnAmt() {
        return dlvrMrgnAmt;
    }

    /**
     * Sets the value of the dlvrMrgnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MarginRequirement1 setDlvrMrgnAmt(ActiveCurrencyAndAmount value) {
        this.dlvrMrgnAmt = value;
        return this;
    }

    /**
     * Gets the value of the rtrMrgnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRtrMrgnAmt() {
        return rtrMrgnAmt;
    }

    /**
     * Sets the value of the rtrMrgnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MarginRequirement1 setRtrMrgnAmt(ActiveCurrencyAndAmount value) {
        this.rtrMrgnAmt = value;
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
