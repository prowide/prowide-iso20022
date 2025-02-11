
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Customer account information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccount11", propOrder = {
    "selctnMtd",
    "selctdAcctTp",
    "acctNm",
    "ccy",
    "acctIdr",
    "cdtRef",
    "svcr"
})
public class CardAccount11 {

    @XmlElement(name = "SelctnMtd")
    @XmlSchemaType(name = "string")
    protected AccountChoiceMethod1Code selctnMtd;
    @XmlElement(name = "SelctdAcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType3Code selctdAcctTp;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "AcctIdr")
    protected AccountIdentification31Choice acctIdr;
    @XmlElement(name = "CdtRef")
    protected String cdtRef;
    @XmlElement(name = "Svcr")
    protected PartyIdentification72Choice svcr;

    /**
     * Gets the value of the selctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AccountChoiceMethod1Code }
     *     
     */
    public AccountChoiceMethod1Code getSelctnMtd() {
        return selctnMtd;
    }

    /**
     * Sets the value of the selctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountChoiceMethod1Code }
     *     
     */
    public CardAccount11 setSelctnMtd(AccountChoiceMethod1Code value) {
        this.selctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the selctdAcctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardAccountType3Code getSelctdAcctTp() {
        return selctdAcctTp;
    }

    /**
     * Sets the value of the selctdAcctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardAccount11 setSelctdAcctTp(CardAccountType3Code value) {
        this.selctdAcctTp = value;
        return this;
    }

    /**
     * Gets the value of the acctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNm() {
        return acctNm;
    }

    /**
     * Sets the value of the acctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAccount11 setAcctNm(String value) {
        this.acctNm = value;
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
    public CardAccount11 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the acctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification31Choice }
     *     
     */
    public AccountIdentification31Choice getAcctIdr() {
        return acctIdr;
    }

    /**
     * Sets the value of the acctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification31Choice }
     *     
     */
    public CardAccount11 setAcctIdr(AccountIdentification31Choice value) {
        this.acctIdr = value;
        return this;
    }

    /**
     * Gets the value of the cdtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtRef() {
        return cdtRef;
    }

    /**
     * Sets the value of the cdtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAccount11 setCdtRef(String value) {
        this.cdtRef = value;
        return this;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification72Choice }
     *     
     */
    public PartyIdentification72Choice getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification72Choice }
     *     
     */
    public CardAccount11 setSvcr(PartyIdentification72Choice value) {
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
