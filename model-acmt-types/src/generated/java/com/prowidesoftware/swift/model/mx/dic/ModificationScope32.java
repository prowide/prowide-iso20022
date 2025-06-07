
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "ModificationScope32", propOrder = {
    "modScpIndctn",
    "invstrPrfl"
})
public class ModificationScope32 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification1Code modScpIndctn;
    @XmlElement(name = "InvstrPrfl", required = true)
    protected InvestorProfile1 invstrPrfl;

    /**
     * Gets the value of the modScpIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link DataModification1Code }
     *     
     */
    public DataModification1Code getModScpIndctn() {
        return modScpIndctn;
    }

    /**
     * Sets the value of the modScpIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataModification1Code }
     *     
     */
    public ModificationScope32 setModScpIndctn(DataModification1Code value) {
        this.modScpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the invstrPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorProfile1 }
     *     
     */
    public InvestorProfile1 getInvstrPrfl() {
        return invstrPrfl;
    }

    /**
     * Sets the value of the invstrPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorProfile1 }
     *     
     */
    public ModificationScope32 setInvstrPrfl(InvestorProfile1 value) {
        this.invstrPrfl = value;
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
