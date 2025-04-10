
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
 * Provides information about the cash option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashOption12", propOrder = {
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
public class CashOption12 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "CtrctlPmtInd")
    @XmlSchemaType(name = "string")
    protected Payment1Code ctrctlPmtInd;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification20 incmTp;
    @XmlElement(name = "Acct")
    protected Account8Choice acct;
    @XmlElement(name = "CshPties")
    protected CashParties10 cshPties;
    @XmlElement(name = "AmtDtls", required = true)
    protected CorporateActionAmounts11 amtDtls;
    @XmlElement(name = "DtDtls", required = true)
    protected CorporateActionDate7 dtDtls;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms11 fxDtls;
    @XmlElement(name = "TaxVchrDtls")
    protected TaxVoucher2 taxVchrDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected RateDetails2 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected PriceDetails2 pricDtls;

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
    public CashOption12 setCdtDbtInd(CreditDebitCode value) {
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
    public CashOption12 setCtrctlPmtInd(Payment1Code value) {
        this.ctrctlPmtInd = value;
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
    public CashOption12 setIncmTp(GenericIdentification20 value) {
        this.incmTp = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account8Choice }
     *     
     */
    public Account8Choice getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account8Choice }
     *     
     */
    public CashOption12 setAcct(Account8Choice value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties10 }
     *     
     */
    public CashParties10 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties10 }
     *     
     */
    public CashOption12 setCshPties(CashParties10 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAmounts11 }
     *     
     */
    public CorporateActionAmounts11 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAmounts11 }
     *     
     */
    public CashOption12 setAmtDtls(CorporateActionAmounts11 value) {
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
    public CashOption12 setDtDtls(CorporateActionDate7 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms11 }
     *     
     */
    public ForeignExchangeTerms11 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms11 }
     *     
     */
    public CashOption12 setFXDtls(ForeignExchangeTerms11 value) {
        this.fxDtls = value;
        return this;
    }

    /**
     * Gets the value of the taxVchrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxVoucher2 }
     *     
     */
    public TaxVoucher2 getTaxVchrDtls() {
        return taxVchrDtls;
    }

    /**
     * Sets the value of the taxVchrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxVoucher2 }
     *     
     */
    public CashOption12 setTaxVchrDtls(TaxVoucher2 value) {
        this.taxVchrDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RateDetails2 }
     *     
     */
    public RateDetails2 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDetails2 }
     *     
     */
    public CashOption12 setRateAndAmtDtls(RateDetails2 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetails2 }
     *     
     */
    public PriceDetails2 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetails2 }
     *     
     */
    public CashOption12 setPricDtls(PriceDetails2 value) {
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
