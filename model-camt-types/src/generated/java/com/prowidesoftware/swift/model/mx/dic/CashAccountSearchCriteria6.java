
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
 * Defines the criteria used to search for an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountSearchCriteria6", propOrder = {
    "acctId",
    "tp",
    "ccy",
    "bal",
    "acctOwnr",
    "acctSvcr"
})
public class CashAccountSearchCriteria6 {

    @XmlElement(name = "AcctId")
    protected List<AccountIdentificationSearchCriteria2Choice> acctId;
    @XmlElement(name = "Tp")
    protected List<CashAccountType2Choice> tp;
    @XmlElement(name = "Ccy")
    protected List<String> ccy;
    @XmlElement(name = "Bal")
    protected List<CashBalance9> bal;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification125 acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification5 acctSvcr;

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
     * {@link AccountIdentificationSearchCriteria2Choice }
     * 
     * 
     */
    public List<AccountIdentificationSearchCriteria2Choice> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<AccountIdentificationSearchCriteria2Choice>();
        }
        return this.acctId;
    }

    /**
     * Gets the value of the tp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccountType2Choice }
     * 
     * 
     */
    public List<CashAccountType2Choice> getTp() {
        if (tp == null) {
            tp = new ArrayList<CashAccountType2Choice>();
        }
        return this.tp;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCcy() {
        if (ccy == null) {
            ccy = new ArrayList<String>();
        }
        return this.ccy;
    }

    /**
     * Gets the value of the bal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalance9 }
     * 
     * 
     */
    public List<CashBalance9> getBal() {
        if (bal == null) {
            bal = new ArrayList<CashBalance9>();
        }
        return this.bal;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125 }
     *     
     */
    public PartyIdentification125 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125 }
     *     
     */
    public CashAccountSearchCriteria6 setAcctOwnr(PartyIdentification125 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public CashAccountSearchCriteria6 setAcctSvcr(BranchAndFinancialInstitutionIdentification5 value) {
        this.acctSvcr = value;
        return this;
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
    public CashAccountSearchCriteria6 addAcctId(AccountIdentificationSearchCriteria2Choice acctId) {
        getAcctId().add(acctId);
        return this;
    }

    /**
     * Adds a new item to the tp list.
     * @see #getTp()
     * 
     */
    public CashAccountSearchCriteria6 addTp(CashAccountType2Choice tp) {
        getTp().add(tp);
        return this;
    }

    /**
     * Adds a new item to the ccy list.
     * @see #getCcy()
     * 
     */
    public CashAccountSearchCriteria6 addCcy(String ccy) {
        getCcy().add(ccy);
        return this;
    }

    /**
     * Adds a new item to the bal list.
     * @see #getBal()
     * 
     */
    public CashAccountSearchCriteria6 addBal(CashBalance9 bal) {
        getBal().add(bal);
        return this;
    }

}
