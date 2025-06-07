
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
 * Owner of the account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderIdentification1", propOrder = {
    "stgOrdrRef",
    "acctId",
    "acctTp",
    "acctOwnr"
})
public class StandingOrderIdentification1 {

    @XmlElement(name = "StgOrdrRef")
    protected String stgOrdrRef;
    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentification1Choice acctId;
    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CashAccountType2Code acctTp;
    @XmlElement(name = "AcctOwnr")
    protected String acctOwnr;

    /**
     * Gets the value of the stgOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStgOrdrRef() {
        return stgOrdrRef;
    }

    /**
     * Sets the value of the stgOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StandingOrderIdentification1 setStgOrdrRef(String value) {
        this.stgOrdrRef = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public AccountIdentification1Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public StandingOrderIdentification1 setAcctId(AccountIdentification1Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2Code }
     *     
     */
    public CashAccountType2Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2Code }
     *     
     */
    public StandingOrderIdentification1 setAcctTp(CashAccountType2Code value) {
        this.acctTp = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StandingOrderIdentification1 setAcctOwnr(String value) {
        this.acctOwnr = value;
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
