
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Alternate identification of a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateIdentification2", propOrder = {
    "id",
    "idSrc"
})
public class AlternateIdentification2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IdSrc", required = true)
    protected IdentificationSource2Choice idSrc;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AlternateIdentification2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the idSrc property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationSource2Choice }
     *     
     */
    public IdentificationSource2Choice getIdSrc() {
        return idSrc;
    }

    /**
     * Sets the value of the idSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationSource2Choice }
     *     
     */
    public AlternateIdentification2 setIdSrc(IdentificationSource2Choice value) {
        this.idSrc = value;
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
