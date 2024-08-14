
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
 * Identifies the reporting counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyIdentification11", propOrder = {
    "id",
    "ntr",
    "brnch",
    "sd"
})
public class CounterpartyIdentification11 {

    @XmlElement(name = "Id", required = true)
    protected OrganisationIdentification15Choice id;
    @XmlElement(name = "Ntr")
    protected CounterpartyTradeNature7Choice ntr;
    @XmlElement(name = "Brnch")
    protected Branch5Choice brnch;
    @XmlElement(name = "Sd")
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code sd;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public CounterpartyIdentification11 setId(OrganisationIdentification15Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ntr property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyTradeNature7Choice }
     *     
     */
    public CounterpartyTradeNature7Choice getNtr() {
        return ntr;
    }

    /**
     * Sets the value of the ntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyTradeNature7Choice }
     *     
     */
    public CounterpartyIdentification11 setNtr(CounterpartyTradeNature7Choice value) {
        this.ntr = value;
        return this;
    }

    /**
     * Gets the value of the brnch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch5Choice }
     *     
     */
    public Branch5Choice getBrnch() {
        return brnch;
    }

    /**
     * Sets the value of the brnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch5Choice }
     *     
     */
    public CounterpartyIdentification11 setBrnch(Branch5Choice value) {
        this.brnch = value;
        return this;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CounterpartyIdentification11 setSd(CollateralRole1Code value) {
        this.sd = value;
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
