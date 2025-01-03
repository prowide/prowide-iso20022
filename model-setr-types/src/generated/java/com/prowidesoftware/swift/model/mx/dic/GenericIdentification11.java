
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to an identification, eg, party identification or account identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericIdentification11", propOrder = {
    "id",
    "idTp",
    "xtndedIdTp",
    "issr"
})
public class GenericIdentification11 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IdTp")
    @XmlSchemaType(name = "string")
    protected PersonIdentificationType2Code idTp;
    @XmlElement(name = "XtndedIdTp")
    protected String xtndedIdTp;
    @XmlElement(name = "Issr")
    protected String issr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GenericIdentification11 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the idTp property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationType2Code }
     *     
     */
    public PersonIdentificationType2Code getIdTp() {
        return idTp;
    }

    /**
     * Sets the value of the idTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationType2Code }
     *     
     */
    public GenericIdentification11 setIdTp(PersonIdentificationType2Code value) {
        this.idTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedIdTp() {
        return xtndedIdTp;
    }

    /**
     * Sets the value of the xtndedIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GenericIdentification11 setXtndedIdTp(String value) {
        this.xtndedIdTp = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GenericIdentification11 setIssr(String value) {
        this.issr = value;
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
