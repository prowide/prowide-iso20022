
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
 * Identifies the entity to which the financial instruments are pledged.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pledgee3", propOrder = {
    "pldgeeTpAndId",
    "lei"
})
public class Pledgee3 {

    @XmlElement(name = "PldgeeTpAndId")
    protected PledgeeFormat5Choice pldgeeTpAndId;
    @XmlElement(name = "LEI")
    protected String lei;

    /**
     * Gets the value of the pldgeeTpAndId property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeeFormat5Choice }
     *     
     */
    public PledgeeFormat5Choice getPldgeeTpAndId() {
        return pldgeeTpAndId;
    }

    /**
     * Sets the value of the pldgeeTpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeeFormat5Choice }
     *     
     */
    public Pledgee3 setPldgeeTpAndId(PledgeeFormat5Choice value) {
        this.pldgeeTpAndId = value;
        return this;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Pledgee3 setLEI(String value) {
        this.lei = value;
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
