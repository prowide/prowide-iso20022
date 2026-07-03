
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
 * Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation43", propOrder = {
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
public class Organisation43 {

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
    protected XMLGregorianCalendar estblishdDt;
    @XmlElement(name = "RegnNb")
    protected String regnNb;
    @XmlElement(name = "RegnCtry")
    protected String regnCtry;
    @XmlElement(name = "RegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regnDt;
    @XmlElement(name = "TaxtnIdNb")
    protected String taxtnIdNb;
    @XmlElement(name = "TaxtnCtry")
    protected String taxtnCtry;
    @XmlElement(name = "CtryOfOpr")
    protected String ctryOfOpr;
    @XmlElement(name = "BrdRsltnInd")
    protected Boolean brdRsltnInd;
    @XmlElement(name = "BizAdr")
    protected PostalAddress27 bizAdr;
    @XmlElement(name = "OprlAdr")
    protected PostalAddress27 oprlAdr;
    @XmlElement(name = "LglAdr")
    protected PostalAddress27 lglAdr;
    @XmlElement(name = "RprtvOffcr")
    protected List<PartyIdentification272> rprtvOffcr;
    @XmlElement(name = "TrsrMgr")
    protected PartyIdentification272 trsrMgr;
    @XmlElement(name = "MainMndtHldr")
    protected List<PartyIdentification272> mainMndtHldr;
    @XmlElement(name = "Sndr")
    protected List<PartyIdentification272> sndr;

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
    public Organisation43 setFullLglNm(String value) {
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
    public Organisation43 setTradgNm(String value) {
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
    public Organisation43 setOrgLglSts(OrganisationLegalStatus1Code value) {
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
    public XMLGregorianCalendar getEstblishdDt() {
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
    public Organisation43 setEstblishdDt(XMLGregorianCalendar value) {
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
    public Organisation43 setRegnNb(String value) {
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
    public Organisation43 setRegnCtry(String value) {
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
    public Organisation43 setRegnDt(XMLGregorianCalendar value) {
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
    public Organisation43 setTaxtnIdNb(String value) {
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
    public Organisation43 setTaxtnCtry(String value) {
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
    public Organisation43 setCtryOfOpr(String value) {
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
    public Organisation43 setBrdRsltnInd(Boolean value) {
        this.brdRsltnInd = value;
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
    public Organisation43 setBizAdr(PostalAddress27 value) {
        this.bizAdr = value;
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
    public Organisation43 setOprlAdr(PostalAddress27 value) {
        this.oprlAdr = value;
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
    public Organisation43 setLglAdr(PostalAddress27 value) {
        this.lglAdr = value;
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
     * {@link PartyIdentification272 }
     * 
     * 
     */
    public List<PartyIdentification272> getRprtvOffcr() {
        if (rprtvOffcr == null) {
            rprtvOffcr = new ArrayList<PartyIdentification272>();
        }
        return this.rprtvOffcr;
    }

    /**
     * Gets the value of the trsrMgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getTrsrMgr() {
        return trsrMgr;
    }

    /**
     * Sets the value of the trsrMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public Organisation43 setTrsrMgr(PartyIdentification272 value) {
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
     * {@link PartyIdentification272 }
     * 
     * 
     */
    public List<PartyIdentification272> getMainMndtHldr() {
        if (mainMndtHldr == null) {
            mainMndtHldr = new ArrayList<PartyIdentification272>();
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
     * {@link PartyIdentification272 }
     * 
     * 
     */
    public List<PartyIdentification272> getSndr() {
        if (sndr == null) {
            sndr = new ArrayList<PartyIdentification272>();
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
    public Organisation43 addRprtvOffcr(PartyIdentification272 rprtvOffcr) {
        getRprtvOffcr().add(rprtvOffcr);
        return this;
    }

    /**
     * Adds a new item to the mainMndtHldr list.
     * @see #getMainMndtHldr()
     * 
     */
    public Organisation43 addMainMndtHldr(PartyIdentification272 mainMndtHldr) {
        getMainMndtHldr().add(mainMndtHldr);
        return this;
    }

    /**
     * Adds a new item to the sndr list.
     * @see #getSndr()
     * 
     */
    public Organisation43 addSndr(PartyIdentification272 sndr) {
        getSndr().add(sndr);
        return this;
    }

}
