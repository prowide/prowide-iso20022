
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
 * Choice between formats for the entity to which the financial instruments are pledged.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PledgeeFormat5Choice", propOrder = {
    "tpAndId",
    "id",
    "prtry"
})
public class PledgeeFormat5Choice {

    @XmlElement(name = "TpAndId")
    protected PledgeeTypeAndAnyBICIdentifier2 tpAndId;
    @XmlElement(name = "Id")
    protected PledgeeTypeAndText1 id;
    @XmlElement(name = "Prtry")
    protected GenericIdentification80 prtry;

    /**
     * Gets the value of the tpAndId property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeeTypeAndAnyBICIdentifier2 }
     *     
     */
    public PledgeeTypeAndAnyBICIdentifier2 getTpAndId() {
        return tpAndId;
    }

    /**
     * Sets the value of the tpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeeTypeAndAnyBICIdentifier2 }
     *     
     */
    public PledgeeFormat5Choice setTpAndId(PledgeeTypeAndAnyBICIdentifier2 value) {
        this.tpAndId = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeeTypeAndText1 }
     *     
     */
    public PledgeeTypeAndText1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeeTypeAndText1 }
     *     
     */
    public PledgeeFormat5Choice setId(PledgeeTypeAndText1 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification80 }
     *     
     */
    public GenericIdentification80 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification80 }
     *     
     */
    public PledgeeFormat5Choice setPrtry(GenericIdentification80 value) {
        this.prtry = value;
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
