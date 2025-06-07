
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
 * Information about the type of request or instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementConfirmation3", propOrder = {
    "confTp",
    "acctApplId",
    "clntRef",
    "ctrPtyRef",
    "exstgAcctId"
})
public class AccountManagementConfirmation3 {

    @XmlElement(name = "ConfTp", required = true)
    @XmlSchemaType(name = "string")
    protected AccountManagementType2Code confTp;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "CtrPtyRef")
    protected AdditionalReference6 ctrPtyRef;
    @XmlElement(name = "ExstgAcctId")
    protected String exstgAcctId;

    /**
     * Gets the value of the confTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementType2Code }
     *     
     */
    public AccountManagementType2Code getConfTp() {
        return confTp;
    }

    /**
     * Sets the value of the confTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementType2Code }
     *     
     */
    public AccountManagementConfirmation3 setConfTp(AccountManagementType2Code value) {
        this.confTp = value;
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
    public AccountManagementConfirmation3 setAcctApplId(String value) {
        this.acctApplId = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountManagementConfirmation3 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AdditionalReference6 getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AccountManagementConfirmation3 setCtrPtyRef(AdditionalReference6 value) {
        this.ctrPtyRef = value;
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
    public AccountManagementConfirmation3 setExstgAcctId(String value) {
        this.exstgAcctId = value;
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
