
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
 * Defines the criteria used to report on the securities account positions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement57", propOrder = {
    "dtOrPrd",
    "hstrcData"
})
public class Statement57 {

    @XmlElement(name = "DtOrPrd")
    protected DateAndPeriod1Choice dtOrPrd;
    @XmlElement(name = "HstrcData")
    protected boolean hstrcData;

    /**
     * Gets the value of the dtOrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPeriod1Choice }
     *     
     */
    public DateAndPeriod1Choice getDtOrPrd() {
        return dtOrPrd;
    }

    /**
     * Sets the value of the dtOrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPeriod1Choice }
     *     
     */
    public Statement57 setDtOrPrd(DateAndPeriod1Choice value) {
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
    public Statement57 setHstrcData(boolean value) {
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
