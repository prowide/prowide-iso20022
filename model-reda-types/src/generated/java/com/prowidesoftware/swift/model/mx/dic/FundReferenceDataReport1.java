
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "FundReferenceDataReport1", propOrder = {
    "id",
    "vrsn",
    "gnlRefDt",
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
    "xtnsn"
})
public class FundReferenceDataReport1 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Vrsn")
    protected MarketPracticeVersion1 vrsn;
    @XmlElement(name = "GnlRefDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gnlRefDt;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification36 sctyId;
    @XmlElement(name = "FndPties")
    protected FundParties1 fndPties;
    @XmlElement(name = "MainFndOrdrDsk")
    protected OrderDesk1 mainFndOrdrDsk;
    @XmlElement(name = "FndMgmtCpny")
    protected ContactAttributes5 fndMgmtCpny;
    @XmlElement(name = "FndDtls")
    protected FinancialInstrument66 fndDtls;
    @XmlElement(name = "ValtnDealgChrtcs")
    protected ValuationDealingProcessingCharacteristics3 valtnDealgChrtcs;
    @XmlElement(name = "InvstmtRstrctns")
    protected InvestmentRestrictions3 invstmtRstrctns;
    @XmlElement(name = "SbcptPrcgChrtcs")
    protected ProcessingCharacteristics4 sbcptPrcgChrtcs;
    @XmlElement(name = "RedPrcgChrtcs")
    protected ProcessingCharacteristics5 redPrcgChrtcs;
    @XmlElement(name = "SwtchPrcgChrtcs")
    protected ProcessingCharacteristics6 swtchPrcgChrtcs;
    @XmlElement(name = "PlanChrtcs")
    protected List<InvestmentPlanCharacteristics1> planChrtcs;
    @XmlElement(name = "PmtInstrm")
    protected List<PaymentInstrument16> pmtInstrm;
    @XmlElement(name = "CshSttlmDtls")
    protected List<CashAccount202> cshSttlmDtls;
    @XmlElement(name = "LclMktAnx")
    protected List<LocalMarketAnnex3> lclMktAnx;
    @XmlElement(name = "TrgtMkt")
    protected TargetMarket1 trgtMkt;
    @XmlElement(name = "DstrbtnStrtgy")
    protected DistributionStrategy1 dstrbtnStrtgy;
    @XmlElement(name = "CostsAndChrgs")
    protected List<CostsAndCharges1> costsAndChrgs;
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
    public FundReferenceDataReport1 setId(String value) {
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
    public FundReferenceDataReport1 setVrsn(MarketPracticeVersion1 value) {
        this.vrsn = value;
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
    public FundReferenceDataReport1 setGnlRefDt(XMLGregorianCalendar value) {
        this.gnlRefDt = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification36 }
     *     
     */
    public SecurityIdentification36 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification36 }
     *     
     */
    public FundReferenceDataReport1 setSctyId(SecurityIdentification36 value) {
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
    public FundReferenceDataReport1 setFndPties(FundParties1 value) {
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
    public FundReferenceDataReport1 setMainFndOrdrDsk(OrderDesk1 value) {
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
    public FundReferenceDataReport1 setFndMgmtCpny(ContactAttributes5 value) {
        this.fndMgmtCpny = value;
        return this;
    }

    /**
     * Gets the value of the fndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument66 }
     *     
     */
    public FinancialInstrument66 getFndDtls() {
        return fndDtls;
    }

    /**
     * Sets the value of the fndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument66 }
     *     
     */
    public FundReferenceDataReport1 setFndDtls(FinancialInstrument66 value) {
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
    public FundReferenceDataReport1 setValtnDealgChrtcs(ValuationDealingProcessingCharacteristics3 value) {
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
    public FundReferenceDataReport1 setInvstmtRstrctns(InvestmentRestrictions3 value) {
        this.invstmtRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics4 }
     *     
     */
    public ProcessingCharacteristics4 getSbcptPrcgChrtcs() {
        return sbcptPrcgChrtcs;
    }

    /**
     * Sets the value of the sbcptPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics4 }
     *     
     */
    public FundReferenceDataReport1 setSbcptPrcgChrtcs(ProcessingCharacteristics4 value) {
        this.sbcptPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the redPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics5 }
     *     
     */
    public ProcessingCharacteristics5 getRedPrcgChrtcs() {
        return redPrcgChrtcs;
    }

    /**
     * Sets the value of the redPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics5 }
     *     
     */
    public FundReferenceDataReport1 setRedPrcgChrtcs(ProcessingCharacteristics5 value) {
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
    public FundReferenceDataReport1 setSwtchPrcgChrtcs(ProcessingCharacteristics6 value) {
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
     * {@link CashAccount202 }
     * 
     * 
     */
    public List<CashAccount202> getCshSttlmDtls() {
        if (cshSttlmDtls == null) {
            cshSttlmDtls = new ArrayList<CashAccount202>();
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
     * {@link LocalMarketAnnex3 }
     * 
     * 
     */
    public List<LocalMarketAnnex3> getLclMktAnx() {
        if (lclMktAnx == null) {
            lclMktAnx = new ArrayList<LocalMarketAnnex3>();
        }
        return this.lclMktAnx;
    }

    /**
     * Gets the value of the trgtMkt property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1 }
     *     
     */
    public TargetMarket1 getTrgtMkt() {
        return trgtMkt;
    }

    /**
     * Sets the value of the trgtMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1 }
     *     
     */
    public FundReferenceDataReport1 setTrgtMkt(TargetMarket1 value) {
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
    public FundReferenceDataReport1 setDstrbtnStrtgy(DistributionStrategy1 value) {
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
     * {@link CostsAndCharges1 }
     * 
     * 
     */
    public List<CostsAndCharges1> getCostsAndChrgs() {
        if (costsAndChrgs == null) {
            costsAndChrgs = new ArrayList<CostsAndCharges1>();
        }
        return this.costsAndChrgs;
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
    public FundReferenceDataReport1 addPlanChrtcs(InvestmentPlanCharacteristics1 planChrtcs) {
        getPlanChrtcs().add(planChrtcs);
        return this;
    }

    /**
     * Adds a new item to the pmtInstrm list.
     * @see #getPmtInstrm()
     * 
     */
    public FundReferenceDataReport1 addPmtInstrm(PaymentInstrument16 pmtInstrm) {
        getPmtInstrm().add(pmtInstrm);
        return this;
    }

    /**
     * Adds a new item to the cshSttlmDtls list.
     * @see #getCshSttlmDtls()
     * 
     */
    public FundReferenceDataReport1 addCshSttlmDtls(CashAccount202 cshSttlmDtls) {
        getCshSttlmDtls().add(cshSttlmDtls);
        return this;
    }

    /**
     * Adds a new item to the lclMktAnx list.
     * @see #getLclMktAnx()
     * 
     */
    public FundReferenceDataReport1 addLclMktAnx(LocalMarketAnnex3 lclMktAnx) {
        getLclMktAnx().add(lclMktAnx);
        return this;
    }

    /**
     * Adds a new item to the costsAndChrgs list.
     * @see #getCostsAndChrgs()
     * 
     */
    public FundReferenceDataReport1 addCostsAndChrgs(CostsAndCharges1 costsAndChrgs) {
        getCostsAndChrgs().add(costsAndChrgs);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public FundReferenceDataReport1 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
