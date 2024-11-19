
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
 * Provides the current and market value of the collateral held.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral6", propOrder = {
    "pstHrcutVal",
    "mktVal",
    "collTp"
})
public class Collateral6 {

    @XmlElement(name = "PstHrcutVal", required = true)
    protected ActiveCurrencyAndAmount pstHrcutVal;
    @XmlElement(name = "MktVal", required = true)
    protected ActiveCurrencyAndAmount mktVal;
    @XmlElement(name = "CollTp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralType1Code collTp;

    /**
     * Gets the value of the pstHrcutVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPstHrcutVal() {
        return pstHrcutVal;
    }

    /**
     * Sets the value of the pstHrcutVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Collateral6 setPstHrcutVal(ActiveCurrencyAndAmount value) {
        this.pstHrcutVal = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Collateral6 setMktVal(ActiveCurrencyAndAmount value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the collTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType1Code }
     *     
     */
    public CollateralType1Code getCollTp() {
        return collTp;
    }

    /**
     * Sets the value of the collTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType1Code }
     *     
     */
    public Collateral6 setCollTp(CollateralType1Code value) {
        this.collTp = value;
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
