
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
 * Choice to provide the collateral balance for the variation margin and the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralBalance1Choice", propOrder = {
    "ttlColl",
    "collDtls",
    "sgrtdIndpdntAmt"
})
public class CollateralBalance1Choice {

    @XmlElement(name = "TtlColl")
    protected ActiveCurrencyAndAmount ttlColl;
    @XmlElement(name = "CollDtls")
    protected Collateral1 collDtls;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected MarginCollateral1 sgrtdIndpdntAmt;

    /**
     * Gets the value of the ttlColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlColl() {
        return ttlColl;
    }

    /**
     * Sets the value of the ttlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralBalance1Choice setTtlColl(ActiveCurrencyAndAmount value) {
        this.ttlColl = value;
        return this;
    }

    /**
     * Gets the value of the collDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral1 }
     *     
     */
    public Collateral1 getCollDtls() {
        return collDtls;
    }

    /**
     * Sets the value of the collDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral1 }
     *     
     */
    public CollateralBalance1Choice setCollDtls(Collateral1 value) {
        this.collDtls = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCollateral1 }
     *     
     */
    public MarginCollateral1 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCollateral1 }
     *     
     */
    public CollateralBalance1Choice setSgrtdIndpdntAmt(MarginCollateral1 value) {
        this.sgrtdIndpdntAmt = value;
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
