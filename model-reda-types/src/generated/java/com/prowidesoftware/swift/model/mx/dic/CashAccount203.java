
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
 * Account to or from which a cash entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount203", propOrder = {
    "acctId",
    "svcr",
    "acctTpDesc"
})
public class CashAccount203 {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentificationAndName5 acctId;
    @XmlElement(name = "Svcr")
    protected String svcr;
    @XmlElement(name = "AcctTpDesc")
    protected String acctTpDesc;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public AccountIdentificationAndName5 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public CashAccount203 setAcctId(AccountIdentificationAndName5 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccount203 setSvcr(String value) {
        this.svcr = value;
        return this;
    }

    /**
     * Gets the value of the acctTpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTpDesc() {
        return acctTpDesc;
    }

    /**
     * Sets the value of the acctTpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccount203 setAcctTpDesc(String value) {
        this.acctTpDesc = value;
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
