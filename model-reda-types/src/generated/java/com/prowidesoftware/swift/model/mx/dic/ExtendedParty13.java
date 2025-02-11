
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
 * Other type of party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedParty13", propOrder = {
    "ptyRole",
    "othrPtyDtls"
})
public class ExtendedParty13 {

    @XmlElement(name = "PtyRole", required = true)
    protected GenericIdentification36 ptyRole;
    @XmlElement(name = "OthrPtyDtls", required = true)
    protected ContactAttributes5 othrPtyDtls;

    /**
     * Gets the value of the ptyRole property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getPtyRole() {
        return ptyRole;
    }

    /**
     * Sets the value of the ptyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public ExtendedParty13 setPtyRole(GenericIdentification36 value) {
        this.ptyRole = value;
        return this;
    }

    /**
     * Gets the value of the othrPtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getOthrPtyDtls() {
        return othrPtyDtls;
    }

    /**
     * Sets the value of the othrPtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ExtendedParty13 setOthrPtyDtls(ContactAttributes5 value) {
        this.othrPtyDtls = value;
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
