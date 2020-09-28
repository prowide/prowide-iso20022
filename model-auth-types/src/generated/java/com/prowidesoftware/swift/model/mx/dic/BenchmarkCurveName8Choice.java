
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "BenchmarkCurveName8Choice", propOrder = {
    "indx",
    "nm"
})
public class BenchmarkCurveName8Choice {

    @XmlElement(name = "Indx")
    @XmlSchemaType(name = "string")
    protected BenchmarkCurveName2Code indx;
    @XmlElement(name = "Nm")
    protected String nm;

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName2Code }
     *     
     */
    public BenchmarkCurveName2Code getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName2Code }
     *     
     */
    public BenchmarkCurveName8Choice setIndx(BenchmarkCurveName2Code value) {
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
    public BenchmarkCurveName8Choice setNm(String value) {
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
