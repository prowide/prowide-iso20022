
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides information about the corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateAction83", propOrder = {
    "dtDtls",
    "evtBalDtls",
    "amtDtls",
    "prdDtls",
    "rateAndAmtDtls",
    "pricDtls",
    "sctiesQty",
    "intrstAcrdNbOfDays",
    "accptncPrtyLvl",
    "chrgsApldInd",
    "rstrctnInd",
    "acrdIntrstInd",
    "splmtryIndctrs",
    "frftrOfIntrstInd",
    "dvddTp",
    "ocrncTp",
    "offerTp",
    "rnncblEntitlmntStsTp",
    "evtStag",
    "addtlBizPrcInd",
    "chngTp",
    "intrmdtSctiesDstrbtnTp",
    "cptlGnInOutInd",
    "taxblIncmPerShrClctd",
    "ltryTp",
    "certfctnTp",
    "cnsntTp",
    "infTp",
    "taxOnNonDstrbtdPrcdsInd",
    "dtchAuctnTp",
    "newPlcOfIncorprtn",
    "ntceTp",
    "prratnRtrMinQtyTrtmnt",
    "certDtls",
    "addtlInf"
})
public class CorporateAction83 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate83 dtDtls;
    @XmlElement(name = "EvtBalDtls")
    protected CorporateActionBalanceDetails47 evtBalDtls;
    @XmlElement(name = "AmtDtls")
    protected CorporateActionAmounts70 amtDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod16 prdDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate122 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice85 pricDtls;
    @XmlElement(name = "SctiesQty")
    protected CorporateActionQuantity11 sctiesQty;
    @XmlElement(name = "IntrstAcrdNbOfDays")
    protected BigDecimal intrstAcrdNbOfDays;
    @XmlElement(name = "AccptncPrtyLvl")
    protected String accptncPrtyLvl;
    @XmlElement(name = "ChrgsApldInd")
    protected Boolean chrgsApldInd;
    @XmlElement(name = "RstrctnInd")
    protected Boolean rstrctnInd;
    @XmlElement(name = "AcrdIntrstInd")
    protected Boolean acrdIntrstInd;
    @XmlElement(name = "SplmtryIndctrs")
    protected CorporateActionSupplementaryIndicators1 splmtryIndctrs;
    @XmlElement(name = "FrftrOfIntrstInd")
    protected Boolean frftrOfIntrstInd;
    @XmlElement(name = "DvddTp")
    protected DividendTypeFormat9Choice dvddTp;
    @XmlElement(name = "OcrncTp")
    protected DistributionTypeFormat7Choice ocrncTp;
    @XmlElement(name = "OfferTp")
    protected List<OfferTypeFormat14Choice> offerTp;
    @XmlElement(name = "RnncblEntitlmntStsTp")
    protected RenounceableEntitlementStatusTypeFormat3Choice rnncblEntitlmntStsTp;
    @XmlElement(name = "EvtStag")
    protected List<CorporateActionEventStageFormat13Choice> evtStag;
    @XmlElement(name = "AddtlBizPrcInd")
    protected List<AdditionalBusinessProcessFormat17Choice> addtlBizPrcInd;
    @XmlElement(name = "ChngTp")
    protected List<CorporateActionChangeTypeFormat5Choice> chngTp;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecuritiesDistributionTypeFormat15Choice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "CptlGnInOutInd")
    protected CapitalGainFormat3Choice cptlGnInOutInd;
    @XmlElement(name = "TaxblIncmPerShrClctd")
    protected TaxableIncomePerShareCalculatedFormat3Choice taxblIncmPerShrClctd;
    @XmlElement(name = "LtryTp")
    protected LotteryTypeFormat4Choice ltryTp;
    @XmlElement(name = "CertfctnTp")
    protected CertificationTypeFormat3Choice certfctnTp;
    @XmlElement(name = "CnsntTp")
    protected ConsentTypeFormat4Choice cnsntTp;
    @XmlElement(name = "InfTp")
    protected InformationTypeFormat4Choice infTp;
    @XmlElement(name = "TaxOnNonDstrbtdPrcdsInd")
    protected List<GenericIdentification30> taxOnNonDstrbtdPrcdsInd;
    @XmlElement(name = "DtchAuctnTp")
    protected DutchAuctionTypeFormat1Choice dtchAuctnTp;
    @XmlElement(name = "NewPlcOfIncorprtn")
    protected String newPlcOfIncorprtn;
    @XmlElement(name = "NtceTp")
    @XmlSchemaType(name = "string")
    protected RedemptionAnnouncementNoticeType1Code ntceTp;
    @XmlElement(name = "PrratnRtrMinQtyTrtmnt")
    @XmlSchemaType(name = "string")
    protected ProrationReturnQuantityTreatment1Code prratnRtrMinQtyTrtmnt;
    @XmlElement(name = "CertDtls")
    protected List<CorporateActionSD26> certDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative58 addtlInf;

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate83 }
     *     
     */
    public CorporateActionDate83 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate83 }
     *     
     */
    public CorporateAction83 setDtDtls(CorporateActionDate83 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the evtBalDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionBalanceDetails47 }
     *     
     */
    public CorporateActionBalanceDetails47 getEvtBalDtls() {
        return evtBalDtls;
    }

    /**
     * Sets the value of the evtBalDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionBalanceDetails47 }
     *     
     */
    public CorporateAction83 setEvtBalDtls(CorporateActionBalanceDetails47 value) {
        this.evtBalDtls = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAmounts70 }
     *     
     */
    public CorporateActionAmounts70 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAmounts70 }
     *     
     */
    public CorporateAction83 setAmtDtls(CorporateActionAmounts70 value) {
        this.amtDtls = value;
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
    public CorporateAction83 setPrdDtls(CorporateActionPeriod16 value) {
        this.prdDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate122 }
     *     
     */
    public CorporateActionRate122 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate122 }
     *     
     */
    public CorporateAction83 setRateAndAmtDtls(CorporateActionRate122 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice85 }
     *     
     */
    public CorporateActionPrice85 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice85 }
     *     
     */
    public CorporateAction83 setPricDtls(CorporateActionPrice85 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionQuantity11 }
     *     
     */
    public CorporateActionQuantity11 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionQuantity11 }
     *     
     */
    public CorporateAction83 setSctiesQty(CorporateActionQuantity11 value) {
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
    public CorporateAction83 setIntrstAcrdNbOfDays(BigDecimal value) {
        this.intrstAcrdNbOfDays = value;
        return this;
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
    public CorporateAction83 setAccptncPrtyLvl(String value) {
        this.accptncPrtyLvl = value;
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
    public CorporateAction83 setChrgsApldInd(Boolean value) {
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
    public CorporateAction83 setRstrctnInd(Boolean value) {
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
    public CorporateAction83 setAcrdIntrstInd(Boolean value) {
        this.acrdIntrstInd = value;
        return this;
    }

    /**
     * Gets the value of the splmtryIndctrs property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSupplementaryIndicators1 }
     *     
     */
    public CorporateActionSupplementaryIndicators1 getSplmtryIndctrs() {
        return splmtryIndctrs;
    }

    /**
     * Sets the value of the splmtryIndctrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSupplementaryIndicators1 }
     *     
     */
    public CorporateAction83 setSplmtryIndctrs(CorporateActionSupplementaryIndicators1 value) {
        this.splmtryIndctrs = value;
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
    public CorporateAction83 setFrftrOfIntrstInd(Boolean value) {
        this.frftrOfIntrstInd = value;
        return this;
    }

    /**
     * Gets the value of the dvddTp property.
     * 
     * @return
     *     possible object is
     *     {@link DividendTypeFormat9Choice }
     *     
     */
    public DividendTypeFormat9Choice getDvddTp() {
        return dvddTp;
    }

    /**
     * Sets the value of the dvddTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendTypeFormat9Choice }
     *     
     */
    public CorporateAction83 setDvddTp(DividendTypeFormat9Choice value) {
        this.dvddTp = value;
        return this;
    }

    /**
     * Gets the value of the ocrncTp property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionTypeFormat7Choice }
     *     
     */
    public DistributionTypeFormat7Choice getOcrncTp() {
        return ocrncTp;
    }

    /**
     * Sets the value of the ocrncTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionTypeFormat7Choice }
     *     
     */
    public CorporateAction83 setOcrncTp(DistributionTypeFormat7Choice value) {
        this.ocrncTp = value;
        return this;
    }

    /**
     * Gets the value of the offerTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the offerTp property.
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
     * {@link OfferTypeFormat14Choice }
     * 
     * 
     * @return
     *     The value of the offerTp property.
     */
    public List<OfferTypeFormat14Choice> getOfferTp() {
        if (offerTp == null) {
            offerTp = new ArrayList<>();
        }
        return this.offerTp;
    }

    /**
     * Gets the value of the rnncblEntitlmntStsTp property.
     * 
     * @return
     *     possible object is
     *     {@link RenounceableEntitlementStatusTypeFormat3Choice }
     *     
     */
    public RenounceableEntitlementStatusTypeFormat3Choice getRnncblEntitlmntStsTp() {
        return rnncblEntitlmntStsTp;
    }

    /**
     * Sets the value of the rnncblEntitlmntStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenounceableEntitlementStatusTypeFormat3Choice }
     *     
     */
    public CorporateAction83 setRnncblEntitlmntStsTp(RenounceableEntitlementStatusTypeFormat3Choice value) {
        this.rnncblEntitlmntStsTp = value;
        return this;
    }

    /**
     * Gets the value of the evtStag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evtStag property.
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
     * {@link CorporateActionEventStageFormat13Choice }
     * 
     * 
     * @return
     *     The value of the evtStag property.
     */
    public List<CorporateActionEventStageFormat13Choice> getEvtStag() {
        if (evtStag == null) {
            evtStag = new ArrayList<>();
        }
        return this.evtStag;
    }

    /**
     * Gets the value of the addtlBizPrcInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlBizPrcInd property.
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
     * {@link AdditionalBusinessProcessFormat17Choice }
     * 
     * 
     * @return
     *     The value of the addtlBizPrcInd property.
     */
    public List<AdditionalBusinessProcessFormat17Choice> getAddtlBizPrcInd() {
        if (addtlBizPrcInd == null) {
            addtlBizPrcInd = new ArrayList<>();
        }
        return this.addtlBizPrcInd;
    }

    /**
     * Gets the value of the chngTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chngTp property.
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
     * {@link CorporateActionChangeTypeFormat5Choice }
     * 
     * 
     * @return
     *     The value of the chngTp property.
     */
    public List<CorporateActionChangeTypeFormat5Choice> getChngTp() {
        if (chngTp == null) {
            chngTp = new ArrayList<>();
        }
        return this.chngTp;
    }

    /**
     * Gets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat15Choice }
     *     
     */
    public IntermediateSecuritiesDistributionTypeFormat15Choice getIntrmdtSctiesDstrbtnTp() {
        return intrmdtSctiesDstrbtnTp;
    }

    /**
     * Sets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat15Choice }
     *     
     */
    public CorporateAction83 setIntrmdtSctiesDstrbtnTp(IntermediateSecuritiesDistributionTypeFormat15Choice value) {
        this.intrmdtSctiesDstrbtnTp = value;
        return this;
    }

    /**
     * Gets the value of the cptlGnInOutInd property.
     * 
     * @return
     *     possible object is
     *     {@link CapitalGainFormat3Choice }
     *     
     */
    public CapitalGainFormat3Choice getCptlGnInOutInd() {
        return cptlGnInOutInd;
    }

    /**
     * Sets the value of the cptlGnInOutInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalGainFormat3Choice }
     *     
     */
    public CorporateAction83 setCptlGnInOutInd(CapitalGainFormat3Choice value) {
        this.cptlGnInOutInd = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableIncomePerShareCalculatedFormat3Choice }
     *     
     */
    public TaxableIncomePerShareCalculatedFormat3Choice getTaxblIncmPerShrClctd() {
        return taxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the taxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableIncomePerShareCalculatedFormat3Choice }
     *     
     */
    public CorporateAction83 setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculatedFormat3Choice value) {
        this.taxblIncmPerShrClctd = value;
        return this;
    }

    /**
     * Gets the value of the ltryTp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryTypeFormat4Choice }
     *     
     */
    public LotteryTypeFormat4Choice getLtryTp() {
        return ltryTp;
    }

    /**
     * Sets the value of the ltryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryTypeFormat4Choice }
     *     
     */
    public CorporateAction83 setLtryTp(LotteryTypeFormat4Choice value) {
        this.ltryTp = value;
        return this;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationTypeFormat3Choice }
     *     
     */
    public CertificationTypeFormat3Choice getCertfctnTp() {
        return certfctnTp;
    }

    /**
     * Sets the value of the certfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationTypeFormat3Choice }
     *     
     */
    public CorporateAction83 setCertfctnTp(CertificationTypeFormat3Choice value) {
        this.certfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the cnsntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentTypeFormat4Choice }
     *     
     */
    public ConsentTypeFormat4Choice getCnsntTp() {
        return cnsntTp;
    }

    /**
     * Sets the value of the cnsntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentTypeFormat4Choice }
     *     
     */
    public CorporateAction83 setCnsntTp(ConsentTypeFormat4Choice value) {
        this.cnsntTp = value;
        return this;
    }

    /**
     * Gets the value of the infTp property.
     * 
     * @return
     *     possible object is
     *     {@link InformationTypeFormat4Choice }
     *     
     */
    public InformationTypeFormat4Choice getInfTp() {
        return infTp;
    }

    /**
     * Sets the value of the infTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationTypeFormat4Choice }
     *     
     */
    public CorporateAction83 setInfTp(InformationTypeFormat4Choice value) {
        this.infTp = value;
        return this;
    }

    /**
     * Gets the value of the taxOnNonDstrbtdPrcdsInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxOnNonDstrbtdPrcdsInd property.
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
     * {@link GenericIdentification30 }
     * 
     * 
     * @return
     *     The value of the taxOnNonDstrbtdPrcdsInd property.
     */
    public List<GenericIdentification30> getTaxOnNonDstrbtdPrcdsInd() {
        if (taxOnNonDstrbtdPrcdsInd == null) {
            taxOnNonDstrbtdPrcdsInd = new ArrayList<>();
        }
        return this.taxOnNonDstrbtdPrcdsInd;
    }

    /**
     * Gets the value of the dtchAuctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link DutchAuctionTypeFormat1Choice }
     *     
     */
    public DutchAuctionTypeFormat1Choice getDtchAuctnTp() {
        return dtchAuctnTp;
    }

    /**
     * Sets the value of the dtchAuctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchAuctionTypeFormat1Choice }
     *     
     */
    public CorporateAction83 setDtchAuctnTp(DutchAuctionTypeFormat1Choice value) {
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
    public CorporateAction83 setNewPlcOfIncorprtn(String value) {
        this.newPlcOfIncorprtn = value;
        return this;
    }

    /**
     * Gets the value of the ntceTp property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionAnnouncementNoticeType1Code }
     *     
     */
    public RedemptionAnnouncementNoticeType1Code getNtceTp() {
        return ntceTp;
    }

    /**
     * Sets the value of the ntceTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionAnnouncementNoticeType1Code }
     *     
     */
    public CorporateAction83 setNtceTp(RedemptionAnnouncementNoticeType1Code value) {
        this.ntceTp = value;
        return this;
    }

    /**
     * Gets the value of the prratnRtrMinQtyTrtmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ProrationReturnQuantityTreatment1Code }
     *     
     */
    public ProrationReturnQuantityTreatment1Code getPrratnRtrMinQtyTrtmnt() {
        return prratnRtrMinQtyTrtmnt;
    }

    /**
     * Sets the value of the prratnRtrMinQtyTrtmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProrationReturnQuantityTreatment1Code }
     *     
     */
    public CorporateAction83 setPrratnRtrMinQtyTrtmnt(ProrationReturnQuantityTreatment1Code value) {
        this.prratnRtrMinQtyTrtmnt = value;
        return this;
    }

    /**
     * Gets the value of the certDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionSD26 }
     * 
     * 
     * @return
     *     The value of the certDtls property.
     */
    public List<CorporateActionSD26> getCertDtls() {
        if (certDtls == null) {
            certDtls = new ArrayList<>();
        }
        return this.certDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative58 }
     *     
     */
    public CorporateActionNarrative58 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative58 }
     *     
     */
    public CorporateAction83 setAddtlInf(CorporateActionNarrative58 value) {
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
     * Adds a new item to the offerTp list.
     * @see #getOfferTp()
     * 
     */
    public CorporateAction83 addOfferTp(OfferTypeFormat14Choice offerTp) {
        getOfferTp().add(offerTp);
        return this;
    }

    /**
     * Adds a new item to the evtStag list.
     * @see #getEvtStag()
     * 
     */
    public CorporateAction83 addEvtStag(CorporateActionEventStageFormat13Choice evtStag) {
        getEvtStag().add(evtStag);
        return this;
    }

    /**
     * Adds a new item to the addtlBizPrcInd list.
     * @see #getAddtlBizPrcInd()
     * 
     */
    public CorporateAction83 addAddtlBizPrcInd(AdditionalBusinessProcessFormat17Choice addtlBizPrcInd) {
        getAddtlBizPrcInd().add(addtlBizPrcInd);
        return this;
    }

    /**
     * Adds a new item to the chngTp list.
     * @see #getChngTp()
     * 
     */
    public CorporateAction83 addChngTp(CorporateActionChangeTypeFormat5Choice chngTp) {
        getChngTp().add(chngTp);
        return this;
    }

    /**
     * Adds a new item to the taxOnNonDstrbtdPrcdsInd list.
     * @see #getTaxOnNonDstrbtdPrcdsInd()
     * 
     */
    public CorporateAction83 addTaxOnNonDstrbtdPrcdsInd(GenericIdentification30 taxOnNonDstrbtdPrcdsInd) {
        getTaxOnNonDstrbtdPrcdsInd().add(taxOnNonDstrbtdPrcdsInd);
        return this;
    }

    /**
     * Adds a new item to the certDtls list.
     * @see #getCertDtls()
     * 
     */
    public CorporateAction83 addCertDtls(CorporateActionSD26 certDtls) {
        getCertDtls().add(certDtls);
        return this;
    }

}
