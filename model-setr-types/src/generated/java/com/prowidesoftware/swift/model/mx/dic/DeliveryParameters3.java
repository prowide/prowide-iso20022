
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
 * Parameters of a physical delivery.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryParameters3", propOrder = {
    "adr",
    "issdCertNb"
})
public class DeliveryParameters3 {

    @XmlElement(name = "Adr", required = true)
    protected NameAndAddress4 adr;
    @XmlElement(name = "IssdCertNb")
    protected String issdCertNb;

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress4 }
     *     
     */
    public NameAndAddress4 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress4 }
     *     
     */
    public DeliveryParameters3 setAdr(NameAndAddress4 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the issdCertNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssdCertNb() {
        return issdCertNb;
    }

    /**
     * Sets the value of the issdCertNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliveryParameters3 setIssdCertNb(String value) {
        this.issdCertNb = value;
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
