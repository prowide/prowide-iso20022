
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CorporateActionDateSD9", propOrder = {
    "plcAndNm",
    "actlEarlyXprtnDt",
    "actlPrtctXprtnDt",
    "actlEarlyPrtctXprtnDt",
    "dtcEarlyPrtctXprtnDt",
    "actlEarlyCoverPrtctXprtnDt",
    "dtcEarlyCoverPrtctXprtnDt",
    "prcToDt"
})
public class CorporateActionDateSD9 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "ActlEarlyXprtnDt")
    protected DateFormat49Choice actlEarlyXprtnDt;
    @XmlElement(name = "ActlPrtctXprtnDt")
    protected DateFormat49Choice actlPrtctXprtnDt;
    @XmlElement(name = "ActlEarlyPrtctXprtnDt")
    protected DateFormat49Choice actlEarlyPrtctXprtnDt;
    @XmlElement(name = "DTCEarlyPrtctXprtnDt")
    protected DateFormat49Choice dtcEarlyPrtctXprtnDt;
    @XmlElement(name = "ActlEarlyCoverPrtctXprtnDt")
    protected DateFormat49Choice actlEarlyCoverPrtctXprtnDt;
    @XmlElement(name = "DTCEarlyCoverPrtctXprtnDt")
    protected DateFormat49Choice dtcEarlyCoverPrtctXprtnDt;
    @XmlElement(name = "PrcToDt")
    protected DateFormat49Choice prcToDt;

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
    public CorporateActionDateSD9 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the actlEarlyXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getActlEarlyXprtnDt() {
        return actlEarlyXprtnDt;
    }

    /**
     * Sets the value of the actlEarlyXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDateSD9 setActlEarlyXprtnDt(DateFormat49Choice value) {
        this.actlEarlyXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the actlPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getActlPrtctXprtnDt() {
        return actlPrtctXprtnDt;
    }

    /**
     * Sets the value of the actlPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDateSD9 setActlPrtctXprtnDt(DateFormat49Choice value) {
        this.actlPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the actlEarlyPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getActlEarlyPrtctXprtnDt() {
        return actlEarlyPrtctXprtnDt;
    }

    /**
     * Sets the value of the actlEarlyPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDateSD9 setActlEarlyPrtctXprtnDt(DateFormat49Choice value) {
        this.actlEarlyPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the dtcEarlyPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getDTCEarlyPrtctXprtnDt() {
        return dtcEarlyPrtctXprtnDt;
    }

    /**
     * Sets the value of the dtcEarlyPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDateSD9 setDTCEarlyPrtctXprtnDt(DateFormat49Choice value) {
        this.dtcEarlyPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the actlEarlyCoverPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getActlEarlyCoverPrtctXprtnDt() {
        return actlEarlyCoverPrtctXprtnDt;
    }

    /**
     * Sets the value of the actlEarlyCoverPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDateSD9 setActlEarlyCoverPrtctXprtnDt(DateFormat49Choice value) {
        this.actlEarlyCoverPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the dtcEarlyCoverPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getDTCEarlyCoverPrtctXprtnDt() {
        return dtcEarlyCoverPrtctXprtnDt;
    }

    /**
     * Sets the value of the dtcEarlyCoverPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDateSD9 setDTCEarlyCoverPrtctXprtnDt(DateFormat49Choice value) {
        this.dtcEarlyCoverPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the prcToDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getPrcToDt() {
        return prcToDt;
    }

    /**
     * Sets the value of the prcToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDateSD9 setPrcToDt(DateFormat49Choice value) {
        this.prcToDt = value;
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
