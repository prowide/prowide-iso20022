
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
 * Choice between ISIN and an alternative format for the identification of a financial instrument. ISIN is the preferred format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification35Choice", propOrder = {
    "isin",
    "nm",
    "indx"
})
public class SecurityIdentification35Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Indx")
    @XmlSchemaType(name = "string")
    protected BenchmarkCurveName3Code indx;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification35Choice setISIN(String value) {
        this.isin = value;
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
    public SecurityIdentification35Choice setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName3Code }
     *     
     */
    public BenchmarkCurveName3Code getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName3Code }
     *     
     */
    public SecurityIdentification35Choice setIndx(BenchmarkCurveName3Code value) {
        this.indx = value;
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
