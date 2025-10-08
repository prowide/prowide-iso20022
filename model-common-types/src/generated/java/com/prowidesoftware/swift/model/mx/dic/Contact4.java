
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the details of the contact person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact4", propOrder = {
    "nmPrfx",
    "nm",
    "phneNb",
    "mobNb",
    "faxNb",
    "emailAdr",
    "emailPurp",
    "jobTitl",
    "rspnsblty",
    "dept",
    "othr",
    "prefrdMtd"
})
public class Contact4 {

    @XmlElement(name = "NmPrfx")
    @XmlSchemaType(name = "string")
    protected NamePrefix2Code nmPrfx;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "MobNb")
    protected String mobNb;
    @XmlElement(name = "FaxNb")
    protected String faxNb;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "EmailPurp")
    protected String emailPurp;
    @XmlElement(name = "JobTitl")
    protected String jobTitl;
    @XmlElement(name = "Rspnsblty")
    protected String rspnsblty;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "Othr")
    protected List<OtherContact1> othr;
    @XmlElement(name = "PrefrdMtd")
    @XmlSchemaType(name = "string")
    protected PreferredContactMethod1Code prefrdMtd;

    /**
     * Gets the value of the nmPrfx property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix2Code }
     *     
     */
    public NamePrefix2Code getNmPrfx() {
        return nmPrfx;
    }

    /**
     * Sets the value of the nmPrfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix2Code }
     *     
     */
    public Contact4 setNmPrfx(NamePrefix2Code value) {
        this.nmPrfx = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact4 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the phneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhneNb() {
        return phneNb;
    }

    /**
     * Sets the value of the phneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact4 setPhneNb(String value) {
        this.phneNb = value;
        return this;
    }

    /**
     * Gets the value of the mobNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobNb() {
        return mobNb;
    }

    /**
     * Sets the value of the mobNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact4 setMobNb(String value) {
        this.mobNb = value;
        return this;
    }

    /**
     * Gets the value of the faxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNb() {
        return faxNb;
    }

    /**
     * Sets the value of the faxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact4 setFaxNb(String value) {
        this.faxNb = value;
        return this;
    }

    /**
     * Gets the value of the emailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAdr() {
        return emailAdr;
    }

    /**
     * Sets the value of the emailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact4 setEmailAdr(String value) {
        this.emailAdr = value;
        return this;
    }

    /**
     * Gets the value of the emailPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPurp() {
        return emailPurp;
    }

    /**
     * Sets the value of the emailPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact4 setEmailPurp(String value) {
        this.emailPurp = value;
        return this;
    }

    /**
     * Gets the value of the jobTitl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitl() {
        return jobTitl;
    }

    /**
     * Sets the value of the jobTitl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact4 setJobTitl(String value) {
        this.jobTitl = value;
        return this;
    }

    /**
     * Gets the value of the rspnsblty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnsblty() {
        return rspnsblty;
    }

    /**
     * Sets the value of the rspnsblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact4 setRspnsblty(String value) {
        this.rspnsblty = value;
        return this;
    }

    /**
     * Gets the value of the dept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact4 setDept(String value) {
        this.dept = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherContact1 }
     * 
     * 
     */
    public List<OtherContact1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<OtherContact1>();
        }
        return this.othr;
    }

    /**
     * Gets the value of the prefrdMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredContactMethod1Code }
     *     
     */
    public PreferredContactMethod1Code getPrefrdMtd() {
        return prefrdMtd;
    }

    /**
     * Sets the value of the prefrdMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredContactMethod1Code }
     *     
     */
    public Contact4 setPrefrdMtd(PreferredContactMethod1Code value) {
        this.prefrdMtd = value;
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
     * Adds a new item to the othr list.
     * @see #getOthr()
     * 
     */
    public Contact4 addOthr(OtherContact1 othr) {
        getOthr().add(othr);
        return this;
    }

}
