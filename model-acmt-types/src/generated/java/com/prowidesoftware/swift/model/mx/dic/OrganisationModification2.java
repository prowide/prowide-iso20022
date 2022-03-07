
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "OrganisationModification2", propOrder = {
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
public class OrganisationModification2 {

    @XmlElement(name = "FullLglNm", required = true)
    protected FullLegalNameModification1 fullLglNm;
    @XmlElement(name = "TradgNm")
    protected TradingNameModification1 tradgNm;
    @XmlElement(name = "CtryOfOpr", required = true)
    protected String ctryOfOpr;
    @XmlElement(name = "RegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regnDt;
    @XmlElement(name = "OprlAdr")
    protected AddressModification2 oprlAdr;
    @XmlElement(name = "BizAdr")
    protected AddressModification2 bizAdr;
    @XmlElement(name = "LglAdr", required = true)
    protected AddressModification2 lglAdr;
    @XmlElement(name = "BllgAdr")
    protected AddressModification2 bllgAdr;
    @XmlElement(name = "OrgId", required = true)
    protected OrganisationIdentification29 orgId;
    @XmlElement(name = "RprtvOffcr")
    protected List<PartyModification2> rprtvOffcr;
    @XmlElement(name = "TrsrMgr")
    protected PartyModification2 trsrMgr;
    @XmlElement(name = "MainMndtHldr")
    protected List<PartyModification2> mainMndtHldr;
    @XmlElement(name = "Sndr")
    protected List<PartyModification2> sndr;
    @XmlElement(name = "LglRprtv")
    protected List<PartyModification2> lglRprtv;

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
    public OrganisationModification2 setFullLglNm(FullLegalNameModification1 value) {
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
    public OrganisationModification2 setTradgNm(TradingNameModification1 value) {
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
    public OrganisationModification2 setCtryOfOpr(String value) {
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
    public XMLGregorianCalendar getRegnDt() {
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
    public OrganisationModification2 setRegnDt(XMLGregorianCalendar value) {
        this.regnDt = value;
        return this;
    }

    /**
     * Gets the value of the oprlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModification2 }
     *     
     */
    public AddressModification2 getOprlAdr() {
        return oprlAdr;
    }

    /**
     * Sets the value of the oprlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModification2 }
     *     
     */
    public OrganisationModification2 setOprlAdr(AddressModification2 value) {
        this.oprlAdr = value;
        return this;
    }

    /**
     * Gets the value of the bizAdr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModification2 }
     *     
     */
    public AddressModification2 getBizAdr() {
        return bizAdr;
    }

    /**
     * Sets the value of the bizAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModification2 }
     *     
     */
    public OrganisationModification2 setBizAdr(AddressModification2 value) {
        this.bizAdr = value;
        return this;
    }

    /**
     * Gets the value of the lglAdr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModification2 }
     *     
     */
    public AddressModification2 getLglAdr() {
        return lglAdr;
    }

    /**
     * Sets the value of the lglAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModification2 }
     *     
     */
    public OrganisationModification2 setLglAdr(AddressModification2 value) {
        this.lglAdr = value;
        return this;
    }

    /**
     * Gets the value of the bllgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModification2 }
     *     
     */
    public AddressModification2 getBllgAdr() {
        return bllgAdr;
    }

    /**
     * Sets the value of the bllgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModification2 }
     *     
     */
    public OrganisationModification2 setBllgAdr(AddressModification2 value) {
        this.bllgAdr = value;
        return this;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public OrganisationIdentification29 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public OrganisationModification2 setOrgId(OrganisationIdentification29 value) {
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
     * {@link PartyModification2 }
     * 
     * 
     */
    public List<PartyModification2> getRprtvOffcr() {
        if (rprtvOffcr == null) {
            rprtvOffcr = new ArrayList<PartyModification2>();
        }
        return this.rprtvOffcr;
    }

    /**
     * Gets the value of the trsrMgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyModification2 }
     *     
     */
    public PartyModification2 getTrsrMgr() {
        return trsrMgr;
    }

    /**
     * Sets the value of the trsrMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyModification2 }
     *     
     */
    public OrganisationModification2 setTrsrMgr(PartyModification2 value) {
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
     * {@link PartyModification2 }
     * 
     * 
     */
    public List<PartyModification2> getMainMndtHldr() {
        if (mainMndtHldr == null) {
            mainMndtHldr = new ArrayList<PartyModification2>();
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
     * {@link PartyModification2 }
     * 
     * 
     */
    public List<PartyModification2> getSndr() {
        if (sndr == null) {
            sndr = new ArrayList<PartyModification2>();
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
     * {@link PartyModification2 }
     * 
     * 
     */
    public List<PartyModification2> getLglRprtv() {
        if (lglRprtv == null) {
            lglRprtv = new ArrayList<PartyModification2>();
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
    public OrganisationModification2 addRprtvOffcr(PartyModification2 rprtvOffcr) {
        getRprtvOffcr().add(rprtvOffcr);
        return this;
    }

    /**
     * Adds a new item to the mainMndtHldr list.
     * @see #getMainMndtHldr()
     * 
     */
    public OrganisationModification2 addMainMndtHldr(PartyModification2 mainMndtHldr) {
        getMainMndtHldr().add(mainMndtHldr);
        return this;
    }

    /**
     * Adds a new item to the sndr list.
     * @see #getSndr()
     * 
     */
    public OrganisationModification2 addSndr(PartyModification2 sndr) {
        getSndr().add(sndr);
        return this;
    }

    /**
     * Adds a new item to the lglRprtv list.
     * @see #getLglRprtv()
     * 
     */
    public OrganisationModification2 addLglRprtv(PartyModification2 lglRprtv) {
        getLglRprtv().add(lglRprtv);
        return this;
    }

}
