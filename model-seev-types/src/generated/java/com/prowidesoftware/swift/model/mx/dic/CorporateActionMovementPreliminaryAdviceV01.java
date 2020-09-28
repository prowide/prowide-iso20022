
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
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).
 * ISO 15022 - 20022 COEXISTENCE
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementPreliminaryAdviceV01", propOrder = {
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
public class CorporateActionMovementPreliminaryAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "MvmntPrlimryAdvcGnlInf", required = true)
    protected CorporateActionPreliminaryAdviceType1 mvmntPrlimryAdvcGnlInf;
    @XmlElement(name = "PrvsMvmntPrlimryAdvcId")
    protected DocumentIdentification15 prvsMvmntPrlimryAdvcId;
    @XmlElement(name = "NtfctnId")
    protected DocumentIdentification15 ntfctnId;
    @XmlElement(name = "MvmntConfId")
    protected DocumentIdentification15 mvmntConfId;
    @XmlElement(name = "InstrId")
    protected DocumentIdentification9 instrId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification13> othrDocId;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionEventReference1> evtsLkg;
    @XmlElement(name = "RvslRsn")
    protected CorporateActionReversalReason1 rvslRsn;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation3 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification7Choice acctDtls;
    @XmlElement(name = "CorpActnMvmntDtls")
    protected List<CorporateActionOption10> corpActnMvmntDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative6 addtlInf;
    @XmlElement(name = "MsgOrgtr")
    protected PartyIdentification10Choice msgOrgtr;
    @XmlElement(name = "MsgRcpt")
    protected PartyIdentification10Choice msgRcpt;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification10Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification10Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification10Choice> subPngAgt;
    @XmlElement(name = "Regar")
    protected PartyIdentification10Choice regar;
    @XmlElement(name = "RsellngAgt")
    protected List<PartyIdentification10Choice> rsellngAgt;
    @XmlElement(name = "PhysSctiesAgt")
    protected PartyIdentification10Choice physSctiesAgt;
    @XmlElement(name = "DrpAgt")
    protected PartyIdentification10Choice drpAgt;
    @XmlElement(name = "SlctnAgt")
    protected List<PartyIdentification10Choice> slctnAgt;
    @XmlElement(name = "InfAgt")
    protected PartyIdentification10Choice infAgt;
    @XmlElement(name = "Xtnsn")
    protected List<Extension2> xtnsn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setId(DocumentIdentification11 value) {
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
    public CorporateActionMovementPreliminaryAdviceV01 setMvmntPrlimryAdvcGnlInf(CorporateActionPreliminaryAdviceType1 value) {
        this.mvmntPrlimryAdvcGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the prvsMvmntPrlimryAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification15 }
     *     
     */
    public DocumentIdentification15 getPrvsMvmntPrlimryAdvcId() {
        return prvsMvmntPrlimryAdvcId;
    }

    /**
     * Sets the value of the prvsMvmntPrlimryAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification15 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setPrvsMvmntPrlimryAdvcId(DocumentIdentification15 value) {
        this.prvsMvmntPrlimryAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification15 }
     *     
     */
    public DocumentIdentification15 getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification15 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setNtfctnId(DocumentIdentification15 value) {
        this.ntfctnId = value;
        return this;
    }

    /**
     * Gets the value of the mvmntConfId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification15 }
     *     
     */
    public DocumentIdentification15 getMvmntConfId() {
        return mvmntConfId;
    }

    /**
     * Sets the value of the mvmntConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification15 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setMvmntConfId(DocumentIdentification15 value) {
        this.mvmntConfId = value;
        return this;
    }

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public DocumentIdentification9 getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setInstrId(DocumentIdentification9 value) {
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
     * {@link DocumentIdentification13 }
     * 
     * 
     */
    public List<DocumentIdentification13> getOthrDocId() {
        if (othrDocId == null) {
            othrDocId = new ArrayList<DocumentIdentification13>();
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
     * {@link CorporateActionEventReference1 }
     * 
     * 
     */
    public List<CorporateActionEventReference1> getEvtsLkg() {
        if (evtsLkg == null) {
            evtsLkg = new ArrayList<CorporateActionEventReference1>();
        }
        return this.evtsLkg;
    }

    /**
     * Gets the value of the rvslRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionReversalReason1 }
     *     
     */
    public CorporateActionReversalReason1 getRvslRsn() {
        return rvslRsn;
    }

    /**
     * Sets the value of the rvslRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionReversalReason1 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setRvslRsn(CorporateActionReversalReason1 value) {
        this.rvslRsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation3 }
     *     
     */
    public CorporateActionGeneralInformation3 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation3 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setCorpActnGnlInf(CorporateActionGeneralInformation3 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification7Choice }
     *     
     */
    public AccountIdentification7Choice getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification7Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setAcctDtls(AccountIdentification7Choice value) {
        this.acctDtls = value;
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
     * {@link CorporateActionOption10 }
     * 
     * 
     */
    public List<CorporateActionOption10> getCorpActnMvmntDtls() {
        if (corpActnMvmntDtls == null) {
            corpActnMvmntDtls = new ArrayList<CorporateActionOption10>();
        }
        return this.corpActnMvmntDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative6 }
     *     
     */
    public CorporateActionNarrative6 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative6 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setAddtlInf(CorporateActionNarrative6 value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getMsgOrgtr() {
        return msgOrgtr;
    }

    /**
     * Sets the value of the msgOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setMsgOrgtr(PartyIdentification10Choice value) {
        this.msgOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the msgRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getMsgRcpt() {
        return msgRcpt;
    }

    /**
     * Sets the value of the msgRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setMsgRcpt(PartyIdentification10Choice value) {
        this.msgRcpt = value;
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
     * {@link PartyIdentification10Choice }
     * 
     * 
     */
    public List<PartyIdentification10Choice> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<PartyIdentification10Choice>();
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
     * {@link PartyIdentification10Choice }
     * 
     * 
     */
    public List<PartyIdentification10Choice> getPngAgt() {
        if (pngAgt == null) {
            pngAgt = new ArrayList<PartyIdentification10Choice>();
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
     * {@link PartyIdentification10Choice }
     * 
     * 
     */
    public List<PartyIdentification10Choice> getSubPngAgt() {
        if (subPngAgt == null) {
            subPngAgt = new ArrayList<PartyIdentification10Choice>();
        }
        return this.subPngAgt;
    }

    /**
     * Gets the value of the regar property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getRegar() {
        return regar;
    }

    /**
     * Sets the value of the regar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setRegar(PartyIdentification10Choice value) {
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
     * {@link PartyIdentification10Choice }
     * 
     * 
     */
    public List<PartyIdentification10Choice> getRsellngAgt() {
        if (rsellngAgt == null) {
            rsellngAgt = new ArrayList<PartyIdentification10Choice>();
        }
        return this.rsellngAgt;
    }

    /**
     * Gets the value of the physSctiesAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getPhysSctiesAgt() {
        return physSctiesAgt;
    }

    /**
     * Sets the value of the physSctiesAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setPhysSctiesAgt(PartyIdentification10Choice value) {
        this.physSctiesAgt = value;
        return this;
    }

    /**
     * Gets the value of the drpAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getDrpAgt() {
        return drpAgt;
    }

    /**
     * Sets the value of the drpAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setDrpAgt(PartyIdentification10Choice value) {
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
     * {@link PartyIdentification10Choice }
     * 
     * 
     */
    public List<PartyIdentification10Choice> getSlctnAgt() {
        if (slctnAgt == null) {
            slctnAgt = new ArrayList<PartyIdentification10Choice>();
        }
        return this.slctnAgt;
    }

    /**
     * Gets the value of the infAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getInfAgt() {
        return infAgt;
    }

    /**
     * Sets the value of the infAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 setInfAgt(PartyIdentification10Choice value) {
        this.infAgt = value;
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
     * {@link Extension2 }
     * 
     * 
     */
    public List<Extension2> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension2>();
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
    public CorporateActionMovementPreliminaryAdviceV01 addOthrDocId(DocumentIdentification13 othrDocId) {
        getOthrDocId().add(othrDocId);
        return this;
    }

    /**
     * Adds a new item to the evtsLkg list.
     * @see #getEvtsLkg()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceV01 addEvtsLkg(CorporateActionEventReference1 evtsLkg) {
        getEvtsLkg().add(evtsLkg);
        return this;
    }

    /**
     * Adds a new item to the corpActnMvmntDtls list.
     * @see #getCorpActnMvmntDtls()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceV01 addCorpActnMvmntDtls(CorporateActionOption10 corpActnMvmntDtls) {
        getCorpActnMvmntDtls().add(corpActnMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceV01 addIssrAgt(PartyIdentification10Choice issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the pngAgt list.
     * @see #getPngAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceV01 addPngAgt(PartyIdentification10Choice pngAgt) {
        getPngAgt().add(pngAgt);
        return this;
    }

    /**
     * Adds a new item to the subPngAgt list.
     * @see #getSubPngAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceV01 addSubPngAgt(PartyIdentification10Choice subPngAgt) {
        getSubPngAgt().add(subPngAgt);
        return this;
    }

    /**
     * Adds a new item to the rsellngAgt list.
     * @see #getRsellngAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceV01 addRsellngAgt(PartyIdentification10Choice rsellngAgt) {
        getRsellngAgt().add(rsellngAgt);
        return this;
    }

    /**
     * Adds a new item to the slctnAgt list.
     * @see #getSlctnAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceV01 addSlctnAgt(PartyIdentification10Choice slctnAgt) {
        getSlctnAgt().add(slctnAgt);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceV01 addXtnsn(Extension2 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
