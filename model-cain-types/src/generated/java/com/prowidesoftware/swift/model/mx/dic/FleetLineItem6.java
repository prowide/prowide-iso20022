
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Supplies additional transaction information for fleet transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetLineItem6", propOrder = {
    "allwdItm",
    "fuel",
    "svcTp",
    "pdctCtgy",
    "pdctCd",
    "unitOfMeasr",
    "pdctQty",
    "ttlAmtExclgTax",
    "ttlAmtInclgTax"
})
public class FleetLineItem6 {

    @XmlElement(name = "AllwdItm")
    protected Boolean allwdItm;
    @XmlElement(name = "Fuel")
    protected boolean fuel;
    @XmlElement(name = "SvcTp")
    @XmlSchemaType(name = "string")
    protected FleetServiceType1Code svcTp;
    @XmlElement(name = "PdctCtgy")
    protected String pdctCtgy;
    @XmlElement(name = "PdctCd")
    protected String pdctCd;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "PdctQty")
    protected BigDecimal pdctQty;
    @XmlElement(name = "TtlAmtExclgTax")
    protected BigDecimal ttlAmtExclgTax;
    @XmlElement(name = "TtlAmtInclgTax")
    protected BigDecimal ttlAmtInclgTax;

    /**
     * Gets the value of the allwdItm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllwdItm() {
        return allwdItm;
    }

    /**
     * Sets the value of the allwdItm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FleetLineItem6 setAllwdItm(Boolean value) {
        this.allwdItm = value;
        return this;
    }

    /**
     * Gets the value of the fuel property.
     * 
     */
    public boolean isFuel() {
        return fuel;
    }

    /**
     * Sets the value of the fuel property.
     * 
     */
    public FleetLineItem6 setFuel(boolean value) {
        this.fuel = value;
        return this;
    }

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link FleetServiceType1Code }
     *     
     */
    public FleetServiceType1Code getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetServiceType1Code }
     *     
     */
    public FleetLineItem6 setSvcTp(FleetServiceType1Code value) {
        this.svcTp = value;
        return this;
    }

    /**
     * Gets the value of the pdctCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCtgy() {
        return pdctCtgy;
    }

    /**
     * Sets the value of the pdctCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem6 setPdctCtgy(String value) {
        this.pdctCtgy = value;
        return this;
    }

    /**
     * Gets the value of the pdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCd() {
        return pdctCd;
    }

    /**
     * Sets the value of the pdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem6 setPdctCd(String value) {
        this.pdctCd = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public UnitOfMeasure1Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public FleetLineItem6 setUnitOfMeasr(UnitOfMeasure1Code value) {
        this.unitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the pdctQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdctQty() {
        return pdctQty;
    }

    /**
     * Sets the value of the pdctQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem6 setPdctQty(BigDecimal value) {
        this.pdctQty = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmtExclgTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmtExclgTax() {
        return ttlAmtExclgTax;
    }

    /**
     * Sets the value of the ttlAmtExclgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem6 setTtlAmtExclgTax(BigDecimal value) {
        this.ttlAmtExclgTax = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmtInclgTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmtInclgTax() {
        return ttlAmtInclgTax;
    }

    /**
     * Sets the value of the ttlAmtInclgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem6 setTtlAmtInclgTax(BigDecimal value) {
        this.ttlAmtInclgTax = value;
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
