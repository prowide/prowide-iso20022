
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about a party's account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountParties14", propOrder = {
    "modScpIndctn",
    "prncplAcctPty",
    "scndryOwnr",
    "bnfcry",
    "pwrOfAttny",
    "lglGuardn",
    "ctdnForMnr",
    "sucssrOnDth",
    "admstr",
    "othrPty",
    "grntr",
    "sttlr",
    "regdShrhldrNm"
})
public class AccountParties14 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification1Code modScpIndctn;
    @XmlElement(name = "PrncplAcctPty")
    protected AccountParties9Choice prncplAcctPty;
    @XmlElement(name = "ScndryOwnr")
    protected InvestmentAccountOwnershipInformation13 scndryOwnr;
    @XmlElement(name = "Bnfcry")
    protected InvestmentAccountOwnershipInformation13 bnfcry;
    @XmlElement(name = "PwrOfAttny")
    protected InvestmentAccountOwnershipInformation13 pwrOfAttny;
    @XmlElement(name = "LglGuardn")
    protected InvestmentAccountOwnershipInformation13 lglGuardn;
    @XmlElement(name = "CtdnForMnr")
    protected InvestmentAccountOwnershipInformation13 ctdnForMnr;
    @XmlElement(name = "SucssrOnDth")
    protected InvestmentAccountOwnershipInformation13 sucssrOnDth;
    @XmlElement(name = "Admstr")
    protected InvestmentAccountOwnershipInformation13 admstr;
    @XmlElement(name = "OthrPty")
    protected ExtendedParty10 othrPty;
    @XmlElement(name = "Grntr")
    protected InvestmentAccountOwnershipInformation13 grntr;
    @XmlElement(name = "Sttlr")
    protected InvestmentAccountOwnershipInformation13 sttlr;
    @XmlElement(name = "RegdShrhldrNm")
    protected RegisteredShareholderName1Choice regdShrhldrNm;

    /**
     * Gets the value of the modScpIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link DataModification1Code }
     *     
     */
    public DataModification1Code getModScpIndctn() {
        return modScpIndctn;
    }

    /**
     * Sets the value of the modScpIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataModification1Code }
     *     
     */
    public AccountParties14 setModScpIndctn(DataModification1Code value) {
        this.modScpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the prncplAcctPty property.
     * 
     * @return
     *     possible object is
     *     {@link AccountParties9Choice }
     *     
     */
    public AccountParties9Choice getPrncplAcctPty() {
        return prncplAcctPty;
    }

    /**
     * Sets the value of the prncplAcctPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountParties9Choice }
     *     
     */
    public AccountParties14 setPrncplAcctPty(AccountParties9Choice value) {
        this.prncplAcctPty = value;
        return this;
    }

    /**
     * Gets the value of the scndryOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public InvestmentAccountOwnershipInformation13 getScndryOwnr() {
        return scndryOwnr;
    }

    /**
     * Sets the value of the scndryOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public AccountParties14 setScndryOwnr(InvestmentAccountOwnershipInformation13 value) {
        this.scndryOwnr = value;
        return this;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public InvestmentAccountOwnershipInformation13 getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public AccountParties14 setBnfcry(InvestmentAccountOwnershipInformation13 value) {
        this.bnfcry = value;
        return this;
    }

    /**
     * Gets the value of the pwrOfAttny property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public InvestmentAccountOwnershipInformation13 getPwrOfAttny() {
        return pwrOfAttny;
    }

    /**
     * Sets the value of the pwrOfAttny property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public AccountParties14 setPwrOfAttny(InvestmentAccountOwnershipInformation13 value) {
        this.pwrOfAttny = value;
        return this;
    }

    /**
     * Gets the value of the lglGuardn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public InvestmentAccountOwnershipInformation13 getLglGuardn() {
        return lglGuardn;
    }

    /**
     * Sets the value of the lglGuardn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public AccountParties14 setLglGuardn(InvestmentAccountOwnershipInformation13 value) {
        this.lglGuardn = value;
        return this;
    }

    /**
     * Gets the value of the ctdnForMnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public InvestmentAccountOwnershipInformation13 getCtdnForMnr() {
        return ctdnForMnr;
    }

    /**
     * Sets the value of the ctdnForMnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public AccountParties14 setCtdnForMnr(InvestmentAccountOwnershipInformation13 value) {
        this.ctdnForMnr = value;
        return this;
    }

    /**
     * Gets the value of the sucssrOnDth property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public InvestmentAccountOwnershipInformation13 getSucssrOnDth() {
        return sucssrOnDth;
    }

    /**
     * Sets the value of the sucssrOnDth property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public AccountParties14 setSucssrOnDth(InvestmentAccountOwnershipInformation13 value) {
        this.sucssrOnDth = value;
        return this;
    }

    /**
     * Gets the value of the admstr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public InvestmentAccountOwnershipInformation13 getAdmstr() {
        return admstr;
    }

    /**
     * Sets the value of the admstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public AccountParties14 setAdmstr(InvestmentAccountOwnershipInformation13 value) {
        this.admstr = value;
        return this;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedParty10 }
     *     
     */
    public ExtendedParty10 getOthrPty() {
        return othrPty;
    }

    /**
     * Sets the value of the othrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedParty10 }
     *     
     */
    public AccountParties14 setOthrPty(ExtendedParty10 value) {
        this.othrPty = value;
        return this;
    }

    /**
     * Gets the value of the grntr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public InvestmentAccountOwnershipInformation13 getGrntr() {
        return grntr;
    }

    /**
     * Sets the value of the grntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public AccountParties14 setGrntr(InvestmentAccountOwnershipInformation13 value) {
        this.grntr = value;
        return this;
    }

    /**
     * Gets the value of the sttlr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public InvestmentAccountOwnershipInformation13 getSttlr() {
        return sttlr;
    }

    /**
     * Sets the value of the sttlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation13 }
     *     
     */
    public AccountParties14 setSttlr(InvestmentAccountOwnershipInformation13 value) {
        this.sttlr = value;
        return this;
    }

    /**
     * Gets the value of the regdShrhldrNm property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredShareholderName1Choice }
     *     
     */
    public RegisteredShareholderName1Choice getRegdShrhldrNm() {
        return regdShrhldrNm;
    }

    /**
     * Sets the value of the regdShrhldrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredShareholderName1Choice }
     *     
     */
    public AccountParties14 setRegdShrhldrNm(RegisteredShareholderName1Choice value) {
        this.regdShrhldrNm = value;
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
