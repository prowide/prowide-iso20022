
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
 * Choice of holding indicator and aggregated position of holdings.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAggregateBalance1Choice", propOrder = {
    "hldgsInd",
    "hldgBal"
})
public class FinancialInstrumentAggregateBalance1Choice {

    @XmlElement(name = "HldgsInd")
    protected Boolean hldgsInd;
    @XmlElement(name = "HldgBal")
    protected FinancialInstrumentAggregateBalance2 hldgBal;

    /**
     * Gets the value of the hldgsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHldgsInd() {
        return hldgsInd;
    }

    /**
     * Sets the value of the hldgsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAggregateBalance1Choice setHldgsInd(Boolean value) {
        this.hldgsInd = value;
        return this;
    }

    /**
     * Gets the value of the hldgBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAggregateBalance2 }
     *     
     */
    public FinancialInstrumentAggregateBalance2 getHldgBal() {
        return hldgBal;
    }

    /**
     * Sets the value of the hldgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAggregateBalance2 }
     *     
     */
    public FinancialInstrumentAggregateBalance1Choice setHldgBal(FinancialInstrumentAggregateBalance2 value) {
        this.hldgBal = value;
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
