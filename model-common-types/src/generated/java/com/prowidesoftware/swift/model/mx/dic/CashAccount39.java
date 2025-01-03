
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
 * Provides the details to identify an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount39", propOrder = {
    "id",
    "tp",
    "ccy",
    "nm",
    "prxy",
    "ownr",
    "svcr"
})
public class CashAccount39 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentification4Choice id;
    @XmlElement(name = "Tp")
    protected CashAccountType2Choice tp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Prxy")
    protected ProxyAccountIdentification1 prxy;
    @XmlElement(name = "Ownr")
    protected PartyIdentification135 ownr;
    @XmlElement(name = "Svcr")
    protected BranchAndFinancialInstitutionIdentification6 svcr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public CashAccount39 setId(AccountIdentification4Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public CashAccountType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public CashAccount39 setTp(CashAccountType2Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccount39 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccount39 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyAccountIdentification1 }
     *     
     */
    public ProxyAccountIdentification1 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyAccountIdentification1 }
     *     
     */
    public CashAccount39 setPrxy(ProxyAccountIdentification1 value) {
        this.prxy = value;
        return this;
    }

    /**
     * Gets the value of the ownr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getOwnr() {
        return ownr;
    }

    /**
     * Sets the value of the ownr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public CashAccount39 setOwnr(PartyIdentification135 value) {
        this.ownr = value;
        return this;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public CashAccount39 setSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.svcr = value;
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
