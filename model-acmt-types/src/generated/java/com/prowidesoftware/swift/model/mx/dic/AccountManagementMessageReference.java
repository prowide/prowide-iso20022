
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
 * Information about the message reference of the account management instruction message for which the status is requested .
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementMessageReference", propOrder = {
    "othrRef",
    "prvsRef",
    "stsReqTp",
    "acctApplId",
    "invstmtAcct"
})
public class AccountManagementMessageReference {

    @XmlElement(name = "OthrRef")
    protected AdditionalReference3 othrRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "StsReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected AccountManagementType1Code stsReqTp;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;
    @XmlElement(name = "InvstmtAcct")
    protected InvestmentAccount14 invstmtAcct;

    /**
     * Gets the value of the othrRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getOthrRef() {
        return othrRef;
    }

    /**
     * Sets the value of the othrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AccountManagementMessageReference setOthrRef(AdditionalReference3 value) {
        this.othrRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AccountManagementMessageReference setPrvsRef(AdditionalReference3 value) {
        this.prvsRef = value;
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
    public AccountManagementMessageReference setStsReqTp(AccountManagementType1Code value) {
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
    public AccountManagementMessageReference setAcctApplId(String value) {
        this.acctApplId = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount14 }
     *     
     */
    public InvestmentAccount14 getInvstmtAcct() {
        return invstmtAcct;
    }

    /**
     * Sets the value of the invstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount14 }
     *     
     */
    public AccountManagementMessageReference setInvstmtAcct(InvestmentAccount14 value) {
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
