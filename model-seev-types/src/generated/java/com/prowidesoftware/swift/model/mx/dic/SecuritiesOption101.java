
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "SecuritiesOption101", propOrder = {
    "sctyDtls",
    "cdtDbtInd",
    "tempFinInstrmInd",
    "nonElgblPrcdsInd",
    "issrOfferrTaxbltyInd",
    "newSctiesIssncInd",
    "incmTp",
    "othrIncmTp",
    "xmptnTp",
    "entitldQty",
    "sfkpgPlc",
    "ctryOfIncmSrc",
    "frctnDspstn",
    "ccyOptn",
    "tradgPrd",
    "dtDtls",
    "rateDtls",
    "pricDtls",
    "amtDtls"
})
public class SecuritiesOption101 {

    @XmlElement(name = "SctyDtls", required = true)
    protected FinancialInstrumentAttributes107 sctyDtls;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TempFinInstrmInd")
    protected TemporaryFinancialInstrumentIndicator3Choice tempFinInstrmInd;
    @XmlElement(name = "NonElgblPrcdsInd")
    protected NonEligibleProceedsIndicator5Choice nonElgblPrcdsInd;
    @XmlElement(name = "IssrOfferrTaxbltyInd")
    protected IssuerOfferorTaxabilityIndicator1Choice issrOfferrTaxbltyInd;
    @XmlElement(name = "NewSctiesIssncInd")
    @XmlSchemaType(name = "string")
    protected NewSecuritiesIssuanceType5Code newSctiesIssncInd;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification30 incmTp;
    @XmlElement(name = "OthrIncmTp")
    protected List<GenericIdentification30> othrIncmTp;
    @XmlElement(name = "XmptnTp")
    protected List<GenericIdentification30> xmptnTp;
    @XmlElement(name = "EntitldQty")
    protected Quantity51Choice entitldQty;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat29Choice sfkpgPlc;
    @XmlElement(name = "CtryOfIncmSrc")
    protected String ctryOfIncmSrc;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType26Choice frctnDspstn;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "TradgPrd")
    protected Period6Choice tradgPrd;
    @XmlElement(name = "DtDtls", required = true)
    protected SecurityDate20 dtDtls;
    @XmlElement(name = "RateDtls")
    protected CorporateActionRate112 rateDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice75 pricDtls;
    @XmlElement(name = "AmtDtls")
    protected CorporateActionAmounts60 amtDtls;

    /**
     * Gets the value of the sctyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes107 }
     *     
     */
    public FinancialInstrumentAttributes107 getSctyDtls() {
        return sctyDtls;
    }

    /**
     * Sets the value of the sctyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes107 }
     *     
     */
    public SecuritiesOption101 setSctyDtls(FinancialInstrumentAttributes107 value) {
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
    public SecuritiesOption101 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the tempFinInstrmInd property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryFinancialInstrumentIndicator3Choice }
     *     
     */
    public TemporaryFinancialInstrumentIndicator3Choice getTempFinInstrmInd() {
        return tempFinInstrmInd;
    }

    /**
     * Sets the value of the tempFinInstrmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryFinancialInstrumentIndicator3Choice }
     *     
     */
    public SecuritiesOption101 setTempFinInstrmInd(TemporaryFinancialInstrumentIndicator3Choice value) {
        this.tempFinInstrmInd = value;
        return this;
    }

    /**
     * Gets the value of the nonElgblPrcdsInd property.
     * 
     * @return
     *     possible object is
     *     {@link NonEligibleProceedsIndicator5Choice }
     *     
     */
    public NonEligibleProceedsIndicator5Choice getNonElgblPrcdsInd() {
        return nonElgblPrcdsInd;
    }

    /**
     * Sets the value of the nonElgblPrcdsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEligibleProceedsIndicator5Choice }
     *     
     */
    public SecuritiesOption101 setNonElgblPrcdsInd(NonEligibleProceedsIndicator5Choice value) {
        this.nonElgblPrcdsInd = value;
        return this;
    }

    /**
     * Gets the value of the issrOfferrTaxbltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerOfferorTaxabilityIndicator1Choice }
     *     
     */
    public IssuerOfferorTaxabilityIndicator1Choice getIssrOfferrTaxbltyInd() {
        return issrOfferrTaxbltyInd;
    }

    /**
     * Sets the value of the issrOfferrTaxbltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerOfferorTaxabilityIndicator1Choice }
     *     
     */
    public SecuritiesOption101 setIssrOfferrTaxbltyInd(IssuerOfferorTaxabilityIndicator1Choice value) {
        this.issrOfferrTaxbltyInd = value;
        return this;
    }

    /**
     * Gets the value of the newSctiesIssncInd property.
     * 
     * @return
     *     possible object is
     *     {@link NewSecuritiesIssuanceType5Code }
     *     
     */
    public NewSecuritiesIssuanceType5Code getNewSctiesIssncInd() {
        return newSctiesIssncInd;
    }

    /**
     * Sets the value of the newSctiesIssncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSecuritiesIssuanceType5Code }
     *     
     */
    public SecuritiesOption101 setNewSctiesIssncInd(NewSecuritiesIssuanceType5Code value) {
        this.newSctiesIssncInd = value;
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
    public SecuritiesOption101 setIncmTp(GenericIdentification30 value) {
        this.incmTp = value;
        return this;
    }

    /**
     * Gets the value of the othrIncmTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrIncmTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrIncmTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification30 }
     * 
     * 
     */
    public List<GenericIdentification30> getOthrIncmTp() {
        if (othrIncmTp == null) {
            othrIncmTp = new ArrayList<GenericIdentification30>();
        }
        return this.othrIncmTp;
    }

    /**
     * Gets the value of the xmptnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmptnTp property.
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
     */
    public List<GenericIdentification30> getXmptnTp() {
        if (xmptnTp == null) {
            xmptnTp = new ArrayList<GenericIdentification30>();
        }
        return this.xmptnTp;
    }

    /**
     * Gets the value of the entitldQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getEntitldQty() {
        return entitldQty;
    }

    /**
     * Sets the value of the entitldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public SecuritiesOption101 setEntitldQty(Quantity51Choice value) {
        this.entitldQty = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat29Choice }
     *     
     */
    public SafekeepingPlaceFormat29Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat29Choice }
     *     
     */
    public SecuritiesOption101 setSfkpgPlc(SafekeepingPlaceFormat29Choice value) {
        this.sfkpgPlc = value;
        return this;
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
    public SecuritiesOption101 setCtryOfIncmSrc(String value) {
        this.ctryOfIncmSrc = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType26Choice }
     *     
     */
    public FractionDispositionType26Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType26Choice }
     *     
     */
    public SecuritiesOption101 setFrctnDspstn(FractionDispositionType26Choice value) {
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
    public SecuritiesOption101 setCcyOptn(String value) {
        this.ccyOptn = value;
        return this;
    }

    /**
     * Gets the value of the tradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getTradgPrd() {
        return tradgPrd;
    }

    /**
     * Sets the value of the tradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public SecuritiesOption101 setTradgPrd(Period6Choice value) {
        this.tradgPrd = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDate20 }
     *     
     */
    public SecurityDate20 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDate20 }
     *     
     */
    public SecuritiesOption101 setDtDtls(SecurityDate20 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate112 }
     *     
     */
    public CorporateActionRate112 getRateDtls() {
        return rateDtls;
    }

    /**
     * Sets the value of the rateDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate112 }
     *     
     */
    public SecuritiesOption101 setRateDtls(CorporateActionRate112 value) {
        this.rateDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice75 }
     *     
     */
    public CorporateActionPrice75 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice75 }
     *     
     */
    public SecuritiesOption101 setPricDtls(CorporateActionPrice75 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAmounts60 }
     *     
     */
    public CorporateActionAmounts60 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAmounts60 }
     *     
     */
    public SecuritiesOption101 setAmtDtls(CorporateActionAmounts60 value) {
        this.amtDtls = value;
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
     * Adds a new item to the othrIncmTp list.
     * @see #getOthrIncmTp()
     * 
     */
    public SecuritiesOption101 addOthrIncmTp(GenericIdentification30 othrIncmTp) {
        getOthrIncmTp().add(othrIncmTp);
        return this;
    }

    /**
     * Adds a new item to the xmptnTp list.
     * @see #getXmptnTp()
     * 
     */
    public SecuritiesOption101 addXmptnTp(GenericIdentification30 xmptnTp) {
        getXmptnTp().add(xmptnTp);
        return this;
    }

}
