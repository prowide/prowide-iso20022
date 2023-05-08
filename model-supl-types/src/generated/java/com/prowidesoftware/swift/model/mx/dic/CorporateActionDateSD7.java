
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
    @XmlElement(name = "ActlEarlyXprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar actlEarlyXprtnDt;
    @XmlElement(name = "ActlPrtctXprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar actlPrtctXprtnDt;
    @XmlElement(name = "ActlEarlyPrtctXprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar actlEarlyPrtctXprtnDt;
    @XmlElement(name = "DTCEarlyPrtctXprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dtcEarlyPrtctXprtnDt;
    @XmlElement(name = "ActlEarlyCoverPrtctXprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar actlEarlyCoverPrtctXprtnDt;
    @XmlElement(name = "DTCEarlyCoverPrtctXprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dtcEarlyCoverPrtctXprtnDt;

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
     *     {@link String }
     *     
     */
    public Calendar getActlEarlyXprtnDt() {
        return actlEarlyXprtnDt;
    }

    /**
     * Sets the value of the actlEarlyXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD7 setActlEarlyXprtnDt(Calendar value) {
        this.actlEarlyXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the actlPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getActlPrtctXprtnDt() {
        return actlPrtctXprtnDt;
    }

    /**
     * Sets the value of the actlPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD7 setActlPrtctXprtnDt(Calendar value) {
        this.actlPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the actlEarlyPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getActlEarlyPrtctXprtnDt() {
        return actlEarlyPrtctXprtnDt;
    }

    /**
     * Sets the value of the actlEarlyPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD7 setActlEarlyPrtctXprtnDt(Calendar value) {
        this.actlEarlyPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the dtcEarlyPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDTCEarlyPrtctXprtnDt() {
        return dtcEarlyPrtctXprtnDt;
    }

    /**
     * Sets the value of the dtcEarlyPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD7 setDTCEarlyPrtctXprtnDt(Calendar value) {
        this.dtcEarlyPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the actlEarlyCoverPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getActlEarlyCoverPrtctXprtnDt() {
        return actlEarlyCoverPrtctXprtnDt;
    }

    /**
     * Sets the value of the actlEarlyCoverPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD7 setActlEarlyCoverPrtctXprtnDt(Calendar value) {
        this.actlEarlyCoverPrtctXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the dtcEarlyCoverPrtctXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDTCEarlyCoverPrtctXprtnDt() {
        return dtcEarlyCoverPrtctXprtnDt;
    }

    /**
     * Sets the value of the dtcEarlyCoverPrtctXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD7 setDTCEarlyCoverPrtctXprtnDt(Calendar value) {
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
