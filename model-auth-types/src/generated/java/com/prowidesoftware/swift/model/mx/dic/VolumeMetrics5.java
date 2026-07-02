
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
 * Numeric variables calculated on the number of transactions or on market exposures.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeMetrics5", propOrder = {
    "nbOfTxs",
    "xpsr"
})
public class VolumeMetrics5 {

    @XmlElement(name = "NbOfTxs")
    protected String nbOfTxs;
    @XmlElement(name = "Xpsr")
    protected ExposureMetrics4 xpsr;

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VolumeMetrics5 setNbOfTxs(String value) {
        this.nbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the xpsr property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureMetrics4 }
     *     
     */
    public ExposureMetrics4 getXpsr() {
        return xpsr;
    }

    /**
     * Sets the value of the xpsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureMetrics4 }
     *     
     */
    public VolumeMetrics5 setXpsr(ExposureMetrics4 value) {
        this.xpsr = value;
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
