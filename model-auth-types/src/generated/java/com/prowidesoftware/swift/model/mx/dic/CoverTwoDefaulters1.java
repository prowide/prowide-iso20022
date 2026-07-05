
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
 * Identifies the two largest assumed defaulting entities under a particular scenario.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverTwoDefaulters1", propOrder = {
    "cover1Id",
    "cover2Id"
})
public class CoverTwoDefaulters1 {

    @XmlElement(name = "Cover1Id", required = true)
    protected String cover1Id;
    @XmlElement(name = "Cover2Id", required = true)
    protected String cover2Id;

    /**
     * Gets the value of the cover1Id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCover1Id() {
        return cover1Id;
    }

    /**
     * Sets the value of the cover1Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CoverTwoDefaulters1 setCover1Id(String value) {
        this.cover1Id = value;
        return this;
    }

    /**
     * Gets the value of the cover2Id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCover2Id() {
        return cover2Id;
    }

    /**
     * Sets the value of the cover2Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CoverTwoDefaulters1 setCover2Id(String value) {
        this.cover2Id = value;
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
