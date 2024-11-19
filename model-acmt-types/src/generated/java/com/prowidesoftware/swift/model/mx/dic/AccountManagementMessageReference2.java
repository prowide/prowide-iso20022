
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the message reference of the account management instruction message for which the status is requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementMessageReference2", propOrder = {
    "lkdRef",
    "stsReqTp",
    "acctApplId",
    "invstmtAcct"
})
public class AccountManagementMessageReference2 {

    @XmlElement(name = "LkdRef")
    protected LinkedMessage2Choice lkdRef;
    @XmlElement(name = "StsReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected AccountManagementType1Code stsReqTp;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;
    @XmlElement(name = "InvstmtAcct")
    protected InvestmentAccount45 invstmtAcct;

    /**
     * Gets the value of the lkdRef property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedMessage2Choice }
     *     
     */
    public LinkedMessage2Choice getLkdRef() {
        return lkdRef;
    }

    /**
     * Sets the value of the lkdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedMessage2Choice }
     *     
     */
    public AccountManagementMessageReference2 setLkdRef(LinkedMessage2Choice value) {
        this.lkdRef = value;
        return this;
    }

    /**
     * Gets the value of the stsReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementType1Code }
     *     
     */
    public AccountManagementType1Code getStsReqTp() {
        return stsReqTp;
    }

    /**
     * Sets the value of the stsReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementType1Code }
     *     
     */
    public AccountManagementMessageReference2 setStsReqTp(AccountManagementType1Code value) {
        this.stsReqTp = value;
        return this;
    }

    /**
     * Gets the value of the acctApplId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctApplId() {
        return acctApplId;
    }

    /**
     * Sets the value of the acctApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountManagementMessageReference2 setAcctApplId(String value) {
        this.acctApplId = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount45 }
     *     
     */
    public InvestmentAccount45 getInvstmtAcct() {
        return invstmtAcct;
    }

    /**
     * Sets the value of the invstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount45 }
     *     
     */
    public AccountManagementMessageReference2 setInvstmtAcct(InvestmentAccount45 value) {
        this.invstmtAcct = value;
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
