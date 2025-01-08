
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
 * Cryptographic algorithm and parameters for digests.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmIdentification5", propOrder = {
    "algo"
})
public class AlgorithmIdentification5 {

    @XmlElement(name = "Algo", required = true)
    @XmlSchemaType(name = "string")
    protected Algorithm5Code algo;

    /**
     * Gets the value of the algo property.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm5Code }
     *     
     */
    public Algorithm5Code getAlgo() {
        return algo;
    }

    /**
     * Sets the value of the algo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm5Code }
     *     
     */
    public AlgorithmIdentification5 setAlgo(Algorithm5Code value) {
        this.algo = value;
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
