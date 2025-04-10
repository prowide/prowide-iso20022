
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
 * Additional information required for distribution in the French market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductInformation2", propOrder = {
    "amfDctrn"
})
public class AdditionalProductInformation2 {

    @XmlElement(name = "AMFDctrn")
    @XmlSchemaType(name = "string")
    protected AMFDoctrine1Code amfDctrn;

    /**
     * Gets the value of the amfDctrn property.
     * 
     * @return
     *     possible object is
     *     {@link AMFDoctrine1Code }
     *     
     */
    public AMFDoctrine1Code getAMFDctrn() {
        return amfDctrn;
    }

    /**
     * Sets the value of the amfDctrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMFDoctrine1Code }
     *     
     */
    public AdditionalProductInformation2 setAMFDctrn(AMFDoctrine1Code value) {
        this.amfDctrn = value;
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
