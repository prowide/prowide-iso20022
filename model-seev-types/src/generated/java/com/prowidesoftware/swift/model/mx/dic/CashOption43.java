
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "CashOption43", propOrder = {
    "cdtDbtInd",
    "nonElgblPrcdsInd",
    "issrOfferrTaxbltyInd",
    "incmTp",
    "xmptnTp",
    "ctryOfIncmSrc",
    "cshAcctId",
    "amtDtls",
    "dtDtls",
    "fxDtls",
    "rateAndAmtDtls",
    "pricDtls"
})
public class CashOption43 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "NonElgblPrcdsInd")
    protected NonEligibleProceedsIndicator3Choice nonElgblPrcdsInd;
    @XmlElement(name = "IssrOfferrTaxbltyInd")
    protected GenericIdentification30 issrOfferrTaxbltyInd;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification30 incmTp;
    @XmlElement(name = "XmptnTp")
    protected List<GenericIdentification30> xmptnTp;
    @XmlElement(name = "CtryOfIncmSrc")
    protected String ctryOfIncmSrc;
    @XmlElement(name = "CshAcctId")
    protected CashAccountIdentification5Choice cshAcctId;
    @XmlElement(name = "AmtDtls")
    protected CorporateActionAmounts36 amtDtls;
    @XmlElement(name = "DtDtls", required = true)
    protected CorporateActionDate47 dtDtls;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms24 fxDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected RateDetails22 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected PriceDetails22 pricDtls;

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
    public CashOption43 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the nonElgblPrcdsInd property.
     * 
     * @return
     *     possible object is
     *     {@link NonEligibleProceedsIndicator3Choice }
     *     
     */
    public NonEligibleProceedsIndicator3Choice getNonElgblPrcdsInd() {
        return nonElgblPrcdsInd;
    }

    /**
     * Sets the value of the nonElgblPrcdsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEligibleProceedsIndicator3Choice }
     *     
     */
    public CashOption43 setNonElgblPrcdsInd(NonEligibleProceedsIndicator3Choice value) {
        this.nonElgblPrcdsInd = value;
        return this;
    }

    /**
     * Gets the value of the issrOfferrTaxbltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getIssrOfferrTaxbltyInd() {
        return issrOfferrTaxbltyInd;
    }

    /**
     * Sets the value of the issrOfferrTaxbltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public CashOption43 setIssrOfferrTaxbltyInd(GenericIdentification30 value) {
        this.issrOfferrTaxbltyInd = value;
        return this;
    }

    /**
     * Gets the value of the incmTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getIncmTp() {
        return incmTp;
    }

    /**
     * Sets the value of the incmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public CashOption43 setIncmTp(GenericIdentification30 value) {
        this.incmTp = value;
        return this;
    }

    /**
     * Gets the value of the xmptnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xmptnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXmptnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification30 }
     * 
     * 
     * @return
     *     The value of the xmptnTp property.
     */
    public List<GenericIdentification30> getXmptnTp() {
        if (xmptnTp == null) {
            xmptnTp = new ArrayList<>();
        }
        return this.xmptnTp;
    }

    /**
     * Gets the value of the ctryOfIncmSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIncmSrc() {
        return ctryOfIncmSrc;
    }

    /**
     * Sets the value of the ctryOfIncmSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashOption43 setCtryOfIncmSrc(String value) {
        this.ctryOfIncmSrc = value;
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
    public CashOption43 setCshAcctId(CashAccountIdentification5Choice value) {
        this.cshAcctId = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAmounts36 }
     *     
     */
    public CorporateActionAmounts36 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAmounts36 }
     *     
     */
    public CashOption43 setAmtDtls(CorporateActionAmounts36 value) {
        this.amtDtls = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate47 }
     *     
     */
    public CorporateActionDate47 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate47 }
     *     
     */
    public CashOption43 setDtDtls(CorporateActionDate47 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms24 }
     *     
     */
    public ForeignExchangeTerms24 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms24 }
     *     
     */
    public CashOption43 setFXDtls(ForeignExchangeTerms24 value) {
        this.fxDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RateDetails22 }
     *     
     */
    public RateDetails22 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDetails22 }
     *     
     */
    public CashOption43 setRateAndAmtDtls(RateDetails22 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetails22 }
     *     
     */
    public PriceDetails22 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetails22 }
     *     
     */
    public CashOption43 setPricDtls(PriceDetails22 value) {
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

    /**
     * Adds a new item to the xmptnTp list.
     * @see #getXmptnTp()
     * 
     */
    public CashOption43 addXmptnTp(GenericIdentification30 xmptnTp) {
        getXmptnTp().add(xmptnTp);
        return this;
    }

}
