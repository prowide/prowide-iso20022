
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Information about a party's account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountParties18", propOrder = {
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
    "snrMggOffcl",
    "prtctr",
    "regdShrhldrNm"
})
public class AccountParties18 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification1Code modScpIndctn;
    @XmlElement(name = "PrncplAcctPty")
    protected AccountParties13Choice prncplAcctPty;
    @XmlElement(name = "ScndryOwnr")
    protected List<InvestmentAccountOwnershipInformation17> scndryOwnr;
    @XmlElement(name = "Bnfcry")
    protected List<InvestmentAccountOwnershipInformation17> bnfcry;
    @XmlElement(name = "PwrOfAttny")
    protected List<InvestmentAccountOwnershipInformation17> pwrOfAttny;
    @XmlElement(name = "LglGuardn")
    protected List<InvestmentAccountOwnershipInformation17> lglGuardn;
    @XmlElement(name = "CtdnForMnr")
    protected List<InvestmentAccountOwnershipInformation17> ctdnForMnr;
    @XmlElement(name = "SucssrOnDth")
    protected List<InvestmentAccountOwnershipInformation17> sucssrOnDth;
    @XmlElement(name = "Admstr")
    protected List<InvestmentAccountOwnershipInformation17> admstr;
    @XmlElement(name = "OthrPty")
    protected List<ExtendedParty15> othrPty;
    @XmlElement(name = "Grntr")
    protected List<InvestmentAccountOwnershipInformation17> grntr;
    @XmlElement(name = "Sttlr")
    protected List<InvestmentAccountOwnershipInformation17> sttlr;
    @XmlElement(name = "SnrMggOffcl")
    protected List<InvestmentAccountOwnershipInformation17> snrMggOffcl;
    @XmlElement(name = "Prtctr")
    protected List<InvestmentAccountOwnershipInformation17> prtctr;
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
    public AccountParties18 setModScpIndctn(DataModification1Code value) {
        this.modScpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the prncplAcctPty property.
     * 
     * @return
     *     possible object is
     *     {@link AccountParties13Choice }
     *     
     */
    public AccountParties13Choice getPrncplAcctPty() {
        return prncplAcctPty;
    }

    /**
     * Sets the value of the prncplAcctPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountParties13Choice }
     *     
     */
    public AccountParties18 setPrncplAcctPty(AccountParties13Choice value) {
        this.prncplAcctPty = value;
        return this;
    }

    /**
     * Gets the value of the scndryOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scndryOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndryOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation17 }
     * 
     * 
     * @return
     *     The value of the scndryOwnr property.
     */
    public List<InvestmentAccountOwnershipInformation17> getScndryOwnr() {
        if (scndryOwnr == null) {
            scndryOwnr = new ArrayList<>();
        }
        return this.scndryOwnr;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfcry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfcry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation17 }
     * 
     * 
     * @return
     *     The value of the bnfcry property.
     */
    public List<InvestmentAccountOwnershipInformation17> getBnfcry() {
        if (bnfcry == null) {
            bnfcry = new ArrayList<>();
        }
        return this.bnfcry;
    }

    /**
     * Gets the value of the pwrOfAttny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pwrOfAttny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPwrOfAttny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation17 }
     * 
     * 
     * @return
     *     The value of the pwrOfAttny property.
     */
    public List<InvestmentAccountOwnershipInformation17> getPwrOfAttny() {
        if (pwrOfAttny == null) {
            pwrOfAttny = new ArrayList<>();
        }
        return this.pwrOfAttny;
    }

    /**
     * Gets the value of the lglGuardn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lglGuardn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLglGuardn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation17 }
     * 
     * 
     * @return
     *     The value of the lglGuardn property.
     */
    public List<InvestmentAccountOwnershipInformation17> getLglGuardn() {
        if (lglGuardn == null) {
            lglGuardn = new ArrayList<>();
        }
        return this.lglGuardn;
    }

    /**
     * Gets the value of the ctdnForMnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctdnForMnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtdnForMnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation17 }
     * 
     * 
     * @return
     *     The value of the ctdnForMnr property.
     */
    public List<InvestmentAccountOwnershipInformation17> getCtdnForMnr() {
        if (ctdnForMnr == null) {
            ctdnForMnr = new ArrayList<>();
        }
        return this.ctdnForMnr;
    }

    /**
     * Gets the value of the sucssrOnDth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sucssrOnDth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSucssrOnDth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation17 }
     * 
     * 
     * @return
     *     The value of the sucssrOnDth property.
     */
    public List<InvestmentAccountOwnershipInformation17> getSucssrOnDth() {
        if (sucssrOnDth == null) {
            sucssrOnDth = new ArrayList<>();
        }
        return this.sucssrOnDth;
    }

    /**
     * Gets the value of the admstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the admstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdmstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation17 }
     * 
     * 
     * @return
     *     The value of the admstr property.
     */
    public List<InvestmentAccountOwnershipInformation17> getAdmstr() {
        if (admstr == null) {
            admstr = new ArrayList<>();
        }
        return this.admstr;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedParty15 }
     * 
     * 
     * @return
     *     The value of the othrPty property.
     */
    public List<ExtendedParty15> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<>();
        }
        return this.othrPty;
    }

    /**
     * Gets the value of the grntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation17 }
     * 
     * 
     * @return
     *     The value of the grntr property.
     */
    public List<InvestmentAccountOwnershipInformation17> getGrntr() {
        if (grntr == null) {
            grntr = new ArrayList<>();
        }
        return this.grntr;
    }

    /**
     * Gets the value of the sttlr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation17 }
     * 
     * 
     * @return
     *     The value of the sttlr property.
     */
    public List<InvestmentAccountOwnershipInformation17> getSttlr() {
        if (sttlr == null) {
            sttlr = new ArrayList<>();
        }
        return this.sttlr;
    }

    /**
     * Gets the value of the snrMggOffcl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the snrMggOffcl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnrMggOffcl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation17 }
     * 
     * 
     * @return
     *     The value of the snrMggOffcl property.
     */
    public List<InvestmentAccountOwnershipInformation17> getSnrMggOffcl() {
        if (snrMggOffcl == null) {
            snrMggOffcl = new ArrayList<>();
        }
        return this.snrMggOffcl;
    }

    /**
     * Gets the value of the prtctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtctr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtctr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation17 }
     * 
     * 
     * @return
     *     The value of the prtctr property.
     */
    public List<InvestmentAccountOwnershipInformation17> getPrtctr() {
        if (prtctr == null) {
            prtctr = new ArrayList<>();
        }
        return this.prtctr;
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
    public AccountParties18 setRegdShrhldrNm(RegisteredShareholderName1Choice value) {
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

    /**
     * Adds a new item to the scndryOwnr list.
     * @see #getScndryOwnr()
     * 
     */
    public AccountParties18 addScndryOwnr(InvestmentAccountOwnershipInformation17 scndryOwnr) {
        getScndryOwnr().add(scndryOwnr);
        return this;
    }

    /**
     * Adds a new item to the bnfcry list.
     * @see #getBnfcry()
     * 
     */
    public AccountParties18 addBnfcry(InvestmentAccountOwnershipInformation17 bnfcry) {
        getBnfcry().add(bnfcry);
        return this;
    }

    /**
     * Adds a new item to the pwrOfAttny list.
     * @see #getPwrOfAttny()
     * 
     */
    public AccountParties18 addPwrOfAttny(InvestmentAccountOwnershipInformation17 pwrOfAttny) {
        getPwrOfAttny().add(pwrOfAttny);
        return this;
    }

    /**
     * Adds a new item to the lglGuardn list.
     * @see #getLglGuardn()
     * 
     */
    public AccountParties18 addLglGuardn(InvestmentAccountOwnershipInformation17 lglGuardn) {
        getLglGuardn().add(lglGuardn);
        return this;
    }

    /**
     * Adds a new item to the ctdnForMnr list.
     * @see #getCtdnForMnr()
     * 
     */
    public AccountParties18 addCtdnForMnr(InvestmentAccountOwnershipInformation17 ctdnForMnr) {
        getCtdnForMnr().add(ctdnForMnr);
        return this;
    }

    /**
     * Adds a new item to the sucssrOnDth list.
     * @see #getSucssrOnDth()
     * 
     */
    public AccountParties18 addSucssrOnDth(InvestmentAccountOwnershipInformation17 sucssrOnDth) {
        getSucssrOnDth().add(sucssrOnDth);
        return this;
    }

    /**
     * Adds a new item to the admstr list.
     * @see #getAdmstr()
     * 
     */
    public AccountParties18 addAdmstr(InvestmentAccountOwnershipInformation17 admstr) {
        getAdmstr().add(admstr);
        return this;
    }

    /**
     * Adds a new item to the othrPty list.
     * @see #getOthrPty()
     * 
     */
    public AccountParties18 addOthrPty(ExtendedParty15 othrPty) {
        getOthrPty().add(othrPty);
        return this;
    }

    /**
     * Adds a new item to the grntr list.
     * @see #getGrntr()
     * 
     */
    public AccountParties18 addGrntr(InvestmentAccountOwnershipInformation17 grntr) {
        getGrntr().add(grntr);
        return this;
    }

    /**
     * Adds a new item to the sttlr list.
     * @see #getSttlr()
     * 
     */
    public AccountParties18 addSttlr(InvestmentAccountOwnershipInformation17 sttlr) {
        getSttlr().add(sttlr);
        return this;
    }

    /**
     * Adds a new item to the snrMggOffcl list.
     * @see #getSnrMggOffcl()
     * 
     */
    public AccountParties18 addSnrMggOffcl(InvestmentAccountOwnershipInformation17 snrMggOffcl) {
        getSnrMggOffcl().add(snrMggOffcl);
        return this;
    }

    /**
     * Adds a new item to the prtctr list.
     * @see #getPrtctr()
     * 
     */
    public AccountParties18 addPrtctr(InvestmentAccountOwnershipInformation17 prtctr) {
        getPrtctr().add(prtctr);
        return this;
    }

}
