
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
 * Identifies the security instrument by its name and typical characteristics.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityInstrumentDescription19", propOrder = {
    "finInstrmGnlAttrbts",
    "debtInstrmAttrbts",
    "derivInstrmAttrbts"
})
public class SecurityInstrumentDescription19 {

    @XmlElement(name = "FinInstrmGnlAttrbts", required = true)
    protected SecurityInstrumentDescription20 finInstrmGnlAttrbts;
    @XmlElement(name = "DebtInstrmAttrbts")
    protected DebtInstrument4 debtInstrmAttrbts;
    @XmlElement(name = "DerivInstrmAttrbts", required = true)
    protected DerivativeInstrument9 derivInstrmAttrbts;

    /**
     * Gets the value of the finInstrmGnlAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInstrumentDescription20 }
     *     
     */
    public SecurityInstrumentDescription20 getFinInstrmGnlAttrbts() {
        return finInstrmGnlAttrbts;
    }

    /**
     * Sets the value of the finInstrmGnlAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInstrumentDescription20 }
     *     
     */
    public SecurityInstrumentDescription19 setFinInstrmGnlAttrbts(SecurityInstrumentDescription20 value) {
        this.finInstrmGnlAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the debtInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrument4 }
     *     
     */
    public DebtInstrument4 getDebtInstrmAttrbts() {
        return debtInstrmAttrbts;
    }

    /**
     * Sets the value of the debtInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrument4 }
     *     
     */
    public SecurityInstrumentDescription19 setDebtInstrmAttrbts(DebtInstrument4 value) {
        this.debtInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the derivInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInstrument9 }
     *     
     */
    public DerivativeInstrument9 getDerivInstrmAttrbts() {
        return derivInstrmAttrbts;
    }

    /**
     * Sets the value of the derivInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInstrument9 }
     *     
     */
    public SecurityInstrumentDescription19 setDerivInstrmAttrbts(DerivativeInstrument9 value) {
        this.derivInstrmAttrbts = value;
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
