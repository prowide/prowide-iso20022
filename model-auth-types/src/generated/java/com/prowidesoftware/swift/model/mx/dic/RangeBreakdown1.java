
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the performance indicator within each time period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeBreakdown1", propOrder = {
    "rgTp",
    "prfrmncVal"
})
public class RangeBreakdown1 {

    @XmlElement(name = "RgTp", required = true)
    @XmlSchemaType(name = "string")
    protected RangeType1Code rgTp;
    @XmlElement(name = "PrfrmncVal", required = true)
    protected PerformanceValueType1Choice prfrmncVal;

    /**
     * Gets the value of the rgTp property.
     * 
     * @return
     *     possible object is
     *     {@link RangeType1Code }
     *     
     */
    public RangeType1Code getRgTp() {
        return rgTp;
    }

    /**
     * Sets the value of the rgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeType1Code }
     *     
     */
    public RangeBreakdown1 setRgTp(RangeType1Code value) {
        this.rgTp = value;
        return this;
    }

    /**
     * Gets the value of the prfrmncVal property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceValueType1Choice }
     *     
     */
    public PerformanceValueType1Choice getPrfrmncVal() {
        return prfrmncVal;
    }

    /**
     * Sets the value of the prfrmncVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceValueType1Choice }
     *     
     */
    public RangeBreakdown1 setPrfrmncVal(PerformanceValueType1Choice value) {
        this.prfrmncVal = value;
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
