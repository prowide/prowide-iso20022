
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
 * Defines a cryptographic digest algorithm and value.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmAndDigest1", propOrder = {
    "dgstAlgo",
    "dgst"
})
public class AlgorithmAndDigest1 {

    @XmlElement(name = "DgstAlgo", required = true)
    @XmlSchemaType(name = "string")
    protected Algorithm5Code dgstAlgo;
    @XmlElement(name = "Dgst", required = true)
    protected String dgst;

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm5Code }
     *     
     */
    public Algorithm5Code getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm5Code }
     *     
     */
    public AlgorithmAndDigest1 setDgstAlgo(Algorithm5Code value) {
        this.dgstAlgo = value;
        return this;
    }

    /**
     * Gets the value of the dgst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDgst() {
        return dgst;
    }

    /**
     * Sets the value of the dgst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AlgorithmAndDigest1 setDgst(String value) {
        this.dgst = value;
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
