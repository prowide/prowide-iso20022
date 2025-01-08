
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Represents different types of derivative.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Derivative4", propOrder = {
    "futr",
    "optn"
})
public class Derivative4 {

    @XmlElement(name = "Futr")
    protected Future4 futr;
    @XmlElement(name = "Optn")
    protected Option15 optn;

    /**
     * Gets the value of the futr property.
     * 
     * @return
     *     possible object is
     *     {@link Future4 }
     *     
     */
    public Future4 getFutr() {
        return futr;
    }

    /**
     * Sets the value of the futr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Future4 }
     *     
     */
    public Derivative4 setFutr(Future4 value) {
        this.futr = value;
        return this;
    }

    /**
     * Gets the value of the optn property.
     * 
     * @return
     *     possible object is
     *     {@link Option15 }
     *     
     */
    public Option15 getOptn() {
        return optn;
    }

    /**
     * Sets the value of the optn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Option15 }
     *     
     */
    public Derivative4 setOptn(Option15 value) {
        this.optn = value;
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
