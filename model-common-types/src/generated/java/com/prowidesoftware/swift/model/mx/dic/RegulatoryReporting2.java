
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information needed due to regulatory and/or statutory requirements.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReporting2", propOrder = {
    "dbtCdtRptgInd",
    "authrty",
    "rgltryDtls"
})
public class RegulatoryReporting2 {

    @XmlElement(name = "DbtCdtRptgInd")
    @XmlSchemaType(name = "string")
    protected RegulatoryReportingType1Code dbtCdtRptgInd;
    @XmlElement(name = "Authrty")
    protected RegulatoryAuthority authrty;
    @XmlElement(name = "RgltryDtls")
    protected StructuredRegulatoryReporting2 rgltryDtls;

    /**
     * Gets the value of the dbtCdtRptgInd property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryReportingType1Code }
     *     
     */
    public RegulatoryReportingType1Code getDbtCdtRptgInd() {
        return dbtCdtRptgInd;
    }

    /**
     * Sets the value of the dbtCdtRptgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryReportingType1Code }
     *     
     */
    public RegulatoryReporting2 setDbtCdtRptgInd(RegulatoryReportingType1Code value) {
        this.dbtCdtRptgInd = value;
        return this;
    }

    /**
     * Gets the value of the authrty property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryAuthority }
     *     
     */
    public RegulatoryAuthority getAuthrty() {
        return authrty;
    }

    /**
     * Sets the value of the authrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryAuthority }
     *     
     */
    public RegulatoryReporting2 setAuthrty(RegulatoryAuthority value) {
        this.authrty = value;
        return this;
    }

    /**
     * Gets the value of the rgltryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredRegulatoryReporting2 }
     *     
     */
    public StructuredRegulatoryReporting2 getRgltryDtls() {
        return rgltryDtls;
    }

    /**
     * Sets the value of the rgltryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredRegulatoryReporting2 }
     *     
     */
    public RegulatoryReporting2 setRgltryDtls(StructuredRegulatoryReporting2 value) {
        this.rgltryDtls = value;
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
