
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
 * Provides information about the corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption235", propOrder = {
    "optnNb",
    "optnTp",
    "frctnDspstn",
    "offerTp",
    "optnFeatrs",
    "splmtryOptnFeatrs",
    "optnAvlbtySts",
    "certfctnBrkdwnTp",
    "ccyOptn",
    "dfltOptnInd",
    "accptncPrtyLvl",
    "certfctnBrkdwnInd",
    "wdrwlAllwdInd",
    "ovrsbcptChrgInd",
    "prtctChrgInd",
    "sbcptChrgInd",
    "stepUpChrgInd",
    "finInstrmId",
    "dtDtls",
    "prdDtls",
    "rateAndAmtDtls",
    "pricDtls",
    "sctiesQty",
    "taxCtgy",
    "prratnBlwMinQty",
    "prratnRndgInd",
    "prratnFrctn",
    "prratnRtrMinQtyTrtmnt",
    "sctiesMvmntDtls",
    "cshMvmntDtls",
    "addtlInf"
})
public class CorporateActionOption235 {

    @XmlElement(name = "OptnNb", required = true)
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption37Choice optnTp;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType26Choice frctnDspstn;
    @XmlElement(name = "OfferTp")
    protected List<OfferTypeFormat14Choice> offerTp;
    @XmlElement(name = "OptnFeatrs")
    protected List<OptionFeaturesFormat28Choice> optnFeatrs;
    @XmlElement(name = "SplmtryOptnFeatrs")
    @XmlSchemaType(name = "string")
    protected List<ExtendedOptionFeature2Code> splmtryOptnFeatrs;
    @XmlElement(name = "OptnAvlbtySts")
    protected OptionAvailabilityStatus3Choice optnAvlbtySts;
    @XmlElement(name = "CertfctnBrkdwnTp")
    protected List<BeneficiaryCertificationType13Choice> certfctnBrkdwnTp;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "DfltOptnInd")
    protected boolean dfltOptnInd;
    @XmlElement(name = "AccptncPrtyLvl")
    protected String accptncPrtyLvl;
    @XmlElement(name = "CertfctnBrkdwnInd")
    protected Boolean certfctnBrkdwnInd;
    @XmlElement(name = "WdrwlAllwdInd")
    protected Boolean wdrwlAllwdInd;
    @XmlElement(name = "OvrsbcptChrgInd")
    protected Boolean ovrsbcptChrgInd;
    @XmlElement(name = "PrtctChrgInd")
    protected Boolean prtctChrgInd;
    @XmlElement(name = "SbcptChrgInd")
    protected Boolean sbcptChrgInd;
    @XmlElement(name = "StepUpChrgInd")
    protected Boolean stepUpChrgInd;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "DtDtls")
    protected CorporateActionDate104 dtDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod12 prdDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate124 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice87 pricDtls;
    @XmlElement(name = "SctiesQty")
    protected SecuritiesOption81 sctiesQty;
    @XmlElement(name = "TaxCtgy")
    protected List<TaxCategory1> taxCtgy;
    @XmlElement(name = "PrratnBlwMinQty")
    protected ProrationBelowMinimumQuantity2Choice prratnBlwMinQty;
    @XmlElement(name = "PrratnRndgInd")
    @XmlSchemaType(name = "string")
    protected FractionDispositionType12Code prratnRndgInd;
    @XmlElement(name = "PrratnFrctn")
    protected BigDecimal prratnFrctn;
    @XmlElement(name = "PrratnRtrMinQtyTrtmnt")
    @XmlSchemaType(name = "string")
    protected ProrationReturnQuantityTreatment1Code prratnRtrMinQtyTrtmnt;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<SecuritiesOption114> sctiesMvmntDtls;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashOption108> cshMvmntDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative66 addtlInf;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionOption235 setOptnNb(String value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption37Choice }
     *     
     */
    public CorporateActionOption37Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption37Choice }
     *     
     */
    public CorporateActionOption235 setOptnTp(CorporateActionOption37Choice value) {
        this.optnTp = value;
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
    public CorporateActionOption235 setFrctnDspstn(FractionDispositionType26Choice value) {
        this.frctnDspstn = value;
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
     * Gets the value of the optnFeatrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnFeatrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnFeatrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionFeaturesFormat28Choice }
     * 
     * 
     * @return
     *     The value of the optnFeatrs property.
     */
    public List<OptionFeaturesFormat28Choice> getOptnFeatrs() {
        if (optnFeatrs == null) {
            optnFeatrs = new ArrayList<>();
        }
        return this.optnFeatrs;
    }

    /**
     * Gets the value of the splmtryOptnFeatrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryOptnFeatrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryOptnFeatrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedOptionFeature2Code }
     * 
     * 
     * @return
     *     The value of the splmtryOptnFeatrs property.
     */
    public List<ExtendedOptionFeature2Code> getSplmtryOptnFeatrs() {
        if (splmtryOptnFeatrs == null) {
            splmtryOptnFeatrs = new ArrayList<>();
        }
        return this.splmtryOptnFeatrs;
    }

    /**
     * Gets the value of the optnAvlbtySts property.
     * 
     * @return
     *     possible object is
     *     {@link OptionAvailabilityStatus3Choice }
     *     
     */
    public OptionAvailabilityStatus3Choice getOptnAvlbtySts() {
        return optnAvlbtySts;
    }

    /**
     * Sets the value of the optnAvlbtySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionAvailabilityStatus3Choice }
     *     
     */
    public CorporateActionOption235 setOptnAvlbtySts(OptionAvailabilityStatus3Choice value) {
        this.optnAvlbtySts = value;
        return this;
    }

    /**
     * Gets the value of the certfctnBrkdwnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certfctnBrkdwnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertfctnBrkdwnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficiaryCertificationType13Choice }
     * 
     * 
     * @return
     *     The value of the certfctnBrkdwnTp property.
     */
    public List<BeneficiaryCertificationType13Choice> getCertfctnBrkdwnTp() {
        if (certfctnBrkdwnTp == null) {
            certfctnBrkdwnTp = new ArrayList<>();
        }
        return this.certfctnBrkdwnTp;
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
    public CorporateActionOption235 setCcyOptn(String value) {
        this.ccyOptn = value;
        return this;
    }

    /**
     * Gets the value of the dfltOptnInd property.
     * 
     */
    public boolean isDfltOptnInd() {
        return dfltOptnInd;
    }

    /**
     * Sets the value of the dfltOptnInd property.
     * 
     */
    public CorporateActionOption235 setDfltOptnInd(boolean value) {
        this.dfltOptnInd = value;
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
    public CorporateActionOption235 setAccptncPrtyLvl(String value) {
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
    public CorporateActionOption235 setCertfctnBrkdwnInd(Boolean value) {
        this.certfctnBrkdwnInd = value;
        return this;
    }

    /**
     * Gets the value of the wdrwlAllwdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWdrwlAllwdInd() {
        return wdrwlAllwdInd;
    }

    /**
     * Sets the value of the wdrwlAllwdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption235 setWdrwlAllwdInd(Boolean value) {
        this.wdrwlAllwdInd = value;
        return this;
    }

    /**
     * Gets the value of the ovrsbcptChrgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOvrsbcptChrgInd() {
        return ovrsbcptChrgInd;
    }

    /**
     * Sets the value of the ovrsbcptChrgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption235 setOvrsbcptChrgInd(Boolean value) {
        this.ovrsbcptChrgInd = value;
        return this;
    }

    /**
     * Gets the value of the prtctChrgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtctChrgInd() {
        return prtctChrgInd;
    }

    /**
     * Sets the value of the prtctChrgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption235 setPrtctChrgInd(Boolean value) {
        this.prtctChrgInd = value;
        return this;
    }

    /**
     * Gets the value of the sbcptChrgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSbcptChrgInd() {
        return sbcptChrgInd;
    }

    /**
     * Sets the value of the sbcptChrgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption235 setSbcptChrgInd(Boolean value) {
        this.sbcptChrgInd = value;
        return this;
    }

    /**
     * Gets the value of the stepUpChrgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStepUpChrgInd() {
        return stepUpChrgInd;
    }

    /**
     * Sets the value of the stepUpChrgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption235 setStepUpChrgInd(Boolean value) {
        this.stepUpChrgInd = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public CorporateActionOption235 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate104 }
     *     
     */
    public CorporateActionDate104 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate104 }
     *     
     */
    public CorporateActionOption235 setDtDtls(CorporateActionDate104 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod12 }
     *     
     */
    public CorporateActionPeriod12 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod12 }
     *     
     */
    public CorporateActionOption235 setPrdDtls(CorporateActionPeriod12 value) {
        this.prdDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate124 }
     *     
     */
    public CorporateActionRate124 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate124 }
     *     
     */
    public CorporateActionOption235 setRateAndAmtDtls(CorporateActionRate124 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice87 }
     *     
     */
    public CorporateActionPrice87 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice87 }
     *     
     */
    public CorporateActionOption235 setPricDtls(CorporateActionPrice87 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesOption81 }
     *     
     */
    public SecuritiesOption81 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesOption81 }
     *     
     */
    public CorporateActionOption235 setSctiesQty(SecuritiesOption81 value) {
        this.sctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the taxCtgy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxCtgy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCtgy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategory1 }
     * 
     * 
     * @return
     *     The value of the taxCtgy property.
     */
    public List<TaxCategory1> getTaxCtgy() {
        if (taxCtgy == null) {
            taxCtgy = new ArrayList<>();
        }
        return this.taxCtgy;
    }

    /**
     * Gets the value of the prratnBlwMinQty property.
     * 
     * @return
     *     possible object is
     *     {@link ProrationBelowMinimumQuantity2Choice }
     *     
     */
    public ProrationBelowMinimumQuantity2Choice getPrratnBlwMinQty() {
        return prratnBlwMinQty;
    }

    /**
     * Sets the value of the prratnBlwMinQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProrationBelowMinimumQuantity2Choice }
     *     
     */
    public CorporateActionOption235 setPrratnBlwMinQty(ProrationBelowMinimumQuantity2Choice value) {
        this.prratnBlwMinQty = value;
        return this;
    }

    /**
     * Gets the value of the prratnRndgInd property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType12Code }
     *     
     */
    public FractionDispositionType12Code getPrratnRndgInd() {
        return prratnRndgInd;
    }

    /**
     * Sets the value of the prratnRndgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType12Code }
     *     
     */
    public CorporateActionOption235 setPrratnRndgInd(FractionDispositionType12Code value) {
        this.prratnRndgInd = value;
        return this;
    }

    /**
     * Gets the value of the prratnFrctn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrratnFrctn() {
        return prratnFrctn;
    }

    /**
     * Sets the value of the prratnFrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionOption235 setPrratnFrctn(BigDecimal value) {
        this.prratnFrctn = value;
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
    public CorporateActionOption235 setPrratnRtrMinQtyTrtmnt(ProrationReturnQuantityTreatment1Code value) {
        this.prratnRtrMinQtyTrtmnt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOption114 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntDtls property.
     */
    public List<SecuritiesOption114> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOption108 }
     * 
     * 
     * @return
     *     The value of the cshMvmntDtls property.
     */
    public List<CashOption108> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<>();
        }
        return this.cshMvmntDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative66 }
     *     
     */
    public CorporateActionNarrative66 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative66 }
     *     
     */
    public CorporateActionOption235 setAddtlInf(CorporateActionNarrative66 value) {
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
    public CorporateActionOption235 addOfferTp(OfferTypeFormat14Choice offerTp) {
        getOfferTp().add(offerTp);
        return this;
    }

    /**
     * Adds a new item to the optnFeatrs list.
     * @see #getOptnFeatrs()
     * 
     */
    public CorporateActionOption235 addOptnFeatrs(OptionFeaturesFormat28Choice optnFeatrs) {
        getOptnFeatrs().add(optnFeatrs);
        return this;
    }

    /**
     * Adds a new item to the splmtryOptnFeatrs list.
     * @see #getSplmtryOptnFeatrs()
     * 
     */
    public CorporateActionOption235 addSplmtryOptnFeatrs(ExtendedOptionFeature2Code splmtryOptnFeatrs) {
        getSplmtryOptnFeatrs().add(splmtryOptnFeatrs);
        return this;
    }

    /**
     * Adds a new item to the certfctnBrkdwnTp list.
     * @see #getCertfctnBrkdwnTp()
     * 
     */
    public CorporateActionOption235 addCertfctnBrkdwnTp(BeneficiaryCertificationType13Choice certfctnBrkdwnTp) {
        getCertfctnBrkdwnTp().add(certfctnBrkdwnTp);
        return this;
    }

    /**
     * Adds a new item to the taxCtgy list.
     * @see #getTaxCtgy()
     * 
     */
    public CorporateActionOption235 addTaxCtgy(TaxCategory1 taxCtgy) {
        getTaxCtgy().add(taxCtgy);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntDtls list.
     * @see #getSctiesMvmntDtls()
     * 
     */
    public CorporateActionOption235 addSctiesMvmntDtls(SecuritiesOption114 sctiesMvmntDtls) {
        getSctiesMvmntDtls().add(sctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the cshMvmntDtls list.
     * @see #getCshMvmntDtls()
     * 
     */
    public CorporateActionOption235 addCshMvmntDtls(CashOption108 cshMvmntDtls) {
        getCshMvmntDtls().add(cshMvmntDtls);
        return this;
    }

}
