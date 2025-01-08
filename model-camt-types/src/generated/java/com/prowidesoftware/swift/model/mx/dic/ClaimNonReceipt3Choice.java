
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
 * Specifies whether the claim non receipt is accepted or rejected.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimNonReceipt3Choice", propOrder = {
    "accptd",
    "rjctd"
})
public class ClaimNonReceipt3Choice {

    @XmlElement(name = "Accptd")
    protected ClaimNonReceipt3 accptd;
    @XmlElement(name = "Rjctd")
    protected ClaimNonReceiptRejectReason1Choice rjctd;

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimNonReceipt3 }
     *     
     */
    public ClaimNonReceipt3 getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimNonReceipt3 }
     *     
     */
    public ClaimNonReceipt3Choice setAccptd(ClaimNonReceipt3 value) {
        this.accptd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimNonReceiptRejectReason1Choice }
     *     
     */
    public ClaimNonReceiptRejectReason1Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimNonReceiptRejectReason1Choice }
     *     
     */
    public ClaimNonReceipt3Choice setRjctd(ClaimNonReceiptRejectReason1Choice value) {
        this.rjctd = value;
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
