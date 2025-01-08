
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
 * Explains the status of the related request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHandling", propOrder = {
    "stsCd",
    "desc"
})
public class RequestHandling {

    @XmlElement(name = "StsCd", required = true)
    protected String stsCd;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the stsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsCd() {
        return stsCd;
    }

    /**
     * Sets the value of the stsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestHandling setStsCd(String value) {
        this.stsCd = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestHandling setDesc(String value) {
        this.desc = value;
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
