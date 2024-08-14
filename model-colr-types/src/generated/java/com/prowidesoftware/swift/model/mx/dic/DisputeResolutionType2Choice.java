
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
 * Choice between a code or a proprietary code as to the nature of the dispute about the collateral amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeResolutionType2Choice", propOrder = {
    "cd",
    "prtryId"
})
public class DisputeResolutionType2Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected DisputeResolutionType2Code cd;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification30 prtryId;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeResolutionType2Code }
     *     
     */
    public DisputeResolutionType2Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResolutionType2Code }
     *     
     */
    public DisputeResolutionType2Choice setCd(DisputeResolutionType2Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public DisputeResolutionType2Choice setPrtryId(GenericIdentification30 value) {
        this.prtryId = value;
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
