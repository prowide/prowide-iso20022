
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
 * Provides information about tax relief categories.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCTaxReliefSD1", propOrder = {
    "ctgyId",
    "ctgyDesc"
})
public class DTCTaxReliefSD1 {

    @XmlElement(name = "CtgyId", required = true)
    protected String ctgyId;
    @XmlElement(name = "CtgyDesc", required = true)
    protected String ctgyDesc;

    /**
     * Gets the value of the ctgyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgyId() {
        return ctgyId;
    }

    /**
     * Sets the value of the ctgyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DTCTaxReliefSD1 setCtgyId(String value) {
        this.ctgyId = value;
        return this;
    }

    /**
     * Gets the value of the ctgyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgyDesc() {
        return ctgyDesc;
    }

    /**
     * Sets the value of the ctgyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DTCTaxReliefSD1 setCtgyDesc(String value) {
        this.ctgyDesc = value;
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
