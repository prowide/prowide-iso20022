
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
 * Balance of a financial instrument for a specific statement page.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginationBalance2", propOrder = {
    "opngBal",
    "clsgBal"
})
public class PaginationBalance2 {

    @XmlElement(name = "OpngBal")
    protected OpeningBalance3Choice opngBal;
    @XmlElement(name = "ClsgBal")
    protected ClosingBalance3Choice clsgBal;

    /**
     * Gets the value of the opngBal property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningBalance3Choice }
     *     
     */
    public OpeningBalance3Choice getOpngBal() {
        return opngBal;
    }

    /**
     * Sets the value of the opngBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningBalance3Choice }
     *     
     */
    public PaginationBalance2 setOpngBal(OpeningBalance3Choice value) {
        this.opngBal = value;
        return this;
    }

    /**
     * Gets the value of the clsgBal property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingBalance3Choice }
     *     
     */
    public ClosingBalance3Choice getClsgBal() {
        return clsgBal;
    }

    /**
     * Sets the value of the clsgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingBalance3Choice }
     *     
     */
    public PaginationBalance2 setClsgBal(ClosingBalance3Choice value) {
        this.clsgBal = value;
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
