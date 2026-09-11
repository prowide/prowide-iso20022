
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
 * Instruction has been received and accepted by the issuer or offeror.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivedByIssuerOrOfferorStatus1", propOrder = {
    "accptdByIssrQty",
    "rcvdByIssrOrOfferrRsn"
})
public class ReceivedByIssuerOrOfferorStatus1 {

    @XmlElement(name = "AccptdByIssrQty")
    protected Quantity51Choice accptdByIssrQty;
    @XmlElement(name = "RcvdByIssrOrOfferrRsn", required = true)
    protected NoSpecifiedReason1 rcvdByIssrOrOfferrRsn;

    /**
     * Gets the value of the accptdByIssrQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getAccptdByIssrQty() {
        return accptdByIssrQty;
    }

    /**
     * Sets the value of the accptdByIssrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public ReceivedByIssuerOrOfferorStatus1 setAccptdByIssrQty(Quantity51Choice value) {
        this.accptdByIssrQty = value;
        return this;
    }

    /**
     * Gets the value of the rcvdByIssrOrOfferrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getRcvdByIssrOrOfferrRsn() {
        return rcvdByIssrOrOfferrRsn;
    }

    /**
     * Sets the value of the rcvdByIssrOrOfferrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public ReceivedByIssuerOrOfferorStatus1 setRcvdByIssrOrOfferrRsn(NoSpecifiedReason1 value) {
        this.rcvdByIssrOrOfferrRsn = value;
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
