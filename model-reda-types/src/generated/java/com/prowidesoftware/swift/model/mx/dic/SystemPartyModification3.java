
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
 * Information about the kind of modification request for party reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemPartyModification3", propOrder = {
    "scpIndctn",
    "reqdMod"
})
public class SystemPartyModification3 {

    @XmlElement(name = "ScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification1Code scpIndctn;
    @XmlElement(name = "ReqdMod", required = true)
    protected SystemPartyModification3Choice reqdMod;

    /**
     * Gets the value of the scpIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link DataModification1Code }
     *     
     */
    public DataModification1Code getScpIndctn() {
        return scpIndctn;
    }

    /**
     * Sets the value of the scpIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataModification1Code }
     *     
     */
    public SystemPartyModification3 setScpIndctn(DataModification1Code value) {
        this.scpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the reqdMod property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyModification3Choice }
     *     
     */
    public SystemPartyModification3Choice getReqdMod() {
        return reqdMod;
    }

    /**
     * Sets the value of the reqdMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyModification3Choice }
     *     
     */
    public SystemPartyModification3 setReqdMod(SystemPartyModification3Choice value) {
        this.reqdMod = value;
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
