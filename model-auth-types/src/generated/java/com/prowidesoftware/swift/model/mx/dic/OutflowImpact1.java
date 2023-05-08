
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Weekly outflows derived from the monthly outflows compared with available weekly liquid assets, considered as the sum of highly liquid assets and weekly maturing assets. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutflowImpact1", propOrder = {
    "frstBcktOutflwRate",
    "scndBcktOutflwRate"
})
public class OutflowImpact1 {

    @XmlElement(name = "FrstBcktOutflwRate", required = true)
    protected BigDecimal frstBcktOutflwRate;
    @XmlElement(name = "ScndBcktOutflwRate", required = true)
    protected BigDecimal scndBcktOutflwRate;

    /**
     * Gets the value of the frstBcktOutflwRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrstBcktOutflwRate() {
        return frstBcktOutflwRate;
    }

    /**
     * Sets the value of the frstBcktOutflwRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OutflowImpact1 setFrstBcktOutflwRate(BigDecimal value) {
        this.frstBcktOutflwRate = value;
        return this;
    }

    /**
     * Gets the value of the scndBcktOutflwRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScndBcktOutflwRate() {
        return scndBcktOutflwRate;
    }

    /**
     * Sets the value of the scndBcktOutflwRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OutflowImpact1 setScndBcktOutflwRate(BigDecimal value) {
        this.scndBcktOutflwRate = value;
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
