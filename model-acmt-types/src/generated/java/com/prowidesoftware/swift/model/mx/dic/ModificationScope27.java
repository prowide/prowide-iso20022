
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
 * Scope of the modification to be applied on an identified set of information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationScope27", propOrder = {
    "modScpIndctn",
    "invstrPrflVldtn"
})
public class ModificationScope27 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification2Code modScpIndctn;
    @XmlElement(name = "InvstrPrflVldtn", required = true)
    protected PartyProfileInformation5 invstrPrflVldtn;

    /**
     * Gets the value of the modScpIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link DataModification2Code }
     *     
     */
    public DataModification2Code getModScpIndctn() {
        return modScpIndctn;
    }

    /**
     * Sets the value of the modScpIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataModification2Code }
     *     
     */
    public ModificationScope27 setModScpIndctn(DataModification2Code value) {
        this.modScpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the invstrPrflVldtn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyProfileInformation5 }
     *     
     */
    public PartyProfileInformation5 getInvstrPrflVldtn() {
        return invstrPrflVldtn;
    }

    /**
     * Sets the value of the invstrPrflVldtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyProfileInformation5 }
     *     
     */
    public ModificationScope27 setInvstrPrflVldtn(PartyProfileInformation5 value) {
        this.invstrPrflVldtn = value;
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
