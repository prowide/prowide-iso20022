
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
 * The AccountMandateMaintenanceRequest message is sent from an organisation to a financial institution as part of the account maintenance process. It is the initial request message to update one or several accounts. Usage: this update is only about mandate information. 
 * If modification codes are not used: the organisation will specify under the “Mandate” and “Group” tags the complete information as it should be in the financial institution’s records after processing the update request. 
 * If modification codes are used (in that case, they must be used everywhere): the organisation will specify under the “Mandate” and “Group” tags which elements must be added, deleted, modified, or if they are unchanged.
 * It is not possible to update the account characteristics or organisation information with this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountMandateMaintenanceRequestV03", propOrder = {
    "refs",
    "fr",
    "ctrctDts",
    "undrlygMstrAgrmt",
    "acctId",
    "acctSvcrId",
    "orgId",
    "mndt",
    "grp",
    "addtlMsgInf",
    "dgtlSgntr",
    "splmtryData"
})
public class AccountMandateMaintenanceRequestV03 {

    @XmlElement(name = "Refs", required = true)
    protected References4 refs;
    @XmlElement(name = "Fr")
    protected OrganisationIdentification29 fr;
    @XmlElement(name = "CtrctDts")
    protected AccountContract2 ctrctDts;
    @XmlElement(name = "UndrlygMstrAgrmt")
    protected ContractDocument1 undrlygMstrAgrmt;
    @XmlElement(name = "AcctId", required = true)
    protected List<AccountForAction1> acctId;
    @XmlElement(name = "AcctSvcrId", required = true)
    protected BranchAndFinancialInstitutionIdentification6 acctSvcrId;
    @XmlElement(name = "OrgId", required = true)
    protected Organisation34 orgId;
    @XmlElement(name = "Mndt", required = true)
    protected List<OperationMandate5> mndt;
    @XmlElement(name = "Grp")
    protected List<Group3> grp;
    @XmlElement(name = "AddtlMsgInf")
    protected AdditionalInformation5 addtlMsgInf;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature3> dgtlSgntr;
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
    public AccountMandateMaintenanceRequestV03 setRefs(References4 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public OrganisationIdentification29 getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public AccountMandateMaintenanceRequestV03 setFr(OrganisationIdentification29 value) {
        this.fr = value;
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
    public AccountMandateMaintenanceRequestV03 setCtrctDts(AccountContract2 value) {
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
    public AccountMandateMaintenanceRequestV03 setUndrlygMstrAgrmt(ContractDocument1 value) {
        this.undrlygMstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctId property.
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
     */
    public List<AccountForAction1> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<AccountForAction1>();
        }
        return this.acctId;
    }

    /**
     * Gets the value of the acctSvcrId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctSvcrId() {
        return acctSvcrId;
    }

    /**
     * Sets the value of the acctSvcrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public AccountMandateMaintenanceRequestV03 setAcctSvcrId(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctSvcrId = value;
        return this;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation34 }
     *     
     */
    public Organisation34 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation34 }
     *     
     */
    public AccountMandateMaintenanceRequestV03 setOrgId(Organisation34 value) {
        this.orgId = value;
        return this;
    }

    /**
     * Gets the value of the mndt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mndt property.
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
     * {@link OperationMandate5 }
     * 
     * 
     */
    public List<OperationMandate5> getMndt() {
        if (mndt == null) {
            mndt = new ArrayList<OperationMandate5>();
        }
        return this.mndt;
    }

    /**
     * Gets the value of the grp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group3 }
     * 
     * 
     */
    public List<Group3> getGrp() {
        if (grp == null) {
            grp = new ArrayList<Group3>();
        }
        return this.grp;
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
    public AccountMandateMaintenanceRequestV03 setAddtlMsgInf(AdditionalInformation5 value) {
        this.addtlMsgInf = value;
        return this;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dgtlSgntr property.
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
     * {@link PartyAndSignature3 }
     * 
     * 
     */
    public List<PartyAndSignature3> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<PartyAndSignature3>();
        }
        return this.dgtlSgntr;
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
     * Adds a new item to the acctId list.
     * @see #getAcctId()
     * 
     */
    public AccountMandateMaintenanceRequestV03 addAcctId(AccountForAction1 acctId) {
        getAcctId().add(acctId);
        return this;
    }

    /**
     * Adds a new item to the mndt list.
     * @see #getMndt()
     * 
     */
    public AccountMandateMaintenanceRequestV03 addMndt(OperationMandate5 mndt) {
        getMndt().add(mndt);
        return this;
    }

    /**
     * Adds a new item to the grp list.
     * @see #getGrp()
     * 
     */
    public AccountMandateMaintenanceRequestV03 addGrp(Group3 grp) {
        getGrp().add(grp);
        return this;
    }

    /**
     * Adds a new item to the dgtlSgntr list.
     * @see #getDgtlSgntr()
     * 
     */
    public AccountMandateMaintenanceRequestV03 addDgtlSgntr(PartyAndSignature3 dgtlSgntr) {
        getDgtlSgntr().add(dgtlSgntr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AccountMandateMaintenanceRequestV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
