
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of additional right threshold.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalRightThreshold1Choice", propOrder = {
    "addtlRghtThrshld",
    "addtlRghtThrshldPctg"
})
public class AdditionalRightThreshold1Choice {

    @XmlElement(name = "AddtlRghtThrshld")
    protected String addtlRghtThrshld;
    @XmlElement(name = "AddtlRghtThrshldPctg")
    protected BigDecimal addtlRghtThrshldPctg;

    /**
     * Gets the value of the addtlRghtThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRghtThrshld() {
        return addtlRghtThrshld;
    }

    /**
     * Sets the value of the addtlRghtThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalRightThreshold1Choice setAddtlRghtThrshld(String value) {
        this.addtlRghtThrshld = value;
        return this;
    }

    /**
     * Gets the value of the addtlRghtThrshldPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddtlRghtThrshldPctg() {
        return addtlRghtThrshldPctg;
    }

    /**
     * Sets the value of the addtlRghtThrshldPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AdditionalRightThreshold1Choice setAddtlRghtThrshldPctg(BigDecimal value) {
        this.addtlRghtThrshldPctg = value;
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
