
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
 * Defines the criteria used to report on the securities account positions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement57__1", propOrder = {
    "dtOrPrd",
    "hstrcData"
})
public class Statement571 {

    @XmlElement(name = "DtOrPrd")
    protected DateAndPeriod1Choice1 dtOrPrd;
    @XmlElement(name = "HstrcData")
    protected boolean hstrcData;

    /**
     * Gets the value of the dtOrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPeriod1Choice1 }
     *     
     */
    public DateAndPeriod1Choice1 getDtOrPrd() {
        return dtOrPrd;
    }

    /**
     * Sets the value of the dtOrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPeriod1Choice1 }
     *     
     */
    public Statement571 setDtOrPrd(DateAndPeriod1Choice1 value) {
        this.dtOrPrd = value;
        return this;
    }

    /**
     * Gets the value of the hstrcData property.
     * 
     */
    public boolean isHstrcData() {
        return hstrcData;
    }

    /**
     * Sets the value of the hstrcData property.
     * 
     */
    public Statement571 setHstrcData(boolean value) {
        this.hstrcData = value;
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
