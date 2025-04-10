
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
@XmlType(name = "PortfolioCode1Choice", propOrder = {
    "prtfl",
    "noCd"
})
public class PortfolioCode1Choice {

    @XmlElement(name = "Prtfl")
    protected String prtfl;
    @XmlElement(name = "NoCd")
    @XmlSchemaType(name = "string")
    protected NotApplicable1Code noCd;

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PortfolioCode1Choice setPrtfl(String value) {
        this.prtfl = value;
        return this;
    }

    /**
     * Gets the value of the noCd property.
     * 
     * @return
     *     possible object is
     *     {@link NotApplicable1Code }
     *     
     */
    public NotApplicable1Code getNoCd() {
        return noCd;
    }

    /**
     * Sets the value of the noCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotApplicable1Code }
     *     
     */
    public PortfolioCode1Choice setNoCd(NotApplicable1Code value) {
        this.noCd = value;
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
