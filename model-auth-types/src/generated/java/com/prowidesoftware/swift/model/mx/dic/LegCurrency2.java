
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
 * Specifies the currency(ies) for each leg of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegCurrency2", propOrder = {
    "ccyFrstLeg",
    "ccyScndLeg"
})
public class LegCurrency2 {

    @XmlElement(name = "CcyFrstLeg")
    protected String ccyFrstLeg;
    @XmlElement(name = "CcyScndLeg")
    protected String ccyScndLeg;

    /**
     * Gets the value of the ccyFrstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyFrstLeg() {
        return ccyFrstLeg;
    }

    /**
     * Sets the value of the ccyFrstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LegCurrency2 setCcyFrstLeg(String value) {
        this.ccyFrstLeg = value;
        return this;
    }

    /**
     * Gets the value of the ccyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyScndLeg() {
        return ccyScndLeg;
    }

    /**
     * Sets the value of the ccyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LegCurrency2 setCcyScndLeg(String value) {
        this.ccyScndLeg = value;
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
