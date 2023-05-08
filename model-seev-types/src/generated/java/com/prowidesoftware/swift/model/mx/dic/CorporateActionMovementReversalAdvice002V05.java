
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
 * An account servicer sends the CorporateActionMovementReversalAdvice message to an account owner or its designated agent to reverse previously confirmed posting of securities or cash.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),
 * using the relevant elements in the business application header (BAH).
 * ISO 15022 - 20022 COEXISTENCE SUBSET
 * This message definition is a subset of an ISO 20022 message that was reversed engineered from ISO 15022. A subset is a message definition that is compatible with another definition, but is more restrictive.
 * The ISO 15022 and ISO 20022 standards will coexist for a number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. These restrictions, which are described by textual usage rules in the ISO 20022 message, have been made mandatory in this subset.
 * NOTE: The ISO 20022 message coexistence textual rules have been kept in the subset to explain why specific data types have been restricted. These textual rules are identified as follows: CoexistenceXxxxRule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementReversalAdvice002V05", propOrder = {
    "mvmntConfId",
    "othrDocId",
    "evtsLkg",
    "rvslRsn",
    "corpActnGnlInf",
    "acctDtls",
    "corpActnDtls",
    "corpActnConfDtls",
    "addtlInf",
    "issrAgt",
    "pngAgt",
    "subPngAgt",
    "splmtryData"
})
public class CorporateActionMovementReversalAdvice002V05 {

    @XmlElement(name = "MvmntConfId", required = true)
    protected DocumentIdentification19 mvmntConfId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification20> othrDocId;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionEventReference2> evtsLkg;
    @XmlElement(name = "RvslRsn")
    protected CorporateActionReversalReason2 rvslRsn;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation62 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountAndBalance8 acctDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction20 corpActnDtls;
    @XmlElement(name = "CorpActnConfDtls", required = true)
    protected CorporateActionOption48 corpActnConfDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative14 addtlInf;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification56Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification56Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification56Choice> subPngAgt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public CorporateActionMovementReversalAdvice002V05 setMvmntConfId(DocumentIdentification19 value) {
        this.mvmntConfId = value;
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
    public CorporateActionMovementReversalAdvice002V05 setRvslRsn(CorporateActionReversalReason2 value) {
        this.rvslRsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation62 }
     *     
     */
    public CorporateActionGeneralInformation62 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation62 }
     *     
     */
    public CorporateActionMovementReversalAdvice002V05 setCorpActnGnlInf(CorporateActionGeneralInformation62 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountAndBalance8 }
     *     
     */
    public AccountAndBalance8 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountAndBalance8 }
     *     
     */
    public CorporateActionMovementReversalAdvice002V05 setAcctDtls(AccountAndBalance8 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction20 }
     *     
     */
    public CorporateAction20 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction20 }
     *     
     */
    public CorporateActionMovementReversalAdvice002V05 setCorpActnDtls(CorporateAction20 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption48 }
     *     
     */
    public CorporateActionOption48 getCorpActnConfDtls() {
        return corpActnConfDtls;
    }

    /**
     * Sets the value of the corpActnConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption48 }
     *     
     */
    public CorporateActionMovementReversalAdvice002V05 setCorpActnConfDtls(CorporateActionOption48 value) {
        this.corpActnConfDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative14 }
     *     
     */
    public CorporateActionNarrative14 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative14 }
     *     
     */
    public CorporateActionMovementReversalAdvice002V05 setAddtlInf(CorporateActionNarrative14 value) {
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
     * {@link PartyIdentification56Choice }
     * 
     * 
     * @return
     *     The value of the issrAgt property.
     */
    public List<PartyIdentification56Choice> getIssrAgt() {
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
     * {@link PartyIdentification56Choice }
     * 
     * 
     * @return
     *     The value of the pngAgt property.
     */
    public List<PartyIdentification56Choice> getPngAgt() {
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
     * {@link PartyIdentification56Choice }
     * 
     * 
     * @return
     *     The value of the subPngAgt property.
     */
    public List<PartyIdentification56Choice> getSubPngAgt() {
        if (subPngAgt == null) {
            subPngAgt = new ArrayList<>();
        }
        return this.subPngAgt;
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
    public CorporateActionMovementReversalAdvice002V05 addOthrDocId(DocumentIdentification20 othrDocId) {
        getOthrDocId().add(othrDocId);
        return this;
    }

    /**
     * Adds a new item to the evtsLkg list.
     * @see #getEvtsLkg()
     * 
     */
    public CorporateActionMovementReversalAdvice002V05 addEvtsLkg(CorporateActionEventReference2 evtsLkg) {
        getEvtsLkg().add(evtsLkg);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public CorporateActionMovementReversalAdvice002V05 addIssrAgt(PartyIdentification56Choice issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the pngAgt list.
     * @see #getPngAgt()
     * 
     */
    public CorporateActionMovementReversalAdvice002V05 addPngAgt(PartyIdentification56Choice pngAgt) {
        getPngAgt().add(pngAgt);
        return this;
    }

    /**
     * Adds a new item to the subPngAgt list.
     * @see #getSubPngAgt()
     * 
     */
    public CorporateActionMovementReversalAdvice002V05 addSubPngAgt(PartyIdentification56Choice subPngAgt) {
        getSubPngAgt().add(subPngAgt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CorporateActionMovementReversalAdvice002V05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
