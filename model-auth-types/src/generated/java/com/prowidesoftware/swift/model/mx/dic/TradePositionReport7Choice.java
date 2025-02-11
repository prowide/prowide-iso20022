
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
 * Provides details on the relevant action types for trade positions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePositionReport7Choice", propOrder = {
    "_new",
    "mod",
    "crrctn",
    "earlyTermntn",
    "valtnUpd",
    "err",
    "othr"
})
public class TradePositionReport7Choice {

    @XmlElement(name = "New")
    protected TradeNewPosition5 _new;
    @XmlElement(name = "Mod")
    protected TradeDataReport1 mod;
    @XmlElement(name = "Crrctn")
    protected TradeDataReport1 crrctn;
    @XmlElement(name = "EarlyTermntn")
    protected TradePositionEarlyTermination5 earlyTermntn;
    @XmlElement(name = "ValtnUpd")
    protected TradePositionValuationUpdate5 valtnUpd;
    @XmlElement(name = "Err")
    protected TradeDataReport1 err;
    @XmlElement(name = "Othr")
    protected TradePositionOther5 othr;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNewPosition5 }
     *     
     */
    public TradeNewPosition5 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNewPosition5 }
     *     
     */
    public TradePositionReport7Choice setNew(TradeNewPosition5 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradeDataReport1 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradePositionReport7Choice setMod(TradeDataReport1 value) {
        this.mod = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradeDataReport1 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradePositionReport7Choice setCrrctn(TradeDataReport1 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the earlyTermntn property.
     * 
     * @return
     *     possible object is
     *     {@link TradePositionEarlyTermination5 }
     *     
     */
    public TradePositionEarlyTermination5 getEarlyTermntn() {
        return earlyTermntn;
    }

    /**
     * Sets the value of the earlyTermntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePositionEarlyTermination5 }
     *     
     */
    public TradePositionReport7Choice setEarlyTermntn(TradePositionEarlyTermination5 value) {
        this.earlyTermntn = value;
        return this;
    }

    /**
     * Gets the value of the valtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradePositionValuationUpdate5 }
     *     
     */
    public TradePositionValuationUpdate5 getValtnUpd() {
        return valtnUpd;
    }

    /**
     * Sets the value of the valtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePositionValuationUpdate5 }
     *     
     */
    public TradePositionReport7Choice setValtnUpd(TradePositionValuationUpdate5 value) {
        this.valtnUpd = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradeDataReport1 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDataReport1 }
     *     
     */
    public TradePositionReport7Choice setErr(TradeDataReport1 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link TradePositionOther5 }
     *     
     */
    public TradePositionOther5 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePositionOther5 }
     *     
     */
    public TradePositionReport7Choice setOthr(TradePositionOther5 value) {
        this.othr = value;
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
