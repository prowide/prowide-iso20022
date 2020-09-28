
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
@XmlType(name = "OrganisationModification1", propOrder = {
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
public class OrganisationModification1 {

    @XmlElement(name = "FullLglNm", required = true)
    protected FullLegalNameModification1 fullLglNm;
    @XmlElement(name = "TradgNm")
    protected TradingNameModification1 tradgNm;
    @XmlElement(name = "CtryOfOpr", required = true)
    protected String ctryOfOpr;
    @XmlElement(name = "RegnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regnDt;
    @XmlElement(name = "OprlAdr")
    protected AddressModification1 oprlAdr;
    @XmlElement(name = "BizAdr")
    protected AddressModification1 bizAdr;
    @XmlElement(name = "LglAdr", required = true)
    protected AddressModification1 lglAdr;
    @XmlElement(name = "BllgAdr")
    protected AddressModification1 bllgAdr;
    @XmlElement(name = "OrgId", required = true)
    protected OrganisationIdentification8 orgId;
    @XmlElement(name = "RprtvOffcr")
    protected List<PartyModification1> rprtvOffcr;
    @XmlElement(name = "TrsrMgr")
    protected PartyModification1 trsrMgr;
    @XmlElement(name = "MainMndtHldr")
    protected List<PartyModification1> mainMndtHldr;
    @XmlElement(name = "Sndr")
    protected List<PartyModification1> sndr;
    @XmlElement(name = "LglRprtv")
    protected List<PartyModification1> lglRprtv;

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
    public OrganisationModification1 setFullLglNm(FullLegalNameModification1 value) {
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
    public OrganisationModification1 setTradgNm(TradingNameModification1 value) {
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
    public OrganisationModification1 setCtryOfOpr(String value) {
        this.ctryOfOpr = value;
        return this;
    }

    /**
     * Gets the value of the regnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegnDt() {
        return regnDt;
    }

    /**
     * Sets the value of the regnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public OrganisationModification1 setRegnDt(XMLGregorianCalendar value) {
        this.regnDt = value;
        return this;
    }

    /**
     * Gets the value of the oprlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModification1 }
     *     
     */
    public AddressModification1 getOprlAdr() {
        return oprlAdr;
    }

    /**
     * Sets the value of the oprlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModification1 }
     *     
     */
    public OrganisationModification1 setOprlAdr(AddressModification1 value) {
        this.oprlAdr = value;
        return this;
    }

    /**
     * Gets the value of the bizAdr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModification1 }
     *     
     */
    public AddressModification1 getBizAdr() {
        return bizAdr;
    }

    /**
     * Sets the value of the bizAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModification1 }
     *     
     */
    public OrganisationModification1 setBizAdr(AddressModification1 value) {
        this.bizAdr = value;
        return this;
    }

    /**
     * Gets the value of the lglAdr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModification1 }
     *     
     */
    public AddressModification1 getLglAdr() {
        return lglAdr;
    }

    /**
     * Sets the value of the lglAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModification1 }
     *     
     */
    public OrganisationModification1 setLglAdr(AddressModification1 value) {
        this.lglAdr = value;
        return this;
    }

    /**
     * Gets the value of the bllgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModification1 }
     *     
     */
    public AddressModification1 getBllgAdr() {
        return bllgAdr;
    }

    /**
     * Sets the value of the bllgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModification1 }
     *     
     */
    public OrganisationModification1 setBllgAdr(AddressModification1 value) {
        this.bllgAdr = value;
        return this;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification8 }
     *     
     */
    public OrganisationIdentification8 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification8 }
     *     
     */
    public OrganisationModification1 setOrgId(OrganisationIdentification8 value) {
        this.orgId = value;
        return this;
    }

    /**
     * Gets the value of the rprtvOffcr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rprtvOffcr property.
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
     * {@link PartyModification1 }
     * 
     * 
     */
    public List<PartyModification1> getRprtvOffcr() {
        if (rprtvOffcr == null) {
            rprtvOffcr = new ArrayList<PartyModification1>();
        }
        return this.rprtvOffcr;
    }

    /**
     * Gets the value of the trsrMgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyModification1 }
     *     
     */
    public PartyModification1 getTrsrMgr() {
        return trsrMgr;
    }

    /**
     * Sets the value of the trsrMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyModification1 }
     *     
     */
    public OrganisationModification1 setTrsrMgr(PartyModification1 value) {
        this.trsrMgr = value;
        return this;
    }

    /**
     * Gets the value of the mainMndtHldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainMndtHldr property.
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
     * {@link PartyModification1 }
     * 
     * 
     */
    public List<PartyModification1> getMainMndtHldr() {
        if (mainMndtHldr == null) {
            mainMndtHldr = new ArrayList<PartyModification1>();
        }
        return this.mainMndtHldr;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sndr property.
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
     * {@link PartyModification1 }
     * 
     * 
     */
    public List<PartyModification1> getSndr() {
        if (sndr == null) {
            sndr = new ArrayList<PartyModification1>();
        }
        return this.sndr;
    }

    /**
     * Gets the value of the lglRprtv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lglRprtv property.
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
     * {@link PartyModification1 }
     * 
     * 
     */
    public List<PartyModification1> getLglRprtv() {
        if (lglRprtv == null) {
            lglRprtv = new ArrayList<PartyModification1>();
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
    public OrganisationModification1 addRprtvOffcr(PartyModification1 rprtvOffcr) {
        getRprtvOffcr().add(rprtvOffcr);
        return this;
    }

    /**
     * Adds a new item to the mainMndtHldr list.
     * @see #getMainMndtHldr()
     * 
     */
    public OrganisationModification1 addMainMndtHldr(PartyModification1 mainMndtHldr) {
        getMainMndtHldr().add(mainMndtHldr);
        return this;
    }

    /**
     * Adds a new item to the sndr list.
     * @see #getSndr()
     * 
     */
    public OrganisationModification1 addSndr(PartyModification1 sndr) {
        getSndr().add(sndr);
        return this;
    }

    /**
     * Adds a new item to the lglRprtv list.
     * @see #getLglRprtv()
     * 
     */
    public OrganisationModification1 addLglRprtv(PartyModification1 lglRprtv) {
        getLglRprtv().add(lglRprtv);
        return this;
    }

}
