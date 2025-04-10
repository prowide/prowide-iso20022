
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for PDIndication complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDIndication", propOrder = {
    "emissionList"
})
public class SwPDIndication {

    @XmlElement(name = "EmissionList")
    protected SwEmissionList emissionList;

    /**
     * Gets the value of the emissionList property.
     * 
     * @return
     *     possible object is
     *     {@link SwEmissionList }
     *     
     */
    public SwEmissionList getEmissionList() {
        return emissionList;
    }

    /**
     * Sets the value of the emissionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwEmissionList }
     *     
     */
    public SwPDIndication setEmissionList(SwEmissionList value) {
        this.emissionList = value;
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
