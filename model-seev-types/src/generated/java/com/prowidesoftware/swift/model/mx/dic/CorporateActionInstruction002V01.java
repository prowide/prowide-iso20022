
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
 * An account owner sends the CorporateActionInstruction message to an account servicer to instruct election on a corporate action event.
 * This message is used to provide the custodian with instructions on how the account owner wishes to proceed with a corporate action event. Instructions include investment decisions regarding the exercise of rights issues, the election of stock or cash when the option is available, and decisions on the conversion or tendering of securities.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).
 * ISO 15022 - 20022 COEXISTENCE SUBSET
 * This message definition is a subset of an ISO 20022 message that was reversed engineered from ISO 15022. A subset is a message definition that is compatible with another definition, but is more restrictive
 * The ISO 15022 and ISO 20022 standards will coexist for a number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. These restrictions, which are described by textual usage rules in the ISO 20022 message, have been made mandatory in this subset.  
 * NOTE: The ISO 20022 message coexistence textual rules have been kept in the subset to explain why specific data types have been restricted. These textual rules are identified as follows:  CoexistenceXxxxRule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionInstruction.002V01", propOrder = {
    "id",
    "cancInstrId",
    "instrCxlReqId",
    "othrDocId",
    "evtsLkg",
    "corpActnGnlInf",
    "acctDtls",
    "bnfclOwnrDtls",
    "corpActnInstr",
    "addtlInf",
    "msgOrgtr",
    "msgRcpt",
    "xtnsn"
})
public class CorporateActionInstruction002V01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification18 id;
    @XmlElement(name = "CancInstrId")
    protected DocumentIdentification19 cancInstrId;
    @XmlElement(name = "InstrCxlReqId")
    protected DocumentIdentification19 instrCxlReqId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification20> othrDocId;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionEventReference2> evtsLkg;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation15 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountAndBalance5 acctDtls;
    @XmlElement(name = "BnfclOwnrDtls")
    protected List<PartyIdentification34> bnfclOwnrDtls;
    @XmlElement(name = "CorpActnInstr", required = true)
    protected CorporateActionOption13 corpActnInstr;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative12 addtlInf;
    @XmlElement(name = "MsgOrgtr")
    protected PartyIdentification16Choice msgOrgtr;
    @XmlElement(name = "MsgRcpt")
    protected PartyIdentification16Choice msgRcpt;
    @XmlElement(name = "Xtnsn")
    protected List<Extension2> xtnsn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification18 }
     *     
     */
    public DocumentIdentification18 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification18 }
     *     
     */
    public CorporateActionInstruction002V01 setId(DocumentIdentification18 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the cancInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification19 }
     *     
     */
    public DocumentIdentification19 getCancInstrId() {
        return cancInstrId;
    }

    /**
     * Sets the value of the cancInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification19 }
     *     
     */
    public CorporateActionInstruction002V01 setCancInstrId(DocumentIdentification19 value) {
        this.cancInstrId = value;
        return this;
    }

    /**
     * Gets the value of the instrCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification19 }
     *     
     */
    public DocumentIdentification19 getInstrCxlReqId() {
        return instrCxlReqId;
    }

    /**
     * Sets the value of the instrCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification19 }
     *     
     */
    public CorporateActionInstruction002V01 setInstrCxlReqId(DocumentIdentification19 value) {
        this.instrCxlReqId = value;
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
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation15 }
     *     
     */
    public CorporateActionGeneralInformation15 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation15 }
     *     
     */
    public CorporateActionInstruction002V01 setCorpActnGnlInf(CorporateActionGeneralInformation15 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountAndBalance5 }
     *     
     */
    public AccountAndBalance5 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountAndBalance5 }
     *     
     */
    public CorporateActionInstruction002V01 setAcctDtls(AccountAndBalance5 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the bnfclOwnrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bnfclOwnrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfclOwnrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification34 }
     * 
     * 
     */
    public List<PartyIdentification34> getBnfclOwnrDtls() {
        if (bnfclOwnrDtls == null) {
            bnfclOwnrDtls = new ArrayList<PartyIdentification34>();
        }
        return this.bnfclOwnrDtls;
    }

    /**
     * Gets the value of the corpActnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption13 }
     *     
     */
    public CorporateActionOption13 getCorpActnInstr() {
        return corpActnInstr;
    }

    /**
     * Sets the value of the corpActnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption13 }
     *     
     */
    public CorporateActionInstruction002V01 setCorpActnInstr(CorporateActionOption13 value) {
        this.corpActnInstr = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative12 }
     *     
     */
    public CorporateActionNarrative12 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative12 }
     *     
     */
    public CorporateActionInstruction002V01 setAddtlInf(CorporateActionNarrative12 value) {
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
    public CorporateActionInstruction002V01 setMsgOrgtr(PartyIdentification16Choice value) {
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
    public CorporateActionInstruction002V01 setMsgRcpt(PartyIdentification16Choice value) {
        this.msgRcpt = value;
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
    public CorporateActionInstruction002V01 addOthrDocId(DocumentIdentification20 othrDocId) {
        getOthrDocId().add(othrDocId);
        return this;
    }

    /**
     * Adds a new item to the evtsLkg list.
     * @see #getEvtsLkg()
     * 
     */
    public CorporateActionInstruction002V01 addEvtsLkg(CorporateActionEventReference2 evtsLkg) {
        getEvtsLkg().add(evtsLkg);
        return this;
    }

    /**
     * Adds a new item to the bnfclOwnrDtls list.
     * @see #getBnfclOwnrDtls()
     * 
     */
    public CorporateActionInstruction002V01 addBnfclOwnrDtls(PartyIdentification34 bnfclOwnrDtls) {
        getBnfclOwnrDtls().add(bnfclOwnrDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public CorporateActionInstruction002V01 addXtnsn(Extension2 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
