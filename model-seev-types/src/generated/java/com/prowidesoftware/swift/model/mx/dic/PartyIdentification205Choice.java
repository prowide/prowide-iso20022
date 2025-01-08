
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
 * Identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification205Choice", propOrder = {
    "lglPrsn",
    "ntrlPrsn"
})
public class PartyIdentification205Choice {

    @XmlElement(name = "LglPrsn")
    protected PartyIdentification201 lglPrsn;
    @XmlElement(name = "NtrlPrsn")
    protected PartyIdentification202 ntrlPrsn;

    /**
     * Gets the value of the lglPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification201 }
     *     
     */
    public PartyIdentification201 getLglPrsn() {
        return lglPrsn;
    }

    /**
     * Sets the value of the lglPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification201 }
     *     
     */
    public PartyIdentification205Choice setLglPrsn(PartyIdentification201 value) {
        this.lglPrsn = value;
        return this;
    }

    /**
     * Gets the value of the ntrlPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification202 }
     *     
     */
    public PartyIdentification202 getNtrlPrsn() {
        return ntrlPrsn;
    }

    /**
     * Sets the value of the ntrlPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification202 }
     *     
     */
    public PartyIdentification205Choice setNtrlPrsn(PartyIdentification202 value) {
        this.ntrlPrsn = value;
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
