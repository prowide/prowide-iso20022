
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
 * Specifies a set of cards which shares the same functionalities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinRange1", propOrder = {
    "lwrBin",
    "hghrBin"
})
public class BinRange1 {

    @XmlElement(name = "LwrBin", required = true)
    protected String lwrBin;
    @XmlElement(name = "HghrBin", required = true)
    protected String hghrBin;

    /**
     * Gets the value of the lwrBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLwrBin() {
        return lwrBin;
    }

    /**
     * Sets the value of the lwrBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BinRange1 setLwrBin(String value) {
        this.lwrBin = value;
        return this;
    }

    /**
     * Gets the value of the hghrBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHghrBin() {
        return hghrBin;
    }

    /**
     * Sets the value of the hghrBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BinRange1 setHghrBin(String value) {
        this.hghrBin = value;
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
