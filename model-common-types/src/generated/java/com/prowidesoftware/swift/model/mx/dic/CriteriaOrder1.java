
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
 * Ordering criteria for the transaction report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaOrder1", propOrder = {
    "trgt"
})
public class CriteriaOrder1 {

    @XmlElement(name = "Trgt", required = true)
    protected String trgt;

    /**
     * Gets the value of the trgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgt() {
        return trgt;
    }

    /**
     * Sets the value of the trgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CriteriaOrder1 setTrgt(String value) {
        this.trgt = value;
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
