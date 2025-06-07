
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
 * Content of the Power-Off Card Reader Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevicePoweroffCardReaderRequest3", propOrder = {
    "pwrOffMaxWtgTm",
    "dispOutpt"
})
public class DevicePoweroffCardReaderRequest3 {

    @XmlElement(name = "PwrOffMaxWtgTm")
    protected BigDecimal pwrOffMaxWtgTm;
    @XmlElement(name = "DispOutpt")
    protected ActionMessage8 dispOutpt;

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
    public DevicePoweroffCardReaderRequest3 setPwrOffMaxWtgTm(BigDecimal value) {
        this.pwrOffMaxWtgTm = value;
        return this;
    }

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage8 }
     *     
     */
    public ActionMessage8 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage8 }
     *     
     */
    public DevicePoweroffCardReaderRequest3 setDispOutpt(ActionMessage8 value) {
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
