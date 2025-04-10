
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
 * Provides a rejection reason and additional information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionStatus3", propOrder = {
    "rjctdRsn",
    "addtlInf"
})
public class RejectionStatus3 {

    @XmlElement(name = "RjctdRsn", required = true)
    @XmlSchemaType(name = "string")
    protected RejectionReason68Code rjctdRsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the rjctdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason68Code }
     *     
     */
    public RejectionReason68Code getRjctdRsn() {
        return rjctdRsn;
    }

    /**
     * Sets the value of the rjctdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason68Code }
     *     
     */
    public RejectionStatus3 setRjctdRsn(RejectionReason68Code value) {
        this.rjctdRsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RejectionStatus3 setAddtlInf(String value) {
        this.addtlInf = value;
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
