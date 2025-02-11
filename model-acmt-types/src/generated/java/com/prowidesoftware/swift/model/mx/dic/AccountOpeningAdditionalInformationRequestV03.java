
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
 * The AccountOpeningAdditionalInformationRequest message is sent from a financial institution to an organisation as part of the account opening process. This message is sent in response to an opening request message from the organisation, if the business content is valid, but additional information is required.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountOpeningAdditionalInformationRequestV03", propOrder = {
    "refs",
    "fr",
    "orgId",
    "acct",
    "acctSvcrId",
    "undrlygMstrAgrmt",
    "dgtlSgntr",
    "splmtryData"
})
public class AccountOpeningAdditionalInformationRequestV03 {

    @XmlElement(name = "Refs", required = true)
    protected References3 refs;
    @XmlElement(name = "Fr")
    protected OrganisationIdentification29 fr;
    @XmlElement(name = "OrgId", required = true)
    protected OrganisationIdentification29 orgId;
    @XmlElement(name = "Acct", required = true)
    protected CustomerAccount4 acct;
    @XmlElement(name = "AcctSvcrId", required = true)
    protected BranchAndFinancialInstitutionIdentification6 acctSvcrId;
    @XmlElement(name = "UndrlygMstrAgrmt")
    protected ContractDocument1 undrlygMstrAgrmt;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature3> dgtlSgntr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public AccountOpeningAdditionalInformationRequestV03 setRefs(References3 value) {
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
    public AccountOpeningAdditionalInformationRequestV03 setFr(OrganisationIdentification29 value) {
        this.fr = value;
        return this;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public OrganisationIdentification29 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public AccountOpeningAdditionalInformationRequestV03 setOrgId(OrganisationIdentification29 value) {
        this.orgId = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount4 }
     *     
     */
    public CustomerAccount4 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount4 }
     *     
     */
    public AccountOpeningAdditionalInformationRequestV03 setAcct(CustomerAccount4 value) {
        this.acct = value;
        return this;
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
    public AccountOpeningAdditionalInformationRequestV03 setAcctSvcrId(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctSvcrId = value;
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
    public AccountOpeningAdditionalInformationRequestV03 setUndrlygMstrAgrmt(ContractDocument1 value) {
        this.undrlygMstrAgrmt = value;
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
     * {@link PartyAndSignature3 }
     * 
     * 
     * @return
     *     The value of the dgtlSgntr property.
     */
    public List<PartyAndSignature3> getDgtlSgntr() {
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
    public AccountOpeningAdditionalInformationRequestV03 addDgtlSgntr(PartyAndSignature3 dgtlSgntr) {
        getDgtlSgntr().add(dgtlSgntr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AccountOpeningAdditionalInformationRequestV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
