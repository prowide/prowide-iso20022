
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
 * Choice between a unique account identification and a set of account selection criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccountSelection1", propOrder = {
    "acctId",
    "othrAcctSelctnData"
})
public class InvestmentAccountSelection1 {

    @XmlElement(name = "AcctId")
    protected AccountIdentification1 acctId;
    @XmlElement(name = "OthrAcctSelctnData")
    protected InvestmentAccount19 othrAcctSelctnData;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1 }
     *     
     */
    public AccountIdentification1 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1 }
     *     
     */
    public InvestmentAccountSelection1 setAcctId(AccountIdentification1 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the othrAcctSelctnData property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount19 }
     *     
     */
    public InvestmentAccount19 getOthrAcctSelctnData() {
        return othrAcctSelctnData;
    }

    /**
     * Sets the value of the othrAcctSelctnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount19 }
     *     
     */
    public InvestmentAccountSelection1 setOthrAcctSelctnData(InvestmentAccount19 value) {
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
