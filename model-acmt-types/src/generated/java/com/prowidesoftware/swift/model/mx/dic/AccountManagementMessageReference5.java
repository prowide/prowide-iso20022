
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
 * Information about the references of an account management instruction message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementMessageReference5", propOrder = {
    "lkdRef",
    "stsReqTp",
    "acctApplId",
    "exstgAcctId",
    "invstmtAcct"
})
public class AccountManagementMessageReference5 {

    @XmlElement(name = "LkdRef")
    protected LinkedMessage5Choice lkdRef;
    @XmlElement(name = "StsReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected AccountManagementType3Code stsReqTp;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;
    @XmlElement(name = "ExstgAcctId")
    protected Account23 exstgAcctId;
    @XmlElement(name = "InvstmtAcct")
    protected InvestmentAccount77 invstmtAcct;

    /**
     * Gets the value of the lkdRef property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedMessage5Choice }
     *     
     */
    public LinkedMessage5Choice getLkdRef() {
        return lkdRef;
    }

    /**
     * Sets the value of the lkdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedMessage5Choice }
     *     
     */
    public AccountManagementMessageReference5 setLkdRef(LinkedMessage5Choice value) {
        this.lkdRef = value;
        return this;
    }

    /**
     * Gets the value of the stsReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementType3Code }
     *     
     */
    public AccountManagementType3Code getStsReqTp() {
        return stsReqTp;
    }

    /**
     * Sets the value of the stsReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementType3Code }
     *     
     */
    public AccountManagementMessageReference5 setStsReqTp(AccountManagementType3Code value) {
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
    public AccountManagementMessageReference5 setAcctApplId(String value) {
        this.acctApplId = value;
        return this;
    }

    /**
     * Gets the value of the exstgAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Account23 }
     *     
     */
    public Account23 getExstgAcctId() {
        return exstgAcctId;
    }

    /**
     * Sets the value of the exstgAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account23 }
     *     
     */
    public AccountManagementMessageReference5 setExstgAcctId(Account23 value) {
        this.exstgAcctId = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount77 }
     *     
     */
    public InvestmentAccount77 getInvstmtAcct() {
        return invstmtAcct;
    }

    /**
     * Sets the value of the invstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount77 }
     *     
     */
    public AccountManagementMessageReference5 setInvstmtAcct(InvestmentAccount77 value) {
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
