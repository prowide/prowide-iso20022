
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
 * Choice of criteria for the identification of an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSelection1Choice", propOrder = {
    "acctId",
    "othrAcctSelctnData"
})
public class AccountSelection1Choice {

    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "OthrAcctSelctnData")
    protected InvestmentAccount52 othrAcctSelctnData;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountSelection1Choice setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the othrAcctSelctnData property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount52 }
     *     
     */
    public InvestmentAccount52 getOthrAcctSelctnData() {
        return othrAcctSelctnData;
    }

    /**
     * Sets the value of the othrAcctSelctnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount52 }
     *     
     */
    public AccountSelection1Choice setOthrAcctSelctnData(InvestmentAccount52 value) {
        this.othrAcctSelctnData = value;
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
