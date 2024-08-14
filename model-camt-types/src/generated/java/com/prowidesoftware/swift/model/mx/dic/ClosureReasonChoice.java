
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
 * Closure reason is expressed as a code or a bilaterally agreed code.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosureReasonChoice", propOrder = {
    "cd",
    "prtryRsn"
})
public class ClosureReasonChoice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected SystemClosureReason1Code cd;
    @XmlElement(name = "PrtryRsn")
    protected String prtryRsn;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link SystemClosureReason1Code }
     *     
     */
    public SystemClosureReason1Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemClosureReason1Code }
     *     
     */
    public ClosureReasonChoice setCd(SystemClosureReason1Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the prtryRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryRsn() {
        return prtryRsn;
    }

    /**
     * Sets the value of the prtryRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClosureReasonChoice setPrtryRsn(String value) {
        this.prtryRsn = value;
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
