
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
 * Specifies the choice between different types of derivative.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefinedAttributes1Choice", propOrder = {
    "qtyDfndAttrbts",
    "valDfndAttrbts"
})
public class DefinedAttributes1Choice {

    @XmlElement(name = "QtyDfndAttrbts")
    protected FinancialInstrumentAttributes89 qtyDfndAttrbts;
    @XmlElement(name = "ValDfndAttrbts")
    protected FinancialInstrumentAttributes90 valDfndAttrbts;

    /**
     * Gets the value of the qtyDfndAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes89 }
     *     
     */
    public FinancialInstrumentAttributes89 getQtyDfndAttrbts() {
        return qtyDfndAttrbts;
    }

    /**
     * Sets the value of the qtyDfndAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes89 }
     *     
     */
    public DefinedAttributes1Choice setQtyDfndAttrbts(FinancialInstrumentAttributes89 value) {
        this.qtyDfndAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the valDfndAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes90 }
     *     
     */
    public FinancialInstrumentAttributes90 getValDfndAttrbts() {
        return valDfndAttrbts;
    }

    /**
     * Sets the value of the valDfndAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes90 }
     *     
     */
    public DefinedAttributes1Choice setValDfndAttrbts(FinancialInstrumentAttributes90 value) {
        this.valDfndAttrbts = value;
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
