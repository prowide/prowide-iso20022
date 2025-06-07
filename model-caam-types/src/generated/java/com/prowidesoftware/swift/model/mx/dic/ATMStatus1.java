
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Global status of the ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMStatus1", propOrder = {
    "curSts",
    "dmnddSts"
})
public class ATMStatus1 {

    @XmlElement(name = "CurSts", required = true)
    @XmlSchemaType(name = "string")
    protected ATMStatus1Code curSts;
    @XmlElement(name = "DmnddSts")
    @XmlSchemaType(name = "string")
    protected ATMStatus1Code dmnddSts;

    /**
     * Gets the value of the curSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus1Code }
     *     
     */
    public ATMStatus1Code getCurSts() {
        return curSts;
    }

    /**
     * Sets the value of the curSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus1Code }
     *     
     */
    public ATMStatus1 setCurSts(ATMStatus1Code value) {
        this.curSts = value;
        return this;
    }

    /**
     * Gets the value of the dmnddSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus1Code }
     *     
     */
    public ATMStatus1Code getDmnddSts() {
        return dmnddSts;
    }

    /**
     * Sets the value of the dmnddSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus1Code }
     *     
     */
    public ATMStatus1 setDmnddSts(ATMStatus1Code value) {
        this.dmnddSts = value;
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
