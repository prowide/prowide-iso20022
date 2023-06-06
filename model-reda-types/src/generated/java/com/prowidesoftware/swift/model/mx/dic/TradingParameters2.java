
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Place at which the security is traded.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingParameters2", propOrder = {
    "mktId",
    "rndLot",
    "tradLotSz",
    "scndryPlcOfListg",
    "minTraddNmnlQty",
    "maxTraddNmnlQty",
    "minTradgPricgIncrmt",
    "pmryPlcOfListgId"
})
public class TradingParameters2 {

    @XmlElement(name = "MktId")
    protected String mktId;
    @XmlElement(name = "RndLot")
    protected FinancialInstrumentQuantity1Choice rndLot;
    @XmlElement(name = "TradLotSz")
    protected FinancialInstrumentQuantity1Choice tradLotSz;
    @XmlElement(name = "ScndryPlcOfListg")
    protected List<String> scndryPlcOfListg;
    @XmlElement(name = "MinTraddNmnlQty")
    protected UnitOrFaceAmount1Choice minTraddNmnlQty;
    @XmlElement(name = "MaxTraddNmnlQty")
    protected UnitOrFaceAmount1Choice maxTraddNmnlQty;
    @XmlElement(name = "MinTradgPricgIncrmt")
    protected BigDecimal minTradgPricgIncrmt;
    @XmlElement(name = "PmryPlcOfListgId")
    protected String pmryPlcOfListgId;

    /**
     * Gets the value of the mktId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktId() {
        return mktId;
    }

    /**
     * Sets the value of the mktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingParameters2 setMktId(String value) {
        this.mktId = value;
        return this;
    }

    /**
     * Gets the value of the rndLot property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getRndLot() {
        return rndLot;
    }

    /**
     * Sets the value of the rndLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public TradingParameters2 setRndLot(FinancialInstrumentQuantity1Choice value) {
        this.rndLot = value;
        return this;
    }

    /**
     * Gets the value of the tradLotSz property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getTradLotSz() {
        return tradLotSz;
    }

    /**
     * Sets the value of the tradLotSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public TradingParameters2 setTradLotSz(FinancialInstrumentQuantity1Choice value) {
        this.tradLotSz = value;
        return this;
    }

    /**
     * Gets the value of the scndryPlcOfListg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scndryPlcOfListg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndryPlcOfListg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the scndryPlcOfListg property.
     */
    public List<String> getScndryPlcOfListg() {
        if (scndryPlcOfListg == null) {
            scndryPlcOfListg = new ArrayList<>();
        }
        return this.scndryPlcOfListg;
    }

    /**
     * Gets the value of the minTraddNmnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getMinTraddNmnlQty() {
        return minTraddNmnlQty;
    }

    /**
     * Sets the value of the minTraddNmnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public TradingParameters2 setMinTraddNmnlQty(UnitOrFaceAmount1Choice value) {
        this.minTraddNmnlQty = value;
        return this;
    }

    /**
     * Gets the value of the maxTraddNmnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getMaxTraddNmnlQty() {
        return maxTraddNmnlQty;
    }

    /**
     * Sets the value of the maxTraddNmnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public TradingParameters2 setMaxTraddNmnlQty(UnitOrFaceAmount1Choice value) {
        this.maxTraddNmnlQty = value;
        return this;
    }

    /**
     * Gets the value of the minTradgPricgIncrmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinTradgPricgIncrmt() {
        return minTradgPricgIncrmt;
    }

    /**
     * Sets the value of the minTradgPricgIncrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TradingParameters2 setMinTradgPricgIncrmt(BigDecimal value) {
        this.minTradgPricgIncrmt = value;
        return this;
    }

    /**
     * Gets the value of the pmryPlcOfListgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmryPlcOfListgId() {
        return pmryPlcOfListgId;
    }

    /**
     * Sets the value of the pmryPlcOfListgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingParameters2 setPmryPlcOfListgId(String value) {
        this.pmryPlcOfListgId = value;
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
     * Adds a new item to the scndryPlcOfListg list.
     * @see #getScndryPlcOfListg()
     * 
     */
    public TradingParameters2 addScndryPlcOfListg(String scndryPlcOfListg) {
        getScndryPlcOfListg().add(scndryPlcOfListg);
        return this;
    }

}
