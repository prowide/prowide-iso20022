
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
 * Identifies the status of a quote and the rejection reason if required.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteStatus1", propOrder = {
    "qtSts",
    "rjctnRsn"
})
public class QuoteStatus1 {

    @XmlElement(name = "QtSts", required = true)
    @XmlSchemaType(name = "string")
    protected QuoteStatus1Code qtSts;
    @XmlElement(name = "RjctnRsn")
    @XmlSchemaType(name = "string")
    protected RejectionReason3Code rjctnRsn;

    /**
     * Gets the value of the qtSts property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteStatus1Code }
     *     
     */
    public QuoteStatus1Code getQtSts() {
        return qtSts;
    }

    /**
     * Sets the value of the qtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteStatus1Code }
     *     
     */
    public QuoteStatus1 setQtSts(QuoteStatus1Code value) {
        this.qtSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason3Code }
     *     
     */
    public RejectionReason3Code getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason3Code }
     *     
     */
    public QuoteStatus1 setRjctnRsn(RejectionReason3Code value) {
        this.rjctnRsn = value;
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
