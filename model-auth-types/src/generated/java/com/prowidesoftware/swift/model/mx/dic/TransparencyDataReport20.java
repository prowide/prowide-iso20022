
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
 * Provides for reporting calculation results of non equity instruments as part of transparency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransparencyDataReport20", propOrder = {
    "techRcrdId",
    "id",
    "fullNm",
    "tradgVn",
    "rptgPrd",
    "lqdty",
    "preTradLrgInScaleThrshld",
    "pstTradLrgInScaleThrshld",
    "preTradInstrmSzSpcfcThrshld",
    "pstTradInstrmSzSpcfcThrshld",
    "sttstcs"
})
public class TransparencyDataReport20 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected InstrumentOrSubClassIdentification2Choice id;
    @XmlElement(name = "FullNm")
    protected String fullNm;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "RptgPrd")
    protected Period4Choice rptgPrd;
    @XmlElement(name = "Lqdty")
    protected Boolean lqdty;
    @XmlElement(name = "PreTradLrgInScaleThrshld")
    protected TonsOrCurrency2Choice preTradLrgInScaleThrshld;
    @XmlElement(name = "PstTradLrgInScaleThrshld")
    protected TonsOrCurrency2Choice pstTradLrgInScaleThrshld;
    @XmlElement(name = "PreTradInstrmSzSpcfcThrshld")
    protected TonsOrCurrency2Choice preTradInstrmSzSpcfcThrshld;
    @XmlElement(name = "PstTradInstrmSzSpcfcThrshld")
    protected TonsOrCurrency2Choice pstTradInstrmSzSpcfcThrshld;
    @XmlElement(name = "Sttstcs")
    protected StatisticsTransparency2 sttstcs;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport20 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentOrSubClassIdentification2Choice }
     *     
     */
    public InstrumentOrSubClassIdentification2Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentOrSubClassIdentification2Choice }
     *     
     */
    public TransparencyDataReport20 setId(InstrumentOrSubClassIdentification2Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the fullNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNm() {
        return fullNm;
    }

    /**
     * Sets the value of the fullNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport20 setFullNm(String value) {
        this.fullNm = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport20 setTradgVn(String value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public TransparencyDataReport20 setRptgPrd(Period4Choice value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the lqdty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLqdty() {
        return lqdty;
    }

    /**
     * Sets the value of the lqdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TransparencyDataReport20 setLqdty(Boolean value) {
        this.lqdty = value;
        return this;
    }

    /**
     * Gets the value of the preTradLrgInScaleThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public TonsOrCurrency2Choice getPreTradLrgInScaleThrshld() {
        return preTradLrgInScaleThrshld;
    }

    /**
     * Sets the value of the preTradLrgInScaleThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public TransparencyDataReport20 setPreTradLrgInScaleThrshld(TonsOrCurrency2Choice value) {
        this.preTradLrgInScaleThrshld = value;
        return this;
    }

    /**
     * Gets the value of the pstTradLrgInScaleThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public TonsOrCurrency2Choice getPstTradLrgInScaleThrshld() {
        return pstTradLrgInScaleThrshld;
    }

    /**
     * Sets the value of the pstTradLrgInScaleThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public TransparencyDataReport20 setPstTradLrgInScaleThrshld(TonsOrCurrency2Choice value) {
        this.pstTradLrgInScaleThrshld = value;
        return this;
    }

    /**
     * Gets the value of the preTradInstrmSzSpcfcThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public TonsOrCurrency2Choice getPreTradInstrmSzSpcfcThrshld() {
        return preTradInstrmSzSpcfcThrshld;
    }

    /**
     * Sets the value of the preTradInstrmSzSpcfcThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public TransparencyDataReport20 setPreTradInstrmSzSpcfcThrshld(TonsOrCurrency2Choice value) {
        this.preTradInstrmSzSpcfcThrshld = value;
        return this;
    }

    /**
     * Gets the value of the pstTradInstrmSzSpcfcThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public TonsOrCurrency2Choice getPstTradInstrmSzSpcfcThrshld() {
        return pstTradInstrmSzSpcfcThrshld;
    }

    /**
     * Sets the value of the pstTradInstrmSzSpcfcThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public TransparencyDataReport20 setPstTradInstrmSzSpcfcThrshld(TonsOrCurrency2Choice value) {
        this.pstTradInstrmSzSpcfcThrshld = value;
        return this;
    }

    /**
     * Gets the value of the sttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsTransparency2 }
     *     
     */
    public StatisticsTransparency2 getSttstcs() {
        return sttstcs;
    }

    /**
     * Sets the value of the sttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsTransparency2 }
     *     
     */
    public TransparencyDataReport20 setSttstcs(StatisticsTransparency2 value) {
        this.sttstcs = value;
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
