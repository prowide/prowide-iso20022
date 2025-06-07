
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
 * Indicates information about order restriction, such as the trading phase when the order becomes active.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderRestriction1Choice", propOrder = {
    "ordrRstrctnCd",
    "prtry"
})
public class OrderRestriction1Choice {

    @XmlElement(name = "OrdrRstrctnCd")
    @XmlSchemaType(name = "string")
    protected OrderRestrictionType1Code ordrRstrctnCd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification30 prtry;

    /**
     * Gets the value of the ordrRstrctnCd property.
     * 
     * @return
     *     possible object is
     *     {@link OrderRestrictionType1Code }
     *     
     */
    public OrderRestrictionType1Code getOrdrRstrctnCd() {
        return ordrRstrctnCd;
    }

    /**
     * Sets the value of the ordrRstrctnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRestrictionType1Code }
     *     
     */
    public OrderRestriction1Choice setOrdrRstrctnCd(OrderRestrictionType1Code value) {
        this.ordrRstrctnCd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public OrderRestriction1Choice setPrtry(GenericIdentification30 value) {
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
