
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Additional information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation15", propOrder = {
    "infTp",
    "infVal"
})
public class AdditionalInformation15 {

    @XmlElement(name = "InfTp", required = true)
    protected GenericIdentification36 infTp;
    @XmlElement(name = "InfVal", required = true)
    protected String infVal;

    /**
     * Gets the value of the infTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getInfTp() {
        return infTp;
    }

    /**
     * Sets the value of the infTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public AdditionalInformation15 setInfTp(GenericIdentification36 value) {
        this.infTp = value;
        return this;
    }

    /**
     * Gets the value of the infVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfVal() {
        return infVal;
    }

    /**
     * Sets the value of the infVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation15 setInfVal(String value) {
        this.infVal = value;
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
