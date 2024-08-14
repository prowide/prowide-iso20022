
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
 * Provides additional information regarding corporate action option cash movement details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashOptionSD1", propOrder = {
    "plcAndNm",
    "rinvstmtIncmClssfctn",
    "dtcPayMtd",
    "dtcPayOrdr",
    "entitlmntClctnMtd",
    "estmtdRateFlg",
    "nraTaxRptblFlg",
    "prtctChrgFlg",
    "dclrdCshRate",
    "dclrdGrssRate",
    "dclrdNetRate",
    "dclrdFeeRate",
    "dtcusTaxInstrPrd"
})
public class CashOptionSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "RinvstmtIncmClssfctn")
    @XmlSchemaType(name = "string")
    protected ReinvestmentIncomeClassification1Code rinvstmtIncmClssfctn;
    @XmlElement(name = "DTCPayMtd")
    protected String dtcPayMtd;
    @XmlElement(name = "DTCPayOrdr")
    protected String dtcPayOrdr;
    @XmlElement(name = "EntitlmntClctnMtd")
    @XmlSchemaType(name = "string")
    protected DTCEntitlementCalculationMethod1Code entitlmntClctnMtd;
    @XmlElement(name = "EstmtdRateFlg")
    protected Boolean estmtdRateFlg;
    @XmlElement(name = "NRATaxRptblFlg")
    protected Boolean nraTaxRptblFlg;
    @XmlElement(name = "PrtctChrgFlg")
    protected Boolean prtctChrgFlg;
    @XmlElement(name = "DclrdCshRate")
    protected PriceFormatSD1Choice dclrdCshRate;
    @XmlElement(name = "DclrdGrssRate")
    protected PriceFormatSD1Choice dclrdGrssRate;
    @XmlElement(name = "DclrdNetRate")
    protected PriceFormatSD1Choice dclrdNetRate;
    @XmlElement(name = "DclrdFeeRate")
    protected PriceFormatSD1Choice dclrdFeeRate;
    @XmlElement(name = "DTCUSTaxInstrPrd")
    protected Period3 dtcusTaxInstrPrd;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashOptionSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtIncmClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ReinvestmentIncomeClassification1Code }
     *     
     */
    public ReinvestmentIncomeClassification1Code getRinvstmtIncmClssfctn() {
        return rinvstmtIncmClssfctn;
    }

    /**
     * Sets the value of the rinvstmtIncmClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReinvestmentIncomeClassification1Code }
     *     
     */
    public CashOptionSD1 setRinvstmtIncmClssfctn(ReinvestmentIncomeClassification1Code value) {
        this.rinvstmtIncmClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the dtcPayMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTCPayMtd() {
        return dtcPayMtd;
    }

    /**
     * Sets the value of the dtcPayMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashOptionSD1 setDTCPayMtd(String value) {
        this.dtcPayMtd = value;
        return this;
    }

    /**
     * Gets the value of the dtcPayOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTCPayOrdr() {
        return dtcPayOrdr;
    }

    /**
     * Sets the value of the dtcPayOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashOptionSD1 setDTCPayOrdr(String value) {
        this.dtcPayOrdr = value;
        return this;
    }

    /**
     * Gets the value of the entitlmntClctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link DTCEntitlementCalculationMethod1Code }
     *     
     */
    public DTCEntitlementCalculationMethod1Code getEntitlmntClctnMtd() {
        return entitlmntClctnMtd;
    }

    /**
     * Sets the value of the entitlmntClctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCEntitlementCalculationMethod1Code }
     *     
     */
    public CashOptionSD1 setEntitlmntClctnMtd(DTCEntitlementCalculationMethod1Code value) {
        this.entitlmntClctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the estmtdRateFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstmtdRateFlg() {
        return estmtdRateFlg;
    }

    /**
     * Sets the value of the estmtdRateFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CashOptionSD1 setEstmtdRateFlg(Boolean value) {
        this.estmtdRateFlg = value;
        return this;
    }

    /**
     * Gets the value of the nraTaxRptblFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNRATaxRptblFlg() {
        return nraTaxRptblFlg;
    }

    /**
     * Sets the value of the nraTaxRptblFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CashOptionSD1 setNRATaxRptblFlg(Boolean value) {
        this.nraTaxRptblFlg = value;
        return this;
    }

    /**
     * Gets the value of the prtctChrgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtctChrgFlg() {
        return prtctChrgFlg;
    }

    /**
     * Sets the value of the prtctChrgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CashOptionSD1 setPrtctChrgFlg(Boolean value) {
        this.prtctChrgFlg = value;
        return this;
    }

    /**
     * Gets the value of the dclrdCshRate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormatSD1Choice }
     *     
     */
    public PriceFormatSD1Choice getDclrdCshRate() {
        return dclrdCshRate;
    }

    /**
     * Sets the value of the dclrdCshRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormatSD1Choice }
     *     
     */
    public CashOptionSD1 setDclrdCshRate(PriceFormatSD1Choice value) {
        this.dclrdCshRate = value;
        return this;
    }

    /**
     * Gets the value of the dclrdGrssRate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormatSD1Choice }
     *     
     */
    public PriceFormatSD1Choice getDclrdGrssRate() {
        return dclrdGrssRate;
    }

    /**
     * Sets the value of the dclrdGrssRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormatSD1Choice }
     *     
     */
    public CashOptionSD1 setDclrdGrssRate(PriceFormatSD1Choice value) {
        this.dclrdGrssRate = value;
        return this;
    }

    /**
     * Gets the value of the dclrdNetRate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormatSD1Choice }
     *     
     */
    public PriceFormatSD1Choice getDclrdNetRate() {
        return dclrdNetRate;
    }

    /**
     * Sets the value of the dclrdNetRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormatSD1Choice }
     *     
     */
    public CashOptionSD1 setDclrdNetRate(PriceFormatSD1Choice value) {
        this.dclrdNetRate = value;
        return this;
    }

    /**
     * Gets the value of the dclrdFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormatSD1Choice }
     *     
     */
    public PriceFormatSD1Choice getDclrdFeeRate() {
        return dclrdFeeRate;
    }

    /**
     * Sets the value of the dclrdFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormatSD1Choice }
     *     
     */
    public CashOptionSD1 setDclrdFeeRate(PriceFormatSD1Choice value) {
        this.dclrdFeeRate = value;
        return this;
    }

    /**
     * Gets the value of the dtcusTaxInstrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3 }
     *     
     */
    public Period3 getDTCUSTaxInstrPrd() {
        return dtcusTaxInstrPrd;
    }

    /**
     * Sets the value of the dtcusTaxInstrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3 }
     *     
     */
    public CashOptionSD1 setDTCUSTaxInstrPrd(Period3 value) {
        this.dtcusTaxInstrPrd = value;
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
