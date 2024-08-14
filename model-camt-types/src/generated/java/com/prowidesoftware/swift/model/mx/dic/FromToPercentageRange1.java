
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
 * Range of percentage rates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromToPercentageRange1", propOrder = {
    "fr",
    "to"
})
public class FromToPercentageRange1 {

    @XmlElement(name = "Fr", required = true)
    protected PercentageRangeBoundary1 fr;
    @XmlElement(name = "To", required = true)
    protected PercentageRangeBoundary1 to;

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageRangeBoundary1 }
     *     
     */
    public PercentageRangeBoundary1 getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageRangeBoundary1 }
     *     
     */
    public FromToPercentageRange1 setFr(PercentageRangeBoundary1 value) {
        this.fr = value;
        return this;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageRangeBoundary1 }
     *     
     */
    public PercentageRangeBoundary1 getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageRangeBoundary1 }
     *     
     */
    public FromToPercentageRange1 setTo(PercentageRangeBoundary1 value) {
        this.to = value;
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
