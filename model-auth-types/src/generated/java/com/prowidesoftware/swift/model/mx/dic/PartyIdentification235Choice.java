
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
 * Provides the identification of the organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification235Choice", propOrder = {
    "lgl",
    "ntrl"
})
public class PartyIdentification235Choice {

    @XmlElement(name = "Lgl")
    protected OrganisationIdentification10Choice lgl;
    @XmlElement(name = "Ntrl")
    protected NaturalPersonIdentification2 ntrl;

    /**
     * Gets the value of the lgl property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification10Choice }
     *     
     */
    public OrganisationIdentification10Choice getLgl() {
        return lgl;
    }

    /**
     * Sets the value of the lgl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification10Choice }
     *     
     */
    public PartyIdentification235Choice setLgl(OrganisationIdentification10Choice value) {
        this.lgl = value;
        return this;
    }

    /**
     * Gets the value of the ntrl property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalPersonIdentification2 }
     *     
     */
    public NaturalPersonIdentification2 getNtrl() {
        return ntrl;
    }

    /**
     * Sets the value of the ntrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalPersonIdentification2 }
     *     
     */
    public PartyIdentification235Choice setNtrl(NaturalPersonIdentification2 value) {
        this.ntrl = value;
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
