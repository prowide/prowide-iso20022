
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
 * Specifies the identification of a person or an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party52Choice", propOrder = {
    "orgId",
    "prvtId"
})
public class Party52Choice {

    @XmlElement(name = "OrgId")
    protected OrganisationIdentification39 orgId;
    @XmlElement(name = "PrvtId")
    protected PersonIdentification18 prvtId;

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification39 }
     *     
     */
    public OrganisationIdentification39 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification39 }
     *     
     */
    public Party52Choice setOrgId(OrganisationIdentification39 value) {
        this.orgId = value;
        return this;
    }

    /**
     * Gets the value of the prvtId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification18 }
     *     
     */
    public PersonIdentification18 getPrvtId() {
        return prvtId;
    }

    /**
     * Sets the value of the prvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification18 }
     *     
     */
    public Party52Choice setPrvtId(PersonIdentification18 value) {
        this.prvtId = value;
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
