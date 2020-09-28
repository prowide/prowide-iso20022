
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
 * Scope
 * The CorporateActionNotification message is sent by an account servicer to an account owner or its designated agent to notify details of a corporate action event and optionally account information, eligible balance and entitlements.
 * It may also include possible elections or choices available to the account owner. The account servicer can initially send the CorporateActionNotification message as a preliminary advice, subsequently replaced by another CorporateActionNotification message with complete or confirmed information.
 * It may also be sent to an account owner or its designated agent, to remind of event details and/or of missing or incomplete instructions for a corporate action event.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate), using the relevant elements in the business application header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNotification002V10", propOrder = {
    "pgntn",
    "ntfctnGnlInf",
    "prvsNtfctnId",
    "instrId",
    "othrDocId",
    "evtsLkg",
    "corpActnGnlInf",
    "acctDtls",
    "intrmdtScty",
    "corpActnDtls",
    "corpActnOptnDtls",
    "addtlInf",
    "issrAgt",
    "pngAgt",
    "subPngAgt",
    "regar",
    "rsellngAgt",
    "physSctiesAgt",
    "drpAgt",
    "slctnAgt",
    "infAgt",
    "issr",
    "offerr",
    "trfAgt",
    "splmtryData"
})
public class CorporateActionNotification002V10 {

    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "NtfctnGnlInf", required = true)
    protected CorporateActionNotification6 ntfctnGnlInf;
    @XmlElement(name = "PrvsNtfctnId")
    protected DocumentIdentification37 prvsNtfctnId;
    @XmlElement(name = "InstrId")
    protected DocumentIdentification17 instrId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification38> othrDocId;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionEventReference4> evtsLkg;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation153 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification45Choice acctDtls;
    @XmlElement(name = "IntrmdtScty")
    protected FinancialInstrumentAttributes94 intrmdtScty;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction55 corpActnDtls;
    @XmlElement(name = "CorpActnOptnDtls")
    protected List<CorporateActionOption176> corpActnOptnDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative43 addtlInf;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification151Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification137Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification137Choice> subPngAgt;
    @XmlElement(name = "Regar")
    protected PartyIdentification137Choice regar;
    @XmlElement(name = "RsellngAgt")
    protected List<PartyIdentification137Choice> rsellngAgt;
    @XmlElement(name = "PhysSctiesAgt")
    protected PartyIdentification137Choice physSctiesAgt;
    @XmlElement(name = "DrpAgt")
    protected PartyIdentification137Choice drpAgt;
    @XmlElement(name = "SlctnAgt")
    protected List<PartyIdentification137Choice> slctnAgt;
    @XmlElement(name = "InfAgt")
    protected PartyIdentification137Choice infAgt;
    @XmlElement(name = "Issr")
    protected PartyIdentification151Choice issr;
    @XmlElement(name = "Offerr")
    protected List<PartyIdentification151Choice> offerr;
    @XmlElement(name = "TrfAgt")
    protected PartyIdentification151Choice trfAgt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public CorporateActionNotification002V10 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotification6 }
     *     
     */
    public CorporateActionNotification6 getNtfctnGnlInf() {
        return ntfctnGnlInf;
    }

    /**
     * Sets the value of the ntfctnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotification6 }
     *     
     */
    public CorporateActionNotification002V10 setNtfctnGnlInf(CorporateActionNotification6 value) {
        this.ntfctnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the prvsNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public DocumentIdentification37 getPrvsNtfctnId() {
        return prvsNtfctnId;
    }

    /**
     * Sets the value of the prvsNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public CorporateActionNotification002V10 setPrvsNtfctnId(DocumentIdentification37 value) {
        this.prvsNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification17 }
     *     
     */
    public DocumentIdentification17 getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification17 }
     *     
     */
    public CorporateActionNotification002V10 setInstrId(DocumentIdentification17 value) {
        this.instrId = value;
        return this;
    }

    /**
     * Gets the value of the othrDocId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrDocId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrDocId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification38 }
     * 
     * 
     */
    public List<DocumentIdentification38> getOthrDocId() {
        if (othrDocId == null) {
            othrDocId = new ArrayList<DocumentIdentification38>();
        }
        return this.othrDocId;
    }

    /**
     * Gets the value of the evtsLkg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtsLkg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtsLkg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionEventReference4 }
     * 
     * 
     */
    public List<CorporateActionEventReference4> getEvtsLkg() {
        if (evtsLkg == null) {
            evtsLkg = new ArrayList<CorporateActionEventReference4>();
        }
        return this.evtsLkg;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation153 }
     *     
     */
    public CorporateActionGeneralInformation153 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation153 }
     *     
     */
    public CorporateActionNotification002V10 setCorpActnGnlInf(CorporateActionGeneralInformation153 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification45Choice }
     *     
     */
    public AccountIdentification45Choice getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification45Choice }
     *     
     */
    public CorporateActionNotification002V10 setAcctDtls(AccountIdentification45Choice value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the intrmdtScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes94 }
     *     
     */
    public FinancialInstrumentAttributes94 getIntrmdtScty() {
        return intrmdtScty;
    }

    /**
     * Sets the value of the intrmdtScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes94 }
     *     
     */
    public CorporateActionNotification002V10 setIntrmdtScty(FinancialInstrumentAttributes94 value) {
        this.intrmdtScty = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction55 }
     *     
     */
    public CorporateAction55 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction55 }
     *     
     */
    public CorporateActionNotification002V10 setCorpActnDtls(CorporateAction55 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnOptnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpActnOptnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnOptnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionOption176 }
     * 
     * 
     */
    public List<CorporateActionOption176> getCorpActnOptnDtls() {
        if (corpActnOptnDtls == null) {
            corpActnOptnDtls = new ArrayList<CorporateActionOption176>();
        }
        return this.corpActnOptnDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative43 }
     *     
     */
    public CorporateActionNarrative43 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative43 }
     *     
     */
    public CorporateActionNotification002V10 setAddtlInf(CorporateActionNarrative43 value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the issrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issrAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssrAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification151Choice }
     * 
     * 
     */
    public List<PartyIdentification151Choice> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<PartyIdentification151Choice>();
        }
        return this.issrAgt;
    }

    /**
     * Gets the value of the pngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     */
    public List<PartyIdentification137Choice> getPngAgt() {
        if (pngAgt == null) {
            pngAgt = new ArrayList<PartyIdentification137Choice>();
        }
        return this.pngAgt;
    }

    /**
     * Gets the value of the subPngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     */
    public List<PartyIdentification137Choice> getSubPngAgt() {
        if (subPngAgt == null) {
            subPngAgt = new ArrayList<PartyIdentification137Choice>();
        }
        return this.subPngAgt;
    }

    /**
     * Gets the value of the regar property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getRegar() {
        return regar;
    }

    /**
     * Sets the value of the regar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public CorporateActionNotification002V10 setRegar(PartyIdentification137Choice value) {
        this.regar = value;
        return this;
    }

    /**
     * Gets the value of the rsellngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsellngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsellngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     */
    public List<PartyIdentification137Choice> getRsellngAgt() {
        if (rsellngAgt == null) {
            rsellngAgt = new ArrayList<PartyIdentification137Choice>();
        }
        return this.rsellngAgt;
    }

    /**
     * Gets the value of the physSctiesAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getPhysSctiesAgt() {
        return physSctiesAgt;
    }

    /**
     * Sets the value of the physSctiesAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public CorporateActionNotification002V10 setPhysSctiesAgt(PartyIdentification137Choice value) {
        this.physSctiesAgt = value;
        return this;
    }

    /**
     * Gets the value of the drpAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getDrpAgt() {
        return drpAgt;
    }

    /**
     * Sets the value of the drpAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public CorporateActionNotification002V10 setDrpAgt(PartyIdentification137Choice value) {
        this.drpAgt = value;
        return this;
    }

    /**
     * Gets the value of the slctnAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slctnAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlctnAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     */
    public List<PartyIdentification137Choice> getSlctnAgt() {
        if (slctnAgt == null) {
            slctnAgt = new ArrayList<PartyIdentification137Choice>();
        }
        return this.slctnAgt;
    }

    /**
     * Gets the value of the infAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getInfAgt() {
        return infAgt;
    }

    /**
     * Sets the value of the infAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public CorporateActionNotification002V10 setInfAgt(PartyIdentification137Choice value) {
        this.infAgt = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification151Choice }
     *     
     */
    public PartyIdentification151Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification151Choice }
     *     
     */
    public CorporateActionNotification002V10 setIssr(PartyIdentification151Choice value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the offerr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification151Choice }
     * 
     * 
     */
    public List<PartyIdentification151Choice> getOfferr() {
        if (offerr == null) {
            offerr = new ArrayList<PartyIdentification151Choice>();
        }
        return this.offerr;
    }

    /**
     * Gets the value of the trfAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification151Choice }
     *     
     */
    public PartyIdentification151Choice getTrfAgt() {
        return trfAgt;
    }

    /**
     * Sets the value of the trfAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification151Choice }
     *     
     */
    public CorporateActionNotification002V10 setTrfAgt(PartyIdentification151Choice value) {
        this.trfAgt = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the othrDocId list.
     * @see #getOthrDocId()
     * 
     */
    public CorporateActionNotification002V10 addOthrDocId(DocumentIdentification38 othrDocId) {
        getOthrDocId().add(othrDocId);
        return this;
    }

    /**
     * Adds a new item to the evtsLkg list.
     * @see #getEvtsLkg()
     * 
     */
    public CorporateActionNotification002V10 addEvtsLkg(CorporateActionEventReference4 evtsLkg) {
        getEvtsLkg().add(evtsLkg);
        return this;
    }

    /**
     * Adds a new item to the corpActnOptnDtls list.
     * @see #getCorpActnOptnDtls()
     * 
     */
    public CorporateActionNotification002V10 addCorpActnOptnDtls(CorporateActionOption176 corpActnOptnDtls) {
        getCorpActnOptnDtls().add(corpActnOptnDtls);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public CorporateActionNotification002V10 addIssrAgt(PartyIdentification151Choice issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the pngAgt list.
     * @see #getPngAgt()
     * 
     */
    public CorporateActionNotification002V10 addPngAgt(PartyIdentification137Choice pngAgt) {
        getPngAgt().add(pngAgt);
        return this;
    }

    /**
     * Adds a new item to the subPngAgt list.
     * @see #getSubPngAgt()
     * 
     */
    public CorporateActionNotification002V10 addSubPngAgt(PartyIdentification137Choice subPngAgt) {
        getSubPngAgt().add(subPngAgt);
        return this;
    }

    /**
     * Adds a new item to the rsellngAgt list.
     * @see #getRsellngAgt()
     * 
     */
    public CorporateActionNotification002V10 addRsellngAgt(PartyIdentification137Choice rsellngAgt) {
        getRsellngAgt().add(rsellngAgt);
        return this;
    }

    /**
     * Adds a new item to the slctnAgt list.
     * @see #getSlctnAgt()
     * 
     */
    public CorporateActionNotification002V10 addSlctnAgt(PartyIdentification137Choice slctnAgt) {
        getSlctnAgt().add(slctnAgt);
        return this;
    }

    /**
     * Adds a new item to the offerr list.
     * @see #getOfferr()
     * 
     */
    public CorporateActionNotification002V10 addOfferr(PartyIdentification151Choice offerr) {
        getOfferr().add(offerr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CorporateActionNotification002V10 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
