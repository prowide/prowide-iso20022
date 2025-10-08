
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
 * Counters of media inside an ATM cassette.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCassetteCounters5", propOrder = {
    "tp",
    "addedNb",
    "rmvdNb",
    "rmvdAmt",
    "dspnsdNb",
    "dpstdNb",
    "dpstdAmt",
    "rcycldNb",
    "rtrctdNb",
    "rtrctdAmt",
    "rjctdNb",
    "presntdNb",
    "initlNb",
    "initlAmt"
})
public class ATMCassetteCounters5 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCounterType3Code tp;
    @XmlElement(name = "AddedNb")
    protected BigDecimal addedNb;
    @XmlElement(name = "RmvdNb")
    protected BigDecimal rmvdNb;
    @XmlElement(name = "RmvdAmt")
    protected BigDecimal rmvdAmt;
    @XmlElement(name = "DspnsdNb")
    protected BigDecimal dspnsdNb;
    @XmlElement(name = "DpstdNb")
    protected BigDecimal dpstdNb;
    @XmlElement(name = "DpstdAmt")
    protected BigDecimal dpstdAmt;
    @XmlElement(name = "RcycldNb")
    protected BigDecimal rcycldNb;
    @XmlElement(name = "RtrctdNb")
    protected BigDecimal rtrctdNb;
    @XmlElement(name = "RtrctdAmt")
    protected BigDecimal rtrctdAmt;
    @XmlElement(name = "RjctdNb")
    protected BigDecimal rjctdNb;
    @XmlElement(name = "PresntdNb")
    protected BigDecimal presntdNb;
    @XmlElement(name = "InitlNb")
    protected BigDecimal initlNb;
    @XmlElement(name = "InitlAmt")
    protected BigDecimal initlAmt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCounterType3Code }
     *     
     */
    public ATMCounterType3Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCounterType3Code }
     *     
     */
    public ATMCassetteCounters5 setTp(ATMCounterType3Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the addedNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddedNb() {
        return addedNb;
    }

    /**
     * Sets the value of the addedNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setAddedNb(BigDecimal value) {
        this.addedNb = value;
        return this;
    }

    /**
     * Gets the value of the rmvdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRmvdNb() {
        return rmvdNb;
    }

    /**
     * Sets the value of the rmvdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setRmvdNb(BigDecimal value) {
        this.rmvdNb = value;
        return this;
    }

    /**
     * Gets the value of the rmvdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRmvdAmt() {
        return rmvdAmt;
    }

    /**
     * Sets the value of the rmvdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setRmvdAmt(BigDecimal value) {
        this.rmvdAmt = value;
        return this;
    }

    /**
     * Gets the value of the dspnsdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDspnsdNb() {
        return dspnsdNb;
    }

    /**
     * Sets the value of the dspnsdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setDspnsdNb(BigDecimal value) {
        this.dspnsdNb = value;
        return this;
    }

    /**
     * Gets the value of the dpstdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDpstdNb() {
        return dpstdNb;
    }

    /**
     * Sets the value of the dpstdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setDpstdNb(BigDecimal value) {
        this.dpstdNb = value;
        return this;
    }

    /**
     * Gets the value of the dpstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDpstdAmt() {
        return dpstdAmt;
    }

    /**
     * Sets the value of the dpstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setDpstdAmt(BigDecimal value) {
        this.dpstdAmt = value;
        return this;
    }

    /**
     * Gets the value of the rcycldNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRcycldNb() {
        return rcycldNb;
    }

    /**
     * Sets the value of the rcycldNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setRcycldNb(BigDecimal value) {
        this.rcycldNb = value;
        return this;
    }

    /**
     * Gets the value of the rtrctdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtrctdNb() {
        return rtrctdNb;
    }

    /**
     * Sets the value of the rtrctdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setRtrctdNb(BigDecimal value) {
        this.rtrctdNb = value;
        return this;
    }

    /**
     * Gets the value of the rtrctdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtrctdAmt() {
        return rtrctdAmt;
    }

    /**
     * Sets the value of the rtrctdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setRtrctdAmt(BigDecimal value) {
        this.rtrctdAmt = value;
        return this;
    }

    /**
     * Gets the value of the rjctdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRjctdNb() {
        return rjctdNb;
    }

    /**
     * Sets the value of the rjctdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setRjctdNb(BigDecimal value) {
        this.rjctdNb = value;
        return this;
    }

    /**
     * Gets the value of the presntdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPresntdNb() {
        return presntdNb;
    }

    /**
     * Sets the value of the presntdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setPresntdNb(BigDecimal value) {
        this.presntdNb = value;
        return this;
    }

    /**
     * Gets the value of the initlNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitlNb() {
        return initlNb;
    }

    /**
     * Sets the value of the initlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setInitlNb(BigDecimal value) {
        this.initlNb = value;
        return this;
    }

    /**
     * Gets the value of the initlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitlAmt() {
        return initlAmt;
    }

    /**
     * Sets the value of the initlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters5 setInitlAmt(BigDecimal value) {
        this.initlAmt = value;
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
