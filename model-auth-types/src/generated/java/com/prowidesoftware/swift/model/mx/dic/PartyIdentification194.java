
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
 * Specifies the identification of an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification194", propOrder = {
    "lei",
    "ntlRegnNb",
    "altrnId",
    "nm",
    "ctryOfDmcl"
})
public class PartyIdentification194 {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "NtlRegnNb", required = true)
    protected GenericOrganisationIdentification1 ntlRegnNb;
    @XmlElement(name = "AltrnId")
    protected GenericOrganisationIdentification1 altrnId;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "CtryOfDmcl")
    protected String ctryOfDmcl;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification194 setLEI(String value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the ntlRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericOrganisationIdentification1 }
     *     
     */
    public GenericOrganisationIdentification1 getNtlRegnNb() {
        return ntlRegnNb;
    }

    /**
     * Sets the value of the ntlRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericOrganisationIdentification1 }
     *     
     */
    public PartyIdentification194 setNtlRegnNb(GenericOrganisationIdentification1 value) {
        this.ntlRegnNb = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericOrganisationIdentification1 }
     *     
     */
    public GenericOrganisationIdentification1 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericOrganisationIdentification1 }
     *     
     */
    public PartyIdentification194 setAltrnId(GenericOrganisationIdentification1 value) {
        this.altrnId = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification194 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfDmcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfDmcl() {
        return ctryOfDmcl;
    }

    /**
     * Sets the value of the ctryOfDmcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification194 setCtryOfDmcl(String value) {
        this.ctryOfDmcl = value;
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
