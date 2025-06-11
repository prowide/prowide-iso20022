
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
 * Specifies the content of the input request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInputRequest5", propOrder = {
    "dispOutpt",
    "inptData"
})
public class DeviceInputRequest5 {

    @XmlElement(name = "DispOutpt")
    protected ActionMessage10 dispOutpt;
    @XmlElement(name = "InptData", required = true)
    protected InputData5 inptData;

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage10 }
     *     
     */
    public ActionMessage10 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage10 }
     *     
     */
    public DeviceInputRequest5 setDispOutpt(ActionMessage10 value) {
        this.dispOutpt = value;
        return this;
    }

    /**
     * Gets the value of the inptData property.
     * 
     * @return
     *     possible object is
     *     {@link InputData5 }
     *     
     */
    public InputData5 getInptData() {
        return inptData;
    }

    /**
     * Sets the value of the inptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputData5 }
     *     
     */
    public DeviceInputRequest5 setInptData(InputData5 value) {
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
