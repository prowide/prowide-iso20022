
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
@XmlType(name = "TradeReport33Choice", propOrder = {
    "_new",
    "mod",
    "crrctn",
    "termntn",
    "posCmpnt",
    "valtnUpd",
    "cmprssn",
    "err",
    "portOut",
    "rvv",
    "othr"
})
public class TradeReport33Choice {

    @XmlElement(name = "New")
    protected TradeData43 _new;
    @XmlElement(name = "Mod")
    protected TradeData43 mod;
    @XmlElement(name = "Crrctn")
    protected TradeData43 crrctn;
    @XmlElement(name = "Termntn")
    protected TradeData43 termntn;
    @XmlElement(name = "PosCmpnt")
    protected TradeData43 posCmpnt;
    @XmlElement(name = "ValtnUpd")
    protected TradeData43 valtnUpd;
    @XmlElement(name = "Cmprssn")
    protected TradeData43 cmprssn;
    @XmlElement(name = "Err")
    protected TradeData43 err;
    @XmlElement(name = "PortOut")
    protected TradeData43 portOut;
    @XmlElement(name = "Rvv")
    protected TradeData43 rvv;
    @XmlElement(name = "Othr")
    protected TradeData43 othr;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData43 }
     *     
     */
    public TradeData43 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData43 }
     *     
     */
    public TradeReport33Choice setNew(TradeData43 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData43 }
     *     
     */
    public TradeData43 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData43 }
     *     
     */
    public TradeReport33Choice setMod(TradeData43 value) {
        this.mod = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData43 }
     *     
     */
    public TradeData43 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData43 }
     *     
     */
    public TradeReport33Choice setCrrctn(TradeData43 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the termntn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData43 }
     *     
     */
    public TradeData43 getTermntn() {
        return termntn;
    }

    /**
     * Sets the value of the termntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData43 }
     *     
     */
    public TradeReport33Choice setTermntn(TradeData43 value) {
        this.termntn = value;
        return this;
    }

    /**
     * Gets the value of the posCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData43 }
     *     
     */
    public TradeData43 getPosCmpnt() {
        return posCmpnt;
    }

    /**
     * Sets the value of the posCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData43 }
     *     
     */
    public TradeReport33Choice setPosCmpnt(TradeData43 value) {
        this.posCmpnt = value;
        return this;
    }

    /**
     * Gets the value of the valtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData43 }
     *     
     */
    public TradeData43 getValtnUpd() {
        return valtnUpd;
    }

    /**
     * Sets the value of the valtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData43 }
     *     
     */
    public TradeReport33Choice setValtnUpd(TradeData43 value) {
        this.valtnUpd = value;
        return this;
    }

    /**
     * Gets the value of the cmprssn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData43 }
     *     
     */
    public TradeData43 getCmprssn() {
        return cmprssn;
    }

    /**
     * Sets the value of the cmprssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData43 }
     *     
     */
    public TradeReport33Choice setCmprssn(TradeData43 value) {
        this.cmprssn = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData43 }
     *     
     */
    public TradeData43 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData43 }
     *     
     */
    public TradeReport33Choice setErr(TradeData43 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the portOut property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData43 }
     *     
     */
    public TradeData43 getPortOut() {
        return portOut;
    }

    /**
     * Sets the value of the portOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData43 }
     *     
     */
    public TradeReport33Choice setPortOut(TradeData43 value) {
        this.portOut = value;
        return this;
    }

    /**
     * Gets the value of the rvv property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData43 }
     *     
     */
    public TradeData43 getRvv() {
        return rvv;
    }

    /**
     * Sets the value of the rvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData43 }
     *     
     */
    public TradeReport33Choice setRvv(TradeData43 value) {
        this.rvv = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData43 }
     *     
     */
    public TradeData43 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData43 }
     *     
     */
    public TradeReport33Choice setOthr(TradeData43 value) {
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
