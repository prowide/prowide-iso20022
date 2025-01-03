
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
 * Provides information about the corporate action security option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption14", propOrder = {
    "sctyDtls",
    "cdtDbtInd",
    "tempFinInstrmInd",
    "nonElgblPrcdsInd",
    "entitldQty",
    "frctnDspstn",
    "ccyOptn",
    "tradgPrd",
    "dtDtls",
    "rateDtls",
    "pricDtls"
})
public class SecuritiesOption14 {

    @XmlElement(name = "SctyDtls", required = true)
    protected FinancialInstrumentAttributes16 sctyDtls;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TempFinInstrmInd")
    protected TemporaryFinancialInstrumentIndicator1Choice tempFinInstrmInd;
    @XmlElement(name = "NonElgblPrcdsInd")
    protected NonEligibleProceedsIndicator1Choice nonElgblPrcdsInd;
    @XmlElement(name = "EntitldQty")
    protected Quantity6Choice entitldQty;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType1Choice frctnDspstn;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "TradgPrd")
    protected Period3Choice tradgPrd;
    @XmlElement(name = "DtDtls", required = true)
    protected SecurityDate5 dtDtls;
    @XmlElement(name = "RateDtls")
    protected CorporateActionRate17 rateDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice18 pricDtls;

    /**
     * Gets the value of the sctyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes16 }
     *     
     */
    public FinancialInstrumentAttributes16 getSctyDtls() {
        return sctyDtls;
    }

    /**
     * Sets the value of the sctyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes16 }
     *     
     */
    public SecuritiesOption14 setSctyDtls(FinancialInstrumentAttributes16 value) {
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
    public SecuritiesOption14 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the tempFinInstrmInd property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryFinancialInstrumentIndicator1Choice }
     *     
     */
    public TemporaryFinancialInstrumentIndicator1Choice getTempFinInstrmInd() {
        return tempFinInstrmInd;
    }

    /**
     * Sets the value of the tempFinInstrmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryFinancialInstrumentIndicator1Choice }
     *     
     */
    public SecuritiesOption14 setTempFinInstrmInd(TemporaryFinancialInstrumentIndicator1Choice value) {
        this.tempFinInstrmInd = value;
        return this;
    }

    /**
     * Gets the value of the nonElgblPrcdsInd property.
     * 
     * @return
     *     possible object is
     *     {@link NonEligibleProceedsIndicator1Choice }
     *     
     */
    public NonEligibleProceedsIndicator1Choice getNonElgblPrcdsInd() {
        return nonElgblPrcdsInd;
    }

    /**
     * Sets the value of the nonElgblPrcdsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEligibleProceedsIndicator1Choice }
     *     
     */
    public SecuritiesOption14 setNonElgblPrcdsInd(NonEligibleProceedsIndicator1Choice value) {
        this.nonElgblPrcdsInd = value;
        return this;
    }

    /**
     * Gets the value of the entitldQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity6Choice }
     *     
     */
    public Quantity6Choice getEntitldQty() {
        return entitldQty;
    }

    /**
     * Sets the value of the entitldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity6Choice }
     *     
     */
    public SecuritiesOption14 setEntitldQty(Quantity6Choice value) {
        this.entitldQty = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType1Choice }
     *     
     */
    public FractionDispositionType1Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType1Choice }
     *     
     */
    public SecuritiesOption14 setFrctnDspstn(FractionDispositionType1Choice value) {
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
    public SecuritiesOption14 setCcyOptn(String value) {
        this.ccyOptn = value;
        return this;
    }

    /**
     * Gets the value of the tradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getTradgPrd() {
        return tradgPrd;
    }

    /**
     * Sets the value of the tradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public SecuritiesOption14 setTradgPrd(Period3Choice value) {
        this.tradgPrd = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDate5 }
     *     
     */
    public SecurityDate5 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDate5 }
     *     
     */
    public SecuritiesOption14 setDtDtls(SecurityDate5 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate17 }
     *     
     */
    public CorporateActionRate17 getRateDtls() {
        return rateDtls;
    }

    /**
     * Sets the value of the rateDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate17 }
     *     
     */
    public SecuritiesOption14 setRateDtls(CorporateActionRate17 value) {
        this.rateDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice18 }
     *     
     */
    public CorporateActionPrice18 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice18 }
     *     
     */
    public SecuritiesOption14 setPricDtls(CorporateActionPrice18 value) {
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
