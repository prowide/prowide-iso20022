
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
@XmlType(name = "Pledgee2", propOrder = {
    "pldgeeTpAndId",
    "lei"
})
public class Pledgee2 {

    @XmlElement(name = "PldgeeTpAndId")
    protected PledgeeFormat4Choice pldgeeTpAndId;
    @XmlElement(name = "LEI")
    protected String lei;

    /**
     * Gets the value of the pldgeeTpAndId property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeeFormat4Choice }
     *     
     */
    public PledgeeFormat4Choice getPldgeeTpAndId() {
        return pldgeeTpAndId;
    }

    /**
     * Sets the value of the pldgeeTpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeeFormat4Choice }
     *     
     */
    public Pledgee2 setPldgeeTpAndId(PledgeeFormat4Choice value) {
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
    public Pledgee2 setLEI(String value) {
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
