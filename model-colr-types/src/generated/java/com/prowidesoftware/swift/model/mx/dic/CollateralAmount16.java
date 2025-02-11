
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
 * Provides details on the collateral valuation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount16", propOrder = {
    "valOfCollHeld",
    "ttlXpsr",
    "mrgn",
    "ttlCollReqrd",
    "ttlAcrdIntrst",
    "ttlValOfOwnColl",
    "ttlValOfReusdColl",
    "ttlOfPrncpls",
    "ttlPdgCollIn",
    "ttlPdgCollOut",
    "ttlCshFaild"
})
public class CollateralAmount16 {

    @XmlElement(name = "ValOfCollHeld", required = true)
    protected ActiveOrHistoricCurrencyAndAmount valOfCollHeld;
    @XmlElement(name = "TtlXpsr", required = true)
    protected ActiveOrHistoricCurrencyAndAmount ttlXpsr;
    @XmlElement(name = "Mrgn")
    protected AmountAndDirection53 mrgn;
    @XmlElement(name = "TtlCollReqrd")
    protected ActiveOrHistoricCurrencyAndAmount ttlCollReqrd;
    @XmlElement(name = "TtlAcrdIntrst")
    protected ActiveOrHistoricCurrencyAndAmount ttlAcrdIntrst;
    @XmlElement(name = "TtlValOfOwnColl")
    protected ActiveOrHistoricCurrencyAndAmount ttlValOfOwnColl;
    @XmlElement(name = "TtlValOfReusdColl")
    protected ActiveOrHistoricCurrencyAndAmount ttlValOfReusdColl;
    @XmlElement(name = "TtlOfPrncpls")
    protected ActiveOrHistoricCurrencyAndAmount ttlOfPrncpls;
    @XmlElement(name = "TtlPdgCollIn")
    protected ActiveOrHistoricCurrencyAndAmount ttlPdgCollIn;
    @XmlElement(name = "TtlPdgCollOut")
    protected ActiveOrHistoricCurrencyAndAmount ttlPdgCollOut;
    @XmlElement(name = "TtlCshFaild")
    protected ActiveOrHistoricCurrencyAndAmount ttlCshFaild;

    /**
     * Gets the value of the valOfCollHeld property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getValOfCollHeld() {
        return valOfCollHeld;
    }

    /**
     * Sets the value of the valOfCollHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount16 setValOfCollHeld(ActiveOrHistoricCurrencyAndAmount value) {
        this.valOfCollHeld = value;
        return this;
    }

    /**
     * Gets the value of the ttlXpsr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlXpsr() {
        return ttlXpsr;
    }

    /**
     * Sets the value of the ttlXpsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount16 setTtlXpsr(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlXpsr = value;
        return this;
    }

    /**
     * Gets the value of the mrgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getMrgn() {
        return mrgn;
    }

    /**
     * Sets the value of the mrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public CollateralAmount16 setMrgn(AmountAndDirection53 value) {
        this.mrgn = value;
        return this;
    }

    /**
     * Gets the value of the ttlCollReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlCollReqrd() {
        return ttlCollReqrd;
    }

    /**
     * Sets the value of the ttlCollReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount16 setTtlCollReqrd(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlCollReqrd = value;
        return this;
    }

    /**
     * Gets the value of the ttlAcrdIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlAcrdIntrst() {
        return ttlAcrdIntrst;
    }

    /**
     * Sets the value of the ttlAcrdIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount16 setTtlAcrdIntrst(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlAcrdIntrst = value;
        return this;
    }

    /**
     * Gets the value of the ttlValOfOwnColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlValOfOwnColl() {
        return ttlValOfOwnColl;
    }

    /**
     * Sets the value of the ttlValOfOwnColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount16 setTtlValOfOwnColl(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlValOfOwnColl = value;
        return this;
    }

    /**
     * Gets the value of the ttlValOfReusdColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlValOfReusdColl() {
        return ttlValOfReusdColl;
    }

    /**
     * Sets the value of the ttlValOfReusdColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount16 setTtlValOfReusdColl(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlValOfReusdColl = value;
        return this;
    }

    /**
     * Gets the value of the ttlOfPrncpls property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlOfPrncpls() {
        return ttlOfPrncpls;
    }

    /**
     * Sets the value of the ttlOfPrncpls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount16 setTtlOfPrncpls(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlOfPrncpls = value;
        return this;
    }

    /**
     * Gets the value of the ttlPdgCollIn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlPdgCollIn() {
        return ttlPdgCollIn;
    }

    /**
     * Sets the value of the ttlPdgCollIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount16 setTtlPdgCollIn(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlPdgCollIn = value;
        return this;
    }

    /**
     * Gets the value of the ttlPdgCollOut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlPdgCollOut() {
        return ttlPdgCollOut;
    }

    /**
     * Sets the value of the ttlPdgCollOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount16 setTtlPdgCollOut(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlPdgCollOut = value;
        return this;
    }

    /**
     * Gets the value of the ttlCshFaild property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlCshFaild() {
        return ttlCshFaild;
    }

    /**
     * Sets the value of the ttlCshFaild property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount16 setTtlCshFaild(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlCshFaild = value;
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
