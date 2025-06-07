
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
 * Specifies the details of the modification to be applied on the securities account reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountModification2", propOrder = {
    "scpIndctn",
    "reqdMod"
})
public class SecuritiesAccountModification2 {

    @XmlElement(name = "ScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification1Code scpIndctn;
    @XmlElement(name = "ReqdMod", required = true)
    protected SecuritiesAccountModification2Choice reqdMod;

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
    public SecuritiesAccountModification2 setScpIndctn(DataModification1Code value) {
        this.scpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the reqdMod property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountModification2Choice }
     *     
     */
    public SecuritiesAccountModification2Choice getReqdMod() {
        return reqdMod;
    }

    /**
     * Sets the value of the reqdMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountModification2Choice }
     *     
     */
    public SecuritiesAccountModification2 setReqdMod(SecuritiesAccountModification2Choice value) {
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
