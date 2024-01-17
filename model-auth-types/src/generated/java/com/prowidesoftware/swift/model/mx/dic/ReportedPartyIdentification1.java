
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
 * Provides the identification of the reported party through the location and the name or the sector.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportedPartyIdentification1", propOrder = {
    "nmOrSctr",
    "lctn"
})
public class ReportedPartyIdentification1 {

    @XmlElement(name = "NmOrSctr", required = true)
    protected NameOrSector1Choice nmOrSctr;
    @XmlElement(name = "Lctn", required = true)
    protected String lctn;

    /**
     * Gets the value of the nmOrSctr property.
     * 
     * @return
     *     possible object is
     *     {@link NameOrSector1Choice }
     *     
     */
    public NameOrSector1Choice getNmOrSctr() {
        return nmOrSctr;
    }

    /**
     * Sets the value of the nmOrSctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameOrSector1Choice }
     *     
     */
    public ReportedPartyIdentification1 setNmOrSctr(NameOrSector1Choice value) {
        this.nmOrSctr = value;
        return this;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedPartyIdentification1 setLctn(String value) {
        this.lctn = value;
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
