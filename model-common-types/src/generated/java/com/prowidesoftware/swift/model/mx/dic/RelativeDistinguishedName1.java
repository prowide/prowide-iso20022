
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
 * Relative distinguished name defined by X.500 and X.509.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeDistinguishedName1", propOrder = {
    "attrTp",
    "attrVal"
})
public class RelativeDistinguishedName1 {

    @XmlElement(name = "AttrTp", required = true)
    @XmlSchemaType(name = "string")
    protected AttributeType1Code attrTp;
    @XmlElement(name = "AttrVal", required = true)
    protected String attrVal;

    /**
     * Gets the value of the attrTp property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType1Code }
     *     
     */
    public AttributeType1Code getAttrTp() {
        return attrTp;
    }

    /**
     * Sets the value of the attrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType1Code }
     *     
     */
    public RelativeDistinguishedName1 setAttrTp(AttributeType1Code value) {
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
    public RelativeDistinguishedName1 setAttrVal(String value) {
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
