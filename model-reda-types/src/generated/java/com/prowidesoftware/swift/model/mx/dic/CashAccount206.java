
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
 * Account to or from which a cash entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount206", propOrder = {
    "acctId",
    "svcr",
    "acctTpDesc"
})
public class CashAccount206 {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentificationAndName7 acctId;
    @XmlElement(name = "Svcr")
    protected String svcr;
    @XmlElement(name = "AcctTpDesc")
    protected String acctTpDesc;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName7 }
     *     
     */
    public AccountIdentificationAndName7 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName7 }
     *     
     */
    public CashAccount206 setAcctId(AccountIdentificationAndName7 value) {
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
    public CashAccount206 setSvcr(String value) {
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
    public CashAccount206 setAcctTpDesc(String value) {
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
