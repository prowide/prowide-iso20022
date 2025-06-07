
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
 * Specifies the central counterparty clearing time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingPartyAndTime21Choice", propOrder = {
    "rsn",
    "dtls"
})
public class ClearingPartyAndTime21Choice {

    @XmlElement(name = "Rsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode rsn;
    @XmlElement(name = "Dtls")
    protected ClearingPartyAndTime22 dtls;

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
    public ClearingPartyAndTime21Choice setRsn(NoReasonCode value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the dtls property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingPartyAndTime22 }
     *     
     */
    public ClearingPartyAndTime22 getDtls() {
        return dtls;
    }

    /**
     * Sets the value of the dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingPartyAndTime22 }
     *     
     */
    public ClearingPartyAndTime21Choice setDtls(ClearingPartyAndTime22 value) {
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
