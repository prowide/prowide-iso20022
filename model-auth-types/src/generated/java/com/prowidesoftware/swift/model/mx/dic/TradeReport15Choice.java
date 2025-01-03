
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
 * Position/transaction reporting under the local regulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReport15Choice", propOrder = {
    "_new",
    "mod",
    "crrctn",
    "termntn",
    "posCmpnt",
    "valtnUpd",
    "cmprssn",
    "err",
    "othr"
})
public class TradeReport15Choice {

    @XmlElement(name = "New")
    protected TradeData23 _new;
    @XmlElement(name = "Mod")
    protected TradeData23 mod;
    @XmlElement(name = "Crrctn")
    protected TradeData23 crrctn;
    @XmlElement(name = "Termntn")
    protected TradeData23 termntn;
    @XmlElement(name = "PosCmpnt")
    protected TradeData23 posCmpnt;
    @XmlElement(name = "ValtnUpd")
    protected TradeData23 valtnUpd;
    @XmlElement(name = "Cmprssn")
    protected TradeData23 cmprssn;
    @XmlElement(name = "Err")
    protected TradeData23 err;
    @XmlElement(name = "Othr")
    protected TradeData23 othr;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData23 }
     *     
     */
    public TradeData23 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData23 }
     *     
     */
    public TradeReport15Choice setNew(TradeData23 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData23 }
     *     
     */
    public TradeData23 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData23 }
     *     
     */
    public TradeReport15Choice setMod(TradeData23 value) {
        this.mod = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData23 }
     *     
     */
    public TradeData23 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData23 }
     *     
     */
    public TradeReport15Choice setCrrctn(TradeData23 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the termntn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData23 }
     *     
     */
    public TradeData23 getTermntn() {
        return termntn;
    }

    /**
     * Sets the value of the termntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData23 }
     *     
     */
    public TradeReport15Choice setTermntn(TradeData23 value) {
        this.termntn = value;
        return this;
    }

    /**
     * Gets the value of the posCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData23 }
     *     
     */
    public TradeData23 getPosCmpnt() {
        return posCmpnt;
    }

    /**
     * Sets the value of the posCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData23 }
     *     
     */
    public TradeReport15Choice setPosCmpnt(TradeData23 value) {
        this.posCmpnt = value;
        return this;
    }

    /**
     * Gets the value of the valtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData23 }
     *     
     */
    public TradeData23 getValtnUpd() {
        return valtnUpd;
    }

    /**
     * Sets the value of the valtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData23 }
     *     
     */
    public TradeReport15Choice setValtnUpd(TradeData23 value) {
        this.valtnUpd = value;
        return this;
    }

    /**
     * Gets the value of the cmprssn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData23 }
     *     
     */
    public TradeData23 getCmprssn() {
        return cmprssn;
    }

    /**
     * Sets the value of the cmprssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData23 }
     *     
     */
    public TradeReport15Choice setCmprssn(TradeData23 value) {
        this.cmprssn = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData23 }
     *     
     */
    public TradeData23 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData23 }
     *     
     */
    public TradeReport15Choice setErr(TradeData23 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData23 }
     *     
     */
    public TradeData23 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData23 }
     *     
     */
    public TradeReport15Choice setOthr(TradeData23 value) {
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
