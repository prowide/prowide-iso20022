
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Additional information relevant to the destination.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation19", propOrder = {
    "ntrdDataNmrc",
    "ntrdDataAlphaNmrc",
    "addtlData"
})
public class AdditionalInformation19 {

    @XmlElement(name = "NtrdDataNmrc")
    protected String ntrdDataNmrc;
    @XmlElement(name = "NtrdDataAlphaNmrc")
    protected String ntrdDataAlphaNmrc;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the ntrdDataNmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtrdDataNmrc() {
        return ntrdDataNmrc;
    }

    /**
     * Sets the value of the ntrdDataNmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation19 setNtrdDataNmrc(String value) {
        this.ntrdDataNmrc = value;
        return this;
    }

    /**
     * Gets the value of the ntrdDataAlphaNmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtrdDataAlphaNmrc() {
        return ntrdDataAlphaNmrc;
    }

    /**
     * Sets the value of the ntrdDataAlphaNmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation19 setNtrdDataAlphaNmrc(String value) {
        this.ntrdDataAlphaNmrc = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation19 setAddtlData(String value) {
        this.addtlData = value;
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
