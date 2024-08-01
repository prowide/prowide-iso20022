
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
 * Elements indicating the direction of the derivative transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Direction2", propOrder = {
    "drctnOfTheFrstLeg",
    "drctnOfTheScndLeg"
})
public class Direction2 {

    @XmlElement(name = "DrctnOfTheFrstLeg", required = true)
    @XmlSchemaType(name = "string")
    protected OptionParty3Code drctnOfTheFrstLeg;
    @XmlElement(name = "DrctnOfTheScndLeg")
    @XmlSchemaType(name = "string")
    protected OptionParty3Code drctnOfTheScndLeg;

    /**
     * Gets the value of the drctnOfTheFrstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty3Code }
     *     
     */
    public OptionParty3Code getDrctnOfTheFrstLeg() {
        return drctnOfTheFrstLeg;
    }

    /**
     * Sets the value of the drctnOfTheFrstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty3Code }
     *     
     */
    public Direction2 setDrctnOfTheFrstLeg(OptionParty3Code value) {
        this.drctnOfTheFrstLeg = value;
        return this;
    }

    /**
     * Gets the value of the drctnOfTheScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty3Code }
     *     
     */
    public OptionParty3Code getDrctnOfTheScndLeg() {
        return drctnOfTheScndLeg;
    }

    /**
     * Sets the value of the drctnOfTheScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty3Code }
     *     
     */
    public Direction2 setDrctnOfTheScndLeg(OptionParty3Code value) {
        this.drctnOfTheScndLeg = value;
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
