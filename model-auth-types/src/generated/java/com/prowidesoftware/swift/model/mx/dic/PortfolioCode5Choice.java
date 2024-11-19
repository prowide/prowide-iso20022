
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
@XmlType(name = "PortfolioCode5Choice", propOrder = {
    "prtfl",
    "noPrtfl"
})
public class PortfolioCode5Choice {

    @XmlElement(name = "Prtfl")
    protected PortfolioIdentification3 prtfl;
    @XmlElement(name = "NoPrtfl")
    @XmlSchemaType(name = "string")
    protected NotApplicable1Code noPrtfl;

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioIdentification3 }
     *     
     */
    public PortfolioIdentification3 getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioIdentification3 }
     *     
     */
    public PortfolioCode5Choice setPrtfl(PortfolioIdentification3 value) {
        this.prtfl = value;
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
    public PortfolioCode5Choice setNoPrtfl(NotApplicable1Code value) {
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
