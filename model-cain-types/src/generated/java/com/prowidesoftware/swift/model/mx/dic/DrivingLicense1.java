
package com.prowidesoftware.swift.model.mx.dic;

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
 * Details of driving license.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrivingLicense1", propOrder = {
    "tp",
    "form",
    "id",
    "assgnr",
    "issncDt",
    "xprtnDt",
    "ctry",
    "stat",
    "prvc",
    "othrAuthrty"
})
public class DrivingLicense1 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Form")
    @XmlSchemaType(name = "string")
    protected PresentationMedium2Code form;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Assgnr")
    @XmlSchemaType(name = "string")
    protected LegalStructure1Code assgnr;
    @XmlElement(name = "IssncDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issncDt;
    @XmlElement(name = "XprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xprtnDt;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "Stat")
    protected String stat;
    @XmlElement(name = "Prvc")
    protected String prvc;
    @XmlElement(name = "OthrAuthrty")
    protected String othrAuthrty;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DrivingLicense1 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationMedium2Code }
     *     
     */
    public PresentationMedium2Code getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationMedium2Code }
     *     
     */
    public DrivingLicense1 setForm(PresentationMedium2Code value) {
        this.form = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DrivingLicense1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link LegalStructure1Code }
     *     
     */
    public LegalStructure1Code getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalStructure1Code }
     *     
     */
    public DrivingLicense1 setAssgnr(LegalStructure1Code value) {
        this.assgnr = value;
        return this;
    }

    /**
     * Gets the value of the issncDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getIssncDt() {
        return issncDt;
    }

    /**
     * Sets the value of the issncDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DrivingLicense1 setIssncDt(XMLGregorianCalendar value) {
        this.issncDt = value;
        return this;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DrivingLicense1 setXprtnDt(XMLGregorianCalendar value) {
        this.xprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DrivingLicense1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DrivingLicense1 setStat(String value) {
        this.stat = value;
        return this;
    }

    /**
     * Gets the value of the prvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvc() {
        return prvc;
    }

    /**
     * Sets the value of the prvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DrivingLicense1 setPrvc(String value) {
        this.prvc = value;
        return this;
    }

    /**
     * Gets the value of the othrAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAuthrty() {
        return othrAuthrty;
    }

    /**
     * Sets the value of the othrAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DrivingLicense1 setOthrAuthrty(String value) {
        this.othrAuthrty = value;
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

}
