
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
 * Search for a system and a member of a system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "System3", propOrder = {
    "sysId",
    "mmbId",
    "ctry",
    "acctId"
})
public class System3 {

    @XmlElement(name = "SysId")
    protected MarketInfrastructureIdentification1Choice sysId;
    @XmlElement(name = "MmbId")
    protected BranchAndFinancialInstitutionIdentification8 mmbId;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "AcctId")
    protected AccountIdentification4Choice acctId;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketInfrastructureIdentification1Choice }
     *     
     */
    public MarketInfrastructureIdentification1Choice getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketInfrastructureIdentification1Choice }
     *     
     */
    public System3 setSysId(MarketInfrastructureIdentification1Choice value) {
        this.sysId = value;
        return this;
    }

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public System3 setMmbId(BranchAndFinancialInstitutionIdentification8 value) {
        this.mmbId = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public System3 setCtry(String value) {
        this.ctry = value;
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
    public System3 setAcctId(AccountIdentification4Choice value) {
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
