
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CorporateAction87", propOrder = {
    "dtDtls",
    "prdDtls",
    "rateAndAmtDtls",
    "pricDtls",
    "sctiesQty",
    "intrstAcrdNbOfDays",
    "cpnNb",
    "accptncPrtyLvl",
    "certfctnBrkdwnInd",
    "chrgsApldInd",
    "rstrctnInd",
    "acrdIntrstInd",
    "frftrOfIntrstInd",
    "lttrOfGrntedDlvryInd",
    "shrhldrRghtsDrctvInd",
    "dvddTp",
    "evtSeqTp",
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
    "taxOnNonDstrbtdPrcdsInd",
    "dtchAuctnTp",
    "newPlcOfIncorprtn",
    "addtlInf"
})
public class CorporateAction87 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate96 dtDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod16 prdDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate135 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice96 pricDtls;
    @XmlElement(name = "SctiesQty")
    protected CorporateActionQuantity14 sctiesQty;
    @XmlElement(name = "IntrstAcrdNbOfDays")
    protected BigDecimal intrstAcrdNbOfDays;
    @XmlElement(name = "CpnNb")
    protected List<IdentificationFormat4Choice> cpnNb;
    @XmlElement(name = "AccptncPrtyLvl")
    protected String accptncPrtyLvl;
    @XmlElement(name = "CertfctnBrkdwnInd")
    protected Boolean certfctnBrkdwnInd;
    @XmlElement(name = "ChrgsApldInd")
    protected Boolean chrgsApldInd;
    @XmlElement(name = "RstrctnInd")
    protected Boolean rstrctnInd;
    @XmlElement(name = "AcrdIntrstInd")
    protected Boolean acrdIntrstInd;
    @XmlElement(name = "FrftrOfIntrstInd")
    protected Boolean frftrOfIntrstInd;
    @XmlElement(name = "LttrOfGrntedDlvryInd")
    protected Boolean lttrOfGrntedDlvryInd;
    @XmlElement(name = "ShrhldrRghtsDrctvInd")
    protected Boolean shrhldrRghtsDrctvInd;
    @XmlElement(name = "DvddTp")
    protected DividendTypeFormat10Choice dvddTp;
    @XmlElement(name = "EvtSeqTp")
    protected EventSequenceTypeFormat2Choice evtSeqTp;
    @XmlElement(name = "OcrncTp")
    protected DistributionTypeFormat8Choice ocrncTp;
    @XmlElement(name = "OfferTp")
    protected List<OfferTypeFormat16Choice> offerTp;
    @XmlElement(name = "RnncblEntitlmntStsTp")
    protected RenounceableEntitlementStatusTypeFormat4Choice rnncblEntitlmntStsTp;
    @XmlElement(name = "EvtStag")
    protected List<CorporateActionEventStageFormat20Choice> evtStag;
    @XmlElement(name = "AddtlBizPrcInd")
    protected List<AdditionalBusinessProcessFormat22Choice> addtlBizPrcInd;
    @XmlElement(name = "ChngTp")
    protected List<CorporateActionChangeTypeFormat8Choice> chngTp;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecuritiesDistributionTypeFormat18Choice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "CptlGnInOutInd")
    protected CapitalGainFormat4Choice cptlGnInOutInd;
    @XmlElement(name = "TaxblIncmPerShrClctd")
    protected TaxableIncomePerShareCalculatedFormat4Choice taxblIncmPerShrClctd;
    @XmlElement(name = "ElctnTp")
    protected ElectionTypeFormat4Choice elctnTp;
    @XmlElement(name = "LtryTp")
    protected LotteryTypeFormat5Choice ltryTp;
    @XmlElement(name = "CertfctnTp")
    protected CertificationTypeFormat4Choice certfctnTp;
    @XmlElement(name = "CnsntTp")
    protected ConsentTypeFormat5Choice cnsntTp;
    @XmlElement(name = "InfTp")
    protected InformationTypeFormat5Choice infTp;
    @XmlElement(name = "TaxOnNonDstrbtdPrcdsInd")
    protected List<GenericIdentification47> taxOnNonDstrbtdPrcdsInd;
    @XmlElement(name = "DtchAuctnTp")
    protected DutchAuctionTypeFormat2Choice dtchAuctnTp;
    @XmlElement(name = "NewPlcOfIncorprtn")
    protected String newPlcOfIncorprtn;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative63 addtlInf;

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate96 }
     *     
     */
    public CorporateActionDate96 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate96 }
     *     
     */
    public CorporateAction87 setDtDtls(CorporateActionDate96 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod16 }
     *     
     */
    public CorporateActionPeriod16 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod16 }
     *     
     */
    public CorporateAction87 setPrdDtls(CorporateActionPeriod16 value) {
        this.prdDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate135 }
     *     
     */
    public CorporateActionRate135 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate135 }
     *     
     */
    public CorporateAction87 setRateAndAmtDtls(CorporateActionRate135 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice96 }
     *     
     */
    public CorporateActionPrice96 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice96 }
     *     
     */
    public CorporateAction87 setPricDtls(CorporateActionPrice96 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionQuantity14 }
     *     
     */
    public CorporateActionQuantity14 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionQuantity14 }
     *     
     */
    public CorporateAction87 setSctiesQty(CorporateActionQuantity14 value) {
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
    public CorporateAction87 setIntrstAcrdNbOfDays(BigDecimal value) {
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
     * {@link IdentificationFormat4Choice }
     * 
     * 
     */
    public List<IdentificationFormat4Choice> getCpnNb() {
        if (cpnNb == null) {
            cpnNb = new ArrayList<IdentificationFormat4Choice>();
        }
        return this.cpnNb;
    }

    /**
     * Gets the value of the accptncPrtyLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccptncPrtyLvl() {
        return accptncPrtyLvl;
    }

    /**
     * Sets the value of the accptncPrtyLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateAction87 setAccptncPrtyLvl(String value) {
        this.accptncPrtyLvl = value;
        return this;
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
    public CorporateAction87 setCertfctnBrkdwnInd(Boolean value) {
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
    public CorporateAction87 setChrgsApldInd(Boolean value) {
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
    public CorporateAction87 setRstrctnInd(Boolean value) {
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
    public CorporateAction87 setAcrdIntrstInd(Boolean value) {
        this.acrdIntrstInd = value;
        return this;
    }

    /**
     * Gets the value of the frftrOfIntrstInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrftrOfIntrstInd() {
        return frftrOfIntrstInd;
    }

    /**
     * Sets the value of the frftrOfIntrstInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateAction87 setFrftrOfIntrstInd(Boolean value) {
        this.frftrOfIntrstInd = value;
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
    public CorporateAction87 setLttrOfGrntedDlvryInd(Boolean value) {
        this.lttrOfGrntedDlvryInd = value;
        return this;
    }

    /**
     * Gets the value of the shrhldrRghtsDrctvInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShrhldrRghtsDrctvInd() {
        return shrhldrRghtsDrctvInd;
    }

    /**
     * Sets the value of the shrhldrRghtsDrctvInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateAction87 setShrhldrRghtsDrctvInd(Boolean value) {
        this.shrhldrRghtsDrctvInd = value;
        return this;
    }

    /**
     * Gets the value of the dvddTp property.
     * 
     * @return
     *     possible object is
     *     {@link DividendTypeFormat10Choice }
     *     
     */
    public DividendTypeFormat10Choice getDvddTp() {
        return dvddTp;
    }

    /**
     * Sets the value of the dvddTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendTypeFormat10Choice }
     *     
     */
    public CorporateAction87 setDvddTp(DividendTypeFormat10Choice value) {
        this.dvddTp = value;
        return this;
    }

    /**
     * Gets the value of the evtSeqTp property.
     * 
     * @return
     *     possible object is
     *     {@link EventSequenceTypeFormat2Choice }
     *     
     */
    public EventSequenceTypeFormat2Choice getEvtSeqTp() {
        return evtSeqTp;
    }

    /**
     * Sets the value of the evtSeqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventSequenceTypeFormat2Choice }
     *     
     */
    public CorporateAction87 setEvtSeqTp(EventSequenceTypeFormat2Choice value) {
        this.evtSeqTp = value;
        return this;
    }

    /**
     * Gets the value of the ocrncTp property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionTypeFormat8Choice }
     *     
     */
    public DistributionTypeFormat8Choice getOcrncTp() {
        return ocrncTp;
    }

    /**
     * Sets the value of the ocrncTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionTypeFormat8Choice }
     *     
     */
    public CorporateAction87 setOcrncTp(DistributionTypeFormat8Choice value) {
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
     * {@link OfferTypeFormat16Choice }
     * 
     * 
     */
    public List<OfferTypeFormat16Choice> getOfferTp() {
        if (offerTp == null) {
            offerTp = new ArrayList<OfferTypeFormat16Choice>();
        }
        return this.offerTp;
    }

    /**
     * Gets the value of the rnncblEntitlmntStsTp property.
     * 
     * @return
     *     possible object is
     *     {@link RenounceableEntitlementStatusTypeFormat4Choice }
     *     
     */
    public RenounceableEntitlementStatusTypeFormat4Choice getRnncblEntitlmntStsTp() {
        return rnncblEntitlmntStsTp;
    }

    /**
     * Sets the value of the rnncblEntitlmntStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenounceableEntitlementStatusTypeFormat4Choice }
     *     
     */
    public CorporateAction87 setRnncblEntitlmntStsTp(RenounceableEntitlementStatusTypeFormat4Choice value) {
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
     * {@link CorporateActionEventStageFormat20Choice }
     * 
     * 
     */
    public List<CorporateActionEventStageFormat20Choice> getEvtStag() {
        if (evtStag == null) {
            evtStag = new ArrayList<CorporateActionEventStageFormat20Choice>();
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
     * {@link AdditionalBusinessProcessFormat22Choice }
     * 
     * 
     */
    public List<AdditionalBusinessProcessFormat22Choice> getAddtlBizPrcInd() {
        if (addtlBizPrcInd == null) {
            addtlBizPrcInd = new ArrayList<AdditionalBusinessProcessFormat22Choice>();
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
     * {@link CorporateActionChangeTypeFormat8Choice }
     * 
     * 
     */
    public List<CorporateActionChangeTypeFormat8Choice> getChngTp() {
        if (chngTp == null) {
            chngTp = new ArrayList<CorporateActionChangeTypeFormat8Choice>();
        }
        return this.chngTp;
    }

    /**
     * Gets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat18Choice }
     *     
     */
    public IntermediateSecuritiesDistributionTypeFormat18Choice getIntrmdtSctiesDstrbtnTp() {
        return intrmdtSctiesDstrbtnTp;
    }

    /**
     * Sets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat18Choice }
     *     
     */
    public CorporateAction87 setIntrmdtSctiesDstrbtnTp(IntermediateSecuritiesDistributionTypeFormat18Choice value) {
        this.intrmdtSctiesDstrbtnTp = value;
        return this;
    }

    /**
     * Gets the value of the cptlGnInOutInd property.
     * 
     * @return
     *     possible object is
     *     {@link CapitalGainFormat4Choice }
     *     
     */
    public CapitalGainFormat4Choice getCptlGnInOutInd() {
        return cptlGnInOutInd;
    }

    /**
     * Sets the value of the cptlGnInOutInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalGainFormat4Choice }
     *     
     */
    public CorporateAction87 setCptlGnInOutInd(CapitalGainFormat4Choice value) {
        this.cptlGnInOutInd = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableIncomePerShareCalculatedFormat4Choice }
     *     
     */
    public TaxableIncomePerShareCalculatedFormat4Choice getTaxblIncmPerShrClctd() {
        return taxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the taxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableIncomePerShareCalculatedFormat4Choice }
     *     
     */
    public CorporateAction87 setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculatedFormat4Choice value) {
        this.taxblIncmPerShrClctd = value;
        return this;
    }

    /**
     * Gets the value of the elctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionTypeFormat4Choice }
     *     
     */
    public ElectionTypeFormat4Choice getElctnTp() {
        return elctnTp;
    }

    /**
     * Sets the value of the elctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionTypeFormat4Choice }
     *     
     */
    public CorporateAction87 setElctnTp(ElectionTypeFormat4Choice value) {
        this.elctnTp = value;
        return this;
    }

    /**
     * Gets the value of the ltryTp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryTypeFormat5Choice }
     *     
     */
    public LotteryTypeFormat5Choice getLtryTp() {
        return ltryTp;
    }

    /**
     * Sets the value of the ltryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryTypeFormat5Choice }
     *     
     */
    public CorporateAction87 setLtryTp(LotteryTypeFormat5Choice value) {
        this.ltryTp = value;
        return this;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationTypeFormat4Choice }
     *     
     */
    public CertificationTypeFormat4Choice getCertfctnTp() {
        return certfctnTp;
    }

    /**
     * Sets the value of the certfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationTypeFormat4Choice }
     *     
     */
    public CorporateAction87 setCertfctnTp(CertificationTypeFormat4Choice value) {
        this.certfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the cnsntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentTypeFormat5Choice }
     *     
     */
    public ConsentTypeFormat5Choice getCnsntTp() {
        return cnsntTp;
    }

    /**
     * Sets the value of the cnsntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentTypeFormat5Choice }
     *     
     */
    public CorporateAction87 setCnsntTp(ConsentTypeFormat5Choice value) {
        this.cnsntTp = value;
        return this;
    }

    /**
     * Gets the value of the infTp property.
     * 
     * @return
     *     possible object is
     *     {@link InformationTypeFormat5Choice }
     *     
     */
    public InformationTypeFormat5Choice getInfTp() {
        return infTp;
    }

    /**
     * Sets the value of the infTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationTypeFormat5Choice }
     *     
     */
    public CorporateAction87 setInfTp(InformationTypeFormat5Choice value) {
        this.infTp = value;
        return this;
    }

    /**
     * Gets the value of the taxOnNonDstrbtdPrcdsInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxOnNonDstrbtdPrcdsInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxOnNonDstrbtdPrcdsInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification47 }
     * 
     * 
     */
    public List<GenericIdentification47> getTaxOnNonDstrbtdPrcdsInd() {
        if (taxOnNonDstrbtdPrcdsInd == null) {
            taxOnNonDstrbtdPrcdsInd = new ArrayList<GenericIdentification47>();
        }
        return this.taxOnNonDstrbtdPrcdsInd;
    }

    /**
     * Gets the value of the dtchAuctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link DutchAuctionTypeFormat2Choice }
     *     
     */
    public DutchAuctionTypeFormat2Choice getDtchAuctnTp() {
        return dtchAuctnTp;
    }

    /**
     * Sets the value of the dtchAuctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchAuctionTypeFormat2Choice }
     *     
     */
    public CorporateAction87 setDtchAuctnTp(DutchAuctionTypeFormat2Choice value) {
        this.dtchAuctnTp = value;
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
    public CorporateAction87 setNewPlcOfIncorprtn(String value) {
        this.newPlcOfIncorprtn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative63 }
     *     
     */
    public CorporateActionNarrative63 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative63 }
     *     
     */
    public CorporateAction87 setAddtlInf(CorporateActionNarrative63 value) {
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
    public CorporateAction87 addCpnNb(IdentificationFormat4Choice cpnNb) {
        getCpnNb().add(cpnNb);
        return this;
    }

    /**
     * Adds a new item to the offerTp list.
     * @see #getOfferTp()
     * 
     */
    public CorporateAction87 addOfferTp(OfferTypeFormat16Choice offerTp) {
        getOfferTp().add(offerTp);
        return this;
    }

    /**
     * Adds a new item to the evtStag list.
     * @see #getEvtStag()
     * 
     */
    public CorporateAction87 addEvtStag(CorporateActionEventStageFormat20Choice evtStag) {
        getEvtStag().add(evtStag);
        return this;
    }

    /**
     * Adds a new item to the addtlBizPrcInd list.
     * @see #getAddtlBizPrcInd()
     * 
     */
    public CorporateAction87 addAddtlBizPrcInd(AdditionalBusinessProcessFormat22Choice addtlBizPrcInd) {
        getAddtlBizPrcInd().add(addtlBizPrcInd);
        return this;
    }

    /**
     * Adds a new item to the chngTp list.
     * @see #getChngTp()
     * 
     */
    public CorporateAction87 addChngTp(CorporateActionChangeTypeFormat8Choice chngTp) {
        getChngTp().add(chngTp);
        return this;
    }

    /**
     * Adds a new item to the taxOnNonDstrbtdPrcdsInd list.
     * @see #getTaxOnNonDstrbtdPrcdsInd()
     * 
     */
    public CorporateAction87 addTaxOnNonDstrbtdPrcdsInd(GenericIdentification47 taxOnNonDstrbtdPrcdsInd) {
        getTaxOnNonDstrbtdPrcdsInd().add(taxOnNonDstrbtdPrcdsInd);
        return this;
    }

}
