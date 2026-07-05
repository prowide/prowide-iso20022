
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
 * Java class for RefusalNotification complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefusalNotification", propOrder = {
    "authstnRfslNtfctn"
})
public class RefusalNotification {

    @XmlElement(name = "AuthstnRfslNtfctn", required = true)
    protected RefusalReasonNotification authstnRfslNtfctn;

    /**
     * Gets the value of the authstnRfslNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link RefusalReasonNotification }
     *     
     */
    public RefusalReasonNotification getAuthstnRfslNtfctn() {
        return authstnRfslNtfctn;
    }

    /**
     * Sets the value of the authstnRfslNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefusalReasonNotification }
     *     
     */
    public RefusalNotification setAuthstnRfslNtfctn(RefusalReasonNotification value) {
        this.authstnRfslNtfctn = value;
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
