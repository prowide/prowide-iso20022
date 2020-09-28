
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
 * PartySEPAChoice_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartySEPAChoice_DFU1", propOrder = {
    "orgId",
    "prvtId"
})
public class PartySEPAChoiceDFU1 {

    @XmlElement(name = "OrgId")
    protected OrganisationIdentificationSEPAChoiceDFU1 orgId;
    @XmlElement(name = "PrvtId")
    protected PersonIdentificationSEPA1ChoiceDFU1 prvtId;

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentificationSEPAChoiceDFU1 }
     *     
     */
    public OrganisationIdentificationSEPAChoiceDFU1 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentificationSEPAChoiceDFU1 }
     *     
     */
    public PartySEPAChoiceDFU1 setOrgId(OrganisationIdentificationSEPAChoiceDFU1 value) {
        this.orgId = value;
        return this;
    }

    /**
     * Gets the value of the prvtId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationSEPA1ChoiceDFU1 }
     *     
     */
    public PersonIdentificationSEPA1ChoiceDFU1 getPrvtId() {
        return prvtId;
    }

    /**
     * Sets the value of the prvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationSEPA1ChoiceDFU1 }
     *     
     */
    public PartySEPAChoiceDFU1 setPrvtId(PersonIdentificationSEPA1ChoiceDFU1 value) {
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
