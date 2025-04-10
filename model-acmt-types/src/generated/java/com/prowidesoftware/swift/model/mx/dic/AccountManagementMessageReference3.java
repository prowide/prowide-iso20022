
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
 * Information about the references of an account management instruction message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementMessageReference3", propOrder = {
    "lkdRef",
    "stsReqTp",
    "acctApplId",
    "exstgAcctId",
    "invstmtAcct"
})
public class AccountManagementMessageReference3 {

    @XmlElement(name = "LkdRef")
    protected LinkedMessage3Choice lkdRef;
    @XmlElement(name = "StsReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected AccountManagementType1Code stsReqTp;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;
    @XmlElement(name = "ExstgAcctId")
    protected String exstgAcctId;
    @XmlElement(name = "InvstmtAcct")
    protected InvestmentAccount53 invstmtAcct;

    /**
     * Gets the value of the lkdRef property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedMessage3Choice }
     *     
     */
    public LinkedMessage3Choice getLkdRef() {
        return lkdRef;
    }

    /**
     * Sets the value of the lkdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedMessage3Choice }
     *     
     */
    public AccountManagementMessageReference3 setLkdRef(LinkedMessage3Choice value) {
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
    public AccountManagementMessageReference3 setStsReqTp(AccountManagementType1Code value) {
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
    public AccountManagementMessageReference3 setAcctApplId(String value) {
        this.acctApplId = value;
        return this;
    }

    /**
     * Gets the value of the exstgAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExstgAcctId() {
        return exstgAcctId;
    }

    /**
     * Sets the value of the exstgAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountManagementMessageReference3 setExstgAcctId(String value) {
        this.exstgAcctId = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount53 }
     *     
     */
    public InvestmentAccount53 getInvstmtAcct() {
        return invstmtAcct;
    }

    /**
     * Sets the value of the invstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount53 }
     *     
     */
    public AccountManagementMessageReference3 setInvstmtAcct(InvestmentAccount53 value) {
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
