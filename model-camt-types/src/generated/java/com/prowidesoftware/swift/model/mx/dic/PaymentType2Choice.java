
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
 * Choice beween a payment type from a predefined list and a proprietary payment type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType2Choice", propOrder = {
    "pmtTp",
    "prtryPmtTp"
})
public class PaymentType2Choice {

    @XmlElement(name = "PmtTp")
    @XmlSchemaType(name = "string")
    protected PaymentType3Code pmtTp;
    @XmlElement(name = "PrtryPmtTp")
    protected String prtryPmtTp;

    /**
     * Gets the value of the pmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType3Code }
     *     
     */
    public PaymentType3Code getPmtTp() {
        return pmtTp;
    }

    /**
     * Sets the value of the pmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType3Code }
     *     
     */
    public PaymentType2Choice setPmtTp(PaymentType3Code value) {
        this.pmtTp = value;
        return this;
    }

    /**
     * Gets the value of the prtryPmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryPmtTp() {
        return prtryPmtTp;
    }

    /**
     * Sets the value of the prtryPmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentType2Choice setPrtryPmtTp(String value) {
        this.prtryPmtTp = value;
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
