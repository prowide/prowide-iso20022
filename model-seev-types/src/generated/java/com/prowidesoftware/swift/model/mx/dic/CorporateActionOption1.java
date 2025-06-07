
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides information about the CA option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption1", propOrder = {
    "optnNb",
    "optnTp",
    "optnAvlbtySts",
    "certfctnInd",
    "certfctnTp",
    "assntdLineSctyId",
    "agtSctiesAcctId",
    "agtCshAcctId",
    "offerTp",
    "intrmdtSctiesDstrbtnTp",
    "wdrwlAllwdInd",
    "chngAllwdInd",
    "dtDtls",
    "rateAndAmtDtls",
    "pricDtls",
    "prdDtls",
    "sctiesMvmntDtls",
    "cshMvmntDtls",
    "corpActnOthrAgtDtls",
    "frctnDspstn",
    "redChrgsApldInd",
    "optnFeatrs",
    "corpActnAddtlInf"
})
public class CorporateActionOption1 {

    @XmlElement(name = "OptnNb", required = true)
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption1FormatChoice optnTp;
    @XmlElement(name = "OptnAvlbtySts", required = true)
    protected CorporateActionEventStatus2FormatChoice optnAvlbtySts;
    @XmlElement(name = "CertfctnInd")
    protected Boolean certfctnInd;
    @XmlElement(name = "CertfctnTp")
    protected BeneficiaryCertificationType1FormatChoice certfctnTp;
    @XmlElement(name = "AssntdLineSctyId")
    protected SecurityIdentification7 assntdLineSctyId;
    @XmlElement(name = "AgtSctiesAcctId")
    protected String agtSctiesAcctId;
    @XmlElement(name = "AgtCshAcctId")
    protected AccountIdentification2Choice agtCshAcctId;
    @XmlElement(name = "OfferTp")
    protected List<OfferType1FormatChoice> offerTp;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecurityDistributionType1FormatChoice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "WdrwlAllwdInd")
    protected boolean wdrwlAllwdInd;
    @XmlElement(name = "ChngAllwdInd")
    protected boolean chngAllwdInd;
    @XmlElement(name = "DtDtls")
    protected CorporateActionDate4 dtDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate2 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice1 pricDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod2 prdDtls;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<SecurityOption1> sctiesMvmntDtls;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashOption1> cshMvmntDtls;
    @XmlElement(name = "CorpActnOthrAgtDtls")
    protected List<CorporateActionAgent1> corpActnOthrAgtDtls;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType1FormatChoice frctnDspstn;
    @XmlElement(name = "RedChrgsApldInd")
    protected Boolean redChrgsApldInd;
    @XmlElement(name = "OptnFeatrs")
    protected List<OptionFeatures1FormatChoice> optnFeatrs;
    @XmlElement(name = "CorpActnAddtlInf")
    protected CorporateActionNarrative1 corpActnAddtlInf;

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
    public CorporateActionOption1 setOptnNb(String value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionOption1FormatChoice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionOption1 setOptnTp(CorporateActionOption1FormatChoice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the optnAvlbtySts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStatus2FormatChoice }
     *     
     */
    public CorporateActionEventStatus2FormatChoice getOptnAvlbtySts() {
        return optnAvlbtySts;
    }

    /**
     * Sets the value of the optnAvlbtySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStatus2FormatChoice }
     *     
     */
    public CorporateActionOption1 setOptnAvlbtySts(CorporateActionEventStatus2FormatChoice value) {
        this.optnAvlbtySts = value;
        return this;
    }

    /**
     * Gets the value of the certfctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertfctnInd() {
        return certfctnInd;
    }

    /**
     * Sets the value of the certfctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption1 setCertfctnInd(Boolean value) {
        this.certfctnInd = value;
        return this;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryCertificationType1FormatChoice }
     *     
     */
    public BeneficiaryCertificationType1FormatChoice getCertfctnTp() {
        return certfctnTp;
    }

    /**
     * Sets the value of the certfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryCertificationType1FormatChoice }
     *     
     */
    public CorporateActionOption1 setCertfctnTp(BeneficiaryCertificationType1FormatChoice value) {
        this.certfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the assntdLineSctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getAssntdLineSctyId() {
        return assntdLineSctyId;
    }

    /**
     * Sets the value of the assntdLineSctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public CorporateActionOption1 setAssntdLineSctyId(SecurityIdentification7 value) {
        this.assntdLineSctyId = value;
        return this;
    }

    /**
     * Gets the value of the agtSctiesAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtSctiesAcctId() {
        return agtSctiesAcctId;
    }

    /**
     * Sets the value of the agtSctiesAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionOption1 setAgtSctiesAcctId(String value) {
        this.agtSctiesAcctId = value;
        return this;
    }

    /**
     * Gets the value of the agtCshAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification2Choice }
     *     
     */
    public AccountIdentification2Choice getAgtCshAcctId() {
        return agtCshAcctId;
    }

    /**
     * Sets the value of the agtCshAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification2Choice }
     *     
     */
    public CorporateActionOption1 setAgtCshAcctId(AccountIdentification2Choice value) {
        this.agtCshAcctId = value;
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
     * {@link OfferType1FormatChoice }
     * 
     * 
     */
    public List<OfferType1FormatChoice> getOfferTp() {
        if (offerTp == null) {
            offerTp = new ArrayList<OfferType1FormatChoice>();
        }
        return this.offerTp;
    }

    /**
     * Gets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateSecurityDistributionType1FormatChoice }
     *     
     */
    public IntermediateSecurityDistributionType1FormatChoice getIntrmdtSctiesDstrbtnTp() {
        return intrmdtSctiesDstrbtnTp;
    }

    /**
     * Sets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateSecurityDistributionType1FormatChoice }
     *     
     */
    public CorporateActionOption1 setIntrmdtSctiesDstrbtnTp(IntermediateSecurityDistributionType1FormatChoice value) {
        this.intrmdtSctiesDstrbtnTp = value;
        return this;
    }

    /**
     * Gets the value of the wdrwlAllwdInd property.
     * 
     */
    public boolean isWdrwlAllwdInd() {
        return wdrwlAllwdInd;
    }

    /**
     * Sets the value of the wdrwlAllwdInd property.
     * 
     */
    public CorporateActionOption1 setWdrwlAllwdInd(boolean value) {
        this.wdrwlAllwdInd = value;
        return this;
    }

    /**
     * Gets the value of the chngAllwdInd property.
     * 
     */
    public boolean isChngAllwdInd() {
        return chngAllwdInd;
    }

    /**
     * Sets the value of the chngAllwdInd property.
     * 
     */
    public CorporateActionOption1 setChngAllwdInd(boolean value) {
        this.chngAllwdInd = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate4 }
     *     
     */
    public CorporateActionDate4 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate4 }
     *     
     */
    public CorporateActionOption1 setDtDtls(CorporateActionDate4 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate2 }
     *     
     */
    public CorporateActionRate2 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate2 }
     *     
     */
    public CorporateActionOption1 setRateAndAmtDtls(CorporateActionRate2 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice1 }
     *     
     */
    public CorporateActionPrice1 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice1 }
     *     
     */
    public CorporateActionOption1 setPricDtls(CorporateActionPrice1 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod2 }
     *     
     */
    public CorporateActionPeriod2 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod2 }
     *     
     */
    public CorporateActionOption1 setPrdDtls(CorporateActionPeriod2 value) {
        this.prdDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntDtls property.
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
     * {@link SecurityOption1 }
     * 
     * 
     */
    public List<SecurityOption1> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<SecurityOption1>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshMvmntDtls property.
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
     * {@link CashOption1 }
     * 
     * 
     */
    public List<CashOption1> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<CashOption1>();
        }
        return this.cshMvmntDtls;
    }

    /**
     * Gets the value of the corpActnOthrAgtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpActnOthrAgtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnOthrAgtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionAgent1 }
     * 
     * 
     */
    public List<CorporateActionAgent1> getCorpActnOthrAgtDtls() {
        if (corpActnOthrAgtDtls == null) {
            corpActnOthrAgtDtls = new ArrayList<CorporateActionAgent1>();
        }
        return this.corpActnOthrAgtDtls;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType1FormatChoice }
     *     
     */
    public FractionDispositionType1FormatChoice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType1FormatChoice }
     *     
     */
    public CorporateActionOption1 setFrctnDspstn(FractionDispositionType1FormatChoice value) {
        this.frctnDspstn = value;
        return this;
    }

    /**
     * Gets the value of the redChrgsApldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedChrgsApldInd() {
        return redChrgsApldInd;
    }

    /**
     * Sets the value of the redChrgsApldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption1 setRedChrgsApldInd(Boolean value) {
        this.redChrgsApldInd = value;
        return this;
    }

    /**
     * Gets the value of the optnFeatrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnFeatrs property.
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
     * {@link OptionFeatures1FormatChoice }
     * 
     * 
     */
    public List<OptionFeatures1FormatChoice> getOptnFeatrs() {
        if (optnFeatrs == null) {
            optnFeatrs = new ArrayList<OptionFeatures1FormatChoice>();
        }
        return this.optnFeatrs;
    }

    /**
     * Gets the value of the corpActnAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative1 }
     *     
     */
    public CorporateActionNarrative1 getCorpActnAddtlInf() {
        return corpActnAddtlInf;
    }

    /**
     * Sets the value of the corpActnAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative1 }
     *     
     */
    public CorporateActionOption1 setCorpActnAddtlInf(CorporateActionNarrative1 value) {
        this.corpActnAddtlInf = value;
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
    public CorporateActionOption1 addOfferTp(OfferType1FormatChoice offerTp) {
        getOfferTp().add(offerTp);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntDtls list.
     * @see #getSctiesMvmntDtls()
     * 
     */
    public CorporateActionOption1 addSctiesMvmntDtls(SecurityOption1 sctiesMvmntDtls) {
        getSctiesMvmntDtls().add(sctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the cshMvmntDtls list.
     * @see #getCshMvmntDtls()
     * 
     */
    public CorporateActionOption1 addCshMvmntDtls(CashOption1 cshMvmntDtls) {
        getCshMvmntDtls().add(cshMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the corpActnOthrAgtDtls list.
     * @see #getCorpActnOthrAgtDtls()
     * 
     */
    public CorporateActionOption1 addCorpActnOthrAgtDtls(CorporateActionAgent1 corpActnOthrAgtDtls) {
        getCorpActnOthrAgtDtls().add(corpActnOthrAgtDtls);
        return this;
    }

    /**
     * Adds a new item to the optnFeatrs list.
     * @see #getOptnFeatrs()
     * 
     */
    public CorporateActionOption1 addOptnFeatrs(OptionFeatures1FormatChoice optnFeatrs) {
        getOptnFeatrs().add(optnFeatrs);
        return this;
    }

}
