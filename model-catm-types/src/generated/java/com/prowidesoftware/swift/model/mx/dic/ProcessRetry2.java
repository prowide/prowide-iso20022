
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
 * Definition of retry process if activation of an action fails.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessRetry2", propOrder = {
    "dely",
    "maxNb"
})
public class ProcessRetry2 {

    @XmlElement(name = "Dely", required = true)
    protected String dely;
    @XmlElement(name = "MaxNb")
    protected BigDecimal maxNb;

    /**
     * Gets the value of the dely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDely() {
        return dely;
    }

    /**
     * Sets the value of the dely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessRetry2 setDely(String value) {
        this.dely = value;
        return this;
    }

    /**
     * Gets the value of the maxNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNb() {
        return maxNb;
    }

    /**
     * Sets the value of the maxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ProcessRetry2 setMaxNb(BigDecimal value) {
        this.maxNb = value;
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
