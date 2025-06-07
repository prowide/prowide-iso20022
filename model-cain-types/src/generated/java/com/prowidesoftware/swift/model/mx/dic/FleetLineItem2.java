
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Supplies additional transaction information for fleet transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetLineItem2", propOrder = {
    "allwdItmInd",
    "fuelInd",
    "svcTp",
    "fleetPdctCtgy",
    "fleetPdctCd",
    "unitOfMeasr",
    "pdctQty",
    "ttlAmtExclgTax",
    "ttlAmtInclgTax"
})
public class FleetLineItem2 {

    @XmlElement(name = "AllwdItmInd")
    protected Boolean allwdItmInd;
    @XmlElement(name = "FuelInd", required = true)
    @XmlSchemaType(name = "string")
    protected FleetPurchaseType1Code fuelInd;
    @XmlElement(name = "SvcTp")
    @XmlSchemaType(name = "string")
    protected FleetServiceType1Code svcTp;
    @XmlElement(name = "FleetPdctCtgy")
    protected String fleetPdctCtgy;
    @XmlElement(name = "FleetPdctCd")
    protected String fleetPdctCd;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "PdctQty")
    protected String pdctQty;
    @XmlElement(name = "TtlAmtExclgTax")
    protected BigDecimal ttlAmtExclgTax;
    @XmlElement(name = "TtlAmtInclgTax")
    protected BigDecimal ttlAmtInclgTax;

    /**
     * Gets the value of the allwdItmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllwdItmInd() {
        return allwdItmInd;
    }

    /**
     * Sets the value of the allwdItmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FleetLineItem2 setAllwdItmInd(Boolean value) {
        this.allwdItmInd = value;
        return this;
    }

    /**
     * Gets the value of the fuelInd property.
     * 
     * @return
     *     possible object is
     *     {@link FleetPurchaseType1Code }
     *     
     */
    public FleetPurchaseType1Code getFuelInd() {
        return fuelInd;
    }

    /**
     * Sets the value of the fuelInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetPurchaseType1Code }
     *     
     */
    public FleetLineItem2 setFuelInd(FleetPurchaseType1Code value) {
        this.fuelInd = value;
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
    public FleetLineItem2 setSvcTp(FleetServiceType1Code value) {
        this.svcTp = value;
        return this;
    }

    /**
     * Gets the value of the fleetPdctCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleetPdctCtgy() {
        return fleetPdctCtgy;
    }

    /**
     * Sets the value of the fleetPdctCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem2 setFleetPdctCtgy(String value) {
        this.fleetPdctCtgy = value;
        return this;
    }

    /**
     * Gets the value of the fleetPdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleetPdctCd() {
        return fleetPdctCd;
    }

    /**
     * Sets the value of the fleetPdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem2 setFleetPdctCd(String value) {
        this.fleetPdctCd = value;
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
    public FleetLineItem2 setUnitOfMeasr(UnitOfMeasure1Code value) {
        this.unitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the pdctQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctQty() {
        return pdctQty;
    }

    /**
     * Sets the value of the pdctQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem2 setPdctQty(String value) {
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
    public FleetLineItem2 setTtlAmtExclgTax(BigDecimal value) {
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
    public FleetLineItem2 setTtlAmtInclgTax(BigDecimal value) {
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
