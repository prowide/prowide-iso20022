
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
 * Choice of individual or organisation details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerIdentification3Choice", propOrder = {
    "indvOwnrId",
    "orgOwnrId"
})
public class OwnerIdentification3Choice {

    @XmlElement(name = "IndvOwnrId")
    protected IndividualPersonIdentification2Choice indvOwnrId;
    @XmlElement(name = "OrgOwnrId")
    protected PartyIdentification139 orgOwnrId;

    /**
     * Gets the value of the indvOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPersonIdentification2Choice }
     *     
     */
    public IndividualPersonIdentification2Choice getIndvOwnrId() {
        return indvOwnrId;
    }

    /**
     * Sets the value of the indvOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPersonIdentification2Choice }
     *     
     */
    public OwnerIdentification3Choice setIndvOwnrId(IndividualPersonIdentification2Choice value) {
        this.indvOwnrId = value;
        return this;
    }

    /**
     * Gets the value of the orgOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getOrgOwnrId() {
        return orgOwnrId;
    }

    /**
     * Sets the value of the orgOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public OwnerIdentification3Choice setOrgOwnrId(PartyIdentification139 value) {
        this.orgOwnrId = value;
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
