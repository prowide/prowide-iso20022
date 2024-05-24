
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
 * Information which describes the organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationModification3", propOrder = {
    "fullLglNm",
    "tradgNm",
    "ctryOfOpr",
    "regnDt",
    "oprlAdr",
    "bizAdr",
    "lglAdr",
    "bllgAdr",
    "orgId",
    "rprtvOffcr",
    "trsrMgr",
    "mainMndtHldr",
    "sndr",
    "lglRprtv"
})
public class OrganisationModification3 {

    @XmlElement(name = "FullLglNm", required = true)
    protected FullLegalNameModification1 fullLglNm;
    @XmlElement(name = "TradgNm")
    protected TradingNameModification1 tradgNm;
    @XmlElement(name = "CtryOfOpr", required = true)
    protected String ctryOfOpr;
    @XmlElement(name = "RegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate regnDt;
    @XmlElement(name = "OprlAdr")
    protected AddressModification3 oprlAdr;
    @XmlElement(name = "BizAdr")
    protected AddressModification3 bizAdr;
    @XmlElement(name = "LglAdr", required = true)
    protected AddressModification3 lglAdr;
    @XmlElement(name = "BllgAdr")
    protected AddressModification3 bllgAdr;
    @XmlElement(name = "OrgId", required = true)
    protected OrganisationIdentification39 orgId;
    @XmlElement(name = "RprtvOffcr")
    protected List<PartyModification3> rprtvOffcr;
    @XmlElement(name = "TrsrMgr")
    protected PartyModification3 trsrMgr;
    @XmlElement(name = "MainMndtHldr")
    protected List<PartyModification3> mainMndtHldr;
    @XmlElement(name = "Sndr")
    protected List<PartyModification3> sndr;
    @XmlElement(name = "LglRprtv")
    protected List<PartyModification3> lglRprtv;

    /**
     * Gets the value of the fullLglNm property.
     * 
     * @return
     *     possible object is
     *     {@link FullLegalNameModification1 }
     *     
     */
    public FullLegalNameModification1 getFullLglNm() {
        return fullLglNm;
    }

    /**
     * Sets the value of the fullLglNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullLegalNameModification1 }
     *     
     */
    public OrganisationModification3 setFullLglNm(FullLegalNameModification1 value) {
        this.fullLglNm = value;
        return this;
    }

    /**
     * Gets the value of the tradgNm property.
     * 
     * @return
     *     possible object is
     *     {@link TradingNameModification1 }
     *     
     */
    public TradingNameModification1 getTradgNm() {
        return tradgNm;
    }

    /**
     * Sets the value of the tradgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingNameModification1 }
     *     
     */
    public OrganisationModification3 setTradgNm(TradingNameModification1 value) {
        this.tradgNm = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfOpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfOpr() {
        return ctryOfOpr;
    }

    /**
     * Sets the value of the ctryOfOpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationModification3 setCtryOfOpr(String value) {
        this.ctryOfOpr = value;
        return this;
    }

    /**
     * Gets the value of the regnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRegnDt() {
        return regnDt;
    }

    /**
     * Sets the value of the regnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationModification3 setRegnDt(LocalDate value) {
        this.regnDt = value;
        return this;
    }

    /**
     * Gets the value of the oprlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModification3 }
     *     
     */
    public AddressModification3 getOprlAdr() {
        return oprlAdr;
    }

    /**
     * Sets the value of the oprlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModification3 }
     *     
     */
    public OrganisationModification3 setOprlAdr(AddressModification3 value) {
        this.oprlAdr = value;
        return this;
    }

    /**
     * Gets the value of the bizAdr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModification3 }
     *     
     */
    public AddressModification3 getBizAdr() {
        return bizAdr;
    }

    /**
     * Sets the value of the bizAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModification3 }
     *     
     */
    public OrganisationModification3 setBizAdr(AddressModification3 value) {
        this.bizAdr = value;
        return this;
    }

    /**
     * Gets the value of the lglAdr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModification3 }
     *     
     */
    public AddressModification3 getLglAdr() {
        return lglAdr;
    }

    /**
     * Sets the value of the lglAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModification3 }
     *     
     */
    public OrganisationModification3 setLglAdr(AddressModification3 value) {
        this.lglAdr = value;
        return this;
    }

    /**
     * Gets the value of the bllgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModification3 }
     *     
     */
    public AddressModification3 getBllgAdr() {
        return bllgAdr;
    }

    /**
     * Sets the value of the bllgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModification3 }
     *     
     */
    public OrganisationModification3 setBllgAdr(AddressModification3 value) {
        this.bllgAdr = value;
        return this;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification39 }
     *     
     */
    public OrganisationIdentification39 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification39 }
     *     
     */
    public OrganisationModification3 setOrgId(OrganisationIdentification39 value) {
        this.orgId = value;
        return this;
    }

    /**
     * Gets the value of the rprtvOffcr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rprtvOffcr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRprtvOffcr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyModification3 }
     * 
     * 
     * @return
     *     The value of the rprtvOffcr property.
     */
    public List<PartyModification3> getRprtvOffcr() {
        if (rprtvOffcr == null) {
            rprtvOffcr = new ArrayList<>();
        }
        return this.rprtvOffcr;
    }

    /**
     * Gets the value of the trsrMgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyModification3 }
     *     
     */
    public PartyModification3 getTrsrMgr() {
        return trsrMgr;
    }

    /**
     * Sets the value of the trsrMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyModification3 }
     *     
     */
    public OrganisationModification3 setTrsrMgr(PartyModification3 value) {
        this.trsrMgr = value;
        return this;
    }

    /**
     * Gets the value of the mainMndtHldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mainMndtHldr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainMndtHldr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyModification3 }
     * 
     * 
     * @return
     *     The value of the mainMndtHldr property.
     */
    public List<PartyModification3> getMainMndtHldr() {
        if (mainMndtHldr == null) {
            mainMndtHldr = new ArrayList<>();
        }
        return this.mainMndtHldr;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sndr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSndr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyModification3 }
     * 
     * 
     * @return
     *     The value of the sndr property.
     */
    public List<PartyModification3> getSndr() {
        if (sndr == null) {
            sndr = new ArrayList<>();
        }
        return this.sndr;
    }

    /**
     * Gets the value of the lglRprtv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lglRprtv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLglRprtv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyModification3 }
     * 
     * 
     * @return
     *     The value of the lglRprtv property.
     */
    public List<PartyModification3> getLglRprtv() {
        if (lglRprtv == null) {
            lglRprtv = new ArrayList<>();
        }
        return this.lglRprtv;
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
     * Adds a new item to the rprtvOffcr list.
     * @see #getRprtvOffcr()
     * 
     */
    public OrganisationModification3 addRprtvOffcr(PartyModification3 rprtvOffcr) {
        getRprtvOffcr().add(rprtvOffcr);
        return this;
    }

    /**
     * Adds a new item to the mainMndtHldr list.
     * @see #getMainMndtHldr()
     * 
     */
    public OrganisationModification3 addMainMndtHldr(PartyModification3 mainMndtHldr) {
        getMainMndtHldr().add(mainMndtHldr);
        return this;
    }

    /**
     * Adds a new item to the sndr list.
     * @see #getSndr()
     * 
     */
    public OrganisationModification3 addSndr(PartyModification3 sndr) {
        getSndr().add(sndr);
        return this;
    }

    /**
     * Adds a new item to the lglRprtv list.
     * @see #getLglRprtv()
     * 
     */
    public OrganisationModification3 addLglRprtv(PartyModification3 lglRprtv) {
        getLglRprtv().add(lglRprtv);
        return this;
    }

}
