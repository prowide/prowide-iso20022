
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
 * Identifier of a token provider requestor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTokenIdentifiers1", propOrder = {
    "prvdrId",
    "rqstrId"
})
public class PaymentTokenIdentifiers1 {

    @XmlElement(name = "PrvdrId", required = true)
    protected String prvdrId;
    @XmlElement(name = "RqstrId", required = true)
    protected String rqstrId;

    /**
     * Gets the value of the prvdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdrId() {
        return prvdrId;
    }

    /**
     * Sets the value of the prvdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTokenIdentifiers1 setPrvdrId(String value) {
        this.prvdrId = value;
        return this;
    }

    /**
     * Gets the value of the rqstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstrId() {
        return rqstrId;
    }

    /**
     * Sets the value of the rqstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTokenIdentifiers1 setRqstrId(String value) {
        this.rqstrId = value;
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
