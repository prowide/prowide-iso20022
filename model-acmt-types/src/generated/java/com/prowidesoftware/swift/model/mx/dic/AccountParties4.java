
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
 * Any party who is related to an investment account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountParties4", propOrder = {
    "modScpIndctn",
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
    "grntr",
    "sttlr",
    "othrPty"
})
public class AccountParties4 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification1Code modScpIndctn;
    @XmlElement(name = "PmryOwnr")
    protected InvestmentAccountOwnershipInformation4 pmryOwnr;
    @XmlElement(name = "Trstee")
    protected List<InvestmentAccountOwnershipInformation4> trstee;
    @XmlElement(name = "CtdnForMnr")
    protected InvestmentAccountOwnershipInformation4 ctdnForMnr;
    @XmlElement(name = "Nmnee")
    protected InvestmentAccountOwnershipInformation4 nmnee;
    @XmlElement(name = "JntOwnr")
    protected List<InvestmentAccountOwnershipInformation4> jntOwnr;
    @XmlElement(name = "ScndryOwnr")
    protected InvestmentAccountOwnershipInformation4 scndryOwnr;
    @XmlElement(name = "Bnfcry")
    protected InvestmentAccountOwnershipInformation4 bnfcry;
    @XmlElement(name = "PwrOfAttny")
    protected InvestmentAccountOwnershipInformation4 pwrOfAttny;
    @XmlElement(name = "LglGuardn")
    protected InvestmentAccountOwnershipInformation4 lglGuardn;
    @XmlElement(name = "SucssrOnDth")
    protected InvestmentAccountOwnershipInformation4 sucssrOnDth;
    @XmlElement(name = "Admstr")
    protected InvestmentAccountOwnershipInformation4 admstr;
    @XmlElement(name = "Grntr")
    protected List<InvestmentAccountOwnershipInformation4> grntr;
    @XmlElement(name = "Sttlr")
    protected List<InvestmentAccountOwnershipInformation4> sttlr;
    @XmlElement(name = "OthrPty")
    protected List<ExtendedParty1> othrPty;

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
    public AccountParties4 setModScpIndctn(DataModification1Code value) {
        this.modScpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the pmryOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public InvestmentAccountOwnershipInformation4 getPmryOwnr() {
        return pmryOwnr;
    }

    /**
     * Sets the value of the pmryOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public AccountParties4 setPmryOwnr(InvestmentAccountOwnershipInformation4 value) {
        this.pmryOwnr = value;
        return this;
    }

    /**
     * Gets the value of the trstee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trstee property.
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
     * {@link InvestmentAccountOwnershipInformation4 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation4> getTrstee() {
        if (trstee == null) {
            trstee = new ArrayList<InvestmentAccountOwnershipInformation4>();
        }
        return this.trstee;
    }

    /**
     * Gets the value of the ctdnForMnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public InvestmentAccountOwnershipInformation4 getCtdnForMnr() {
        return ctdnForMnr;
    }

    /**
     * Sets the value of the ctdnForMnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public AccountParties4 setCtdnForMnr(InvestmentAccountOwnershipInformation4 value) {
        this.ctdnForMnr = value;
        return this;
    }

    /**
     * Gets the value of the nmnee property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public InvestmentAccountOwnershipInformation4 getNmnee() {
        return nmnee;
    }

    /**
     * Sets the value of the nmnee property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public AccountParties4 setNmnee(InvestmentAccountOwnershipInformation4 value) {
        this.nmnee = value;
        return this;
    }

    /**
     * Gets the value of the jntOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jntOwnr property.
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
     * {@link InvestmentAccountOwnershipInformation4 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation4> getJntOwnr() {
        if (jntOwnr == null) {
            jntOwnr = new ArrayList<InvestmentAccountOwnershipInformation4>();
        }
        return this.jntOwnr;
    }

    /**
     * Gets the value of the scndryOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public InvestmentAccountOwnershipInformation4 getScndryOwnr() {
        return scndryOwnr;
    }

    /**
     * Sets the value of the scndryOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public AccountParties4 setScndryOwnr(InvestmentAccountOwnershipInformation4 value) {
        this.scndryOwnr = value;
        return this;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public InvestmentAccountOwnershipInformation4 getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public AccountParties4 setBnfcry(InvestmentAccountOwnershipInformation4 value) {
        this.bnfcry = value;
        return this;
    }

    /**
     * Gets the value of the pwrOfAttny property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public InvestmentAccountOwnershipInformation4 getPwrOfAttny() {
        return pwrOfAttny;
    }

    /**
     * Sets the value of the pwrOfAttny property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public AccountParties4 setPwrOfAttny(InvestmentAccountOwnershipInformation4 value) {
        this.pwrOfAttny = value;
        return this;
    }

    /**
     * Gets the value of the lglGuardn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public InvestmentAccountOwnershipInformation4 getLglGuardn() {
        return lglGuardn;
    }

    /**
     * Sets the value of the lglGuardn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public AccountParties4 setLglGuardn(InvestmentAccountOwnershipInformation4 value) {
        this.lglGuardn = value;
        return this;
    }

    /**
     * Gets the value of the sucssrOnDth property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public InvestmentAccountOwnershipInformation4 getSucssrOnDth() {
        return sucssrOnDth;
    }

    /**
     * Sets the value of the sucssrOnDth property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public AccountParties4 setSucssrOnDth(InvestmentAccountOwnershipInformation4 value) {
        this.sucssrOnDth = value;
        return this;
    }

    /**
     * Gets the value of the admstr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public InvestmentAccountOwnershipInformation4 getAdmstr() {
        return admstr;
    }

    /**
     * Sets the value of the admstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation4 }
     *     
     */
    public AccountParties4 setAdmstr(InvestmentAccountOwnershipInformation4 value) {
        this.admstr = value;
        return this;
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
     * {@link InvestmentAccountOwnershipInformation4 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation4> getGrntr() {
        if (grntr == null) {
            grntr = new ArrayList<InvestmentAccountOwnershipInformation4>();
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
     * {@link InvestmentAccountOwnershipInformation4 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation4> getSttlr() {
        if (sttlr == null) {
            sttlr = new ArrayList<InvestmentAccountOwnershipInformation4>();
        }
        return this.sttlr;
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
     * {@link ExtendedParty1 }
     * 
     * 
     */
    public List<ExtendedParty1> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<ExtendedParty1>();
        }
        return this.othrPty;
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
    public AccountParties4 addTrstee(InvestmentAccountOwnershipInformation4 trstee) {
        getTrstee().add(trstee);
        return this;
    }

    /**
     * Adds a new item to the jntOwnr list.
     * @see #getJntOwnr()
     * 
     */
    public AccountParties4 addJntOwnr(InvestmentAccountOwnershipInformation4 jntOwnr) {
        getJntOwnr().add(jntOwnr);
        return this;
    }

    /**
     * Adds a new item to the grntr list.
     * @see #getGrntr()
     * 
     */
    public AccountParties4 addGrntr(InvestmentAccountOwnershipInformation4 grntr) {
        getGrntr().add(grntr);
        return this;
    }

    /**
     * Adds a new item to the sttlr list.
     * @see #getSttlr()
     * 
     */
    public AccountParties4 addSttlr(InvestmentAccountOwnershipInformation4 sttlr) {
        getSttlr().add(sttlr);
        return this;
    }

    /**
     * Adds a new item to the othrPty list.
     * @see #getOthrPty()
     * 
     */
    public AccountParties4 addOthrPty(ExtendedParty1 othrPty) {
        getOthrPty().add(othrPty);
        return this;
    }

}
