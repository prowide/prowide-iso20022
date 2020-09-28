
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
 * An account servicer sends a SecuritiesStatusOrStatementQueryStatusAdvice to an account owner to advise the status of a status query or statement query previously sent by the account owner.
 * The account servicer/owner relationship may be:
 * - a central securities depository or another settlement market infrastructure acting on behalf of their participants
 * - an agent (sub-custodian) acting on behalf of their global custodian customer, or
 * - a custodian acting on behalf of an investment management institution or a broker/dealer.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information.
 * using the relevant elements in the Business Application Header.
 * ISO 15022 - 20022 Coexistence Subset
 * This message definition is a subset of an ISO 20022 message that was reversed engineered from ISO 15022. A subset is a message definition that is compatible with another definition, but is more restrictive
 * The ISO 15022 and ISO 20022 standards will coexist for a number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. These restrictions, which are described by textual usage rules in the ISO 20022 message, have been made mandatory in this subset.  
 * NOTE: The ISO 20022 message coexistence textual rules have been kept in the subset to explain why specific data types have been restricted. These textual rules are identified as follows:  CoexistenceXxxxRule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesStatusOrStatementQueryStatusAdviceV02Subset", propOrder = {
    "qryRef",
    "acctOwnr",
    "sfkpgAcct",
    "stsOrStmtReqd",
    "prcgSts",
    "splmtryData"
})
public class SecuritiesStatusOrStatementQueryStatusAdviceV02Subset {

    @XmlElement(name = "QryRef", required = true)
    protected Identification4 qryRef;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification51Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount17 sfkpgAcct;
    @XmlElement(name = "StsOrStmtReqd")
    protected StatusOrStatement4Choice stsOrStmtReqd;
    @XmlElement(name = "PrcgSts", required = true)
    protected ProcessingStatus8Choice prcgSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link Identification4 }
     *     
     */
    public Identification4 getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification4 }
     *     
     */
    public SecuritiesStatusOrStatementQueryStatusAdviceV02Subset setQryRef(Identification4 value) {
        this.qryRef = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification51Choice }
     *     
     */
    public PartyIdentification51Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification51Choice }
     *     
     */
    public SecuritiesStatusOrStatementQueryStatusAdviceV02Subset setAcctOwnr(PartyIdentification51Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount17 }
     *     
     */
    public SecuritiesAccount17 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount17 }
     *     
     */
    public SecuritiesStatusOrStatementQueryStatusAdviceV02Subset setSfkpgAcct(SecuritiesAccount17 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the stsOrStmtReqd property.
     * 
     * @return
     *     possible object is
     *     {@link StatusOrStatement4Choice }
     *     
     */
    public StatusOrStatement4Choice getStsOrStmtReqd() {
        return stsOrStmtReqd;
    }

    /**
     * Sets the value of the stsOrStmtReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusOrStatement4Choice }
     *     
     */
    public SecuritiesStatusOrStatementQueryStatusAdviceV02Subset setStsOrStmtReqd(StatusOrStatement4Choice value) {
        this.stsOrStmtReqd = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus8Choice }
     *     
     */
    public ProcessingStatus8Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus8Choice }
     *     
     */
    public SecuritiesStatusOrStatementQueryStatusAdviceV02Subset setPrcgSts(ProcessingStatus8Choice value) {
        this.prcgSts = value;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesStatusOrStatementQueryStatusAdviceV02Subset addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
