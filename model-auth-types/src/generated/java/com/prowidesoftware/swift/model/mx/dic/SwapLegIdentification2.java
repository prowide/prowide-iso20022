
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
 * Details of the legs of swap transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwapLegIdentification2", propOrder = {
    "swpIn",
    "swpOut"
})
public class SwapLegIdentification2 {

    @XmlElement(name = "SwpIn")
    protected FinancialInstrumentIdentification7Choice swpIn;
    @XmlElement(name = "SwpOut")
    protected FinancialInstrumentIdentification7Choice swpOut;

    /**
     * Gets the value of the swpIn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public FinancialInstrumentIdentification7Choice getSwpIn() {
        return swpIn;
    }

    /**
     * Sets the value of the swpIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public SwapLegIdentification2 setSwpIn(FinancialInstrumentIdentification7Choice value) {
        this.swpIn = value;
        return this;
    }

    /**
     * Gets the value of the swpOut property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public FinancialInstrumentIdentification7Choice getSwpOut() {
        return swpOut;
    }

    /**
     * Sets the value of the swpOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public SwapLegIdentification2 setSwpOut(FinancialInstrumentIdentification7Choice value) {
        this.swpOut = value;
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
