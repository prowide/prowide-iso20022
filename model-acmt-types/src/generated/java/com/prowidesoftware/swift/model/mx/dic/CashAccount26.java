
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
 * Account to or from which a cash entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount26", propOrder = {
    "id",
    "acctOwnr",
    "acctSvcr",
    "acctSvcrBrnch",
    "invstmtAcctTp",
    "acctOwnrOthrId"
})
public class CashAccount26 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentificationAndName3 id;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification2Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification2Choice acctSvcr;
    @XmlElement(name = "AcctSvcrBrnch")
    protected BranchData acctSvcrBrnch;
    @XmlElement(name = "InvstmtAcctTp")
    protected InvestmentAccountType1Choice invstmtAcctTp;
    @XmlElement(name = "AcctOwnrOthrId")
    protected List<GenericIdentification46> acctOwnrOthrId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName3 }
     *     
     */
    public AccountIdentificationAndName3 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName3 }
     *     
     */
    public CashAccount26 setId(AccountIdentificationAndName3 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public CashAccount26 setAcctOwnr(PartyIdentification2Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public CashAccount26 setAcctSvcr(PartyIdentification2Choice value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData }
     *     
     */
    public BranchData getAcctSvcrBrnch() {
        return acctSvcrBrnch;
    }

    /**
     * Sets the value of the acctSvcrBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData }
     *     
     */
    public CashAccount26 setAcctSvcrBrnch(BranchData value) {
        this.acctSvcrBrnch = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountType1Choice }
     *     
     */
    public InvestmentAccountType1Choice getInvstmtAcctTp() {
        return invstmtAcctTp;
    }

    /**
     * Sets the value of the invstmtAcctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountType1Choice }
     *     
     */
    public CashAccount26 setInvstmtAcctTp(InvestmentAccountType1Choice value) {
        this.invstmtAcctTp = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrOthrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctOwnrOthrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctOwnrOthrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification46 }
     * 
     * 
     */
    public List<GenericIdentification46> getAcctOwnrOthrId() {
        if (acctOwnrOthrId == null) {
            acctOwnrOthrId = new ArrayList<GenericIdentification46>();
        }
        return this.acctOwnrOthrId;
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
     * Adds a new item to the acctOwnrOthrId list.
     * @see #getAcctOwnrOthrId()
     * 
     */
    public CashAccount26 addAcctOwnrOthrId(GenericIdentification46 acctOwnrOthrId) {
        getAcctOwnrOthrId().add(acctOwnrOthrId);
        return this;
    }

}
