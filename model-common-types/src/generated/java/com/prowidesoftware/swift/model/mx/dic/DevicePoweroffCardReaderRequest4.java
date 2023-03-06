
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
 * Content of the Power-Off Card Reader Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevicePoweroffCardReaderRequest4", propOrder = {
    "pwrOffMaxWtgTm",
    "dispOutpt"
})
public class DevicePoweroffCardReaderRequest4 {

    @XmlElement(name = "PwrOffMaxWtgTm")
    protected BigDecimal pwrOffMaxWtgTm;
    @XmlElement(name = "DispOutpt")
    protected ActionMessage9 dispOutpt;

    /**
     * Gets the value of the pwrOffMaxWtgTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPwrOffMaxWtgTm() {
        return pwrOffMaxWtgTm;
    }

    /**
     * Sets the value of the pwrOffMaxWtgTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DevicePoweroffCardReaderRequest4 setPwrOffMaxWtgTm(BigDecimal value) {
        this.pwrOffMaxWtgTm = value;
        return this;
    }

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage9 }
     *     
     */
    public ActionMessage9 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage9 }
     *     
     */
    public DevicePoweroffCardReaderRequest4 setDispOutpt(ActionMessage9 value) {
        this.dispOutpt = value;
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
