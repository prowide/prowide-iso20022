
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
 * Set of elements used to identify a person or an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification76", propOrder = {
    "id",
    "ctryOfBrnch"
})
public class PartyIdentification76 {

    @XmlElement(name = "Id", required = true)
    protected PersonOrOrganisation1Choice id;
    @XmlElement(name = "CtryOfBrnch")
    protected String ctryOfBrnch;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PersonOrOrganisation1Choice }
     *     
     */
    public PersonOrOrganisation1Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonOrOrganisation1Choice }
     *     
     */
    public PartyIdentification76 setId(PersonOrOrganisation1Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfBrnch() {
        return ctryOfBrnch;
    }

    /**
     * Sets the value of the ctryOfBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification76 setCtryOfBrnch(String value) {
        this.ctryOfBrnch = value;
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
