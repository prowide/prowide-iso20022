
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
 * Identification of the entity to which the financial instruments are pledged expressed as a code and a BIC.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PledgeeTypeAndAnyBICIdentifier2", propOrder = {
    "id",
    "pldgeeTp"
})
public class PledgeeTypeAndAnyBICIdentifier2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "PldgeeTp", required = true)
    @XmlSchemaType(name = "string")
    protected PledgeeType1Code pldgeeTp;

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
    public PledgeeTypeAndAnyBICIdentifier2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the pldgeeTp property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeeType1Code }
     *     
     */
    public PledgeeType1Code getPldgeeTp() {
        return pldgeeTp;
    }

    /**
     * Sets the value of the pldgeeTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeeType1Code }
     *     
     */
    public PledgeeTypeAndAnyBICIdentifier2 setPldgeeTp(PledgeeType1Code value) {
        this.pldgeeTp = value;
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
