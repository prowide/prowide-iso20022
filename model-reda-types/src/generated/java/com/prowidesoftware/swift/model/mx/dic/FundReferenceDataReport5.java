
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "FundReferenceDataReport5", propOrder = {
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
    "addtlInfUKMkt",
    "valForMny",
    "xtnsn"
})
public class FundReferenceDataReport5 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Vrsn")
    protected MarketPracticeVersion1 vrsn;
    @XmlElement(name = "AuthrsdPrxy")
    protected ContactAttributes6 authrsdPrxy;
    @XmlElement(name = "GnlRefDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gnlRefDt;
    @XmlElement(name = "TrgtMktInd")
    protected Boolean trgtMktInd;
    @XmlElement(name = "ExAnteInd")
    protected Boolean exAnteInd;
    @XmlElement(name = "ExPstInd")
    protected Boolean exPstInd;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification47 sctyId;
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
    protected ProcessingCharacteristics11 sbcptPrcgChrtcs;
    @XmlElement(name = "RedPrcgChrtcs")
    protected ProcessingCharacteristics12 redPrcgChrtcs;
    @XmlElement(name = "SwtchPrcgChrtcs")
    protected ProcessingCharacteristics9 swtchPrcgChrtcs;
    @XmlElement(name = "PlanChrtcs")
    protected List<InvestmentPlanCharacteristics1> planChrtcs;
    @XmlElement(name = "PmtInstrm")
    protected List<PaymentInstrument16> pmtInstrm;
    @XmlElement(name = "CshSttlmDtls")
    protected List<CashAccount205> cshSttlmDtls;
    @XmlElement(name = "LclMktAnx")
    protected List<LocalMarketAnnex6> lclMktAnx;
    @XmlElement(name = "TrgtMkt")
    protected TargetMarket4 trgtMkt;
    @XmlElement(name = "DstrbtnStrtgy")
    protected DistributionStrategy1 dstrbtnStrtgy;
    @XmlElement(name = "CostsAndChrgs")
    protected List<CostsAndCharges2> costsAndChrgs;
    @XmlElement(name = "AddtlInfUKMkt")
    protected AdditionalProductInformation3 addtlInfUKMkt;
    @XmlElement(name = "ValForMny")
    protected ValueForMoney1 valForMny;
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
    public FundReferenceDataReport5 setId(String value) {
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
    public FundReferenceDataReport5 setVrsn(MarketPracticeVersion1 value) {
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
    public FundReferenceDataReport5 setAuthrsdPrxy(ContactAttributes6 value) {
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
    public XMLGregorianCalendar getGnlRefDt() {
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
    public FundReferenceDataReport5 setGnlRefDt(XMLGregorianCalendar value) {
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
    public FundReferenceDataReport5 setTrgtMktInd(Boolean value) {
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
    public FundReferenceDataReport5 setExAnteInd(Boolean value) {
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
    public FundReferenceDataReport5 setExPstInd(Boolean value) {
        this.exPstInd = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification47 }
     *     
     */
    public SecurityIdentification47 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification47 }
     *     
     */
    public FundReferenceDataReport5 setSctyId(SecurityIdentification47 value) {
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
    public FundReferenceDataReport5 setFndPties(FundParties1 value) {
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
    public FundReferenceDataReport5 setMainFndOrdrDsk(OrderDesk1 value) {
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
    public FundReferenceDataReport5 setFndMgmtCpny(ContactAttributes5 value) {
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
    public FundReferenceDataReport5 setFndDtls(FinancialInstrument96 value) {
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
    public FundReferenceDataReport5 setValtnDealgChrtcs(ValuationDealingProcessingCharacteristics3 value) {
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
    public FundReferenceDataReport5 setInvstmtRstrctns(InvestmentRestrictions3 value) {
        this.invstmtRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics11 }
     *     
     */
    public ProcessingCharacteristics11 getSbcptPrcgChrtcs() {
        return sbcptPrcgChrtcs;
    }

    /**
     * Sets the value of the sbcptPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics11 }
     *     
     */
    public FundReferenceDataReport5 setSbcptPrcgChrtcs(ProcessingCharacteristics11 value) {
        this.sbcptPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the redPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics12 }
     *     
     */
    public ProcessingCharacteristics12 getRedPrcgChrtcs() {
        return redPrcgChrtcs;
    }

    /**
     * Sets the value of the redPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics12 }
     *     
     */
    public FundReferenceDataReport5 setRedPrcgChrtcs(ProcessingCharacteristics12 value) {
        this.redPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the swtchPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics9 }
     *     
     */
    public ProcessingCharacteristics9 getSwtchPrcgChrtcs() {
        return swtchPrcgChrtcs;
    }

    /**
     * Sets the value of the swtchPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics9 }
     *     
     */
    public FundReferenceDataReport5 setSwtchPrcgChrtcs(ProcessingCharacteristics9 value) {
        this.swtchPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the planChrtcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planChrtcs property.
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
     */
    public List<InvestmentPlanCharacteristics1> getPlanChrtcs() {
        if (planChrtcs == null) {
            planChrtcs = new ArrayList<InvestmentPlanCharacteristics1>();
        }
        return this.planChrtcs;
    }

    /**
     * Gets the value of the pmtInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInstrm property.
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
     */
    public List<PaymentInstrument16> getPmtInstrm() {
        if (pmtInstrm == null) {
            pmtInstrm = new ArrayList<PaymentInstrument16>();
        }
        return this.pmtInstrm;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshSttlmDtls property.
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
     */
    public List<CashAccount205> getCshSttlmDtls() {
        if (cshSttlmDtls == null) {
            cshSttlmDtls = new ArrayList<CashAccount205>();
        }
        return this.cshSttlmDtls;
    }

    /**
     * Gets the value of the lclMktAnx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lclMktAnx property.
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
     * {@link LocalMarketAnnex6 }
     * 
     * 
     */
    public List<LocalMarketAnnex6> getLclMktAnx() {
        if (lclMktAnx == null) {
            lclMktAnx = new ArrayList<LocalMarketAnnex6>();
        }
        return this.lclMktAnx;
    }

    /**
     * Gets the value of the trgtMkt property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket4 }
     *     
     */
    public TargetMarket4 getTrgtMkt() {
        return trgtMkt;
    }

    /**
     * Sets the value of the trgtMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket4 }
     *     
     */
    public FundReferenceDataReport5 setTrgtMkt(TargetMarket4 value) {
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
    public FundReferenceDataReport5 setDstrbtnStrtgy(DistributionStrategy1 value) {
        this.dstrbtnStrtgy = value;
        return this;
    }

    /**
     * Gets the value of the costsAndChrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costsAndChrgs property.
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
     */
    public List<CostsAndCharges2> getCostsAndChrgs() {
        if (costsAndChrgs == null) {
            costsAndChrgs = new ArrayList<CostsAndCharges2>();
        }
        return this.costsAndChrgs;
    }

    /**
     * Gets the value of the addtlInfUKMkt property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductInformation3 }
     *     
     */
    public AdditionalProductInformation3 getAddtlInfUKMkt() {
        return addtlInfUKMkt;
    }

    /**
     * Sets the value of the addtlInfUKMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductInformation3 }
     *     
     */
    public FundReferenceDataReport5 setAddtlInfUKMkt(AdditionalProductInformation3 value) {
        this.addtlInfUKMkt = value;
        return this;
    }

    /**
     * Gets the value of the valForMny property.
     * 
     * @return
     *     possible object is
     *     {@link ValueForMoney1 }
     *     
     */
    public ValueForMoney1 getValForMny() {
        return valForMny;
    }

    /**
     * Sets the value of the valForMny property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueForMoney1 }
     *     
     */
    public FundReferenceDataReport5 setValForMny(ValueForMoney1 value) {
        this.valForMny = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
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
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
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
    public FundReferenceDataReport5 addPlanChrtcs(InvestmentPlanCharacteristics1 planChrtcs) {
        getPlanChrtcs().add(planChrtcs);
        return this;
    }

    /**
     * Adds a new item to the pmtInstrm list.
     * @see #getPmtInstrm()
     * 
     */
    public FundReferenceDataReport5 addPmtInstrm(PaymentInstrument16 pmtInstrm) {
        getPmtInstrm().add(pmtInstrm);
        return this;
    }

    /**
     * Adds a new item to the cshSttlmDtls list.
     * @see #getCshSttlmDtls()
     * 
     */
    public FundReferenceDataReport5 addCshSttlmDtls(CashAccount205 cshSttlmDtls) {
        getCshSttlmDtls().add(cshSttlmDtls);
        return this;
    }

    /**
     * Adds a new item to the lclMktAnx list.
     * @see #getLclMktAnx()
     * 
     */
    public FundReferenceDataReport5 addLclMktAnx(LocalMarketAnnex6 lclMktAnx) {
        getLclMktAnx().add(lclMktAnx);
        return this;
    }

    /**
     * Adds a new item to the costsAndChrgs list.
     * @see #getCostsAndChrgs()
     * 
     */
    public FundReferenceDataReport5 addCostsAndChrgs(CostsAndCharges2 costsAndChrgs) {
        getCostsAndChrgs().add(costsAndChrgs);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public FundReferenceDataReport5 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
