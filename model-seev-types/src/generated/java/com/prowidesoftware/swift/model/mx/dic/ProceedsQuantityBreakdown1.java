
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
 * Provides information on the breakdown of quantities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProceedsQuantityBreakdown1", propOrder = {
    "trfOfRcvdPrcdsQty",
    "cshCompstnQty"
})
public class ProceedsQuantityBreakdown1 {

    @XmlElement(name = "TrfOfRcvdPrcdsQty")
    protected FinancialInstrumentQuantity18Choice trfOfRcvdPrcdsQty;
    @XmlElement(name = "CshCompstnQty")
    protected FinancialInstrumentQuantity18Choice cshCompstnQty;

    /**
     * Gets the value of the trfOfRcvdPrcdsQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getTrfOfRcvdPrcdsQty() {
        return trfOfRcvdPrcdsQty;
    }

    /**
     * Sets the value of the trfOfRcvdPrcdsQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public ProceedsQuantityBreakdown1 setTrfOfRcvdPrcdsQty(FinancialInstrumentQuantity18Choice value) {
        this.trfOfRcvdPrcdsQty = value;
        return this;
    }

    /**
     * Gets the value of the cshCompstnQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getCshCompstnQty() {
        return cshCompstnQty;
    }

    /**
     * Sets the value of the cshCompstnQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public ProceedsQuantityBreakdown1 setCshCompstnQty(FinancialInstrumentQuantity18Choice value) {
        this.cshCompstnQty = value;
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
