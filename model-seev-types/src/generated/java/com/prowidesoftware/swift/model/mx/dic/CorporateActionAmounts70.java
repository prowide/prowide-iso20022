
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
 * Specifies amounts in the framework of a corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAmounts70", propOrder = {
    "rfnddAmt",
    "nonRfnddAmt"
})
public class CorporateActionAmounts70 {

    @XmlElement(name = "RfnddAmt")
    protected BigDecimal rfnddAmt;
    @XmlElement(name = "NonRfnddAmt")
    protected BigDecimal nonRfnddAmt;

    /**
     * Gets the value of the rfnddAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRfnddAmt() {
        return rfnddAmt;
    }

    /**
     * Sets the value of the rfnddAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionAmounts70 setRfnddAmt(BigDecimal value) {
        this.rfnddAmt = value;
        return this;
    }

    /**
     * Gets the value of the nonRfnddAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonRfnddAmt() {
        return nonRfnddAmt;
    }

    /**
     * Sets the value of the nonRfnddAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionAmounts70 setNonRfnddAmt(BigDecimal value) {
        this.nonRfnddAmt = value;
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
