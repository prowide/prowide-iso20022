
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
 * Content of the Input Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInputRequest1", propOrder = {
    "dispOutpt",
    "inptData"
})
public class DeviceInputRequest1 {

    @XmlElement(name = "DispOutpt")
    protected ActionMessage6 dispOutpt;
    @XmlElement(name = "InptData", required = true)
    protected InputData1 inptData;

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage6 }
     *     
     */
    public ActionMessage6 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage6 }
     *     
     */
    public DeviceInputRequest1 setDispOutpt(ActionMessage6 value) {
        this.dispOutpt = value;
        return this;
    }

    /**
     * Gets the value of the inptData property.
     * 
     * @return
     *     possible object is
     *     {@link InputData1 }
     *     
     */
    public InputData1 getInptData() {
        return inptData;
    }

    /**
     * Sets the value of the inptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputData1 }
     *     
     */
    public DeviceInputRequest1 setInptData(InputData1 value) {
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
