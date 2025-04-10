
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
@XmlType(name = "Organisation42", propOrder = {
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
public class Organisation42 {

    @XmlElement(name = "FullLglNm", required = true)
    protected String fullLglNm;
    @XmlElement(name = "TradgNm")
    protected String tradgNm;
    @XmlElement(name = "CtryOfOpr", required = true)
    protected String ctryOfOpr;
    @XmlElement(name = "RegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate regnDt;
    @XmlElement(name = "OprlAdr")
    protected PostalAddress27 oprlAdr;
    @XmlElement(name = "BizAdr")
    protected PostalAddress27 bizAdr;
    @XmlElement(name = "LglAdr", required = true)
    protected PostalAddress27 lglAdr;
    @XmlElement(name = "BllgAdr")
    protected PostalAddress27 bllgAdr;
    @XmlElement(name = "OrgId", required = true)
    protected OrganisationIdentification39 orgId;
    @XmlElement(name = "RprtvOffcr")
    protected List<PartyIdentification274> rprtvOffcr;
    @XmlElement(name = "TrsrMgr")
    protected PartyIdentification274 trsrMgr;
    @XmlElement(name = "MainMndtHldr")
    protected List<PartyIdentification274> mainMndtHldr;
    @XmlElement(name = "Sndr")
    protected List<PartyIdentification274> sndr;
    @XmlElement(name = "LglRprtv")
    protected List<PartyIdentification274> lglRprtv;

    /**
     * Gets the value of the fullLglNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullLglNm() {
        return fullLglNm;
    }

    /**
     * Sets the value of the fullLglNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation42 setFullLglNm(String value) {
        this.fullLglNm = value;
        return this;
    }

    /**
     * Gets the value of the tradgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgNm() {
        return tradgNm;
    }

    /**
     * Sets the value of the tradgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation42 setTradgNm(String value) {
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
    public Organisation42 setCtryOfOpr(String value) {
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
    public Organisation42 setRegnDt(LocalDate value) {
        this.regnDt = value;
        return this;
    }

    /**
     * Gets the value of the oprlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress27 }
     *     
     */
    public PostalAddress27 getOprlAdr() {
        return oprlAdr;
    }

    /**
     * Sets the value of the oprlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress27 }
     *     
     */
    public Organisation42 setOprlAdr(PostalAddress27 value) {
        this.oprlAdr = value;
        return this;
    }

    /**
     * Gets the value of the bizAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress27 }
     *     
     */
    public PostalAddress27 getBizAdr() {
        return bizAdr;
    }

    /**
     * Sets the value of the bizAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress27 }
     *     
     */
    public Organisation42 setBizAdr(PostalAddress27 value) {
        this.bizAdr = value;
        return this;
    }

    /**
     * Gets the value of the lglAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress27 }
     *     
     */
    public PostalAddress27 getLglAdr() {
        return lglAdr;
    }

    /**
     * Sets the value of the lglAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress27 }
     *     
     */
    public Organisation42 setLglAdr(PostalAddress27 value) {
        this.lglAdr = value;
        return this;
    }

    /**
     * Gets the value of the bllgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress27 }
     *     
     */
    public PostalAddress27 getBllgAdr() {
        return bllgAdr;
    }

    /**
     * Sets the value of the bllgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress27 }
     *     
     */
    public Organisation42 setBllgAdr(PostalAddress27 value) {
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
    public Organisation42 setOrgId(OrganisationIdentification39 value) {
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
     * {@link PartyIdentification274 }
     * 
     * 
     * @return
     *     The value of the rprtvOffcr property.
     */
    public List<PartyIdentification274> getRprtvOffcr() {
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
     *     {@link PartyIdentification274 }
     *     
     */
    public PartyIdentification274 getTrsrMgr() {
        return trsrMgr;
    }

    /**
     * Sets the value of the trsrMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification274 }
     *     
     */
    public Organisation42 setTrsrMgr(PartyIdentification274 value) {
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
     * {@link PartyIdentification274 }
     * 
     * 
     * @return
     *     The value of the mainMndtHldr property.
     */
    public List<PartyIdentification274> getMainMndtHldr() {
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
     * {@link PartyIdentification274 }
     * 
     * 
     * @return
     *     The value of the sndr property.
     */
    public List<PartyIdentification274> getSndr() {
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
     * {@link PartyIdentification274 }
     * 
     * 
     * @return
     *     The value of the lglRprtv property.
     */
    public List<PartyIdentification274> getLglRprtv() {
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
    public Organisation42 addRprtvOffcr(PartyIdentification274 rprtvOffcr) {
        getRprtvOffcr().add(rprtvOffcr);
        return this;
    }

    /**
     * Adds a new item to the mainMndtHldr list.
     * @see #getMainMndtHldr()
     * 
     */
    public Organisation42 addMainMndtHldr(PartyIdentification274 mainMndtHldr) {
        getMainMndtHldr().add(mainMndtHldr);
        return this;
    }

    /**
     * Adds a new item to the sndr list.
     * @see #getSndr()
     * 
     */
    public Organisation42 addSndr(PartyIdentification274 sndr) {
        getSndr().add(sndr);
        return this;
    }

    /**
     * Adds a new item to the lglRprtv list.
     * @see #getLglRprtv()
     * 
     */
    public Organisation42 addLglRprtv(PartyIdentification274 lglRprtv) {
        getLglRprtv().add(lglRprtv);
        return this;
    }

}
