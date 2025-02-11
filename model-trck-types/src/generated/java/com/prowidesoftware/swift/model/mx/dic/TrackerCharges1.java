
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
 * Provides information on the charges related to the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerCharges1", propOrder = {
    "amt",
    "agt"
})
public class TrackerCharges1 {

    @XmlElement(name = "Amt", required = true)
    protected RestrictedFINActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "Agt", required = true)
    protected TrackerFinancialInstitutionIdentification1 agt;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public TrackerCharges1 setAmt(RestrictedFINActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the agt property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerFinancialInstitutionIdentification1 }
     *     
     */
    public TrackerFinancialInstitutionIdentification1 getAgt() {
        return agt;
    }

    /**
     * Sets the value of the agt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerFinancialInstitutionIdentification1 }
     *     
     */
    public TrackerCharges1 setAgt(TrackerFinancialInstitutionIdentification1 value) {
        this.agt = value;
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
