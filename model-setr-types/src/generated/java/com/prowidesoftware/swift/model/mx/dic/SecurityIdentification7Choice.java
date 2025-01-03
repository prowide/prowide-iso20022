
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
 * Choice between formats for the identification of a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification7Choice", propOrder = {
    "isin",
    "othrPrtryId"
})
public class SecurityIdentification7Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "OthrPrtryId")
    protected AlternateSecurityIdentification4 othrPrtryId;

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
    public SecurityIdentification7Choice setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the othrPrtryId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateSecurityIdentification4 }
     *     
     */
    public AlternateSecurityIdentification4 getOthrPrtryId() {
        return othrPrtryId;
    }

    /**
     * Sets the value of the othrPrtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateSecurityIdentification4 }
     *     
     */
    public SecurityIdentification7Choice setOthrPrtryId(AlternateSecurityIdentification4 value) {
        this.othrPrtryId = value;
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
