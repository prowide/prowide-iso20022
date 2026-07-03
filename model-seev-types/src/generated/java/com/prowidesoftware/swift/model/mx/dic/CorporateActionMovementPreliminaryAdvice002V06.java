
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
 * An account servicer sends the CorporateActionMovementPreliminaryAdvice message to an account owner or its designated agent to pre-advise upcoming posting or reversal of securities and/or cash postings.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),
 * using the relevant elements in the business application header (BAH).
 * ISO 15022 - 20022 COEXISTENCE
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementPreliminaryAdvice002V06", propOrder = {
    "pgntn",
    "mvmntPrlimryAdvcGnlInf",
    "prvsMvmntPrlimryAdvcId",
    "ntfctnId",
    "mvmntConfId",
    "instrId",
    "othrDocId",
    "evtsLkg",
    "rvslRsn",
    "corpActnGnlInf",
    "acctDtls",
    "corpActnDtls",
    "corpActnMvmntDtls",
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
    "splmtryData"
})
public class CorporateActionMovementPreliminaryAdvice002V06 {

    @XmlElement(name = "Pgntn")
    protected Pagination pgntn;
    @XmlElement(name = "MvmntPrlimryAdvcGnlInf", required = true)
    protected CorporateActionPreliminaryAdviceType2 mvmntPrlimryAdvcGnlInf;
    @XmlElement(name = "PrvsMvmntPrlimryAdvcId")
    protected DocumentIdentification19 prvsMvmntPrlimryAdvcId;
    @XmlElement(name = "NtfctnId")
    protected DocumentIdentification19 ntfctnId;
    @XmlElement(name = "MvmntConfId")
    protected DocumentIdentification19 mvmntConfId;
    @XmlElement(name = "InstrId")
    protected DocumentIdentification17 instrId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification20> othrDocId;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionEventReference2> evtsLkg;
    @XmlElement(name = "RvslRsn")
    protected CorporateActionReversalReason2 rvslRsn;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation78 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification26Choice acctDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction28 corpActnDtls;
    @XmlElement(name = "CorpActnMvmntDtls")
    protected List<CorporateActionOption108> corpActnMvmntDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative16 addtlInf;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification87Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification87Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification87Choice> subPngAgt;
    @XmlElement(name = "Regar")
    protected PartyIdentification87Choice regar;
    @XmlElement(name = "RsellngAgt")
    protected List<PartyIdentification87Choice> rsellngAgt;
    @XmlElement(name = "PhysSctiesAgt")
    protected PartyIdentification87Choice physSctiesAgt;
    @XmlElement(name = "DrpAgt")
    protected PartyIdentification87Choice drpAgt;
    @XmlElement(name = "SlctnAgt")
    protected List<PartyIdentification87Choice> slctnAgt;
    @XmlElement(name = "InfAgt")
    protected PartyIdentification87Choice infAgt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the mvmntPrlimryAdvcGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPreliminaryAdviceType2 }
     *     
     */
    public CorporateActionPreliminaryAdviceType2 getMvmntPrlimryAdvcGnlInf() {
        return mvmntPrlimryAdvcGnlInf;
    }

    /**
     * Sets the value of the mvmntPrlimryAdvcGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPreliminaryAdviceType2 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setMvmntPrlimryAdvcGnlInf(CorporateActionPreliminaryAdviceType2 value) {
        this.mvmntPrlimryAdvcGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the prvsMvmntPrlimryAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification19 }
     *     
     */
    public DocumentIdentification19 getPrvsMvmntPrlimryAdvcId() {
        return prvsMvmntPrlimryAdvcId;
    }

    /**
     * Sets the value of the prvsMvmntPrlimryAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification19 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setPrvsMvmntPrlimryAdvcId(DocumentIdentification19 value) {
        this.prvsMvmntPrlimryAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification19 }
     *     
     */
    public DocumentIdentification19 getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification19 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setNtfctnId(DocumentIdentification19 value) {
        this.ntfctnId = value;
        return this;
    }

    /**
     * Gets the value of the mvmntConfId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification19 }
     *     
     */
    public DocumentIdentification19 getMvmntConfId() {
        return mvmntConfId;
    }

    /**
     * Sets the value of the mvmntConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification19 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setMvmntConfId(DocumentIdentification19 value) {
        this.mvmntConfId = value;
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
    public CorporateActionMovementPreliminaryAdvice002V06 setInstrId(DocumentIdentification17 value) {
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
     * {@link DocumentIdentification20 }
     * 
     * 
     */
    public List<DocumentIdentification20> getOthrDocId() {
        if (othrDocId == null) {
            othrDocId = new ArrayList<DocumentIdentification20>();
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
     * {@link CorporateActionEventReference2 }
     * 
     * 
     */
    public List<CorporateActionEventReference2> getEvtsLkg() {
        if (evtsLkg == null) {
            evtsLkg = new ArrayList<CorporateActionEventReference2>();
        }
        return this.evtsLkg;
    }

    /**
     * Gets the value of the rvslRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionReversalReason2 }
     *     
     */
    public CorporateActionReversalReason2 getRvslRsn() {
        return rvslRsn;
    }

    /**
     * Sets the value of the rvslRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionReversalReason2 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setRvslRsn(CorporateActionReversalReason2 value) {
        this.rvslRsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation78 }
     *     
     */
    public CorporateActionGeneralInformation78 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation78 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setCorpActnGnlInf(CorporateActionGeneralInformation78 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification26Choice }
     *     
     */
    public AccountIdentification26Choice getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification26Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setAcctDtls(AccountIdentification26Choice value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction28 }
     *     
     */
    public CorporateAction28 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction28 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setCorpActnDtls(CorporateAction28 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpActnMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionOption108 }
     * 
     * 
     */
    public List<CorporateActionOption108> getCorpActnMvmntDtls() {
        if (corpActnMvmntDtls == null) {
            corpActnMvmntDtls = new ArrayList<CorporateActionOption108>();
        }
        return this.corpActnMvmntDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative16 }
     *     
     */
    public CorporateActionNarrative16 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative16 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setAddtlInf(CorporateActionNarrative16 value) {
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
     * {@link PartyIdentification87Choice }
     * 
     * 
     */
    public List<PartyIdentification87Choice> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<PartyIdentification87Choice>();
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
     * {@link PartyIdentification87Choice }
     * 
     * 
     */
    public List<PartyIdentification87Choice> getPngAgt() {
        if (pngAgt == null) {
            pngAgt = new ArrayList<PartyIdentification87Choice>();
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
     * {@link PartyIdentification87Choice }
     * 
     * 
     */
    public List<PartyIdentification87Choice> getSubPngAgt() {
        if (subPngAgt == null) {
            subPngAgt = new ArrayList<PartyIdentification87Choice>();
        }
        return this.subPngAgt;
    }

    /**
     * Gets the value of the regar property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification87Choice }
     *     
     */
    public PartyIdentification87Choice getRegar() {
        return regar;
    }

    /**
     * Sets the value of the regar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification87Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setRegar(PartyIdentification87Choice value) {
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
     * {@link PartyIdentification87Choice }
     * 
     * 
     */
    public List<PartyIdentification87Choice> getRsellngAgt() {
        if (rsellngAgt == null) {
            rsellngAgt = new ArrayList<PartyIdentification87Choice>();
        }
        return this.rsellngAgt;
    }

    /**
     * Gets the value of the physSctiesAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification87Choice }
     *     
     */
    public PartyIdentification87Choice getPhysSctiesAgt() {
        return physSctiesAgt;
    }

    /**
     * Sets the value of the physSctiesAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification87Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setPhysSctiesAgt(PartyIdentification87Choice value) {
        this.physSctiesAgt = value;
        return this;
    }

    /**
     * Gets the value of the drpAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification87Choice }
     *     
     */
    public PartyIdentification87Choice getDrpAgt() {
        return drpAgt;
    }

    /**
     * Sets the value of the drpAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification87Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setDrpAgt(PartyIdentification87Choice value) {
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
     * {@link PartyIdentification87Choice }
     * 
     * 
     */
    public List<PartyIdentification87Choice> getSlctnAgt() {
        if (slctnAgt == null) {
            slctnAgt = new ArrayList<PartyIdentification87Choice>();
        }
        return this.slctnAgt;
    }

    /**
     * Gets the value of the infAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification87Choice }
     *     
     */
    public PartyIdentification87Choice getInfAgt() {
        return infAgt;
    }

    /**
     * Sets the value of the infAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification87Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V06 setInfAgt(PartyIdentification87Choice value) {
        this.infAgt = value;
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
    public CorporateActionMovementPreliminaryAdvice002V06 addOthrDocId(DocumentIdentification20 othrDocId) {
        getOthrDocId().add(othrDocId);
        return this;
    }

    /**
     * Adds a new item to the evtsLkg list.
     * @see #getEvtsLkg()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V06 addEvtsLkg(CorporateActionEventReference2 evtsLkg) {
        getEvtsLkg().add(evtsLkg);
        return this;
    }

    /**
     * Adds a new item to the corpActnMvmntDtls list.
     * @see #getCorpActnMvmntDtls()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V06 addCorpActnMvmntDtls(CorporateActionOption108 corpActnMvmntDtls) {
        getCorpActnMvmntDtls().add(corpActnMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V06 addIssrAgt(PartyIdentification87Choice issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the pngAgt list.
     * @see #getPngAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V06 addPngAgt(PartyIdentification87Choice pngAgt) {
        getPngAgt().add(pngAgt);
        return this;
    }

    /**
     * Adds a new item to the subPngAgt list.
     * @see #getSubPngAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V06 addSubPngAgt(PartyIdentification87Choice subPngAgt) {
        getSubPngAgt().add(subPngAgt);
        return this;
    }

    /**
     * Adds a new item to the rsellngAgt list.
     * @see #getRsellngAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V06 addRsellngAgt(PartyIdentification87Choice rsellngAgt) {
        getRsellngAgt().add(rsellngAgt);
        return this;
    }

    /**
     * Adds a new item to the slctnAgt list.
     * @see #getSlctnAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V06 addSlctnAgt(PartyIdentification87Choice slctnAgt) {
        getSlctnAgt().add(slctnAgt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V06 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
