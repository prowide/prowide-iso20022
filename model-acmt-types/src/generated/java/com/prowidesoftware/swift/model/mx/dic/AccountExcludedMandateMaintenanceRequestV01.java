
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
 * This AccountExcludedMandateMaintenanceRequest message is sent from an organisation to a financial institution as part of the account maintenance process. It is the initial request message to update an account.
 * Usage
 * This update is about account details excluding any mandate information. The organisation will specify under the Account and Organisation tags the complete information as it should be in the financial institutions records after processing the update request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountExcludedMandateMaintenanceRequestV01", propOrder = {
    "refs",
    "ctrctDts",
    "undrlygMstrAgrmt",
    "acct",
    "acctSvcrId",
    "org",
    "addtlMsgInf",
    "dgtlSgntr"
})
public class AccountExcludedMandateMaintenanceRequestV01 {

    @XmlElement(name = "Refs", required = true)
    protected References4 refs;
    @XmlElement(name = "CtrctDts")
    protected AccountContract2 ctrctDts;
    @XmlElement(name = "UndrlygMstrAgrmt")
    protected ContractDocument1 undrlygMstrAgrmt;
    @XmlElement(name = "Acct", required = true)
    protected CustomerAccount1 acct;
    @XmlElement(name = "AcctSvcrId", required = true)
    protected BranchAndFinancialInstitutionIdentification4 acctSvcrId;
    @XmlElement(name = "Org", required = true)
    protected List<Organisation6> org;
    @XmlElement(name = "AddtlMsgInf")
    protected AdditionalInformation5 addtlMsgInf;
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
    public AccountExcludedMandateMaintenanceRequestV01 setRefs(References4 value) {
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
    public AccountExcludedMandateMaintenanceRequestV01 setCtrctDts(AccountContract2 value) {
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
    public AccountExcludedMandateMaintenanceRequestV01 setUndrlygMstrAgrmt(ContractDocument1 value) {
        this.undrlygMstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount1 }
     *     
     */
    public CustomerAccount1 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount1 }
     *     
     */
    public AccountExcludedMandateMaintenanceRequestV01 setAcct(CustomerAccount1 value) {
        this.acct = value;
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
    public AccountExcludedMandateMaintenanceRequestV01 setAcctSvcrId(BranchAndFinancialInstitutionIdentification4 value) {
        this.acctSvcrId = value;
        return this;
    }

    /**
     * Gets the value of the org property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the org property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation6 }
     * 
     * 
     * @return
     *     The value of the org property.
     */
    public List<Organisation6> getOrg() {
        if (org == null) {
            org = new ArrayList<>();
        }
        return this.org;
    }

    /**
     * Gets the value of the addtlMsgInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation5 }
     *     
     */
    public AdditionalInformation5 getAddtlMsgInf() {
        return addtlMsgInf;
    }

    /**
     * Sets the value of the addtlMsgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation5 }
     *     
     */
    public AccountExcludedMandateMaintenanceRequestV01 setAddtlMsgInf(AdditionalInformation5 value) {
        this.addtlMsgInf = value;
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
     * Adds a new item to the org list.
     * @see #getOrg()
     * 
     */
    public AccountExcludedMandateMaintenanceRequestV01 addOrg(Organisation6 org) {
        getOrg().add(org);
        return this;
    }

    /**
     * Adds a new item to the dgtlSgntr list.
     * @see #getDgtlSgntr()
     * 
     */
    public AccountExcludedMandateMaintenanceRequestV01 addDgtlSgntr(PartyAndSignature1 dgtlSgntr) {
        getDgtlSgntr().add(dgtlSgntr);
        return this;
    }

}
