
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
 * Party related to an investment account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountParties7", propOrder = {
    "modScpIndctn",
    "prncplAcctPty",
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
public class AccountParties7 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification1Code modScpIndctn;
    @XmlElement(name = "PrncplAcctPty")
    protected AccountParties2Choice prncplAcctPty;
    @XmlElement(name = "ScndryOwnr")
    protected InvestmentAccountOwnershipInformation7 scndryOwnr;
    @XmlElement(name = "Bnfcry")
    protected InvestmentAccountOwnershipInformation7 bnfcry;
    @XmlElement(name = "PwrOfAttny")
    protected InvestmentAccountOwnershipInformation7 pwrOfAttny;
    @XmlElement(name = "LglGuardn")
    protected InvestmentAccountOwnershipInformation7 lglGuardn;
    @XmlElement(name = "SucssrOnDth")
    protected InvestmentAccountOwnershipInformation7 sucssrOnDth;
    @XmlElement(name = "Admstr")
    protected InvestmentAccountOwnershipInformation7 admstr;
    @XmlElement(name = "Grntr")
    protected List<InvestmentAccountOwnershipInformation7> grntr;
    @XmlElement(name = "Sttlr")
    protected List<InvestmentAccountOwnershipInformation7> sttlr;
    @XmlElement(name = "OthrPty")
    protected List<ExtendedParty4> othrPty;

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
    public AccountParties7 setModScpIndctn(DataModification1Code value) {
        this.modScpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the prncplAcctPty property.
     * 
     * @return
     *     possible object is
     *     {@link AccountParties2Choice }
     *     
     */
    public AccountParties2Choice getPrncplAcctPty() {
        return prncplAcctPty;
    }

    /**
     * Sets the value of the prncplAcctPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountParties2Choice }
     *     
     */
    public AccountParties7 setPrncplAcctPty(AccountParties2Choice value) {
        this.prncplAcctPty = value;
        return this;
    }

    /**
     * Gets the value of the scndryOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation7 }
     *     
     */
    public InvestmentAccountOwnershipInformation7 getScndryOwnr() {
        return scndryOwnr;
    }

    /**
     * Sets the value of the scndryOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation7 }
     *     
     */
    public AccountParties7 setScndryOwnr(InvestmentAccountOwnershipInformation7 value) {
        this.scndryOwnr = value;
        return this;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation7 }
     *     
     */
    public InvestmentAccountOwnershipInformation7 getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation7 }
     *     
     */
    public AccountParties7 setBnfcry(InvestmentAccountOwnershipInformation7 value) {
        this.bnfcry = value;
        return this;
    }

    /**
     * Gets the value of the pwrOfAttny property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation7 }
     *     
     */
    public InvestmentAccountOwnershipInformation7 getPwrOfAttny() {
        return pwrOfAttny;
    }

    /**
     * Sets the value of the pwrOfAttny property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation7 }
     *     
     */
    public AccountParties7 setPwrOfAttny(InvestmentAccountOwnershipInformation7 value) {
        this.pwrOfAttny = value;
        return this;
    }

    /**
     * Gets the value of the lglGuardn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation7 }
     *     
     */
    public InvestmentAccountOwnershipInformation7 getLglGuardn() {
        return lglGuardn;
    }

    /**
     * Sets the value of the lglGuardn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation7 }
     *     
     */
    public AccountParties7 setLglGuardn(InvestmentAccountOwnershipInformation7 value) {
        this.lglGuardn = value;
        return this;
    }

    /**
     * Gets the value of the sucssrOnDth property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation7 }
     *     
     */
    public InvestmentAccountOwnershipInformation7 getSucssrOnDth() {
        return sucssrOnDth;
    }

    /**
     * Sets the value of the sucssrOnDth property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation7 }
     *     
     */
    public AccountParties7 setSucssrOnDth(InvestmentAccountOwnershipInformation7 value) {
        this.sucssrOnDth = value;
        return this;
    }

    /**
     * Gets the value of the admstr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation7 }
     *     
     */
    public InvestmentAccountOwnershipInformation7 getAdmstr() {
        return admstr;
    }

    /**
     * Sets the value of the admstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation7 }
     *     
     */
    public AccountParties7 setAdmstr(InvestmentAccountOwnershipInformation7 value) {
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
     * {@link InvestmentAccountOwnershipInformation7 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation7> getGrntr() {
        if (grntr == null) {
            grntr = new ArrayList<InvestmentAccountOwnershipInformation7>();
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
     * {@link InvestmentAccountOwnershipInformation7 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation7> getSttlr() {
        if (sttlr == null) {
            sttlr = new ArrayList<InvestmentAccountOwnershipInformation7>();
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
     * {@link ExtendedParty4 }
     * 
     * 
     */
    public List<ExtendedParty4> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<ExtendedParty4>();
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
     * Adds a new item to the grntr list.
     * @see #getGrntr()
     * 
     */
    public AccountParties7 addGrntr(InvestmentAccountOwnershipInformation7 grntr) {
        getGrntr().add(grntr);
        return this;
    }

    /**
     * Adds a new item to the sttlr list.
     * @see #getSttlr()
     * 
     */
    public AccountParties7 addSttlr(InvestmentAccountOwnershipInformation7 sttlr) {
        getSttlr().add(sttlr);
        return this;
    }

    /**
     * Adds a new item to the othrPty list.
     * @see #getOthrPty()
     * 
     */
    public AccountParties7 addOthrPty(ExtendedParty4 othrPty) {
        getOthrPty().add(othrPty);
        return this;
    }

}
