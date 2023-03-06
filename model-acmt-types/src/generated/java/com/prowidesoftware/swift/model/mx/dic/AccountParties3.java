
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
 * .
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountParties3", propOrder = {
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
    "othrPty"
})
public class AccountParties3 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification1Code modScpIndctn;
    @XmlElement(name = "PmryOwnr")
    protected InvestmentAccountOwnershipInformation3 pmryOwnr;
    @XmlElement(name = "Trstee")
    protected InvestmentAccountOwnershipInformation3 trstee;
    @XmlElement(name = "CtdnForMnr")
    protected InvestmentAccountOwnershipInformation3 ctdnForMnr;
    @XmlElement(name = "Nmnee")
    protected InvestmentAccountOwnershipInformation3 nmnee;
    @XmlElement(name = "JntOwnr")
    protected List<InvestmentAccountOwnershipInformation3> jntOwnr;
    @XmlElement(name = "ScndryOwnr")
    protected InvestmentAccountOwnershipInformation3 scndryOwnr;
    @XmlElement(name = "Bnfcry")
    protected InvestmentAccountOwnershipInformation3 bnfcry;
    @XmlElement(name = "PwrOfAttny")
    protected InvestmentAccountOwnershipInformation3 pwrOfAttny;
    @XmlElement(name = "LglGuardn")
    protected InvestmentAccountOwnershipInformation3 lglGuardn;
    @XmlElement(name = "SucssrOnDth")
    protected InvestmentAccountOwnershipInformation3 sucssrOnDth;
    @XmlElement(name = "Admstr")
    protected InvestmentAccountOwnershipInformation3 admstr;
    @XmlElement(name = "OthrPty")
    protected InvestmentAccountOwnershipInformation3 othrPty;

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
    public AccountParties3 setModScpIndctn(DataModification1Code value) {
        this.modScpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the pmryOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public InvestmentAccountOwnershipInformation3 getPmryOwnr() {
        return pmryOwnr;
    }

    /**
     * Sets the value of the pmryOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public AccountParties3 setPmryOwnr(InvestmentAccountOwnershipInformation3 value) {
        this.pmryOwnr = value;
        return this;
    }

    /**
     * Gets the value of the trstee property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public InvestmentAccountOwnershipInformation3 getTrstee() {
        return trstee;
    }

    /**
     * Sets the value of the trstee property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public AccountParties3 setTrstee(InvestmentAccountOwnershipInformation3 value) {
        this.trstee = value;
        return this;
    }

    /**
     * Gets the value of the ctdnForMnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public InvestmentAccountOwnershipInformation3 getCtdnForMnr() {
        return ctdnForMnr;
    }

    /**
     * Sets the value of the ctdnForMnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public AccountParties3 setCtdnForMnr(InvestmentAccountOwnershipInformation3 value) {
        this.ctdnForMnr = value;
        return this;
    }

    /**
     * Gets the value of the nmnee property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public InvestmentAccountOwnershipInformation3 getNmnee() {
        return nmnee;
    }

    /**
     * Sets the value of the nmnee property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public AccountParties3 setNmnee(InvestmentAccountOwnershipInformation3 value) {
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
     * {@link InvestmentAccountOwnershipInformation3 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation3> getJntOwnr() {
        if (jntOwnr == null) {
            jntOwnr = new ArrayList<InvestmentAccountOwnershipInformation3>();
        }
        return this.jntOwnr;
    }

    /**
     * Gets the value of the scndryOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public InvestmentAccountOwnershipInformation3 getScndryOwnr() {
        return scndryOwnr;
    }

    /**
     * Sets the value of the scndryOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public AccountParties3 setScndryOwnr(InvestmentAccountOwnershipInformation3 value) {
        this.scndryOwnr = value;
        return this;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public InvestmentAccountOwnershipInformation3 getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public AccountParties3 setBnfcry(InvestmentAccountOwnershipInformation3 value) {
        this.bnfcry = value;
        return this;
    }

    /**
     * Gets the value of the pwrOfAttny property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public InvestmentAccountOwnershipInformation3 getPwrOfAttny() {
        return pwrOfAttny;
    }

    /**
     * Sets the value of the pwrOfAttny property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public AccountParties3 setPwrOfAttny(InvestmentAccountOwnershipInformation3 value) {
        this.pwrOfAttny = value;
        return this;
    }

    /**
     * Gets the value of the lglGuardn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public InvestmentAccountOwnershipInformation3 getLglGuardn() {
        return lglGuardn;
    }

    /**
     * Sets the value of the lglGuardn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public AccountParties3 setLglGuardn(InvestmentAccountOwnershipInformation3 value) {
        this.lglGuardn = value;
        return this;
    }

    /**
     * Gets the value of the sucssrOnDth property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public InvestmentAccountOwnershipInformation3 getSucssrOnDth() {
        return sucssrOnDth;
    }

    /**
     * Sets the value of the sucssrOnDth property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public AccountParties3 setSucssrOnDth(InvestmentAccountOwnershipInformation3 value) {
        this.sucssrOnDth = value;
        return this;
    }

    /**
     * Gets the value of the admstr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public InvestmentAccountOwnershipInformation3 getAdmstr() {
        return admstr;
    }

    /**
     * Sets the value of the admstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public AccountParties3 setAdmstr(InvestmentAccountOwnershipInformation3 value) {
        this.admstr = value;
        return this;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public InvestmentAccountOwnershipInformation3 getOthrPty() {
        return othrPty;
    }

    /**
     * Sets the value of the othrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation3 }
     *     
     */
    public AccountParties3 setOthrPty(InvestmentAccountOwnershipInformation3 value) {
        this.othrPty = value;
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
     * Adds a new item to the jntOwnr list.
     * @see #getJntOwnr()
     * 
     */
    public AccountParties3 addJntOwnr(InvestmentAccountOwnershipInformation3 jntOwnr) {
        getJntOwnr().add(jntOwnr);
        return this;
    }

}
