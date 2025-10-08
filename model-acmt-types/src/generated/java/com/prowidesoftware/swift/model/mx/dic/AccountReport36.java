
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
 * Reports to a corporate on the actual set-up of the account, related services and mandates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReport36", propOrder = {
    "acct",
    "undrlygMstrAgrmt",
    "ctrctDts",
    "mndt",
    "grp",
    "refAcct",
    "balTrfAcct",
    "trfAcctSvcrId"
})
public class AccountReport36 {

    @XmlElement(name = "Acct", required = true)
    protected CustomerAccount5 acct;
    @XmlElement(name = "UndrlygMstrAgrmt")
    protected ContractDocument1 undrlygMstrAgrmt;
    @XmlElement(name = "CtrctDts")
    protected AccountContract3 ctrctDts;
    @XmlElement(name = "Mndt")
    protected List<OperationMandate7> mndt;
    @XmlElement(name = "Grp")
    protected List<Group6> grp;
    @XmlElement(name = "RefAcct")
    protected CashAccount40 refAcct;
    @XmlElement(name = "BalTrfAcct")
    protected AccountForAction1 balTrfAcct;
    @XmlElement(name = "TrfAcctSvcrId")
    protected BranchAndFinancialInstitutionIdentification8 trfAcctSvcrId;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount5 }
     *     
     */
    public CustomerAccount5 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount5 }
     *     
     */
    public AccountReport36 setAcct(CustomerAccount5 value) {
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
    public AccountReport36 setUndrlygMstrAgrmt(ContractDocument1 value) {
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
    public AccountReport36 setCtrctDts(AccountContract3 value) {
        this.ctrctDts = value;
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
     * {@link OperationMandate7 }
     * 
     * 
     */
    public List<OperationMandate7> getMndt() {
        if (mndt == null) {
            mndt = new ArrayList<OperationMandate7>();
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
     * {@link Group6 }
     * 
     * 
     */
    public List<Group6> getGrp() {
        if (grp == null) {
            grp = new ArrayList<Group6>();
        }
        return this.grp;
    }

    /**
     * Gets the value of the refAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getRefAcct() {
        return refAcct;
    }

    /**
     * Sets the value of the refAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public AccountReport36 setRefAcct(CashAccount40 value) {
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
    public AccountReport36 setBalTrfAcct(AccountForAction1 value) {
        this.balTrfAcct = value;
        return this;
    }

    /**
     * Gets the value of the trfAcctSvcrId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getTrfAcctSvcrId() {
        return trfAcctSvcrId;
    }

    /**
     * Sets the value of the trfAcctSvcrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public AccountReport36 setTrfAcctSvcrId(BranchAndFinancialInstitutionIdentification8 value) {
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
    public AccountReport36 addMndt(OperationMandate7 mndt) {
        getMndt().add(mndt);
        return this;
    }

    /**
     * Adds a new item to the grp list.
     * @see #getGrp()
     * 
     */
    public AccountReport36 addGrp(Group6 grp) {
        getGrp().add(grp);
        return this;
    }

}
