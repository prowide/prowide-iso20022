
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
 * Reason for the cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationType", propOrder = {
    "cxlTp"
})
public class CancellationType {

    @XmlElement(name = "CxlTp", required = true)
    @XmlSchemaType(name = "string")
    protected QuoteStatus2Code cxlTp;

    /**
     * Gets the value of the cxlTp property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteStatus2Code }
     *     
     */
    public QuoteStatus2Code getCxlTp() {
        return cxlTp;
    }

    /**
     * Sets the value of the cxlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteStatus2Code }
     *     
     */
    public CancellationType setCxlTp(QuoteStatus2Code value) {
        this.cxlTp = value;
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
