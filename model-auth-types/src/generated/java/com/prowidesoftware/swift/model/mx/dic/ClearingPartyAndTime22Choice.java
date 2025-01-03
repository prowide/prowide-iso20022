
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
 * Specifies the central counterparty intended clearing time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingPartyAndTime22Choice", propOrder = {
    "rsn",
    "dtls"
})
public class ClearingPartyAndTime22Choice {

    @XmlElement(name = "Rsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode rsn;
    @XmlElement(name = "Dtls")
    protected ClearingPartyAndTime23 dtls;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public ClearingPartyAndTime22Choice setRsn(NoReasonCode value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the dtls property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingPartyAndTime23 }
     *     
     */
    public ClearingPartyAndTime23 getDtls() {
        return dtls;
    }

    /**
     * Sets the value of the dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingPartyAndTime23 }
     *     
     */
    public ClearingPartyAndTime22Choice setDtls(ClearingPartyAndTime23 value) {
        this.dtls = value;
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
