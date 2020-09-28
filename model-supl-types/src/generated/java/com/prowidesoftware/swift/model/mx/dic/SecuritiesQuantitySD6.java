
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
 * Provides information about securities quantity linked to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesQuantitySD6", propOrder = {
    "opnUcvrdQty",
    "intrmCvrdQty"
})
public class SecuritiesQuantitySD6 {

    @XmlElement(name = "OpnUcvrdQty")
    protected FinancialInstrumentQuantity31Choice opnUcvrdQty;
    @XmlElement(name = "IntrmCvrdQty")
    protected FinancialInstrumentQuantity31Choice intrmCvrdQty;

    /**
     * Gets the value of the opnUcvrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public FinancialInstrumentQuantity31Choice getOpnUcvrdQty() {
        return opnUcvrdQty;
    }

    /**
     * Sets the value of the opnUcvrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public SecuritiesQuantitySD6 setOpnUcvrdQty(FinancialInstrumentQuantity31Choice value) {
        this.opnUcvrdQty = value;
        return this;
    }

    /**
     * Gets the value of the intrmCvrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public FinancialInstrumentQuantity31Choice getIntrmCvrdQty() {
        return intrmCvrdQty;
    }

    /**
     * Sets the value of the intrmCvrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public SecuritiesQuantitySD6 setIntrmCvrdQty(FinancialInstrumentQuantity31Choice value) {
        this.intrmCvrdQty = value;
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
