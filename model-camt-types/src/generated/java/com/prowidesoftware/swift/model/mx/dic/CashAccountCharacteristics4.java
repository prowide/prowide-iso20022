
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the characteristics of the cash account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountCharacteristics4", propOrder = {
    "acctLvl",
    "cshAcct",
    "acctSvcr",
    "prntAcct",
    "compstnMtd",
    "dbtAcct",
    "delydDbtDt",
    "sttlmAdvc",
    "acctBalCcyCd",
    "sttlmCcyCd",
    "hstCcyCd",
    "tax",
    "acctSvcrCtct"
})
public class CashAccountCharacteristics4 {

    @XmlElement(name = "AcctLvl", required = true)
    @XmlSchemaType(name = "string")
    protected AccountLevel2Code acctLvl;
    @XmlElement(name = "CshAcct", required = true)
    protected CashAccount40 cshAcct;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 acctSvcr;
    @XmlElement(name = "PrntAcct")
    protected ParentCashAccount4 prntAcct;
    @XmlElement(name = "CompstnMtd", required = true)
    @XmlSchemaType(name = "string")
    protected CompensationMethod1Code compstnMtd;
    @XmlElement(name = "DbtAcct")
    protected AccountIdentification4Choice dbtAcct;
    @XmlElement(name = "DelydDbtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar delydDbtDt;
    @XmlElement(name = "SttlmAdvc")
    protected String sttlmAdvc;
    @XmlElement(name = "AcctBalCcyCd", required = true)
    protected String acctBalCcyCd;
    @XmlElement(name = "SttlmCcyCd")
    protected String sttlmCcyCd;
    @XmlElement(name = "HstCcyCd")
    protected String hstCcyCd;
    @XmlElement(name = "Tax")
    protected AccountTax1 tax;
    @XmlElement(name = "AcctSvcrCtct", required = true)
    protected Contact4 acctSvcrCtct;

    /**
     * Gets the value of the acctLvl property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLevel2Code }
     *     
     */
    public AccountLevel2Code getAcctLvl() {
        return acctLvl;
    }

    /**
     * Sets the value of the acctLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLevel2Code }
     *     
     */
    public CashAccountCharacteristics4 setAcctLvl(AccountLevel2Code value) {
        this.acctLvl = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccountCharacteristics4 setCshAcct(CashAccount40 value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public CashAccountCharacteristics4 setAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the prntAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ParentCashAccount4 }
     *     
     */
    public ParentCashAccount4 getPrntAcct() {
        return prntAcct;
    }

    /**
     * Sets the value of the prntAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentCashAccount4 }
     *     
     */
    public CashAccountCharacteristics4 setPrntAcct(ParentCashAccount4 value) {
        this.prntAcct = value;
        return this;
    }

    /**
     * Gets the value of the compstnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationMethod1Code }
     *     
     */
    public CompensationMethod1Code getCompstnMtd() {
        return compstnMtd;
    }

    /**
     * Sets the value of the compstnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationMethod1Code }
     *     
     */
    public CashAccountCharacteristics4 setCompstnMtd(CompensationMethod1Code value) {
        this.compstnMtd = value;
        return this;
    }

    /**
     * Gets the value of the dbtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getDbtAcct() {
        return dbtAcct;
    }

    /**
     * Sets the value of the dbtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public CashAccountCharacteristics4 setDbtAcct(AccountIdentification4Choice value) {
        this.dbtAcct = value;
        return this;
    }

    /**
     * Gets the value of the delydDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelydDbtDt() {
        return delydDbtDt;
    }

    /**
     * Sets the value of the delydDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CashAccountCharacteristics4 setDelydDbtDt(XMLGregorianCalendar value) {
        this.delydDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmAdvc() {
        return sttlmAdvc;
    }

    /**
     * Sets the value of the sttlmAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccountCharacteristics4 setSttlmAdvc(String value) {
        this.sttlmAdvc = value;
        return this;
    }

    /**
     * Gets the value of the acctBalCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctBalCcyCd() {
        return acctBalCcyCd;
    }

    /**
     * Sets the value of the acctBalCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccountCharacteristics4 setAcctBalCcyCd(String value) {
        this.acctBalCcyCd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcyCd() {
        return sttlmCcyCd;
    }

    /**
     * Sets the value of the sttlmCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccountCharacteristics4 setSttlmCcyCd(String value) {
        this.sttlmCcyCd = value;
        return this;
    }

    /**
     * Gets the value of the hstCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstCcyCd() {
        return hstCcyCd;
    }

    /**
     * Sets the value of the hstCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccountCharacteristics4 setHstCcyCd(String value) {
        this.hstCcyCd = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTax1 }
     *     
     */
    public AccountTax1 getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTax1 }
     *     
     */
    public CashAccountCharacteristics4 setTax(AccountTax1 value) {
        this.tax = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrCtct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact4 }
     *     
     */
    public Contact4 getAcctSvcrCtct() {
        return acctSvcrCtct;
    }

    /**
     * Sets the value of the acctSvcrCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact4 }
     *     
     */
    public CashAccountCharacteristics4 setAcctSvcrCtct(Contact4 value) {
        this.acctSvcrCtct = value;
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
