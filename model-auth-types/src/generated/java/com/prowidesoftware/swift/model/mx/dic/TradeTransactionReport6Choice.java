
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
 * Data concerning the reporting trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransactionReport6Choice", propOrder = {
    "_new",
    "mod",
    "err",
    "earlyTermntn",
    "posCmpnt",
    "collUpd",
    "crrctn",
    "valtnUpd"
})
public class TradeTransactionReport6Choice {

    @XmlElement(name = "New")
    protected TradeNewTransaction6 _new;
    @XmlElement(name = "Mod")
    protected TradeTransactionModification7 mod;
    @XmlElement(name = "Err")
    protected TradeError2 err;
    @XmlElement(name = "EarlyTermntn")
    protected TradeEarlyTermination2 earlyTermntn;
    @XmlElement(name = "PosCmpnt")
    protected TradeTransactionPositionComponent2 posCmpnt;
    @XmlElement(name = "CollUpd")
    protected TradeTransactionCollateralUpdate2 collUpd;
    @XmlElement(name = "Crrctn")
    protected TradeTransactionCorrection6 crrctn;
    @XmlElement(name = "ValtnUpd")
    protected TradeValuationUpdate2 valtnUpd;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNewTransaction6 }
     *     
     */
    public TradeNewTransaction6 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNewTransaction6 }
     *     
     */
    public TradeTransactionReport6Choice setNew(TradeNewTransaction6 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionModification7 }
     *     
     */
    public TradeTransactionModification7 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionModification7 }
     *     
     */
    public TradeTransactionReport6Choice setMod(TradeTransactionModification7 value) {
        this.mod = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link TradeError2 }
     *     
     */
    public TradeError2 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeError2 }
     *     
     */
    public TradeTransactionReport6Choice setErr(TradeError2 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the earlyTermntn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeEarlyTermination2 }
     *     
     */
    public TradeEarlyTermination2 getEarlyTermntn() {
        return earlyTermntn;
    }

    /**
     * Sets the value of the earlyTermntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeEarlyTermination2 }
     *     
     */
    public TradeTransactionReport6Choice setEarlyTermntn(TradeEarlyTermination2 value) {
        this.earlyTermntn = value;
        return this;
    }

    /**
     * Gets the value of the posCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionPositionComponent2 }
     *     
     */
    public TradeTransactionPositionComponent2 getPosCmpnt() {
        return posCmpnt;
    }

    /**
     * Sets the value of the posCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionPositionComponent2 }
     *     
     */
    public TradeTransactionReport6Choice setPosCmpnt(TradeTransactionPositionComponent2 value) {
        this.posCmpnt = value;
        return this;
    }

    /**
     * Gets the value of the collUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCollateralUpdate2 }
     *     
     */
    public TradeTransactionCollateralUpdate2 getCollUpd() {
        return collUpd;
    }

    /**
     * Sets the value of the collUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCollateralUpdate2 }
     *     
     */
    public TradeTransactionReport6Choice setCollUpd(TradeTransactionCollateralUpdate2 value) {
        this.collUpd = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCorrection6 }
     *     
     */
    public TradeTransactionCorrection6 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCorrection6 }
     *     
     */
    public TradeTransactionReport6Choice setCrrctn(TradeTransactionCorrection6 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the valtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeValuationUpdate2 }
     *     
     */
    public TradeValuationUpdate2 getValtnUpd() {
        return valtnUpd;
    }

    /**
     * Sets the value of the valtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeValuationUpdate2 }
     *     
     */
    public TradeTransactionReport6Choice setValtnUpd(TradeValuationUpdate2 value) {
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
