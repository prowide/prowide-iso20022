
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
@XmlType(name = "PledgeeFormat4Choice", propOrder = {
    "tpAndId",
    "id",
    "prtry"
})
public class PledgeeFormat4Choice {

    @XmlElement(name = "TpAndId")
    protected PledgeeTypeAndAnyBICIdentifier1 tpAndId;
    @XmlElement(name = "Id")
    protected PledgeeTypeAndText2 id;
    @XmlElement(name = "Prtry")
    protected GenericIdentification85 prtry;

    /**
     * Gets the value of the tpAndId property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeeTypeAndAnyBICIdentifier1 }
     *     
     */
    public PledgeeTypeAndAnyBICIdentifier1 getTpAndId() {
        return tpAndId;
    }

    /**
     * Sets the value of the tpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeeTypeAndAnyBICIdentifier1 }
     *     
     */
    public PledgeeFormat4Choice setTpAndId(PledgeeTypeAndAnyBICIdentifier1 value) {
        this.tpAndId = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeeTypeAndText2 }
     *     
     */
    public PledgeeTypeAndText2 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeeTypeAndText2 }
     *     
     */
    public PledgeeFormat4Choice setId(PledgeeTypeAndText2 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification85 }
     *     
     */
    public GenericIdentification85 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification85 }
     *     
     */
    public PledgeeFormat4Choice setPrtry(GenericIdentification85 value) {
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
