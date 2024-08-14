
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
 * Choice between a code and a free format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventType1Choice", propOrder = {
    "cd",
    "prtryEvt"
})
public class SystemEventType1Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected SystemEventType2Code cd;
    @XmlElement(name = "PrtryEvt")
    protected String prtryEvt;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventType2Code }
     *     
     */
    public SystemEventType2Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventType2Code }
     *     
     */
    public SystemEventType1Choice setCd(SystemEventType2Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the prtryEvt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryEvt() {
        return prtryEvt;
    }

    /**
     * Sets the value of the prtryEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemEventType1Choice setPrtryEvt(String value) {
        this.prtryEvt = value;
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
