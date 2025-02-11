
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
 * Party which has requested the reconciliation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommand6", propOrder = {
    "tp",
    "cmdId"
})
public class ATMCommand6 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCommand3Code tp;
    @XmlElement(name = "CmdId")
    protected ATMCommandIdentification1 cmdId;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommand3Code }
     *     
     */
    public ATMCommand3Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand3Code }
     *     
     */
    public ATMCommand6 setTp(ATMCommand3Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the cmdId property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommandIdentification1 getCmdId() {
        return cmdId;
    }

    /**
     * Sets the value of the cmdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommand6 setCmdId(ATMCommandIdentification1 value) {
        this.cmdId = value;
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
