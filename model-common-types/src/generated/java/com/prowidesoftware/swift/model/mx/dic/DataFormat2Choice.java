
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
 * Choice between the specification of the data in a structured or unstructured form.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataFormat2Choice", propOrder = {
    "strd",
    "ustrd"
})
public class DataFormat2Choice {

    @XmlElement(name = "Strd")
    protected GenericIdentification1 strd;
    @XmlElement(name = "Ustrd")
    protected String ustrd;

    /**
     * Gets the value of the strd property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getStrd() {
        return strd;
    }

    /**
     * Sets the value of the strd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public DataFormat2Choice setStrd(GenericIdentification1 value) {
        this.strd = value;
        return this;
    }

    /**
     * Gets the value of the ustrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUstrd() {
        return ustrd;
    }

    /**
     * Sets the value of the ustrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DataFormat2Choice setUstrd(String value) {
        this.ustrd = value;
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
