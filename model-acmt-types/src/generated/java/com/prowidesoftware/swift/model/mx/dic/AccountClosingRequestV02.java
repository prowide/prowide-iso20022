
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
 * The AccountClosingRequest message is sent from an organisation to a financial institution as part of the account closing process. It is the initial request message to close an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountClosingRequestV02", propOrder = {
    "refs",
    "fr",
    "acctId",
    "acctSvcrId",
    "orgId",
    "ctrctDts",
    "balTrfAcct",
    "trfAcctSvcrId",
    "dgtlSgntr",
    "splmtryData"
})
public class AccountClosingRequestV02 {

    @XmlElement(name = "Refs", required = true)
    protected References4 refs;
    @XmlElement(name = "Fr")
    protected OrganisationIdentification8 fr;
    @XmlElement(name = "AcctId", required = true)
    protected AccountForAction2 acctId;
    @XmlElement(name = "AcctSvcrId", required = true)
    protected BranchAndFinancialInstitutionIdentification5 acctSvcrId;
    @XmlElement(name = "OrgId", required = true)
    protected Organisation14 orgId;
    @XmlElement(name = "CtrctDts")
    protected AccountContract4 ctrctDts;
    @XmlElement(name = "BalTrfAcct")
    protected AccountForAction1 balTrfAcct;
    @XmlElement(name = "TrfAcctSvcrId")
    protected BranchAndFinancialInstitutionIdentification5 trfAcctSvcrId;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature2> dgtlSgntr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link References4 }
     *     
     */
    public References4 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link References4 }
     *     
     */
    public AccountClosingRequestV02 setRefs(References4 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification8 }
     *     
     */
    public OrganisationIdentification8 getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification8 }
     *     
     */
    public AccountClosingRequestV02 setFr(OrganisationIdentification8 value) {
        this.fr = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountForAction2 }
     *     
     */
    public AccountForAction2 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountForAction2 }
     *     
     */
    public AccountClosingRequestV02 setAcctId(AccountForAction2 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getAcctSvcrId() {
        return acctSvcrId;
    }

    /**
     * Sets the value of the acctSvcrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public AccountClosingRequestV02 setAcctSvcrId(BranchAndFinancialInstitutionIdentification5 value) {
        this.acctSvcrId = value;
        return this;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation14 }
     *     
     */
    public Organisation14 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation14 }
     *     
     */
    public AccountClosingRequestV02 setOrgId(Organisation14 value) {
        this.orgId = value;
        return this;
    }

    /**
     * Gets the value of the ctrctDts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountContract4 }
     *     
     */
    public AccountContract4 getCtrctDts() {
        return ctrctDts;
    }

    /**
     * Sets the value of the ctrctDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountContract4 }
     *     
     */
    public AccountClosingRequestV02 setCtrctDts(AccountContract4 value) {
        this.ctrctDts = value;
        return this;
    }

    /**
     * Gets the value of the balTrfAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountForAction1 }
     *     
     */
    public AccountForAction1 getBalTrfAcct() {
        return balTrfAcct;
    }

    /**
     * Sets the value of the balTrfAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountForAction1 }
     *     
     */
    public AccountClosingRequestV02 setBalTrfAcct(AccountForAction1 value) {
        this.balTrfAcct = value;
        return this;
    }

    /**
     * Gets the value of the trfAcctSvcrId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getTrfAcctSvcrId() {
        return trfAcctSvcrId;
    }

    /**
     * Sets the value of the trfAcctSvcrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public AccountClosingRequestV02 setTrfAcctSvcrId(BranchAndFinancialInstitutionIdentification5 value) {
        this.trfAcctSvcrId = value;
        return this;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgtlSgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndSignature2 }
     * 
     * 
     * @return
     *     The value of the dgtlSgntr property.
     */
    public List<PartyAndSignature2> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<>();
        }
        return this.dgtlSgntr;
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
     * Adds a new item to the dgtlSgntr list.
     * @see #getDgtlSgntr()
     * 
     */
    public AccountClosingRequestV02 addDgtlSgntr(PartyAndSignature2 dgtlSgntr) {
        getDgtlSgntr().add(dgtlSgntr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AccountClosingRequestV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
