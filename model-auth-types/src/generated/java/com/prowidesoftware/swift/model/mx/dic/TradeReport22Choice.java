
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
 * Provides details on the reported trade transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReport22Choice", propOrder = {
    "_new",
    "mod",
    "err",
    "earlyTermntn",
    "posCmpnt",
    "collUpd",
    "crrctn",
    "valtnUpd"
})
public class TradeReport22Choice {

    @XmlElement(name = "New")
    protected TradeNewTransaction13 _new;
    @XmlElement(name = "Mod")
    protected TradeTransactionCorrection13 mod;
    @XmlElement(name = "Err")
    protected TradeError9 err;
    @XmlElement(name = "EarlyTermntn")
    protected TradeError9 earlyTermntn;
    @XmlElement(name = "PosCmpnt")
    protected TradeTransactionPositionComponent8 posCmpnt;
    @XmlElement(name = "CollUpd")
    protected TradeTransactionCollateralUpdate8 collUpd;
    @XmlElement(name = "Crrctn")
    protected TradeTransactionCorrection13 crrctn;
    @XmlElement(name = "ValtnUpd")
    protected TradeValuationUpdate9 valtnUpd;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNewTransaction13 }
     *     
     */
    public TradeNewTransaction13 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNewTransaction13 }
     *     
     */
    public TradeReport22Choice setNew(TradeNewTransaction13 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCorrection13 }
     *     
     */
    public TradeTransactionCorrection13 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCorrection13 }
     *     
     */
    public TradeReport22Choice setMod(TradeTransactionCorrection13 value) {
        this.mod = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link TradeError9 }
     *     
     */
    public TradeError9 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeError9 }
     *     
     */
    public TradeReport22Choice setErr(TradeError9 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the earlyTermntn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeError9 }
     *     
     */
    public TradeError9 getEarlyTermntn() {
        return earlyTermntn;
    }

    /**
     * Sets the value of the earlyTermntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeError9 }
     *     
     */
    public TradeReport22Choice setEarlyTermntn(TradeError9 value) {
        this.earlyTermntn = value;
        return this;
    }

    /**
     * Gets the value of the posCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionPositionComponent8 }
     *     
     */
    public TradeTransactionPositionComponent8 getPosCmpnt() {
        return posCmpnt;
    }

    /**
     * Sets the value of the posCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionPositionComponent8 }
     *     
     */
    public TradeReport22Choice setPosCmpnt(TradeTransactionPositionComponent8 value) {
        this.posCmpnt = value;
        return this;
    }

    /**
     * Gets the value of the collUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCollateralUpdate8 }
     *     
     */
    public TradeTransactionCollateralUpdate8 getCollUpd() {
        return collUpd;
    }

    /**
     * Sets the value of the collUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCollateralUpdate8 }
     *     
     */
    public TradeReport22Choice setCollUpd(TradeTransactionCollateralUpdate8 value) {
        this.collUpd = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCorrection13 }
     *     
     */
    public TradeTransactionCorrection13 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCorrection13 }
     *     
     */
    public TradeReport22Choice setCrrctn(TradeTransactionCorrection13 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the valtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeValuationUpdate9 }
     *     
     */
    public TradeValuationUpdate9 getValtnUpd() {
        return valtnUpd;
    }

    /**
     * Sets the value of the valtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeValuationUpdate9 }
     *     
     */
    public TradeReport22Choice setValtnUpd(TradeValuationUpdate9 value) {
        this.valtnUpd = value;
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
