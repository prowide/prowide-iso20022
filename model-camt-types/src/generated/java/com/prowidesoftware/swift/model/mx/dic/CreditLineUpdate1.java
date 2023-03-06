
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
 * Credit line which is updated.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditLineUpdate1", propOrder = {
    "id",
    "newCdtLineValSet"
})
public class CreditLineUpdate1 {

    @XmlElement(name = "Id", required = true)
    protected CreditLineIdentification1 id;
    @XmlElement(name = "NewCdtLineValSet", required = true)
    protected CreditLine5 newCdtLineValSet;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CreditLineIdentification1 }
     *     
     */
    public CreditLineIdentification1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLineIdentification1 }
     *     
     */
    public CreditLineUpdate1 setId(CreditLineIdentification1 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the newCdtLineValSet property.
     * 
     * @return
     *     possible object is
     *     {@link CreditLine5 }
     *     
     */
    public CreditLine5 getNewCdtLineValSet() {
        return newCdtLineValSet;
    }

    /**
     * Sets the value of the newCdtLineValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLine5 }
     *     
     */
    public CreditLineUpdate1 setNewCdtLineValSet(CreditLine5 value) {
        this.newCdtLineValSet = value;
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
