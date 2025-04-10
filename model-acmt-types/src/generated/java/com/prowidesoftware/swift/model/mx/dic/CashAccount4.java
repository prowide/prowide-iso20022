
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
@XmlType(name = "CashAccount4", propOrder = {
    "id",
    "acctOwnr",
    "acctSvcr",
    "acctSvcrBrnch",
    "invstmtAcctTp",
    "xtndedInvstmtAcctTp"
})
public class CashAccount4 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentificationAndName3 id;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification2Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification2Choice acctSvcr;
    @XmlElement(name = "AcctSvcrBrnch")
    protected BranchData acctSvcrBrnch;
    @XmlElement(name = "InvstmtAcctTp")
    @XmlSchemaType(name = "string")
    protected FundCashAccount2Code invstmtAcctTp;
    @XmlElement(name = "XtndedInvstmtAcctTp")
    protected String xtndedInvstmtAcctTp;

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
    public CashAccount4 setId(AccountIdentificationAndName3 value) {
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
    public CashAccount4 setAcctOwnr(PartyIdentification2Choice value) {
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
    public CashAccount4 setAcctSvcr(PartyIdentification2Choice value) {
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
    public CashAccount4 setAcctSvcrBrnch(BranchData value) {
        this.acctSvcrBrnch = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctTp property.
     * 
     * @return
     *     possible object is
     *     {@link FundCashAccount2Code }
     *     
     */
    public FundCashAccount2Code getInvstmtAcctTp() {
        return invstmtAcctTp;
    }

    /**
     * Sets the value of the invstmtAcctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundCashAccount2Code }
     *     
     */
    public CashAccount4 setInvstmtAcctTp(FundCashAccount2Code value) {
        this.invstmtAcctTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedInvstmtAcctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedInvstmtAcctTp() {
        return xtndedInvstmtAcctTp;
    }

    /**
     * Sets the value of the xtndedInvstmtAcctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccount4 setXtndedInvstmtAcctTp(String value) {
        this.xtndedInvstmtAcctTp = value;
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

}
