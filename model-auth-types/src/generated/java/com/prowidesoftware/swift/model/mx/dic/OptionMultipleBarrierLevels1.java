
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
 * Specifies the lower and upper barrier levels for an option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionMultipleBarrierLevels1", propOrder = {
    "lwrLvl",
    "upperLvl"
})
public class OptionMultipleBarrierLevels1 {

    @XmlElement(name = "LwrLvl", required = true)
    protected SecuritiesTransactionPrice23Choice lwrLvl;
    @XmlElement(name = "UpperLvl", required = true)
    protected SecuritiesTransactionPrice23Choice upperLvl;

    /**
     * Gets the value of the lwrLvl property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice23Choice }
     *     
     */
    public SecuritiesTransactionPrice23Choice getLwrLvl() {
        return lwrLvl;
    }

    /**
     * Sets the value of the lwrLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice23Choice }
     *     
     */
    public OptionMultipleBarrierLevels1 setLwrLvl(SecuritiesTransactionPrice23Choice value) {
        this.lwrLvl = value;
        return this;
    }

    /**
     * Gets the value of the upperLvl property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice23Choice }
     *     
     */
    public SecuritiesTransactionPrice23Choice getUpperLvl() {
        return upperLvl;
    }

    /**
     * Sets the value of the upperLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice23Choice }
     *     
     */
    public OptionMultipleBarrierLevels1 setUpperLvl(SecuritiesTransactionPrice23Choice value) {
        this.upperLvl = value;
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
