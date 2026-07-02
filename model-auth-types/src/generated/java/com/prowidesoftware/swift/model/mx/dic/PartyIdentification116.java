
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
 * Unique identification, as assigned by an organisation, to unambiguously identify a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification116", propOrder = {
    "ptyId",
    "lglOrg",
    "taxPty"
})
public class PartyIdentification116 {

    @XmlElement(name = "PtyId", required = true)
    protected OrganisationIdentification28 ptyId;
    @XmlElement(name = "LglOrg")
    protected LegalOrganisation1 lglOrg;
    @XmlElement(name = "TaxPty")
    protected TaxParty1 taxPty;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification28 }
     *     
     */
    public OrganisationIdentification28 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification28 }
     *     
     */
    public PartyIdentification116 setPtyId(OrganisationIdentification28 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the lglOrg property.
     * 
     * @return
     *     possible object is
     *     {@link LegalOrganisation1 }
     *     
     */
    public LegalOrganisation1 getLglOrg() {
        return lglOrg;
    }

    /**
     * Sets the value of the lglOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalOrganisation1 }
     *     
     */
    public PartyIdentification116 setLglOrg(LegalOrganisation1 value) {
        this.lglOrg = value;
        return this;
    }

    /**
     * Gets the value of the taxPty property.
     * 
     * @return
     *     possible object is
     *     {@link TaxParty1 }
     *     
     */
    public TaxParty1 getTaxPty() {
        return taxPty;
    }

    /**
     * Sets the value of the taxPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxParty1 }
     *     
     */
    public PartyIdentification116 setTaxPty(TaxParty1 value) {
        this.taxPty = value;
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
