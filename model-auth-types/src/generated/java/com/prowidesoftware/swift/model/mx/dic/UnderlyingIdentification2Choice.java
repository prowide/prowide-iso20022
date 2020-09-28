
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
 * Details of the underlying of a security transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingIdentification2Choice", propOrder = {
    "swp",
    "othr"
})
public class UnderlyingIdentification2Choice {

    @XmlElement(name = "Swp")
    protected SwapLegIdentification2 swp;
    @XmlElement(name = "Othr")
    protected FinancialInstrumentIdentification7Choice othr;

    /**
     * Gets the value of the swp property.
     * 
     * @return
     *     possible object is
     *     {@link SwapLegIdentification2 }
     *     
     */
    public SwapLegIdentification2 getSwp() {
        return swp;
    }

    /**
     * Sets the value of the swp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwapLegIdentification2 }
     *     
     */
    public UnderlyingIdentification2Choice setSwp(SwapLegIdentification2 value) {
        this.swp = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public FinancialInstrumentIdentification7Choice getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public UnderlyingIdentification2Choice setOthr(FinancialInstrumentIdentification7Choice value) {
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
