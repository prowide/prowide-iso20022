
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
 * Defines the conditions under which an order becomes active or is removed from an orderbook.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityPeriod1Choice", propOrder = {
    "vldtyPrdCd",
    "prtry"
})
public class ValidityPeriod1Choice {

    @XmlElement(name = "VldtyPrdCd")
    @XmlSchemaType(name = "string")
    protected ValidityPeriodType1Code vldtyPrdCd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification30 prtry;

    /**
     * Gets the value of the vldtyPrdCd property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityPeriodType1Code }
     *     
     */
    public ValidityPeriodType1Code getVldtyPrdCd() {
        return vldtyPrdCd;
    }

    /**
     * Sets the value of the vldtyPrdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityPeriodType1Code }
     *     
     */
    public ValidityPeriod1Choice setVldtyPrdCd(ValidityPeriodType1Code value) {
        this.vldtyPrdCd = value;
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
    public ValidityPeriod1Choice setPrtry(GenericIdentification30 value) {
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
