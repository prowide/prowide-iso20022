
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
@XmlType(name = "OwnerIdentification1Choice", propOrder = {
    "indvOwnrId",
    "orgOwnrId"
})
public class OwnerIdentification1Choice {

    @XmlElement(name = "IndvOwnrId")
    protected IndividualPersonIdentificationChoice indvOwnrId;
    @XmlElement(name = "OrgOwnrId")
    protected PartyIdentification5Choice orgOwnrId;

    /**
     * Gets the value of the indvOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPersonIdentificationChoice }
     *     
     */
    public IndividualPersonIdentificationChoice getIndvOwnrId() {
        return indvOwnrId;
    }

    /**
     * Sets the value of the indvOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPersonIdentificationChoice }
     *     
     */
    public OwnerIdentification1Choice setIndvOwnrId(IndividualPersonIdentificationChoice value) {
        this.indvOwnrId = value;
        return this;
    }

    /**
     * Gets the value of the orgOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification5Choice }
     *     
     */
    public PartyIdentification5Choice getOrgOwnrId() {
        return orgOwnrId;
    }

    /**
     * Sets the value of the orgOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification5Choice }
     *     
     */
    public OwnerIdentification1Choice setOrgOwnrId(PartyIdentification5Choice value) {
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
