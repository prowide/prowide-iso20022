
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
 * Additional references linked to the order status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference15", propOrder = {
    "ordrMassStsReqId",
    "ordrStsReqId",
    "ordrId",
    "hstCrossId",
    "crossOrdrId",
    "orgnlCrossOrdrId",
    "clntOrdrId",
    "scndryOrdrId",
    "scndryClntOrdrId"
})
public class Reference15 {

    @XmlElement(name = "OrdrMassStsReqId")
    protected String ordrMassStsReqId;
    @XmlElement(name = "OrdrStsReqId")
    protected String ordrStsReqId;
    @XmlElement(name = "OrdrId", required = true)
    protected String ordrId;
    @XmlElement(name = "HstCrossId")
    protected String hstCrossId;
    @XmlElement(name = "CrossOrdrId")
    protected String crossOrdrId;
    @XmlElement(name = "OrgnlCrossOrdrId")
    protected String orgnlCrossOrdrId;
    @XmlElement(name = "ClntOrdrId")
    protected String clntOrdrId;
    @XmlElement(name = "ScndryOrdrId")
    protected String scndryOrdrId;
    @XmlElement(name = "ScndryClntOrdrId")
    protected String scndryClntOrdrId;

    /**
     * Gets the value of the ordrMassStsReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrMassStsReqId() {
        return ordrMassStsReqId;
    }

    /**
     * Sets the value of the ordrMassStsReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference15 setOrdrMassStsReqId(String value) {
        this.ordrMassStsReqId = value;
        return this;
    }

    /**
     * Gets the value of the ordrStsReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrStsReqId() {
        return ordrStsReqId;
    }

    /**
     * Sets the value of the ordrStsReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference15 setOrdrStsReqId(String value) {
        this.ordrStsReqId = value;
        return this;
    }

    /**
     * Gets the value of the ordrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrId() {
        return ordrId;
    }

    /**
     * Sets the value of the ordrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference15 setOrdrId(String value) {
        this.ordrId = value;
        return this;
    }

    /**
     * Gets the value of the hstCrossId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstCrossId() {
        return hstCrossId;
    }

    /**
     * Sets the value of the hstCrossId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference15 setHstCrossId(String value) {
        this.hstCrossId = value;
        return this;
    }

    /**
     * Gets the value of the crossOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossOrdrId() {
        return crossOrdrId;
    }

    /**
     * Sets the value of the crossOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference15 setCrossOrdrId(String value) {
        this.crossOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCrossOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlCrossOrdrId() {
        return orgnlCrossOrdrId;
    }

    /**
     * Sets the value of the orgnlCrossOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference15 setOrgnlCrossOrdrId(String value) {
        this.orgnlCrossOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the clntOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntOrdrId() {
        return clntOrdrId;
    }

    /**
     * Sets the value of the clntOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference15 setClntOrdrId(String value) {
        this.clntOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the scndryOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndryOrdrId() {
        return scndryOrdrId;
    }

    /**
     * Sets the value of the scndryOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference15 setScndryOrdrId(String value) {
        this.scndryOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the scndryClntOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndryClntOrdrId() {
        return scndryClntOrdrId;
    }

    /**
     * Sets the value of the scndryClntOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference15 setScndryClntOrdrId(String value) {
        this.scndryClntOrdrId = value;
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
