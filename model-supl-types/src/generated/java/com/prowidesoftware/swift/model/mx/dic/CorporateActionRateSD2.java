
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
 * Ratio of the American or Global Depository Receipt(s) per ordinary share(s).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRateSD2", propOrder = {
    "rctBaseQty",
    "ordnryShr"
})
public class CorporateActionRateSD2 {

    @XmlElement(name = "RctBaseQty")
    protected BigDecimal rctBaseQty;
    @XmlElement(name = "OrdnryShr")
    protected BigDecimal ordnryShr;

    /**
     * Gets the value of the rctBaseQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRctBaseQty() {
        return rctBaseQty;
    }

    /**
     * Sets the value of the rctBaseQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRateSD2 setRctBaseQty(BigDecimal value) {
        this.rctBaseQty = value;
        return this;
    }

    /**
     * Gets the value of the ordnryShr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdnryShr() {
        return ordnryShr;
    }

    /**
     * Sets the value of the ordnryShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRateSD2 setOrdnryShr(BigDecimal value) {
        this.ordnryShr = value;
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
