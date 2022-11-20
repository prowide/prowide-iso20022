
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of elements of a cash distribution that will be withheld by a tax authority.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityWithHoldingTax1", propOrder = {
    "whldgTaxVal",
    "ctry"
})
public class SecurityWithHoldingTax1 {

    @XmlElement(name = "WhldgTaxVal", required = true)
    protected RateAndAmountFormat1Choice whldgTaxVal;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;

    /**
     * Gets the value of the whldgTaxVal property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getWhldgTaxVal() {
        return whldgTaxVal;
    }

    /**
     * Sets the value of the whldgTaxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public SecurityWithHoldingTax1 setWhldgTaxVal(RateAndAmountFormat1Choice value) {
        this.whldgTaxVal = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityWithHoldingTax1 setCtry(String value) {
        this.ctry = value;
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
