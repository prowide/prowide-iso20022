
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
 * Cryptographic algorithm and parameters for the protection of the transported key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmIdentification29", propOrder = {
    "algo",
    "param"
})
public class AlgorithmIdentification29 {

    @XmlElement(name = "Algo", required = true)
    @XmlSchemaType(name = "string")
    protected Algorithm24Code algo;
    @XmlElement(name = "Param")
    protected Parameter12 param;

    /**
     * Gets the value of the algo property.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm24Code }
     *     
     */
    public Algorithm24Code getAlgo() {
        return algo;
    }

    /**
     * Sets the value of the algo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm24Code }
     *     
     */
    public AlgorithmIdentification29 setAlgo(Algorithm24Code value) {
        this.algo = value;
        return this;
    }

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link Parameter12 }
     *     
     */
    public Parameter12 getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameter12 }
     *     
     */
    public AlgorithmIdentification29 setParam(Parameter12 value) {
        this.param = value;
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
