
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
 * Terminal maintenance actions to be performed by a point of interaction (POI).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementPlanReplacementV02", propOrder = {
    "hdr",
    "mgmtPlan",
    "sctyTrlr"
})
public class ManagementPlanReplacementV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header4 hdr;
    @XmlElement(name = "MgmtPlan", required = true)
    protected ManagementPlan2 mgmtPlan;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType4 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header4 }
     *     
     */
    public Header4 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header4 }
     *     
     */
    public ManagementPlanReplacementV02 setHdr(Header4 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the mgmtPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementPlan2 }
     *     
     */
    public ManagementPlan2 getMgmtPlan() {
        return mgmtPlan;
    }

    /**
     * Sets the value of the mgmtPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementPlan2 }
     *     
     */
    public ManagementPlanReplacementV02 setMgmtPlan(ManagementPlan2 value) {
        this.mgmtPlan = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType4 }
     *     
     */
    public ContentInformationType4 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType4 }
     *     
     */
    public ManagementPlanReplacementV02 setSctyTrlr(ContentInformationType4 value) {
        this.sctyTrlr = value;
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
