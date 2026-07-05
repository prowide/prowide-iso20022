
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
 * Variables related to derivatives that are used to group derivatives together into positions for position sets.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetDimensions12", propOrder = {
    "rptgCtrPty",
    "collData",
    "otlrsIncl"
})
public class PositionSetDimensions12 {

    @XmlElement(name = "RptgCtrPty")
    protected OrganisationIdentification15Choice rptgCtrPty;
    @XmlElement(name = "CollData")
    protected CollateralData33 collData;
    @XmlElement(name = "OtlrsIncl")
    protected Boolean otlrsIncl;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public PositionSetDimensions12 setRptgCtrPty(OrganisationIdentification15Choice value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the collData property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralData33 }
     *     
     */
    public CollateralData33 getCollData() {
        return collData;
    }

    /**
     * Sets the value of the collData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralData33 }
     *     
     */
    public PositionSetDimensions12 setCollData(CollateralData33 value) {
        this.collData = value;
        return this;
    }

    /**
     * Gets the value of the otlrsIncl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtlrsIncl() {
        return otlrsIncl;
    }

    /**
     * Sets the value of the otlrsIncl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PositionSetDimensions12 setOtlrsIncl(Boolean value) {
        this.otlrsIncl = value;
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
