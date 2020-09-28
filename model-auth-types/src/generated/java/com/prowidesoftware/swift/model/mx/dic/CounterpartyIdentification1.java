
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to counterparty identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyIdentification1", propOrder = {
    "id",
    "ntr",
    "brnch",
    "sd"
})
public class CounterpartyIdentification1 {

    @XmlElement(name = "Id", required = true)
    protected OrganisationIdentification9Choice id;
    @XmlElement(name = "Ntr")
    protected CounterpartyTradeNature3Choice ntr;
    @XmlElement(name = "Brnch")
    protected Branch2Choice brnch;
    @XmlElement(name = "Sd")
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code sd;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public CounterpartyIdentification1 setId(OrganisationIdentification9Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ntr property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyTradeNature3Choice }
     *     
     */
    public CounterpartyTradeNature3Choice getNtr() {
        return ntr;
    }

    /**
     * Sets the value of the ntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyTradeNature3Choice }
     *     
     */
    public CounterpartyIdentification1 setNtr(CounterpartyTradeNature3Choice value) {
        this.ntr = value;
        return this;
    }

    /**
     * Gets the value of the brnch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch2Choice }
     *     
     */
    public Branch2Choice getBrnch() {
        return brnch;
    }

    /**
     * Sets the value of the brnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch2Choice }
     *     
     */
    public CounterpartyIdentification1 setBrnch(Branch2Choice value) {
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
    public CounterpartyIdentification1 setSd(CollateralRole1Code value) {
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
