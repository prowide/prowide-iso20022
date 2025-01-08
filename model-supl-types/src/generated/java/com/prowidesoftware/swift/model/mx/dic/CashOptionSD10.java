
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
@XmlType(name = "CashOptionSD10", propOrder = {
    "plcAndNm",
    "pyoutTp",
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
    "dtcusTaxInstrPrd",
    "rdpRefNb"
})
public class CashOptionSD10 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "PyoutTp", required = true)
    @XmlSchemaType(name = "string")
    protected DTCCPayoutType5Code pyoutTp;
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
    protected PriceFormatSD2Choice dclrdCshRate;
    @XmlElement(name = "DclrdGrssRate")
    protected PriceFormatSD2Choice dclrdGrssRate;
    @XmlElement(name = "DclrdNetRate")
    protected PriceFormatSD2Choice dclrdNetRate;
    @XmlElement(name = "DclrdFeeRate")
    protected PriceFormatSD2Choice dclrdFeeRate;
    @XmlElement(name = "DTCUSTaxInstrPrd")
    protected Period3 dtcusTaxInstrPrd;
    @XmlElement(name = "RDPRefNb")
    protected String rdpRefNb;

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
    public CashOptionSD10 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the pyoutTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCPayoutType5Code }
     *     
     */
    public DTCCPayoutType5Code getPyoutTp() {
        return pyoutTp;
    }

    /**
     * Sets the value of the pyoutTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCPayoutType5Code }
     *     
     */
    public CashOptionSD10 setPyoutTp(DTCCPayoutType5Code value) {
        this.pyoutTp = value;
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
    public CashOptionSD10 setDTCPayMtd(String value) {
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
    public CashOptionSD10 setDTCPayOrdr(String value) {
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
    public CashOptionSD10 setEntitlmntClctnMtd(DTCEntitlementCalculationMethod1Code value) {
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
    public CashOptionSD10 setEstmtdRateFlg(Boolean value) {
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
    public CashOptionSD10 setNRATaxRptblFlg(Boolean value) {
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
    public CashOptionSD10 setPrtctChrgFlg(Boolean value) {
        this.prtctChrgFlg = value;
        return this;
    }

    /**
     * Gets the value of the dclrdCshRate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormatSD2Choice }
     *     
     */
    public PriceFormatSD2Choice getDclrdCshRate() {
        return dclrdCshRate;
    }

    /**
     * Sets the value of the dclrdCshRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormatSD2Choice }
     *     
     */
    public CashOptionSD10 setDclrdCshRate(PriceFormatSD2Choice value) {
        this.dclrdCshRate = value;
        return this;
    }

    /**
     * Gets the value of the dclrdGrssRate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormatSD2Choice }
     *     
     */
    public PriceFormatSD2Choice getDclrdGrssRate() {
        return dclrdGrssRate;
    }

    /**
     * Sets the value of the dclrdGrssRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormatSD2Choice }
     *     
     */
    public CashOptionSD10 setDclrdGrssRate(PriceFormatSD2Choice value) {
        this.dclrdGrssRate = value;
        return this;
    }

    /**
     * Gets the value of the dclrdNetRate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormatSD2Choice }
     *     
     */
    public PriceFormatSD2Choice getDclrdNetRate() {
        return dclrdNetRate;
    }

    /**
     * Sets the value of the dclrdNetRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormatSD2Choice }
     *     
     */
    public CashOptionSD10 setDclrdNetRate(PriceFormatSD2Choice value) {
        this.dclrdNetRate = value;
        return this;
    }

    /**
     * Gets the value of the dclrdFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormatSD2Choice }
     *     
     */
    public PriceFormatSD2Choice getDclrdFeeRate() {
        return dclrdFeeRate;
    }

    /**
     * Sets the value of the dclrdFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormatSD2Choice }
     *     
     */
    public CashOptionSD10 setDclrdFeeRate(PriceFormatSD2Choice value) {
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
    public CashOptionSD10 setDTCUSTaxInstrPrd(Period3 value) {
        this.dtcusTaxInstrPrd = value;
        return this;
    }

    /**
     * Gets the value of the rdpRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDPRefNb() {
        return rdpRefNb;
    }

    /**
     * Sets the value of the rdpRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashOptionSD10 setRDPRefNb(String value) {
        this.rdpRefNb = value;
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
