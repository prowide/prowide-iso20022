
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
 * Defines the elements used to uniquely identify a risk management limit defined in the system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitIdentification9", propOrder = {
    "sysId",
    "tp",
    "acctOwnr",
    "acctId"
})
public class LimitIdentification9 {

    @XmlElement(name = "SysId")
    protected SystemIdentification2Choice sysId;
    @XmlElement(name = "Tp", required = true)
    protected LimitType1Choice tp;
    @XmlElement(name = "AcctOwnr")
    protected BranchAndFinancialInstitutionIdentification8 acctOwnr;
    @XmlElement(name = "AcctId")
    protected AccountIdentification4Choice acctId;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public SystemIdentification2Choice getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public LimitIdentification9 setSysId(SystemIdentification2Choice value) {
        this.sysId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link LimitType1Choice }
     *     
     */
    public LimitType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitType1Choice }
     *     
     */
    public LimitIdentification9 setTp(LimitType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public LimitIdentification9 setAcctOwnr(BranchAndFinancialInstitutionIdentification8 value) {
        this.acctOwnr = value;
        return this;
    }

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
    public LimitIdentification9 setAcctId(AccountIdentification4Choice value) {
        this.acctId = value;
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
