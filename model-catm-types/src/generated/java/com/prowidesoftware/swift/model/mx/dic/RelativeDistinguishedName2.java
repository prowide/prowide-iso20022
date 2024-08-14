
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
 * Attribute of the certificate service to be put in the certificate extensions, or to be used for the request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeDistinguishedName2", propOrder = {
    "attrTp",
    "attrVal"
})
public class RelativeDistinguishedName2 {

    @XmlElement(name = "AttrTp", required = true)
    @XmlSchemaType(name = "string")
    protected AttributeType2Code attrTp;
    @XmlElement(name = "AttrVal", required = true)
    protected String attrVal;

    /**
     * Gets the value of the attrTp property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType2Code }
     *     
     */
    public AttributeType2Code getAttrTp() {
        return attrTp;
    }

    /**
     * Sets the value of the attrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType2Code }
     *     
     */
    public RelativeDistinguishedName2 setAttrTp(AttributeType2Code value) {
        this.attrTp = value;
        return this;
    }

    /**
     * Gets the value of the attrVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrVal() {
        return attrVal;
    }

    /**
     * Sets the value of the attrVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelativeDistinguishedName2 setAttrVal(String value) {
        this.attrVal = value;
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
