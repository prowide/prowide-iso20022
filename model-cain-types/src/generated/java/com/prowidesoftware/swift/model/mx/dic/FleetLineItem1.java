
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "FleetLineItem1", propOrder = {
    "fuelInd",
    "svcTp",
    "fuelBrndCd",
    "fleetPdctCd",
    "fleetPdctCtgy",
    "fleetPdctQlfr",
    "fleetPdctCdAssgnr",
    "unitPricTaxInd",
    "unitPric",
    "unitOfMeasr",
    "othrUnitOfMeasr",
    "pdctQty",
    "dscntAmt",
    "nonTaxblInd",
    "tax",
    "ttlAmtExclgTax",
    "ttlAmtInclgTax"
})
public class FleetLineItem1 {

    @XmlElement(name = "FuelInd")
    protected boolean fuelInd;
    @XmlElement(name = "SvcTp")
    @XmlSchemaType(name = "string")
    protected FleetServiceType1Code svcTp;
    @XmlElement(name = "FuelBrndCd")
    protected String fuelBrndCd;
    @XmlElement(name = "FleetPdctCd")
    protected String fleetPdctCd;
    @XmlElement(name = "FleetPdctCtgy")
    protected String fleetPdctCtgy;
    @XmlElement(name = "FleetPdctQlfr")
    protected String fleetPdctQlfr;
    @XmlElement(name = "FleetPdctCdAssgnr")
    protected String fleetPdctCdAssgnr;
    @XmlElement(name = "UnitPricTaxInd")
    protected Boolean unitPricTaxInd;
    @XmlElement(name = "UnitPric")
    protected BigDecimal unitPric;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "OthrUnitOfMeasr")
    protected String othrUnitOfMeasr;
    @XmlElement(name = "PdctQty")
    protected String pdctQty;
    @XmlElement(name = "DscntAmt")
    protected BigDecimal dscntAmt;
    @XmlElement(name = "NonTaxblInd")
    protected Boolean nonTaxblInd;
    @XmlElement(name = "Tax")
    protected List<Tax33> tax;
    @XmlElement(name = "TtlAmtExclgTax")
    protected BigDecimal ttlAmtExclgTax;
    @XmlElement(name = "TtlAmtInclgTax")
    protected BigDecimal ttlAmtInclgTax;

    /**
     * Gets the value of the fuelInd property.
     * 
     */
    public boolean isFuelInd() {
        return fuelInd;
    }

    /**
     * Sets the value of the fuelInd property.
     * 
     */
    public FleetLineItem1 setFuelInd(boolean value) {
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
    public FleetLineItem1 setSvcTp(FleetServiceType1Code value) {
        this.svcTp = value;
        return this;
    }

    /**
     * Gets the value of the fuelBrndCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelBrndCd() {
        return fuelBrndCd;
    }

    /**
     * Sets the value of the fuelBrndCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem1 setFuelBrndCd(String value) {
        this.fuelBrndCd = value;
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
    public FleetLineItem1 setFleetPdctCd(String value) {
        this.fleetPdctCd = value;
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
    public FleetLineItem1 setFleetPdctCtgy(String value) {
        this.fleetPdctCtgy = value;
        return this;
    }

    /**
     * Gets the value of the fleetPdctQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleetPdctQlfr() {
        return fleetPdctQlfr;
    }

    /**
     * Sets the value of the fleetPdctQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem1 setFleetPdctQlfr(String value) {
        this.fleetPdctQlfr = value;
        return this;
    }

    /**
     * Gets the value of the fleetPdctCdAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleetPdctCdAssgnr() {
        return fleetPdctCdAssgnr;
    }

    /**
     * Sets the value of the fleetPdctCdAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem1 setFleetPdctCdAssgnr(String value) {
        this.fleetPdctCdAssgnr = value;
        return this;
    }

    /**
     * Gets the value of the unitPricTaxInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnitPricTaxInd() {
        return unitPricTaxInd;
    }

    /**
     * Sets the value of the unitPricTaxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FleetLineItem1 setUnitPricTaxInd(Boolean value) {
        this.unitPricTaxInd = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem1 setUnitPric(BigDecimal value) {
        this.unitPric = value;
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
    public FleetLineItem1 setUnitOfMeasr(UnitOfMeasure1Code value) {
        this.unitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the othrUnitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrUnitOfMeasr() {
        return othrUnitOfMeasr;
    }

    /**
     * Sets the value of the othrUnitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem1 setOthrUnitOfMeasr(String value) {
        this.othrUnitOfMeasr = value;
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
    public FleetLineItem1 setPdctQty(String value) {
        this.pdctQty = value;
        return this;
    }

    /**
     * Gets the value of the dscntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscntAmt() {
        return dscntAmt;
    }

    /**
     * Sets the value of the dscntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem1 setDscntAmt(BigDecimal value) {
        this.dscntAmt = value;
        return this;
    }

    /**
     * Gets the value of the nonTaxblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonTaxblInd() {
        return nonTaxblInd;
    }

    /**
     * Sets the value of the nonTaxblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FleetLineItem1 setNonTaxblInd(Boolean value) {
        this.nonTaxblInd = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax33 }
     * 
     * 
     */
    public List<Tax33> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax33>();
        }
        return this.tax;
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
    public FleetLineItem1 setTtlAmtExclgTax(BigDecimal value) {
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
    public FleetLineItem1 setTtlAmtInclgTax(BigDecimal value) {
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

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public FleetLineItem1 addTax(Tax33 tax) {
        getTax().add(tax);
        return this;
    }

}
