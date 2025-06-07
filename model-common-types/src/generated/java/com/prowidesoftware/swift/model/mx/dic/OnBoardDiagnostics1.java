
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data captured from on board diagnostic systems
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnBoardDiagnostics1", propOrder = {
    "ngnIdleTm",
    "ngnTtlIdleTm",
    "ngnHrs",
    "ngnTtlTm",
    "ngnLd",
    "ngnRPM",
    "ngnOilTmprtr",
    "ngnOilPrssr",
    "ngnOilLifeRmng",
    "chckNgnWrngSts",
    "fuelTankLvlStart",
    "fuelGaugeLvl",
    "fuelEcnmy",
    "rfrgrtnHrs",
    "rfrgrtnTmprtr",
    "coolntTmprtr",
    "bttryVltg",
    "hardBrakg",
    "hardAcclrtn"
})
public class OnBoardDiagnostics1 {

    @XmlElement(name = "NgnIdleTm")
    protected BigDecimal ngnIdleTm;
    @XmlElement(name = "NgnTtlIdleTm")
    protected BigDecimal ngnTtlIdleTm;
    @XmlElement(name = "NgnHrs")
    protected BigDecimal ngnHrs;
    @XmlElement(name = "NgnTtlTm")
    protected BigDecimal ngnTtlTm;
    @XmlElement(name = "NgnLd")
    protected String ngnLd;
    @XmlElement(name = "NgnRPM")
    protected String ngnRPM;
    @XmlElement(name = "NgnOilTmprtr")
    protected BigDecimal ngnOilTmprtr;
    @XmlElement(name = "NgnOilPrssr")
    protected String ngnOilPrssr;
    @XmlElement(name = "NgnOilLifeRmng")
    protected String ngnOilLifeRmng;
    @XmlElement(name = "ChckNgnWrngSts")
    protected String chckNgnWrngSts;
    @XmlElement(name = "FuelTankLvlStart")
    protected String fuelTankLvlStart;
    @XmlElement(name = "FuelGaugeLvl")
    protected String fuelGaugeLvl;
    @XmlElement(name = "FuelEcnmy")
    protected BigDecimal fuelEcnmy;
    @XmlElement(name = "RfrgrtnHrs")
    protected BigDecimal rfrgrtnHrs;
    @XmlElement(name = "RfrgrtnTmprtr")
    protected BigDecimal rfrgrtnTmprtr;
    @XmlElement(name = "CoolntTmprtr")
    protected BigDecimal coolntTmprtr;
    @XmlElement(name = "BttryVltg")
    protected String bttryVltg;
    @XmlElement(name = "HardBrakg")
    protected String hardBrakg;
    @XmlElement(name = "HardAcclrtn")
    protected String hardAcclrtn;

    /**
     * Gets the value of the ngnIdleTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNgnIdleTm() {
        return ngnIdleTm;
    }

    /**
     * Sets the value of the ngnIdleTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OnBoardDiagnostics1 setNgnIdleTm(BigDecimal value) {
        this.ngnIdleTm = value;
        return this;
    }

    /**
     * Gets the value of the ngnTtlIdleTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNgnTtlIdleTm() {
        return ngnTtlIdleTm;
    }

    /**
     * Sets the value of the ngnTtlIdleTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OnBoardDiagnostics1 setNgnTtlIdleTm(BigDecimal value) {
        this.ngnTtlIdleTm = value;
        return this;
    }

    /**
     * Gets the value of the ngnHrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNgnHrs() {
        return ngnHrs;
    }

    /**
     * Sets the value of the ngnHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OnBoardDiagnostics1 setNgnHrs(BigDecimal value) {
        this.ngnHrs = value;
        return this;
    }

    /**
     * Gets the value of the ngnTtlTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNgnTtlTm() {
        return ngnTtlTm;
    }

    /**
     * Sets the value of the ngnTtlTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OnBoardDiagnostics1 setNgnTtlTm(BigDecimal value) {
        this.ngnTtlTm = value;
        return this;
    }

    /**
     * Gets the value of the ngnLd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgnLd() {
        return ngnLd;
    }

    /**
     * Sets the value of the ngnLd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OnBoardDiagnostics1 setNgnLd(String value) {
        this.ngnLd = value;
        return this;
    }

    /**
     * Gets the value of the ngnRPM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgnRPM() {
        return ngnRPM;
    }

    /**
     * Sets the value of the ngnRPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OnBoardDiagnostics1 setNgnRPM(String value) {
        this.ngnRPM = value;
        return this;
    }

    /**
     * Gets the value of the ngnOilTmprtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNgnOilTmprtr() {
        return ngnOilTmprtr;
    }

    /**
     * Sets the value of the ngnOilTmprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OnBoardDiagnostics1 setNgnOilTmprtr(BigDecimal value) {
        this.ngnOilTmprtr = value;
        return this;
    }

    /**
     * Gets the value of the ngnOilPrssr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgnOilPrssr() {
        return ngnOilPrssr;
    }

    /**
     * Sets the value of the ngnOilPrssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OnBoardDiagnostics1 setNgnOilPrssr(String value) {
        this.ngnOilPrssr = value;
        return this;
    }

    /**
     * Gets the value of the ngnOilLifeRmng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgnOilLifeRmng() {
        return ngnOilLifeRmng;
    }

    /**
     * Sets the value of the ngnOilLifeRmng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OnBoardDiagnostics1 setNgnOilLifeRmng(String value) {
        this.ngnOilLifeRmng = value;
        return this;
    }

    /**
     * Gets the value of the chckNgnWrngSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckNgnWrngSts() {
        return chckNgnWrngSts;
    }

    /**
     * Sets the value of the chckNgnWrngSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OnBoardDiagnostics1 setChckNgnWrngSts(String value) {
        this.chckNgnWrngSts = value;
        return this;
    }

    /**
     * Gets the value of the fuelTankLvlStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelTankLvlStart() {
        return fuelTankLvlStart;
    }

    /**
     * Sets the value of the fuelTankLvlStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OnBoardDiagnostics1 setFuelTankLvlStart(String value) {
        this.fuelTankLvlStart = value;
        return this;
    }

    /**
     * Gets the value of the fuelGaugeLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelGaugeLvl() {
        return fuelGaugeLvl;
    }

    /**
     * Sets the value of the fuelGaugeLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OnBoardDiagnostics1 setFuelGaugeLvl(String value) {
        this.fuelGaugeLvl = value;
        return this;
    }

    /**
     * Gets the value of the fuelEcnmy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuelEcnmy() {
        return fuelEcnmy;
    }

    /**
     * Sets the value of the fuelEcnmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OnBoardDiagnostics1 setFuelEcnmy(BigDecimal value) {
        this.fuelEcnmy = value;
        return this;
    }

    /**
     * Gets the value of the rfrgrtnHrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRfrgrtnHrs() {
        return rfrgrtnHrs;
    }

    /**
     * Sets the value of the rfrgrtnHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OnBoardDiagnostics1 setRfrgrtnHrs(BigDecimal value) {
        this.rfrgrtnHrs = value;
        return this;
    }

    /**
     * Gets the value of the rfrgrtnTmprtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRfrgrtnTmprtr() {
        return rfrgrtnTmprtr;
    }

    /**
     * Sets the value of the rfrgrtnTmprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OnBoardDiagnostics1 setRfrgrtnTmprtr(BigDecimal value) {
        this.rfrgrtnTmprtr = value;
        return this;
    }

    /**
     * Gets the value of the coolntTmprtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoolntTmprtr() {
        return coolntTmprtr;
    }

    /**
     * Sets the value of the coolntTmprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OnBoardDiagnostics1 setCoolntTmprtr(BigDecimal value) {
        this.coolntTmprtr = value;
        return this;
    }

    /**
     * Gets the value of the bttryVltg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBttryVltg() {
        return bttryVltg;
    }

    /**
     * Sets the value of the bttryVltg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OnBoardDiagnostics1 setBttryVltg(String value) {
        this.bttryVltg = value;
        return this;
    }

    /**
     * Gets the value of the hardBrakg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardBrakg() {
        return hardBrakg;
    }

    /**
     * Sets the value of the hardBrakg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OnBoardDiagnostics1 setHardBrakg(String value) {
        this.hardBrakg = value;
        return this;
    }

    /**
     * Gets the value of the hardAcclrtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardAcclrtn() {
        return hardAcclrtn;
    }

    /**
     * Sets the value of the hardAcclrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OnBoardDiagnostics1 setHardAcclrtn(String value) {
        this.hardAcclrtn = value;
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
