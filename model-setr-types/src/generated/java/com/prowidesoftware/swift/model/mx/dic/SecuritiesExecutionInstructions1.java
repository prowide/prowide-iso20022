
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
 * Identifies the instructions for order handling.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesExecutionInstructions1", propOrder = {
    "allOrNn",
    "callFrst",
    "cross",
    "cstmrDisp",
    "hld",
    "incr",
    "instnsOnly",
    "nonNgtbl",
    "overTheDay",
    "ptcpDontInit",
    "pctOfVol",
    "scale",
    "stayOnSd",
    "work",
    "goAlong",
    "tryScale",
    "doNotRdc",
    "cclOnSysFailr",
    "cclOnTradgHalt",
    "tradAlong",
    "strctLmt",
    "ignrPricVldtyChcks",
    "rinsttOnSysFailr",
    "rinsttOnTradgHalt",
    "cclIfNotBest",
    "xtrnlRtgAllwd",
    "xtrnlRtgNotAllwd",
    "imbalOnly",
    "intrmktSweep",
    "netg"
})
public class SecuritiesExecutionInstructions1 {

    @XmlElement(name = "AllOrNn")
    protected Boolean allOrNn;
    @XmlElement(name = "CallFrst")
    protected Boolean callFrst;
    @XmlElement(name = "Cross")
    protected Boolean cross;
    @XmlElement(name = "CstmrDisp")
    protected Boolean cstmrDisp;
    @XmlElement(name = "Hld")
    protected Boolean hld;
    @XmlElement(name = "Incr")
    protected Boolean incr;
    @XmlElement(name = "InstnsOnly")
    protected Boolean instnsOnly;
    @XmlElement(name = "NonNgtbl")
    protected Boolean nonNgtbl;
    @XmlElement(name = "OverTheDay")
    protected Boolean overTheDay;
    @XmlElement(name = "PtcpDontInit")
    protected Boolean ptcpDontInit;
    @XmlElement(name = "PctOfVol")
    protected Boolean pctOfVol;
    @XmlElement(name = "Scale")
    protected Boolean scale;
    @XmlElement(name = "StayOnSd")
    @XmlSchemaType(name = "string")
    protected StayOnSideType1Code stayOnSd;
    @XmlElement(name = "Work")
    protected Boolean work;
    @XmlElement(name = "GoAlong")
    protected Boolean goAlong;
    @XmlElement(name = "TryScale")
    protected Boolean tryScale;
    @XmlElement(name = "DoNotRdc")
    protected Boolean doNotRdc;
    @XmlElement(name = "CclOnSysFailr")
    protected Boolean cclOnSysFailr;
    @XmlElement(name = "CclOnTradgHalt")
    protected Boolean cclOnTradgHalt;
    @XmlElement(name = "TradAlong")
    protected Boolean tradAlong;
    @XmlElement(name = "StrctLmt")
    protected Boolean strctLmt;
    @XmlElement(name = "IgnrPricVldtyChcks")
    protected Boolean ignrPricVldtyChcks;
    @XmlElement(name = "RinsttOnSysFailr")
    protected Boolean rinsttOnSysFailr;
    @XmlElement(name = "RinsttOnTradgHalt")
    protected Boolean rinsttOnTradgHalt;
    @XmlElement(name = "CclIfNotBest")
    protected Boolean cclIfNotBest;
    @XmlElement(name = "XtrnlRtgAllwd")
    protected Boolean xtrnlRtgAllwd;
    @XmlElement(name = "XtrnlRtgNotAllwd")
    protected Boolean xtrnlRtgNotAllwd;
    @XmlElement(name = "ImbalOnly")
    protected Boolean imbalOnly;
    @XmlElement(name = "IntrmktSweep")
    protected Boolean intrmktSweep;
    @XmlElement(name = "Netg")
    protected Boolean netg;

    /**
     * Gets the value of the allOrNn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllOrNn() {
        return allOrNn;
    }

    /**
     * Sets the value of the allOrNn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setAllOrNn(Boolean value) {
        this.allOrNn = value;
        return this;
    }

    /**
     * Gets the value of the callFrst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallFrst() {
        return callFrst;
    }

    /**
     * Sets the value of the callFrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setCallFrst(Boolean value) {
        this.callFrst = value;
        return this;
    }

    /**
     * Gets the value of the cross property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCross() {
        return cross;
    }

    /**
     * Sets the value of the cross property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setCross(Boolean value) {
        this.cross = value;
        return this;
    }

    /**
     * Gets the value of the cstmrDisp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstmrDisp() {
        return cstmrDisp;
    }

    /**
     * Sets the value of the cstmrDisp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setCstmrDisp(Boolean value) {
        this.cstmrDisp = value;
        return this;
    }

    /**
     * Gets the value of the hld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHld() {
        return hld;
    }

    /**
     * Sets the value of the hld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setHld(Boolean value) {
        this.hld = value;
        return this;
    }

    /**
     * Gets the value of the incr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncr() {
        return incr;
    }

    /**
     * Sets the value of the incr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setIncr(Boolean value) {
        this.incr = value;
        return this;
    }

    /**
     * Gets the value of the instnsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstnsOnly() {
        return instnsOnly;
    }

    /**
     * Sets the value of the instnsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setInstnsOnly(Boolean value) {
        this.instnsOnly = value;
        return this;
    }

    /**
     * Gets the value of the nonNgtbl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonNgtbl() {
        return nonNgtbl;
    }

    /**
     * Sets the value of the nonNgtbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setNonNgtbl(Boolean value) {
        this.nonNgtbl = value;
        return this;
    }

    /**
     * Gets the value of the overTheDay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverTheDay() {
        return overTheDay;
    }

    /**
     * Sets the value of the overTheDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setOverTheDay(Boolean value) {
        this.overTheDay = value;
        return this;
    }

    /**
     * Gets the value of the ptcpDontInit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPtcpDontInit() {
        return ptcpDontInit;
    }

    /**
     * Sets the value of the ptcpDontInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setPtcpDontInit(Boolean value) {
        this.ptcpDontInit = value;
        return this;
    }

    /**
     * Gets the value of the pctOfVol property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPctOfVol() {
        return pctOfVol;
    }

    /**
     * Sets the value of the pctOfVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setPctOfVol(Boolean value) {
        this.pctOfVol = value;
        return this;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setScale(Boolean value) {
        this.scale = value;
        return this;
    }

    /**
     * Gets the value of the stayOnSd property.
     * 
     * @return
     *     possible object is
     *     {@link StayOnSideType1Code }
     *     
     */
    public StayOnSideType1Code getStayOnSd() {
        return stayOnSd;
    }

    /**
     * Sets the value of the stayOnSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayOnSideType1Code }
     *     
     */
    public SecuritiesExecutionInstructions1 setStayOnSd(StayOnSideType1Code value) {
        this.stayOnSd = value;
        return this;
    }

    /**
     * Gets the value of the work property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWork() {
        return work;
    }

    /**
     * Sets the value of the work property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setWork(Boolean value) {
        this.work = value;
        return this;
    }

    /**
     * Gets the value of the goAlong property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoAlong() {
        return goAlong;
    }

    /**
     * Sets the value of the goAlong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setGoAlong(Boolean value) {
        this.goAlong = value;
        return this;
    }

    /**
     * Gets the value of the tryScale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTryScale() {
        return tryScale;
    }

    /**
     * Sets the value of the tryScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setTryScale(Boolean value) {
        this.tryScale = value;
        return this;
    }

    /**
     * Gets the value of the doNotRdc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotRdc() {
        return doNotRdc;
    }

    /**
     * Sets the value of the doNotRdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setDoNotRdc(Boolean value) {
        this.doNotRdc = value;
        return this;
    }

    /**
     * Gets the value of the cclOnSysFailr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCclOnSysFailr() {
        return cclOnSysFailr;
    }

    /**
     * Sets the value of the cclOnSysFailr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setCclOnSysFailr(Boolean value) {
        this.cclOnSysFailr = value;
        return this;
    }

    /**
     * Gets the value of the cclOnTradgHalt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCclOnTradgHalt() {
        return cclOnTradgHalt;
    }

    /**
     * Sets the value of the cclOnTradgHalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setCclOnTradgHalt(Boolean value) {
        this.cclOnTradgHalt = value;
        return this;
    }

    /**
     * Gets the value of the tradAlong property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTradAlong() {
        return tradAlong;
    }

    /**
     * Sets the value of the tradAlong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setTradAlong(Boolean value) {
        this.tradAlong = value;
        return this;
    }

    /**
     * Gets the value of the strctLmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrctLmt() {
        return strctLmt;
    }

    /**
     * Sets the value of the strctLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setStrctLmt(Boolean value) {
        this.strctLmt = value;
        return this;
    }

    /**
     * Gets the value of the ignrPricVldtyChcks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnrPricVldtyChcks() {
        return ignrPricVldtyChcks;
    }

    /**
     * Sets the value of the ignrPricVldtyChcks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setIgnrPricVldtyChcks(Boolean value) {
        this.ignrPricVldtyChcks = value;
        return this;
    }

    /**
     * Gets the value of the rinsttOnSysFailr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRinsttOnSysFailr() {
        return rinsttOnSysFailr;
    }

    /**
     * Sets the value of the rinsttOnSysFailr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setRinsttOnSysFailr(Boolean value) {
        this.rinsttOnSysFailr = value;
        return this;
    }

    /**
     * Gets the value of the rinsttOnTradgHalt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRinsttOnTradgHalt() {
        return rinsttOnTradgHalt;
    }

    /**
     * Sets the value of the rinsttOnTradgHalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setRinsttOnTradgHalt(Boolean value) {
        this.rinsttOnTradgHalt = value;
        return this;
    }

    /**
     * Gets the value of the cclIfNotBest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCclIfNotBest() {
        return cclIfNotBest;
    }

    /**
     * Sets the value of the cclIfNotBest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setCclIfNotBest(Boolean value) {
        this.cclIfNotBest = value;
        return this;
    }

    /**
     * Gets the value of the xtrnlRtgAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXtrnlRtgAllwd() {
        return xtrnlRtgAllwd;
    }

    /**
     * Sets the value of the xtrnlRtgAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setXtrnlRtgAllwd(Boolean value) {
        this.xtrnlRtgAllwd = value;
        return this;
    }

    /**
     * Gets the value of the xtrnlRtgNotAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXtrnlRtgNotAllwd() {
        return xtrnlRtgNotAllwd;
    }

    /**
     * Sets the value of the xtrnlRtgNotAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setXtrnlRtgNotAllwd(Boolean value) {
        this.xtrnlRtgNotAllwd = value;
        return this;
    }

    /**
     * Gets the value of the imbalOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImbalOnly() {
        return imbalOnly;
    }

    /**
     * Sets the value of the imbalOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setImbalOnly(Boolean value) {
        this.imbalOnly = value;
        return this;
    }

    /**
     * Gets the value of the intrmktSweep property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrmktSweep() {
        return intrmktSweep;
    }

    /**
     * Sets the value of the intrmktSweep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setIntrmktSweep(Boolean value) {
        this.intrmktSweep = value;
        return this;
    }

    /**
     * Gets the value of the netg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetg() {
        return netg;
    }

    /**
     * Sets the value of the netg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesExecutionInstructions1 setNetg(Boolean value) {
        this.netg = value;
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
