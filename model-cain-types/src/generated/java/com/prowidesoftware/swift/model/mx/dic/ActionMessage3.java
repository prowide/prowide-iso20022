
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
 * Information to log.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionMessage3", propOrder = {
    "dstn",
    "frmt",
    "cntt"
})
public class ActionMessage3 {

    @XmlElement(name = "Dstn", required = true)
    @XmlSchemaType(name = "string")
    protected UserInterface3Code dstn;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat1Code frmt;
    @XmlElement(name = "Cntt", required = true)
    protected String cntt;

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link UserInterface3Code }
     *     
     */
    public UserInterface3Code getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInterface3Code }
     *     
     */
    public ActionMessage3 setDstn(UserInterface3Code value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat1Code }
     *     
     */
    public OutputFormat1Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat1Code }
     *     
     */
    public ActionMessage3 setFrmt(OutputFormat1Code value) {
        this.frmt = value;
        return this;
    }

    /**
     * Gets the value of the cntt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntt() {
        return cntt;
    }

    /**
     * Sets the value of the cntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ActionMessage3 setCntt(String value) {
        this.cntt = value;
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
