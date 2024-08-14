
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
 * Indication whether a derivative contract is tranched.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrancheIndicator2Choice", propOrder = {
    "trnchd",
    "utrnchd"
})
public class TrancheIndicator2Choice {

    @XmlElement(name = "Trnchd")
    protected Tranche2 trnchd;
    @XmlElement(name = "Utrnchd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode utrnchd;

    /**
     * Gets the value of the trnchd property.
     * 
     * @return
     *     possible object is
     *     {@link Tranche2 }
     *     
     */
    public Tranche2 getTrnchd() {
        return trnchd;
    }

    /**
     * Sets the value of the trnchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tranche2 }
     *     
     */
    public TrancheIndicator2Choice setTrnchd(Tranche2 value) {
        this.trnchd = value;
        return this;
    }

    /**
     * Gets the value of the utrnchd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getUtrnchd() {
        return utrnchd;
    }

    /**
     * Sets the value of the utrnchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public TrancheIndicator2Choice setUtrnchd(NoReasonCode value) {
        this.utrnchd = value;
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
