
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
 * Choice number format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Number24Choice", propOrder = {
    "nbId",
    "prtry"
})
public class Number24Choice {

    @XmlElement(name = "NbId")
    protected String nbId;
    @XmlElement(name = "Prtry")
    protected GenericIdentification36 prtry;

    /**
     * Gets the value of the nbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbId() {
        return nbId;
    }

    /**
     * Sets the value of the nbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Number24Choice setNbId(String value) {
        this.nbId = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public Number24Choice setPrtry(GenericIdentification36 value) {
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
