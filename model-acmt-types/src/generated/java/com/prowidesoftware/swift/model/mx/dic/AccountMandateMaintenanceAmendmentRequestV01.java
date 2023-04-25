
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
 * The AccountMandateMaintenanceAmendmentRequest message is sent from an organisation to a financial institution as part of the account maintenance process. It is sent in response to a request from the financial institution to send additional information. This update is only about mandate information.
 * Usage
 * This message should only be sent in response to a request from the financial institution. This update is only about mandate information. The organisation will specify under the Mandate tag the complete information as it should be in the financial institutions records after processing the update request. It is not possible to update the account characteristics or organisation information with this message.
 * It is possible to request to update the mandate information of several accounts, if these accounts must have exactly the same mandates.
 * This message could be sent together with other related documents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountMandateMaintenanceAmendmentRequestV01", propOrder = {
    "refs",
    "ctrctDts",
    "undrlygMstrAgrmt",
    "acctId",
    "acctSvcrId",
    "orgId",
    "mndt",
    "dgtlSgntr"
})
public class AccountMandateMaintenanceAmendmentRequestV01 {

    @XmlElement(name = "Refs", required = true)
    protected References4 refs;
    @XmlElement(name = "CtrctDts")
    protected AccountContract2 ctrctDts;
    @XmlElement(name = "UndrlygMstrAgrmt")
    protected ContractDocument1 undrlygMstrAgrmt;
    @XmlElement(name = "AcctId", required = true)
    protected List<AccountForAction1> acctId;
    @XmlElement(name = "AcctSvcrId", required = true)
    protected BranchAndFinancialInstitutionIdentification4 acctSvcrId;
    @XmlElement(name = "OrgId", required = true)
    protected List<OrganisationIdentification6> orgId;
    @XmlElement(name = "Mndt")
    protected List<OperationMandate1> mndt;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature1> dgtlSgntr;

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
    public AccountMandateMaintenanceAmendmentRequestV01 setRefs(References4 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the ctrctDts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountContract2 }
     *     
     */
    public AccountContract2 getCtrctDts() {
        return ctrctDts;
    }

    /**
     * Sets the value of the ctrctDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountContract2 }
     *     
     */
    public AccountMandateMaintenanceAmendmentRequestV01 setCtrctDts(AccountContract2 value) {
        this.ctrctDts = value;
        return this;
    }

    /**
     * Gets the value of the undrlygMstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDocument1 }
     *     
     */
    public ContractDocument1 getUndrlygMstrAgrmt() {
        return undrlygMstrAgrmt;
    }

    /**
     * Sets the value of the undrlygMstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDocument1 }
     *     
     */
    public AccountMandateMaintenanceAmendmentRequestV01 setUndrlygMstrAgrmt(ContractDocument1 value) {
        this.undrlygMstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountForAction1 }
     * 
     * 
     * @return
     *     The value of the acctId property.
     */
    public List<AccountForAction1> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<>();
        }
        return this.acctId;
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
    public AccountMandateMaintenanceAmendmentRequestV01 setAcctSvcrId(BranchAndFinancialInstitutionIdentification4 value) {
        this.acctSvcrId = value;
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
     * Gets the value of the mndt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mndt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMndt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationMandate1 }
     * 
     * 
     * @return
     *     The value of the mndt property.
     */
    public List<OperationMandate1> getMndt() {
        if (mndt == null) {
            mndt = new ArrayList<>();
        }
        return this.mndt;
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
     * Adds a new item to the acctId list.
     * @see #getAcctId()
     * 
     */
    public AccountMandateMaintenanceAmendmentRequestV01 addAcctId(AccountForAction1 acctId) {
        getAcctId().add(acctId);
        return this;
    }

    /**
     * Adds a new item to the orgId list.
     * @see #getOrgId()
     * 
     */
    public AccountMandateMaintenanceAmendmentRequestV01 addOrgId(OrganisationIdentification6 orgId) {
        getOrgId().add(orgId);
        return this;
    }

    /**
     * Adds a new item to the mndt list.
     * @see #getMndt()
     * 
     */
    public AccountMandateMaintenanceAmendmentRequestV01 addMndt(OperationMandate1 mndt) {
        getMndt().add(mndt);
        return this;
    }

    /**
     * Adds a new item to the dgtlSgntr list.
     * @see #getDgtlSgntr()
     * 
     */
    public AccountMandateMaintenanceAmendmentRequestV01 addDgtlSgntr(PartyAndSignature1 dgtlSgntr) {
        getDgtlSgntr().add(dgtlSgntr);
        return this;
    }

}
