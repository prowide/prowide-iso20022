
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
 * Message used to report to a corporate on the actual set up up of the account, related services and mandates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReport1", propOrder = {
    "acct",
    "undrlygMstrAgrmt",
    "ctrctDts",
    "mndt",
    "refAcct",
    "balTrfAcct",
    "trfAcctSvcrId"
})
public class AccountReport1 {

    @XmlElement(name = "Acct", required = true)
    protected CustomerAccount1 acct;
    @XmlElement(name = "UndrlygMstrAgrmt")
    protected ContractDocument1 undrlygMstrAgrmt;
    @XmlElement(name = "CtrctDts")
    protected AccountContract3 ctrctDts;
    @XmlElement(name = "Mndt")
    protected List<OperationMandate1> mndt;
    @XmlElement(name = "RefAcct")
    protected CashAccount16 refAcct;
    @XmlElement(name = "BalTrfAcct")
    protected AccountForAction1 balTrfAcct;
    @XmlElement(name = "TrfAcctSvcrId")
    protected BranchAndFinancialInstitutionIdentification4 trfAcctSvcrId;

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
    public AccountReport1 setAcct(CustomerAccount1 value) {
        this.acct = value;
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
    public AccountReport1 setUndrlygMstrAgrmt(ContractDocument1 value) {
        this.undrlygMstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the ctrctDts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountContract3 }
     *     
     */
    public AccountContract3 getCtrctDts() {
        return ctrctDts;
    }

    /**
     * Sets the value of the ctrctDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountContract3 }
     *     
     */
    public AccountReport1 setCtrctDts(AccountContract3 value) {
        this.ctrctDts = value;
        return this;
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
     * Gets the value of the refAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getRefAcct() {
        return refAcct;
    }

    /**
     * Sets the value of the refAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public AccountReport1 setRefAcct(CashAccount16 value) {
        this.refAcct = value;
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
    public AccountReport1 setBalTrfAcct(AccountForAction1 value) {
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
    public AccountReport1 setTrfAcctSvcrId(BranchAndFinancialInstitutionIdentification4 value) {
        this.trfAcctSvcrId = value;
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
     * Adds a new item to the mndt list.
     * @see #getMndt()
     * 
     */
    public AccountReport1 addMndt(OperationMandate1 mndt) {
        getMndt().add(mndt);
        return this;
    }

}
