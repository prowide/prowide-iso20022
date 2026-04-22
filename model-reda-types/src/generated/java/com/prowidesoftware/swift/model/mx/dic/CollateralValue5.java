
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details of the collateral reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValue5", propOrder = {
    "sctyId",
    "valtnDt",
    "valtnCcy",
    "valtnPric",
    "valtnClsLkPric",
    "cleanPric",
    "acrdIntrst",
    "hrcut",
    "clsLkHrcut",
    "poolFctr",
    "fx"
})
public class CollateralValue5 {

    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification19 sctyId;
    @XmlElement(name = "ValtnDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate valtnDt;
    @XmlElement(name = "ValtnCcy")
    protected String valtnCcy;
    @XmlElement(name = "ValtnPric", required = true)
    protected AmountOrCoefficientPrice2Choice valtnPric;
    @XmlElement(name = "ValtnClsLkPric")
    protected AmountOrCoefficientPrice2Choice valtnClsLkPric;
    @XmlElement(name = "CleanPric")
    protected PriceRateOrAmount6Choice cleanPric;
    @XmlElement(name = "AcrdIntrst")
    protected PriceRateOrAmount6Choice acrdIntrst;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "ClsLkHrcut")
    protected BigDecimal clsLkHrcut;
    @XmlElement(name = "PoolFctr")
    protected BigDecimal poolFctr;
    @XmlElement(name = "FX")
    protected ForeignExchangeTerms23 fx;

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public CollateralValue5 setSctyId(SecurityIdentification19 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the valtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValtnDt() {
        return valtnDt;
    }

    /**
     * Sets the value of the valtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralValue5 setValtnDt(LocalDate value) {
        this.valtnDt = value;
        return this;
    }

    /**
     * Gets the value of the valtnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValtnCcy() {
        return valtnCcy;
    }

    /**
     * Sets the value of the valtnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralValue5 setValtnCcy(String value) {
        this.valtnCcy = value;
        return this;
    }

    /**
     * Gets the value of the valtnPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrCoefficientPrice2Choice }
     *     
     */
    public AmountOrCoefficientPrice2Choice getValtnPric() {
        return valtnPric;
    }

    /**
     * Sets the value of the valtnPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrCoefficientPrice2Choice }
     *     
     */
    public CollateralValue5 setValtnPric(AmountOrCoefficientPrice2Choice value) {
        this.valtnPric = value;
        return this;
    }

    /**
     * Gets the value of the valtnClsLkPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrCoefficientPrice2Choice }
     *     
     */
    public AmountOrCoefficientPrice2Choice getValtnClsLkPric() {
        return valtnClsLkPric;
    }

    /**
     * Sets the value of the valtnClsLkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrCoefficientPrice2Choice }
     *     
     */
    public CollateralValue5 setValtnClsLkPric(AmountOrCoefficientPrice2Choice value) {
        this.valtnClsLkPric = value;
        return this;
    }

    /**
     * Gets the value of the cleanPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmount6Choice }
     *     
     */
    public PriceRateOrAmount6Choice getCleanPric() {
        return cleanPric;
    }

    /**
     * Sets the value of the cleanPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmount6Choice }
     *     
     */
    public CollateralValue5 setCleanPric(PriceRateOrAmount6Choice value) {
        this.cleanPric = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmount6Choice }
     *     
     */
    public PriceRateOrAmount6Choice getAcrdIntrst() {
        return acrdIntrst;
    }

    /**
     * Sets the value of the acrdIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmount6Choice }
     *     
     */
    public CollateralValue5 setAcrdIntrst(PriceRateOrAmount6Choice value) {
        this.acrdIntrst = value;
        return this;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CollateralValue5 setHrcut(BigDecimal value) {
        this.hrcut = value;
        return this;
    }

    /**
     * Gets the value of the clsLkHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClsLkHrcut() {
        return clsLkHrcut;
    }

    /**
     * Sets the value of the clsLkHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CollateralValue5 setClsLkHrcut(BigDecimal value) {
        this.clsLkHrcut = value;
        return this;
    }

    /**
     * Gets the value of the poolFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPoolFctr() {
        return poolFctr;
    }

    /**
     * Sets the value of the poolFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CollateralValue5 setPoolFctr(BigDecimal value) {
        this.poolFctr = value;
        return this;
    }

    /**
     * Gets the value of the fx property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms23 }
     *     
     */
    public ForeignExchangeTerms23 getFX() {
        return fx;
    }

    /**
     * Sets the value of the fx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms23 }
     *     
     */
    public CollateralValue5 setFX(ForeignExchangeTerms23 value) {
        this.fx = value;
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
