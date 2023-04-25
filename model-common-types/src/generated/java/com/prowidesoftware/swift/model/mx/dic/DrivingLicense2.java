
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
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
 * Details of driving license.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrivingLicense2", propOrder = {
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
public class DrivingLicense2 {

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
    protected Calendar issncDt;
    @XmlElement(name = "XprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar xprtnDt;
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
    public DrivingLicense2 setTp(String value) {
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
    public DrivingLicense2 setForm(PresentationMedium2Code value) {
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
    public DrivingLicense2 setId(String value) {
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
    public DrivingLicense2 setAssgnr(LegalStructure1Code value) {
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
    public Calendar getIssncDt() {
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
    public DrivingLicense2 setIssncDt(Calendar value) {
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
    public Calendar getXprtnDt() {
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
    public DrivingLicense2 setXprtnDt(Calendar value) {
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
    public DrivingLicense2 setCtry(String value) {
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
    public DrivingLicense2 setStat(String value) {
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
    public DrivingLicense2 setPrvc(String value) {
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
    public DrivingLicense2 setOthrAuthrty(String value) {
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
