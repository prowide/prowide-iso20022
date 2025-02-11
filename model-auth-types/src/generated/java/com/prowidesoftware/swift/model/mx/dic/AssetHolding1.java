
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Holding of a financial asset as collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetHolding1", propOrder = {
    "pstHrcutVal",
    "asstTp",
    "collRqrmnt"
})
public class AssetHolding1 {

    @XmlElement(name = "PstHrcutVal", required = true)
    protected ActiveCurrencyAnd24Amount pstHrcutVal;
    @XmlElement(name = "AsstTp", required = true)
    protected AssetHolding1Choice asstTp;
    @XmlElement(name = "CollRqrmnt", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralAccountType3Code collRqrmnt;

    /**
     * Gets the value of the pstHrcutVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public ActiveCurrencyAnd24Amount getPstHrcutVal() {
        return pstHrcutVal;
    }

    /**
     * Sets the value of the pstHrcutVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public AssetHolding1 setPstHrcutVal(ActiveCurrencyAnd24Amount value) {
        this.pstHrcutVal = value;
        return this;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link AssetHolding1Choice }
     *     
     */
    public AssetHolding1Choice getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetHolding1Choice }
     *     
     */
    public AssetHolding1 setAsstTp(AssetHolding1Choice value) {
        this.asstTp = value;
        return this;
    }

    /**
     * Gets the value of the collRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAccountType3Code }
     *     
     */
    public CollateralAccountType3Code getCollRqrmnt() {
        return collRqrmnt;
    }

    /**
     * Sets the value of the collRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAccountType3Code }
     *     
     */
    public AssetHolding1 setCollRqrmnt(CollateralAccountType3Code value) {
        this.collRqrmnt = value;
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
