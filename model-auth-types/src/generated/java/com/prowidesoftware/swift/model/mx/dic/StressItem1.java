
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
 * Risk factor, financial instrument or set of financial instruments that is stressed under a hypothetical stress scenario.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StressItem1", propOrder = {
    "strssPdct"
})
public class StressItem1 {

    @XmlElement(name = "StrssPdct", required = true)
    protected StressItem1Choice strssPdct;

    /**
     * Gets the value of the strssPdct property.
     * 
     * @return
     *     possible object is
     *     {@link StressItem1Choice }
     *     
     */
    public StressItem1Choice getStrssPdct() {
        return strssPdct;
    }

    /**
     * Sets the value of the strssPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressItem1Choice }
     *     
     */
    public StressItem1 setStrssPdct(StressItem1Choice value) {
        this.strssPdct = value;
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
