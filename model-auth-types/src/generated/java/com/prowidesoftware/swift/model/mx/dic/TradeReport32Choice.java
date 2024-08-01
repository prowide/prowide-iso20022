
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "TradeReport32Choice", propOrder = {
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
public class TradeReport32Choice {

    @XmlElement(name = "New")
    protected TradeData42 _new;
    @XmlElement(name = "Mod")
    protected TradeData42 mod;
    @XmlElement(name = "Crrctn")
    protected TradeData42 crrctn;
    @XmlElement(name = "Termntn")
    protected TradeData42 termntn;
    @XmlElement(name = "PosCmpnt")
    protected TradeData42 posCmpnt;
    @XmlElement(name = "ValtnUpd")
    protected TradeData42 valtnUpd;
    @XmlElement(name = "Cmprssn")
    protected TradeData42 cmprssn;
    @XmlElement(name = "Err")
    protected TradeData42 err;
    @XmlElement(name = "PortOut")
    protected TradeData42 portOut;
    @XmlElement(name = "Rvv")
    protected TradeData42 rvv;
    @XmlElement(name = "Othr")
    protected TradeData42 othr;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public TradeReport32Choice setNew(TradeData42 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public TradeReport32Choice setMod(TradeData42 value) {
        this.mod = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public TradeReport32Choice setCrrctn(TradeData42 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the termntn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getTermntn() {
        return termntn;
    }

    /**
     * Sets the value of the termntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public TradeReport32Choice setTermntn(TradeData42 value) {
        this.termntn = value;
        return this;
    }

    /**
     * Gets the value of the posCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getPosCmpnt() {
        return posCmpnt;
    }

    /**
     * Sets the value of the posCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public TradeReport32Choice setPosCmpnt(TradeData42 value) {
        this.posCmpnt = value;
        return this;
    }

    /**
     * Gets the value of the valtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getValtnUpd() {
        return valtnUpd;
    }

    /**
     * Sets the value of the valtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public TradeReport32Choice setValtnUpd(TradeData42 value) {
        this.valtnUpd = value;
        return this;
    }

    /**
     * Gets the value of the cmprssn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getCmprssn() {
        return cmprssn;
    }

    /**
     * Sets the value of the cmprssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public TradeReport32Choice setCmprssn(TradeData42 value) {
        this.cmprssn = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public TradeReport32Choice setErr(TradeData42 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the portOut property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getPortOut() {
        return portOut;
    }

    /**
     * Sets the value of the portOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public TradeReport32Choice setPortOut(TradeData42 value) {
        this.portOut = value;
        return this;
    }

    /**
     * Gets the value of the rvv property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getRvv() {
        return rvv;
    }

    /**
     * Sets the value of the rvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public TradeReport32Choice setRvv(TradeData42 value) {
        this.rvv = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public TradeReport32Choice setOthr(TradeData42 value) {
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
