
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
 * Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equalisation4", propOrder = {
    "amt",
    "rate",
    "equlstnMthdlgyTp",
    "cntngntLqdtnPerUnit",
    "dprctnDpstPerUnit",
    "equlstnCdtPerUnit",
    "hghWtrmrk",
    "grssAsstVal"
})
public class Equalisation4 {

    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "EqulstnMthdlgyTp")
    @XmlSchemaType(name = "string")
    protected EqualisationMethodologyType1Code equlstnMthdlgyTp;
    @XmlElement(name = "CntngntLqdtnPerUnit")
    protected ActiveOrHistoricCurrencyAndAmount cntngntLqdtnPerUnit;
    @XmlElement(name = "DprctnDpstPerUnit")
    protected ActiveOrHistoricCurrencyAndAmount dprctnDpstPerUnit;
    @XmlElement(name = "EqulstnCdtPerUnit")
    protected ActiveOrHistoricCurrencyAndAmount equlstnCdtPerUnit;
    @XmlElement(name = "HghWtrmrk")
    protected ActiveOrHistoricCurrencyAndAmount hghWtrmrk;
    @XmlElement(name = "GrssAsstVal")
    protected ActiveOrHistoricCurrencyAndAmount grssAsstVal;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Equalisation4 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Equalisation4 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the equlstnMthdlgyTp property.
     * 
     * @return
     *     possible object is
     *     {@link EqualisationMethodologyType1Code }
     *     
     */
    public EqualisationMethodologyType1Code getEqulstnMthdlgyTp() {
        return equlstnMthdlgyTp;
    }

    /**
     * Sets the value of the equlstnMthdlgyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EqualisationMethodologyType1Code }
     *     
     */
    public Equalisation4 setEqulstnMthdlgyTp(EqualisationMethodologyType1Code value) {
        this.equlstnMthdlgyTp = value;
        return this;
    }

    /**
     * Gets the value of the cntngntLqdtnPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getCntngntLqdtnPerUnit() {
        return cntngntLqdtnPerUnit;
    }

    /**
     * Sets the value of the cntngntLqdtnPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Equalisation4 setCntngntLqdtnPerUnit(ActiveOrHistoricCurrencyAndAmount value) {
        this.cntngntLqdtnPerUnit = value;
        return this;
    }

    /**
     * Gets the value of the dprctnDpstPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getDprctnDpstPerUnit() {
        return dprctnDpstPerUnit;
    }

    /**
     * Sets the value of the dprctnDpstPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Equalisation4 setDprctnDpstPerUnit(ActiveOrHistoricCurrencyAndAmount value) {
        this.dprctnDpstPerUnit = value;
        return this;
    }

    /**
     * Gets the value of the equlstnCdtPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getEqulstnCdtPerUnit() {
        return equlstnCdtPerUnit;
    }

    /**
     * Sets the value of the equlstnCdtPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Equalisation4 setEqulstnCdtPerUnit(ActiveOrHistoricCurrencyAndAmount value) {
        this.equlstnCdtPerUnit = value;
        return this;
    }

    /**
     * Gets the value of the hghWtrmrk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getHghWtrmrk() {
        return hghWtrmrk;
    }

    /**
     * Sets the value of the hghWtrmrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Equalisation4 setHghWtrmrk(ActiveOrHistoricCurrencyAndAmount value) {
        this.hghWtrmrk = value;
        return this;
    }

    /**
     * Gets the value of the grssAsstVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getGrssAsstVal() {
        return grssAsstVal;
    }

    /**
     * Sets the value of the grssAsstVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Equalisation4 setGrssAsstVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.grssAsstVal = value;
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
