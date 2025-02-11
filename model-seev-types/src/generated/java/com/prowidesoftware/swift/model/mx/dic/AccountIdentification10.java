
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
 * Provides account identification information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification10", propOrder = {
    "idCd"
})
public class AccountIdentification10 {

    @XmlElement(name = "IdCd", required = true)
    @XmlSchemaType(name = "string")
    protected SafekeepingAccountIdentification1Code idCd;

    /**
     * Gets the value of the idCd property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingAccountIdentification1Code }
     *     
     */
    public SafekeepingAccountIdentification1Code getIdCd() {
        return idCd;
    }

    /**
     * Sets the value of the idCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingAccountIdentification1Code }
     *     
     */
    public AccountIdentification10 setIdCd(SafekeepingAccountIdentification1Code value) {
        this.idCd = value;
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
