
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
 * Identification of an organisation or a financial institution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party27Choice", propOrder = {
    "orgId",
    "fiId"
})
public class Party27Choice {

    @XmlElement(name = "OrgId")
    protected OrganisationIdentification14 orgId;
    @XmlElement(name = "FIId")
    protected FinancialInstitutionIdentification14 fiId;

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification14 }
     *     
     */
    public OrganisationIdentification14 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification14 }
     *     
     */
    public Party27Choice setOrgId(OrganisationIdentification14 value) {
        this.orgId = value;
        return this;
    }

    /**
     * Gets the value of the fiId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification14 }
     *     
     */
    public FinancialInstitutionIdentification14 getFIId() {
        return fiId;
    }

    /**
     * Sets the value of the fiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification14 }
     *     
     */
    public Party27Choice setFIId(FinancialInstitutionIdentification14 value) {
        this.fiId = value;
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
