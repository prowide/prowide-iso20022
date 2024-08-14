
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
 * Variables related to derivatives that are used to group derivatives together into positions for position sets.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetDimensions14", propOrder = {
    "ctrPtyData",
    "lnData",
    "collData",
    "otlrsIncl"
})
public class PositionSetDimensions14 {

    @XmlElement(name = "CtrPtyData")
    protected CounterpartyData86 ctrPtyData;
    @XmlElement(name = "LnData")
    protected LoanData134 lnData;
    @XmlElement(name = "CollData")
    protected CollateralData33 collData;
    @XmlElement(name = "OtlrsIncl")
    protected Boolean otlrsIncl;

    /**
     * Gets the value of the ctrPtyData property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData86 }
     *     
     */
    public CounterpartyData86 getCtrPtyData() {
        return ctrPtyData;
    }

    /**
     * Sets the value of the ctrPtyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData86 }
     *     
     */
    public PositionSetDimensions14 setCtrPtyData(CounterpartyData86 value) {
        this.ctrPtyData = value;
        return this;
    }

    /**
     * Gets the value of the lnData property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData134 }
     *     
     */
    public LoanData134 getLnData() {
        return lnData;
    }

    /**
     * Sets the value of the lnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData134 }
     *     
     */
    public PositionSetDimensions14 setLnData(LoanData134 value) {
        this.lnData = value;
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
    public PositionSetDimensions14 setCollData(CollateralData33 value) {
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
    public PositionSetDimensions14 setOtlrsIncl(Boolean value) {
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
