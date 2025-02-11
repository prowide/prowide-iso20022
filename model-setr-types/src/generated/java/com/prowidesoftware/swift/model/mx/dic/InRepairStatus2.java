
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
 * Status is in repair.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InRepairStatus2", propOrder = {
    "rsnDtls",
    "noSpcfdRsn"
})
public class InRepairStatus2 {

    @XmlElement(name = "RsnDtls")
    protected InRepairStatusReason3 rsnDtls;
    @XmlElement(name = "NoSpcfdRsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noSpcfdRsn;

    /**
     * Gets the value of the rsnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InRepairStatusReason3 }
     *     
     */
    public InRepairStatusReason3 getRsnDtls() {
        return rsnDtls;
    }

    /**
     * Sets the value of the rsnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InRepairStatusReason3 }
     *     
     */
    public InRepairStatus2 setRsnDtls(InRepairStatusReason3 value) {
        this.rsnDtls = value;
        return this;
    }

    /**
     * Gets the value of the noSpcfdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNoSpcfdRsn() {
        return noSpcfdRsn;
    }

    /**
     * Sets the value of the noSpcfdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public InRepairStatus2 setNoSpcfdRsn(NoReasonCode value) {
        this.noSpcfdRsn = value;
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
