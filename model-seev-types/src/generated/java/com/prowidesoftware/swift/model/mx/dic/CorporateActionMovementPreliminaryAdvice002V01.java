
package com.prowidesoftware.swift.model.mx.dic;

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
 * Scope
 * An account servicer sends the CorporateActionMovementPreliminaryAdvice message to an account owner or its designated agent to pre-advise upcoming posting or reversal of securities and/or cash postings.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).
 * ISO 15022 - 20022 COEXISTENCE SUBSET
 * This message definition is a subset of an ISO 20022 message that was reversed engineered from ISO 15022. A subset is a message definition that is compatible with another definition, but is more restrictive.
 * The ISO 15022 and ISO 20022 standards will coexist for a number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. These
 * restrictions, which are described by textual usage rules in the ISO 20022 message, have been made mandatory in this subset.
 * NOTE: The ISO 20022 message coexistence textual rules have been kept in the subset to explain why specific data types have been restricted. These textual rules are identified as follows: CoexistenceXxxxRule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementPreliminaryAdvice.002V01", propOrder = {
    "id",
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
    "corpActnMvmntDtls",
    "addtlInf",
    "msgOrgtr",
    "msgRcpt",
    "issrAgt",
    "pngAgt",
    "subPngAgt",
    "regar",
    "rsellngAgt",
    "physSctiesAgt",
    "drpAgt",
    "slctnAgt",
    "infAgt",
    "xtnsn"
})
public class CorporateActionMovementPreliminaryAdvice002V01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification16 id;
    @XmlElement(name = "MvmntPrlimryAdvcGnlInf", required = true)
    protected CorporateActionPreliminaryAdviceType1 mvmntPrlimryAdvcGnlInf;
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
    protected CorporateActionGeneralInformation17 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification8Choice acctDtls;
    @XmlElement(name = "CorpActnMvmntDtls")
    protected List<CorporateActionOption15> corpActnMvmntDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative16 addtlInf;
    @XmlElement(name = "MsgOrgtr")
    protected PartyIdentification16Choice msgOrgtr;
    @XmlElement(name = "MsgRcpt")
    protected PartyIdentification16Choice msgRcpt;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification16Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification16Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification16Choice> subPngAgt;
    @XmlElement(name = "Regar")
    protected PartyIdentification16Choice regar;
    @XmlElement(name = "RsellngAgt")
    protected List<PartyIdentification16Choice> rsellngAgt;
    @XmlElement(name = "PhysSctiesAgt")
    protected PartyIdentification16Choice physSctiesAgt;
    @XmlElement(name = "DrpAgt")
    protected PartyIdentification16Choice drpAgt;
    @XmlElement(name = "SlctnAgt")
    protected List<PartyIdentification16Choice> slctnAgt;
    @XmlElement(name = "InfAgt")
    protected PartyIdentification16Choice infAgt;
    @XmlElement(name = "Xtnsn")
    protected List<Extension2> xtnsn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification16 }
     *     
     */
    public DocumentIdentification16 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification16 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V01 setId(DocumentIdentification16 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the mvmntPrlimryAdvcGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPreliminaryAdviceType1 }
     *     
     */
    public CorporateActionPreliminaryAdviceType1 getMvmntPrlimryAdvcGnlInf() {
        return mvmntPrlimryAdvcGnlInf;
    }

    /**
     * Sets the value of the mvmntPrlimryAdvcGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPreliminaryAdviceType1 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V01 setMvmntPrlimryAdvcGnlInf(CorporateActionPreliminaryAdviceType1 value) {
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
    public CorporateActionMovementPreliminaryAdvice002V01 setPrvsMvmntPrlimryAdvcId(DocumentIdentification19 value) {
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
    public CorporateActionMovementPreliminaryAdvice002V01 setNtfctnId(DocumentIdentification19 value) {
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
    public CorporateActionMovementPreliminaryAdvice002V01 setMvmntConfId(DocumentIdentification19 value) {
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
    public CorporateActionMovementPreliminaryAdvice002V01 setInstrId(DocumentIdentification17 value) {
        this.instrId = value;
        return this;
    }

    /**
     * Gets the value of the othrDocId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrDocId property.
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
     * @return
     *     The value of the othrDocId property.
     */
    public List<DocumentIdentification20> getOthrDocId() {
        if (othrDocId == null) {
            othrDocId = new ArrayList<>();
        }
        return this.othrDocId;
    }

    /**
     * Gets the value of the evtsLkg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evtsLkg property.
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
     * @return
     *     The value of the evtsLkg property.
     */
    public List<CorporateActionEventReference2> getEvtsLkg() {
        if (evtsLkg == null) {
            evtsLkg = new ArrayList<>();
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
    public CorporateActionMovementPreliminaryAdvice002V01 setRvslRsn(CorporateActionReversalReason2 value) {
        this.rvslRsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation17 }
     *     
     */
    public CorporateActionGeneralInformation17 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation17 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V01 setCorpActnGnlInf(CorporateActionGeneralInformation17 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification8Choice }
     *     
     */
    public AccountIdentification8Choice getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification8Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V01 setAcctDtls(AccountIdentification8Choice value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpActnMvmntDtls property.
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
     * {@link CorporateActionOption15 }
     * 
     * 
     * @return
     *     The value of the corpActnMvmntDtls property.
     */
    public List<CorporateActionOption15> getCorpActnMvmntDtls() {
        if (corpActnMvmntDtls == null) {
            corpActnMvmntDtls = new ArrayList<>();
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
    public CorporateActionMovementPreliminaryAdvice002V01 setAddtlInf(CorporateActionNarrative16 value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getMsgOrgtr() {
        return msgOrgtr;
    }

    /**
     * Sets the value of the msgOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V01 setMsgOrgtr(PartyIdentification16Choice value) {
        this.msgOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the msgRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getMsgRcpt() {
        return msgRcpt;
    }

    /**
     * Sets the value of the msgRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V01 setMsgRcpt(PartyIdentification16Choice value) {
        this.msgRcpt = value;
        return this;
    }

    /**
     * Gets the value of the issrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the issrAgt property.
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
     * {@link PartyIdentification16Choice }
     * 
     * 
     * @return
     *     The value of the issrAgt property.
     */
    public List<PartyIdentification16Choice> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<>();
        }
        return this.issrAgt;
    }

    /**
     * Gets the value of the pngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pngAgt property.
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
     * {@link PartyIdentification16Choice }
     * 
     * 
     * @return
     *     The value of the pngAgt property.
     */
    public List<PartyIdentification16Choice> getPngAgt() {
        if (pngAgt == null) {
            pngAgt = new ArrayList<>();
        }
        return this.pngAgt;
    }

    /**
     * Gets the value of the subPngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subPngAgt property.
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
     * {@link PartyIdentification16Choice }
     * 
     * 
     * @return
     *     The value of the subPngAgt property.
     */
    public List<PartyIdentification16Choice> getSubPngAgt() {
        if (subPngAgt == null) {
            subPngAgt = new ArrayList<>();
        }
        return this.subPngAgt;
    }

    /**
     * Gets the value of the regar property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getRegar() {
        return regar;
    }

    /**
     * Sets the value of the regar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V01 setRegar(PartyIdentification16Choice value) {
        this.regar = value;
        return this;
    }

    /**
     * Gets the value of the rsellngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsellngAgt property.
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
     * {@link PartyIdentification16Choice }
     * 
     * 
     * @return
     *     The value of the rsellngAgt property.
     */
    public List<PartyIdentification16Choice> getRsellngAgt() {
        if (rsellngAgt == null) {
            rsellngAgt = new ArrayList<>();
        }
        return this.rsellngAgt;
    }

    /**
     * Gets the value of the physSctiesAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getPhysSctiesAgt() {
        return physSctiesAgt;
    }

    /**
     * Sets the value of the physSctiesAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V01 setPhysSctiesAgt(PartyIdentification16Choice value) {
        this.physSctiesAgt = value;
        return this;
    }

    /**
     * Gets the value of the drpAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getDrpAgt() {
        return drpAgt;
    }

    /**
     * Sets the value of the drpAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V01 setDrpAgt(PartyIdentification16Choice value) {
        this.drpAgt = value;
        return this;
    }

    /**
     * Gets the value of the slctnAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the slctnAgt property.
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
     * {@link PartyIdentification16Choice }
     * 
     * 
     * @return
     *     The value of the slctnAgt property.
     */
    public List<PartyIdentification16Choice> getSlctnAgt() {
        if (slctnAgt == null) {
            slctnAgt = new ArrayList<>();
        }
        return this.slctnAgt;
    }

    /**
     * Gets the value of the infAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getInfAgt() {
        return infAgt;
    }

    /**
     * Sets the value of the infAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V01 setInfAgt(PartyIdentification16Choice value) {
        this.infAgt = value;
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
     * {@link Extension2 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension2> getXtnsn() {
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
     * Adds a new item to the othrDocId list.
     * @see #getOthrDocId()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V01 addOthrDocId(DocumentIdentification20 othrDocId) {
        getOthrDocId().add(othrDocId);
        return this;
    }

    /**
     * Adds a new item to the evtsLkg list.
     * @see #getEvtsLkg()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V01 addEvtsLkg(CorporateActionEventReference2 evtsLkg) {
        getEvtsLkg().add(evtsLkg);
        return this;
    }

    /**
     * Adds a new item to the corpActnMvmntDtls list.
     * @see #getCorpActnMvmntDtls()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V01 addCorpActnMvmntDtls(CorporateActionOption15 corpActnMvmntDtls) {
        getCorpActnMvmntDtls().add(corpActnMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V01 addIssrAgt(PartyIdentification16Choice issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the pngAgt list.
     * @see #getPngAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V01 addPngAgt(PartyIdentification16Choice pngAgt) {
        getPngAgt().add(pngAgt);
        return this;
    }

    /**
     * Adds a new item to the subPngAgt list.
     * @see #getSubPngAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V01 addSubPngAgt(PartyIdentification16Choice subPngAgt) {
        getSubPngAgt().add(subPngAgt);
        return this;
    }

    /**
     * Adds a new item to the rsellngAgt list.
     * @see #getRsellngAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V01 addRsellngAgt(PartyIdentification16Choice rsellngAgt) {
        getRsellngAgt().add(rsellngAgt);
        return this;
    }

    /**
     * Adds a new item to the slctnAgt list.
     * @see #getSlctnAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V01 addSlctnAgt(PartyIdentification16Choice slctnAgt) {
        getSlctnAgt().add(slctnAgt);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public CorporateActionMovementPreliminaryAdvice002V01 addXtnsn(Extension2 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
