
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
 * ISIN and an alternative format for the identification of a security. ISIN is the preferred format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification10Choice", propOrder = {
    "isin",
    "othrId"
})
public class SecurityIdentification10Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "OthrId")
    protected AlternateSecurityIdentification3 othrId;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification10Choice setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the othrId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateSecurityIdentification3 }
     *     
     */
    public AlternateSecurityIdentification3 getOthrId() {
        return othrId;
    }

    /**
     * Sets the value of the othrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateSecurityIdentification3 }
     *     
     */
    public SecurityIdentification10Choice setOthrId(AlternateSecurityIdentification3 value) {
        this.othrId = value;
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
