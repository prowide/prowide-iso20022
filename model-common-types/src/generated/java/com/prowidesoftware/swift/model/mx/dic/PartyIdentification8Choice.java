
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
 * Identification of a party by a choice between a BIC or a name and address.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification8Choice", propOrder = {
    "nmAndAdr",
    "bicOrBEI"
})
public class PartyIdentification8Choice {

    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress8 nmAndAdr;
    @XmlElement(name = "BICOrBEI")
    protected PartyIdentification22 bicOrBEI;

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress8 }
     *     
     */
    public NameAndAddress8 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress8 }
     *     
     */
    public PartyIdentification8Choice setNmAndAdr(NameAndAddress8 value) {
        this.nmAndAdr = value;
        return this;
    }

    /**
     * Gets the value of the bicOrBEI property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification22 }
     *     
     */
    public PartyIdentification22 getBICOrBEI() {
        return bicOrBEI;
    }

    /**
     * Sets the value of the bicOrBEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification22 }
     *     
     */
    public PartyIdentification8Choice setBICOrBEI(PartyIdentification22 value) {
        this.bicOrBEI = value;
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
