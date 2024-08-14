
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
 * Identifies an organisation through client identification, a name and a domicile.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification38", propOrder = {
    "id",
    "nm",
    "dmcl"
})
public class OrganisationIdentification38 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification175 id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Dmcl")
    protected String dmcl;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification175 }
     *     
     */
    public GenericIdentification175 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification175 }
     *     
     */
    public OrganisationIdentification38 setId(GenericIdentification175 value) {
        this.id = value;
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
    public OrganisationIdentification38 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the dmcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmcl() {
        return dmcl;
    }

    /**
     * Sets the value of the dmcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification38 setDmcl(String value) {
        this.dmcl = value;
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
