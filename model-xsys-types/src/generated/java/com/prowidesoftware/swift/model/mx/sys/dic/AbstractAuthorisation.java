
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for AbstractAuthorisation complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAuthorisation", propOrder = {
    "authstnSts"
})
public class AbstractAuthorisation {

    @XmlElement(name = "AuthstnSts", required = true)
    @XmlSchemaType(name = "string")
    protected AuthorisationStatusCode authstnSts;

    /**
     * Gets the value of the authstnSts property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationStatusCode }
     *     
     */
    public AuthorisationStatusCode getAuthstnSts() {
        return authstnSts;
    }

    /**
     * Sets the value of the authstnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationStatusCode }
     *     
     */
    public AbstractAuthorisation setAuthstnSts(AuthorisationStatusCode value) {
        this.authstnSts = value;
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
