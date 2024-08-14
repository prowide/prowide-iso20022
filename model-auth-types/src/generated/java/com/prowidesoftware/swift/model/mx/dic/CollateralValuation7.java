
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
 * Provides the specification of the valuation of a collateral, based on the sector and the asset classification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValuation7", propOrder = {
    "poolSts",
    "tp",
    "sctr",
    "nmnlAmt"
})
public class CollateralValuation7 {

    @XmlElement(name = "PoolSts", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralPool1Code poolSts;
    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Sctr", required = true)
    protected String sctr;
    @XmlElement(name = "NmnlAmt")
    protected ActiveCurrencyAndAmount nmnlAmt;

    /**
     * Gets the value of the poolSts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralPool1Code }
     *     
     */
    public CollateralPool1Code getPoolSts() {
        return poolSts;
    }

    /**
     * Sets the value of the poolSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralPool1Code }
     *     
     */
    public CollateralValuation7 setPoolSts(CollateralPool1Code value) {
        this.poolSts = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralValuation7 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the sctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctr() {
        return sctr;
    }

    /**
     * Sets the value of the sctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralValuation7 setSctr(String value) {
        this.sctr = value;
        return this;
    }

    /**
     * Gets the value of the nmnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNmnlAmt() {
        return nmnlAmt;
    }

    /**
     * Sets the value of the nmnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralValuation7 setNmnlAmt(ActiveCurrencyAndAmount value) {
        this.nmnlAmt = value;
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
