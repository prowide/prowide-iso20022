
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
 * An account servicer sends the CorporateActionNotification message to an account owner or its designated agent to notify details of a corporate action event and optionally account information, eligible balance and entitlements. It may also include possible elections or choices available to the account owner.
 * The account servicer can initially send the CorporateActionNotification message as a preliminary advice, subsequently replaced by another CorporateActionNotification message with complete or confirmed information.
 * It may also be sent to an account owner or its designated agent, to remind of event details and/or of missing or incomplete instructions for a corporate action event.
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
@XmlType(name = "CorporateActionNotificationV02", propOrder = {
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
    "splmtryData"
})
public class CorporateActionNotificationV02 {

    @XmlElement(name = "NtfctnGnlInf", required = true)
    protected CorporateActionNotification2 ntfctnGnlInf;
    @XmlElement(name = "PrvsNtfctnId")
    protected DocumentIdentification15 prvsNtfctnId;
    @XmlElement(name = "InstrId")
    protected DocumentIdentification9 instrId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification13> othrDocId;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionEventReference1> evtsLkg;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation22 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification12Choice acctDtls;
    @XmlElement(name = "IntrmdtScty")
    protected FinancialInstrumentAttributes17 intrmdtScty;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction5 corpActnDtls;
    @XmlElement(name = "CorpActnOptnDtls")
    protected List<CorporateActionOption19> corpActnOptnDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative11 addtlInf;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification47Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification47Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification47Choice> subPngAgt;
    @XmlElement(name = "Regar")
    protected PartyIdentification47Choice regar;
    @XmlElement(name = "RsellngAgt")
    protected List<PartyIdentification47Choice> rsellngAgt;
    @XmlElement(name = "PhysSctiesAgt")
    protected PartyIdentification47Choice physSctiesAgt;
    @XmlElement(name = "DrpAgt")
    protected PartyIdentification47Choice drpAgt;
    @XmlElement(name = "SlctnAgt")
    protected List<PartyIdentification47Choice> slctnAgt;
    @XmlElement(name = "InfAgt")
    protected PartyIdentification47Choice infAgt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ntfctnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotification2 }
     *     
     */
    public CorporateActionNotification2 getNtfctnGnlInf() {
        return ntfctnGnlInf;
    }

    /**
     * Sets the value of the ntfctnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotification2 }
     *     
     */
    public CorporateActionNotificationV02 setNtfctnGnlInf(CorporateActionNotification2 value) {
        this.ntfctnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the prvsNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification15 }
     *     
     */
    public DocumentIdentification15 getPrvsNtfctnId() {
        return prvsNtfctnId;
    }

    /**
     * Sets the value of the prvsNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification15 }
     *     
     */
    public CorporateActionNotificationV02 setPrvsNtfctnId(DocumentIdentification15 value) {
        this.prvsNtfctnId = value;
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
    public CorporateActionNotificationV02 setInstrId(DocumentIdentification9 value) {
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
     * {@link DocumentIdentification13 }
     * 
     * 
     * @return
     *     The value of the othrDocId property.
     */
    public List<DocumentIdentification13> getOthrDocId() {
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
     * {@link CorporateActionEventReference1 }
     * 
     * 
     * @return
     *     The value of the evtsLkg property.
     */
    public List<CorporateActionEventReference1> getEvtsLkg() {
        if (evtsLkg == null) {
            evtsLkg = new ArrayList<>();
        }
        return this.evtsLkg;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation22 }
     *     
     */
    public CorporateActionGeneralInformation22 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation22 }
     *     
     */
    public CorporateActionNotificationV02 setCorpActnGnlInf(CorporateActionGeneralInformation22 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification12Choice }
     *     
     */
    public AccountIdentification12Choice getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification12Choice }
     *     
     */
    public CorporateActionNotificationV02 setAcctDtls(AccountIdentification12Choice value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the intrmdtScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes17 }
     *     
     */
    public FinancialInstrumentAttributes17 getIntrmdtScty() {
        return intrmdtScty;
    }

    /**
     * Sets the value of the intrmdtScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes17 }
     *     
     */
    public CorporateActionNotificationV02 setIntrmdtScty(FinancialInstrumentAttributes17 value) {
        this.intrmdtScty = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction5 }
     *     
     */
    public CorporateAction5 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction5 }
     *     
     */
    public CorporateActionNotificationV02 setCorpActnDtls(CorporateAction5 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnOptnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpActnOptnDtls property.
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
     * {@link CorporateActionOption19 }
     * 
     * 
     * @return
     *     The value of the corpActnOptnDtls property.
     */
    public List<CorporateActionOption19> getCorpActnOptnDtls() {
        if (corpActnOptnDtls == null) {
            corpActnOptnDtls = new ArrayList<>();
        }
        return this.corpActnOptnDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative11 }
     *     
     */
    public CorporateActionNarrative11 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative11 }
     *     
     */
    public CorporateActionNotificationV02 setAddtlInf(CorporateActionNarrative11 value) {
        this.addtlInf = value;
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
     * {@link PartyIdentification47Choice }
     * 
     * 
     * @return
     *     The value of the issrAgt property.
     */
    public List<PartyIdentification47Choice> getIssrAgt() {
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
     * {@link PartyIdentification47Choice }
     * 
     * 
     * @return
     *     The value of the pngAgt property.
     */
    public List<PartyIdentification47Choice> getPngAgt() {
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
     * {@link PartyIdentification47Choice }
     * 
     * 
     * @return
     *     The value of the subPngAgt property.
     */
    public List<PartyIdentification47Choice> getSubPngAgt() {
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
     *     {@link PartyIdentification47Choice }
     *     
     */
    public PartyIdentification47Choice getRegar() {
        return regar;
    }

    /**
     * Sets the value of the regar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification47Choice }
     *     
     */
    public CorporateActionNotificationV02 setRegar(PartyIdentification47Choice value) {
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
     * {@link PartyIdentification47Choice }
     * 
     * 
     * @return
     *     The value of the rsellngAgt property.
     */
    public List<PartyIdentification47Choice> getRsellngAgt() {
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
     *     {@link PartyIdentification47Choice }
     *     
     */
    public PartyIdentification47Choice getPhysSctiesAgt() {
        return physSctiesAgt;
    }

    /**
     * Sets the value of the physSctiesAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification47Choice }
     *     
     */
    public CorporateActionNotificationV02 setPhysSctiesAgt(PartyIdentification47Choice value) {
        this.physSctiesAgt = value;
        return this;
    }

    /**
     * Gets the value of the drpAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification47Choice }
     *     
     */
    public PartyIdentification47Choice getDrpAgt() {
        return drpAgt;
    }

    /**
     * Sets the value of the drpAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification47Choice }
     *     
     */
    public CorporateActionNotificationV02 setDrpAgt(PartyIdentification47Choice value) {
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
     * {@link PartyIdentification47Choice }
     * 
     * 
     * @return
     *     The value of the slctnAgt property.
     */
    public List<PartyIdentification47Choice> getSlctnAgt() {
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
     *     {@link PartyIdentification47Choice }
     *     
     */
    public PartyIdentification47Choice getInfAgt() {
        return infAgt;
    }

    /**
     * Sets the value of the infAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification47Choice }
     *     
     */
    public CorporateActionNotificationV02 setInfAgt(PartyIdentification47Choice value) {
        this.infAgt = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public CorporateActionNotificationV02 addOthrDocId(DocumentIdentification13 othrDocId) {
        getOthrDocId().add(othrDocId);
        return this;
    }

    /**
     * Adds a new item to the evtsLkg list.
     * @see #getEvtsLkg()
     * 
     */
    public CorporateActionNotificationV02 addEvtsLkg(CorporateActionEventReference1 evtsLkg) {
        getEvtsLkg().add(evtsLkg);
        return this;
    }

    /**
     * Adds a new item to the corpActnOptnDtls list.
     * @see #getCorpActnOptnDtls()
     * 
     */
    public CorporateActionNotificationV02 addCorpActnOptnDtls(CorporateActionOption19 corpActnOptnDtls) {
        getCorpActnOptnDtls().add(corpActnOptnDtls);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public CorporateActionNotificationV02 addIssrAgt(PartyIdentification47Choice issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the pngAgt list.
     * @see #getPngAgt()
     * 
     */
    public CorporateActionNotificationV02 addPngAgt(PartyIdentification47Choice pngAgt) {
        getPngAgt().add(pngAgt);
        return this;
    }

    /**
     * Adds a new item to the subPngAgt list.
     * @see #getSubPngAgt()
     * 
     */
    public CorporateActionNotificationV02 addSubPngAgt(PartyIdentification47Choice subPngAgt) {
        getSubPngAgt().add(subPngAgt);
        return this;
    }

    /**
     * Adds a new item to the rsellngAgt list.
     * @see #getRsellngAgt()
     * 
     */
    public CorporateActionNotificationV02 addRsellngAgt(PartyIdentification47Choice rsellngAgt) {
        getRsellngAgt().add(rsellngAgt);
        return this;
    }

    /**
     * Adds a new item to the slctnAgt list.
     * @see #getSlctnAgt()
     * 
     */
    public CorporateActionNotificationV02 addSlctnAgt(PartyIdentification47Choice slctnAgt) {
        getSlctnAgt().add(slctnAgt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CorporateActionNotificationV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
