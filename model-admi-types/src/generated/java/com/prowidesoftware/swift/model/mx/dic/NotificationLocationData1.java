
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional details on the data or documentation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationLocationData1", propOrder = {
    "mtd",
    "elctrncAdr",
    "pstlAdr"
})
public class NotificationLocationData1 {

    @XmlElement(name = "Mtd", required = true)
    @XmlSchemaType(name = "string")
    protected InvestigationLocationMethod1Code mtd;
    @XmlElement(name = "ElctrncAdr")
    protected String elctrncAdr;
    @XmlElement(name = "PstlAdr")
    protected NameAndAddress18 pstlAdr;

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationLocationMethod1Code }
     *     
     */
    public InvestigationLocationMethod1Code getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationLocationMethod1Code }
     *     
     */
    public NotificationLocationData1 setMtd(InvestigationLocationMethod1Code value) {
        this.mtd = value;
        return this;
    }

    /**
     * Gets the value of the elctrncAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElctrncAdr() {
        return elctrncAdr;
    }

    /**
     * Sets the value of the elctrncAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NotificationLocationData1 setElctrncAdr(String value) {
        this.elctrncAdr = value;
        return this;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress18 }
     *     
     */
    public NameAndAddress18 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress18 }
     *     
     */
    public NotificationLocationData1 setPstlAdr(NameAndAddress18 value) {
        this.pstlAdr = value;
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
