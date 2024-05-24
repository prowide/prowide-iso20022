
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
@XmlType(name = "CorporateAction52", propOrder = {
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
    "newPlcOfIncorprtn",
    "addtlInf"
})
public class CorporateAction52 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate61 dtDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod14 prdDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate91 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice57 pricDtls;
    @XmlElement(name = "SctiesQty")
    protected CorporateActionQuantity7 sctiesQty;
    @XmlElement(name = "IntrstAcrdNbOfDays")
    protected BigDecimal intrstAcrdNbOfDays;
    @XmlElement(name = "CpnNb")
    protected List<IdentificationFormat3Choice> cpnNb;
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
    protected DividendTypeFormat9Choice dvddTp;
    @XmlElement(name = "EvtSeqTp")
    protected EventSequenceTypeFormat1Choice evtSeqTp;
    @XmlElement(name = "OcrncTp")
    protected DistributionTypeFormat7Choice ocrncTp;
    @XmlElement(name = "OfferTp")
    protected List<OfferTypeFormat10Choice> offerTp;
    @XmlElement(name = "RnncblEntitlmntStsTp")
    protected RenounceableEntitlementStatusTypeFormat3Choice rnncblEntitlmntStsTp;
    @XmlElement(name = "EvtStag")
    protected List<CorporateActionEventStageFormat13Choice> evtStag;
    @XmlElement(name = "AddtlBizPrcInd")
    protected List<AdditionalBusinessProcessFormat9Choice> addtlBizPrcInd;
    @XmlElement(name = "ChngTp")
    protected List<CorporateActionChangeTypeFormat5Choice> chngTp;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecuritiesDistributionTypeFormat15Choice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "CptlGnInOutInd")
    protected CapitalGainFormat3Choice cptlGnInOutInd;
    @XmlElement(name = "TaxblIncmPerShrClctd")
    protected TaxableIncomePerShareCalculatedFormat3Choice taxblIncmPerShrClctd;
    @XmlElement(name = "ElctnTp")
    protected ElectionTypeFormat3Choice elctnTp;
    @XmlElement(name = "LtryTp")
    protected LotteryTypeFormat4Choice ltryTp;
    @XmlElement(name = "CertfctnTp")
    protected CertificationTypeFormat3Choice certfctnTp;
    @XmlElement(name = "CnsntTp")
    protected ConsentTypeFormat4Choice cnsntTp;
    @XmlElement(name = "InfTp")
    protected InformationTypeFormat4Choice infTp;
    @XmlElement(name = "TaxOnNonDstrbtdPrcdsInd")
    protected GenericIdentification30 taxOnNonDstrbtdPrcdsInd;
    @XmlElement(name = "NewPlcOfIncorprtn")
    protected String newPlcOfIncorprtn;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative26 addtlInf;

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate61 }
     *     
     */
    public CorporateActionDate61 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate61 }
     *     
     */
    public CorporateAction52 setDtDtls(CorporateActionDate61 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod14 }
     *     
     */
    public CorporateActionPeriod14 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod14 }
     *     
     */
    public CorporateAction52 setPrdDtls(CorporateActionPeriod14 value) {
        this.prdDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate91 }
     *     
     */
    public CorporateActionRate91 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate91 }
     *     
     */
    public CorporateAction52 setRateAndAmtDtls(CorporateActionRate91 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice57 }
     *     
     */
    public CorporateActionPrice57 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice57 }
     *     
     */
    public CorporateAction52 setPricDtls(CorporateActionPrice57 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionQuantity7 }
     *     
     */
    public CorporateActionQuantity7 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionQuantity7 }
     *     
     */
    public CorporateAction52 setSctiesQty(CorporateActionQuantity7 value) {
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
    public CorporateAction52 setIntrstAcrdNbOfDays(BigDecimal value) {
        this.intrstAcrdNbOfDays = value;
        return this;
    }

    /**
     * Gets the value of the cpnNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cpnNb property.
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
     * {@link IdentificationFormat3Choice }
     * 
     * 
     * @return
     *     The value of the cpnNb property.
     */
    public List<IdentificationFormat3Choice> getCpnNb() {
        if (cpnNb == null) {
            cpnNb = new ArrayList<>();
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
    public CorporateAction52 setCertfctnBrkdwnInd(Boolean value) {
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
    public CorporateAction52 setChrgsApldInd(Boolean value) {
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
    public CorporateAction52 setRstrctnInd(Boolean value) {
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
    public CorporateAction52 setAcrdIntrstInd(Boolean value) {
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
    public CorporateAction52 setLttrOfGrntedDlvryInd(Boolean value) {
        this.lttrOfGrntedDlvryInd = value;
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
    public CorporateAction52 setDvddTp(DividendTypeFormat9Choice value) {
        this.dvddTp = value;
        return this;
    }

    /**
     * Gets the value of the evtSeqTp property.
     * 
     * @return
     *     possible object is
     *     {@link EventSequenceTypeFormat1Choice }
     *     
     */
    public EventSequenceTypeFormat1Choice getEvtSeqTp() {
        return evtSeqTp;
    }

    /**
     * Sets the value of the evtSeqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventSequenceTypeFormat1Choice }
     *     
     */
    public CorporateAction52 setEvtSeqTp(EventSequenceTypeFormat1Choice value) {
        this.evtSeqTp = value;
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
    public CorporateAction52 setOcrncTp(DistributionTypeFormat7Choice value) {
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
     * {@link OfferTypeFormat10Choice }
     * 
     * 
     * @return
     *     The value of the offerTp property.
     */
    public List<OfferTypeFormat10Choice> getOfferTp() {
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
    public CorporateAction52 setRnncblEntitlmntStsTp(RenounceableEntitlementStatusTypeFormat3Choice value) {
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
     * {@link AdditionalBusinessProcessFormat9Choice }
     * 
     * 
     * @return
     *     The value of the addtlBizPrcInd property.
     */
    public List<AdditionalBusinessProcessFormat9Choice> getAddtlBizPrcInd() {
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
    public CorporateAction52 setIntrmdtSctiesDstrbtnTp(IntermediateSecuritiesDistributionTypeFormat15Choice value) {
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
    public CorporateAction52 setCptlGnInOutInd(CapitalGainFormat3Choice value) {
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
    public CorporateAction52 setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculatedFormat3Choice value) {
        this.taxblIncmPerShrClctd = value;
        return this;
    }

    /**
     * Gets the value of the elctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionTypeFormat3Choice }
     *     
     */
    public ElectionTypeFormat3Choice getElctnTp() {
        return elctnTp;
    }

    /**
     * Sets the value of the elctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionTypeFormat3Choice }
     *     
     */
    public CorporateAction52 setElctnTp(ElectionTypeFormat3Choice value) {
        this.elctnTp = value;
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
    public CorporateAction52 setLtryTp(LotteryTypeFormat4Choice value) {
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
    public CorporateAction52 setCertfctnTp(CertificationTypeFormat3Choice value) {
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
    public CorporateAction52 setCnsntTp(ConsentTypeFormat4Choice value) {
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
    public CorporateAction52 setInfTp(InformationTypeFormat4Choice value) {
        this.infTp = value;
        return this;
    }

    /**
     * Gets the value of the taxOnNonDstrbtdPrcdsInd property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getTaxOnNonDstrbtdPrcdsInd() {
        return taxOnNonDstrbtdPrcdsInd;
    }

    /**
     * Sets the value of the taxOnNonDstrbtdPrcdsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public CorporateAction52 setTaxOnNonDstrbtdPrcdsInd(GenericIdentification30 value) {
        this.taxOnNonDstrbtdPrcdsInd = value;
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
    public CorporateAction52 setNewPlcOfIncorprtn(String value) {
        this.newPlcOfIncorprtn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative26 }
     *     
     */
    public CorporateActionNarrative26 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative26 }
     *     
     */
    public CorporateAction52 setAddtlInf(CorporateActionNarrative26 value) {
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
    public CorporateAction52 addCpnNb(IdentificationFormat3Choice cpnNb) {
        getCpnNb().add(cpnNb);
        return this;
    }

    /**
     * Adds a new item to the offerTp list.
     * @see #getOfferTp()
     * 
     */
    public CorporateAction52 addOfferTp(OfferTypeFormat10Choice offerTp) {
        getOfferTp().add(offerTp);
        return this;
    }

    /**
     * Adds a new item to the evtStag list.
     * @see #getEvtStag()
     * 
     */
    public CorporateAction52 addEvtStag(CorporateActionEventStageFormat13Choice evtStag) {
        getEvtStag().add(evtStag);
        return this;
    }

    /**
     * Adds a new item to the addtlBizPrcInd list.
     * @see #getAddtlBizPrcInd()
     * 
     */
    public CorporateAction52 addAddtlBizPrcInd(AdditionalBusinessProcessFormat9Choice addtlBizPrcInd) {
        getAddtlBizPrcInd().add(addtlBizPrcInd);
        return this;
    }

    /**
     * Adds a new item to the chngTp list.
     * @see #getChngTp()
     * 
     */
    public CorporateAction52 addChngTp(CorporateActionChangeTypeFormat5Choice chngTp) {
        getChngTp().add(chngTp);
        return this;
    }

}
