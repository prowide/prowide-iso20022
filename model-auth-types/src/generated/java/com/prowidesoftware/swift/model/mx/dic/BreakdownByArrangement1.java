
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the net asset value by type of arrangement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakdownByArrangement1", propOrder = {
    "arrgmntTp",
    "netAsstValRate"
})
public class BreakdownByArrangement1 {

    @XmlElement(name = "ArrgmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ArrangementType1Code arrgmntTp;
    @XmlElement(name = "NetAsstValRate", required = true)
    protected BigDecimal netAsstValRate;

    /**
     * Gets the value of the arrgmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrangementType1Code }
     *     
     */
    public ArrangementType1Code getArrgmntTp() {
        return arrgmntTp;
    }

    /**
     * Sets the value of the arrgmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrangementType1Code }
     *     
     */
    public BreakdownByArrangement1 setArrgmntTp(ArrangementType1Code value) {
        this.arrgmntTp = value;
        return this;
    }

    /**
     * Gets the value of the netAsstValRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAsstValRate() {
        return netAsstValRate;
    }

    /**
     * Sets the value of the netAsstValRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BreakdownByArrangement1 setNetAsstValRate(BigDecimal value) {
        this.netAsstValRate = value;
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
