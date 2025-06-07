
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CashOptionSD3", propOrder = {
    "plcAndNm",
    "rinvstmtIncmClssfctn",
    "dtcPayMtd",
    "dtcPayOrdr",
    "entitlmntClctnMtd",
    "estmtdRateFlg",
    "nraTaxRptblFlg",
    "prtctChrgFlg",
    "csdCshRate",
    "dtcFeeRate",
    "dtcusTaxInstrPrd"
})
public class CashOptionSD3 {

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
    @XmlElement(name = "CSDCshRate")
    protected RateAndAmountFormat17Choice csdCshRate;
    @XmlElement(name = "DTCFeeRate")
    protected RateAndAmountFormat17Choice dtcFeeRate;
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
    public CashOptionSD3 setPlcAndNm(String value) {
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
    public CashOptionSD3 setRinvstmtIncmClssfctn(ReinvestmentIncomeClassification1Code value) {
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
    public CashOptionSD3 setDTCPayMtd(String value) {
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
    public CashOptionSD3 setDTCPayOrdr(String value) {
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
    public CashOptionSD3 setEntitlmntClctnMtd(DTCEntitlementCalculationMethod1Code value) {
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
    public CashOptionSD3 setEstmtdRateFlg(Boolean value) {
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
    public CashOptionSD3 setNRATaxRptblFlg(Boolean value) {
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
    public CashOptionSD3 setPrtctChrgFlg(Boolean value) {
        this.prtctChrgFlg = value;
        return this;
    }

    /**
     * Gets the value of the csdCshRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat17Choice }
     *     
     */
    public RateAndAmountFormat17Choice getCSDCshRate() {
        return csdCshRate;
    }

    /**
     * Sets the value of the csdCshRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat17Choice }
     *     
     */
    public CashOptionSD3 setCSDCshRate(RateAndAmountFormat17Choice value) {
        this.csdCshRate = value;
        return this;
    }

    /**
     * Gets the value of the dtcFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat17Choice }
     *     
     */
    public RateAndAmountFormat17Choice getDTCFeeRate() {
        return dtcFeeRate;
    }

    /**
     * Sets the value of the dtcFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat17Choice }
     *     
     */
    public CashOptionSD3 setDTCFeeRate(RateAndAmountFormat17Choice value) {
        this.dtcFeeRate = value;
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
    public CashOptionSD3 setDTCUSTaxInstrPrd(Period3 value) {
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
