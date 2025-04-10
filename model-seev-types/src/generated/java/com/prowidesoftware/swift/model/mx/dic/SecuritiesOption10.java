
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
 * Provides information about the corporate action security option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption10", propOrder = {
    "sctyDtls",
    "cdtDbtInd",
    "tempFinInstrmInd",
    "nonElgblPrcdsInd",
    "entitldQty",
    "sfkpgPlc",
    "frctnDspstn",
    "ccyOptn",
    "tradgPrd",
    "dtDtls",
    "rateDtls",
    "pricDtls"
})
public class SecuritiesOption10 {

    @XmlElement(name = "SctyDtls", required = true)
    protected FinancialInstrumentAttributes10 sctyDtls;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TempFinInstrmInd")
    protected TemporaryFinancialInstrumentIndicator2Choice tempFinInstrmInd;
    @XmlElement(name = "NonElgblPrcdsInd")
    protected NonEligibleProceedsIndicator2Choice nonElgblPrcdsInd;
    @XmlElement(name = "EntitldQty")
    protected Quantity10Choice entitldQty;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat5Choice sfkpgPlc;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType6Choice frctnDspstn;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "TradgPrd")
    protected Period1Choice tradgPrd;
    @XmlElement(name = "DtDtls", required = true)
    protected SecurityDate4 dtDtls;
    @XmlElement(name = "RateDtls")
    protected CorporateActionRate13 rateDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice13 pricDtls;

    /**
     * Gets the value of the sctyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes10 }
     *     
     */
    public FinancialInstrumentAttributes10 getSctyDtls() {
        return sctyDtls;
    }

    /**
     * Sets the value of the sctyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes10 }
     *     
     */
    public SecuritiesOption10 setSctyDtls(FinancialInstrumentAttributes10 value) {
        this.sctyDtls = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public SecuritiesOption10 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the tempFinInstrmInd property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryFinancialInstrumentIndicator2Choice }
     *     
     */
    public TemporaryFinancialInstrumentIndicator2Choice getTempFinInstrmInd() {
        return tempFinInstrmInd;
    }

    /**
     * Sets the value of the tempFinInstrmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryFinancialInstrumentIndicator2Choice }
     *     
     */
    public SecuritiesOption10 setTempFinInstrmInd(TemporaryFinancialInstrumentIndicator2Choice value) {
        this.tempFinInstrmInd = value;
        return this;
    }

    /**
     * Gets the value of the nonElgblPrcdsInd property.
     * 
     * @return
     *     possible object is
     *     {@link NonEligibleProceedsIndicator2Choice }
     *     
     */
    public NonEligibleProceedsIndicator2Choice getNonElgblPrcdsInd() {
        return nonElgblPrcdsInd;
    }

    /**
     * Sets the value of the nonElgblPrcdsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEligibleProceedsIndicator2Choice }
     *     
     */
    public SecuritiesOption10 setNonElgblPrcdsInd(NonEligibleProceedsIndicator2Choice value) {
        this.nonElgblPrcdsInd = value;
        return this;
    }

    /**
     * Gets the value of the entitldQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity10Choice }
     *     
     */
    public Quantity10Choice getEntitldQty() {
        return entitldQty;
    }

    /**
     * Sets the value of the entitldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity10Choice }
     *     
     */
    public SecuritiesOption10 setEntitldQty(Quantity10Choice value) {
        this.entitldQty = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat5Choice }
     *     
     */
    public SafekeepingPlaceFormat5Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat5Choice }
     *     
     */
    public SecuritiesOption10 setSfkpgPlc(SafekeepingPlaceFormat5Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType6Choice }
     *     
     */
    public FractionDispositionType6Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType6Choice }
     *     
     */
    public SecuritiesOption10 setFrctnDspstn(FractionDispositionType6Choice value) {
        this.frctnDspstn = value;
        return this;
    }

    /**
     * Gets the value of the ccyOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyOptn() {
        return ccyOptn;
    }

    /**
     * Sets the value of the ccyOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesOption10 setCcyOptn(String value) {
        this.ccyOptn = value;
        return this;
    }

    /**
     * Gets the value of the tradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1Choice }
     *     
     */
    public Period1Choice getTradgPrd() {
        return tradgPrd;
    }

    /**
     * Sets the value of the tradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1Choice }
     *     
     */
    public SecuritiesOption10 setTradgPrd(Period1Choice value) {
        this.tradgPrd = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDate4 }
     *     
     */
    public SecurityDate4 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDate4 }
     *     
     */
    public SecuritiesOption10 setDtDtls(SecurityDate4 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate13 }
     *     
     */
    public CorporateActionRate13 getRateDtls() {
        return rateDtls;
    }

    /**
     * Sets the value of the rateDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate13 }
     *     
     */
    public SecuritiesOption10 setRateDtls(CorporateActionRate13 value) {
        this.rateDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice13 }
     *     
     */
    public CorporateActionPrice13 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice13 }
     *     
     */
    public SecuritiesOption10 setPricDtls(CorporateActionPrice13 value) {
        this.pricDtls = value;
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
