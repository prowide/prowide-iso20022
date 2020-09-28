
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
@XmlType(name = "AccountParties15", propOrder = {
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
public class AccountParties15 {

    @XmlElement(name = "PrncplAcctPty", required = true)
    protected AccountParties10Choice prncplAcctPty;
    @XmlElement(name = "ScndryOwnr")
    protected List<InvestmentAccountOwnershipInformation14> scndryOwnr;
    @XmlElement(name = "Bnfcry")
    protected List<InvestmentAccountOwnershipInformation14> bnfcry;
    @XmlElement(name = "PwrOfAttny")
    protected List<InvestmentAccountOwnershipInformation14> pwrOfAttny;
    @XmlElement(name = "LglGuardn")
    protected List<InvestmentAccountOwnershipInformation14> lglGuardn;
    @XmlElement(name = "CtdnForMnr")
    protected InvestmentAccountOwnershipInformation14 ctdnForMnr;
    @XmlElement(name = "SucssrOnDth")
    protected List<InvestmentAccountOwnershipInformation14> sucssrOnDth;
    @XmlElement(name = "Admstr")
    protected List<InvestmentAccountOwnershipInformation14> admstr;
    @XmlElement(name = "OthrPty")
    protected List<ExtendedParty11> othrPty;
    @XmlElement(name = "Grntr")
    protected List<InvestmentAccountOwnershipInformation14> grntr;
    @XmlElement(name = "Sttlr")
    protected List<InvestmentAccountOwnershipInformation14> sttlr;
    @XmlElement(name = "SnrMggOffcl")
    protected List<InvestmentAccountOwnershipInformation14> snrMggOffcl;
    @XmlElement(name = "Prtctr")
    protected List<InvestmentAccountOwnershipInformation14> prtctr;
    @XmlElement(name = "RegdShrhldrNm")
    protected RegisteredShareholderName1Choice regdShrhldrNm;

    /**
     * Gets the value of the prncplAcctPty property.
     * 
     * @return
     *     possible object is
     *     {@link AccountParties10Choice }
     *     
     */
    public AccountParties10Choice getPrncplAcctPty() {
        return prncplAcctPty;
    }

    /**
     * Sets the value of the prncplAcctPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountParties10Choice }
     *     
     */
    public AccountParties15 setPrncplAcctPty(AccountParties10Choice value) {
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
     * {@link InvestmentAccountOwnershipInformation14 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation14> getScndryOwnr() {
        if (scndryOwnr == null) {
            scndryOwnr = new ArrayList<InvestmentAccountOwnershipInformation14>();
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
     * {@link InvestmentAccountOwnershipInformation14 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation14> getBnfcry() {
        if (bnfcry == null) {
            bnfcry = new ArrayList<InvestmentAccountOwnershipInformation14>();
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
     * {@link InvestmentAccountOwnershipInformation14 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation14> getPwrOfAttny() {
        if (pwrOfAttny == null) {
            pwrOfAttny = new ArrayList<InvestmentAccountOwnershipInformation14>();
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
     * {@link InvestmentAccountOwnershipInformation14 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation14> getLglGuardn() {
        if (lglGuardn == null) {
            lglGuardn = new ArrayList<InvestmentAccountOwnershipInformation14>();
        }
        return this.lglGuardn;
    }

    /**
     * Gets the value of the ctdnForMnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation14 }
     *     
     */
    public InvestmentAccountOwnershipInformation14 getCtdnForMnr() {
        return ctdnForMnr;
    }

    /**
     * Sets the value of the ctdnForMnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation14 }
     *     
     */
    public AccountParties15 setCtdnForMnr(InvestmentAccountOwnershipInformation14 value) {
        this.ctdnForMnr = value;
        return this;
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
     * {@link InvestmentAccountOwnershipInformation14 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation14> getSucssrOnDth() {
        if (sucssrOnDth == null) {
            sucssrOnDth = new ArrayList<InvestmentAccountOwnershipInformation14>();
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
     * {@link InvestmentAccountOwnershipInformation14 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation14> getAdmstr() {
        if (admstr == null) {
            admstr = new ArrayList<InvestmentAccountOwnershipInformation14>();
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
     * {@link ExtendedParty11 }
     * 
     * 
     */
    public List<ExtendedParty11> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<ExtendedParty11>();
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
     * {@link InvestmentAccountOwnershipInformation14 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation14> getGrntr() {
        if (grntr == null) {
            grntr = new ArrayList<InvestmentAccountOwnershipInformation14>();
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
     * {@link InvestmentAccountOwnershipInformation14 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation14> getSttlr() {
        if (sttlr == null) {
            sttlr = new ArrayList<InvestmentAccountOwnershipInformation14>();
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
     * {@link InvestmentAccountOwnershipInformation14 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation14> getSnrMggOffcl() {
        if (snrMggOffcl == null) {
            snrMggOffcl = new ArrayList<InvestmentAccountOwnershipInformation14>();
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
     * {@link InvestmentAccountOwnershipInformation14 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation14> getPrtctr() {
        if (prtctr == null) {
            prtctr = new ArrayList<InvestmentAccountOwnershipInformation14>();
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
    public AccountParties15 setRegdShrhldrNm(RegisteredShareholderName1Choice value) {
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
    public AccountParties15 addScndryOwnr(InvestmentAccountOwnershipInformation14 scndryOwnr) {
        getScndryOwnr().add(scndryOwnr);
        return this;
    }

    /**
     * Adds a new item to the bnfcry list.
     * @see #getBnfcry()
     * 
     */
    public AccountParties15 addBnfcry(InvestmentAccountOwnershipInformation14 bnfcry) {
        getBnfcry().add(bnfcry);
        return this;
    }

    /**
     * Adds a new item to the pwrOfAttny list.
     * @see #getPwrOfAttny()
     * 
     */
    public AccountParties15 addPwrOfAttny(InvestmentAccountOwnershipInformation14 pwrOfAttny) {
        getPwrOfAttny().add(pwrOfAttny);
        return this;
    }

    /**
     * Adds a new item to the lglGuardn list.
     * @see #getLglGuardn()
     * 
     */
    public AccountParties15 addLglGuardn(InvestmentAccountOwnershipInformation14 lglGuardn) {
        getLglGuardn().add(lglGuardn);
        return this;
    }

    /**
     * Adds a new item to the sucssrOnDth list.
     * @see #getSucssrOnDth()
     * 
     */
    public AccountParties15 addSucssrOnDth(InvestmentAccountOwnershipInformation14 sucssrOnDth) {
        getSucssrOnDth().add(sucssrOnDth);
        return this;
    }

    /**
     * Adds a new item to the admstr list.
     * @see #getAdmstr()
     * 
     */
    public AccountParties15 addAdmstr(InvestmentAccountOwnershipInformation14 admstr) {
        getAdmstr().add(admstr);
        return this;
    }

    /**
     * Adds a new item to the othrPty list.
     * @see #getOthrPty()
     * 
     */
    public AccountParties15 addOthrPty(ExtendedParty11 othrPty) {
        getOthrPty().add(othrPty);
        return this;
    }

    /**
     * Adds a new item to the grntr list.
     * @see #getGrntr()
     * 
     */
    public AccountParties15 addGrntr(InvestmentAccountOwnershipInformation14 grntr) {
        getGrntr().add(grntr);
        return this;
    }

    /**
     * Adds a new item to the sttlr list.
     * @see #getSttlr()
     * 
     */
    public AccountParties15 addSttlr(InvestmentAccountOwnershipInformation14 sttlr) {
        getSttlr().add(sttlr);
        return this;
    }

    /**
     * Adds a new item to the snrMggOffcl list.
     * @see #getSnrMggOffcl()
     * 
     */
    public AccountParties15 addSnrMggOffcl(InvestmentAccountOwnershipInformation14 snrMggOffcl) {
        getSnrMggOffcl().add(snrMggOffcl);
        return this;
    }

    /**
     * Adds a new item to the prtctr list.
     * @see #getPrtctr()
     * 
     */
    public AccountParties15 addPrtctr(InvestmentAccountOwnershipInformation14 prtctr) {
        getPrtctr().add(prtctr);
        return this;
    }

}
