
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
 * Specifies the content of the input request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInputRequest6", propOrder = {
    "dispOutpt",
    "inptData"
})
public class DeviceInputRequest6 {

    @XmlElement(name = "DispOutpt")
    protected ActionMessage11 dispOutpt;
    @XmlElement(name = "InptData", required = true)
    protected InputData6 inptData;

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage11 }
     *     
     */
    public ActionMessage11 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage11 }
     *     
     */
    public DeviceInputRequest6 setDispOutpt(ActionMessage11 value) {
        this.dispOutpt = value;
        return this;
    }

    /**
     * Gets the value of the inptData property.
     * 
     * @return
     *     possible object is
     *     {@link InputData6 }
     *     
     */
    public InputData6 getInptData() {
        return inptData;
    }

    /**
     * Sets the value of the inptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputData6 }
     *     
     */
    public DeviceInputRequest6 setInptData(InputData6 value) {
        this.inptData = value;
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
