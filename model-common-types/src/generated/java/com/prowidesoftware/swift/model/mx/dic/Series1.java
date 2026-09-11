
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
 * Identification of a series.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Series1", propOrder = {
    "srsDt",
    "srsNm"
})
public class Series1 {

    @XmlElement(name = "SrsDt")
    protected DateFormat42Choice srsDt;
    @XmlElement(name = "SrsNm")
    protected String srsNm;

    /**
     * Gets the value of the srsDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat42Choice }
     *     
     */
    public DateFormat42Choice getSrsDt() {
        return srsDt;
    }

    /**
     * Sets the value of the srsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat42Choice }
     *     
     */
    public Series1 setSrsDt(DateFormat42Choice value) {
        this.srsDt = value;
        return this;
    }

    /**
     * Gets the value of the srsNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsNm() {
        return srsNm;
    }

    /**
     * Sets the value of the srsNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Series1 setSrsNm(String value) {
        this.srsNm = value;
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
