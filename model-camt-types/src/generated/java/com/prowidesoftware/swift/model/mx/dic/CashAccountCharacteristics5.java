
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "CashAccountCharacteristics5", propOrder = {
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
public class CashAccountCharacteristics5 {

    @XmlElement(name = "AcctLvl", required = true)
    @XmlSchemaType(name = "string")
    protected AccountLevel2Code acctLvl;
    @XmlElement(name = "CshAcct", required = true)
    protected CashAccount40 cshAcct;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification8 acctSvcr;
    @XmlElement(name = "PrntAcct")
    protected ParentCashAccount5 prntAcct;
    @XmlElement(name = "CompstnMtd", required = true)
    @XmlSchemaType(name = "string")
    protected CompensationMethod1Code compstnMtd;
    @XmlElement(name = "DbtAcct")
    protected AccountIdentification4Choice dbtAcct;
    @XmlElement(name = "DelydDbtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate delydDbtDt;
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
    protected Contact13 acctSvcrCtct;

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
    public CashAccountCharacteristics5 setAcctLvl(AccountLevel2Code value) {
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
    public CashAccountCharacteristics5 setCshAcct(CashAccount40 value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public CashAccountCharacteristics5 setAcctSvcr(BranchAndFinancialInstitutionIdentification8 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the prntAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ParentCashAccount5 }
     *     
     */
    public ParentCashAccount5 getPrntAcct() {
        return prntAcct;
    }

    /**
     * Sets the value of the prntAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentCashAccount5 }
     *     
     */
    public CashAccountCharacteristics5 setPrntAcct(ParentCashAccount5 value) {
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
    public CashAccountCharacteristics5 setCompstnMtd(CompensationMethod1Code value) {
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
    public CashAccountCharacteristics5 setDbtAcct(AccountIdentification4Choice value) {
        this.dbtAcct = value;
        return this;
    }

    /**
     * Gets the value of the delydDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDelydDbtDt() {
        return delydDbtDt;
    }

    /**
     * Sets the value of the delydDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccountCharacteristics5 setDelydDbtDt(LocalDate value) {
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
    public CashAccountCharacteristics5 setSttlmAdvc(String value) {
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
    public CashAccountCharacteristics5 setAcctBalCcyCd(String value) {
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
    public CashAccountCharacteristics5 setSttlmCcyCd(String value) {
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
    public CashAccountCharacteristics5 setHstCcyCd(String value) {
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
    public CashAccountCharacteristics5 setTax(AccountTax1 value) {
        this.tax = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrCtct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact13 }
     *     
     */
    public Contact13 getAcctSvcrCtct() {
        return acctSvcrCtct;
    }

    /**
     * Sets the value of the acctSvcrCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact13 }
     *     
     */
    public CashAccountCharacteristics5 setAcctSvcrCtct(Contact13 value) {
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
