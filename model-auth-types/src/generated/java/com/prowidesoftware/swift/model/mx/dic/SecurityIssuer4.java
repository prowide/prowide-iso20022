
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
 * Specifies the identification of the issuer of a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIssuer4", propOrder = {
    "id",
    "jursdctnCtry"
})
public class SecurityIssuer4 {

    @XmlElement(name = "Id")
    protected OrganisationIdentification15Choice id;
    @XmlElement(name = "JursdctnCtry", required = true)
    protected String jursdctnCtry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public SecurityIssuer4 setId(OrganisationIdentification15Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the jursdctnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJursdctnCtry() {
        return jursdctnCtry;
    }

    /**
     * Sets the value of the jursdctnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIssuer4 setJursdctnCtry(String value) {
        this.jursdctnCtry = value;
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
