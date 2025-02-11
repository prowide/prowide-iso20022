
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
 * Choice between an ISODate or ISODateTime format or a date code.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat58Choice", propOrder = {
    "dtOrDtTm",
    "dtCd"
})
public class DateFormat58Choice {

    @XmlElement(name = "DtOrDtTm")
    protected DateAndDateTime2Choice dtOrDtTm;
    @XmlElement(name = "DtCd")
    @XmlSchemaType(name = "string")
    protected DateType1Code dtCd;

    /**
     * Gets the value of the dtOrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDtOrDtTm() {
        return dtOrDtTm;
    }

    /**
     * Sets the value of the dtOrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateFormat58Choice setDtOrDtTm(DateAndDateTime2Choice value) {
        this.dtOrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the dtCd property.
     * 
     * @return
     *     possible object is
     *     {@link DateType1Code }
     *     
     */
    public DateType1Code getDtCd() {
        return dtCd;
    }

    /**
     * Sets the value of the dtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType1Code }
     *     
     */
    public DateFormat58Choice setDtCd(DateType1Code value) {
        this.dtCd = value;
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
