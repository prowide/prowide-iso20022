
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
 * Specifies the type of change to name.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameModification1", propOrder = {
    "modCd",
    "nm"
})
public class NameModification1 {

    @XmlElement(name = "ModCd")
    @XmlSchemaType(name = "string")
    protected Modification1Code modCd;
    @XmlElement(name = "Nm", required = true)
    protected String nm;

    /**
     * Gets the value of the modCd property.
     * 
     * @return
     *     possible object is
     *     {@link Modification1Code }
     *     
     */
    public Modification1Code getModCd() {
        return modCd;
    }

    /**
     * Sets the value of the modCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification1Code }
     *     
     */
    public NameModification1 setModCd(Modification1Code value) {
        this.modCd = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NameModification1 setNm(String value) {
        this.nm = value;
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
