
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of unique and unambiguous ways to identify a person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification11", propOrder = {
    "drvrLicNb",
    "drvrLicLctn",
    "drvrLicNm",
    "drvrId",
    "cstmrNb",
    "sclSctyNb",
    "alnRegnNb",
    "psptNb",
    "taxIdNb",
    "idntyCardNb",
    "mplyrIdNb",
    "mplyeeIdNb",
    "jobNb",
    "dept",
    "emailAdr",
    "dtAndPlcOfBirth",
    "othr"
})
public class PersonIdentification11 {

    @XmlElement(name = "DrvrLicNb")
    protected String drvrLicNb;
    @XmlElement(name = "DrvrLicLctn")
    protected String drvrLicLctn;
    @XmlElement(name = "DrvrLicNm")
    protected String drvrLicNm;
    @XmlElement(name = "DrvrId")
    protected String drvrId;
    @XmlElement(name = "CstmrNb")
    protected String cstmrNb;
    @XmlElement(name = "SclSctyNb")
    protected String sclSctyNb;
    @XmlElement(name = "AlnRegnNb")
    protected String alnRegnNb;
    @XmlElement(name = "PsptNb")
    protected String psptNb;
    @XmlElement(name = "TaxIdNb")
    protected String taxIdNb;
    @XmlElement(name = "IdntyCardNb")
    protected String idntyCardNb;
    @XmlElement(name = "MplyrIdNb")
    protected String mplyrIdNb;
    @XmlElement(name = "MplyeeIdNb")
    protected String mplyeeIdNb;
    @XmlElement(name = "JobNb")
    protected String jobNb;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "DtAndPlcOfBirth")
    protected DateAndPlaceOfBirth dtAndPlcOfBirth;
    @XmlElement(name = "Othr")
    protected List<GenericIdentification4> othr;

    /**
     * Gets the value of the drvrLicNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrLicNb() {
        return drvrLicNb;
    }

    /**
     * Sets the value of the drvrLicNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setDrvrLicNb(String value) {
        this.drvrLicNb = value;
        return this;
    }

    /**
     * Gets the value of the drvrLicLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrLicLctn() {
        return drvrLicLctn;
    }

    /**
     * Sets the value of the drvrLicLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setDrvrLicLctn(String value) {
        this.drvrLicLctn = value;
        return this;
    }

    /**
     * Gets the value of the drvrLicNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrLicNm() {
        return drvrLicNm;
    }

    /**
     * Sets the value of the drvrLicNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setDrvrLicNm(String value) {
        this.drvrLicNm = value;
        return this;
    }

    /**
     * Gets the value of the drvrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrId() {
        return drvrId;
    }

    /**
     * Sets the value of the drvrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setDrvrId(String value) {
        this.drvrId = value;
        return this;
    }

    /**
     * Gets the value of the cstmrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrNb() {
        return cstmrNb;
    }

    /**
     * Sets the value of the cstmrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setCstmrNb(String value) {
        this.cstmrNb = value;
        return this;
    }

    /**
     * Gets the value of the sclSctyNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSclSctyNb() {
        return sclSctyNb;
    }

    /**
     * Sets the value of the sclSctyNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setSclSctyNb(String value) {
        this.sclSctyNb = value;
        return this;
    }

    /**
     * Gets the value of the alnRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlnRegnNb() {
        return alnRegnNb;
    }

    /**
     * Sets the value of the alnRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setAlnRegnNb(String value) {
        this.alnRegnNb = value;
        return this;
    }

    /**
     * Gets the value of the psptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsptNb() {
        return psptNb;
    }

    /**
     * Sets the value of the psptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setPsptNb(String value) {
        this.psptNb = value;
        return this;
    }

    /**
     * Gets the value of the taxIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdNb() {
        return taxIdNb;
    }

    /**
     * Sets the value of the taxIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setTaxIdNb(String value) {
        this.taxIdNb = value;
        return this;
    }

    /**
     * Gets the value of the idntyCardNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdntyCardNb() {
        return idntyCardNb;
    }

    /**
     * Sets the value of the idntyCardNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setIdntyCardNb(String value) {
        this.idntyCardNb = value;
        return this;
    }

    /**
     * Gets the value of the mplyrIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyrIdNb() {
        return mplyrIdNb;
    }

    /**
     * Sets the value of the mplyrIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setMplyrIdNb(String value) {
        this.mplyrIdNb = value;
        return this;
    }

    /**
     * Gets the value of the mplyeeIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyeeIdNb() {
        return mplyeeIdNb;
    }

    /**
     * Sets the value of the mplyeeIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setMplyeeIdNb(String value) {
        this.mplyeeIdNb = value;
        return this;
    }

    /**
     * Gets the value of the jobNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNb() {
        return jobNb;
    }

    /**
     * Sets the value of the jobNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification11 setJobNb(String value) {
        this.jobNb = value;
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
    public PersonIdentification11 setDept(String value) {
        this.dept = value;
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
    public PersonIdentification11 setEmailAdr(String value) {
        this.emailAdr = value;
        return this;
    }

    /**
     * Gets the value of the dtAndPlcOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPlaceOfBirth }
     *     
     */
    public DateAndPlaceOfBirth getDtAndPlcOfBirth() {
        return dtAndPlcOfBirth;
    }

    /**
     * Sets the value of the dtAndPlcOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPlaceOfBirth }
     *     
     */
    public PersonIdentification11 setDtAndPlcOfBirth(DateAndPlaceOfBirth value) {
        this.dtAndPlcOfBirth = value;
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
     * {@link GenericIdentification4 }
     * 
     * 
     */
    public List<GenericIdentification4> getOthr() {
        if (othr == null) {
            othr = new ArrayList<GenericIdentification4>();
        }
        return this.othr;
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
    public PersonIdentification11 addOthr(GenericIdentification4 othr) {
        getOthr().add(othr);
        return this;
    }

}
