
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
 * The AccountClosingAdditionalInformationRequest message is sent from a financial institution to an organisation as part of the account closing process.
 * Usage
 * This message is sent in response to an closing request message from the organisation, if the business content is valid, but additional information is required.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountClosingAdditionalInformationRequestV01", propOrder = {
    "refs",
    "orgId",
    "acctId",
    "acctSvcrId",
    "balTrfAcct",
    "trfAcctSvcrId",
    "dgtlSgntr"
})
public class AccountClosingAdditionalInformationRequestV01 {

    @XmlElement(name = "Refs", required = true)
    protected References3 refs;
    @XmlElement(name = "OrgId", required = true)
    protected List<OrganisationIdentification6> orgId;
    @XmlElement(name = "AcctId", required = true)
    protected AccountForAction1 acctId;
    @XmlElement(name = "AcctSvcrId", required = true)
    protected BranchAndFinancialInstitutionIdentification4 acctSvcrId;
    @XmlElement(name = "BalTrfAcct")
    protected AccountForAction1 balTrfAcct;
    @XmlElement(name = "TrfAcctSvcrId")
    protected BranchAndFinancialInstitutionIdentification4 trfAcctSvcrId;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature1> dgtlSgntr;

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link References3 }
     *     
     */
    public References3 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link References3 }
     *     
     */
    public AccountClosingAdditionalInformationRequestV01 setRefs(References3 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationIdentification6 }
     * 
     * 
     * @return
     *     The value of the orgId property.
     */
    public List<OrganisationIdentification6> getOrgId() {
        if (orgId == null) {
            orgId = new ArrayList<>();
        }
        return this.orgId;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountForAction1 }
     *     
     */
    public AccountForAction1 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountForAction1 }
     *     
     */
    public AccountClosingAdditionalInformationRequestV01 setAcctId(AccountForAction1 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getAcctSvcrId() {
        return acctSvcrId;
    }

    /**
     * Sets the value of the acctSvcrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public AccountClosingAdditionalInformationRequestV01 setAcctSvcrId(BranchAndFinancialInstitutionIdentification4 value) {
        this.acctSvcrId = value;
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
    public AccountClosingAdditionalInformationRequestV01 setBalTrfAcct(AccountForAction1 value) {
        this.balTrfAcct = value;
        return this;
    }

    /**
     * Gets the value of the trfAcctSvcrId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getTrfAcctSvcrId() {
        return trfAcctSvcrId;
    }

    /**
     * Sets the value of the trfAcctSvcrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public AccountClosingAdditionalInformationRequestV01 setTrfAcctSvcrId(BranchAndFinancialInstitutionIdentification4 value) {
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
     * {@link PartyAndSignature1 }
     * 
     * 
     * @return
     *     The value of the dgtlSgntr property.
     */
    public List<PartyAndSignature1> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<>();
        }
        return this.dgtlSgntr;
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
     * Adds a new item to the orgId list.
     * @see #getOrgId()
     * 
     */
    public AccountClosingAdditionalInformationRequestV01 addOrgId(OrganisationIdentification6 orgId) {
        getOrgId().add(orgId);
        return this;
    }

    /**
     * Adds a new item to the dgtlSgntr list.
     * @see #getDgtlSgntr()
     * 
     */
    public AccountClosingAdditionalInformationRequestV01 addDgtlSgntr(PartyAndSignature1 dgtlSgntr) {
        getDgtlSgntr().add(dgtlSgntr);
        return this;
    }

}
