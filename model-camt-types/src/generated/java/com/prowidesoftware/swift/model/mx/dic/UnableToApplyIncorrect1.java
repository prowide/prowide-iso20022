
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
 * Specifies the details of incorrect information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnableToApplyIncorrect1", propOrder = {
    "cd",
    "addtlIncrrctInf"
})
public class UnableToApplyIncorrect1 {

    @XmlElement(name = "Cd", required = true)
    @XmlSchemaType(name = "string")
    protected UnableToApplyIncorrectInformation4Code cd;
    @XmlElement(name = "AddtlIncrrctInf")
    protected String addtlIncrrctInf;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link UnableToApplyIncorrectInformation4Code }
     *     
     */
    public UnableToApplyIncorrectInformation4Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnableToApplyIncorrectInformation4Code }
     *     
     */
    public UnableToApplyIncorrect1 setCd(UnableToApplyIncorrectInformation4Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the addtlIncrrctInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlIncrrctInf() {
        return addtlIncrrctInf;
    }

    /**
     * Sets the value of the addtlIncrrctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnableToApplyIncorrect1 setAddtlIncrrctInf(String value) {
        this.addtlIncrrctInf = value;
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
