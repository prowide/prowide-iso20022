
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
 * Numeric characters of the cardholder's address for verification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressVerification1", propOrder = {
    "adrDgts",
    "pstlCdDgts"
})
public class AddressVerification1 {

    @XmlElement(name = "AdrDgts")
    protected String adrDgts;
    @XmlElement(name = "PstlCdDgts")
    protected String pstlCdDgts;

    /**
     * Gets the value of the adrDgts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrDgts() {
        return adrDgts;
    }

    /**
     * Sets the value of the adrDgts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AddressVerification1 setAdrDgts(String value) {
        this.adrDgts = value;
        return this;
    }

    /**
     * Gets the value of the pstlCdDgts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstlCdDgts() {
        return pstlCdDgts;
    }

    /**
     * Sets the value of the pstlCdDgts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AddressVerification1 setPstlCdDgts(String value) {
        this.pstlCdDgts = value;
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
