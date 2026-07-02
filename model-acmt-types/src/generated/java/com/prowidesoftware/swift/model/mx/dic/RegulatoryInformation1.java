
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
 * Regulatory information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryInformation1", propOrder = {
    "sctr",
    "brnch",
    "grp",
    "othr"
})
public class RegulatoryInformation1 {

    @XmlElement(name = "Sctr")
    protected String sctr;
    @XmlElement(name = "Brnch")
    protected String brnch;
    @XmlElement(name = "Grp")
    protected String grp;
    @XmlElement(name = "Othr")
    protected String othr;

    /**
     * Gets the value of the sctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctr() {
        return sctr;
    }

    /**
     * Sets the value of the sctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryInformation1 setSctr(String value) {
        this.sctr = value;
        return this;
    }

    /**
     * Gets the value of the brnch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnch() {
        return brnch;
    }

    /**
     * Sets the value of the brnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryInformation1 setBrnch(String value) {
        this.brnch = value;
        return this;
    }

    /**
     * Gets the value of the grp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrp() {
        return grp;
    }

    /**
     * Sets the value of the grp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryInformation1 setGrp(String value) {
        this.grp = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryInformation1 setOthr(String value) {
        this.othr = value;
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
