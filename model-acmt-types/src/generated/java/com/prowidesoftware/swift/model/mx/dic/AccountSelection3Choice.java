
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "AccountSelection3Choice", propOrder = {
    "acctId",
    "othrAcctSelctnData"
})
public class AccountSelection3Choice {

    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "OthrAcctSelctnData")
    protected InvestmentAccount76 othrAcctSelctnData;

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
    public AccountSelection3Choice setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the othrAcctSelctnData property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount76 }
     *     
     */
    public InvestmentAccount76 getOthrAcctSelctnData() {
        return othrAcctSelctnData;
    }

    /**
     * Sets the value of the othrAcctSelctnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount76 }
     *     
     */
    public AccountSelection3Choice setOthrAcctSelctnData(InvestmentAccount76 value) {
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
