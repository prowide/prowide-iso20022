
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
 * Taxonomy for industry sectors.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustrySector3Choice", propOrder = {
    "rgltryTxnmySctr",
    "naceTxnmySctr"
})
public class IndustrySector3Choice {

    @XmlElement(name = "RgltryTxnmySctr")
    protected String rgltryTxnmySctr;
    @XmlElement(name = "NACETxnmySctr")
    protected String naceTxnmySctr;

    /**
     * Gets the value of the rgltryTxnmySctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgltryTxnmySctr() {
        return rgltryTxnmySctr;
    }

    /**
     * Sets the value of the rgltryTxnmySctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndustrySector3Choice setRgltryTxnmySctr(String value) {
        this.rgltryTxnmySctr = value;
        return this;
    }

    /**
     * Gets the value of the naceTxnmySctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACETxnmySctr() {
        return naceTxnmySctr;
    }

    /**
     * Sets the value of the naceTxnmySctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndustrySector3Choice setNACETxnmySctr(String value) {
        this.naceTxnmySctr = value;
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
