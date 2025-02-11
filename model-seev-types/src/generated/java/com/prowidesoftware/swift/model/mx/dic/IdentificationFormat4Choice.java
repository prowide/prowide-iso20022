
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
 * Choice between either a short, long or a proprietary identification format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationFormat4Choice", propOrder = {
    "shrtId",
    "lngId",
    "prtryId"
})
public class IdentificationFormat4Choice {

    @XmlElement(name = "ShrtId")
    protected String shrtId;
    @XmlElement(name = "LngId")
    protected String lngId;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification86 prtryId;

    /**
     * Gets the value of the shrtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtId() {
        return shrtId;
    }

    /**
     * Sets the value of the shrtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationFormat4Choice setShrtId(String value) {
        this.shrtId = value;
        return this;
    }

    /**
     * Gets the value of the lngId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngId() {
        return lngId;
    }

    /**
     * Sets the value of the lngId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationFormat4Choice setLngId(String value) {
        this.lngId = value;
        return this;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification86 }
     *     
     */
    public GenericIdentification86 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification86 }
     *     
     */
    public IdentificationFormat4Choice setPrtryId(GenericIdentification86 value) {
        this.prtryId = value;
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
