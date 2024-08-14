
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
 * Provides a rejection reason and additional information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionStatus2", propOrder = {
    "rjctdRsn",
    "addtlInf"
})
public class RejectionStatus2 {

    @XmlElement(name = "RjctdRsn", required = true)
    @XmlSchemaType(name = "string")
    protected RejectionReasonV021Code rjctdRsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the rjctdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReasonV021Code }
     *     
     */
    public RejectionReasonV021Code getRjctdRsn() {
        return rjctdRsn;
    }

    /**
     * Sets the value of the rjctdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReasonV021Code }
     *     
     */
    public RejectionStatus2 setRjctdRsn(RejectionReasonV021Code value) {
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
    public RejectionStatus2 setAddtlInf(String value) {
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
