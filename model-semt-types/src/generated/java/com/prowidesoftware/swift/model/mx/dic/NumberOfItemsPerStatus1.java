
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
 * Provides detailed information on the number of reported items with their respective acceptance status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfItemsPerStatus1", propOrder = {
    "sts",
    "nbOfItms"
})
public class NumberOfItemsPerStatus1 {

    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ReportItemStatus1Code sts;
    @XmlElement(name = "NbOfItms", required = true)
    protected String nbOfItms;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link ReportItemStatus1Code }
     *     
     */
    public ReportItemStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportItemStatus1Code }
     *     
     */
    public NumberOfItemsPerStatus1 setSts(ReportItemStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the nbOfItms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfItms() {
        return nbOfItms;
    }

    /**
     * Sets the value of the nbOfItms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NumberOfItemsPerStatus1 setNbOfItms(String value) {
        this.nbOfItms = value;
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
