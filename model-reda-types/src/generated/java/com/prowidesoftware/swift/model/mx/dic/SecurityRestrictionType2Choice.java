
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
 * Choice between the type of restriction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityRestrictionType2Choice", propOrder = {
    "rstrctnTp",
    "prtryRstrctn"
})
public class SecurityRestrictionType2Choice {

    @XmlElement(name = "RstrctnTp")
    @XmlSchemaType(name = "string")
    protected RestrictionType1Code rstrctnTp;
    @XmlElement(name = "PrtryRstrctn")
    protected GenericIdentification30 prtryRstrctn;

    /**
     * Gets the value of the rstrctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType1Code }
     *     
     */
    public RestrictionType1Code getRstrctnTp() {
        return rstrctnTp;
    }

    /**
     * Sets the value of the rstrctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType1Code }
     *     
     */
    public SecurityRestrictionType2Choice setRstrctnTp(RestrictionType1Code value) {
        this.rstrctnTp = value;
        return this;
    }

    /**
     * Gets the value of the prtryRstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtryRstrctn() {
        return prtryRstrctn;
    }

    /**
     * Sets the value of the prtryRstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public SecurityRestrictionType2Choice setPrtryRstrctn(GenericIdentification30 value) {
        this.prtryRstrctn = value;
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
