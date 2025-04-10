
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
 * Specifies details of the electronic invoice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicInvoice1", propOrder = {
    "presntmntTp"
})
public class ElectronicInvoice1 {

    @XmlElement(name = "PresntmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected PresentmentType1Code presntmntTp;

    /**
     * Gets the value of the presntmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link PresentmentType1Code }
     *     
     */
    public PresentmentType1Code getPresntmntTp() {
        return presntmntTp;
    }

    /**
     * Sets the value of the presntmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentmentType1Code }
     *     
     */
    public ElectronicInvoice1 setPresntmntTp(PresentmentType1Code value) {
        this.presntmntTp = value;
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
