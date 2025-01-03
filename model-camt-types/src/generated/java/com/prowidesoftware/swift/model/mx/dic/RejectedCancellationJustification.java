
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
 * Provides the reason for rejecting a RequestToCancelPayment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectedCancellationJustification", propOrder = {
    "rsnCd",
    "rsn"
})
public class RejectedCancellationJustification {

    @XmlElement(name = "RsnCd", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentCancellationRejection1Code rsnCd;
    @XmlElement(name = "Rsn")
    protected String rsn;

    /**
     * Gets the value of the rsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCancellationRejection1Code }
     *     
     */
    public PaymentCancellationRejection1Code getRsnCd() {
        return rsnCd;
    }

    /**
     * Sets the value of the rsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCancellationRejection1Code }
     *     
     */
    public RejectedCancellationJustification setRsnCd(PaymentCancellationRejection1Code value) {
        this.rsnCd = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RejectedCancellationJustification setRsn(String value) {
        this.rsn = value;
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
