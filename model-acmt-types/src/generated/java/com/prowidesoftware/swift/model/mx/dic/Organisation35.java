
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
 * Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation35", propOrder = {
    "fullLglNm",
    "tradgNm",
    "orgLglSts",
    "estblishdDt",
    "regnNb",
    "regnCtry",
    "regnDt",
    "taxtnIdNb",
    "taxtnCtry",
    "ctryOfOpr",
    "brdRsltnInd",
    "bizAdr",
    "oprlAdr",
    "lglAdr",
    "rprtvOffcr",
    "trsrMgr",
    "mainMndtHldr",
    "sndr"
})
public class Organisation35 {

    @XmlElement(name = "FullLglNm", required = true)
    protected String fullLglNm;
    @XmlElement(name = "TradgNm")
    protected String tradgNm;
    @XmlElement(name = "OrgLglSts")
    @XmlSchemaType(name = "string")
    protected OrganisationLegalStatus1Code orgLglSts;
    @XmlElement(name = "EstblishdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate estblishdDt;
    @XmlElement(name = "RegnNb")
    protected String regnNb;
    @XmlElement(name = "RegnCtry")
    protected String regnCtry;
    @XmlElement(name = "RegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate regnDt;
    @XmlElement(name = "TaxtnIdNb")
    protected String taxtnIdNb;
    @XmlElement(name = "TaxtnCtry")
    protected String taxtnCtry;
    @XmlElement(name = "CtryOfOpr")
    protected String ctryOfOpr;
    @XmlElement(name = "BrdRsltnInd")
    protected Boolean brdRsltnInd;
    @XmlElement(name = "BizAdr")
    protected PostalAddress24 bizAdr;
    @XmlElement(name = "OprlAdr")
    protected PostalAddress24 oprlAdr;
    @XmlElement(name = "LglAdr")
    protected PostalAddress24 lglAdr;
    @XmlElement(name = "RprtvOffcr")
    protected List<PartyIdentification135> rprtvOffcr;
    @XmlElement(name = "TrsrMgr")
    protected PartyIdentification135 trsrMgr;
    @XmlElement(name = "MainMndtHldr")
    protected List<PartyIdentification135> mainMndtHldr;
    @XmlElement(name = "Sndr")
    protected List<PartyIdentification135> sndr;

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
    public Organisation35 setFullLglNm(String value) {
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
    public Organisation35 setTradgNm(String value) {
        this.tradgNm = value;
        return this;
    }

    /**
     * Gets the value of the orgLglSts property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationLegalStatus1Code }
     *     
     */
    public OrganisationLegalStatus1Code getOrgLglSts() {
        return orgLglSts;
    }

    /**
     * Sets the value of the orgLglSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationLegalStatus1Code }
     *     
     */
    public Organisation35 setOrgLglSts(OrganisationLegalStatus1Code value) {
        this.orgLglSts = value;
        return this;
    }

    /**
     * Gets the value of the estblishdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEstblishdDt() {
        return estblishdDt;
    }

    /**
     * Sets the value of the estblishdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation35 setEstblishdDt(LocalDate value) {
        this.estblishdDt = value;
        return this;
    }

    /**
     * Gets the value of the regnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnNb() {
        return regnNb;
    }

    /**
     * Sets the value of the regnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation35 setRegnNb(String value) {
        this.regnNb = value;
        return this;
    }

    /**
     * Gets the value of the regnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnCtry() {
        return regnCtry;
    }

    /**
     * Sets the value of the regnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation35 setRegnCtry(String value) {
        this.regnCtry = value;
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
    public Organisation35 setRegnDt(LocalDate value) {
        this.regnDt = value;
        return this;
    }

    /**
     * Gets the value of the taxtnIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxtnIdNb() {
        return taxtnIdNb;
    }

    /**
     * Sets the value of the taxtnIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation35 setTaxtnIdNb(String value) {
        this.taxtnIdNb = value;
        return this;
    }

    /**
     * Gets the value of the taxtnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxtnCtry() {
        return taxtnCtry;
    }

    /**
     * Sets the value of the taxtnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation35 setTaxtnCtry(String value) {
        this.taxtnCtry = value;
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
    public Organisation35 setCtryOfOpr(String value) {
        this.ctryOfOpr = value;
        return this;
    }

    /**
     * Gets the value of the brdRsltnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrdRsltnInd() {
        return brdRsltnInd;
    }

    /**
     * Sets the value of the brdRsltnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Organisation35 setBrdRsltnInd(Boolean value) {
        this.brdRsltnInd = value;
        return this;
    }

    /**
     * Gets the value of the bizAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress24 }
     *     
     */
    public PostalAddress24 getBizAdr() {
        return bizAdr;
    }

    /**
     * Sets the value of the bizAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress24 }
     *     
     */
    public Organisation35 setBizAdr(PostalAddress24 value) {
        this.bizAdr = value;
        return this;
    }

    /**
     * Gets the value of the oprlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress24 }
     *     
     */
    public PostalAddress24 getOprlAdr() {
        return oprlAdr;
    }

    /**
     * Sets the value of the oprlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress24 }
     *     
     */
    public Organisation35 setOprlAdr(PostalAddress24 value) {
        this.oprlAdr = value;
        return this;
    }

    /**
     * Gets the value of the lglAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress24 }
     *     
     */
    public PostalAddress24 getLglAdr() {
        return lglAdr;
    }

    /**
     * Sets the value of the lglAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress24 }
     *     
     */
    public Organisation35 setLglAdr(PostalAddress24 value) {
        this.lglAdr = value;
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
     * {@link PartyIdentification135 }
     * 
     * 
     * @return
     *     The value of the rprtvOffcr property.
     */
    public List<PartyIdentification135> getRprtvOffcr() {
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
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getTrsrMgr() {
        return trsrMgr;
    }

    /**
     * Sets the value of the trsrMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public Organisation35 setTrsrMgr(PartyIdentification135 value) {
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
     * {@link PartyIdentification135 }
     * 
     * 
     * @return
     *     The value of the mainMndtHldr property.
     */
    public List<PartyIdentification135> getMainMndtHldr() {
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
     * {@link PartyIdentification135 }
     * 
     * 
     * @return
     *     The value of the sndr property.
     */
    public List<PartyIdentification135> getSndr() {
        if (sndr == null) {
            sndr = new ArrayList<>();
        }
        return this.sndr;
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
    public Organisation35 addRprtvOffcr(PartyIdentification135 rprtvOffcr) {
        getRprtvOffcr().add(rprtvOffcr);
        return this;
    }

    /**
     * Adds a new item to the mainMndtHldr list.
     * @see #getMainMndtHldr()
     * 
     */
    public Organisation35 addMainMndtHldr(PartyIdentification135 mainMndtHldr) {
        getMainMndtHldr().add(mainMndtHldr);
        return this;
    }

    /**
     * Adds a new item to the sndr list.
     * @see #getSndr()
     * 
     */
    public Organisation35 addSndr(PartyIdentification135 sndr) {
        getSndr().add(sndr);
        return this;
    }

}
