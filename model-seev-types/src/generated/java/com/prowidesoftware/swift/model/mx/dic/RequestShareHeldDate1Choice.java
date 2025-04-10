
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
 * Choice between different ways of specifying the method to determine as from when shares have been held by an investor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestShareHeldDate1Choice", propOrder = {
    "dtClctnMtd",
    "dtClctnDesc"
})
public class RequestShareHeldDate1Choice {

    @XmlElement(name = "DtClctnMtd")
    @XmlSchemaType(name = "string")
    protected DateCalculationMethod1Code dtClctnMtd;
    @XmlElement(name = "DtClctnDesc")
    protected String dtClctnDesc;

    /**
     * Gets the value of the dtClctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link DateCalculationMethod1Code }
     *     
     */
    public DateCalculationMethod1Code getDtClctnMtd() {
        return dtClctnMtd;
    }

    /**
     * Sets the value of the dtClctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCalculationMethod1Code }
     *     
     */
    public RequestShareHeldDate1Choice setDtClctnMtd(DateCalculationMethod1Code value) {
        this.dtClctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the dtClctnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtClctnDesc() {
        return dtClctnDesc;
    }

    /**
     * Sets the value of the dtClctnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestShareHeldDate1Choice setDtClctnDesc(String value) {
        this.dtClctnDesc = value;
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
