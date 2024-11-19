
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
 * Provides details on the reported trade transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReport10Choice", propOrder = {
    "_new",
    "mod",
    "err",
    "earlyTermntn",
    "posCmpnt",
    "collUpd",
    "crrctn",
    "valtnUpd"
})
public class TradeReport10Choice {

    @XmlElement(name = "New")
    protected TradeNewTransaction9 _new;
    @XmlElement(name = "Mod")
    protected TradeTransactionCorrection9 mod;
    @XmlElement(name = "Err")
    protected TradeError6 err;
    @XmlElement(name = "EarlyTermntn")
    protected TradeError6 earlyTermntn;
    @XmlElement(name = "PosCmpnt")
    protected TradeTransactionPositionComponent5 posCmpnt;
    @XmlElement(name = "CollUpd")
    protected TradeTransactionCollateralUpdate5 collUpd;
    @XmlElement(name = "Crrctn")
    protected TradeTransactionCorrection9 crrctn;
    @XmlElement(name = "ValtnUpd")
    protected TradeValuationUpdate6 valtnUpd;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNewTransaction9 }
     *     
     */
    public TradeNewTransaction9 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNewTransaction9 }
     *     
     */
    public TradeReport10Choice setNew(TradeNewTransaction9 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCorrection9 }
     *     
     */
    public TradeTransactionCorrection9 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCorrection9 }
     *     
     */
    public TradeReport10Choice setMod(TradeTransactionCorrection9 value) {
        this.mod = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link TradeError6 }
     *     
     */
    public TradeError6 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeError6 }
     *     
     */
    public TradeReport10Choice setErr(TradeError6 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the earlyTermntn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeError6 }
     *     
     */
    public TradeError6 getEarlyTermntn() {
        return earlyTermntn;
    }

    /**
     * Sets the value of the earlyTermntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeError6 }
     *     
     */
    public TradeReport10Choice setEarlyTermntn(TradeError6 value) {
        this.earlyTermntn = value;
        return this;
    }

    /**
     * Gets the value of the posCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionPositionComponent5 }
     *     
     */
    public TradeTransactionPositionComponent5 getPosCmpnt() {
        return posCmpnt;
    }

    /**
     * Sets the value of the posCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionPositionComponent5 }
     *     
     */
    public TradeReport10Choice setPosCmpnt(TradeTransactionPositionComponent5 value) {
        this.posCmpnt = value;
        return this;
    }

    /**
     * Gets the value of the collUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCollateralUpdate5 }
     *     
     */
    public TradeTransactionCollateralUpdate5 getCollUpd() {
        return collUpd;
    }

    /**
     * Sets the value of the collUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCollateralUpdate5 }
     *     
     */
    public TradeReport10Choice setCollUpd(TradeTransactionCollateralUpdate5 value) {
        this.collUpd = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCorrection9 }
     *     
     */
    public TradeTransactionCorrection9 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCorrection9 }
     *     
     */
    public TradeReport10Choice setCrrctn(TradeTransactionCorrection9 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the valtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeValuationUpdate6 }
     *     
     */
    public TradeValuationUpdate6 getValtnUpd() {
        return valtnUpd;
    }

    /**
     * Sets the value of the valtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeValuationUpdate6 }
     *     
     */
    public TradeReport10Choice setValtnUpd(TradeValuationUpdate6 value) {
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
