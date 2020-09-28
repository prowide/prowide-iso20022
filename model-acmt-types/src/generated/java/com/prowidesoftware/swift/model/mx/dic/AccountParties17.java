
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
@XmlType(name = "AccountParties17", propOrder = {
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
public class AccountParties17 {

    @XmlElement(name = "PrncplAcctPty", required = true)
    protected AccountParties12Choice prncplAcctPty;
    @XmlElement(name = "ScndryOwnr")
    protected List<InvestmentAccountOwnershipInformation16> scndryOwnr;
    @XmlElement(name = "Bnfcry")
    protected List<InvestmentAccountOwnershipInformation16> bnfcry;
    @XmlElement(name = "PwrOfAttny")
    protected List<InvestmentAccountOwnershipInformation16> pwrOfAttny;
    @XmlElement(name = "LglGuardn")
    protected List<InvestmentAccountOwnershipInformation16> lglGuardn;
    @XmlElement(name = "CtdnForMnr")
    protected List<InvestmentAccountOwnershipInformation16> ctdnForMnr;
    @XmlElement(name = "SucssrOnDth")
    protected List<InvestmentAccountOwnershipInformation16> sucssrOnDth;
    @XmlElement(name = "Admstr")
    protected List<InvestmentAccountOwnershipInformation16> admstr;
    @XmlElement(name = "OthrPty")
    protected List<ExtendedParty14> othrPty;
    @XmlElement(name = "Grntr")
    protected List<InvestmentAccountOwnershipInformation16> grntr;
    @XmlElement(name = "Sttlr")
    protected List<InvestmentAccountOwnershipInformation16> sttlr;
    @XmlElement(name = "SnrMggOffcl")
    protected List<InvestmentAccountOwnershipInformation16> snrMggOffcl;
    @XmlElement(name = "Prtctr")
    protected List<InvestmentAccountOwnershipInformation16> prtctr;
    @XmlElement(name = "RegdShrhldrNm")
    protected RegisteredShareholderName1Choice regdShrhldrNm;

    /**
     * Gets the value of the prncplAcctPty property.
     * 
     * @return
     *     possible object is
     *     {@link AccountParties12Choice }
     *     
     */
    public AccountParties12Choice getPrncplAcctPty() {
        return prncplAcctPty;
    }

    /**
     * Sets the value of the prncplAcctPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountParties12Choice }
     *     
     */
    public AccountParties17 setPrncplAcctPty(AccountParties12Choice value) {
        this.prncplAcctPty = value;
        return this;
    }

    /**
     * Gets the value of the scndryOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scndryOwnr property.
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
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation16> getScndryOwnr() {
        if (scndryOwnr == null) {
            scndryOwnr = new ArrayList<InvestmentAccountOwnershipInformation16>();
        }
        return this.scndryOwnr;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bnfcry property.
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
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation16> getBnfcry() {
        if (bnfcry == null) {
            bnfcry = new ArrayList<InvestmentAccountOwnershipInformation16>();
        }
        return this.bnfcry;
    }

    /**
     * Gets the value of the pwrOfAttny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pwrOfAttny property.
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
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation16> getPwrOfAttny() {
        if (pwrOfAttny == null) {
            pwrOfAttny = new ArrayList<InvestmentAccountOwnershipInformation16>();
        }
        return this.pwrOfAttny;
    }

    /**
     * Gets the value of the lglGuardn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lglGuardn property.
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
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation16> getLglGuardn() {
        if (lglGuardn == null) {
            lglGuardn = new ArrayList<InvestmentAccountOwnershipInformation16>();
        }
        return this.lglGuardn;
    }

    /**
     * Gets the value of the ctdnForMnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctdnForMnr property.
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
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation16> getCtdnForMnr() {
        if (ctdnForMnr == null) {
            ctdnForMnr = new ArrayList<InvestmentAccountOwnershipInformation16>();
        }
        return this.ctdnForMnr;
    }

    /**
     * Gets the value of the sucssrOnDth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sucssrOnDth property.
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
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation16> getSucssrOnDth() {
        if (sucssrOnDth == null) {
            sucssrOnDth = new ArrayList<InvestmentAccountOwnershipInformation16>();
        }
        return this.sucssrOnDth;
    }

    /**
     * Gets the value of the admstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the admstr property.
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
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation16> getAdmstr() {
        if (admstr == null) {
            admstr = new ArrayList<InvestmentAccountOwnershipInformation16>();
        }
        return this.admstr;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrPty property.
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
     * {@link ExtendedParty14 }
     * 
     * 
     */
    public List<ExtendedParty14> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<ExtendedParty14>();
        }
        return this.othrPty;
    }

    /**
     * Gets the value of the grntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grntr property.
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
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation16> getGrntr() {
        if (grntr == null) {
            grntr = new ArrayList<InvestmentAccountOwnershipInformation16>();
        }
        return this.grntr;
    }

    /**
     * Gets the value of the sttlr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlr property.
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
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation16> getSttlr() {
        if (sttlr == null) {
            sttlr = new ArrayList<InvestmentAccountOwnershipInformation16>();
        }
        return this.sttlr;
    }

    /**
     * Gets the value of the snrMggOffcl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snrMggOffcl property.
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
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation16> getSnrMggOffcl() {
        if (snrMggOffcl == null) {
            snrMggOffcl = new ArrayList<InvestmentAccountOwnershipInformation16>();
        }
        return this.snrMggOffcl;
    }

    /**
     * Gets the value of the prtctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtctr property.
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
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation16> getPrtctr() {
        if (prtctr == null) {
            prtctr = new ArrayList<InvestmentAccountOwnershipInformation16>();
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
    public AccountParties17 setRegdShrhldrNm(RegisteredShareholderName1Choice value) {
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
    public AccountParties17 addScndryOwnr(InvestmentAccountOwnershipInformation16 scndryOwnr) {
        getScndryOwnr().add(scndryOwnr);
        return this;
    }

    /**
     * Adds a new item to the bnfcry list.
     * @see #getBnfcry()
     * 
     */
    public AccountParties17 addBnfcry(InvestmentAccountOwnershipInformation16 bnfcry) {
        getBnfcry().add(bnfcry);
        return this;
    }

    /**
     * Adds a new item to the pwrOfAttny list.
     * @see #getPwrOfAttny()
     * 
     */
    public AccountParties17 addPwrOfAttny(InvestmentAccountOwnershipInformation16 pwrOfAttny) {
        getPwrOfAttny().add(pwrOfAttny);
        return this;
    }

    /**
     * Adds a new item to the lglGuardn list.
     * @see #getLglGuardn()
     * 
     */
    public AccountParties17 addLglGuardn(InvestmentAccountOwnershipInformation16 lglGuardn) {
        getLglGuardn().add(lglGuardn);
        return this;
    }

    /**
     * Adds a new item to the ctdnForMnr list.
     * @see #getCtdnForMnr()
     * 
     */
    public AccountParties17 addCtdnForMnr(InvestmentAccountOwnershipInformation16 ctdnForMnr) {
        getCtdnForMnr().add(ctdnForMnr);
        return this;
    }

    /**
     * Adds a new item to the sucssrOnDth list.
     * @see #getSucssrOnDth()
     * 
     */
    public AccountParties17 addSucssrOnDth(InvestmentAccountOwnershipInformation16 sucssrOnDth) {
        getSucssrOnDth().add(sucssrOnDth);
        return this;
    }

    /**
     * Adds a new item to the admstr list.
     * @see #getAdmstr()
     * 
     */
    public AccountParties17 addAdmstr(InvestmentAccountOwnershipInformation16 admstr) {
        getAdmstr().add(admstr);
        return this;
    }

    /**
     * Adds a new item to the othrPty list.
     * @see #getOthrPty()
     * 
     */
    public AccountParties17 addOthrPty(ExtendedParty14 othrPty) {
        getOthrPty().add(othrPty);
        return this;
    }

    /**
     * Adds a new item to the grntr list.
     * @see #getGrntr()
     * 
     */
    public AccountParties17 addGrntr(InvestmentAccountOwnershipInformation16 grntr) {
        getGrntr().add(grntr);
        return this;
    }

    /**
     * Adds a new item to the sttlr list.
     * @see #getSttlr()
     * 
     */
    public AccountParties17 addSttlr(InvestmentAccountOwnershipInformation16 sttlr) {
        getSttlr().add(sttlr);
        return this;
    }

    /**
     * Adds a new item to the snrMggOffcl list.
     * @see #getSnrMggOffcl()
     * 
     */
    public AccountParties17 addSnrMggOffcl(InvestmentAccountOwnershipInformation16 snrMggOffcl) {
        getSnrMggOffcl().add(snrMggOffcl);
        return this;
    }

    /**
     * Adds a new item to the prtctr list.
     * @see #getPrtctr()
     * 
     */
    public AccountParties17 addPrtctr(InvestmentAccountOwnershipInformation16 prtctr) {
        getPrtctr().add(prtctr);
        return this;
    }

}
