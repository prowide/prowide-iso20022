
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
 * Holding of financial instrument for collateral purposes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetHolding1Choice", propOrder = {
    "gold",
    "trpty",
    "csh",
    "scty",
    "grnt",
    "cmmdty"
})
public class AssetHolding1Choice {

    @XmlElement(name = "Gold")
    protected ActiveCurrencyAndAmount gold;
    @XmlElement(name = "Trpty")
    protected ActiveCurrencyAndAmount trpty;
    @XmlElement(name = "Csh")
    protected ActiveCurrencyAndAmount csh;
    @XmlElement(name = "Scty")
    protected SecurityIdentificationAndAmount1 scty;
    @XmlElement(name = "Grnt")
    protected Guarantee1 grnt;
    @XmlElement(name = "Cmmdty")
    protected Commodity2 cmmdty;

    /**
     * Gets the value of the gold property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGold() {
        return gold;
    }

    /**
     * Sets the value of the gold property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AssetHolding1Choice setGold(ActiveCurrencyAndAmount value) {
        this.gold = value;
        return this;
    }

    /**
     * Gets the value of the trpty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTrpty() {
        return trpty;
    }

    /**
     * Sets the value of the trpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AssetHolding1Choice setTrpty(ActiveCurrencyAndAmount value) {
        this.trpty = value;
        return this;
    }

    /**
     * Gets the value of the csh property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCsh() {
        return csh;
    }

    /**
     * Sets the value of the csh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AssetHolding1Choice setCsh(ActiveCurrencyAndAmount value) {
        this.csh = value;
        return this;
    }

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentificationAndAmount1 }
     *     
     */
    public SecurityIdentificationAndAmount1 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentificationAndAmount1 }
     *     
     */
    public AssetHolding1Choice setScty(SecurityIdentificationAndAmount1 value) {
        this.scty = value;
        return this;
    }

    /**
     * Gets the value of the grnt property.
     * 
     * @return
     *     possible object is
     *     {@link Guarantee1 }
     *     
     */
    public Guarantee1 getGrnt() {
        return grnt;
    }

    /**
     * Sets the value of the grnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guarantee1 }
     *     
     */
    public AssetHolding1Choice setGrnt(Guarantee1 value) {
        this.grnt = value;
        return this;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link Commodity2 }
     *     
     */
    public Commodity2 getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commodity2 }
     *     
     */
    public AssetHolding1Choice setCmmdty(Commodity2 value) {
        this.cmmdty = value;
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
