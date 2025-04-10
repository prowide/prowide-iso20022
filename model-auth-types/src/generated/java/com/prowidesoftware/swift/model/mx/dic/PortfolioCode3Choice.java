
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
 * Element is a choice between a known portfolio code and a code applicable when the code is unknown.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioCode3Choice", propOrder = {
    "cd",
    "noPrtfl"
})
public class PortfolioCode3Choice {

    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "NoPrtfl")
    @XmlSchemaType(name = "string")
    protected NotApplicable1Code noPrtfl;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PortfolioCode3Choice setCd(String value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the noPrtfl property.
     * 
     * @return
     *     possible object is
     *     {@link NotApplicable1Code }
     *     
     */
    public NotApplicable1Code getNoPrtfl() {
        return noPrtfl;
    }

    /**
     * Sets the value of the noPrtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotApplicable1Code }
     *     
     */
    public PortfolioCode3Choice setNoPrtfl(NotApplicable1Code value) {
        this.noPrtfl = value;
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
