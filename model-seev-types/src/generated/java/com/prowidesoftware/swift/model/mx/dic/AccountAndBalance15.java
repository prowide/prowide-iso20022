
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
 * Provides account and balance information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountAndBalance15", propOrder = {
    "sfkpgAcct",
    "acctOwnr",
    "sfkpgPlc",
    "bal"
})
public class AccountAndBalance15 {

    @XmlElement(name = "SfkpgAcct", required = true)
    protected String sfkpgAcct;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification36Choice acctOwnr;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat2Choice sfkpgPlc;
    @XmlElement(name = "Bal")
    protected CorporateActionBalanceDetails10 bal;

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
    public AccountAndBalance15 setSfkpgAcct(String value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification36Choice }
     *     
     */
    public PartyIdentification36Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification36Choice }
     *     
     */
    public AccountAndBalance15 setAcctOwnr(PartyIdentification36Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat2Choice }
     *     
     */
    public SafekeepingPlaceFormat2Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat2Choice }
     *     
     */
    public AccountAndBalance15 setSfkpgPlc(SafekeepingPlaceFormat2Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionBalanceDetails10 }
     *     
     */
    public CorporateActionBalanceDetails10 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionBalanceDetails10 }
     *     
     */
    public AccountAndBalance15 setBal(CorporateActionBalanceDetails10 value) {
        this.bal = value;
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
