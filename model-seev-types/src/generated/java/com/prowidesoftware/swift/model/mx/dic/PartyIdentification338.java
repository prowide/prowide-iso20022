
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
@XmlType(name = "PartyIdentification338", propOrder = {
    "lglPrsn",
    "blckgRef"
})
public class PartyIdentification338 {

    @XmlElement(name = "LglPrsn")
    protected PartyIdentification335Choice lglPrsn;
    @XmlElement(name = "BlckgRef")
    protected String blckgRef;

    /**
     * Gets the value of the lglPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification335Choice }
     *     
     */
    public PartyIdentification335Choice getLglPrsn() {
        return lglPrsn;
    }

    /**
     * Sets the value of the lglPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification335Choice }
     *     
     */
    public PartyIdentification338 setLglPrsn(PartyIdentification335Choice value) {
        this.lglPrsn = value;
        return this;
    }

    /**
     * Gets the value of the blckgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlckgRef() {
        return blckgRef;
    }

    /**
     * Sets the value of the blckgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification338 setBlckgRef(String value) {
        this.blckgRef = value;
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
