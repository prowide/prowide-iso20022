
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
@XmlType(name = "CashOption13", propOrder = {
    "cdtDbtInd",
    "ctrctlPmtInd",
    "incmTp",
    "acct",
    "cshPties",
    "amtDtls",
    "dtDtls",
    "fxDtls",
    "taxVchrDtls",
    "rateAndAmtDtls",
    "pricDtls"
})
public class CashOption13 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "CtrctlPmtInd")
    @XmlSchemaType(name = "string")
    protected Payment1Code ctrctlPmtInd;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification25 incmTp;
    @XmlElement(name = "Acct")
    protected Account9Choice acct;
    @XmlElement(name = "CshPties")
    protected CashParties12 cshPties;
    @XmlElement(name = "AmtDtls", required = true)
    protected CorporateActionAmounts12 amtDtls;
    @XmlElement(name = "DtDtls", required = true)
    protected CorporateActionDate7 dtDtls;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms12 fxDtls;
    @XmlElement(name = "TaxVchrDtls")
    protected TaxVoucher3 taxVchrDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected RateDetails4 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected PriceDetails4 pricDtls;

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
    public CashOption13 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the ctrctlPmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Payment1Code }
     *     
     */
    public Payment1Code getCtrctlPmtInd() {
        return ctrctlPmtInd;
    }

    /**
     * Sets the value of the ctrctlPmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment1Code }
     *     
     */
    public CashOption13 setCtrctlPmtInd(Payment1Code value) {
        this.ctrctlPmtInd = value;
        return this;
    }

    /**
     * Gets the value of the incmTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification25 }
     *     
     */
    public GenericIdentification25 getIncmTp() {
        return incmTp;
    }

    /**
     * Sets the value of the incmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification25 }
     *     
     */
    public CashOption13 setIncmTp(GenericIdentification25 value) {
        this.incmTp = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account9Choice }
     *     
     */
    public Account9Choice getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account9Choice }
     *     
     */
    public CashOption13 setAcct(Account9Choice value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties12 }
     *     
     */
    public CashParties12 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties12 }
     *     
     */
    public CashOption13 setCshPties(CashParties12 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAmounts12 }
     *     
     */
    public CorporateActionAmounts12 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAmounts12 }
     *     
     */
    public CashOption13 setAmtDtls(CorporateActionAmounts12 value) {
        this.amtDtls = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate7 }
     *     
     */
    public CorporateActionDate7 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate7 }
     *     
     */
    public CashOption13 setDtDtls(CorporateActionDate7 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms12 }
     *     
     */
    public ForeignExchangeTerms12 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms12 }
     *     
     */
    public CashOption13 setFXDtls(ForeignExchangeTerms12 value) {
        this.fxDtls = value;
        return this;
    }

    /**
     * Gets the value of the taxVchrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxVoucher3 }
     *     
     */
    public TaxVoucher3 getTaxVchrDtls() {
        return taxVchrDtls;
    }

    /**
     * Sets the value of the taxVchrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxVoucher3 }
     *     
     */
    public CashOption13 setTaxVchrDtls(TaxVoucher3 value) {
        this.taxVchrDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RateDetails4 }
     *     
     */
    public RateDetails4 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDetails4 }
     *     
     */
    public CashOption13 setRateAndAmtDtls(RateDetails4 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetails4 }
     *     
     */
    public PriceDetails4 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetails4 }
     *     
     */
    public CashOption13 setPricDtls(PriceDetails4 value) {
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
