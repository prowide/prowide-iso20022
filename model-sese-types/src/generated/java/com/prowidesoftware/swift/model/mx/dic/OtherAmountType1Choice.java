
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
 * Choice between formats for a type of amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmountType1Choice", propOrder = {
    "cd",
    "prtryCd"
})
public class OtherAmountType1Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected OtherAmountType1Code cd;
    @XmlElement(name = "PrtryCd")
    protected GenericIdentification1 prtryCd;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmountType1Code }
     *     
     */
    public OtherAmountType1Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmountType1Code }
     *     
     */
    public OtherAmountType1Choice setCd(OtherAmountType1Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the prtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getPrtryCd() {
        return prtryCd;
    }

    /**
     * Sets the value of the prtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public OtherAmountType1Choice setPrtryCd(GenericIdentification1 value) {
        this.prtryCd = value;
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
