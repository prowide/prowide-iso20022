
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for AuthorisationNotification complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationNotification", propOrder = {
    "authstnNtfctn"
})
public class AuthorisationNotification {

    @XmlElement(name = "AuthstnNtfctn", required = true)
    protected ToSenderNotification authstnNtfctn;

    /**
     * Gets the value of the authstnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ToSenderNotification }
     *     
     */
    public ToSenderNotification getAuthstnNtfctn() {
        return authstnNtfctn;
    }

    /**
     * Sets the value of the authstnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToSenderNotification }
     *     
     */
    public AuthorisationNotification setAuthstnNtfctn(ToSenderNotification value) {
        this.authstnNtfctn = value;
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
