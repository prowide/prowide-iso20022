
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
 * An account servicer sends the CorporateActionNotification message to an account owner or its designated agent to notify details of a corporate action event and optionally account information, eligible balance and entitlements.
 * It may also include possible elections or choices available to the account owner. The account servicer can initially send the CorporateActionNotification message as a preliminary advice, subsequently replaced by another CorporateActionNotification message with complete or confirmed information.
 * It may also be sent to an account owner or its designated agent, to remind of event details and/or of missing or incomplete instructions for a corporate action event.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),
 * using the relevant elements in the business application header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNotificationV06", propOrder = {
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
    "splmtryData"
})
public class CorporateActionNotificationV06 {

    @XmlElement(name = "Pgntn")
    protected Pagination pgntn;
    @XmlElement(name = "NtfctnGnlInf", required = true)
    protected CorporateActionNotification5 ntfctnGnlInf;
    @XmlElement(name = "PrvsNtfctnId")
    protected DocumentIdentification31 prvsNtfctnId;
    @XmlElement(name = "InstrId")
    protected DocumentIdentification9 instrId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification32> othrDocId;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionEventReference3> evtsLkg;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation85 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification32Choice acctDtls;
    @XmlElement(name = "IntrmdtScty")
    protected FinancialInstrumentAttributes68 intrmdtScty;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction31 corpActnDtls;
    @XmlElement(name = "CorpActnOptnDtls")
    protected List<CorporateActionOption114> corpActnOptnDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative27 addtlInf;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification71Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification71Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification71Choice> subPngAgt;
    @XmlElement(name = "Regar")
    protected PartyIdentification71Choice regar;
    @XmlElement(name = "RsellngAgt")
    protected List<PartyIdentification71Choice> rsellngAgt;
    @XmlElement(name = "PhysSctiesAgt")
    protected PartyIdentification71Choice physSctiesAgt;
    @XmlElement(name = "DrpAgt")
    protected PartyIdentification71Choice drpAgt;
    @XmlElement(name = "SlctnAgt")
    protected List<PartyIdentification71Choice> slctnAgt;
    @XmlElement(name = "InfAgt")
    protected PartyIdentification71Choice infAgt;
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
    public CorporateActionNotificationV06 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotification5 }
     *     
     */
    public CorporateActionNotification5 getNtfctnGnlInf() {
        return ntfctnGnlInf;
    }

    /**
     * Sets the value of the ntfctnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotification5 }
     *     
     */
    public CorporateActionNotificationV06 setNtfctnGnlInf(CorporateActionNotification5 value) {
        this.ntfctnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the prvsNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification31 }
     *     
     */
    public DocumentIdentification31 getPrvsNtfctnId() {
        return prvsNtfctnId;
    }

    /**
     * Sets the value of the prvsNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification31 }
     *     
     */
    public CorporateActionNotificationV06 setPrvsNtfctnId(DocumentIdentification31 value) {
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
    public CorporateActionNotificationV06 setInstrId(DocumentIdentification9 value) {
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
     * {@link DocumentIdentification32 }
     * 
     * 
     */
    public List<DocumentIdentification32> getOthrDocId() {
        if (othrDocId == null) {
            othrDocId = new ArrayList<DocumentIdentification32>();
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
     * {@link CorporateActionEventReference3 }
     * 
     * 
     */
    public List<CorporateActionEventReference3> getEvtsLkg() {
        if (evtsLkg == null) {
            evtsLkg = new ArrayList<CorporateActionEventReference3>();
        }
        return this.evtsLkg;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation85 }
     *     
     */
    public CorporateActionGeneralInformation85 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation85 }
     *     
     */
    public CorporateActionNotificationV06 setCorpActnGnlInf(CorporateActionGeneralInformation85 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification32Choice }
     *     
     */
    public AccountIdentification32Choice getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification32Choice }
     *     
     */
    public CorporateActionNotificationV06 setAcctDtls(AccountIdentification32Choice value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the intrmdtScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes68 }
     *     
     */
    public FinancialInstrumentAttributes68 getIntrmdtScty() {
        return intrmdtScty;
    }

    /**
     * Sets the value of the intrmdtScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes68 }
     *     
     */
    public CorporateActionNotificationV06 setIntrmdtScty(FinancialInstrumentAttributes68 value) {
        this.intrmdtScty = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction31 }
     *     
     */
    public CorporateAction31 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction31 }
     *     
     */
    public CorporateActionNotificationV06 setCorpActnDtls(CorporateAction31 value) {
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
     * {@link CorporateActionOption114 }
     * 
     * 
     */
    public List<CorporateActionOption114> getCorpActnOptnDtls() {
        if (corpActnOptnDtls == null) {
            corpActnOptnDtls = new ArrayList<CorporateActionOption114>();
        }
        return this.corpActnOptnDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative27 }
     *     
     */
    public CorporateActionNarrative27 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative27 }
     *     
     */
    public CorporateActionNotificationV06 setAddtlInf(CorporateActionNarrative27 value) {
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
     * {@link PartyIdentification71Choice }
     * 
     * 
     */
    public List<PartyIdentification71Choice> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<PartyIdentification71Choice>();
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
     * {@link PartyIdentification71Choice }
     * 
     * 
     */
    public List<PartyIdentification71Choice> getPngAgt() {
        if (pngAgt == null) {
            pngAgt = new ArrayList<PartyIdentification71Choice>();
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
     * {@link PartyIdentification71Choice }
     * 
     * 
     */
    public List<PartyIdentification71Choice> getSubPngAgt() {
        if (subPngAgt == null) {
            subPngAgt = new ArrayList<PartyIdentification71Choice>();
        }
        return this.subPngAgt;
    }

    /**
     * Gets the value of the regar property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification71Choice }
     *     
     */
    public PartyIdentification71Choice getRegar() {
        return regar;
    }

    /**
     * Sets the value of the regar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification71Choice }
     *     
     */
    public CorporateActionNotificationV06 setRegar(PartyIdentification71Choice value) {
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
     * {@link PartyIdentification71Choice }
     * 
     * 
     */
    public List<PartyIdentification71Choice> getRsellngAgt() {
        if (rsellngAgt == null) {
            rsellngAgt = new ArrayList<PartyIdentification71Choice>();
        }
        return this.rsellngAgt;
    }

    /**
     * Gets the value of the physSctiesAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification71Choice }
     *     
     */
    public PartyIdentification71Choice getPhysSctiesAgt() {
        return physSctiesAgt;
    }

    /**
     * Sets the value of the physSctiesAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification71Choice }
     *     
     */
    public CorporateActionNotificationV06 setPhysSctiesAgt(PartyIdentification71Choice value) {
        this.physSctiesAgt = value;
        return this;
    }

    /**
     * Gets the value of the drpAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification71Choice }
     *     
     */
    public PartyIdentification71Choice getDrpAgt() {
        return drpAgt;
    }

    /**
     * Sets the value of the drpAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification71Choice }
     *     
     */
    public CorporateActionNotificationV06 setDrpAgt(PartyIdentification71Choice value) {
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
     * {@link PartyIdentification71Choice }
     * 
     * 
     */
    public List<PartyIdentification71Choice> getSlctnAgt() {
        if (slctnAgt == null) {
            slctnAgt = new ArrayList<PartyIdentification71Choice>();
        }
        return this.slctnAgt;
    }

    /**
     * Gets the value of the infAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification71Choice }
     *     
     */
    public PartyIdentification71Choice getInfAgt() {
        return infAgt;
    }

    /**
     * Sets the value of the infAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification71Choice }
     *     
     */
    public CorporateActionNotificationV06 setInfAgt(PartyIdentification71Choice value) {
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
    public CorporateActionNotificationV06 addOthrDocId(DocumentIdentification32 othrDocId) {
        getOthrDocId().add(othrDocId);
        return this;
    }

    /**
     * Adds a new item to the evtsLkg list.
     * @see #getEvtsLkg()
     * 
     */
    public CorporateActionNotificationV06 addEvtsLkg(CorporateActionEventReference3 evtsLkg) {
        getEvtsLkg().add(evtsLkg);
        return this;
    }

    /**
     * Adds a new item to the corpActnOptnDtls list.
     * @see #getCorpActnOptnDtls()
     * 
     */
    public CorporateActionNotificationV06 addCorpActnOptnDtls(CorporateActionOption114 corpActnOptnDtls) {
        getCorpActnOptnDtls().add(corpActnOptnDtls);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public CorporateActionNotificationV06 addIssrAgt(PartyIdentification71Choice issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the pngAgt list.
     * @see #getPngAgt()
     * 
     */
    public CorporateActionNotificationV06 addPngAgt(PartyIdentification71Choice pngAgt) {
        getPngAgt().add(pngAgt);
        return this;
    }

    /**
     * Adds a new item to the subPngAgt list.
     * @see #getSubPngAgt()
     * 
     */
    public CorporateActionNotificationV06 addSubPngAgt(PartyIdentification71Choice subPngAgt) {
        getSubPngAgt().add(subPngAgt);
        return this;
    }

    /**
     * Adds a new item to the rsellngAgt list.
     * @see #getRsellngAgt()
     * 
     */
    public CorporateActionNotificationV06 addRsellngAgt(PartyIdentification71Choice rsellngAgt) {
        getRsellngAgt().add(rsellngAgt);
        return this;
    }

    /**
     * Adds a new item to the slctnAgt list.
     * @see #getSlctnAgt()
     * 
     */
    public CorporateActionNotificationV06 addSlctnAgt(PartyIdentification71Choice slctnAgt) {
        getSlctnAgt().add(slctnAgt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CorporateActionNotificationV06 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
