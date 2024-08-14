
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reports either on the account information or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReport17", propOrder = {
    "acctId",
    "acctOrErr"
})
public class AccountReport17 {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentification4Choice acctId;
    @XmlElement(name = "AcctOrErr", required = true)
    protected AccountOrBusinessError2Choice acctOrErr;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountReport17 setAcctId(AccountIdentification4Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOrBusinessError2Choice }
     *     
     */
    public AccountOrBusinessError2Choice getAcctOrErr() {
        return acctOrErr;
    }

    /**
     * Sets the value of the acctOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOrBusinessError2Choice }
     *     
     */
    public AccountReport17 setAcctOrErr(AccountOrBusinessError2Choice value) {
        this.acctOrErr = value;
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
