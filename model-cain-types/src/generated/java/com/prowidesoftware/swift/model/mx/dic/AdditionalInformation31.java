
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
 * Additional information relevant to the destination.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation31", propOrder = {
    "nmrc",
    "alphaNmrc",
    "addtlData"
})
public class AdditionalInformation31 {

    @XmlElement(name = "Nmrc")
    protected String nmrc;
    @XmlElement(name = "AlphaNmrc")
    protected String alphaNmrc;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the nmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmrc() {
        return nmrc;
    }

    /**
     * Sets the value of the nmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation31 setNmrc(String value) {
        this.nmrc = value;
        return this;
    }

    /**
     * Gets the value of the alphaNmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaNmrc() {
        return alphaNmrc;
    }

    /**
     * Sets the value of the alphaNmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation31 setAlphaNmrc(String value) {
        this.alphaNmrc = value;
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
    public AdditionalInformation31 setAddtlData(String value) {
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
