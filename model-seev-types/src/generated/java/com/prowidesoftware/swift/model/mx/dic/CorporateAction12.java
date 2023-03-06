
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateAction12", propOrder = {
    "dtDtls",
    "prdDtls",
    "rateAndAmtDtls",
    "pricDtls",
    "sctiesQty",
    "intrstAcrdNbOfDays",
    "cpnNb",
    "certfctnBrkdwnInd",
    "chrgsApldInd",
    "rstrctnInd",
    "acrdIntrstInd",
    "lttrOfGrntedDlvryInd",
    "dvddTp",
    "convsTp",
    "ocrncTp",
    "offerTp",
    "rnncblEntitlmntStsTp",
    "evtStag",
    "addtlBizPrcInd",
    "chngTp",
    "intrmdtSctiesDstrbtnTp",
    "cptlGnInOutInd",
    "taxblIncmPerShrClctd",
    "elctnTp",
    "ltryTp",
    "certfctnTp",
    "cnsntTp",
    "infTp",
    "newPlcOfIncorprtn",
    "addtlInf"
})
public class CorporateAction12 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate27 dtDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod10 prdDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate43 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice42 pricDtls;
    @XmlElement(name = "SctiesQty")
    protected CorporateActionQuantity5 sctiesQty;
    @XmlElement(name = "IntrstAcrdNbOfDays")
    protected BigDecimal intrstAcrdNbOfDays;
    @XmlElement(name = "CpnNb")
    protected List<IdentificationFormat1Choice> cpnNb;
    @XmlElement(name = "CertfctnBrkdwnInd")
    protected Boolean certfctnBrkdwnInd;
    @XmlElement(name = "ChrgsApldInd")
    protected Boolean chrgsApldInd;
    @XmlElement(name = "RstrctnInd")
    protected Boolean rstrctnInd;
    @XmlElement(name = "AcrdIntrstInd")
    protected Boolean acrdIntrstInd;
    @XmlElement(name = "LttrOfGrntedDlvryInd")
    protected Boolean lttrOfGrntedDlvryInd;
    @XmlElement(name = "DvddTp")
    protected DividendTypeFormat5Choice dvddTp;
    @XmlElement(name = "ConvsTp")
    protected ConversionTypeFormat1Choice convsTp;
    @XmlElement(name = "OcrncTp")
    protected DistributionTypeFormat4Choice ocrncTp;
    @XmlElement(name = "OfferTp")
    protected List<OfferTypeFormat5Choice> offerTp;
    @XmlElement(name = "RnncblEntitlmntStsTp")
    protected RenounceableEntitlementStatusTypeFormat1Choice rnncblEntitlmntStsTp;
    @XmlElement(name = "EvtStag")
    protected List<CorporateActionEventStageFormat5Choice> evtStag;
    @XmlElement(name = "AddtlBizPrcInd")
    protected List<AdditionalBusinessProcessFormat1Choice> addtlBizPrcInd;
    @XmlElement(name = "ChngTp")
    protected List<CorporateActionChangeTypeFormat1Choice> chngTp;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecuritiesDistributionTypeFormat9Choice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "CptlGnInOutInd")
    protected CapitalGainFormat1Choice cptlGnInOutInd;
    @XmlElement(name = "TaxblIncmPerShrClctd")
    protected TaxableIncomePerShareCalculatedFormat1Choice taxblIncmPerShrClctd;
    @XmlElement(name = "ElctnTp")
    protected ElectionTypeFormat1Choice elctnTp;
    @XmlElement(name = "LtryTp")
    protected LotteryTypeFormat1Choice ltryTp;
    @XmlElement(name = "CertfctnTp")
    protected CertificationTypeFormat1Choice certfctnTp;
    @XmlElement(name = "CnsntTp")
    protected ConsentTypeFormat1Choice cnsntTp;
    @XmlElement(name = "InfTp")
    protected InformationTypeFormat1Choice infTp;
    @XmlElement(name = "NewPlcOfIncorprtn")
    protected String newPlcOfIncorprtn;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative24 addtlInf;

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate27 }
     *     
     */
    public CorporateActionDate27 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate27 }
     *     
     */
    public CorporateAction12 setDtDtls(CorporateActionDate27 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod10 }
     *     
     */
    public CorporateActionPeriod10 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod10 }
     *     
     */
    public CorporateAction12 setPrdDtls(CorporateActionPeriod10 value) {
        this.prdDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate43 }
     *     
     */
    public CorporateActionRate43 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate43 }
     *     
     */
    public CorporateAction12 setRateAndAmtDtls(CorporateActionRate43 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice42 }
     *     
     */
    public CorporateActionPrice42 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice42 }
     *     
     */
    public CorporateAction12 setPricDtls(CorporateActionPrice42 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionQuantity5 }
     *     
     */
    public CorporateActionQuantity5 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionQuantity5 }
     *     
     */
    public CorporateAction12 setSctiesQty(CorporateActionQuantity5 value) {
        this.sctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the intrstAcrdNbOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstAcrdNbOfDays() {
        return intrstAcrdNbOfDays;
    }

    /**
     * Sets the value of the intrstAcrdNbOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateAction12 setIntrstAcrdNbOfDays(BigDecimal value) {
        this.intrstAcrdNbOfDays = value;
        return this;
    }

    /**
     * Gets the value of the cpnNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpnNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpnNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationFormat1Choice }
     * 
     * 
     */
    public List<IdentificationFormat1Choice> getCpnNb() {
        if (cpnNb == null) {
            cpnNb = new ArrayList<IdentificationFormat1Choice>();
        }
        return this.cpnNb;
    }

    /**
     * Gets the value of the certfctnBrkdwnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertfctnBrkdwnInd() {
        return certfctnBrkdwnInd;
    }

    /**
     * Sets the value of the certfctnBrkdwnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateAction12 setCertfctnBrkdwnInd(Boolean value) {
        this.certfctnBrkdwnInd = value;
        return this;
    }

    /**
     * Gets the value of the chrgsApldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChrgsApldInd() {
        return chrgsApldInd;
    }

    /**
     * Sets the value of the chrgsApldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateAction12 setChrgsApldInd(Boolean value) {
        this.chrgsApldInd = value;
        return this;
    }

    /**
     * Gets the value of the rstrctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRstrctnInd() {
        return rstrctnInd;
    }

    /**
     * Sets the value of the rstrctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateAction12 setRstrctnInd(Boolean value) {
        this.rstrctnInd = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcrdIntrstInd() {
        return acrdIntrstInd;
    }

    /**
     * Sets the value of the acrdIntrstInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateAction12 setAcrdIntrstInd(Boolean value) {
        this.acrdIntrstInd = value;
        return this;
    }

    /**
     * Gets the value of the lttrOfGrntedDlvryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLttrOfGrntedDlvryInd() {
        return lttrOfGrntedDlvryInd;
    }

    /**
     * Sets the value of the lttrOfGrntedDlvryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateAction12 setLttrOfGrntedDlvryInd(Boolean value) {
        this.lttrOfGrntedDlvryInd = value;
        return this;
    }

    /**
     * Gets the value of the dvddTp property.
     * 
     * @return
     *     possible object is
     *     {@link DividendTypeFormat5Choice }
     *     
     */
    public DividendTypeFormat5Choice getDvddTp() {
        return dvddTp;
    }

    /**
     * Sets the value of the dvddTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendTypeFormat5Choice }
     *     
     */
    public CorporateAction12 setDvddTp(DividendTypeFormat5Choice value) {
        this.dvddTp = value;
        return this;
    }

    /**
     * Gets the value of the convsTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionTypeFormat1Choice }
     *     
     */
    public ConversionTypeFormat1Choice getConvsTp() {
        return convsTp;
    }

    /**
     * Sets the value of the convsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionTypeFormat1Choice }
     *     
     */
    public CorporateAction12 setConvsTp(ConversionTypeFormat1Choice value) {
        this.convsTp = value;
        return this;
    }

    /**
     * Gets the value of the ocrncTp property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionTypeFormat4Choice }
     *     
     */
    public DistributionTypeFormat4Choice getOcrncTp() {
        return ocrncTp;
    }

    /**
     * Sets the value of the ocrncTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionTypeFormat4Choice }
     *     
     */
    public CorporateAction12 setOcrncTp(DistributionTypeFormat4Choice value) {
        this.ocrncTp = value;
        return this;
    }

    /**
     * Gets the value of the offerTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferTypeFormat5Choice }
     * 
     * 
     */
    public List<OfferTypeFormat5Choice> getOfferTp() {
        if (offerTp == null) {
            offerTp = new ArrayList<OfferTypeFormat5Choice>();
        }
        return this.offerTp;
    }

    /**
     * Gets the value of the rnncblEntitlmntStsTp property.
     * 
     * @return
     *     possible object is
     *     {@link RenounceableEntitlementStatusTypeFormat1Choice }
     *     
     */
    public RenounceableEntitlementStatusTypeFormat1Choice getRnncblEntitlmntStsTp() {
        return rnncblEntitlmntStsTp;
    }

    /**
     * Sets the value of the rnncblEntitlmntStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenounceableEntitlementStatusTypeFormat1Choice }
     *     
     */
    public CorporateAction12 setRnncblEntitlmntStsTp(RenounceableEntitlementStatusTypeFormat1Choice value) {
        this.rnncblEntitlmntStsTp = value;
        return this;
    }

    /**
     * Gets the value of the evtStag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtStag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtStag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionEventStageFormat5Choice }
     * 
     * 
     */
    public List<CorporateActionEventStageFormat5Choice> getEvtStag() {
        if (evtStag == null) {
            evtStag = new ArrayList<CorporateActionEventStageFormat5Choice>();
        }
        return this.evtStag;
    }

    /**
     * Gets the value of the addtlBizPrcInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlBizPrcInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBizPrcInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBusinessProcessFormat1Choice }
     * 
     * 
     */
    public List<AdditionalBusinessProcessFormat1Choice> getAddtlBizPrcInd() {
        if (addtlBizPrcInd == null) {
            addtlBizPrcInd = new ArrayList<AdditionalBusinessProcessFormat1Choice>();
        }
        return this.addtlBizPrcInd;
    }

    /**
     * Gets the value of the chngTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chngTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChngTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionChangeTypeFormat1Choice }
     * 
     * 
     */
    public List<CorporateActionChangeTypeFormat1Choice> getChngTp() {
        if (chngTp == null) {
            chngTp = new ArrayList<CorporateActionChangeTypeFormat1Choice>();
        }
        return this.chngTp;
    }

    /**
     * Gets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat9Choice }
     *     
     */
    public IntermediateSecuritiesDistributionTypeFormat9Choice getIntrmdtSctiesDstrbtnTp() {
        return intrmdtSctiesDstrbtnTp;
    }

    /**
     * Sets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat9Choice }
     *     
     */
    public CorporateAction12 setIntrmdtSctiesDstrbtnTp(IntermediateSecuritiesDistributionTypeFormat9Choice value) {
        this.intrmdtSctiesDstrbtnTp = value;
        return this;
    }

    /**
     * Gets the value of the cptlGnInOutInd property.
     * 
     * @return
     *     possible object is
     *     {@link CapitalGainFormat1Choice }
     *     
     */
    public CapitalGainFormat1Choice getCptlGnInOutInd() {
        return cptlGnInOutInd;
    }

    /**
     * Sets the value of the cptlGnInOutInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalGainFormat1Choice }
     *     
     */
    public CorporateAction12 setCptlGnInOutInd(CapitalGainFormat1Choice value) {
        this.cptlGnInOutInd = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableIncomePerShareCalculatedFormat1Choice }
     *     
     */
    public TaxableIncomePerShareCalculatedFormat1Choice getTaxblIncmPerShrClctd() {
        return taxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the taxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableIncomePerShareCalculatedFormat1Choice }
     *     
     */
    public CorporateAction12 setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculatedFormat1Choice value) {
        this.taxblIncmPerShrClctd = value;
        return this;
    }

    /**
     * Gets the value of the elctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionTypeFormat1Choice }
     *     
     */
    public ElectionTypeFormat1Choice getElctnTp() {
        return elctnTp;
    }

    /**
     * Sets the value of the elctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionTypeFormat1Choice }
     *     
     */
    public CorporateAction12 setElctnTp(ElectionTypeFormat1Choice value) {
        this.elctnTp = value;
        return this;
    }

    /**
     * Gets the value of the ltryTp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryTypeFormat1Choice }
     *     
     */
    public LotteryTypeFormat1Choice getLtryTp() {
        return ltryTp;
    }

    /**
     * Sets the value of the ltryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryTypeFormat1Choice }
     *     
     */
    public CorporateAction12 setLtryTp(LotteryTypeFormat1Choice value) {
        this.ltryTp = value;
        return this;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationTypeFormat1Choice }
     *     
     */
    public CertificationTypeFormat1Choice getCertfctnTp() {
        return certfctnTp;
    }

    /**
     * Sets the value of the certfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationTypeFormat1Choice }
     *     
     */
    public CorporateAction12 setCertfctnTp(CertificationTypeFormat1Choice value) {
        this.certfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the cnsntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentTypeFormat1Choice }
     *     
     */
    public ConsentTypeFormat1Choice getCnsntTp() {
        return cnsntTp;
    }

    /**
     * Sets the value of the cnsntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentTypeFormat1Choice }
     *     
     */
    public CorporateAction12 setCnsntTp(ConsentTypeFormat1Choice value) {
        this.cnsntTp = value;
        return this;
    }

    /**
     * Gets the value of the infTp property.
     * 
     * @return
     *     possible object is
     *     {@link InformationTypeFormat1Choice }
     *     
     */
    public InformationTypeFormat1Choice getInfTp() {
        return infTp;
    }

    /**
     * Sets the value of the infTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationTypeFormat1Choice }
     *     
     */
    public CorporateAction12 setInfTp(InformationTypeFormat1Choice value) {
        this.infTp = value;
        return this;
    }

    /**
     * Gets the value of the newPlcOfIncorprtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPlcOfIncorprtn() {
        return newPlcOfIncorprtn;
    }

    /**
     * Sets the value of the newPlcOfIncorprtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateAction12 setNewPlcOfIncorprtn(String value) {
        this.newPlcOfIncorprtn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative24 }
     *     
     */
    public CorporateActionNarrative24 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative24 }
     *     
     */
    public CorporateAction12 setAddtlInf(CorporateActionNarrative24 value) {
        this.addtlInf = value;
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
     * Adds a new item to the cpnNb list.
     * @see #getCpnNb()
     * 
     */
    public CorporateAction12 addCpnNb(IdentificationFormat1Choice cpnNb) {
        getCpnNb().add(cpnNb);
        return this;
    }

    /**
     * Adds a new item to the offerTp list.
     * @see #getOfferTp()
     * 
     */
    public CorporateAction12 addOfferTp(OfferTypeFormat5Choice offerTp) {
        getOfferTp().add(offerTp);
        return this;
    }

    /**
     * Adds a new item to the evtStag list.
     * @see #getEvtStag()
     * 
     */
    public CorporateAction12 addEvtStag(CorporateActionEventStageFormat5Choice evtStag) {
        getEvtStag().add(evtStag);
        return this;
    }

    /**
     * Adds a new item to the addtlBizPrcInd list.
     * @see #getAddtlBizPrcInd()
     * 
     */
    public CorporateAction12 addAddtlBizPrcInd(AdditionalBusinessProcessFormat1Choice addtlBizPrcInd) {
        getAddtlBizPrcInd().add(addtlBizPrcInd);
        return this;
    }

    /**
     * Adds a new item to the chngTp list.
     * @see #getChngTp()
     * 
     */
    public CorporateAction12 addChngTp(CorporateActionChangeTypeFormat1Choice chngTp) {
        getChngTp().add(chngTp);
        return this;
    }

}
