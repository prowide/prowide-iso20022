
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
 * Provides the identification of the organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification260Choice", propOrder = {
    "lglPrsn",
    "ntrlPrsn"
})
public class PartyIdentification260Choice {

    @XmlElement(name = "LglPrsn")
    protected OrganisationIdentification49 lglPrsn;
    @XmlElement(name = "NtrlPrsn")
    protected NaturalPersonIdentification5 ntrlPrsn;

    /**
     * Gets the value of the lglPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification49 }
     *     
     */
    public OrganisationIdentification49 getLglPrsn() {
        return lglPrsn;
    }

    /**
     * Sets the value of the lglPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification49 }
     *     
     */
    public PartyIdentification260Choice setLglPrsn(OrganisationIdentification49 value) {
        this.lglPrsn = value;
        return this;
    }

    /**
     * Gets the value of the ntrlPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalPersonIdentification5 }
     *     
     */
    public NaturalPersonIdentification5 getNtrlPrsn() {
        return ntrlPrsn;
    }

    /**
     * Sets the value of the ntrlPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalPersonIdentification5 }
     *     
     */
    public PartyIdentification260Choice setNtrlPrsn(NaturalPersonIdentification5 value) {
        this.ntrlPrsn = value;
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
