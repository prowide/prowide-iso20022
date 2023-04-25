
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Fund reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundReferenceDataReport4", propOrder = {
    "id",
    "vrsn",
    "authrsdPrxy",
    "gnlRefDt",
    "trgtMktInd",
    "exAnteInd",
    "exPstInd",
    "sctyId",
    "fndPties",
    "mainFndOrdrDsk",
    "fndMgmtCpny",
    "fndDtls",
    "valtnDealgChrtcs",
    "invstmtRstrctns",
    "sbcptPrcgChrtcs",
    "redPrcgChrtcs",
    "swtchPrcgChrtcs",
    "planChrtcs",
    "pmtInstrm",
    "cshSttlmDtls",
    "lclMktAnx",
    "trgtMkt",
    "dstrbtnStrtgy",
    "costsAndChrgs",
    "addtlPdctInfGrmnMkt",
    "addtlPdctInfFrnchMkt",
    "xtnsn"
})
public class FundReferenceDataReport4 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Vrsn")
    protected MarketPracticeVersion1 vrsn;
    @XmlElement(name = "AuthrsdPrxy")
    protected ContactAttributes6 authrsdPrxy;
    @XmlElement(name = "GnlRefDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar gnlRefDt;
    @XmlElement(name = "TrgtMktInd")
    protected Boolean trgtMktInd;
    @XmlElement(name = "ExAnteInd")
    protected Boolean exAnteInd;
    @XmlElement(name = "ExPstInd")
    protected Boolean exPstInd;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification41 sctyId;
    @XmlElement(name = "FndPties")
    protected FundParties1 fndPties;
    @XmlElement(name = "MainFndOrdrDsk")
    protected OrderDesk1 mainFndOrdrDsk;
    @XmlElement(name = "FndMgmtCpny")
    protected ContactAttributes5 fndMgmtCpny;
    @XmlElement(name = "FndDtls")
    protected FinancialInstrument96 fndDtls;
    @XmlElement(name = "ValtnDealgChrtcs")
    protected ValuationDealingProcessingCharacteristics3 valtnDealgChrtcs;
    @XmlElement(name = "InvstmtRstrctns")
    protected InvestmentRestrictions3 invstmtRstrctns;
    @XmlElement(name = "SbcptPrcgChrtcs")
    protected ProcessingCharacteristics8 sbcptPrcgChrtcs;
    @XmlElement(name = "RedPrcgChrtcs")
    protected ProcessingCharacteristics7 redPrcgChrtcs;
    @XmlElement(name = "SwtchPrcgChrtcs")
    protected ProcessingCharacteristics6 swtchPrcgChrtcs;
    @XmlElement(name = "PlanChrtcs")
    protected List<InvestmentPlanCharacteristics1> planChrtcs;
    @XmlElement(name = "PmtInstrm")
    protected List<PaymentInstrument16> pmtInstrm;
    @XmlElement(name = "CshSttlmDtls")
    protected List<CashAccount205> cshSttlmDtls;
    @XmlElement(name = "LclMktAnx")
    protected List<LocalMarketAnnex5> lclMktAnx;
    @XmlElement(name = "TrgtMkt")
    protected TargetMarket3 trgtMkt;
    @XmlElement(name = "DstrbtnStrtgy")
    protected DistributionStrategy1 dstrbtnStrtgy;
    @XmlElement(name = "CostsAndChrgs")
    protected List<CostsAndCharges2> costsAndChrgs;
    @XmlElement(name = "AddtlPdctInfGrmnMkt")
    protected AdditionalProductInformation1 addtlPdctInfGrmnMkt;
    @XmlElement(name = "AddtlPdctInfFrnchMkt")
    protected AdditionalProductInformation2 addtlPdctInfFrnchMkt;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundReferenceDataReport4 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public MarketPracticeVersion1 getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public FundReferenceDataReport4 setVrsn(MarketPracticeVersion1 value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the authrsdPrxy property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes6 }
     *     
     */
    public ContactAttributes6 getAuthrsdPrxy() {
        return authrsdPrxy;
    }

    /**
     * Sets the value of the authrsdPrxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes6 }
     *     
     */
    public FundReferenceDataReport4 setAuthrsdPrxy(ContactAttributes6 value) {
        this.authrsdPrxy = value;
        return this;
    }

    /**
     * Gets the value of the gnlRefDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getGnlRefDt() {
        return gnlRefDt;
    }

    /**
     * Sets the value of the gnlRefDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundReferenceDataReport4 setGnlRefDt(Calendar value) {
        this.gnlRefDt = value;
        return this;
    }

    /**
     * Gets the value of the trgtMktInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrgtMktInd() {
        return trgtMktInd;
    }

    /**
     * Sets the value of the trgtMktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FundReferenceDataReport4 setTrgtMktInd(Boolean value) {
        this.trgtMktInd = value;
        return this;
    }

    /**
     * Gets the value of the exAnteInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExAnteInd() {
        return exAnteInd;
    }

    /**
     * Sets the value of the exAnteInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FundReferenceDataReport4 setExAnteInd(Boolean value) {
        this.exAnteInd = value;
        return this;
    }

    /**
     * Gets the value of the exPstInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExPstInd() {
        return exPstInd;
    }

    /**
     * Sets the value of the exPstInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FundReferenceDataReport4 setExPstInd(Boolean value) {
        this.exPstInd = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification41 }
     *     
     */
    public SecurityIdentification41 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification41 }
     *     
     */
    public FundReferenceDataReport4 setSctyId(SecurityIdentification41 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the fndPties property.
     * 
     * @return
     *     possible object is
     *     {@link FundParties1 }
     *     
     */
    public FundParties1 getFndPties() {
        return fndPties;
    }

    /**
     * Sets the value of the fndPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundParties1 }
     *     
     */
    public FundReferenceDataReport4 setFndPties(FundParties1 value) {
        this.fndPties = value;
        return this;
    }

    /**
     * Gets the value of the mainFndOrdrDsk property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDesk1 }
     *     
     */
    public OrderDesk1 getMainFndOrdrDsk() {
        return mainFndOrdrDsk;
    }

    /**
     * Sets the value of the mainFndOrdrDsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDesk1 }
     *     
     */
    public FundReferenceDataReport4 setMainFndOrdrDsk(OrderDesk1 value) {
        this.mainFndOrdrDsk = value;
        return this;
    }

    /**
     * Gets the value of the fndMgmtCpny property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getFndMgmtCpny() {
        return fndMgmtCpny;
    }

    /**
     * Sets the value of the fndMgmtCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public FundReferenceDataReport4 setFndMgmtCpny(ContactAttributes5 value) {
        this.fndMgmtCpny = value;
        return this;
    }

    /**
     * Gets the value of the fndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument96 }
     *     
     */
    public FinancialInstrument96 getFndDtls() {
        return fndDtls;
    }

    /**
     * Sets the value of the fndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument96 }
     *     
     */
    public FundReferenceDataReport4 setFndDtls(FinancialInstrument96 value) {
        this.fndDtls = value;
        return this;
    }

    /**
     * Gets the value of the valtnDealgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationDealingProcessingCharacteristics3 }
     *     
     */
    public ValuationDealingProcessingCharacteristics3 getValtnDealgChrtcs() {
        return valtnDealgChrtcs;
    }

    /**
     * Sets the value of the valtnDealgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationDealingProcessingCharacteristics3 }
     *     
     */
    public FundReferenceDataReport4 setValtnDealgChrtcs(ValuationDealingProcessingCharacteristics3 value) {
        this.valtnDealgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the invstmtRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentRestrictions3 }
     *     
     */
    public InvestmentRestrictions3 getInvstmtRstrctns() {
        return invstmtRstrctns;
    }

    /**
     * Sets the value of the invstmtRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentRestrictions3 }
     *     
     */
    public FundReferenceDataReport4 setInvstmtRstrctns(InvestmentRestrictions3 value) {
        this.invstmtRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics8 }
     *     
     */
    public ProcessingCharacteristics8 getSbcptPrcgChrtcs() {
        return sbcptPrcgChrtcs;
    }

    /**
     * Sets the value of the sbcptPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics8 }
     *     
     */
    public FundReferenceDataReport4 setSbcptPrcgChrtcs(ProcessingCharacteristics8 value) {
        this.sbcptPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the redPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics7 }
     *     
     */
    public ProcessingCharacteristics7 getRedPrcgChrtcs() {
        return redPrcgChrtcs;
    }

    /**
     * Sets the value of the redPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics7 }
     *     
     */
    public FundReferenceDataReport4 setRedPrcgChrtcs(ProcessingCharacteristics7 value) {
        this.redPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the swtchPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics6 }
     *     
     */
    public ProcessingCharacteristics6 getSwtchPrcgChrtcs() {
        return swtchPrcgChrtcs;
    }

    /**
     * Sets the value of the swtchPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics6 }
     *     
     */
    public FundReferenceDataReport4 setSwtchPrcgChrtcs(ProcessingCharacteristics6 value) {
        this.swtchPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the planChrtcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the planChrtcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanChrtcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentPlanCharacteristics1 }
     * 
     * 
     * @return
     *     The value of the planChrtcs property.
     */
    public List<InvestmentPlanCharacteristics1> getPlanChrtcs() {
        if (planChrtcs == null) {
            planChrtcs = new ArrayList<>();
        }
        return this.planChrtcs;
    }

    /**
     * Gets the value of the pmtInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstrument16 }
     * 
     * 
     * @return
     *     The value of the pmtInstrm property.
     */
    public List<PaymentInstrument16> getPmtInstrm() {
        if (pmtInstrm == null) {
            pmtInstrm = new ArrayList<>();
        }
        return this.pmtInstrm;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshSttlmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshSttlmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount205 }
     * 
     * 
     * @return
     *     The value of the cshSttlmDtls property.
     */
    public List<CashAccount205> getCshSttlmDtls() {
        if (cshSttlmDtls == null) {
            cshSttlmDtls = new ArrayList<>();
        }
        return this.cshSttlmDtls;
    }

    /**
     * Gets the value of the lclMktAnx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lclMktAnx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclMktAnx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalMarketAnnex5 }
     * 
     * 
     * @return
     *     The value of the lclMktAnx property.
     */
    public List<LocalMarketAnnex5> getLclMktAnx() {
        if (lclMktAnx == null) {
            lclMktAnx = new ArrayList<>();
        }
        return this.lclMktAnx;
    }

    /**
     * Gets the value of the trgtMkt property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket3 }
     *     
     */
    public TargetMarket3 getTrgtMkt() {
        return trgtMkt;
    }

    /**
     * Sets the value of the trgtMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket3 }
     *     
     */
    public FundReferenceDataReport4 setTrgtMkt(TargetMarket3 value) {
        this.trgtMkt = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtnStrtgy property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionStrategy1 }
     *     
     */
    public DistributionStrategy1 getDstrbtnStrtgy() {
        return dstrbtnStrtgy;
    }

    /**
     * Sets the value of the dstrbtnStrtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionStrategy1 }
     *     
     */
    public FundReferenceDataReport4 setDstrbtnStrtgy(DistributionStrategy1 value) {
        this.dstrbtnStrtgy = value;
        return this;
    }

    /**
     * Gets the value of the costsAndChrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the costsAndChrgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostsAndChrgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CostsAndCharges2 }
     * 
     * 
     * @return
     *     The value of the costsAndChrgs property.
     */
    public List<CostsAndCharges2> getCostsAndChrgs() {
        if (costsAndChrgs == null) {
            costsAndChrgs = new ArrayList<>();
        }
        return this.costsAndChrgs;
    }

    /**
     * Gets the value of the addtlPdctInfGrmnMkt property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductInformation1 }
     *     
     */
    public AdditionalProductInformation1 getAddtlPdctInfGrmnMkt() {
        return addtlPdctInfGrmnMkt;
    }

    /**
     * Sets the value of the addtlPdctInfGrmnMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductInformation1 }
     *     
     */
    public FundReferenceDataReport4 setAddtlPdctInfGrmnMkt(AdditionalProductInformation1 value) {
        this.addtlPdctInfGrmnMkt = value;
        return this;
    }

    /**
     * Gets the value of the addtlPdctInfFrnchMkt property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductInformation2 }
     *     
     */
    public AdditionalProductInformation2 getAddtlPdctInfFrnchMkt() {
        return addtlPdctInfFrnchMkt;
    }

    /**
     * Sets the value of the addtlPdctInfFrnchMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductInformation2 }
     *     
     */
    public FundReferenceDataReport4 setAddtlPdctInfFrnchMkt(AdditionalProductInformation2 value) {
        this.addtlPdctInfFrnchMkt = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
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
     * Adds a new item to the planChrtcs list.
     * @see #getPlanChrtcs()
     * 
     */
    public FundReferenceDataReport4 addPlanChrtcs(InvestmentPlanCharacteristics1 planChrtcs) {
        getPlanChrtcs().add(planChrtcs);
        return this;
    }

    /**
     * Adds a new item to the pmtInstrm list.
     * @see #getPmtInstrm()
     * 
     */
    public FundReferenceDataReport4 addPmtInstrm(PaymentInstrument16 pmtInstrm) {
        getPmtInstrm().add(pmtInstrm);
        return this;
    }

    /**
     * Adds a new item to the cshSttlmDtls list.
     * @see #getCshSttlmDtls()
     * 
     */
    public FundReferenceDataReport4 addCshSttlmDtls(CashAccount205 cshSttlmDtls) {
        getCshSttlmDtls().add(cshSttlmDtls);
        return this;
    }

    /**
     * Adds a new item to the lclMktAnx list.
     * @see #getLclMktAnx()
     * 
     */
    public FundReferenceDataReport4 addLclMktAnx(LocalMarketAnnex5 lclMktAnx) {
        getLclMktAnx().add(lclMktAnx);
        return this;
    }

    /**
     * Adds a new item to the costsAndChrgs list.
     * @see #getCostsAndChrgs()
     * 
     */
    public FundReferenceDataReport4 addCostsAndChrgs(CostsAndCharges2 costsAndChrgs) {
        getCostsAndChrgs().add(costsAndChrgs);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public FundReferenceDataReport4 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
