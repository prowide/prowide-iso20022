
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Assumed stress move for a set of financial instruments defined by a common trading strategy.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Strategy1", propOrder = {
    "id",
    "strssSz"
})
public class Strategy1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "StrssSz", required = true)
    protected StressSize1Choice strssSz;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Strategy1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the strssSz property.
     * 
     * @return
     *     possible object is
     *     {@link StressSize1Choice }
     *     
     */
    public StressSize1Choice getStrssSz() {
        return strssSz;
    }

    /**
     * Sets the value of the strssSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressSize1Choice }
     *     
     */
    public Strategy1 setStrssSz(StressSize1Choice value) {
        this.strssSz = value;
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
