
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
 * The AccountReport message is sent from a financial institution to an organisation for reporting purposes. It can be sent unsolicited as part of opening, maintenance, or closing process, or it can be sent as response to an AccountReportRequest message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReportV05", propOrder = {
    "refs",
    "fr",
    "acctSvcrId",
    "org",
    "rpt",
    "dgtlSgntr",
    "splmtryData"
})
public class AccountReportV05 {

    @XmlElement(name = "Refs", required = true)
    protected References5 refs;
    @XmlElement(name = "Fr")
    protected OrganisationIdentification39 fr;
    @XmlElement(name = "AcctSvcrId", required = true)
    protected BranchAndFinancialInstitutionIdentification8 acctSvcrId;
    @XmlElement(name = "Org", required = true)
    protected Organisation42 org;
    @XmlElement(name = "Rpt")
    protected List<AccountReport36> rpt;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature4> dgtlSgntr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link References5 }
     *     
     */
    public References5 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link References5 }
     *     
     */
    public AccountReportV05 setRefs(References5 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification39 }
     *     
     */
    public OrganisationIdentification39 getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification39 }
     *     
     */
    public AccountReportV05 setFr(OrganisationIdentification39 value) {
        this.fr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getAcctSvcrId() {
        return acctSvcrId;
    }

    /**
     * Sets the value of the acctSvcrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public AccountReportV05 setAcctSvcrId(BranchAndFinancialInstitutionIdentification8 value) {
        this.acctSvcrId = value;
        return this;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation42 }
     *     
     */
    public Organisation42 getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation42 }
     *     
     */
    public AccountReportV05 setOrg(Organisation42 value) {
        this.org = value;
        return this;
    }

    /**
     * Gets the value of the rpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountReport36 }
     * 
     * 
     */
    public List<AccountReport36> getRpt() {
        if (rpt == null) {
            rpt = new ArrayList<AccountReport36>();
        }
        return this.rpt;
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
     * {@link PartyAndSignature4 }
     * 
     * 
     */
    public List<PartyAndSignature4> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<PartyAndSignature4>();
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
     * Adds a new item to the rpt list.
     * @see #getRpt()
     * 
     */
    public AccountReportV05 addRpt(AccountReport36 rpt) {
        getRpt().add(rpt);
        return this;
    }

    /**
     * Adds a new item to the dgtlSgntr list.
     * @see #getDgtlSgntr()
     * 
     */
    public AccountReportV05 addDgtlSgntr(PartyAndSignature4 dgtlSgntr) {
        getDgtlSgntr().add(dgtlSgntr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AccountReportV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
