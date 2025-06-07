
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
 * An account owner sends a IntraPositionMovementInstruction to an account servicer to instruct the movement of securities within its holding from one sub-balance to another, for example, blocking of securities.
 * The account owner/servicer relationship may be:
 * - a global custodian which has an account with its local agent (sub-custodian), or
 * - an investment management institution which manage a fund account opened at a custodian, or
 * - a broker which has an account with a custodian, or
 * - a central securities depository participant which has an account with a central securities depository, or
 * - a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information.
 * using the relevant elements in the Business Application Header.
 * ISO 15022 - 20022 Coexistence
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionMovementInstructionV03", propOrder = {
    "txId",
    "corpActnEvtId",
    "nbCounts",
    "lnkgs",
    "acctOwnr",
    "sfkpgAcct",
    "sfkpgPlc",
    "finInstrmId",
    "finInstrmAttrbts",
    "intraPosDtls",
    "splmtryData"
})
public class IntraPositionMovementInstructionV03 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "CorpActnEvtId")
    protected Identification1 corpActnEvtId;
    @XmlElement(name = "NbCounts")
    protected NumberCount1Choice nbCounts;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages19> lnkgs;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification36Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount13 sfkpgAcct;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat3Choice sfkpgPlc;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes36 finInstrmAttrbts;
    @XmlElement(name = "IntraPosDtls", required = true)
    protected IntraPositionDetails21 intraPosDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IntraPositionMovementInstructionV03 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link Identification1 }
     *     
     */
    public Identification1 getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Sets the value of the corpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification1 }
     *     
     */
    public IntraPositionMovementInstructionV03 setCorpActnEvtId(Identification1 value) {
        this.corpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the nbCounts property.
     * 
     * @return
     *     possible object is
     *     {@link NumberCount1Choice }
     *     
     */
    public NumberCount1Choice getNbCounts() {
        return nbCounts;
    }

    /**
     * Sets the value of the nbCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberCount1Choice }
     *     
     */
    public IntraPositionMovementInstructionV03 setNbCounts(NumberCount1Choice value) {
        this.nbCounts = value;
        return this;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages19 }
     * 
     * 
     */
    public List<Linkages19> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<Linkages19>();
        }
        return this.lnkgs;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification36Choice }
     *     
     */
    public PartyIdentification36Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification36Choice }
     *     
     */
    public IntraPositionMovementInstructionV03 setAcctOwnr(PartyIdentification36Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount13 }
     *     
     */
    public SecuritiesAccount13 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount13 }
     *     
     */
    public IntraPositionMovementInstructionV03 setSfkpgAcct(SecuritiesAccount13 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat3Choice }
     *     
     */
    public SafekeepingPlaceFormat3Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat3Choice }
     *     
     */
    public IntraPositionMovementInstructionV03 setSfkpgPlc(SafekeepingPlaceFormat3Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public IntraPositionMovementInstructionV03 setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes36 }
     *     
     */
    public FinancialInstrumentAttributes36 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes36 }
     *     
     */
    public IntraPositionMovementInstructionV03 setFinInstrmAttrbts(FinancialInstrumentAttributes36 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the intraPosDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionDetails21 }
     *     
     */
    public IntraPositionDetails21 getIntraPosDtls() {
        return intraPosDtls;
    }

    /**
     * Sets the value of the intraPosDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionDetails21 }
     *     
     */
    public IntraPositionMovementInstructionV03 setIntraPosDtls(IntraPositionDetails21 value) {
        this.intraPosDtls = value;
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
     * Adds a new item to the lnkgs list.
     * @see #getLnkgs()
     * 
     */
    public IntraPositionMovementInstructionV03 addLnkgs(Linkages19 lnkgs) {
        getLnkgs().add(lnkgs);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public IntraPositionMovementInstructionV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
