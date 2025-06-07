
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
 * Element to define an equity instrument underlying code types.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityDerivative3Choice", propOrder = {
    "bskt",
    "indx",
    "snglNm",
    "othr"
})
public class EquityDerivative3Choice {

    @XmlElement(name = "Bskt")
    @XmlSchemaType(name = "string")
    protected UnderlyingEquityType3Code bskt;
    @XmlElement(name = "Indx")
    @XmlSchemaType(name = "string")
    protected UnderlyingEquityType4Code indx;
    @XmlElement(name = "SnglNm")
    @XmlSchemaType(name = "string")
    protected UnderlyingEquityType5Code snglNm;
    @XmlElement(name = "Othr")
    @XmlSchemaType(name = "string")
    protected UnderlyingEquityType6Code othr;

    /**
     * Gets the value of the bskt property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingEquityType3Code }
     *     
     */
    public UnderlyingEquityType3Code getBskt() {
        return bskt;
    }

    /**
     * Sets the value of the bskt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingEquityType3Code }
     *     
     */
    public EquityDerivative3Choice setBskt(UnderlyingEquityType3Code value) {
        this.bskt = value;
        return this;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingEquityType4Code }
     *     
     */
    public UnderlyingEquityType4Code getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingEquityType4Code }
     *     
     */
    public EquityDerivative3Choice setIndx(UnderlyingEquityType4Code value) {
        this.indx = value;
        return this;
    }

    /**
     * Gets the value of the snglNm property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingEquityType5Code }
     *     
     */
    public UnderlyingEquityType5Code getSnglNm() {
        return snglNm;
    }

    /**
     * Sets the value of the snglNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingEquityType5Code }
     *     
     */
    public EquityDerivative3Choice setSnglNm(UnderlyingEquityType5Code value) {
        this.snglNm = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingEquityType6Code }
     *     
     */
    public UnderlyingEquityType6Code getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingEquityType6Code }
     *     
     */
    public EquityDerivative3Choice setOthr(UnderlyingEquityType6Code value) {
        this.othr = value;
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
