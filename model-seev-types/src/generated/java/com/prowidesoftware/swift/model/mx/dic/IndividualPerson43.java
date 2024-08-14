
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
 * Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPerson43", propOrder = {
    "prssgndPrxy",
    "emplngPty"
})
public class IndividualPerson43 {

    @XmlElement(name = "PrssgndPrxy")
    protected PartyIdentification232Choice prssgndPrxy;
    @XmlElement(name = "EmplngPty")
    protected PartyIdentification129Choice emplngPty;

    /**
     * Gets the value of the prssgndPrxy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public PartyIdentification232Choice getPrssgndPrxy() {
        return prssgndPrxy;
    }

    /**
     * Sets the value of the prssgndPrxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public IndividualPerson43 setPrssgndPrxy(PartyIdentification232Choice value) {
        this.prssgndPrxy = value;
        return this;
    }

    /**
     * Gets the value of the emplngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public PartyIdentification129Choice getEmplngPty() {
        return emplngPty;
    }

    /**
     * Sets the value of the emplngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public IndividualPerson43 setEmplngPty(PartyIdentification129Choice value) {
        this.emplngPty = value;
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
