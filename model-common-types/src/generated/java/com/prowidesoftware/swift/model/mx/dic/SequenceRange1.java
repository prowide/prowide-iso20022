
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies a range of sequences from a start sequence to an end sequence.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceRange1", propOrder = {
    "frSeq",
    "toSeq"
})
public class SequenceRange1 {

    @XmlElement(name = "FrSeq", required = true)
    protected String frSeq;
    @XmlElement(name = "ToSeq", required = true)
    protected String toSeq;

    /**
     * Gets the value of the frSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrSeq() {
        return frSeq;
    }

    /**
     * Sets the value of the frSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SequenceRange1 setFrSeq(String value) {
        this.frSeq = value;
        return this;
    }

    /**
     * Gets the value of the toSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToSeq() {
        return toSeq;
    }

    /**
     * Sets the value of the toSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SequenceRange1 setToSeq(String value) {
        this.toSeq = value;
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
