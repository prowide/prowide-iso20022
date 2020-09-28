
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides additional information regarding corporate action options date details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDateSD7", propOrder = {
    "plcAndNm",
    "actlEarlyXprtnDt",
    "actlPrtctXprtnDt",
    "actlEarlyPrtctXprtnDt",
    "dtcEarlyPrtctXprtnDt",
    "actlEarlyCoverPrtctXprtnDt",
    "dtcEarlyCoverPrtctXprtnDt"
})
public class CorporateActionDateSD7 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "ActlEarlyXprtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actlEarlyXprtnDt;
    @XmlElement(name = "ActlPrtctXprtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actlPrtctXprtnDt;
    @XmlElement(name = "ActlEarlyPrtctXprtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actlEarlyPrtctXprtnDt;
    @XmlElement(name = "DTCEarlyPrtctXprtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtcEarlyPrtctXprtnDt;
    @XmlElement(name = "ActlEarlyCoverPrtctXprtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actlEarlyCoverPrtctXprtnDt;
    @XmlElement(name = "DTCEarlyCoverPrtctXprtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtcEarlyCoverPrtctXprtnDt;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD7 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the actlEarlyXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActlEarlyXprtnDt() {
        return actlEarlyXprtnDt;
    }

    /**
     * Sets the value of the actlEarlyXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD7 setActlEarlyXprtnDt(XMLGregorianCalendar value) {
        this.actlEarlyXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the actlPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActlPrtctXprtnDt() {
        return actlPrtctXprtnDt;
    }

    /**
     * Sets the value of the actlPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD7 setActlPrtctXprtnDt(XMLGregorianCalendar value) {
        this.actlPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the actlEarlyPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActlEarlyPrtctXprtnDt() {
        return actlEarlyPrtctXprtnDt;
    }

    /**
     * Sets the value of the actlEarlyPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD7 setActlEarlyPrtctXprtnDt(XMLGregorianCalendar value) {
        this.actlEarlyPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the dtcEarlyPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTCEarlyPrtctXprtnDt() {
        return dtcEarlyPrtctXprtnDt;
    }

    /**
     * Sets the value of the dtcEarlyPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD7 setDTCEarlyPrtctXprtnDt(XMLGregorianCalendar value) {
        this.dtcEarlyPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the actlEarlyCoverPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActlEarlyCoverPrtctXprtnDt() {
        return actlEarlyCoverPrtctXprtnDt;
    }

    /**
     * Sets the value of the actlEarlyCoverPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD7 setActlEarlyCoverPrtctXprtnDt(XMLGregorianCalendar value) {
        this.actlEarlyCoverPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the dtcEarlyCoverPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTCEarlyCoverPrtctXprtnDt() {
        return dtcEarlyCoverPrtctXprtnDt;
    }

    /**
     * Sets the value of the dtcEarlyCoverPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD7 setDTCEarlyCoverPrtctXprtnDt(XMLGregorianCalendar value) {
        this.dtcEarlyCoverPrtctXprtnDt = value;
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
