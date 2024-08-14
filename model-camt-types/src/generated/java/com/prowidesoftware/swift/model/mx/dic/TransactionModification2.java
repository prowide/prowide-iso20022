
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
 * Contains the requested modifications.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionModification2", propOrder = {
    "pmtId",
    "newPmtValSet"
})
public class TransactionModification2 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification4Choice pmtId;
    @XmlElement(name = "NewPmtValSet", required = true)
    protected PaymentInstruction2 newPmtValSet;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification4Choice }
     *     
     */
    public PaymentIdentification4Choice getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification4Choice }
     *     
     */
    public TransactionModification2 setPmtId(PaymentIdentification4Choice value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the newPmtValSet property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstruction2 }
     *     
     */
    public PaymentInstruction2 getNewPmtValSet() {
        return newPmtValSet;
    }

    /**
     * Sets the value of the newPmtValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstruction2 }
     *     
     */
    public TransactionModification2 setNewPmtValSet(PaymentInstruction2 value) {
        this.newPmtValSet = value;
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
