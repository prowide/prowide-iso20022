
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
@XmlType(name = "CardAccount13", propOrder = {
    "acctTp",
    "acctNm",
    "ccy",
    "acctIdr",
    "cdtRef",
    "svcr",
    "balBfr",
    "balAftr"
})
public class CardAccount13 {

    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType3Code acctTp;
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
    @XmlElement(name = "BalBfr")
    protected AmountAndDirection43 balBfr;
    @XmlElement(name = "BalAftr")
    protected AmountAndDirection43 balAftr;

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardAccountType3Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardAccount13 setAcctTp(CardAccountType3Code value) {
        this.acctTp = value;
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
    public CardAccount13 setAcctNm(String value) {
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
    public CardAccount13 setCcy(String value) {
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
    public CardAccount13 setAcctIdr(AccountIdentification31Choice value) {
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
    public CardAccount13 setCdtRef(String value) {
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
    public CardAccount13 setSvcr(PartyIdentification72Choice value) {
        this.svcr = value;
        return this;
    }

    /**
     * Gets the value of the balBfr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection43 }
     *     
     */
    public AmountAndDirection43 getBalBfr() {
        return balBfr;
    }

    /**
     * Sets the value of the balBfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection43 }
     *     
     */
    public CardAccount13 setBalBfr(AmountAndDirection43 value) {
        this.balBfr = value;
        return this;
    }

    /**
     * Gets the value of the balAftr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection43 }
     *     
     */
    public AmountAndDirection43 getBalAftr() {
        return balAftr;
    }

    /**
     * Sets the value of the balAftr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection43 }
     *     
     */
    public CardAccount13 setBalAftr(AmountAndDirection43 value) {
        this.balAftr = value;
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
