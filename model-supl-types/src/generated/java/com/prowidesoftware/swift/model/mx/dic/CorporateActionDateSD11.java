
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
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
 * Provides additional information regarding corporate action options date details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDateSD11", propOrder = {
    "plcAndNm",
    "actlEarlyXprtnDt",
    "actlPrtctXprtnDt",
    "actlEarlyPrtctXprtnDt",
    "dtcEarlyPrtctXprtnDt",
    "actlEarlyCoverPrtctXprtnDt",
    "dtcEarlyCoverPrtctXprtnDt",
    "prcToDt",
    "dtcEarlstPmtDt"
})
public class CorporateActionDateSD11 {

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
    @XmlElement(name = "DTCEarlstPmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtcEarlstPmtDt;

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
    public CorporateActionDateSD11 setPlcAndNm(String value) {
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
    public CorporateActionDateSD11 setActlEarlyXprtnDt(DateFormat49Choice value) {
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
    public CorporateActionDateSD11 setActlPrtctXprtnDt(DateFormat49Choice value) {
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
    public CorporateActionDateSD11 setActlEarlyPrtctXprtnDt(DateFormat49Choice value) {
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
    public CorporateActionDateSD11 setDTCEarlyPrtctXprtnDt(DateFormat49Choice value) {
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
    public CorporateActionDateSD11 setActlEarlyCoverPrtctXprtnDt(DateFormat49Choice value) {
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
    public CorporateActionDateSD11 setDTCEarlyCoverPrtctXprtnDt(DateFormat49Choice value) {
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
    public CorporateActionDateSD11 setPrcToDt(DateFormat49Choice value) {
        this.prcToDt = value;
        return this;
    }

    /**
     * Gets the value of the dtcEarlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDTCEarlstPmtDt() {
        return dtcEarlstPmtDt;
    }

    /**
     * Sets the value of the dtcEarlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD11 setDTCEarlstPmtDt(LocalDate value) {
        this.dtcEarlstPmtDt = value;
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
