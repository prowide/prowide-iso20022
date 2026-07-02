
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides information about the CA event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateAction2", propOrder = {
    "evtStag",
    "dfltOptnTp",
    "dfltOptnNb",
    "clctnMtd",
    "bckEndOddLotSctiesQty",
    "frntEndOddLotSctiesQty",
    "minExrcblSctiesQty",
    "minExrcblMltplSctiesQty",
    "incrmtlDnmtn",
    "newDnmtnSctiesQty",
    "newBrdLotSctiesQty",
    "sctiesQtySght",
    "baseDnmtn",
    "chngTp",
    "offerTp",
    "rstrctnInd",
    "prtlElctnInd",
    "elctnTp",
    "ltryTp",
    "incmTp",
    "dvddTp",
    "intrmdtSctiesDstrbtnTp",
    "cpnNb",
    "intrstAcrdNbOfDays",
    "newDnmtnCcy",
    "dtDtls",
    "pricDtls",
    "prdDtls",
    "rateAndAmtDtls",
    "corpActnAddtlInf",
    "certfctnReqrdInd",
    "certfctnTp",
    "cptlGn",
    "taxblIncmPerShrClctd",
    "newPlcOfIncorprtn",
    "rnncblEntitlmntStsTp",
    "convsTp",
    "redChrgsApldInd",
    "dstrbtnTp"
})
public class CorporateAction2 {

    @XmlElement(name = "EvtStag")
    protected List<CorporateActionEventStage1FormatChoice> evtStag;
    @XmlElement(name = "DfltOptnTp")
    protected CorporateActionOption1FormatChoice dfltOptnTp;
    @XmlElement(name = "DfltOptnNb")
    protected String dfltOptnNb;
    @XmlElement(name = "ClctnMtd")
    protected CorporateActionCalculationMethod1FormatChoice clctnMtd;
    @XmlElement(name = "BckEndOddLotSctiesQty")
    protected UnitOrFaceAmountOrCode1Choice bckEndOddLotSctiesQty;
    @XmlElement(name = "FrntEndOddLotSctiesQty")
    protected UnitOrFaceAmountOrCode1Choice frntEndOddLotSctiesQty;
    @XmlElement(name = "MinExrcblSctiesQty")
    protected UnitOrFaceAmount1Choice minExrcblSctiesQty;
    @XmlElement(name = "MinExrcblMltplSctiesQty")
    protected UnitOrFaceAmount1Choice minExrcblMltplSctiesQty;
    @XmlElement(name = "IncrmtlDnmtn")
    protected UnitOrFaceAmount1Choice incrmtlDnmtn;
    @XmlElement(name = "NewDnmtnSctiesQty")
    protected UnitOrFaceAmount1Choice newDnmtnSctiesQty;
    @XmlElement(name = "NewBrdLotSctiesQty")
    protected UnitOrFaceAmount1Choice newBrdLotSctiesQty;
    @XmlElement(name = "SctiesQtySght")
    protected UnitOrFaceAmountOrCode1Choice sctiesQtySght;
    @XmlElement(name = "BaseDnmtn")
    protected UnitOrFaceAmount1Choice baseDnmtn;
    @XmlElement(name = "ChngTp")
    protected List<CorporateActionChangeType1FormatChoice> chngTp;
    @XmlElement(name = "OfferTp")
    protected List<OfferType1FormatChoice> offerTp;
    @XmlElement(name = "RstrctnInd")
    protected Boolean rstrctnInd;
    @XmlElement(name = "PrtlElctnInd")
    protected Boolean prtlElctnInd;
    @XmlElement(name = "ElctnTp")
    protected ElectionMovementType1FormatChoice elctnTp;
    @XmlElement(name = "LtryTp")
    protected LotteryType1FormatChoice ltryTp;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification13 incmTp;
    @XmlElement(name = "DvddTp")
    protected CorporateActionFrequencyType1FormatChoice dvddTp;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecurityDistributionType1FormatChoice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "CpnNb")
    protected List<String> cpnNb;
    @XmlElement(name = "IntrstAcrdNbOfDays")
    protected BigDecimal intrstAcrdNbOfDays;
    @XmlElement(name = "NewDnmtnCcy")
    protected String newDnmtnCcy;
    @XmlElement(name = "DtDtls")
    protected CorporateActionDate2 dtDtls;
    @XmlElement(name = "PricDtls")
    protected List<CorporateActionPrice2> pricDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod1 prdDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate1 rateAndAmtDtls;
    @XmlElement(name = "CorpActnAddtlInf")
    protected CorporateActionNarrative1 corpActnAddtlInf;
    @XmlElement(name = "CertfctnReqrdInd")
    protected Boolean certfctnReqrdInd;
    @XmlElement(name = "CertfctnTp")
    protected BeneficiaryCertificationType1FormatChoice certfctnTp;
    @XmlElement(name = "CptlGn")
    @XmlSchemaType(name = "string")
    protected EUCapitalGain2Code cptlGn;
    @XmlElement(name = "TaxblIncmPerShrClctd")
    @XmlSchemaType(name = "string")
    protected TaxableIncomePerShareCalculated2Code taxblIncmPerShrClctd;
    @XmlElement(name = "NewPlcOfIncorprtn")
    protected String newPlcOfIncorprtn;
    @XmlElement(name = "RnncblEntitlmntStsTp")
    protected RenounceableStatus1FormatChoice rnncblEntitlmntStsTp;
    @XmlElement(name = "ConvsTp")
    protected ConversionType1FormatChoice convsTp;
    @XmlElement(name = "RedChrgsApldInd")
    protected Boolean redChrgsApldInd;
    @XmlElement(name = "DstrbtnTp")
    protected DistributionType1FormatChoice dstrbtnTp;

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
     * {@link CorporateActionEventStage1FormatChoice }
     * 
     * 
     */
    public List<CorporateActionEventStage1FormatChoice> getEvtStag() {
        if (evtStag == null) {
            evtStag = new ArrayList<CorporateActionEventStage1FormatChoice>();
        }
        return this.evtStag;
    }

    /**
     * Gets the value of the dfltOptnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionOption1FormatChoice getDfltOptnTp() {
        return dfltOptnTp;
    }

    /**
     * Sets the value of the dfltOptnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateAction2 setDfltOptnTp(CorporateActionOption1FormatChoice value) {
        this.dfltOptnTp = value;
        return this;
    }

    /**
     * Gets the value of the dfltOptnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfltOptnNb() {
        return dfltOptnNb;
    }

    /**
     * Sets the value of the dfltOptnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateAction2 setDfltOptnNb(String value) {
        this.dfltOptnNb = value;
        return this;
    }

    /**
     * Gets the value of the clctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCalculationMethod1FormatChoice }
     *     
     */
    public CorporateActionCalculationMethod1FormatChoice getClctnMtd() {
        return clctnMtd;
    }

    /**
     * Sets the value of the clctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCalculationMethod1FormatChoice }
     *     
     */
    public CorporateAction2 setClctnMtd(CorporateActionCalculationMethod1FormatChoice value) {
        this.clctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the bckEndOddLotSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmountOrCode1Choice }
     *     
     */
    public UnitOrFaceAmountOrCode1Choice getBckEndOddLotSctiesQty() {
        return bckEndOddLotSctiesQty;
    }

    /**
     * Sets the value of the bckEndOddLotSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmountOrCode1Choice }
     *     
     */
    public CorporateAction2 setBckEndOddLotSctiesQty(UnitOrFaceAmountOrCode1Choice value) {
        this.bckEndOddLotSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the frntEndOddLotSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmountOrCode1Choice }
     *     
     */
    public UnitOrFaceAmountOrCode1Choice getFrntEndOddLotSctiesQty() {
        return frntEndOddLotSctiesQty;
    }

    /**
     * Sets the value of the frntEndOddLotSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmountOrCode1Choice }
     *     
     */
    public CorporateAction2 setFrntEndOddLotSctiesQty(UnitOrFaceAmountOrCode1Choice value) {
        this.frntEndOddLotSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getMinExrcblSctiesQty() {
        return minExrcblSctiesQty;
    }

    /**
     * Sets the value of the minExrcblSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public CorporateAction2 setMinExrcblSctiesQty(UnitOrFaceAmount1Choice value) {
        this.minExrcblSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblMltplSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getMinExrcblMltplSctiesQty() {
        return minExrcblMltplSctiesQty;
    }

    /**
     * Sets the value of the minExrcblMltplSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public CorporateAction2 setMinExrcblMltplSctiesQty(UnitOrFaceAmount1Choice value) {
        this.minExrcblMltplSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the incrmtlDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getIncrmtlDnmtn() {
        return incrmtlDnmtn;
    }

    /**
     * Sets the value of the incrmtlDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public CorporateAction2 setIncrmtlDnmtn(UnitOrFaceAmount1Choice value) {
        this.incrmtlDnmtn = value;
        return this;
    }

    /**
     * Gets the value of the newDnmtnSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getNewDnmtnSctiesQty() {
        return newDnmtnSctiesQty;
    }

    /**
     * Sets the value of the newDnmtnSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public CorporateAction2 setNewDnmtnSctiesQty(UnitOrFaceAmount1Choice value) {
        this.newDnmtnSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the newBrdLotSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getNewBrdLotSctiesQty() {
        return newBrdLotSctiesQty;
    }

    /**
     * Sets the value of the newBrdLotSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public CorporateAction2 setNewBrdLotSctiesQty(UnitOrFaceAmount1Choice value) {
        this.newBrdLotSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQtySght property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmountOrCode1Choice }
     *     
     */
    public UnitOrFaceAmountOrCode1Choice getSctiesQtySght() {
        return sctiesQtySght;
    }

    /**
     * Sets the value of the sctiesQtySght property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmountOrCode1Choice }
     *     
     */
    public CorporateAction2 setSctiesQtySght(UnitOrFaceAmountOrCode1Choice value) {
        this.sctiesQtySght = value;
        return this;
    }

    /**
     * Gets the value of the baseDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getBaseDnmtn() {
        return baseDnmtn;
    }

    /**
     * Sets the value of the baseDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public CorporateAction2 setBaseDnmtn(UnitOrFaceAmount1Choice value) {
        this.baseDnmtn = value;
        return this;
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
     * {@link CorporateActionChangeType1FormatChoice }
     * 
     * 
     */
    public List<CorporateActionChangeType1FormatChoice> getChngTp() {
        if (chngTp == null) {
            chngTp = new ArrayList<CorporateActionChangeType1FormatChoice>();
        }
        return this.chngTp;
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
    public CorporateAction2 setRstrctnInd(Boolean value) {
        this.rstrctnInd = value;
        return this;
    }

    /**
     * Gets the value of the prtlElctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlElctnInd() {
        return prtlElctnInd;
    }

    /**
     * Sets the value of the prtlElctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateAction2 setPrtlElctnInd(Boolean value) {
        this.prtlElctnInd = value;
        return this;
    }

    /**
     * Gets the value of the elctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionMovementType1FormatChoice }
     *     
     */
    public ElectionMovementType1FormatChoice getElctnTp() {
        return elctnTp;
    }

    /**
     * Sets the value of the elctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionMovementType1FormatChoice }
     *     
     */
    public CorporateAction2 setElctnTp(ElectionMovementType1FormatChoice value) {
        this.elctnTp = value;
        return this;
    }

    /**
     * Gets the value of the ltryTp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryType1FormatChoice }
     *     
     */
    public LotteryType1FormatChoice getLtryTp() {
        return ltryTp;
    }

    /**
     * Sets the value of the ltryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryType1FormatChoice }
     *     
     */
    public CorporateAction2 setLtryTp(LotteryType1FormatChoice value) {
        this.ltryTp = value;
        return this;
    }

    /**
     * Gets the value of the incmTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification13 }
     *     
     */
    public GenericIdentification13 getIncmTp() {
        return incmTp;
    }

    /**
     * Sets the value of the incmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification13 }
     *     
     */
    public CorporateAction2 setIncmTp(GenericIdentification13 value) {
        this.incmTp = value;
        return this;
    }

    /**
     * Gets the value of the dvddTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionFrequencyType1FormatChoice }
     *     
     */
    public CorporateActionFrequencyType1FormatChoice getDvddTp() {
        return dvddTp;
    }

    /**
     * Sets the value of the dvddTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionFrequencyType1FormatChoice }
     *     
     */
    public CorporateAction2 setDvddTp(CorporateActionFrequencyType1FormatChoice value) {
        this.dvddTp = value;
        return this;
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
    public CorporateAction2 setIntrmdtSctiesDstrbtnTp(IntermediateSecurityDistributionType1FormatChoice value) {
        this.intrmdtSctiesDstrbtnTp = value;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getCpnNb() {
        if (cpnNb == null) {
            cpnNb = new ArrayList<String>();
        }
        return this.cpnNb;
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
    public CorporateAction2 setIntrstAcrdNbOfDays(BigDecimal value) {
        this.intrstAcrdNbOfDays = value;
        return this;
    }

    /**
     * Gets the value of the newDnmtnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDnmtnCcy() {
        return newDnmtnCcy;
    }

    /**
     * Sets the value of the newDnmtnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateAction2 setNewDnmtnCcy(String value) {
        this.newDnmtnCcy = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate2 }
     *     
     */
    public CorporateActionDate2 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate2 }
     *     
     */
    public CorporateAction2 setDtDtls(CorporateActionDate2 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionPrice2 }
     * 
     * 
     */
    public List<CorporateActionPrice2> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<CorporateActionPrice2>();
        }
        return this.pricDtls;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod1 }
     *     
     */
    public CorporateActionPeriod1 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod1 }
     *     
     */
    public CorporateAction2 setPrdDtls(CorporateActionPeriod1 value) {
        this.prdDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate1 }
     *     
     */
    public CorporateActionRate1 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate1 }
     *     
     */
    public CorporateAction2 setRateAndAmtDtls(CorporateActionRate1 value) {
        this.rateAndAmtDtls = value;
        return this;
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
    public CorporateAction2 setCorpActnAddtlInf(CorporateActionNarrative1 value) {
        this.corpActnAddtlInf = value;
        return this;
    }

    /**
     * Gets the value of the certfctnReqrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertfctnReqrdInd() {
        return certfctnReqrdInd;
    }

    /**
     * Sets the value of the certfctnReqrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateAction2 setCertfctnReqrdInd(Boolean value) {
        this.certfctnReqrdInd = value;
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
    public CorporateAction2 setCertfctnTp(BeneficiaryCertificationType1FormatChoice value) {
        this.certfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the cptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link EUCapitalGain2Code }
     *     
     */
    public EUCapitalGain2Code getCptlGn() {
        return cptlGn;
    }

    /**
     * Sets the value of the cptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUCapitalGain2Code }
     *     
     */
    public CorporateAction2 setCptlGn(EUCapitalGain2Code value) {
        this.cptlGn = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableIncomePerShareCalculated2Code }
     *     
     */
    public TaxableIncomePerShareCalculated2Code getTaxblIncmPerShrClctd() {
        return taxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the taxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableIncomePerShareCalculated2Code }
     *     
     */
    public CorporateAction2 setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculated2Code value) {
        this.taxblIncmPerShrClctd = value;
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
    public CorporateAction2 setNewPlcOfIncorprtn(String value) {
        this.newPlcOfIncorprtn = value;
        return this;
    }

    /**
     * Gets the value of the rnncblEntitlmntStsTp property.
     * 
     * @return
     *     possible object is
     *     {@link RenounceableStatus1FormatChoice }
     *     
     */
    public RenounceableStatus1FormatChoice getRnncblEntitlmntStsTp() {
        return rnncblEntitlmntStsTp;
    }

    /**
     * Sets the value of the rnncblEntitlmntStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenounceableStatus1FormatChoice }
     *     
     */
    public CorporateAction2 setRnncblEntitlmntStsTp(RenounceableStatus1FormatChoice value) {
        this.rnncblEntitlmntStsTp = value;
        return this;
    }

    /**
     * Gets the value of the convsTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionType1FormatChoice }
     *     
     */
    public ConversionType1FormatChoice getConvsTp() {
        return convsTp;
    }

    /**
     * Sets the value of the convsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionType1FormatChoice }
     *     
     */
    public CorporateAction2 setConvsTp(ConversionType1FormatChoice value) {
        this.convsTp = value;
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
    public CorporateAction2 setRedChrgsApldInd(Boolean value) {
        this.redChrgsApldInd = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionType1FormatChoice }
     *     
     */
    public DistributionType1FormatChoice getDstrbtnTp() {
        return dstrbtnTp;
    }

    /**
     * Sets the value of the dstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionType1FormatChoice }
     *     
     */
    public CorporateAction2 setDstrbtnTp(DistributionType1FormatChoice value) {
        this.dstrbtnTp = value;
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
     * Adds a new item to the evtStag list.
     * @see #getEvtStag()
     * 
     */
    public CorporateAction2 addEvtStag(CorporateActionEventStage1FormatChoice evtStag) {
        getEvtStag().add(evtStag);
        return this;
    }

    /**
     * Adds a new item to the chngTp list.
     * @see #getChngTp()
     * 
     */
    public CorporateAction2 addChngTp(CorporateActionChangeType1FormatChoice chngTp) {
        getChngTp().add(chngTp);
        return this;
    }

    /**
     * Adds a new item to the offerTp list.
     * @see #getOfferTp()
     * 
     */
    public CorporateAction2 addOfferTp(OfferType1FormatChoice offerTp) {
        getOfferTp().add(offerTp);
        return this;
    }

    /**
     * Adds a new item to the cpnNb list.
     * @see #getCpnNb()
     * 
     */
    public CorporateAction2 addCpnNb(String cpnNb) {
        getCpnNb().add(cpnNb);
        return this;
    }

    /**
     * Adds a new item to the pricDtls list.
     * @see #getPricDtls()
     * 
     */
    public CorporateAction2 addPricDtls(CorporateActionPrice2 pricDtls) {
        getPricDtls().add(pricDtls);
        return this;
    }

}
