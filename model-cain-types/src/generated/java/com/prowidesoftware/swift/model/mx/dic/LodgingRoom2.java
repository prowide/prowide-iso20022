
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Room details
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LodgingRoom2", propOrder = {
    "tp",
    "lctn",
    "bedTp",
    "gsts",
    "adlts",
    "chldrn",
    "dalyRate"
})
public class LodgingRoom2 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Lctn")
    protected String lctn;
    @XmlElement(name = "BedTp")
    protected String bedTp;
    @XmlElement(name = "Gsts")
    protected String gsts;
    @XmlElement(name = "Adlts")
    protected String adlts;
    @XmlElement(name = "Chldrn")
    protected String chldrn;
    @XmlElement(name = "DalyRate")
    protected BigDecimal dalyRate;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingRoom2 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingRoom2 setLctn(String value) {
        this.lctn = value;
        return this;
    }

    /**
     * Gets the value of the bedTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedTp() {
        return bedTp;
    }

    /**
     * Sets the value of the bedTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingRoom2 setBedTp(String value) {
        this.bedTp = value;
        return this;
    }

    /**
     * Gets the value of the gsts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsts() {
        return gsts;
    }

    /**
     * Sets the value of the gsts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingRoom2 setGsts(String value) {
        this.gsts = value;
        return this;
    }

    /**
     * Gets the value of the adlts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdlts() {
        return adlts;
    }

    /**
     * Sets the value of the adlts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingRoom2 setAdlts(String value) {
        this.adlts = value;
        return this;
    }

    /**
     * Gets the value of the chldrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChldrn() {
        return chldrn;
    }

    /**
     * Sets the value of the chldrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingRoom2 setChldrn(String value) {
        this.chldrn = value;
        return this;
    }

    /**
     * Gets the value of the dalyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDalyRate() {
        return dalyRate;
    }

    /**
     * Sets the value of the dalyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LodgingRoom2 setDalyRate(BigDecimal value) {
        this.dalyRate = value;
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
