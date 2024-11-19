
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
 * Provides information about the cash option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashOption24", propOrder = {
    "cdtDbtInd",
    "nonElgblPrcdsInd",
    "issrOfferrTaxbltyInd",
    "incmTp",
    "cshAcctId",
    "amtDtls",
    "dtDtls",
    "fxDtls",
    "rateAndAmtDtls",
    "pricDtls"
})
public class CashOption24 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "NonElgblPrcdsInd")
    protected NonEligibleProceedsIndicator1Choice nonElgblPrcdsInd;
    @XmlElement(name = "IssrOfferrTaxbltyInd")
    @XmlSchemaType(name = "string")
    protected IssuerTaxability1Code issrOfferrTaxbltyInd;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification20 incmTp;
    @XmlElement(name = "CshAcctId")
    protected CashAccountIdentification5Choice cshAcctId;
    @XmlElement(name = "AmtDtls")
    protected CorporateActionAmounts21 amtDtls;
    @XmlElement(name = "DtDtls", required = true)
    protected CorporateActionDate23 dtDtls;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms13 fxDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected RateDetails10 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected PriceDetails10 pricDtls;

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
    public CashOption24 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
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
    public CashOption24 setNonElgblPrcdsInd(NonEligibleProceedsIndicator1Choice value) {
        this.nonElgblPrcdsInd = value;
        return this;
    }

    /**
     * Gets the value of the issrOfferrTaxbltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerTaxability1Code }
     *     
     */
    public IssuerTaxability1Code getIssrOfferrTaxbltyInd() {
        return issrOfferrTaxbltyInd;
    }

    /**
     * Sets the value of the issrOfferrTaxbltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerTaxability1Code }
     *     
     */
    public CashOption24 setIssrOfferrTaxbltyInd(IssuerTaxability1Code value) {
        this.issrOfferrTaxbltyInd = value;
        return this;
    }

    /**
     * Gets the value of the incmTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification20 }
     *     
     */
    public GenericIdentification20 getIncmTp() {
        return incmTp;
    }

    /**
     * Sets the value of the incmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification20 }
     *     
     */
    public CashOption24 setIncmTp(GenericIdentification20 value) {
        this.incmTp = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcctId() {
        return cshAcctId;
    }

    /**
     * Sets the value of the cshAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashOption24 setCshAcctId(CashAccountIdentification5Choice value) {
        this.cshAcctId = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAmounts21 }
     *     
     */
    public CorporateActionAmounts21 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAmounts21 }
     *     
     */
    public CashOption24 setAmtDtls(CorporateActionAmounts21 value) {
        this.amtDtls = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate23 }
     *     
     */
    public CorporateActionDate23 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate23 }
     *     
     */
    public CashOption24 setDtDtls(CorporateActionDate23 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms13 }
     *     
     */
    public ForeignExchangeTerms13 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms13 }
     *     
     */
    public CashOption24 setFXDtls(ForeignExchangeTerms13 value) {
        this.fxDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RateDetails10 }
     *     
     */
    public RateDetails10 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDetails10 }
     *     
     */
    public CashOption24 setRateAndAmtDtls(RateDetails10 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetails10 }
     *     
     */
    public PriceDetails10 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetails10 }
     *     
     */
    public CashOption24 setPricDtls(PriceDetails10 value) {
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
