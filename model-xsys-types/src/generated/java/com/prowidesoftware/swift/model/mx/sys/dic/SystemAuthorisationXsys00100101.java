
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
 * Java class for SystemAuthorisation complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemAuthorisation", propOrder = {
    "authstn"
})
public class SystemAuthorisationXsys00100101 {

    @XmlElement(name = "Authstn", required = true)
    protected AuthorisationXsys00100101 authstn;

    /**
     * Gets the value of the authstn property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationXsys00100101 }
     *     
     */
    public AuthorisationXsys00100101 getAuthstn() {
        return authstn;
    }

    /**
     * Sets the value of the authstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationXsys00100101 }
     *     
     */
    public SystemAuthorisationXsys00100101 setAuthstn(AuthorisationXsys00100101 value) {
        this.authstn = value;
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
