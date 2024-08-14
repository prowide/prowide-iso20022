
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Element to define an equity instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityDerivative2", propOrder = {
    "undrlygTp",
    "param"
})
public class EquityDerivative2 {

    @XmlElement(name = "UndrlygTp", required = true)
    protected EquityDerivative3Choice undrlygTp;
    @XmlElement(name = "Param")
    @XmlSchemaType(name = "string")
    protected EquityReturnParameter1Code param;

    /**
     * Gets the value of the undrlygTp property.
     * 
     * @return
     *     possible object is
     *     {@link EquityDerivative3Choice }
     *     
     */
    public EquityDerivative3Choice getUndrlygTp() {
        return undrlygTp;
    }

    /**
     * Sets the value of the undrlygTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityDerivative3Choice }
     *     
     */
    public EquityDerivative2 setUndrlygTp(EquityDerivative3Choice value) {
        this.undrlygTp = value;
        return this;
    }

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link EquityReturnParameter1Code }
     *     
     */
    public EquityReturnParameter1Code getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityReturnParameter1Code }
     *     
     */
    public EquityDerivative2 setParam(EquityReturnParameter1Code value) {
        this.param = value;
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
