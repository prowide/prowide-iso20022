
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Any party who is related to an investment account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountParties5", propOrder = {
    "pmryOwnr",
    "trstee",
    "ctdnForMnr",
    "nmnee",
    "jntOwnr",
    "scndryOwnr",
    "bnfcry",
    "pwrOfAttny",
    "lglGuardn",
    "sucssrOnDth",
    "admstr",
    "othrPty",
    "grntr",
    "sttlr"
})
public class AccountParties5 {

    @XmlElement(name = "PmryOwnr")
    protected InvestmentAccountOwnershipInformation5 pmryOwnr;
    @XmlElement(name = "Trstee")
    protected List<InvestmentAccountOwnershipInformation5> trstee;
    @XmlElement(name = "CtdnForMnr")
    protected InvestmentAccountOwnershipInformation5 ctdnForMnr;
    @XmlElement(name = "Nmnee")
    protected InvestmentAccountOwnershipInformation5 nmnee;
    @XmlElement(name = "JntOwnr")
    protected List<InvestmentAccountOwnershipInformation5> jntOwnr;
    @XmlElement(name = "ScndryOwnr")
    protected List<InvestmentAccountOwnershipInformation5> scndryOwnr;
    @XmlElement(name = "Bnfcry")
    protected List<InvestmentAccountOwnershipInformation5> bnfcry;
    @XmlElement(name = "PwrOfAttny")
    protected List<InvestmentAccountOwnershipInformation5> pwrOfAttny;
    @XmlElement(name = "LglGuardn")
    protected List<InvestmentAccountOwnershipInformation5> lglGuardn;
    @XmlElement(name = "SucssrOnDth")
    protected List<InvestmentAccountOwnershipInformation5> sucssrOnDth;
    @XmlElement(name = "Admstr")
    protected InvestmentAccountOwnershipInformation5 admstr;
    @XmlElement(name = "OthrPty")
    protected List<ExtendedParty2> othrPty;
    @XmlElement(name = "Grntr")
    protected List<InvestmentAccountOwnershipInformation5> grntr;
    @XmlElement(name = "Sttlr")
    protected List<InvestmentAccountOwnershipInformation5> sttlr;

    /**
     * Gets the value of the pmryOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation5 }
     *     
     */
    public InvestmentAccountOwnershipInformation5 getPmryOwnr() {
        return pmryOwnr;
    }

    /**
     * Sets the value of the pmryOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation5 }
     *     
     */
    public AccountParties5 setPmryOwnr(InvestmentAccountOwnershipInformation5 value) {
        this.pmryOwnr = value;
        return this;
    }

    /**
     * Gets the value of the trstee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trstee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrstee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation5 }
     * 
     * 
     * @return
     *     The value of the trstee property.
     */
    public List<InvestmentAccountOwnershipInformation5> getTrstee() {
        if (trstee == null) {
            trstee = new ArrayList<>();
        }
        return this.trstee;
    }

    /**
     * Gets the value of the ctdnForMnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation5 }
     *     
     */
    public InvestmentAccountOwnershipInformation5 getCtdnForMnr() {
        return ctdnForMnr;
    }

    /**
     * Sets the value of the ctdnForMnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation5 }
     *     
     */
    public AccountParties5 setCtdnForMnr(InvestmentAccountOwnershipInformation5 value) {
        this.ctdnForMnr = value;
        return this;
    }

    /**
     * Gets the value of the nmnee property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation5 }
     *     
     */
    public InvestmentAccountOwnershipInformation5 getNmnee() {
        return nmnee;
    }

    /**
     * Sets the value of the nmnee property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation5 }
     *     
     */
    public AccountParties5 setNmnee(InvestmentAccountOwnershipInformation5 value) {
        this.nmnee = value;
        return this;
    }

    /**
     * Gets the value of the jntOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the jntOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJntOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation5 }
     * 
     * 
     * @return
     *     The value of the jntOwnr property.
     */
    public List<InvestmentAccountOwnershipInformation5> getJntOwnr() {
        if (jntOwnr == null) {
            jntOwnr = new ArrayList<>();
        }
        return this.jntOwnr;
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
     * {@link InvestmentAccountOwnershipInformation5 }
     * 
     * 
     * @return
     *     The value of the scndryOwnr property.
     */
    public List<InvestmentAccountOwnershipInformation5> getScndryOwnr() {
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
     * {@link InvestmentAccountOwnershipInformation5 }
     * 
     * 
     * @return
     *     The value of the bnfcry property.
     */
    public List<InvestmentAccountOwnershipInformation5> getBnfcry() {
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
     * {@link InvestmentAccountOwnershipInformation5 }
     * 
     * 
     * @return
     *     The value of the pwrOfAttny property.
     */
    public List<InvestmentAccountOwnershipInformation5> getPwrOfAttny() {
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
     * {@link InvestmentAccountOwnershipInformation5 }
     * 
     * 
     * @return
     *     The value of the lglGuardn property.
     */
    public List<InvestmentAccountOwnershipInformation5> getLglGuardn() {
        if (lglGuardn == null) {
            lglGuardn = new ArrayList<>();
        }
        return this.lglGuardn;
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
     * {@link InvestmentAccountOwnershipInformation5 }
     * 
     * 
     * @return
     *     The value of the sucssrOnDth property.
     */
    public List<InvestmentAccountOwnershipInformation5> getSucssrOnDth() {
        if (sucssrOnDth == null) {
            sucssrOnDth = new ArrayList<>();
        }
        return this.sucssrOnDth;
    }

    /**
     * Gets the value of the admstr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation5 }
     *     
     */
    public InvestmentAccountOwnershipInformation5 getAdmstr() {
        return admstr;
    }

    /**
     * Sets the value of the admstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation5 }
     *     
     */
    public AccountParties5 setAdmstr(InvestmentAccountOwnershipInformation5 value) {
        this.admstr = value;
        return this;
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
     * {@link ExtendedParty2 }
     * 
     * 
     * @return
     *     The value of the othrPty property.
     */
    public List<ExtendedParty2> getOthrPty() {
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
     * {@link InvestmentAccountOwnershipInformation5 }
     * 
     * 
     * @return
     *     The value of the grntr property.
     */
    public List<InvestmentAccountOwnershipInformation5> getGrntr() {
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
     * {@link InvestmentAccountOwnershipInformation5 }
     * 
     * 
     * @return
     *     The value of the sttlr property.
     */
    public List<InvestmentAccountOwnershipInformation5> getSttlr() {
        if (sttlr == null) {
            sttlr = new ArrayList<>();
        }
        return this.sttlr;
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
     * Adds a new item to the trstee list.
     * @see #getTrstee()
     * 
     */
    public AccountParties5 addTrstee(InvestmentAccountOwnershipInformation5 trstee) {
        getTrstee().add(trstee);
        return this;
    }

    /**
     * Adds a new item to the jntOwnr list.
     * @see #getJntOwnr()
     * 
     */
    public AccountParties5 addJntOwnr(InvestmentAccountOwnershipInformation5 jntOwnr) {
        getJntOwnr().add(jntOwnr);
        return this;
    }

    /**
     * Adds a new item to the scndryOwnr list.
     * @see #getScndryOwnr()
     * 
     */
    public AccountParties5 addScndryOwnr(InvestmentAccountOwnershipInformation5 scndryOwnr) {
        getScndryOwnr().add(scndryOwnr);
        return this;
    }

    /**
     * Adds a new item to the bnfcry list.
     * @see #getBnfcry()
     * 
     */
    public AccountParties5 addBnfcry(InvestmentAccountOwnershipInformation5 bnfcry) {
        getBnfcry().add(bnfcry);
        return this;
    }

    /**
     * Adds a new item to the pwrOfAttny list.
     * @see #getPwrOfAttny()
     * 
     */
    public AccountParties5 addPwrOfAttny(InvestmentAccountOwnershipInformation5 pwrOfAttny) {
        getPwrOfAttny().add(pwrOfAttny);
        return this;
    }

    /**
     * Adds a new item to the lglGuardn list.
     * @see #getLglGuardn()
     * 
     */
    public AccountParties5 addLglGuardn(InvestmentAccountOwnershipInformation5 lglGuardn) {
        getLglGuardn().add(lglGuardn);
        return this;
    }

    /**
     * Adds a new item to the sucssrOnDth list.
     * @see #getSucssrOnDth()
     * 
     */
    public AccountParties5 addSucssrOnDth(InvestmentAccountOwnershipInformation5 sucssrOnDth) {
        getSucssrOnDth().add(sucssrOnDth);
        return this;
    }

    /**
     * Adds a new item to the othrPty list.
     * @see #getOthrPty()
     * 
     */
    public AccountParties5 addOthrPty(ExtendedParty2 othrPty) {
        getOthrPty().add(othrPty);
        return this;
    }

    /**
     * Adds a new item to the grntr list.
     * @see #getGrntr()
     * 
     */
    public AccountParties5 addGrntr(InvestmentAccountOwnershipInformation5 grntr) {
        getGrntr().add(grntr);
        return this;
    }

    /**
     * Adds a new item to the sttlr list.
     * @see #getSttlr()
     * 
     */
    public AccountParties5 addSttlr(InvestmentAccountOwnershipInformation5 sttlr) {
        getSttlr().add(sttlr);
        return this;
    }

}
