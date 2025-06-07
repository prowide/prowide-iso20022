
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
 * Specifies the details of missing information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnableToApplyMissing1", propOrder = {
    "cd",
    "addtlMssngInf"
})
public class UnableToApplyMissing1 {

    @XmlElement(name = "Cd", required = true)
    @XmlSchemaType(name = "string")
    protected UnableToApplyMissingInformation3Code cd;
    @XmlElement(name = "AddtlMssngInf")
    protected String addtlMssngInf;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link UnableToApplyMissingInformation3Code }
     *     
     */
    public UnableToApplyMissingInformation3Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnableToApplyMissingInformation3Code }
     *     
     */
    public UnableToApplyMissing1 setCd(UnableToApplyMissingInformation3Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the addtlMssngInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlMssngInf() {
        return addtlMssngInf;
    }

    /**
     * Sets the value of the addtlMssngInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnableToApplyMissing1 setAddtlMssngInf(String value) {
        this.addtlMssngInf = value;
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
