
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
 * Account and holding of the next sub-level (Level 6).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSubLevel6", propOrder = {
    "acctId",
    "acctOwnr",
    "acctSvcr",
    "bnfclOwnr",
    "balForAcct",
    "acctSubLvl7",
    "acctSubLvl7Diff",
    "agt",
    "splmtryData"
})
public class AccountSubLevel6 {

    @XmlElement(name = "AcctId", required = true)
    protected SecuritiesAccount19 acctId;
    @XmlElement(name = "AcctOwnr", required = true)
    protected PartyIdentification100 acctOwnr;
    @XmlElement(name = "AcctSvcr", required = true)
    protected PartyIdentification100 acctSvcr;
    @XmlElement(name = "BnfclOwnr")
    protected List<BeneficialOwner2> bnfclOwnr;
    @XmlElement(name = "BalForAcct")
    protected List<AggregateHoldingBalance1> balForAcct;
    @XmlElement(name = "AcctSubLvl7")
    protected List<AccountSubLevel7> acctSubLvl7;
    @XmlElement(name = "AcctSubLvl7Diff")
    protected List<AggregateHoldingBalance2> acctSubLvl7Diff;
    @XmlElement(name = "Agt")
    protected List<Intermediary29> agt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public AccountSubLevel6 setAcctId(SecuritiesAccount19 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public AccountSubLevel6 setAcctOwnr(PartyIdentification100 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public AccountSubLevel6 setAcctSvcr(PartyIdentification100 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the bnfclOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfclOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfclOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficialOwner2 }
     * 
     * 
     * @return
     *     The value of the bnfclOwnr property.
     */
    public List<BeneficialOwner2> getBnfclOwnr() {
        if (bnfclOwnr == null) {
            bnfclOwnr = new ArrayList<>();
        }
        return this.bnfclOwnr;
    }

    /**
     * Gets the value of the balForAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balForAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalForAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateHoldingBalance1 }
     * 
     * 
     * @return
     *     The value of the balForAcct property.
     */
    public List<AggregateHoldingBalance1> getBalForAcct() {
        if (balForAcct == null) {
            balForAcct = new ArrayList<>();
        }
        return this.balForAcct;
    }

    /**
     * Gets the value of the acctSubLvl7 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctSubLvl7 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctSubLvl7().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountSubLevel7 }
     * 
     * 
     * @return
     *     The value of the acctSubLvl7 property.
     */
    public List<AccountSubLevel7> getAcctSubLvl7() {
        if (acctSubLvl7 == null) {
            acctSubLvl7 = new ArrayList<>();
        }
        return this.acctSubLvl7;
    }

    /**
     * Gets the value of the acctSubLvl7Diff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctSubLvl7Diff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctSubLvl7Diff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateHoldingBalance2 }
     * 
     * 
     * @return
     *     The value of the acctSubLvl7Diff property.
     */
    public List<AggregateHoldingBalance2> getAcctSubLvl7Diff() {
        if (acctSubLvl7Diff == null) {
            acctSubLvl7Diff = new ArrayList<>();
        }
        return this.acctSubLvl7Diff;
    }

    /**
     * Gets the value of the agt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the agt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary29 }
     * 
     * 
     * @return
     *     The value of the agt property.
     */
    public List<Intermediary29> getAgt() {
        if (agt == null) {
            agt = new ArrayList<>();
        }
        return this.agt;
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
     * Adds a new item to the bnfclOwnr list.
     * @see #getBnfclOwnr()
     * 
     */
    public AccountSubLevel6 addBnfclOwnr(BeneficialOwner2 bnfclOwnr) {
        getBnfclOwnr().add(bnfclOwnr);
        return this;
    }

    /**
     * Adds a new item to the balForAcct list.
     * @see #getBalForAcct()
     * 
     */
    public AccountSubLevel6 addBalForAcct(AggregateHoldingBalance1 balForAcct) {
        getBalForAcct().add(balForAcct);
        return this;
    }

    /**
     * Adds a new item to the acctSubLvl7 list.
     * @see #getAcctSubLvl7()
     * 
     */
    public AccountSubLevel6 addAcctSubLvl7(AccountSubLevel7 acctSubLvl7) {
        getAcctSubLvl7().add(acctSubLvl7);
        return this;
    }

    /**
     * Adds a new item to the acctSubLvl7Diff list.
     * @see #getAcctSubLvl7Diff()
     * 
     */
    public AccountSubLevel6 addAcctSubLvl7Diff(AggregateHoldingBalance2 acctSubLvl7Diff) {
        getAcctSubLvl7Diff().add(acctSubLvl7Diff);
        return this;
    }

    /**
     * Adds a new item to the agt list.
     * @see #getAgt()
     * 
     */
    public AccountSubLevel6 addAgt(Intermediary29 agt) {
        getAgt().add(agt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AccountSubLevel6 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
