
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
 * Choice of format for benchmark curve name.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenchmarkCurveName10Choice", propOrder = {
    "indx",
    "nm"
})
public class BenchmarkCurveName10Choice {

    @XmlElement(name = "Indx")
    @XmlSchemaType(name = "string")
    protected BenchmarkCurveName3Code indx;
    @XmlElement(name = "Nm")
    protected String nm;

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
    public BenchmarkCurveName10Choice setIndx(BenchmarkCurveName3Code value) {
        this.indx = value;
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
    public BenchmarkCurveName10Choice setNm(String value) {
        this.nm = value;
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
