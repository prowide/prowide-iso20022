
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
 * Provides account identification information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification13", propOrder = {
    "sfkpgAcct",
    "acctOwnr",
    "sfkpgPlc",
    "confdBal"
})
public class AccountIdentification13 {

    @XmlElement(name = "SfkpgAcct", required = true)
    protected String sfkpgAcct;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification18Choice acctOwnr;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat5Choice sfkpgPlc;
    @XmlElement(name = "ConfdBal", required = true)
    protected BalanceFormat2Choice confdBal;

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentification13 setSfkpgAcct(String value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification18Choice }
     *     
     */
    public PartyIdentification18Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification18Choice }
     *     
     */
    public AccountIdentification13 setAcctOwnr(PartyIdentification18Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat5Choice }
     *     
     */
    public SafekeepingPlaceFormat5Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat5Choice }
     *     
     */
    public AccountIdentification13 setSfkpgPlc(SafekeepingPlaceFormat5Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the confdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat2Choice }
     *     
     */
    public BalanceFormat2Choice getConfdBal() {
        return confdBal;
    }

    /**
     * Sets the value of the confdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat2Choice }
     *     
     */
    public AccountIdentification13 setConfdBal(BalanceFormat2Choice value) {
        this.confdBal = value;
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
